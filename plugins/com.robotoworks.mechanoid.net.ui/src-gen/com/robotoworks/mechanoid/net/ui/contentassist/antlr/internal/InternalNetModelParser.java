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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'get'", "'put'", "'post'", "'delete'", "'package'", "'client'", "'{'", "'}'", "'headers'", "','", "':'", "'params'", "'body'", "'response'", "'extends'", "'.'", "'[]'", "'entity'", "'generate'", "'enum'", "'='", "'String'", "'boolean'", "'int'", "'long'", "'double'"
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


    // $ANTLR start "ruleHttpMethodType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:985:1: ruleHttpMethodType : ( ( rule__HttpMethodType__Alternatives ) ) ;
    public final void ruleHttpMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:989:1: ( ( ( rule__HttpMethodType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:990:1: ( ( rule__HttpMethodType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:990:1: ( ( rule__HttpMethodType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:991:1: ( rule__HttpMethodType__Alternatives )
            {
             before(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:992:1: ( rule__HttpMethodType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:992:2: rule__HttpMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2051);
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


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1003:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleClient ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1007:1: ( ( ruleUserTypeDeclaration ) | ( ruleClient ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28||LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1008:1: ( ruleUserTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1008:1: ( ruleUserTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1009:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2086);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1014:6: ( ruleClient )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1014:6: ( ruleClient )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1015:1: ruleClient
                    {
                     before(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClient_in_rule__Declaration__Alternatives2103);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1025:1: rule__ClientBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) );
    public final void rule__ClientBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1029:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1030:1: ( ruleHeaderBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1030:1: ( ruleHeaderBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1031:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__ClientBlock__Alternatives2135);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1036:6: ( ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1036:6: ( ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1037:1: ruleParamsBlock
                    {
                     before(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__ClientBlock__Alternatives2152);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1042:6: ( ruleHttpMethod )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1042:6: ( ruleHttpMethod )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1043:1: ruleHttpMethod
                    {
                     before(grammarAccess.getClientBlockAccess().getHttpMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpMethod_in_rule__ClientBlock__Alternatives2169);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1053:1: rule__HttpMethodBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) );
    public final void rule__HttpMethodBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1057:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1058:1: ( ruleHeaderBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1058:1: ( ruleHeaderBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1059:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2201);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1064:6: ( ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1064:6: ( ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1065:1: ruleParamsBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2218);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1070:6: ( ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1070:6: ( ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1071:1: ruleBodyBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2235);
                    ruleBodyBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1076:6: ( ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1076:6: ( ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1077:1: ruleResponseBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2252);
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


    // $ANTLR start "rule__BlockType__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1087:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1091:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=32 && LA4_0<=36)) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1092:1: ( ruleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1092:1: ( ruleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1093:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2284);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1098:6: ( ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1098:6: ( ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1099:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2301);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1109:1: rule__Member__Alternatives : ( ( ruleTypedMember ) | ( ruleSkipMember ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1113:1: ( ( ruleTypedMember ) | ( ruleSkipMember ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=2;
                }
                else if ( (LA5_1==21) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==17) ) {
                    alt5=2;
                }
                else if ( (LA5_2==21) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1114:1: ( ruleTypedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1114:1: ( ruleTypedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1115:1: ruleTypedMember
                    {
                     before(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2333);
                    ruleTypedMember();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1120:6: ( ruleSkipMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1120:6: ( ruleSkipMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1121:1: ruleSkipMember
                    {
                     before(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2350);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1131:1: rule__TypedMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TypedMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1135:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1136:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1136:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1137:1: RULE_ID
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02382); 
                     after(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1142:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1142:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1143:1: RULE_STRING
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02399); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1153:1: rule__SkipMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SkipMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1157:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1158:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1158:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1159:1: RULE_ID
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02431); 
                     after(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1164:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1164:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1165:1: RULE_STRING
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02448); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1175:1: rule__SimpleMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SimpleMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1179:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1180:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1180:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1181:1: RULE_ID
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02480); 
                     after(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1186:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1186:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1187:1: RULE_STRING
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02497); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1197:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1202:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1202:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1203:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives2529);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1208:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1208:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1209:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2546);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1214:6: ( ruleGenericListType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1214:6: ( ruleGenericListType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1215:1: ruleGenericListType
                    {
                     before(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2563);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1225:1: rule__GenericListType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__GenericListType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=32 && LA10_0<=36)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1230:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1230:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1231:1: ruleUserType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02595);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1236:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1236:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1237:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02612);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1247:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1252:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1252:1: ( ruleComplexTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1253:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2644);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1258:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1258:6: ( ruleEnumTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1259:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2661);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1269:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
            case 35:
            case 36:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1274:1: ( ruleStringType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1274:1: ( ruleStringType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1275:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2693);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1280:6: ( ruleBooleanType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1280:6: ( ruleBooleanType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1281:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2710);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1286:6: ( ruleNumericType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1286:6: ( ruleNumericType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1287:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2727);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1297:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1301:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1302:1: ( ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1302:1: ( ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1303:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2759);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1308:6: ( ruleLongType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1308:6: ( ruleLongType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1309:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2776);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1314:6: ( ruleDoubleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1314:6: ( ruleDoubleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1315:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2793);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1325:1: rule__HttpMethodType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) );
    public final void rule__HttpMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1329:1: ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt14=1;
                }
                break;
            case 12:
                {
                alt14=2;
                }
                break;
            case 13:
                {
                alt14=3;
                }
                break;
            case 14:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1330:1: ( ( 'get' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1330:1: ( ( 'get' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1331:1: ( 'get' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1332:1: ( 'get' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1332:3: 'get'
                    {
                    match(input,11,FOLLOW_11_in_rule__HttpMethodType__Alternatives2826); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1337:6: ( ( 'put' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1337:6: ( ( 'put' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1338:1: ( 'put' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1339:1: ( 'put' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1339:3: 'put'
                    {
                    match(input,12,FOLLOW_12_in_rule__HttpMethodType__Alternatives2847); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1344:6: ( ( 'post' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1344:6: ( ( 'post' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:1: ( 'post' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1346:1: ( 'post' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1346:3: 'post'
                    {
                    match(input,13,FOLLOW_13_in_rule__HttpMethodType__Alternatives2868); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:6: ( ( 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:6: ( ( 'delete' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1352:1: ( 'delete' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1353:1: ( 'delete' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1353:3: 'delete'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpMethodType__Alternatives2889); 

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


    // $ANTLR start "rule__Model__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1365:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1369:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1370:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02922);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02925);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1377:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1381:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1382:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1382:1: ( 'package' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1383:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group__0__Impl2953); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1396:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1400:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1401:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12984);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12987);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1408:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1412:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1413:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1413:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1414:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1415:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1415:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3014);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1425:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1429:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1430:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23044);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1436:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1440:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1441:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1441:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1442:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1443:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16||LA15_0==28||LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1443:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3071);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1459:1: rule__Client__Group__0 : rule__Client__Group__0__Impl rule__Client__Group__1 ;
    public final void rule__Client__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1463:1: ( rule__Client__Group__0__Impl rule__Client__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1464:2: rule__Client__Group__0__Impl rule__Client__Group__1
            {
            pushFollow(FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03108);
            rule__Client__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03111);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1471:1: rule__Client__Group__0__Impl : ( 'client' ) ;
    public final void rule__Client__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1475:1: ( ( 'client' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1476:1: ( 'client' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1476:1: ( 'client' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1477:1: 'client'
            {
             before(grammarAccess.getClientAccess().getClientKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Client__Group__0__Impl3139); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1490:1: rule__Client__Group__1 : rule__Client__Group__1__Impl rule__Client__Group__2 ;
    public final void rule__Client__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1494:1: ( rule__Client__Group__1__Impl rule__Client__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1495:2: rule__Client__Group__1__Impl rule__Client__Group__2
            {
            pushFollow(FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13170);
            rule__Client__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13173);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1502:1: rule__Client__Group__1__Impl : ( ( rule__Client__NameAssignment_1 ) ) ;
    public final void rule__Client__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1506:1: ( ( ( rule__Client__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1507:1: ( ( rule__Client__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1507:1: ( ( rule__Client__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1508:1: ( rule__Client__NameAssignment_1 )
            {
             before(grammarAccess.getClientAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1509:1: ( rule__Client__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1509:2: rule__Client__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3200);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1519:1: rule__Client__Group__2 : rule__Client__Group__2__Impl rule__Client__Group__3 ;
    public final void rule__Client__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1523:1: ( rule__Client__Group__2__Impl rule__Client__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1524:2: rule__Client__Group__2__Impl rule__Client__Group__3
            {
            pushFollow(FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23230);
            rule__Client__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23233);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1531:1: rule__Client__Group__2__Impl : ( ( rule__Client__BaseUrlAssignment_2 )? ) ;
    public final void rule__Client__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1535:1: ( ( ( rule__Client__BaseUrlAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1536:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1536:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1537:1: ( rule__Client__BaseUrlAssignment_2 )?
            {
             before(grammarAccess.getClientAccess().getBaseUrlAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1538:1: ( rule__Client__BaseUrlAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1538:2: rule__Client__BaseUrlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3260);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1548:1: rule__Client__Group__3 : rule__Client__Group__3__Impl rule__Client__Group__4 ;
    public final void rule__Client__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1552:1: ( rule__Client__Group__3__Impl rule__Client__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1553:2: rule__Client__Group__3__Impl rule__Client__Group__4
            {
            pushFollow(FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33291);
            rule__Client__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33294);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1560:1: rule__Client__Group__3__Impl : ( '{' ) ;
    public final void rule__Client__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1564:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1565:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1565:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1566:1: '{'
            {
             before(grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Client__Group__3__Impl3322); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1579:1: rule__Client__Group__4 : rule__Client__Group__4__Impl rule__Client__Group__5 ;
    public final void rule__Client__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1583:1: ( rule__Client__Group__4__Impl rule__Client__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1584:2: rule__Client__Group__4__Impl rule__Client__Group__5
            {
            pushFollow(FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43353);
            rule__Client__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43356);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1591:1: rule__Client__Group__4__Impl : ( ( rule__Client__BlocksAssignment_4 )* ) ;
    public final void rule__Client__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1595:1: ( ( ( rule__Client__BlocksAssignment_4 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1596:1: ( ( rule__Client__BlocksAssignment_4 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1596:1: ( ( rule__Client__BlocksAssignment_4 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1597:1: ( rule__Client__BlocksAssignment_4 )*
            {
             before(grammarAccess.getClientAccess().getBlocksAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1598:1: ( rule__Client__BlocksAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=11 && LA17_0<=14)||LA17_0==19||LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1598:2: rule__Client__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Client__BlocksAssignment_4_in_rule__Client__Group__4__Impl3383);
            	    rule__Client__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1608:1: rule__Client__Group__5 : rule__Client__Group__5__Impl ;
    public final void rule__Client__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1612:1: ( rule__Client__Group__5__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1613:2: rule__Client__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53414);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1619:1: rule__Client__Group__5__Impl : ( '}' ) ;
    public final void rule__Client__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1623:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1624:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1624:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1625:1: '}'
            {
             before(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Client__Group__5__Impl3442); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1650:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1654:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1655:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03485);
            rule__HeaderBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03488);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1662:1: rule__HeaderBlock__Group__0__Impl : ( 'headers' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1666:1: ( ( 'headers' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1667:1: ( 'headers' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1667:1: ( 'headers' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1668:1: 'headers'
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__HeaderBlock__Group__0__Impl3516); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1681:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1685:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1686:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13547);
            rule__HeaderBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13550);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1693:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1697:1: ( ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1698:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1698:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1699:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1700:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1700:2: rule__HeaderBlock__HeadersAssignment_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl3577);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1710:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1714:1: ( rule__HeaderBlock__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1715:2: rule__HeaderBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23607);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1721:1: rule__HeaderBlock__Group__2__Impl : ( ( rule__HeaderBlock__Group_2__0 )* ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1725:1: ( ( ( rule__HeaderBlock__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1726:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1726:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1727:1: ( rule__HeaderBlock__Group_2__0 )*
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1728:1: ( rule__HeaderBlock__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1728:2: rule__HeaderBlock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl3634);
            	    rule__HeaderBlock__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1744:1: rule__HeaderBlock__Group_2__0 : rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 ;
    public final void rule__HeaderBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1748:1: ( rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1749:2: rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__03671);
            rule__HeaderBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__03674);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1756:1: rule__HeaderBlock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__HeaderBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1760:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1761:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1761:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1762:1: ','
            {
             before(grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__HeaderBlock__Group_2__0__Impl3702); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1775:1: rule__HeaderBlock__Group_2__1 : rule__HeaderBlock__Group_2__1__Impl ;
    public final void rule__HeaderBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1779:1: ( rule__HeaderBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1780:2: rule__HeaderBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__13733);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1786:1: rule__HeaderBlock__Group_2__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) ;
    public final void rule__HeaderBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1790:1: ( ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1792:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:2: rule__HeaderBlock__HeadersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl3760);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1807:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1811:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1812:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__03794);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__03797);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1819:1: rule__Header__Group__0__Impl : ( ( rule__Header__NameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1823:1: ( ( ( rule__Header__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1824:1: ( ( rule__Header__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1824:1: ( ( rule__Header__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1825:1: ( rule__Header__NameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1826:1: ( rule__Header__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1826:2: rule__Header__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl3824);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1836:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1840:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1841:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__13854);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__13857);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1848:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1852:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1854:1: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Header__Group__1__Impl3885); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1867:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1871:1: ( rule__Header__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1872:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__23916);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1878:1: rule__Header__Group__2__Impl : ( ( rule__Header__ValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1882:1: ( ( ( rule__Header__ValueAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1883:1: ( ( rule__Header__ValueAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1883:1: ( ( rule__Header__ValueAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1884:1: ( rule__Header__ValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getValueAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1885:1: ( rule__Header__ValueAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1885:2: rule__Header__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl3943);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1901:1: rule__HttpMethod__Group__0 : rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 ;
    public final void rule__HttpMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1905:1: ( rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1906:2: rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__03979);
            rule__HttpMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__03982);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1913:1: rule__HttpMethod__Group__0__Impl : ( ( rule__HttpMethod__TypeAssignment_0 ) ) ;
    public final void rule__HttpMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1917:1: ( ( ( rule__HttpMethod__TypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1918:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1918:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1919:1: ( rule__HttpMethod__TypeAssignment_0 )
            {
             before(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1920:1: ( rule__HttpMethod__TypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1920:2: rule__HttpMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4009);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1930:1: rule__HttpMethod__Group__1 : rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 ;
    public final void rule__HttpMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1934:1: ( rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1935:2: rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14039);
            rule__HttpMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14042);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1942:1: rule__HttpMethod__Group__1__Impl : ( ( rule__HttpMethod__NameAssignment_1 ) ) ;
    public final void rule__HttpMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1946:1: ( ( ( rule__HttpMethod__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1947:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1947:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1948:1: ( rule__HttpMethod__NameAssignment_1 )
            {
             before(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1949:1: ( rule__HttpMethod__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1949:2: rule__HttpMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4069);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1959:1: rule__HttpMethod__Group__2 : rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 ;
    public final void rule__HttpMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1963:1: ( rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1964:2: rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24099);
            rule__HttpMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24102);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1971:1: rule__HttpMethod__Group__2__Impl : ( ( rule__HttpMethod__PathAssignment_2 )? ) ;
    public final void rule__HttpMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1975:1: ( ( ( rule__HttpMethod__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1976:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1976:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1977:1: ( rule__HttpMethod__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1978:1: ( rule__HttpMethod__PathAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1978:2: rule__HttpMethod__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4129);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1988:1: rule__HttpMethod__Group__3 : rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 ;
    public final void rule__HttpMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1992:1: ( rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1993:2: rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34160);
            rule__HttpMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34163);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2000:1: rule__HttpMethod__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2004:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2005:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2005:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2006:1: '{'
            {
             before(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__HttpMethod__Group__3__Impl4191); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2019:1: rule__HttpMethod__Group__4 : rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 ;
    public final void rule__HttpMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2023:1: ( rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2024:2: rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44222);
            rule__HttpMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44225);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2031:1: rule__HttpMethod__Group__4__Impl : ( ( rule__HttpMethod__BlocksAssignment_4 )* ) ;
    public final void rule__HttpMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2035:1: ( ( ( rule__HttpMethod__BlocksAssignment_4 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2036:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2036:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2037:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2038:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19||(LA20_0>=22 && LA20_0<=24)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2038:2: rule__HttpMethod__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4252);
            	    rule__HttpMethod__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2048:1: rule__HttpMethod__Group__5 : rule__HttpMethod__Group__5__Impl ;
    public final void rule__HttpMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2052:1: ( rule__HttpMethod__Group__5__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2053:2: rule__HttpMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54283);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2059:1: rule__HttpMethod__Group__5__Impl : ( '}' ) ;
    public final void rule__HttpMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2063:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2064:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2064:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2065:1: '}'
            {
             before(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__HttpMethod__Group__5__Impl4311); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2090:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2094:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2095:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__04354);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__04357);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2102:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2106:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2107:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2107:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2108:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2109:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2111:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2121:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2125:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2126:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__14415);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__14418);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2133:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2137:1: ( ( 'params' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2138:1: ( 'params' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2138:1: ( 'params' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2139:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ParamsBlock__Group__1__Impl4446); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2152:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2156:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2157:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__24477);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__24480);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2164:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 )* ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2168:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2169:1: ( ( rule__ParamsBlock__ParamsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2169:1: ( ( rule__ParamsBlock__ParamsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2170:1: ( rule__ParamsBlock__ParamsAssignment_2 )*
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2171:1: ( rule__ParamsBlock__ParamsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2171:2: rule__ParamsBlock__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl4507);
            	    rule__ParamsBlock__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2181:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2185:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2186:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__34538);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2192:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2196:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2197:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2197:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2198:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2199:1: ( rule__ParamsBlock__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2199:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl4565);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2217:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2221:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2222:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__04604);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__04607);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2229:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2233:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2234:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2234:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2235:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__ParamsBlock__Group_3__0__Impl4635); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2248:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2252:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2253:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__14666);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2259:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2263:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2264:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2264:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2265:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2266:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2266:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl4693);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2280:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2284:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2285:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__04727);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__04730);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2292:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2296:1: ( ( 'body' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2297:1: ( 'body' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2297:1: ( 'body' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2298:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__BodyBlock__Group__0__Impl4758); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2311:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2315:1: ( rule__BodyBlock__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2316:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__14789);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2322:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2326:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2327:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2327:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2328:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2329:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2329:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl4816);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2343:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2347:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2348:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__04850);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__04853);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2355:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2359:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2360:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2360:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2361:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2362:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2364:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2374:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2378:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2379:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__14911);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__14914);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2386:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2390:1: ( ( 'response' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2391:1: ( 'response' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2391:1: ( 'response' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2392:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ResponseBlock__Group__1__Impl4942); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2405:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2409:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2410:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__24973);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__24976);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2417:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__Group_2__0 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2421:1: ( ( ( rule__ResponseBlock__Group_2__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2422:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2422:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2423:1: ( rule__ResponseBlock__Group_2__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2424:1: ( rule__ResponseBlock__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2424:2: rule__ResponseBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl5003);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2434:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2438:1: ( rule__ResponseBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2439:2: rule__ResponseBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__35034);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2445:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__TypeAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2449:1: ( ( ( rule__ResponseBlock__TypeAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2450:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2450:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2451:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2452:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==17||(LA24_0>=32 && LA24_0<=36)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2452:2: rule__ResponseBlock__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl5061);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2470:1: rule__ResponseBlock__Group_2__0 : rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 ;
    public final void rule__ResponseBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2474:1: ( rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2475:2: rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__05100);
            rule__ResponseBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__05103);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2482:1: rule__ResponseBlock__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ResponseBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2486:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2487:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2487:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2488:1: 'extends'
            {
             before(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__ResponseBlock__Group_2__0__Impl5131); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2501:1: rule__ResponseBlock__Group_2__1 : rule__ResponseBlock__Group_2__1__Impl ;
    public final void rule__ResponseBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2505:1: ( rule__ResponseBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2506:2: rule__ResponseBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__15162);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2512:1: rule__ResponseBlock__Group_2__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ResponseBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2516:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2517:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2517:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2518:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2519:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2519:2: rule__ResponseBlock__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl5189);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2533:1: rule__TypedMember__Group__0 : rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 ;
    public final void rule__TypedMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2537:1: ( rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2538:2: rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__05223);
            rule__TypedMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__05226);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2545:1: rule__TypedMember__Group__0__Impl : ( ( rule__TypedMember__NameAssignment_0 ) ) ;
    public final void rule__TypedMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2549:1: ( ( ( rule__TypedMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2550:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2550:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2551:1: ( rule__TypedMember__NameAssignment_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2552:1: ( rule__TypedMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2552:2: rule__TypedMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl5253);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2562:1: rule__TypedMember__Group__1 : rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 ;
    public final void rule__TypedMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2566:1: ( rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2567:2: rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__15283);
            rule__TypedMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__15286);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2574:1: rule__TypedMember__Group__1__Impl : ( ':' ) ;
    public final void rule__TypedMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2578:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2579:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2579:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2580:1: ':'
            {
             before(grammarAccess.getTypedMemberAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__TypedMember__Group__1__Impl5314); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2593:1: rule__TypedMember__Group__2 : rule__TypedMember__Group__2__Impl ;
    public final void rule__TypedMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2597:1: ( rule__TypedMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2598:2: rule__TypedMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__25345);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2604:1: rule__TypedMember__Group__2__Impl : ( ( rule__TypedMember__TypeAssignment_2 ) ) ;
    public final void rule__TypedMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:1: ( ( ( rule__TypedMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2609:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2609:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2610:1: ( rule__TypedMember__TypeAssignment_2 )
            {
             before(grammarAccess.getTypedMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2611:1: ( rule__TypedMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2611:2: rule__TypedMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl5372);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2627:1: rule__SkipMember__Group__0 : rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 ;
    public final void rule__SkipMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2631:1: ( rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2632:2: rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__05408);
            rule__SkipMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__05411);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2639:1: rule__SkipMember__Group__0__Impl : ( ( rule__SkipMember__NameAssignment_0 ) ) ;
    public final void rule__SkipMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2643:1: ( ( ( rule__SkipMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2644:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2644:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2645:1: ( rule__SkipMember__NameAssignment_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2646:1: ( rule__SkipMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2646:2: rule__SkipMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl5438);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2656:1: rule__SkipMember__Group__1 : rule__SkipMember__Group__1__Impl ;
    public final void rule__SkipMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2660:1: ( rule__SkipMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2661:2: rule__SkipMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__15468);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2667:1: rule__SkipMember__Group__1__Impl : ( ( rule__SkipMember__LiteralAssignment_1 ) ) ;
    public final void rule__SkipMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2671:1: ( ( ( rule__SkipMember__LiteralAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2672:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2672:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2673:1: ( rule__SkipMember__LiteralAssignment_1 )
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2674:1: ( rule__SkipMember__LiteralAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2674:2: rule__SkipMember__LiteralAssignment_1
            {
            pushFollow(FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl5495);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2688:1: rule__SimpleMember__Group__0 : rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 ;
    public final void rule__SimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2692:1: ( rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2693:2: rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__05529);
            rule__SimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__05532);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2700:1: rule__SimpleMember__Group__0__Impl : ( ( rule__SimpleMember__NameAssignment_0 ) ) ;
    public final void rule__SimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2704:1: ( ( ( rule__SimpleMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2705:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2705:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2706:1: ( rule__SimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2707:1: ( rule__SimpleMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2707:2: rule__SimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl5559);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2717:1: rule__SimpleMember__Group__1 : rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 ;
    public final void rule__SimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2721:1: ( rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2722:2: rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__15589);
            rule__SimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__15592);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2729:1: rule__SimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2733:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2734:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2734:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2735:1: ':'
            {
             before(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__SimpleMember__Group__1__Impl5620); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2748:1: rule__SimpleMember__Group__2 : rule__SimpleMember__Group__2__Impl ;
    public final void rule__SimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2752:1: ( rule__SimpleMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2753:2: rule__SimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__25651);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2759:1: rule__SimpleMember__Group__2__Impl : ( ( rule__SimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__SimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2763:1: ( ( ( rule__SimpleMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2764:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2764:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2765:1: ( rule__SimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2766:1: ( rule__SimpleMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2766:2: rule__SimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl5678);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2782:1: rule__GenericListType__Group__0 : rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 ;
    public final void rule__GenericListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2786:1: ( rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2787:2: rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__05714);
            rule__GenericListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__05717);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2794:1: rule__GenericListType__Group__0__Impl : ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) ;
    public final void rule__GenericListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2798:1: ( ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2799:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2799:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2800:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2801:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2801:2: rule__GenericListType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl5744);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2811:1: rule__GenericListType__Group__1 : rule__GenericListType__Group__1__Impl ;
    public final void rule__GenericListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2815:1: ( rule__GenericListType__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2816:2: rule__GenericListType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__15774);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2822:1: rule__GenericListType__Group__1__Impl : ( ( rule__GenericListType__IdAssignment_1 ) ) ;
    public final void rule__GenericListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2826:1: ( ( ( rule__GenericListType__IdAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2827:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2827:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2828:1: ( rule__GenericListType__IdAssignment_1 )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2829:1: ( rule__GenericListType__IdAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2829:2: rule__GenericListType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl5801);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2843:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2847:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2848:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__05835);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__05838);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2855:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2859:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2860:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2860:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2861:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2862:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2862:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl5865);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2872:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2876:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2877:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__15895);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__15898);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2884:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2888:1: ( ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2889:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2889:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2890:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2891:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2891:2: rule__ComplexTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl5925);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2901:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2905:1: ( rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2906:2: rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__25956);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__25959);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2913:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2917:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2918:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2918:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2919:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2920:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2920:2: rule__ComplexTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl5986);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2930:1: rule__ComplexTypeDeclaration__Group__3 : rule__ComplexTypeDeclaration__Group__3__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2934:1: ( rule__ComplexTypeDeclaration__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2935:2: rule__ComplexTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__36016);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2941:1: rule__ComplexTypeDeclaration__Group__3__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2945:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2946:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2946:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2947:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2948:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2948:2: rule__ComplexTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl6043);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2966:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2970:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2971:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__06082);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__06085);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2978:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2982:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2983:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2983:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2984:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2985:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2985:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl6112);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2995:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2999:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3000:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__16142);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__16145);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3007:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3011:1: ( ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3012:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3012:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3013:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3014:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3014:2: rule__EnumTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl6172);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3024:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3028:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3029:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__26203);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__26206);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3036:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3040:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3041:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3041:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3042:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3043:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3043:2: rule__EnumTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl6233);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3053:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3057:1: ( rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3058:2: rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__36263);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__36266);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3065:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3069:1: ( ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3070:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3070:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3071:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3072:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3072:2: rule__EnumTypeDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl6293);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3082:1: rule__EnumTypeDeclaration__Group__4 : rule__EnumTypeDeclaration__Group__4__Impl ;
    public final void rule__EnumTypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3086:1: ( rule__EnumTypeDeclaration__Group__4__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3087:2: rule__EnumTypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__46324);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3093:1: rule__EnumTypeDeclaration__Group__4__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3097:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3098:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3098:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3099:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3100:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3100:2: rule__EnumTypeDeclaration__LiteralAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl6351);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3120:1: rule__EnumTypeDeclaration__Group_3__0 : rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 ;
    public final void rule__EnumTypeDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3124:1: ( rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3125:2: rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__06392);
            rule__EnumTypeDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__06395);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3132:1: rule__EnumTypeDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3136:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3137:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3137:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3138:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__EnumTypeDeclaration__Group_3__0__Impl6423); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3151:1: rule__EnumTypeDeclaration__Group_3__1 : rule__EnumTypeDeclaration__Group_3__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3155:1: ( rule__EnumTypeDeclaration__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3156:2: rule__EnumTypeDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__16454);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3162:1: rule__EnumTypeDeclaration__Group_3__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3166:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3167:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3167:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3168:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3169:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3169:2: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl6481);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3183:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3187:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3188:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__06515);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__06518);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3195:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3199:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3200:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3200:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3201:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__EnumTypeLiteral__Group__0__Impl6546); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3214:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3218:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3219:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__16577);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__16580);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3226:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3230:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3231:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3231:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3232:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3233:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3233:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl6607);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3243:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3247:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3248:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__26637);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__26640);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3255:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3259:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3260:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3260:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3261:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3262:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3262:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl6667);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3272:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3276:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3277:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__36698);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3283:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3287:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3288:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3288:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3289:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__EnumTypeLiteral__Group__3__Impl6726); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3310:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3314:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3315:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__06765);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__06768);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3322:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3326:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3327:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3327:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3328:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumTypeLiteral__Group_2__0__Impl6796); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3341:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3345:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3346:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__16827);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3352:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3356:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3357:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3357:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3358:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3359:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3359:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl6854);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3373:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3377:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3378:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__06888);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__06891);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3385:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3389:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3390:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3390:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3391:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3392:1: ( rule__EnumMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3392:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl6918);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3402:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3406:1: ( rule__EnumMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3407:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__16948);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3413:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3417:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3418:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3418:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3419:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3420:1: ( rule__EnumMember__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3420:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl6975);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3434:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3438:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3439:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07010);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07013);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3446:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3450:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3451:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3451:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3452:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3453:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3453:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7040);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3463:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3467:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3468:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__17070);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3474:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3478:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3479:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3479:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3480:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3481:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3481:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl7097);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3495:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3499:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3500:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__07131);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__07134);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3507:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3511:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3512:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3512:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3513:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ComplexTypeLiteral__Group__0__Impl7162); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3530:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3531:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__17193);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__17196);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3538:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3542:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3543:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3543:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3544:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3545:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3545:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl7223);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3555:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3559:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3560:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__27253);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__27256);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3567:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3571:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3572:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3572:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3573:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3574:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3574:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl7283);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3584:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3588:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3589:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__37314);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3595:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3599:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3600:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3600:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3601:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__ComplexTypeLiteral__Group__3__Impl7342); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3622:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3626:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3627:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__07381);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__07384);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3634:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3638:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3639:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3639:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3640:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__ComplexTypeLiteral__Group_2__0__Impl7412); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3653:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3657:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3658:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__17443);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3664:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3668:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3669:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3669:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3670:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3671:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3671:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl7470);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3685:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3689:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3690:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__07504);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__07507);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3697:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3701:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3702:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3702:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3703:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl7534); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3714:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3718:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3719:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__17563);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3725:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3729:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3730:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3730:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3731:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3732:1: ( rule__FQN__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3732:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl7590);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3746:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3750:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3751:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__07625);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__07628);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3758:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3762:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3763:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3763:1: ( '.' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3764:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__FQN__Group_1__0__Impl7656); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3777:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3781:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3782:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__17687);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3788:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3792:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3793:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3793:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3794:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl7714); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3810:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3814:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3815:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3815:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3816:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_17752);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3825:1: rule__Model__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3829:1: ( ( ruleDeclaration ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3830:1: ( ruleDeclaration )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3830:1: ( ruleDeclaration )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3831:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_27783);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3840:1: rule__Client__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Client__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3844:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3845:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3845:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3846:1: RULE_ID
            {
             before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Client__NameAssignment_17814); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3855:1: rule__Client__BaseUrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Client__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3859:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3860:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3860:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3861:1: RULE_STRING
            {
             before(grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_27845); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3870:1: rule__Client__BlocksAssignment_4 : ( ruleClientBlock ) ;
    public final void rule__Client__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3874:1: ( ( ruleClientBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3875:1: ( ruleClientBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3875:1: ( ruleClientBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3876:1: ruleClientBlock
            {
             before(grammarAccess.getClientAccess().getBlocksClientBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleClientBlock_in_rule__Client__BlocksAssignment_47876);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3885:1: rule__HeaderBlock__HeadersAssignment_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3889:1: ( ( ruleHeader ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3890:1: ( ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3890:1: ( ruleHeader )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3891:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_17907);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3900:1: rule__HeaderBlock__HeadersAssignment_2_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3904:1: ( ( ruleHeader ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3905:1: ( ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3905:1: ( ruleHeader )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3906:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_17938);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3915:1: rule__Header__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3919:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3920:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3920:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3921:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_07969); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3930:1: rule__Header__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3934:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3936:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_28000); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3945:1: rule__HttpMethod__TypeAssignment_0 : ( ruleHttpMethodType ) ;
    public final void rule__HttpMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3949:1: ( ( ruleHttpMethodType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3950:1: ( ruleHttpMethodType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3950:1: ( ruleHttpMethodType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3951:1: ruleHttpMethodType
            {
             before(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_08031);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3960:1: rule__HttpMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3964:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3965:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3965:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3966:1: RULE_ID
            {
             before(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_18062); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3975:1: rule__HttpMethod__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpMethod__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3979:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3980:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3980:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3981:1: RULE_STRING
            {
             before(grammarAccess.getHttpMethodAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpMethod__PathAssignment_28093); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3990:1: rule__HttpMethod__BlocksAssignment_4 : ( ruleHttpMethodBlock ) ;
    public final void rule__HttpMethod__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3994:1: ( ( ruleHttpMethodBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3995:1: ( ruleHttpMethodBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3995:1: ( ruleHttpMethodBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3996:1: ruleHttpMethodBlock
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_48124);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4005:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleSimpleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4009:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4010:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4010:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4011:1: ruleSimpleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_28155);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4020:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleSimpleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4024:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4025:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4025:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4026:1: ruleSimpleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_3_18186);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4035:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4039:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4040:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4040:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4041:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_18217);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4050:1: rule__ResponseBlock__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4054:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4055:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4055:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4056:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4057:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4058:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_18252); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4069:1: rule__ResponseBlock__TypeAssignment_3 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4073:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4074:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4074:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4075:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_38287);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4084:1: rule__TypedMember__NameAssignment_0 : ( ( rule__TypedMember__NameAlternatives_0_0 ) ) ;
    public final void rule__TypedMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4088:1: ( ( ( rule__TypedMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4089:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4089:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4090:1: ( rule__TypedMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4091:1: ( rule__TypedMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4091:2: rule__TypedMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_08318);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4100:1: rule__TypedMember__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__TypedMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4104:1: ( ( ruleType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4105:1: ( ruleType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4105:1: ( ruleType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4106:1: ruleType
            {
             before(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_28351);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4115:1: rule__SkipMember__NameAssignment_0 : ( ( rule__SkipMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SkipMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4119:1: ( ( ( rule__SkipMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4120:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4120:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4121:1: ( rule__SkipMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4122:1: ( rule__SkipMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4122:2: rule__SkipMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_08382);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4131:1: rule__SkipMember__LiteralAssignment_1 : ( ruleComplexTypeLiteral ) ;
    public final void rule__SkipMember__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4135:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4136:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4136:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4137:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_18415);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4146:1: rule__SimpleMember__NameAssignment_0 : ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4150:1: ( ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4151:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4151:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4152:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4153:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4153:2: rule__SimpleMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_08446);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4162:1: rule__SimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__SimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4166:1: ( ( ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4167:1: ( ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4167:1: ( ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4168:1: ruleIntrinsicType
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_28479);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4177:1: rule__GenericListType__ElementTypeAssignment_0 : ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__GenericListType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4181:1: ( ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4182:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4182:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4183:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4184:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4184:2: rule__GenericListType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_08510);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4193:1: rule__GenericListType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__GenericListType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4197:1: ( ( ( '[]' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4198:1: ( ( '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4198:1: ( ( '[]' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4199:1: ( '[]' )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4200:1: ( '[]' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4201:1: '[]'
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__GenericListType__IdAssignment_18548); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4216:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4220:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4221:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4221:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4222:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4223:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4224:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment8591); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4235:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4239:1: ( ( ( 'entity' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4240:1: ( ( 'entity' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4240:1: ( ( 'entity' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4241:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4242:1: ( 'entity' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4243:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__ComplexTypeDeclaration__KeywordAssignment_08631); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4258:1: rule__ComplexTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__ComplexTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4262:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4263:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4263:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4264:1: ( 'generate' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4265:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4266:1: 'generate'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__ComplexTypeDeclaration__GenAssignment_18675); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4281:1: rule__ComplexTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4285:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4286:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4286:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4287:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_28714); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4296:1: rule__ComplexTypeDeclaration__LiteralAssignment_3 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4300:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4301:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4301:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4302:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_38745);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4311:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4315:1: ( ( ( 'enum' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4316:1: ( ( 'enum' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4316:1: ( ( 'enum' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4317:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4318:1: ( 'enum' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4319:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__EnumTypeDeclaration__KeywordAssignment_08781); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4334:1: rule__EnumTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__EnumTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4338:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4339:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4339:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4340:1: ( 'generate' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4341:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4342:1: 'generate'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumTypeDeclaration__GenAssignment_18825); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4357:1: rule__EnumTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4362:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4362:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4363:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_28864); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4372:1: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4376:1: ( ( ruleIntegerType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4377:1: ( ruleIntegerType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4377:1: ( ruleIntegerType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4378:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_18895);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4387:1: rule__EnumTypeDeclaration__LiteralAssignment_4 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4391:1: ( ( ruleEnumTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4392:1: ( ruleEnumTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4392:1: ( ruleEnumTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4393:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_48926);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4402:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4407:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4407:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4408:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_18957);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4417:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4421:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4422:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4422:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4423:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_18988);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4432:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4437:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4437:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4438:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_09019); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4447:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4451:1: ( ( ( '=' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4452:1: ( ( '=' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4452:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4453:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4454:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4455:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumMember__AssignmentAssignment_1_09055); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4470:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4474:1: ( ( RULE_INT ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4475:1: ( RULE_INT )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4475:1: ( RULE_INT )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4476:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_19094); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4485:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4489:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4490:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4490:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4491:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_19125);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4500:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4504:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4505:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4505:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4506:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_19156);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4515:1: rule__StringType__IdAssignment : ( ( 'String' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4519:1: ( ( ( 'String' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4520:1: ( ( 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4520:1: ( ( 'String' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4521:1: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4522:1: ( 'String' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4523:1: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StringType__IdAssignment9192); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4538:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4542:1: ( ( ( 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4543:1: ( ( 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4543:1: ( ( 'boolean' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4544:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4545:1: ( 'boolean' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4546:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__BooleanType__IdAssignment9236); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4561:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4565:1: ( ( ( 'int' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4566:1: ( ( 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4566:1: ( ( 'int' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4567:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4568:1: ( 'int' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4569:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__IntegerType__IdAssignment9280); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4584:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4588:1: ( ( ( 'long' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4589:1: ( ( 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4589:1: ( ( 'long' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4590:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4591:1: ( 'long' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4592:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__LongType__IdAssignment9324); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4607:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4611:1: ( ( ( 'double' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4612:1: ( ( 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4612:1: ( ( 'double' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4613:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4614:1: ( 'double' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4615:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__DoubleType__IdAssignment9368); 
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


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\10\5\11\3\uffff";
    static final String DFA9_minS =
        "\1\4\6\22\3\uffff";
    static final String DFA9_maxS =
        "\1\44\6\33\3\uffff";
    static final String DFA9_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\33\uffff\1\2\1\3\1\4\1\5\1\6",
            "\3\10\1\uffff\3\10\2\uffff\1\7",
            "\3\11\1\uffff\3\11\2\uffff\1\7",
            "\3\11\1\uffff\3\11\2\uffff\1\7",
            "\3\11\1\uffff\3\11\2\uffff\1\7",
            "\3\11\1\uffff\3\11\2\uffff\1\7",
            "\3\11\1\uffff\3\11\2\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1197:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );";
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
    public static final BitSet FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rule__Declaration__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__ClientBlock__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__ClientBlock__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__ClientBlock__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HttpMethodType__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HttpMethodType__Alternatives2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpMethodType__Alternatives2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpMethodType__Alternatives2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__0__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12984 = new BitSet(new long[]{0x0000000050010000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3071 = new BitSet(new long[]{0x0000000050010002L});
    public static final BitSet FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Client__Group__0__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13170 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23230 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33291 = new BitSet(new long[]{0x00000000004C7800L});
    public static final BitSet FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Client__Group__3__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43353 = new BitSet(new long[]{0x00000000004C7800L});
    public static final BitSet FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BlocksAssignment_4_in_rule__Client__Group__4__Impl3383 = new BitSet(new long[]{0x0000000000487802L});
    public static final BitSet FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Client__Group__5__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__HeaderBlock__Group__0__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13547 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl3634 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__03671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__03674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HeaderBlock__Group_2__0__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__13733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__03794 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__03797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__13854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__13857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Header__Group__1__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__23916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__03979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14039 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24099 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34160 = new BitSet(new long[]{0x0000000001CC0000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HttpMethod__Group__3__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44222 = new BitSet(new long[]{0x0000000001CC0000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4252 = new BitSet(new long[]{0x0000000001C80002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__HttpMethod__Group__5__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__04354 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__04357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__14415 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__14418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ParamsBlock__Group__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__24477 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__24480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl4507 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__34538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl4565 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__04604 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__04607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParamsBlock__Group_3__0__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__04727 = new BitSet(new long[]{0x0000001F00020010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__04730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BodyBlock__Group__0__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__04850 = new BitSet(new long[]{0x0000000001C80000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__04853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__14911 = new BitSet(new long[]{0x0000001F02020010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ResponseBlock__Group__1__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__24973 = new BitSet(new long[]{0x0000001F02020010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__24976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__35034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__05100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__05103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ResponseBlock__Group_2__0__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__15162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__05223 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__05226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__15283 = new BitSet(new long[]{0x0000001F00000010L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__15286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypedMember__Group__1__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__25345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__05408 = new BitSet(new long[]{0x0000001F00020010L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__05411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__15468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__05529 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__05532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__15589 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__15592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleMember__Group__1__Impl5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__25651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__05714 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__05717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__15774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__05835 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__15895 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__25956 = new BitSet(new long[]{0x0000001F00020010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__25959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__36016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__06082 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__06085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__16142 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__16145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__26203 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__26206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__36263 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__36266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__46324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__06392 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__06395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumTypeDeclaration__Group_3__0__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__16454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__06515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__06518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumTypeLiteral__Group__0__Impl6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__16577 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__16580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__26637 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__26640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl6667 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__36698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumTypeLiteral__Group__3__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__06765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__06768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumTypeLiteral__Group_2__0__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__16827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__06888 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__06891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__16948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07010 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__07131 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__07134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComplexTypeLiteral__Group__0__Impl7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__17193 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__27253 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__27256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl7283 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__37314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComplexTypeLiteral__Group__3__Impl7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__07381 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__07384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexTypeLiteral__Group_2__0__Impl7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__17443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__07504 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__07507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__17563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl7590 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__07625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__07628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FQN__Group_1__0__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__17687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_17752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_27783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Client__NameAssignment_17814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_27845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientBlock_in_rule__Client__BlocksAssignment_47876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_17907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_17938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_07969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_28000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_08031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpMethod__PathAssignment_28093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_48124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_28155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_3_18186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_18217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_18252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_38287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_08318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_28351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_08382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_18415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_08446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_28479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_08510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GenericListType__IdAssignment_18548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ComplexTypeDeclaration__KeywordAssignment_08631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ComplexTypeDeclaration__GenAssignment_18675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_28714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_38745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumTypeDeclaration__KeywordAssignment_08781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumTypeDeclaration__GenAssignment_18825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_28864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_18895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_48926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_18957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_18988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_09019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumMember__AssignmentAssignment_1_09055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_19094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_19125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_19156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringType__IdAssignment9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BooleanType__IdAssignment9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerType__IdAssignment9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LongType__IdAssignment9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DoubleType__IdAssignment9368 = new BitSet(new long[]{0x0000000000000002L});

}