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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'get'", "'put'", "'post'", "'delete'", "'true'", "'false'", "'package'", "'client'", "'{'", "'}'", "'headers'", "','", "':'", "'/'", "'-'", "'params'", "'='", "'body'", "'response'", "'extends'", "'.'", "'[]'", "'entity'", "'generate'", "'enum'", "'String'", "'boolean'", "'int'", "'long'", "'double'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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


    // $ANTLR start "entryRulePath"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:284:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:285:1: ( rulePath EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:286:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath541);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath548); 

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:293:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:297:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:298:1: ( ( rule__Path__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:298:1: ( ( rule__Path__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:299:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:300:1: ( rule__Path__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:300:2: rule__Path__Group__0
            {
            pushFollow(FOLLOW_rule__Path__Group__0_in_rulePath574);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleArbitraryPathSegment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:312:1: entryRuleArbitraryPathSegment : ruleArbitraryPathSegment EOF ;
    public final void entryRuleArbitraryPathSegment() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:313:1: ( ruleArbitraryPathSegment EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:314:1: ruleArbitraryPathSegment EOF
            {
             before(grammarAccess.getArbitraryPathSegmentRule()); 
            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment601);
            ruleArbitraryPathSegment();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryPathSegment608); 

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
    // $ANTLR end "entryRuleArbitraryPathSegment"


    // $ANTLR start "ruleArbitraryPathSegment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:321:1: ruleArbitraryPathSegment : ( ( rule__ArbitraryPathSegment__Group__0 ) ) ;
    public final void ruleArbitraryPathSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:325:2: ( ( ( rule__ArbitraryPathSegment__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:326:1: ( ( rule__ArbitraryPathSegment__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:326:1: ( ( rule__ArbitraryPathSegment__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:327:1: ( rule__ArbitraryPathSegment__Group__0 )
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:328:1: ( rule__ArbitraryPathSegment__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:328:2: rule__ArbitraryPathSegment__Group__0
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__0_in_ruleArbitraryPathSegment634);
            rule__ArbitraryPathSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArbitraryPathSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArbitraryPathSegment"


    // $ANTLR start "entryRuleParamsBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:340:1: entryRuleParamsBlock : ruleParamsBlock EOF ;
    public final void entryRuleParamsBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:341:1: ( ruleParamsBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:342:1: ruleParamsBlock EOF
            {
             before(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock661);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getParamsBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock668); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:349:1: ruleParamsBlock : ( ( rule__ParamsBlock__Group__0 ) ) ;
    public final void ruleParamsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:353:2: ( ( ( rule__ParamsBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:354:1: ( ( rule__ParamsBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:354:1: ( ( rule__ParamsBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:355:1: ( rule__ParamsBlock__Group__0 )
            {
             before(grammarAccess.getParamsBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:356:1: ( rule__ParamsBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:356:2: rule__ParamsBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock694);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:368:1: entryRuleSimpleMemberAssignment : ruleSimpleMemberAssignment EOF ;
    public final void entryRuleSimpleMemberAssignment() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:369:1: ( ruleSimpleMemberAssignment EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:370:1: ruleSimpleMemberAssignment EOF
            {
             before(grammarAccess.getSimpleMemberAssignmentRule()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment721);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMemberAssignment728); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:377:1: ruleSimpleMemberAssignment : ( ( rule__SimpleMemberAssignment__Group__0 ) ) ;
    public final void ruleSimpleMemberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:381:2: ( ( ( rule__SimpleMemberAssignment__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:382:1: ( ( rule__SimpleMemberAssignment__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:382:1: ( ( rule__SimpleMemberAssignment__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:383:1: ( rule__SimpleMemberAssignment__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:384:1: ( rule__SimpleMemberAssignment__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:384:2: rule__SimpleMemberAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__0_in_ruleSimpleMemberAssignment754);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:396:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:397:1: ( ruleLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:398:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral781);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral788); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:405:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:409:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:410:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:410:1: ( ( rule__Literal__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:411:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:412:1: ( rule__Literal__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:412:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral814);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:424:1: entryRuleBodyBlock : ruleBodyBlock EOF ;
    public final void entryRuleBodyBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:425:1: ( ruleBodyBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:426:1: ruleBodyBlock EOF
            {
             before(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock841);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getBodyBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock848); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:433:1: ruleBodyBlock : ( ( rule__BodyBlock__Group__0 ) ) ;
    public final void ruleBodyBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:437:2: ( ( ( rule__BodyBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__BodyBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__BodyBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:439:1: ( rule__BodyBlock__Group__0 )
            {
             before(grammarAccess.getBodyBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:1: ( rule__BodyBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:2: rule__BodyBlock__Group__0
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock874);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:452:1: entryRuleResponseBlock : ruleResponseBlock EOF ;
    public final void entryRuleResponseBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:453:1: ( ruleResponseBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:454:1: ruleResponseBlock EOF
            {
             before(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock901);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getResponseBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock908); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:461:1: ruleResponseBlock : ( ( rule__ResponseBlock__Group__0 ) ) ;
    public final void ruleResponseBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:465:2: ( ( ( rule__ResponseBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__ResponseBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__ResponseBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:467:1: ( rule__ResponseBlock__Group__0 )
            {
             before(grammarAccess.getResponseBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:1: ( rule__ResponseBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:2: rule__ResponseBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock934);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:480:1: entryRuleBlockType : ruleBlockType EOF ;
    public final void entryRuleBlockType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:481:1: ( ruleBlockType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:482:1: ruleBlockType EOF
            {
             before(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType961);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBlockTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType968); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:489:1: ruleBlockType : ( ( rule__BlockType__Alternatives ) ) ;
    public final void ruleBlockType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:493:2: ( ( ( rule__BlockType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__BlockType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__BlockType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:495:1: ( rule__BlockType__Alternatives )
            {
             before(grammarAccess.getBlockTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:1: ( rule__BlockType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:2: rule__BlockType__Alternatives
            {
            pushFollow(FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType994);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:508:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:509:1: ( ruleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:510:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1021);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1028); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:517:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:521:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:522:1: ( ( rule__Member__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:522:1: ( ( rule__Member__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:523:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:524:1: ( rule__Member__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:524:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember1054);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:536:1: entryRuleTypedMember : ruleTypedMember EOF ;
    public final void entryRuleTypedMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:537:1: ( ruleTypedMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:538:1: ruleTypedMember EOF
            {
             before(grammarAccess.getTypedMemberRule()); 
            pushFollow(FOLLOW_ruleTypedMember_in_entryRuleTypedMember1081);
            ruleTypedMember();

            state._fsp--;

             after(grammarAccess.getTypedMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedMember1088); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:545:1: ruleTypedMember : ( ( rule__TypedMember__Group__0 ) ) ;
    public final void ruleTypedMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:549:2: ( ( ( rule__TypedMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__TypedMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__TypedMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:551:1: ( rule__TypedMember__Group__0 )
            {
             before(grammarAccess.getTypedMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:1: ( rule__TypedMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:2: rule__TypedMember__Group__0
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0_in_ruleTypedMember1114);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:564:1: entryRuleSkipMember : ruleSkipMember EOF ;
    public final void entryRuleSkipMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:565:1: ( ruleSkipMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:566:1: ruleSkipMember EOF
            {
             before(grammarAccess.getSkipMemberRule()); 
            pushFollow(FOLLOW_ruleSkipMember_in_entryRuleSkipMember1141);
            ruleSkipMember();

            state._fsp--;

             after(grammarAccess.getSkipMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkipMember1148); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:573:1: ruleSkipMember : ( ( rule__SkipMember__Group__0 ) ) ;
    public final void ruleSkipMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:577:2: ( ( ( rule__SkipMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__SkipMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__SkipMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:579:1: ( rule__SkipMember__Group__0 )
            {
             before(grammarAccess.getSkipMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:1: ( rule__SkipMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:2: rule__SkipMember__Group__0
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember1174);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:592:1: entryRuleSimpleMember : ruleSimpleMember EOF ;
    public final void entryRuleSimpleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:593:1: ( ruleSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:594:1: ruleSimpleMember EOF
            {
             before(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1201);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getSimpleMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember1208); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:601:1: ruleSimpleMember : ( ( rule__SimpleMember__Group__0 ) ) ;
    public final void ruleSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:605:2: ( ( ( rule__SimpleMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__SimpleMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__SimpleMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:607:1: ( rule__SimpleMember__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:1: ( rule__SimpleMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:2: rule__SimpleMember__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember1234);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1068:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1069:1: ( ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1070:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2221);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2228); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1077:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1081:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1082:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1082:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1083:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1084:1: ( rule__QualifiedName__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1084:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2254);
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


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1096:1: entryRuleSignedNumber : ruleSignedNumber EOF ;
    public final void entryRuleSignedNumber() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1097:1: ( ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1098:1: ruleSignedNumber EOF
            {
             before(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber2281);
            ruleSignedNumber();

            state._fsp--;

             after(grammarAccess.getSignedNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber2288); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1105:1: ruleSignedNumber : ( ( rule__SignedNumber__Group__0 ) ) ;
    public final void ruleSignedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1109:2: ( ( ( rule__SignedNumber__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1110:1: ( ( rule__SignedNumber__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1110:1: ( ( rule__SignedNumber__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1111:1: ( rule__SignedNumber__Group__0 )
            {
             before(grammarAccess.getSignedNumberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1112:1: ( rule__SignedNumber__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1112:2: rule__SignedNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2314);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1125:1: ruleHttpMethodType : ( ( rule__HttpMethodType__Alternatives ) ) ;
    public final void ruleHttpMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1129:1: ( ( ( rule__HttpMethodType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1130:1: ( ( rule__HttpMethodType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1130:1: ( ( rule__HttpMethodType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1131:1: ( rule__HttpMethodType__Alternatives )
            {
             before(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1132:1: ( rule__HttpMethodType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1132:2: rule__HttpMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2351);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1144:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1148:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1149:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1149:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1150:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1151:1: ( rule__BooleanValue__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1151:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2387);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1162:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleClient ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1166:1: ( ( ruleUserTypeDeclaration ) | ( ruleClient ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34||LA1_0==36) ) {
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1167:1: ( ruleUserTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1167:1: ( ruleUserTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1168:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2422);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1173:6: ( ruleClient )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1173:6: ( ruleClient )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1174:1: ruleClient
                    {
                     before(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClient_in_rule__Declaration__Alternatives2439);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1184:1: rule__ClientBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) );
    public final void rule__ClientBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1188:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 27:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1189:1: ( ruleHeaderBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1189:1: ( ruleHeaderBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1190:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__ClientBlock__Alternatives2471);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1195:6: ( ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1195:6: ( ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1196:1: ruleParamsBlock
                    {
                     before(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__ClientBlock__Alternatives2488);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:6: ( ruleHttpMethod )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:6: ( ruleHttpMethod )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1202:1: ruleHttpMethod
                    {
                     before(grammarAccess.getClientBlockAccess().getHttpMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpMethod_in_rule__ClientBlock__Alternatives2505);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1212:1: rule__HttpMethodBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) );
    public final void rule__HttpMethodBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1216:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 30:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1217:1: ( ruleHeaderBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1217:1: ( ruleHeaderBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1218:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2537);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1223:6: ( ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1223:6: ( ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1224:1: ruleParamsBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2554);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:6: ( ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:6: ( ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1230:1: ruleBodyBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2571);
                    ruleBodyBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1235:6: ( ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1235:6: ( ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1236:1: ruleResponseBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2588);
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


    // $ANTLR start "rule__Path__Alternatives_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1246:1: rule__Path__Alternatives_2 : ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_2_1 ) ) );
    public final void rule__Path__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1250:1: ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==20||(LA4_1>=25 && LA4_1<=26)||LA4_1==32) ) {
                    alt4=1;
                }
                else if ( (LA4_1==24) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:1: ( ruleArbitraryPathSegment )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:1: ( ruleArbitraryPathSegment )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1252:1: ruleArbitraryPathSegment
                    {
                     before(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_22620);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     after(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1257:6: ( ( rule__Path__ParamsAssignment_2_1 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1257:6: ( ( rule__Path__ParamsAssignment_2_1 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1258:1: ( rule__Path__ParamsAssignment_2_1 )
                    {
                     before(grammarAccess.getPathAccess().getParamsAssignment_2_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1259:1: ( rule__Path__ParamsAssignment_2_1 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1259:2: rule__Path__ParamsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Path__ParamsAssignment_2_1_in_rule__Path__Alternatives_22637);
                    rule__Path__ParamsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathAccess().getParamsAssignment_2_1()); 

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
    // $ANTLR end "rule__Path__Alternatives_2"


    // $ANTLR start "rule__Path__Alternatives_3_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1268:1: rule__Path__Alternatives_3_1 : ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_3_1_1 ) ) );
    public final void rule__Path__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1272:1: ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_3_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==24) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==20||(LA5_1>=25 && LA5_1<=26)||LA5_1==32) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:1: ( ruleArbitraryPathSegment )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:1: ( ruleArbitraryPathSegment )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1274:1: ruleArbitraryPathSegment
                    {
                     before(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_3_12670);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     after(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1279:6: ( ( rule__Path__ParamsAssignment_3_1_1 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1279:6: ( ( rule__Path__ParamsAssignment_3_1_1 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1280:1: ( rule__Path__ParamsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getPathAccess().getParamsAssignment_3_1_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1281:1: ( rule__Path__ParamsAssignment_3_1_1 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1281:2: rule__Path__ParamsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__Path__ParamsAssignment_3_1_1_in_rule__Path__Alternatives_3_12687);
                    rule__Path__ParamsAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathAccess().getParamsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Path__Alternatives_3_1"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1290:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1294:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_NUMBER:
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1295:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1295:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1296:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1297:1: ( rule__Literal__Group_0__0 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1297:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2720);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1301:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1301:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1302:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1303:1: ( rule__Literal__Group_1__0 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1303:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2738);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1307:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1307:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1308:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1309:1: ( rule__Literal__Group_2__0 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1309:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2756);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1318:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1322:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=37 && LA7_0<=41)) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1323:1: ( ruleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1323:1: ( ruleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1324:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2789);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1329:6: ( ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1329:6: ( ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1330:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2806);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1340:1: rule__Member__Alternatives : ( ( ruleTypedMember ) | ( ruleSkipMember ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1344:1: ( ( ruleTypedMember ) | ( ruleSkipMember ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==20) ) {
                    alt8=2;
                }
                else if ( (LA8_1==24) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==24) ) {
                    alt8=1;
                }
                else if ( (LA8_2==20) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:1: ( ruleTypedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:1: ( ruleTypedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1346:1: ruleTypedMember
                    {
                     before(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2838);
                    ruleTypedMember();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:6: ( ruleSkipMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:6: ( ruleSkipMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1352:1: ruleSkipMember
                    {
                     before(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2855);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1362:1: rule__TypedMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TypedMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1366:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1367:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1367:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1368:1: RULE_ID
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02887); 
                     after(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1373:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1373:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1374:1: RULE_STRING
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02904); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1384:1: rule__SkipMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SkipMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1388:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1389:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1389:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1390:1: RULE_ID
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02936); 
                     after(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1395:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1395:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1396:1: RULE_STRING
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02953); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1406:1: rule__SimpleMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SimpleMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1410:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1411:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1411:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1412:1: RULE_ID
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02985); 
                     after(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1417:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1417:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1418:1: RULE_STRING
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_03002); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1428:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1432:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1433:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1433:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1434:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives3034);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1439:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1439:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1440:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives3051);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1445:6: ( ruleGenericListType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1445:6: ( ruleGenericListType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1446:1: ruleGenericListType
                    {
                     before(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListType_in_rule__Type__Alternatives3068);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1456:1: rule__GenericListType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__GenericListType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1460:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=37 && LA13_0<=41)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1461:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1461:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1462:1: ruleUserType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_03100);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1467:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1467:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1468:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_03117);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1478:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1482:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1483:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1483:1: ( ruleComplexTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1484:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives3149);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1489:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1489:6: ( ruleEnumTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1490:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives3166);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1500:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1504:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
            case 40:
            case 41:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1505:1: ( ruleStringType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1505:1: ( ruleStringType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1506:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives3198);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1511:6: ( ruleBooleanType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1511:6: ( ruleBooleanType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1512:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives3215);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1517:6: ( ruleNumericType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1517:6: ( ruleNumericType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1518:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives3232);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1528:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1532:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt16=1;
                }
                break;
            case 40:
                {
                alt16=2;
                }
                break;
            case 41:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1533:1: ( ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1533:1: ( ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1534:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives3264);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1539:6: ( ruleLongType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1539:6: ( ruleLongType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1540:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives3281);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1545:6: ( ruleDoubleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1545:6: ( ruleDoubleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1546:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives3298);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1556:1: rule__HttpMethodType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) );
    public final void rule__HttpMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1560:1: ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt17=1;
                }
                break;
            case 13:
                {
                alt17=2;
                }
                break;
            case 14:
                {
                alt17=3;
                }
                break;
            case 15:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1561:1: ( ( 'get' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1561:1: ( ( 'get' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1562:1: ( 'get' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1563:1: ( 'get' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1563:3: 'get'
                    {
                    match(input,12,FOLLOW_12_in_rule__HttpMethodType__Alternatives3331); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1568:6: ( ( 'put' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1568:6: ( ( 'put' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1569:1: ( 'put' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1570:1: ( 'put' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1570:3: 'put'
                    {
                    match(input,13,FOLLOW_13_in_rule__HttpMethodType__Alternatives3352); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1575:6: ( ( 'post' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1575:6: ( ( 'post' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1576:1: ( 'post' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1577:1: ( 'post' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1577:3: 'post'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpMethodType__Alternatives3373); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1582:6: ( ( 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1582:6: ( ( 'delete' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1583:1: ( 'delete' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1584:1: ( 'delete' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1584:3: 'delete'
                    {
                    match(input,15,FOLLOW_15_in_rule__HttpMethodType__Alternatives3394); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1594:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1598:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==17) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1599:1: ( ( 'true' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1599:1: ( ( 'true' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1600:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1601:1: ( 'true' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1601:3: 'true'
                    {
                    match(input,16,FOLLOW_16_in_rule__BooleanValue__Alternatives3430); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1606:6: ( ( 'false' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1606:6: ( ( 'false' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1607:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1608:1: ( 'false' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1608:3: 'false'
                    {
                    match(input,17,FOLLOW_17_in_rule__BooleanValue__Alternatives3451); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1620:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1624:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1625:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03484);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03487);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1632:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1636:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1637:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1637:1: ( 'package' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1638:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__0__Impl3515); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1651:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1655:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1656:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13546);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13549);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1663:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1667:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1668:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1668:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1669:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1670:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1670:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3576);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1680:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1684:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1685:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23606);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1691:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1695:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1696:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1696:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1697:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1698:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19||LA19_0==34||LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1698:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3633);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1714:1: rule__Client__Group__0 : rule__Client__Group__0__Impl rule__Client__Group__1 ;
    public final void rule__Client__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1718:1: ( rule__Client__Group__0__Impl rule__Client__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1719:2: rule__Client__Group__0__Impl rule__Client__Group__1
            {
            pushFollow(FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03670);
            rule__Client__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03673);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1726:1: rule__Client__Group__0__Impl : ( 'client' ) ;
    public final void rule__Client__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1730:1: ( ( 'client' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1731:1: ( 'client' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1731:1: ( 'client' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1732:1: 'client'
            {
             before(grammarAccess.getClientAccess().getClientKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Client__Group__0__Impl3701); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1745:1: rule__Client__Group__1 : rule__Client__Group__1__Impl rule__Client__Group__2 ;
    public final void rule__Client__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1749:1: ( rule__Client__Group__1__Impl rule__Client__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1750:2: rule__Client__Group__1__Impl rule__Client__Group__2
            {
            pushFollow(FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13732);
            rule__Client__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13735);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1757:1: rule__Client__Group__1__Impl : ( ( rule__Client__NameAssignment_1 ) ) ;
    public final void rule__Client__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1761:1: ( ( ( rule__Client__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1762:1: ( ( rule__Client__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1762:1: ( ( rule__Client__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1763:1: ( rule__Client__NameAssignment_1 )
            {
             before(grammarAccess.getClientAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1764:1: ( rule__Client__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1764:2: rule__Client__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3762);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1774:1: rule__Client__Group__2 : rule__Client__Group__2__Impl rule__Client__Group__3 ;
    public final void rule__Client__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1778:1: ( rule__Client__Group__2__Impl rule__Client__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1779:2: rule__Client__Group__2__Impl rule__Client__Group__3
            {
            pushFollow(FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23792);
            rule__Client__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23795);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1786:1: rule__Client__Group__2__Impl : ( ( rule__Client__BaseUrlAssignment_2 )? ) ;
    public final void rule__Client__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1790:1: ( ( ( rule__Client__BaseUrlAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1792:1: ( rule__Client__BaseUrlAssignment_2 )?
            {
             before(grammarAccess.getClientAccess().getBaseUrlAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:1: ( rule__Client__BaseUrlAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:2: rule__Client__BaseUrlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3822);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1803:1: rule__Client__Group__3 : rule__Client__Group__3__Impl rule__Client__Group__4 ;
    public final void rule__Client__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1807:1: ( rule__Client__Group__3__Impl rule__Client__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1808:2: rule__Client__Group__3__Impl rule__Client__Group__4
            {
            pushFollow(FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33853);
            rule__Client__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33856);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1815:1: rule__Client__Group__3__Impl : ( '{' ) ;
    public final void rule__Client__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1819:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1820:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1820:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1821:1: '{'
            {
             before(grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Client__Group__3__Impl3884); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1834:1: rule__Client__Group__4 : rule__Client__Group__4__Impl rule__Client__Group__5 ;
    public final void rule__Client__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1838:1: ( rule__Client__Group__4__Impl rule__Client__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1839:2: rule__Client__Group__4__Impl rule__Client__Group__5
            {
            pushFollow(FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43915);
            rule__Client__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43918);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1846:1: rule__Client__Group__4__Impl : ( ( rule__Client__BlocksAssignment_4 )* ) ;
    public final void rule__Client__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1850:1: ( ( ( rule__Client__BlocksAssignment_4 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1851:1: ( ( rule__Client__BlocksAssignment_4 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1851:1: ( ( rule__Client__BlocksAssignment_4 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1852:1: ( rule__Client__BlocksAssignment_4 )*
            {
             before(grammarAccess.getClientAccess().getBlocksAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( rule__Client__BlocksAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=12 && LA21_0<=15)||LA21_0==22||LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:2: rule__Client__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Client__BlocksAssignment_4_in_rule__Client__Group__4__Impl3945);
            	    rule__Client__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1863:1: rule__Client__Group__5 : rule__Client__Group__5__Impl ;
    public final void rule__Client__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1867:1: ( rule__Client__Group__5__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1868:2: rule__Client__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53976);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1874:1: rule__Client__Group__5__Impl : ( '}' ) ;
    public final void rule__Client__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1878:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1879:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1879:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1880:1: '}'
            {
             before(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Client__Group__5__Impl4004); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1905:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1909:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1910:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__04047);
            rule__HeaderBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__04050);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1917:1: rule__HeaderBlock__Group__0__Impl : ( 'headers' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1921:1: ( ( 'headers' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1922:1: ( 'headers' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1922:1: ( 'headers' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1923:1: 'headers'
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__HeaderBlock__Group__0__Impl4078); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1936:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1940:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1941:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__14109);
            rule__HeaderBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__14112);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1948:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1952:1: ( ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1953:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1953:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1954:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1955:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1955:2: rule__HeaderBlock__HeadersAssignment_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl4139);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1965:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1969:1: ( rule__HeaderBlock__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1970:2: rule__HeaderBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__24169);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1976:1: rule__HeaderBlock__Group__2__Impl : ( ( rule__HeaderBlock__Group_2__0 )* ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1980:1: ( ( ( rule__HeaderBlock__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1981:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1981:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1982:1: ( rule__HeaderBlock__Group_2__0 )*
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1983:1: ( rule__HeaderBlock__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1983:2: rule__HeaderBlock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl4196);
            	    rule__HeaderBlock__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1999:1: rule__HeaderBlock__Group_2__0 : rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 ;
    public final void rule__HeaderBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2003:1: ( rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2004:2: rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__04233);
            rule__HeaderBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__04236);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2011:1: rule__HeaderBlock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__HeaderBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2015:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2016:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2016:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2017:1: ','
            {
             before(grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__HeaderBlock__Group_2__0__Impl4264); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2030:1: rule__HeaderBlock__Group_2__1 : rule__HeaderBlock__Group_2__1__Impl ;
    public final void rule__HeaderBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2034:1: ( rule__HeaderBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2035:2: rule__HeaderBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__14295);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2041:1: rule__HeaderBlock__Group_2__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) ;
    public final void rule__HeaderBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2045:1: ( ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2046:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2046:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2047:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2048:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2048:2: rule__HeaderBlock__HeadersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl4322);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2062:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2066:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2067:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__04356);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__04359);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2074:1: rule__Header__Group__0__Impl : ( ( rule__Header__NameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2078:1: ( ( ( rule__Header__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2079:1: ( ( rule__Header__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2079:1: ( ( rule__Header__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2080:1: ( rule__Header__NameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2081:1: ( rule__Header__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2081:2: rule__Header__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl4386);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2091:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2095:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2096:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__14416);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__14419);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2103:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2107:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2108:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2108:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2109:1: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Header__Group__1__Impl4447); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2122:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2126:1: ( rule__Header__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2127:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__24478);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2133:1: rule__Header__Group__2__Impl : ( ( rule__Header__ValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2137:1: ( ( ( rule__Header__ValueAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2138:1: ( ( rule__Header__ValueAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2138:1: ( ( rule__Header__ValueAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2139:1: ( rule__Header__ValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getValueAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2140:1: ( rule__Header__ValueAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2140:2: rule__Header__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl4505);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2156:1: rule__HttpMethod__Group__0 : rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 ;
    public final void rule__HttpMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2160:1: ( rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2161:2: rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__04541);
            rule__HttpMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__04544);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2168:1: rule__HttpMethod__Group__0__Impl : ( ( rule__HttpMethod__TypeAssignment_0 ) ) ;
    public final void rule__HttpMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2172:1: ( ( ( rule__HttpMethod__TypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2173:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2173:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2174:1: ( rule__HttpMethod__TypeAssignment_0 )
            {
             before(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2175:1: ( rule__HttpMethod__TypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2175:2: rule__HttpMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4571);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2185:1: rule__HttpMethod__Group__1 : rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 ;
    public final void rule__HttpMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2189:1: ( rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2190:2: rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14601);
            rule__HttpMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14604);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2197:1: rule__HttpMethod__Group__1__Impl : ( ( rule__HttpMethod__NameAssignment_1 ) ) ;
    public final void rule__HttpMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2201:1: ( ( ( rule__HttpMethod__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2202:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2202:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2203:1: ( rule__HttpMethod__NameAssignment_1 )
            {
             before(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2204:1: ( rule__HttpMethod__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2204:2: rule__HttpMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4631);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2214:1: rule__HttpMethod__Group__2 : rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 ;
    public final void rule__HttpMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2218:1: ( rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2219:2: rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24661);
            rule__HttpMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24664);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2226:1: rule__HttpMethod__Group__2__Impl : ( ( rule__HttpMethod__PathAssignment_2 )? ) ;
    public final void rule__HttpMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2230:1: ( ( ( rule__HttpMethod__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2231:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2231:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2232:1: ( rule__HttpMethod__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2233:1: ( rule__HttpMethod__PathAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2233:2: rule__HttpMethod__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4691);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2243:1: rule__HttpMethod__Group__3 : rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 ;
    public final void rule__HttpMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2247:1: ( rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2248:2: rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34722);
            rule__HttpMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34725);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2255:1: rule__HttpMethod__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2259:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2260:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2260:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2261:1: '{'
            {
             before(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__HttpMethod__Group__3__Impl4753); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2274:1: rule__HttpMethod__Group__4 : rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 ;
    public final void rule__HttpMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2278:1: ( rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2279:2: rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44784);
            rule__HttpMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44787);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2286:1: rule__HttpMethod__Group__4__Impl : ( ( rule__HttpMethod__BlocksAssignment_4 )* ) ;
    public final void rule__HttpMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2290:1: ( ( ( rule__HttpMethod__BlocksAssignment_4 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2291:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2291:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2292:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2293:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22||LA24_0==27||(LA24_0>=29 && LA24_0<=30)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2293:2: rule__HttpMethod__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4814);
            	    rule__HttpMethod__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2303:1: rule__HttpMethod__Group__5 : rule__HttpMethod__Group__5__Impl ;
    public final void rule__HttpMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2307:1: ( rule__HttpMethod__Group__5__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2308:2: rule__HttpMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54845);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2314:1: rule__HttpMethod__Group__5__Impl : ( '}' ) ;
    public final void rule__HttpMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2318:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2319:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2319:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2320:1: '}'
            {
             before(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__HttpMethod__Group__5__Impl4873); 
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


    // $ANTLR start "rule__Path__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2345:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2349:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2350:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04916);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04919);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2357:1: rule__Path__Group__0__Impl : ( () ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2361:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2362:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2362:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2363:1: ()
            {
             before(grammarAccess.getPathAccess().getPathAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2364:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2366:1: 
            {
            }

             after(grammarAccess.getPathAccess().getPathAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2376:1: rule__Path__Group__1 : rule__Path__Group__1__Impl rule__Path__Group__2 ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2380:1: ( rule__Path__Group__1__Impl rule__Path__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2381:2: rule__Path__Group__1__Impl rule__Path__Group__2
            {
            pushFollow(FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14977);
            rule__Path__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14980);
            rule__Path__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2388:1: rule__Path__Group__1__Impl : ( '/' ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2392:1: ( ( '/' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2393:1: ( '/' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2393:1: ( '/' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2394:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Path__Group__1__Impl5008); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2407:1: rule__Path__Group__2 : rule__Path__Group__2__Impl rule__Path__Group__3 ;
    public final void rule__Path__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2411:1: ( rule__Path__Group__2__Impl rule__Path__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2412:2: rule__Path__Group__2__Impl rule__Path__Group__3
            {
            pushFollow(FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__25039);
            rule__Path__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__3_in_rule__Path__Group__25042);
            rule__Path__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2"


    // $ANTLR start "rule__Path__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2419:1: rule__Path__Group__2__Impl : ( ( rule__Path__Alternatives_2 ) ) ;
    public final void rule__Path__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2423:1: ( ( ( rule__Path__Alternatives_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2424:1: ( ( rule__Path__Alternatives_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2424:1: ( ( rule__Path__Alternatives_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2425:1: ( rule__Path__Alternatives_2 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2426:1: ( rule__Path__Alternatives_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2426:2: rule__Path__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Path__Alternatives_2_in_rule__Path__Group__2__Impl5069);
            rule__Path__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2__Impl"


    // $ANTLR start "rule__Path__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2436:1: rule__Path__Group__3 : rule__Path__Group__3__Impl ;
    public final void rule__Path__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2440:1: ( rule__Path__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2441:2: rule__Path__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__35099);
            rule__Path__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__3"


    // $ANTLR start "rule__Path__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2447:1: rule__Path__Group__3__Impl : ( ( rule__Path__Group_3__0 )* ) ;
    public final void rule__Path__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2451:1: ( ( ( rule__Path__Group_3__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2452:1: ( ( rule__Path__Group_3__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2452:1: ( ( rule__Path__Group_3__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2453:1: ( rule__Path__Group_3__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2454:1: ( rule__Path__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2454:2: rule__Path__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_3__0_in_rule__Path__Group__3__Impl5126);
            	    rule__Path__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__3__Impl"


    // $ANTLR start "rule__Path__Group_3__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2472:1: rule__Path__Group_3__0 : rule__Path__Group_3__0__Impl rule__Path__Group_3__1 ;
    public final void rule__Path__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2476:1: ( rule__Path__Group_3__0__Impl rule__Path__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2477:2: rule__Path__Group_3__0__Impl rule__Path__Group_3__1
            {
            pushFollow(FOLLOW_rule__Path__Group_3__0__Impl_in_rule__Path__Group_3__05165);
            rule__Path__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group_3__1_in_rule__Path__Group_3__05168);
            rule__Path__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__0"


    // $ANTLR start "rule__Path__Group_3__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2484:1: rule__Path__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2488:1: ( ( '/' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2489:1: ( '/' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2489:1: ( '/' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2490:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Path__Group_3__0__Impl5196); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__0__Impl"


    // $ANTLR start "rule__Path__Group_3__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2503:1: rule__Path__Group_3__1 : rule__Path__Group_3__1__Impl ;
    public final void rule__Path__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2507:1: ( rule__Path__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2508:2: rule__Path__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group_3__1__Impl_in_rule__Path__Group_3__15227);
            rule__Path__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__1"


    // $ANTLR start "rule__Path__Group_3__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2514:1: rule__Path__Group_3__1__Impl : ( ( rule__Path__Alternatives_3_1 ) ) ;
    public final void rule__Path__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2518:1: ( ( ( rule__Path__Alternatives_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2519:1: ( ( rule__Path__Alternatives_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2519:1: ( ( rule__Path__Alternatives_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2520:1: ( rule__Path__Alternatives_3_1 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2521:1: ( rule__Path__Alternatives_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2521:2: rule__Path__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Path__Alternatives_3_1_in_rule__Path__Group_3__1__Impl5254);
            rule__Path__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__1__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2535:1: rule__ArbitraryPathSegment__Group__0 : rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1 ;
    public final void rule__ArbitraryPathSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2539:1: ( rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2540:2: rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__0__Impl_in_rule__ArbitraryPathSegment__Group__05288);
            rule__ArbitraryPathSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__1_in_rule__ArbitraryPathSegment__Group__05291);
            rule__ArbitraryPathSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__0"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2547:1: rule__ArbitraryPathSegment__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__ArbitraryPathSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2551:1: ( ( ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2552:1: ( ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2552:1: ( ruleQualifiedName )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2553:1: ruleQualifiedName
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group__0__Impl5318);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__0__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2564:1: rule__ArbitraryPathSegment__Group__1 : rule__ArbitraryPathSegment__Group__1__Impl ;
    public final void rule__ArbitraryPathSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2568:1: ( rule__ArbitraryPathSegment__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2569:2: rule__ArbitraryPathSegment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__1__Impl_in_rule__ArbitraryPathSegment__Group__15347);
            rule__ArbitraryPathSegment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__1"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2575:1: rule__ArbitraryPathSegment__Group__1__Impl : ( ( rule__ArbitraryPathSegment__Group_1__0 )* ) ;
    public final void rule__ArbitraryPathSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2579:1: ( ( ( rule__ArbitraryPathSegment__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2580:1: ( ( rule__ArbitraryPathSegment__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2580:1: ( ( rule__ArbitraryPathSegment__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2581:1: ( rule__ArbitraryPathSegment__Group_1__0 )*
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2582:1: ( rule__ArbitraryPathSegment__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2582:2: rule__ArbitraryPathSegment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__0_in_rule__ArbitraryPathSegment__Group__1__Impl5374);
            	    rule__ArbitraryPathSegment__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getArbitraryPathSegmentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__1__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2596:1: rule__ArbitraryPathSegment__Group_1__0 : rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1 ;
    public final void rule__ArbitraryPathSegment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2600:1: ( rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2601:2: rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__0__Impl_in_rule__ArbitraryPathSegment__Group_1__05409);
            rule__ArbitraryPathSegment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__1_in_rule__ArbitraryPathSegment__Group_1__05412);
            rule__ArbitraryPathSegment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__0"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:1: rule__ArbitraryPathSegment__Group_1__0__Impl : ( '-' ) ;
    public final void rule__ArbitraryPathSegment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2612:1: ( ( '-' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2613:1: ( '-' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2613:1: ( '-' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2614:1: '-'
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ArbitraryPathSegment__Group_1__0__Impl5440); 
             after(grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__0__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2627:1: rule__ArbitraryPathSegment__Group_1__1 : rule__ArbitraryPathSegment__Group_1__1__Impl ;
    public final void rule__ArbitraryPathSegment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2631:1: ( rule__ArbitraryPathSegment__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2632:2: rule__ArbitraryPathSegment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__1__Impl_in_rule__ArbitraryPathSegment__Group_1__15471);
            rule__ArbitraryPathSegment__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__1"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2638:1: rule__ArbitraryPathSegment__Group_1__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__ArbitraryPathSegment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2642:1: ( ( ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2643:1: ( ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2643:1: ( ruleQualifiedName )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2644:1: ruleQualifiedName
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group_1__1__Impl5498);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__1__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2659:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2663:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2664:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05531);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05534);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2671:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2675:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2676:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2676:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2677:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2678:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2680:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2690:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2694:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2695:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15592);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15595);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2702:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2706:1: ( ( 'params' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2707:1: ( 'params' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2707:1: ( 'params' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2708:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__ParamsBlock__Group__1__Impl5623); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2721:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2725:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2726:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25654);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25657);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2733:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2737:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2738:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2738:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2739:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2740:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2740:2: rule__ParamsBlock__ParamsAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5684);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2750:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2754:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2755:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35714);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2761:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2765:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2766:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2766:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2767:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2768:1: ( rule__ParamsBlock__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2768:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5741);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2786:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2790:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2791:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05780);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05783);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2798:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2802:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2803:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2803:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2804:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__ParamsBlock__Group_3__0__Impl5811); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2817:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2821:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2822:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15842);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2828:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2832:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2833:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2833:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2834:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2835:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2835:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5869);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2849:1: rule__SimpleMemberAssignment__Group__0 : rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1 ;
    public final void rule__SimpleMemberAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2853:1: ( rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2854:2: rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__0__Impl_in_rule__SimpleMemberAssignment__Group__05903);
            rule__SimpleMemberAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__1_in_rule__SimpleMemberAssignment__Group__05906);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2861:1: rule__SimpleMemberAssignment__Group__0__Impl : ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) ) ;
    public final void rule__SimpleMemberAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2865:1: ( ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2866:1: ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2866:1: ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2867:1: ( rule__SimpleMemberAssignment__MemberAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getMemberAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2868:1: ( rule__SimpleMemberAssignment__MemberAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2868:2: rule__SimpleMemberAssignment__MemberAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__MemberAssignment_0_in_rule__SimpleMemberAssignment__Group__0__Impl5933);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2878:1: rule__SimpleMemberAssignment__Group__1 : rule__SimpleMemberAssignment__Group__1__Impl ;
    public final void rule__SimpleMemberAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2882:1: ( rule__SimpleMemberAssignment__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2883:2: rule__SimpleMemberAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__1__Impl_in_rule__SimpleMemberAssignment__Group__15963);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2889:1: rule__SimpleMemberAssignment__Group__1__Impl : ( ( rule__SimpleMemberAssignment__Group_1__0 )? ) ;
    public final void rule__SimpleMemberAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2893:1: ( ( ( rule__SimpleMemberAssignment__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2894:1: ( ( rule__SimpleMemberAssignment__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2894:1: ( ( rule__SimpleMemberAssignment__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2895:1: ( rule__SimpleMemberAssignment__Group_1__0 )?
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2896:1: ( rule__SimpleMemberAssignment__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2896:2: rule__SimpleMemberAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__0_in_rule__SimpleMemberAssignment__Group__1__Impl5990);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2910:1: rule__SimpleMemberAssignment__Group_1__0 : rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1 ;
    public final void rule__SimpleMemberAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2914:1: ( rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2915:2: rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__0__Impl_in_rule__SimpleMemberAssignment__Group_1__06025);
            rule__SimpleMemberAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__1_in_rule__SimpleMemberAssignment__Group_1__06028);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2922:1: rule__SimpleMemberAssignment__Group_1__0__Impl : ( '=' ) ;
    public final void rule__SimpleMemberAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2926:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2927:1: ( '=' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2927:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2928:1: '='
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__SimpleMemberAssignment__Group_1__0__Impl6056); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2941:1: rule__SimpleMemberAssignment__Group_1__1 : rule__SimpleMemberAssignment__Group_1__1__Impl ;
    public final void rule__SimpleMemberAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2945:1: ( rule__SimpleMemberAssignment__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2946:2: rule__SimpleMemberAssignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__1__Impl_in_rule__SimpleMemberAssignment__Group_1__16087);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2952:1: rule__SimpleMemberAssignment__Group_1__1__Impl : ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__SimpleMemberAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2956:1: ( ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2957:1: ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2957:1: ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2958:1: ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2959:1: ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2959:2: rule__SimpleMemberAssignment__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__DefaultValueAssignment_1_1_in_rule__SimpleMemberAssignment__Group_1__1__Impl6114);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2973:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2977:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2978:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__06148);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__06151);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2985:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2989:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2990:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2990:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2991:1: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2992:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2994:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3004:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3008:1: ( rule__Literal__Group_0__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3009:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__16209);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3015:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__LiteralAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3019:1: ( ( ( rule__Literal__LiteralAssignment_0_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3020:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3020:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3021:1: ( rule__Literal__LiteralAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3022:1: ( rule__Literal__LiteralAssignment_0_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3022:2: rule__Literal__LiteralAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl6236);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3036:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3040:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3041:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__06270);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__06273);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3048:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3052:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3053:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3053:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3054:1: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3055:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3057:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3067:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3071:1: ( rule__Literal__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3072:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__16331);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3078:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__LiteralAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3082:1: ( ( ( rule__Literal__LiteralAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3083:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3083:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3084:1: ( rule__Literal__LiteralAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3085:1: ( rule__Literal__LiteralAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3085:2: rule__Literal__LiteralAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl6358);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3099:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3103:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3104:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__06392);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__06395);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3111:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3115:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3116:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3116:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3117:1: ()
            {
             before(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3118:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3120:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3130:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3134:1: ( rule__Literal__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3135:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__16453);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3141:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__LiteralAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3145:1: ( ( ( rule__Literal__LiteralAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3146:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3146:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3147:1: ( rule__Literal__LiteralAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3148:1: ( rule__Literal__LiteralAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3148:2: rule__Literal__LiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl6480);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3162:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3166:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3167:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__06514);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__06517);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3174:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3178:1: ( ( 'body' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3179:1: ( 'body' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3179:1: ( 'body' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3180:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__BodyBlock__Group__0__Impl6545); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3193:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3197:1: ( rule__BodyBlock__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3198:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__16576);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3204:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3208:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3209:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3209:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3210:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3211:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3211:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl6603);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3225:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3229:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3230:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__06637);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__06640);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3237:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3241:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3242:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3242:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3243:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3244:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3246:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3256:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3260:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3261:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__16698);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__16701);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3268:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3272:1: ( ( 'response' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3273:1: ( 'response' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3273:1: ( 'response' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3274:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ResponseBlock__Group__1__Impl6729); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3287:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3291:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3292:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__26760);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__26763);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3299:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__Group_2__0 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3303:1: ( ( ( rule__ResponseBlock__Group_2__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3304:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3304:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3305:1: ( rule__ResponseBlock__Group_2__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3306:1: ( rule__ResponseBlock__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3306:2: rule__ResponseBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl6790);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3316:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3320:1: ( rule__ResponseBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3321:2: rule__ResponseBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36821);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3327:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__TypeAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3331:1: ( ( ( rule__ResponseBlock__TypeAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3332:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3332:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3333:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3334:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==20||(LA30_0>=37 && LA30_0<=41)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3334:2: rule__ResponseBlock__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6848);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3352:1: rule__ResponseBlock__Group_2__0 : rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 ;
    public final void rule__ResponseBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3356:1: ( rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3357:2: rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06887);
            rule__ResponseBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06890);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3364:1: rule__ResponseBlock__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ResponseBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3368:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3369:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3369:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3370:1: 'extends'
            {
             before(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__ResponseBlock__Group_2__0__Impl6918); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3383:1: rule__ResponseBlock__Group_2__1 : rule__ResponseBlock__Group_2__1__Impl ;
    public final void rule__ResponseBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3387:1: ( rule__ResponseBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3388:2: rule__ResponseBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16949);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3394:1: rule__ResponseBlock__Group_2__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ResponseBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3398:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3399:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3399:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3400:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3401:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3401:2: rule__ResponseBlock__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6976);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3415:1: rule__TypedMember__Group__0 : rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 ;
    public final void rule__TypedMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3419:1: ( rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3420:2: rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__07010);
            rule__TypedMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__07013);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3427:1: rule__TypedMember__Group__0__Impl : ( ( rule__TypedMember__NameAssignment_0 ) ) ;
    public final void rule__TypedMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3431:1: ( ( ( rule__TypedMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3432:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3432:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3433:1: ( rule__TypedMember__NameAssignment_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3434:1: ( rule__TypedMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3434:2: rule__TypedMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl7040);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3444:1: rule__TypedMember__Group__1 : rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 ;
    public final void rule__TypedMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3448:1: ( rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3449:2: rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__17070);
            rule__TypedMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__17073);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3456:1: rule__TypedMember__Group__1__Impl : ( ':' ) ;
    public final void rule__TypedMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3460:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3461:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3461:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3462:1: ':'
            {
             before(grammarAccess.getTypedMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__TypedMember__Group__1__Impl7101); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3475:1: rule__TypedMember__Group__2 : rule__TypedMember__Group__2__Impl ;
    public final void rule__TypedMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3479:1: ( rule__TypedMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3480:2: rule__TypedMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__27132);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3486:1: rule__TypedMember__Group__2__Impl : ( ( rule__TypedMember__TypeAssignment_2 ) ) ;
    public final void rule__TypedMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3490:1: ( ( ( rule__TypedMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3491:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3491:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3492:1: ( rule__TypedMember__TypeAssignment_2 )
            {
             before(grammarAccess.getTypedMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3493:1: ( rule__TypedMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3493:2: rule__TypedMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl7159);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3509:1: rule__SkipMember__Group__0 : rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 ;
    public final void rule__SkipMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3513:1: ( rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3514:2: rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__07195);
            rule__SkipMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__07198);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3521:1: rule__SkipMember__Group__0__Impl : ( ( rule__SkipMember__NameAssignment_0 ) ) ;
    public final void rule__SkipMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3525:1: ( ( ( rule__SkipMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3527:1: ( rule__SkipMember__NameAssignment_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3528:1: ( rule__SkipMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3528:2: rule__SkipMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl7225);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3538:1: rule__SkipMember__Group__1 : rule__SkipMember__Group__1__Impl ;
    public final void rule__SkipMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3542:1: ( rule__SkipMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3543:2: rule__SkipMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__17255);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3549:1: rule__SkipMember__Group__1__Impl : ( ( rule__SkipMember__LiteralAssignment_1 ) ) ;
    public final void rule__SkipMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3553:1: ( ( ( rule__SkipMember__LiteralAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3554:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3554:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3555:1: ( rule__SkipMember__LiteralAssignment_1 )
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3556:1: ( rule__SkipMember__LiteralAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3556:2: rule__SkipMember__LiteralAssignment_1
            {
            pushFollow(FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl7282);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3570:1: rule__SimpleMember__Group__0 : rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 ;
    public final void rule__SimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3574:1: ( rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3575:2: rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__07316);
            rule__SimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__07319);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3582:1: rule__SimpleMember__Group__0__Impl : ( ( rule__SimpleMember__NameAssignment_0 ) ) ;
    public final void rule__SimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3586:1: ( ( ( rule__SimpleMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3587:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3587:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3588:1: ( rule__SimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3589:1: ( rule__SimpleMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3589:2: rule__SimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl7346);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3599:1: rule__SimpleMember__Group__1 : rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 ;
    public final void rule__SimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3603:1: ( rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3604:2: rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__17376);
            rule__SimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__17379);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3611:1: rule__SimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3615:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3616:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3616:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3617:1: ':'
            {
             before(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleMember__Group__1__Impl7407); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3630:1: rule__SimpleMember__Group__2 : rule__SimpleMember__Group__2__Impl ;
    public final void rule__SimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3634:1: ( rule__SimpleMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3635:2: rule__SimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__27438);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3641:1: rule__SimpleMember__Group__2__Impl : ( ( rule__SimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__SimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3645:1: ( ( ( rule__SimpleMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3646:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3646:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3647:1: ( rule__SimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3648:1: ( rule__SimpleMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3648:2: rule__SimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl7465);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3664:1: rule__GenericListType__Group__0 : rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 ;
    public final void rule__GenericListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3668:1: ( rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3669:2: rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__07501);
            rule__GenericListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__07504);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3676:1: rule__GenericListType__Group__0__Impl : ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) ;
    public final void rule__GenericListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3680:1: ( ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3681:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3681:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3682:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3683:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3683:2: rule__GenericListType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl7531);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3693:1: rule__GenericListType__Group__1 : rule__GenericListType__Group__1__Impl ;
    public final void rule__GenericListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3697:1: ( rule__GenericListType__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3698:2: rule__GenericListType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__17561);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3704:1: rule__GenericListType__Group__1__Impl : ( ( rule__GenericListType__IdAssignment_1 ) ) ;
    public final void rule__GenericListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3708:1: ( ( ( rule__GenericListType__IdAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3709:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3709:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3710:1: ( rule__GenericListType__IdAssignment_1 )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3711:1: ( rule__GenericListType__IdAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3711:2: rule__GenericListType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl7588);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3725:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3729:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3730:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__07622);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__07625);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3737:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3741:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3742:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3742:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3743:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3744:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3744:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl7652);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3754:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3758:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3759:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__17682);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__17685);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3766:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3770:1: ( ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3771:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3771:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3772:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3773:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3773:2: rule__ComplexTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl7712);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3783:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3787:1: ( rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3788:2: rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__27743);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__27746);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3795:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3799:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3800:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3800:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3801:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3802:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3802:2: rule__ComplexTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl7773);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3812:1: rule__ComplexTypeDeclaration__Group__3 : rule__ComplexTypeDeclaration__Group__3__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3816:1: ( rule__ComplexTypeDeclaration__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3817:2: rule__ComplexTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__37803);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3823:1: rule__ComplexTypeDeclaration__Group__3__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3827:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3828:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3828:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3829:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3830:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3830:2: rule__ComplexTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl7830);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3848:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3852:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3853:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07869);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07872);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3860:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3864:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3865:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3865:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3866:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3867:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3867:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7899);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3877:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3881:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3882:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17929);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17932);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3889:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3893:1: ( ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3894:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3894:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3895:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3896:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3896:2: rule__EnumTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7959);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3906:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3910:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3911:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27990);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27993);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3918:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3922:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3923:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3923:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3924:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3925:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3925:2: rule__EnumTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl8020);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3939:1: ( rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3940:2: rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__38050);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__38053);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3947:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3951:1: ( ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3952:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3952:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3953:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3954:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3954:2: rule__EnumTypeDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl8080);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3964:1: rule__EnumTypeDeclaration__Group__4 : rule__EnumTypeDeclaration__Group__4__Impl ;
    public final void rule__EnumTypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3968:1: ( rule__EnumTypeDeclaration__Group__4__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3969:2: rule__EnumTypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__48111);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3975:1: rule__EnumTypeDeclaration__Group__4__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3979:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3980:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3980:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3981:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3982:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3982:2: rule__EnumTypeDeclaration__LiteralAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl8138);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4002:1: rule__EnumTypeDeclaration__Group_3__0 : rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 ;
    public final void rule__EnumTypeDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4006:1: ( rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4007:2: rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__08179);
            rule__EnumTypeDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__08182);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4014:1: rule__EnumTypeDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4018:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4019:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4019:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4020:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumTypeDeclaration__Group_3__0__Impl8210); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4033:1: rule__EnumTypeDeclaration__Group_3__1 : rule__EnumTypeDeclaration__Group_3__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4037:1: ( rule__EnumTypeDeclaration__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4038:2: rule__EnumTypeDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__18241);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4044:1: rule__EnumTypeDeclaration__Group_3__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4048:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4049:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4049:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4050:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4051:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4051:2: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl8268);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4065:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4069:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4070:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__08302);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__08305);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4077:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4081:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4082:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4082:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4083:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumTypeLiteral__Group__0__Impl8333); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4096:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4100:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4101:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__18364);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__18367);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4108:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4112:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4113:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4113:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4114:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4115:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4115:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl8394);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4125:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4129:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4130:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__28424);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__28427);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4137:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4141:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4142:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4142:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4143:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4144:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==23) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4144:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl8454);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4154:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4158:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4159:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__38485);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4165:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4169:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4170:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4170:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4171:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__EnumTypeLiteral__Group__3__Impl8513); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4192:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4196:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4197:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__08552);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__08555);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4204:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4208:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4209:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4209:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4210:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumTypeLiteral__Group_2__0__Impl8583); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4223:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4227:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4228:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__18614);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4234:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4238:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4239:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4239:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4240:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4241:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4241:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl8641);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4255:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4259:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4260:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__08675);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__08678);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4267:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4271:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4272:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4272:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4273:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4274:1: ( rule__EnumMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4274:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl8705);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4284:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4288:1: ( rule__EnumMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4289:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__18735);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4295:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4299:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4300:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4300:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4301:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4302:1: ( rule__EnumMember__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4302:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl8762);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4316:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4320:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4321:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__08797);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__08800);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4328:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4332:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4333:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4333:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4334:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4335:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4335:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl8827);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4345:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4349:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4350:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18857);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4356:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4360:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4362:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4363:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4363:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8884);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4377:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4381:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4382:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08918);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08921);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4389:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4393:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4394:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4394:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4395:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ComplexTypeLiteral__Group__0__Impl8949); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4408:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4412:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4413:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18980);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18983);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4420:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4424:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4425:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4425:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4426:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4427:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4427:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl9010);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4437:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4441:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4442:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__29040);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__29043);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4449:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4453:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4454:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4454:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4455:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4456:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==23) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4456:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl9070);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4466:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4470:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4471:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__39101);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4477:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4481:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4482:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4482:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4483:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ComplexTypeLiteral__Group__3__Impl9129); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4504:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4508:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4509:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__09168);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__09171);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4516:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4520:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4521:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4521:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4522:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ComplexTypeLiteral__Group_2__0__Impl9199); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4535:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4539:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4540:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__19230);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4546:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4550:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4551:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4551:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4552:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4553:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4553:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl9257);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4567:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4571:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4572:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09291);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09294);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4579:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4583:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4584:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4584:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4585:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9321); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4596:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4600:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4601:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19350);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4607:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4611:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4612:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4612:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4613:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4614:1: ( rule__QualifiedName__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==32) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4614:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9377);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4628:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4632:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4633:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09412);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09415);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4640:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4644:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4645:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4645:1: ( '.' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4646:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl9443); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4659:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4663:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4664:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19474);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4670:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4674:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4675:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4675:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4676:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9501); 
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


    // $ANTLR start "rule__SignedNumber__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4691:1: rule__SignedNumber__Group__0 : rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 ;
    public final void rule__SignedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4695:1: ( rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4696:2: rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__09534);
            rule__SignedNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__09537);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4703:1: rule__SignedNumber__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4707:1: ( ( ( '-' )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4708:1: ( ( '-' )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4708:1: ( ( '-' )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4709:1: ( '-' )?
            {
             before(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4710:1: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4711:2: '-'
                    {
                    match(input,26,FOLLOW_26_in_rule__SignedNumber__Group__0__Impl9566); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4722:1: rule__SignedNumber__Group__1 : rule__SignedNumber__Group__1__Impl ;
    public final void rule__SignedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4726:1: ( rule__SignedNumber__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4727:2: rule__SignedNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__19599);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4733:1: rule__SignedNumber__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__SignedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4737:1: ( ( RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4738:1: ( RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4738:1: ( RULE_NUMBER )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4739:1: RULE_NUMBER
            {
             before(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl9626); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4755:1: rule__Model__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4759:1: ( ( ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4760:1: ( ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4760:1: ( ruleQualifiedName )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4761:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_19664);
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


    // $ANTLR start "rule__Model__DeclarationsAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4770:1: rule__Model__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4774:1: ( ( ruleDeclaration ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4775:1: ( ruleDeclaration )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4775:1: ( ruleDeclaration )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4776:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_29695);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4785:1: rule__Client__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Client__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4789:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4790:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4790:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4791:1: RULE_ID
            {
             before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Client__NameAssignment_19726); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4800:1: rule__Client__BaseUrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Client__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4804:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4805:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4805:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4806:1: RULE_STRING
            {
             before(grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_29757); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4815:1: rule__Client__BlocksAssignment_4 : ( ruleClientBlock ) ;
    public final void rule__Client__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4819:1: ( ( ruleClientBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4820:1: ( ruleClientBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4820:1: ( ruleClientBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4821:1: ruleClientBlock
            {
             before(grammarAccess.getClientAccess().getBlocksClientBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleClientBlock_in_rule__Client__BlocksAssignment_49788);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4830:1: rule__HeaderBlock__HeadersAssignment_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4834:1: ( ( ruleHeader ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4835:1: ( ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4835:1: ( ruleHeader )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4836:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_19819);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4845:1: rule__HeaderBlock__HeadersAssignment_2_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4849:1: ( ( ruleHeader ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4850:1: ( ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4850:1: ( ruleHeader )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4851:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_19850);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4860:1: rule__Header__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4864:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4865:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4865:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4866:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_09881); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4875:1: rule__Header__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4879:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4880:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4880:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4881:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_29912); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4890:1: rule__HttpMethod__TypeAssignment_0 : ( ruleHttpMethodType ) ;
    public final void rule__HttpMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4894:1: ( ( ruleHttpMethodType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4895:1: ( ruleHttpMethodType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4895:1: ( ruleHttpMethodType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4896:1: ruleHttpMethodType
            {
             before(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_09943);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4905:1: rule__HttpMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4909:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4910:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4910:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4911:1: RULE_ID
            {
             before(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_19974); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4920:1: rule__HttpMethod__PathAssignment_2 : ( rulePath ) ;
    public final void rule__HttpMethod__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4924:1: ( ( rulePath ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4925:1: ( rulePath )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4925:1: ( rulePath )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4926:1: rulePath
            {
             before(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__HttpMethod__PathAssignment_210005);
            rulePath();

            state._fsp--;

             after(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4935:1: rule__HttpMethod__BlocksAssignment_4 : ( ruleHttpMethodBlock ) ;
    public final void rule__HttpMethod__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4939:1: ( ( ruleHttpMethodBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4940:1: ( ruleHttpMethodBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4940:1: ( ruleHttpMethodBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4941:1: ruleHttpMethodBlock
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_410036);
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


    // $ANTLR start "rule__Path__ParamsAssignment_2_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4950:1: rule__Path__ParamsAssignment_2_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__Path__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4954:1: ( ( ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4955:1: ( ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4955:1: ( ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4956:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_2_110067);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ParamsAssignment_2_1"


    // $ANTLR start "rule__Path__ParamsAssignment_3_1_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4965:1: rule__Path__ParamsAssignment_3_1_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__Path__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4969:1: ( ( ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4970:1: ( ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4970:1: ( ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4971:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_3_1_110098);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__ParamsBlock__ParamsAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4980:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4984:1: ( ( ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4985:1: ( ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4985:1: ( ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4986:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_210129);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4995:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4999:1: ( ( ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5000:1: ( ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5000:1: ( ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5001:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_3_110160);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5010:1: rule__SimpleMemberAssignment__MemberAssignment_0 : ( ruleSimpleMember ) ;
    public final void rule__SimpleMemberAssignment__MemberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5014:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5015:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5015:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5016:1: ruleSimpleMember
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__SimpleMemberAssignment__MemberAssignment_010191);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5025:1: rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__SimpleMemberAssignment__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5029:1: ( ( ruleLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5030:1: ( ruleLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5030:1: ( ruleLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5031:1: ruleLiteral
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__SimpleMemberAssignment__DefaultValueAssignment_1_110222);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5040:1: rule__Literal__LiteralAssignment_0_1 : ( ruleBooleanValue ) ;
    public final void rule__Literal__LiteralAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5044:1: ( ( ruleBooleanValue ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5045:1: ( ruleBooleanValue )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5045:1: ( ruleBooleanValue )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5046:1: ruleBooleanValue
            {
             before(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_110253);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5055:1: rule__Literal__LiteralAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Literal__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5059:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5060:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5060:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5061:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_110284); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5070:1: rule__Literal__LiteralAssignment_2_1 : ( ruleSignedNumber ) ;
    public final void rule__Literal__LiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5074:1: ( ( ruleSignedNumber ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5075:1: ( ruleSignedNumber )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5075:1: ( ruleSignedNumber )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5076:1: ruleSignedNumber
            {
             before(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_110315);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5085:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5089:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5090:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5090:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5091:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_110346);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5100:1: rule__ResponseBlock__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5104:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5105:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5105:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5106:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5107:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5108:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_110381); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5119:1: rule__ResponseBlock__TypeAssignment_3 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5123:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5124:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5124:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5125:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_310416);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5134:1: rule__TypedMember__NameAssignment_0 : ( ( rule__TypedMember__NameAlternatives_0_0 ) ) ;
    public final void rule__TypedMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5138:1: ( ( ( rule__TypedMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5139:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5139:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5140:1: ( rule__TypedMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5141:1: ( rule__TypedMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5141:2: rule__TypedMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_010447);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5150:1: rule__TypedMember__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__TypedMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5154:1: ( ( ruleType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5155:1: ( ruleType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5155:1: ( ruleType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5156:1: ruleType
            {
             before(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_210480);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5165:1: rule__SkipMember__NameAssignment_0 : ( ( rule__SkipMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SkipMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5169:1: ( ( ( rule__SkipMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5170:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5170:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5171:1: ( rule__SkipMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5172:1: ( rule__SkipMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5172:2: rule__SkipMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_010511);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5181:1: rule__SkipMember__LiteralAssignment_1 : ( ruleComplexTypeLiteral ) ;
    public final void rule__SkipMember__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5185:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5186:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5186:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5187:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_110544);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5196:1: rule__SimpleMember__NameAssignment_0 : ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5200:1: ( ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5201:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5201:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5202:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5203:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5203:2: rule__SimpleMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_010575);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5212:1: rule__SimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__SimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5216:1: ( ( ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5217:1: ( ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5217:1: ( ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5218:1: ruleIntrinsicType
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_210608);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5227:1: rule__GenericListType__ElementTypeAssignment_0 : ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__GenericListType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5231:1: ( ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5232:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5232:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5233:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5234:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5234:2: rule__GenericListType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_010639);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5243:1: rule__GenericListType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__GenericListType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5247:1: ( ( ( '[]' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5248:1: ( ( '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5248:1: ( ( '[]' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5249:1: ( '[]' )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5250:1: ( '[]' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5251:1: '[]'
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__GenericListType__IdAssignment_110677); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5266:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5270:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5271:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5271:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5272:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5273:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5274:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment10720); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5285:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5289:1: ( ( ( 'entity' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5290:1: ( ( 'entity' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5290:1: ( ( 'entity' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5291:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5292:1: ( 'entity' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5293:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__ComplexTypeDeclaration__KeywordAssignment_010760); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5308:1: rule__ComplexTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__ComplexTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5312:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5313:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5313:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5314:1: ( 'generate' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5315:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5316:1: 'generate'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__ComplexTypeDeclaration__GenAssignment_110804); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5331:1: rule__ComplexTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5335:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5336:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5336:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5337:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_210843); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5346:1: rule__ComplexTypeDeclaration__LiteralAssignment_3 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5350:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5351:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5351:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5352:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_310874);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5361:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5365:1: ( ( ( 'enum' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5366:1: ( ( 'enum' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5366:1: ( ( 'enum' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5367:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5368:1: ( 'enum' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5369:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__EnumTypeDeclaration__KeywordAssignment_010910); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5384:1: rule__EnumTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__EnumTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5388:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5389:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5389:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5390:1: ( 'generate' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5391:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5392:1: 'generate'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumTypeDeclaration__GenAssignment_110954); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5407:1: rule__EnumTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5411:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5412:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5412:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5413:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210993); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5422:1: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5426:1: ( ( ruleIntegerType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5427:1: ( ruleIntegerType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5427:1: ( ruleIntegerType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5428:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_111024);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5437:1: rule__EnumTypeDeclaration__LiteralAssignment_4 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5441:1: ( ( ruleEnumTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5442:1: ( ruleEnumTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5442:1: ( ruleEnumTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5443:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_411055);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5452:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5456:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5457:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5457:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5458:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_111086);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5467:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5471:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5472:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5472:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5473:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_111117);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5482:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5486:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5487:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5487:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5488:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_011148); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5497:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5501:1: ( ( ( '=' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5502:1: ( ( '=' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5502:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5503:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5504:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5505:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,28,FOLLOW_28_in_rule__EnumMember__AssignmentAssignment_1_011184); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5520:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5524:1: ( ( RULE_INT ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5525:1: ( RULE_INT )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5525:1: ( RULE_INT )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5526:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_111223); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5535:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5539:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5540:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5540:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5541:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_111254);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5550:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5554:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5555:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5555:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5556:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_111285);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5565:1: rule__StringType__IdAssignment : ( ( 'String' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5569:1: ( ( ( 'String' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5570:1: ( ( 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5570:1: ( ( 'String' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5571:1: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5572:1: ( 'String' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5573:1: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__StringType__IdAssignment11321); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5588:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5592:1: ( ( ( 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5593:1: ( ( 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5593:1: ( ( 'boolean' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5594:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5595:1: ( 'boolean' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5596:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__BooleanType__IdAssignment11365); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5611:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5615:1: ( ( ( 'int' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5616:1: ( ( 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5616:1: ( ( 'int' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5617:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5618:1: ( 'int' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5619:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__IntegerType__IdAssignment11409); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5634:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5638:1: ( ( ( 'long' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5639:1: ( ( 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5639:1: ( ( 'long' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5640:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5641:1: ( 'long' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5642:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__LongType__IdAssignment11453); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5657:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5661:1: ( ( ( 'double' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5662:1: ( ( 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5662:1: ( ( 'double' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5663:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5664:1: ( 'double' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5665:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__DoubleType__IdAssignment11497); 
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


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\1\uffff\1\7\5\11\3\uffff";
    static final String DFA12_minS =
        "\1\4\6\25\3\uffff";
    static final String DFA12_maxS =
        "\1\51\6\41\3\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\1\1\3\1\2";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\40\uffff\1\2\1\3\1\4\1\5\1\6",
            "\3\7\3\uffff\1\7\1\uffff\2\7\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1428:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );";
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
    public static final BitSet FOLLOW_rulePath_in_entryRulePath541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryPathSegment608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__0_in_ruleArbitraryPathSegment634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMemberAssignment728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__0_in_ruleSimpleMemberAssignment754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_entryRuleTypedMember1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedMember1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0_in_ruleTypedMember1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_entryRuleSkipMember1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkipMember1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember1234 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rule__Declaration__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__ClientBlock__Alternatives2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__ClientBlock__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__ClientBlock__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_22620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__ParamsAssignment_2_1_in_rule__Path__Alternatives_22637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_3_12670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__ParamsAssignment_3_1_1_in_rule__Path__Alternatives_3_12687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_03002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_rule__Type__Alternatives3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_03100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_03117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HttpMethodType__Alternatives3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpMethodType__Alternatives3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpMethodType__Alternatives3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HttpMethodType__Alternatives3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanValue__Alternatives3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanValue__Alternatives3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__0__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13546 = new BitSet(new long[]{0x0000001400080000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3633 = new BitSet(new long[]{0x0000001400080002L});
    public static final BitSet FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Client__Group__0__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13732 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23792 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33853 = new BitSet(new long[]{0x000000000860F000L});
    public static final BitSet FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Client__Group__3__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43915 = new BitSet(new long[]{0x000000000860F000L});
    public static final BitSet FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BlocksAssignment_4_in_rule__Client__Group__4__Impl3945 = new BitSet(new long[]{0x000000000840F002L});
    public static final BitSet FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Client__Group__5__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__04047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__04050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HeaderBlock__Group__0__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__14109 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__24169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl4196 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__04233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__04236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HeaderBlock__Group_2__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__14295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__04356 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__14416 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Header__Group__1__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__24478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__04541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__04544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14601 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24661 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34722 = new BitSet(new long[]{0x0000000068600000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HttpMethod__Group__3__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44784 = new BitSet(new long[]{0x0000000068600000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4814 = new BitSet(new long[]{0x0000000068400002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HttpMethod__Group__5__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04916 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14977 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Path__Group__1__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__25039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Path__Group__3_in_rule__Path__Group__25042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Alternatives_2_in_rule__Path__Group__2__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__35099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__0_in_rule__Path__Group__3__Impl5126 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__0__Impl_in_rule__Path__Group_3__05165 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Path__Group_3__1_in_rule__Path__Group_3__05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Path__Group_3__0__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__1__Impl_in_rule__Path__Group_3__15227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Alternatives_3_1_in_rule__Path__Group_3__1__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__0__Impl_in_rule__ArbitraryPathSegment__Group__05288 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__1_in_rule__ArbitraryPathSegment__Group__05291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group__0__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__1__Impl_in_rule__ArbitraryPathSegment__Group__15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__0_in_rule__ArbitraryPathSegment__Group__1__Impl5374 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__0__Impl_in_rule__ArbitraryPathSegment__Group_1__05409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__1_in_rule__ArbitraryPathSegment__Group_1__05412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ArbitraryPathSegment__Group_1__0__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__1__Impl_in_rule__ArbitraryPathSegment__Group_1__15471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group_1__1__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05531 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15592 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ParamsBlock__Group__1__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25654 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5741 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05780 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ParamsBlock__Group_3__0__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__0__Impl_in_rule__SimpleMemberAssignment__Group__05903 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__1_in_rule__SimpleMemberAssignment__Group__05906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__MemberAssignment_0_in_rule__SimpleMemberAssignment__Group__0__Impl5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__1__Impl_in_rule__SimpleMemberAssignment__Group__15963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__0_in_rule__SimpleMemberAssignment__Group__1__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__0__Impl_in_rule__SimpleMemberAssignment__Group_1__06025 = new BitSet(new long[]{0x0000000004030060L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__1_in_rule__SimpleMemberAssignment__Group_1__06028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SimpleMemberAssignment__Group_1__0__Impl6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__1__Impl_in_rule__SimpleMemberAssignment__Group_1__16087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__DefaultValueAssignment_1_1_in_rule__SimpleMemberAssignment__Group_1__1__Impl6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__06148 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__06151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__16209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__06270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__06273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__16331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__06392 = new BitSet(new long[]{0x0000000004030060L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__06395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__16453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__06514 = new BitSet(new long[]{0x000003E000100010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__06517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BodyBlock__Group__0__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__16576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__06637 = new BitSet(new long[]{0x0000000068400000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__06640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__16698 = new BitSet(new long[]{0x000003E080100010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__16701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ResponseBlock__Group__1__Impl6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__26760 = new BitSet(new long[]{0x000003E080100010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__26763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ResponseBlock__Group_2__0__Impl6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__07010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__07013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__17070 = new BitSet(new long[]{0x000003E000000010L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__17073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypedMember__Group__1__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__27132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__07195 = new BitSet(new long[]{0x000003E000100010L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__07198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__17255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__07316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__07319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__17376 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__17379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleMember__Group__1__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__27438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__07501 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__07504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__07622 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__07625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__17682 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__17685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__27743 = new BitSet(new long[]{0x000003E000100010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__27746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__37803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07869 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17929 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27990 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__38050 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__38053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__48111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__08179 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__08182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumTypeDeclaration__Group_3__0__Impl8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__18241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__08302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__08305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumTypeLiteral__Group__0__Impl8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__18364 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__18367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__28424 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__28427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl8454 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__38485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumTypeLiteral__Group__3__Impl8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__08552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__08555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumTypeLiteral__Group_2__0__Impl8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__18614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__08675 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__08678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__18735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__08797 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__08800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08918 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexTypeLiteral__Group__0__Impl8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18980 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__29040 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__29043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl9070 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__39101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComplexTypeLiteral__Group__3__Impl9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__09168 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__09171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ComplexTypeLiteral__Group_2__0__Impl9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__19230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09291 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9377 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl9443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__09534 = new BitSet(new long[]{0x0000000004030060L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__09537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SignedNumber__Group__0__Impl9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__19599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl9626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_19664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_29695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Client__NameAssignment_19726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_29757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientBlock_in_rule__Client__BlocksAssignment_49788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_19819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_19850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_09881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_29912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_09943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_19974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__HttpMethod__PathAssignment_210005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_410036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_2_110067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_3_1_110098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_210129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_3_110160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__SimpleMemberAssignment__MemberAssignment_010191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__SimpleMemberAssignment__DefaultValueAssignment_1_110222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_110253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_110284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_110315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_110346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_110381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_310416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_010447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_210480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_010511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_110544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_010575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_210608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_010639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GenericListType__IdAssignment_110677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ComplexTypeDeclaration__KeywordAssignment_010760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ComplexTypeDeclaration__GenAssignment_110804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_210843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_310874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EnumTypeDeclaration__KeywordAssignment_010910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumTypeDeclaration__GenAssignment_110954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_111024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_411055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_111086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_111117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_011148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumMember__AssignmentAssignment_1_011184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_111223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_111254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_111285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StringType__IdAssignment11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BooleanType__IdAssignment11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IntegerType__IdAssignment11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LongType__IdAssignment11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DoubleType__IdAssignment11497 = new BitSet(new long[]{0x0000000000000002L});

}