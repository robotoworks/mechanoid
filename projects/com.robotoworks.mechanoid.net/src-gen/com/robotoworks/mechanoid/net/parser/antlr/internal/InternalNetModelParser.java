package com.robotoworks.mechanoid.net.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.robotoworks.mechanoid.net.services.NetModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNetModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'client'", "'{'", "'}'", "'post'", "'put'", "'get'", "'delete'", "'params'", "'&'", "'body'", "'response'", "'extends'", "':'", "'wrap-with'", "'List'", "'<'", "'>'", "'[]'", "'type'", "'generate'", "'enum'", "','", "'='", "'String'", "'boolean'", "'Date'", "'int'", "'long'", "'float'", "'double'", "'.'"
    };
    public static final int T__42=42;
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
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g"; }



     	private NetModelGrammarAccess grammarAccess;
     	
        public InternalNetModelParser(TokenStream input, NetModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected NetModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_declarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:84:1: ( (lv_packageName_1_0= ruleFQN ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:85:1: (lv_packageName_1_0= ruleFQN )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:85:1: (lv_packageName_1_0= ruleFQN )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:86:3: lv_packageName_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModel143);
            lv_packageName_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:102:2: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==30||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:103:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:103:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:104:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel164);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_2_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:128:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:129:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:130:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration201);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:137:1: ruleDeclaration returns [EObject current=null] : (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_UserTypeDeclaration_0 = null;

        EObject this_Client_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:140:28: ( (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:141:1: (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:141:1: (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30||LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:142:5: this_UserTypeDeclaration_0= ruleUserTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258);
                    this_UserTypeDeclaration_0=ruleUserTypeDeclaration();

                    state._fsp--;

                     
                            current = this_UserTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:152:5: this_Client_1= ruleClient
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClient_in_ruleDeclaration285);
                    this_Client_1=ruleClient();

                    state._fsp--;

                     
                            current = this_Client_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleClient"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:168:1: entryRuleClient returns [EObject current=null] : iv_ruleClient= ruleClient EOF ;
    public final EObject entryRuleClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClient = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:169:2: (iv_ruleClient= ruleClient EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:170:2: iv_ruleClient= ruleClient EOF
            {
             newCompositeNode(grammarAccess.getClientRule()); 
            pushFollow(FOLLOW_ruleClient_in_entryRuleClient320);
            iv_ruleClient=ruleClient();

            state._fsp--;

             current =iv_ruleClient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClient330); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClient"


    // $ANTLR start "ruleClient"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:177:1: ruleClient returns [EObject current=null] : (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleHttpMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_baseUrl_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:180:28: ( (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleHttpMethod ) )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:1: (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleHttpMethod ) )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:1: (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleHttpMethod ) )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:3: otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_methods_4_0= ruleHttpMethod ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleClient367); 

                	newLeafNode(otherlv_0, grammarAccess.getClientAccess().getClientKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:186:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClient384); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:203:2: ( (lv_baseUrl_2_0= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:204:1: (lv_baseUrl_2_0= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:204:1: (lv_baseUrl_2_0= RULE_STRING )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:205:3: lv_baseUrl_2_0= RULE_STRING
            {
            lv_baseUrl_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClient406); 

            			newLeafNode(lv_baseUrl_2_0, grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"baseUrl",
                    		lv_baseUrl_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClient423); 

                	newLeafNode(otherlv_3, grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:225:1: ( (lv_methods_4_0= ruleHttpMethod ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:226:1: (lv_methods_4_0= ruleHttpMethod )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:226:1: (lv_methods_4_0= ruleHttpMethod )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:227:3: lv_methods_4_0= ruleHttpMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClientAccess().getMethodsHttpMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHttpMethod_in_ruleClient444);
            	    lv_methods_4_0=ruleHttpMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClientRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_4_0, 
            	            		"HttpMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClient457); 

                	newLeafNode(otherlv_5, grammarAccess.getClientAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClient"


    // $ANTLR start "entryRuleHttpMethod"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:255:1: entryRuleHttpMethod returns [EObject current=null] : iv_ruleHttpMethod= ruleHttpMethod EOF ;
    public final EObject entryRuleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethod = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:256:2: (iv_ruleHttpMethod= ruleHttpMethod EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:257:2: iv_ruleHttpMethod= ruleHttpMethod EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod493);
            iv_ruleHttpMethod=ruleHttpMethod();

            state._fsp--;

             current =iv_ruleHttpMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpMethod"


    // $ANTLR start "ruleHttpMethod"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:264:1: ruleHttpMethod returns [EObject current=null] : (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete ) ;
    public final EObject ruleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject this_HttpPost_0 = null;

        EObject this_HttpGet_1 = null;

        EObject this_HttpPut_2 = null;

        EObject this_HttpDelete_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:267:28: ( (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:268:1: (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:268:1: (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:269:5: this_HttpPost_0= ruleHttpPost
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpPostParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHttpPost_in_ruleHttpMethod550);
                    this_HttpPost_0=ruleHttpPost();

                    state._fsp--;

                     
                            current = this_HttpPost_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:279:5: this_HttpGet_1= ruleHttpGet
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpGetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHttpGet_in_ruleHttpMethod577);
                    this_HttpGet_1=ruleHttpGet();

                    state._fsp--;

                     
                            current = this_HttpGet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:289:5: this_HttpPut_2= ruleHttpPut
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpPutParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHttpPut_in_ruleHttpMethod604);
                    this_HttpPut_2=ruleHttpPut();

                    state._fsp--;

                     
                            current = this_HttpPut_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:299:5: this_HttpDelete_3= ruleHttpDelete
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpDeleteParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleHttpDelete_in_ruleHttpMethod631);
                    this_HttpDelete_3=ruleHttpDelete();

                    state._fsp--;

                     
                            current = this_HttpDelete_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethod"


    // $ANTLR start "entryRuleHttpPost"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:315:1: entryRuleHttpPost returns [EObject current=null] : iv_ruleHttpPost= ruleHttpPost EOF ;
    public final EObject entryRuleHttpPost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpPost = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:316:2: (iv_ruleHttpPost= ruleHttpPost EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:317:2: iv_ruleHttpPost= ruleHttpPost EOF
            {
             newCompositeNode(grammarAccess.getHttpPostRule()); 
            pushFollow(FOLLOW_ruleHttpPost_in_entryRuleHttpPost666);
            iv_ruleHttpPost=ruleHttpPost();

            state._fsp--;

             current =iv_ruleHttpPost; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpPost676); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpPost"


    // $ANTLR start "ruleHttpPost"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:324:1: ruleHttpPost returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) ;
    public final EObject ruleHttpPost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_params_4_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_response_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:327:28: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:328:1: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:328:1: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:328:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHttpPost713); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpPostAccess().getPostKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:333:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpPost730); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHttpPostAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpPostRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:350:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:351:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:351:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:352:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpPost752); 

                    			newLeafNode(lv_path_2_0, grammarAccess.getHttpPostAccess().getPathSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHttpPostRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpPost770); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpPostAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:372:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:373:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:373:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:374:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPostAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpPost791);
                    lv_params_4_0=ruleParamsBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpPostRule());
                    	        }
                           		set(
                           			current, 
                           			"params",
                            		lv_params_4_0, 
                            		"ParamsBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:390:3: ( (lv_body_5_0= ruleBodyBlock ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:391:1: (lv_body_5_0= ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:391:1: (lv_body_5_0= ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:392:3: lv_body_5_0= ruleBodyBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPostAccess().getBodyBodyBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBodyBlock_in_ruleHttpPost813);
                    lv_body_5_0=ruleBodyBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpPostRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_5_0, 
                            		"BodyBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:408:3: ( (lv_response_6_0= ruleResponseBlock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:409:1: (lv_response_6_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:409:1: (lv_response_6_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:410:3: lv_response_6_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPostAccess().getResponseResponseBlockParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpPost835);
                    lv_response_6_0=ruleResponseBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpPostRule());
                    	        }
                           		set(
                           			current, 
                           			"response",
                            		lv_response_6_0, 
                            		"ResponseBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleHttpPost848); 

                	newLeafNode(otherlv_7, grammarAccess.getHttpPostAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpPost"


    // $ANTLR start "entryRuleHttpPut"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:438:1: entryRuleHttpPut returns [EObject current=null] : iv_ruleHttpPut= ruleHttpPut EOF ;
    public final EObject entryRuleHttpPut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpPut = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:439:2: (iv_ruleHttpPut= ruleHttpPut EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:440:2: iv_ruleHttpPut= ruleHttpPut EOF
            {
             newCompositeNode(grammarAccess.getHttpPutRule()); 
            pushFollow(FOLLOW_ruleHttpPut_in_entryRuleHttpPut884);
            iv_ruleHttpPut=ruleHttpPut();

            state._fsp--;

             current =iv_ruleHttpPut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpPut894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpPut"


    // $ANTLR start "ruleHttpPut"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:447:1: ruleHttpPut returns [EObject current=null] : (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) ;
    public final EObject ruleHttpPut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_params_4_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_response_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:450:28: ( (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:451:1: (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:451:1: (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:451:3: otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHttpPut931); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpPutAccess().getPutKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:455:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:456:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:456:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:457:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpPut948); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHttpPutAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpPutRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:473:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:474:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:474:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:475:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpPut970); 

                    			newLeafNode(lv_path_2_0, grammarAccess.getHttpPutAccess().getPathSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHttpPutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpPut988); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpPutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:495:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:496:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:496:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:497:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPutAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpPut1009);
                    lv_params_4_0=ruleParamsBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpPutRule());
                    	        }
                           		set(
                           			current, 
                           			"params",
                            		lv_params_4_0, 
                            		"ParamsBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:513:3: ( (lv_body_5_0= ruleBodyBlock ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:514:1: (lv_body_5_0= ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:514:1: (lv_body_5_0= ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:515:3: lv_body_5_0= ruleBodyBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPutAccess().getBodyBodyBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBodyBlock_in_ruleHttpPut1031);
                    lv_body_5_0=ruleBodyBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpPutRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_5_0, 
                            		"BodyBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:531:3: ( (lv_response_6_0= ruleResponseBlock ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:532:1: (lv_response_6_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:532:1: (lv_response_6_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:533:3: lv_response_6_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPutAccess().getResponseResponseBlockParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpPut1053);
                    lv_response_6_0=ruleResponseBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpPutRule());
                    	        }
                           		set(
                           			current, 
                           			"response",
                            		lv_response_6_0, 
                            		"ResponseBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleHttpPut1066); 

                	newLeafNode(otherlv_7, grammarAccess.getHttpPutAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpPut"


    // $ANTLR start "entryRuleHttpGet"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:561:1: entryRuleHttpGet returns [EObject current=null] : iv_ruleHttpGet= ruleHttpGet EOF ;
    public final EObject entryRuleHttpGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpGet = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:562:2: (iv_ruleHttpGet= ruleHttpGet EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:563:2: iv_ruleHttpGet= ruleHttpGet EOF
            {
             newCompositeNode(grammarAccess.getHttpGetRule()); 
            pushFollow(FOLLOW_ruleHttpGet_in_entryRuleHttpGet1102);
            iv_ruleHttpGet=ruleHttpGet();

            state._fsp--;

             current =iv_ruleHttpGet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpGet1112); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpGet"


    // $ANTLR start "ruleHttpGet"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:570:1: ruleHttpGet returns [EObject current=null] : (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) ;
    public final EObject ruleHttpGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_params_4_0 = null;

        EObject lv_response_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:573:28: ( (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:574:1: (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:574:1: (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:574:3: otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleHttpGet1149); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpGetAccess().getGetKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:578:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:579:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:579:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:580:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpGet1166); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHttpGetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpGetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:596:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:597:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:597:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:598:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpGet1188); 

                    			newLeafNode(lv_path_2_0, grammarAccess.getHttpGetAccess().getPathSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHttpGetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpGet1206); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpGetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:618:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:619:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:619:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:620:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpGetAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpGet1227);
                    lv_params_4_0=ruleParamsBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpGetRule());
                    	        }
                           		set(
                           			current, 
                           			"params",
                            		lv_params_4_0, 
                            		"ParamsBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:636:3: ( (lv_response_5_0= ruleResponseBlock ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:637:1: (lv_response_5_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:637:1: (lv_response_5_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:638:3: lv_response_5_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpGetAccess().getResponseResponseBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpGet1249);
                    lv_response_5_0=ruleResponseBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpGetRule());
                    	        }
                           		set(
                           			current, 
                           			"response",
                            		lv_response_5_0, 
                            		"ResponseBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleHttpGet1262); 

                	newLeafNode(otherlv_6, grammarAccess.getHttpGetAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpGet"


    // $ANTLR start "entryRuleHttpDelete"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:666:1: entryRuleHttpDelete returns [EObject current=null] : iv_ruleHttpDelete= ruleHttpDelete EOF ;
    public final EObject entryRuleHttpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpDelete = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:667:2: (iv_ruleHttpDelete= ruleHttpDelete EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:668:2: iv_ruleHttpDelete= ruleHttpDelete EOF
            {
             newCompositeNode(grammarAccess.getHttpDeleteRule()); 
            pushFollow(FOLLOW_ruleHttpDelete_in_entryRuleHttpDelete1298);
            iv_ruleHttpDelete=ruleHttpDelete();

            state._fsp--;

             current =iv_ruleHttpDelete; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpDelete1308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpDelete"


    // $ANTLR start "ruleHttpDelete"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:675:1: ruleHttpDelete returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) ;
    public final EObject ruleHttpDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_params_4_0 = null;

        EObject lv_response_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:678:28: ( (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:679:1: (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:679:1: (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:679:3: otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleHttpDelete1345); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:683:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:684:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:684:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:685:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpDelete1362); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHttpDeleteAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpDeleteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:701:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:702:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:702:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:703:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpDelete1384); 

                    			newLeafNode(lv_path_2_0, grammarAccess.getHttpDeleteAccess().getPathSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHttpDeleteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpDelete1402); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpDeleteAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:723:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:724:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:724:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:725:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpDeleteAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpDelete1423);
                    lv_params_4_0=ruleParamsBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpDeleteRule());
                    	        }
                           		set(
                           			current, 
                           			"params",
                            		lv_params_4_0, 
                            		"ParamsBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:741:3: ( (lv_response_5_0= ruleResponseBlock ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:742:1: (lv_response_5_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:742:1: (lv_response_5_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:743:3: lv_response_5_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpDeleteAccess().getResponseResponseBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpDelete1445);
                    lv_response_5_0=ruleResponseBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpDeleteRule());
                    	        }
                           		set(
                           			current, 
                           			"response",
                            		lv_response_5_0, 
                            		"ResponseBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleHttpDelete1458); 

                	newLeafNode(otherlv_6, grammarAccess.getHttpDeleteAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpDelete"


    // $ANTLR start "entryRuleParamsBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:771:1: entryRuleParamsBlock returns [EObject current=null] : iv_ruleParamsBlock= ruleParamsBlock EOF ;
    public final EObject entryRuleParamsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamsBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:772:2: (iv_ruleParamsBlock= ruleParamsBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:773:2: iv_ruleParamsBlock= ruleParamsBlock EOF
            {
             newCompositeNode(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1494);
            iv_ruleParamsBlock=ruleParamsBlock();

            state._fsp--;

             current =iv_ruleParamsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock1504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamsBlock"


    // $ANTLR start "ruleParamsBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:780:1: ruleParamsBlock returns [EObject current=null] : (otherlv_0= 'params' ( (lv_params_1_0= ruleSimpleMember ) ) (otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) ) )* ) ;
    public final EObject ruleParamsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:783:28: ( (otherlv_0= 'params' ( (lv_params_1_0= ruleSimpleMember ) ) (otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:784:1: (otherlv_0= 'params' ( (lv_params_1_0= ruleSimpleMember ) ) (otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:784:1: (otherlv_0= 'params' ( (lv_params_1_0= ruleSimpleMember ) ) (otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:784:3: otherlv_0= 'params' ( (lv_params_1_0= ruleSimpleMember ) ) (otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleParamsBlock1541); 

                	newLeafNode(otherlv_0, grammarAccess.getParamsBlockAccess().getParamsKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:788:1: ( (lv_params_1_0= ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:789:1: (lv_params_1_0= ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:789:1: (lv_params_1_0= ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:790:3: lv_params_1_0= ruleSimpleMember
            {
             
            	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleMember_in_ruleParamsBlock1562);
            lv_params_1_0=ruleSimpleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_1_0, 
                    		"SimpleMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:806:2: (otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:806:4: otherlv_2= '&' ( (lv_params_3_0= ruleSimpleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleParamsBlock1575); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParamsBlockAccess().getAmpersandKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:810:1: ( (lv_params_3_0= ruleSimpleMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:811:1: (lv_params_3_0= ruleSimpleMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:811:1: (lv_params_3_0= ruleSimpleMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:812:3: lv_params_3_0= ruleSimpleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleMember_in_ruleParamsBlock1596);
            	    lv_params_3_0=ruleSimpleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_3_0, 
            	            		"SimpleMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamsBlock"


    // $ANTLR start "entryRuleBodyBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:836:1: entryRuleBodyBlock returns [EObject current=null] : iv_ruleBodyBlock= ruleBodyBlock EOF ;
    public final EObject entryRuleBodyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:837:2: (iv_ruleBodyBlock= ruleBodyBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:838:2: iv_ruleBodyBlock= ruleBodyBlock EOF
            {
             newCompositeNode(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock1634);
            iv_ruleBodyBlock=ruleBodyBlock();

            state._fsp--;

             current =iv_ruleBodyBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock1644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyBlock"


    // $ANTLR start "ruleBodyBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:845:1: ruleBodyBlock returns [EObject current=null] : ( ( (lv_name_0_0= 'body' ) ) ( (lv_type_1_0= ruleBlockType ) ) ) ;
    public final EObject ruleBodyBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:848:28: ( ( ( (lv_name_0_0= 'body' ) ) ( (lv_type_1_0= ruleBlockType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:849:1: ( ( (lv_name_0_0= 'body' ) ) ( (lv_type_1_0= ruleBlockType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:849:1: ( ( (lv_name_0_0= 'body' ) ) ( (lv_type_1_0= ruleBlockType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:849:2: ( (lv_name_0_0= 'body' ) ) ( (lv_type_1_0= ruleBlockType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:849:2: ( (lv_name_0_0= 'body' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:850:1: (lv_name_0_0= 'body' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:850:1: (lv_name_0_0= 'body' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:851:3: lv_name_0_0= 'body'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_21_in_ruleBodyBlock1687); 

                    newLeafNode(lv_name_0_0, grammarAccess.getBodyBlockAccess().getNameBodyKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyBlockRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "body");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:864:2: ( (lv_type_1_0= ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:865:1: (lv_type_1_0= ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:865:1: (lv_type_1_0= ruleBlockType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:866:3: lv_type_1_0= ruleBlockType
            {
             
            	        newCompositeNode(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlockType_in_ruleBodyBlock1721);
            lv_type_1_0=ruleBlockType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyBlockRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"BlockType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyBlock"


    // $ANTLR start "entryRuleResponseBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:890:1: entryRuleResponseBlock returns [EObject current=null] : iv_ruleResponseBlock= ruleResponseBlock EOF ;
    public final EObject entryRuleResponseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:891:2: (iv_ruleResponseBlock= ruleResponseBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:892:2: iv_ruleResponseBlock= ruleResponseBlock EOF
            {
             newCompositeNode(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock1757);
            iv_ruleResponseBlock=ruleResponseBlock();

            state._fsp--;

             current =iv_ruleResponseBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock1767); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponseBlock"


    // $ANTLR start "ruleResponseBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:899:1: ruleResponseBlock returns [EObject current=null] : ( ( (lv_name_0_0= 'response' ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_type_3_0= ruleBlockType ) )? ) ;
    public final EObject ruleResponseBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:902:28: ( ( ( (lv_name_0_0= 'response' ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_type_3_0= ruleBlockType ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:903:1: ( ( (lv_name_0_0= 'response' ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_type_3_0= ruleBlockType ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:903:1: ( ( (lv_name_0_0= 'response' ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_type_3_0= ruleBlockType ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:903:2: ( (lv_name_0_0= 'response' ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_type_3_0= ruleBlockType ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:903:2: ( (lv_name_0_0= 'response' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:904:1: (lv_name_0_0= 'response' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:904:1: (lv_name_0_0= 'response' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:905:3: lv_name_0_0= 'response'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_22_in_ruleResponseBlock1810); 

                    newLeafNode(lv_name_0_0, grammarAccess.getResponseBlockAccess().getNameResponseKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResponseBlockRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "response");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:918:2: (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:918:4: otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleResponseBlock1836); 

                        	newLeafNode(otherlv_1, grammarAccess.getResponseBlockAccess().getExtendsKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:922:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:923:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:923:1: (otherlv_2= RULE_ID )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:924:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResponseBlock1856); 

                    		newLeafNode(otherlv_2, grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:935:4: ( (lv_type_3_0= ruleBlockType ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==13||LA21_0==26||(LA21_0>=35 && LA21_0<=41)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:936:1: (lv_type_3_0= ruleBlockType )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:936:1: (lv_type_3_0= ruleBlockType )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:937:3: lv_type_3_0= ruleBlockType
                    {
                     
                    	        newCompositeNode(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockType_in_ruleResponseBlock1879);
                    lv_type_3_0=ruleBlockType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResponseBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"BlockType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponseBlock"


    // $ANTLR start "entryRuleBlockType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:961:1: entryRuleBlockType returns [EObject current=null] : iv_ruleBlockType= ruleBlockType EOF ;
    public final EObject entryRuleBlockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:962:2: (iv_ruleBlockType= ruleBlockType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:963:2: iv_ruleBlockType= ruleBlockType EOF
            {
             newCompositeNode(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType1916);
            iv_ruleBlockType=ruleBlockType();

            state._fsp--;

             current =iv_ruleBlockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType1926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockType"


    // $ANTLR start "ruleBlockType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:970:1: ruleBlockType returns [EObject current=null] : (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) ;
    public final EObject ruleBlockType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ComplexTypeLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:973:28: ( (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:974:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:974:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==26||(LA22_0>=35 && LA22_0<=41)) ) {
                alt22=1;
            }
            else if ( (LA22_0==13) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:975:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleBlockType1973);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:985:5: this_ComplexTypeLiteral_1= ruleComplexTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2000);
                    this_ComplexTypeLiteral_1=ruleComplexTypeLiteral();

                    state._fsp--;

                     
                            current = this_ComplexTypeLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockType"


    // $ANTLR start "entryRuleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1001:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1002:2: (iv_ruleMember= ruleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1003:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2035);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1010:1: ruleMember returns [EObject current=null] : (this_TypedMember_0= ruleTypedMember | this_WrapWithMember_1= ruleWrapWithMember ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_TypedMember_0 = null;

        EObject this_WrapWithMember_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1013:28: ( (this_TypedMember_0= ruleTypedMember | this_WrapWithMember_1= ruleWrapWithMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1014:1: (this_TypedMember_0= ruleTypedMember | this_WrapWithMember_1= ruleWrapWithMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1014:1: (this_TypedMember_0= ruleTypedMember | this_WrapWithMember_1= ruleWrapWithMember )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            else if ( (LA23_0==25) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1015:5: this_TypedMember_0= ruleTypedMember
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypedMember_in_ruleMember2092);
                    this_TypedMember_0=ruleTypedMember();

                    state._fsp--;

                     
                            current = this_TypedMember_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1025:5: this_WrapWithMember_1= ruleWrapWithMember
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getWrapWithMemberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWrapWithMember_in_ruleMember2119);
                    this_WrapWithMember_1=ruleWrapWithMember();

                    state._fsp--;

                     
                            current = this_WrapWithMember_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleTypedMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1041:1: entryRuleTypedMember returns [EObject current=null] : iv_ruleTypedMember= ruleTypedMember EOF ;
    public final EObject entryRuleTypedMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1042:2: (iv_ruleTypedMember= ruleTypedMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1043:2: iv_ruleTypedMember= ruleTypedMember EOF
            {
             newCompositeNode(grammarAccess.getTypedMemberRule()); 
            pushFollow(FOLLOW_ruleTypedMember_in_entryRuleTypedMember2154);
            iv_ruleTypedMember=ruleTypedMember();

            state._fsp--;

             current =iv_ruleTypedMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedMember2164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedMember"


    // $ANTLR start "ruleTypedMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1050:1: ruleTypedMember returns [EObject current=null] : (this_IDNamedMember_0= ruleIDNamedMember | this_StringNamedMember_1= ruleStringNamedMember ) ;
    public final EObject ruleTypedMember() throws RecognitionException {
        EObject current = null;

        EObject this_IDNamedMember_0 = null;

        EObject this_StringNamedMember_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1053:28: ( (this_IDNamedMember_0= ruleIDNamedMember | this_StringNamedMember_1= ruleStringNamedMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1054:1: (this_IDNamedMember_0= ruleIDNamedMember | this_StringNamedMember_1= ruleStringNamedMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1054:1: (this_IDNamedMember_0= ruleIDNamedMember | this_StringNamedMember_1= ruleStringNamedMember )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1055:5: this_IDNamedMember_0= ruleIDNamedMember
                    {
                     
                            newCompositeNode(grammarAccess.getTypedMemberAccess().getIDNamedMemberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDNamedMember_in_ruleTypedMember2211);
                    this_IDNamedMember_0=ruleIDNamedMember();

                    state._fsp--;

                     
                            current = this_IDNamedMember_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1065:5: this_StringNamedMember_1= ruleStringNamedMember
                    {
                     
                            newCompositeNode(grammarAccess.getTypedMemberAccess().getStringNamedMemberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringNamedMember_in_ruleTypedMember2238);
                    this_StringNamedMember_1=ruleStringNamedMember();

                    state._fsp--;

                     
                            current = this_StringNamedMember_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedMember"


    // $ANTLR start "entryRuleIDNamedMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1081:1: entryRuleIDNamedMember returns [EObject current=null] : iv_ruleIDNamedMember= ruleIDNamedMember EOF ;
    public final EObject entryRuleIDNamedMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDNamedMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1082:2: (iv_ruleIDNamedMember= ruleIDNamedMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1083:2: iv_ruleIDNamedMember= ruleIDNamedMember EOF
            {
             newCompositeNode(grammarAccess.getIDNamedMemberRule()); 
            pushFollow(FOLLOW_ruleIDNamedMember_in_entryRuleIDNamedMember2273);
            iv_ruleIDNamedMember=ruleIDNamedMember();

            state._fsp--;

             current =iv_ruleIDNamedMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDNamedMember2283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDNamedMember"


    // $ANTLR start "ruleIDNamedMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1090:1: ruleIDNamedMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleIDNamedMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1093:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1094:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1094:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1094:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1094:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1095:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1095:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1096:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDNamedMember2325); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIDNamedMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIDNamedMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleIDNamedMember2342); 

                	newLeafNode(otherlv_1, grammarAccess.getIDNamedMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1116:1: ( (lv_type_2_0= ruleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1117:1: (lv_type_2_0= ruleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1117:1: (lv_type_2_0= ruleType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1118:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getIDNamedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleIDNamedMember2363);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIDNamedMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDNamedMember"


    // $ANTLR start "entryRuleStringNamedMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1142:1: entryRuleStringNamedMember returns [EObject current=null] : iv_ruleStringNamedMember= ruleStringNamedMember EOF ;
    public final EObject entryRuleStringNamedMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringNamedMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1143:2: (iv_ruleStringNamedMember= ruleStringNamedMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1144:2: iv_ruleStringNamedMember= ruleStringNamedMember EOF
            {
             newCompositeNode(grammarAccess.getStringNamedMemberRule()); 
            pushFollow(FOLLOW_ruleStringNamedMember_in_entryRuleStringNamedMember2399);
            iv_ruleStringNamedMember=ruleStringNamedMember();

            state._fsp--;

             current =iv_ruleStringNamedMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringNamedMember2409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringNamedMember"


    // $ANTLR start "ruleStringNamedMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1151:1: ruleStringNamedMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleStringNamedMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1154:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1155:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1155:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1155:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1155:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1156:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1156:1: (lv_name_0_0= RULE_STRING )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1157:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringNamedMember2451); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStringNamedMemberAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringNamedMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleStringNamedMember2468); 

                	newLeafNode(otherlv_1, grammarAccess.getStringNamedMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1177:1: ( (lv_type_2_0= ruleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1178:1: (lv_type_2_0= ruleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1178:1: (lv_type_2_0= ruleType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1179:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStringNamedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStringNamedMember2489);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringNamedMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringNamedMember"


    // $ANTLR start "entryRuleWrapWithMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1203:1: entryRuleWrapWithMember returns [EObject current=null] : iv_ruleWrapWithMember= ruleWrapWithMember EOF ;
    public final EObject entryRuleWrapWithMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapWithMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1204:2: (iv_ruleWrapWithMember= ruleWrapWithMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1205:2: iv_ruleWrapWithMember= ruleWrapWithMember EOF
            {
             newCompositeNode(grammarAccess.getWrapWithMemberRule()); 
            pushFollow(FOLLOW_ruleWrapWithMember_in_entryRuleWrapWithMember2525);
            iv_ruleWrapWithMember=ruleWrapWithMember();

            state._fsp--;

             current =iv_ruleWrapWithMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrapWithMember2535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrapWithMember"


    // $ANTLR start "ruleWrapWithMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1212:1: ruleWrapWithMember returns [EObject current=null] : (otherlv_0= 'wrap-with' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) ) ) ;
    public final EObject ruleWrapWithMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_literal_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1215:28: ( (otherlv_0= 'wrap-with' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:1: (otherlv_0= 'wrap-with' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:1: (otherlv_0= 'wrap-with' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:3: otherlv_0= 'wrap-with' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleWrapWithMember2572); 

                	newLeafNode(otherlv_0, grammarAccess.getWrapWithMemberAccess().getWrapWithKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1220:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1221:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1221:1: (lv_name_1_0= RULE_STRING )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1222:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWrapWithMember2589); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWrapWithMemberAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWrapWithMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1238:2: ( (lv_literal_2_0= ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1239:1: (lv_literal_2_0= ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1239:1: (lv_literal_2_0= ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1240:3: lv_literal_2_0= ruleComplexTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getWrapWithMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleWrapWithMember2615);
            lv_literal_2_0=ruleComplexTypeLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWrapWithMemberRule());
            	        }
                   		set(
                   			current, 
                   			"literal",
                    		lv_literal_2_0, 
                    		"ComplexTypeLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrapWithMember"


    // $ANTLR start "entryRuleSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1264:1: entryRuleSimpleMember returns [EObject current=null] : iv_ruleSimpleMember= ruleSimpleMember EOF ;
    public final EObject entryRuleSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1265:2: (iv_ruleSimpleMember= ruleSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1266:2: iv_ruleSimpleMember= ruleSimpleMember EOF
            {
             newCompositeNode(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2651);
            iv_ruleSimpleMember=ruleSimpleMember();

            state._fsp--;

             current =iv_ruleSimpleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember2661); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleMember"


    // $ANTLR start "ruleSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1273:1: ruleSimpleMember returns [EObject current=null] : (this_IDNamedSimpleMember_0= ruleIDNamedSimpleMember | this_StringNamedSimpleMember_1= ruleStringNamedSimpleMember ) ;
    public final EObject ruleSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject this_IDNamedSimpleMember_0 = null;

        EObject this_StringNamedSimpleMember_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1276:28: ( (this_IDNamedSimpleMember_0= ruleIDNamedSimpleMember | this_StringNamedSimpleMember_1= ruleStringNamedSimpleMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1277:1: (this_IDNamedSimpleMember_0= ruleIDNamedSimpleMember | this_StringNamedSimpleMember_1= ruleStringNamedSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1277:1: (this_IDNamedSimpleMember_0= ruleIDNamedSimpleMember | this_StringNamedSimpleMember_1= ruleStringNamedSimpleMember )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1278:5: this_IDNamedSimpleMember_0= ruleIDNamedSimpleMember
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleMemberAccess().getIDNamedSimpleMemberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDNamedSimpleMember_in_ruleSimpleMember2708);
                    this_IDNamedSimpleMember_0=ruleIDNamedSimpleMember();

                    state._fsp--;

                     
                            current = this_IDNamedSimpleMember_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1288:5: this_StringNamedSimpleMember_1= ruleStringNamedSimpleMember
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleMemberAccess().getStringNamedSimpleMemberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringNamedSimpleMember_in_ruleSimpleMember2735);
                    this_StringNamedSimpleMember_1=ruleStringNamedSimpleMember();

                    state._fsp--;

                     
                            current = this_StringNamedSimpleMember_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleMember"


    // $ANTLR start "entryRuleIDNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1304:1: entryRuleIDNamedSimpleMember returns [EObject current=null] : iv_ruleIDNamedSimpleMember= ruleIDNamedSimpleMember EOF ;
    public final EObject entryRuleIDNamedSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDNamedSimpleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1305:2: (iv_ruleIDNamedSimpleMember= ruleIDNamedSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1306:2: iv_ruleIDNamedSimpleMember= ruleIDNamedSimpleMember EOF
            {
             newCompositeNode(grammarAccess.getIDNamedSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleIDNamedSimpleMember_in_entryRuleIDNamedSimpleMember2770);
            iv_ruleIDNamedSimpleMember=ruleIDNamedSimpleMember();

            state._fsp--;

             current =iv_ruleIDNamedSimpleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDNamedSimpleMember2780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDNamedSimpleMember"


    // $ANTLR start "ruleIDNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1313:1: ruleIDNamedSimpleMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) ;
    public final EObject ruleIDNamedSimpleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1316:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1317:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1317:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1317:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1317:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1318:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1318:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1319:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDNamedSimpleMember2822); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIDNamedSimpleMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIDNamedSimpleMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleIDNamedSimpleMember2839); 

                	newLeafNode(otherlv_1, grammarAccess.getIDNamedSimpleMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1339:1: ( (lv_type_2_0= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1340:1: (lv_type_2_0= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1340:1: (lv_type_2_0= ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1341:3: lv_type_2_0= ruleIntrinsicType
            {
             
            	        newCompositeNode(grammarAccess.getIDNamedSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntrinsicType_in_ruleIDNamedSimpleMember2860);
            lv_type_2_0=ruleIntrinsicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIDNamedSimpleMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"IntrinsicType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDNamedSimpleMember"


    // $ANTLR start "entryRuleStringNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1365:1: entryRuleStringNamedSimpleMember returns [EObject current=null] : iv_ruleStringNamedSimpleMember= ruleStringNamedSimpleMember EOF ;
    public final EObject entryRuleStringNamedSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringNamedSimpleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1366:2: (iv_ruleStringNamedSimpleMember= ruleStringNamedSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1367:2: iv_ruleStringNamedSimpleMember= ruleStringNamedSimpleMember EOF
            {
             newCompositeNode(grammarAccess.getStringNamedSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleStringNamedSimpleMember_in_entryRuleStringNamedSimpleMember2896);
            iv_ruleStringNamedSimpleMember=ruleStringNamedSimpleMember();

            state._fsp--;

             current =iv_ruleStringNamedSimpleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringNamedSimpleMember2906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringNamedSimpleMember"


    // $ANTLR start "ruleStringNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1374:1: ruleStringNamedSimpleMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) ;
    public final EObject ruleStringNamedSimpleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1377:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1378:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1378:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1378:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1378:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1379:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1379:1: (lv_name_0_0= RULE_STRING )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1380:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringNamedSimpleMember2948); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStringNamedSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringNamedSimpleMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleStringNamedSimpleMember2965); 

                	newLeafNode(otherlv_1, grammarAccess.getStringNamedSimpleMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1400:1: ( (lv_type_2_0= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1401:1: (lv_type_2_0= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1401:1: (lv_type_2_0= ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1402:3: lv_type_2_0= ruleIntrinsicType
            {
             
            	        newCompositeNode(grammarAccess.getStringNamedSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntrinsicType_in_ruleStringNamedSimpleMember2986);
            lv_type_2_0=ruleIntrinsicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringNamedSimpleMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"IntrinsicType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringNamedSimpleMember"


    // $ANTLR start "entryRuleType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1426:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1427:2: (iv_ruleType= ruleType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1428:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3022);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1435:1: ruleType returns [EObject current=null] : (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType | this_ArrayType_3= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_UserType_0 = null;

        EObject this_IntrinsicType_1 = null;

        EObject this_GenericListType_2 = null;

        EObject this_ArrayType_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1438:28: ( (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType | this_ArrayType_3= ruleArrayType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1439:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType | this_ArrayType_3= ruleArrayType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1439:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType | this_ArrayType_3= ruleArrayType )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1440:5: this_UserType_0= ruleUserType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserType_in_ruleType3079);
                    this_UserType_0=ruleUserType();

                    state._fsp--;

                     
                            current = this_UserType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1450:5: this_IntrinsicType_1= ruleIntrinsicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleType3106);
                    this_IntrinsicType_1=ruleIntrinsicType();

                    state._fsp--;

                     
                            current = this_IntrinsicType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1460:5: this_GenericListType_2= ruleGenericListType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGenericListType_in_ruleType3133);
                    this_GenericListType_2=ruleGenericListType();

                    state._fsp--;

                     
                            current = this_GenericListType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1470:5: this_ArrayType_3= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType3160);
                    this_ArrayType_3=ruleArrayType();

                    state._fsp--;

                     
                            current = this_ArrayType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleGenericListType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1486:1: entryRuleGenericListType returns [EObject current=null] : iv_ruleGenericListType= ruleGenericListType EOF ;
    public final EObject entryRuleGenericListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericListType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1487:2: (iv_ruleGenericListType= ruleGenericListType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1488:2: iv_ruleGenericListType= ruleGenericListType EOF
            {
             newCompositeNode(grammarAccess.getGenericListTypeRule()); 
            pushFollow(FOLLOW_ruleGenericListType_in_entryRuleGenericListType3195);
            iv_ruleGenericListType=ruleGenericListType();

            state._fsp--;

             current =iv_ruleGenericListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListType3205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericListType"


    // $ANTLR start "ruleGenericListType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1495:1: ruleGenericListType returns [EObject current=null] : ( ( (lv_id_0_0= 'List' ) ) otherlv_1= '<' ( ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) ) ) otherlv_3= '>' ) ;
    public final EObject ruleGenericListType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_genericType_2_1 = null;

        EObject lv_genericType_2_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1498:28: ( ( ( (lv_id_0_0= 'List' ) ) otherlv_1= '<' ( ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) ) ) otherlv_3= '>' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1499:1: ( ( (lv_id_0_0= 'List' ) ) otherlv_1= '<' ( ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) ) ) otherlv_3= '>' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1499:1: ( ( (lv_id_0_0= 'List' ) ) otherlv_1= '<' ( ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) ) ) otherlv_3= '>' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1499:2: ( (lv_id_0_0= 'List' ) ) otherlv_1= '<' ( ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) ) ) otherlv_3= '>'
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1499:2: ( (lv_id_0_0= 'List' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1500:1: (lv_id_0_0= 'List' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1500:1: (lv_id_0_0= 'List' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1501:3: lv_id_0_0= 'List'
            {
            lv_id_0_0=(Token)match(input,26,FOLLOW_26_in_ruleGenericListType3248); 

                    newLeafNode(lv_id_0_0, grammarAccess.getGenericListTypeAccess().getIdListKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenericListTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "List");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleGenericListType3273); 

                	newLeafNode(otherlv_1, grammarAccess.getGenericListTypeAccess().getLessThanSignKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1518:1: ( ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1519:1: ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1519:1: ( (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1520:1: (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1520:1: (lv_genericType_2_1= ruleUserType | lv_genericType_2_2= ruleIntrinsicType )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=35 && LA27_0<=41)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1521:3: lv_genericType_2_1= ruleUserType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericListTypeAccess().getGenericTypeUserTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserType_in_ruleGenericListType3296);
                    lv_genericType_2_1=ruleUserType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericListTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"genericType",
                            		lv_genericType_2_1, 
                            		"UserType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1536:8: lv_genericType_2_2= ruleIntrinsicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericListTypeAccess().getGenericTypeIntrinsicTypeParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleGenericListType3315);
                    lv_genericType_2_2=ruleIntrinsicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericListTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"genericType",
                            		lv_genericType_2_2, 
                            		"IntrinsicType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleGenericListType3330); 

                	newLeafNode(otherlv_3, grammarAccess.getGenericListTypeAccess().getGreaterThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericListType"


    // $ANTLR start "entryRuleArrayType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1566:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1567:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1568:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType3366);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType3376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1575:1: ruleArrayType returns [EObject current=null] : ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_elementType_0_1 = null;

        EObject lv_elementType_0_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1578:28: ( ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1579:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1579:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1579:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1579:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1580:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1580:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1581:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1581:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=35 && LA28_0<=41)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1582:3: lv_elementType_0_1= ruleUserType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserType_in_ruleArrayType3424);
                    lv_elementType_0_1=ruleUserType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_0_1, 
                            		"UserType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1597:8: lv_elementType_0_2= ruleIntrinsicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleArrayType3443);
                    lv_elementType_0_2=ruleIntrinsicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_0_2, 
                            		"IntrinsicType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1615:2: ( (lv_id_1_0= '[]' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1616:1: (lv_id_1_0= '[]' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1616:1: (lv_id_1_0= '[]' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1617:3: lv_id_1_0= '[]'
            {
            lv_id_1_0=(Token)match(input,29,FOLLOW_29_in_ruleArrayType3464); 

                    newLeafNode(lv_id_1_0, grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArrayTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_1_0, "[]");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleUserType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1638:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1639:2: (iv_ruleUserType= ruleUserType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1640:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType3513);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType3523); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserType"


    // $ANTLR start "ruleUserType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1647:1: ruleUserType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1650:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1651:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1651:1: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1652:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1652:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1653:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserType3567); 

            		newLeafNode(otherlv_0, grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserType"


    // $ANTLR start "entryRuleUserTypeDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1672:1: entryRuleUserTypeDeclaration returns [EObject current=null] : iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF ;
    public final EObject entryRuleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1673:2: (iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1674:2: iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration3602);
            iv_ruleUserTypeDeclaration=ruleUserTypeDeclaration();

            state._fsp--;

             current =iv_ruleUserTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration3612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserTypeDeclaration"


    // $ANTLR start "ruleUserTypeDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1681:1: ruleUserTypeDeclaration returns [EObject current=null] : (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) ;
    public final EObject ruleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexTypeDeclaration_0 = null;

        EObject this_EnumTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1684:28: ( (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1685:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1685:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1686:5: this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3659);
                    this_ComplexTypeDeclaration_0=ruleComplexTypeDeclaration();

                    state._fsp--;

                     
                            current = this_ComplexTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1696:5: this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3686);
                    this_EnumTypeDeclaration_1=ruleEnumTypeDeclaration();

                    state._fsp--;

                     
                            current = this_EnumTypeDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserTypeDeclaration"


    // $ANTLR start "entryRuleComplexTypeDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1712:1: entryRuleComplexTypeDeclaration returns [EObject current=null] : iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF ;
    public final EObject entryRuleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1713:2: (iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1714:2: iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3721);
            iv_ruleComplexTypeDeclaration=ruleComplexTypeDeclaration();

            state._fsp--;

             current =iv_ruleComplexTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexTypeDeclaration"


    // $ANTLR start "ruleComplexTypeDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1721:1: ruleComplexTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'type' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) ;
    public final EObject ruleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_gen_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1724:28: ( ( ( (lv_keyword_0_0= 'type' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1725:1: ( ( (lv_keyword_0_0= 'type' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1725:1: ( ( (lv_keyword_0_0= 'type' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1725:2: ( (lv_keyword_0_0= 'type' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1725:2: ( (lv_keyword_0_0= 'type' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1726:1: (lv_keyword_0_0= 'type' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1726:1: (lv_keyword_0_0= 'type' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1727:3: lv_keyword_0_0= 'type'
            {
            lv_keyword_0_0=(Token)match(input,30,FOLLOW_30_in_ruleComplexTypeDeclaration3774); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getComplexTypeDeclarationAccess().getKeywordTypeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "type");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1740:2: ( (lv_gen_1_0= 'generate' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1741:1: (lv_gen_1_0= 'generate' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1741:1: (lv_gen_1_0= 'generate' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1742:3: lv_gen_1_0= 'generate'
                    {
                    lv_gen_1_0=(Token)match(input,31,FOLLOW_31_in_ruleComplexTypeDeclaration3805); 

                            newLeafNode(lv_gen_1_0, grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "gen", true, "generate");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1755:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1757:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3836); 

            			newLeafNode(lv_name_2_0, grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1773:2: ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1774:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1774:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1775:3: lv_literal_3_0= ruleComplexTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3862);
                    lv_literal_3_0=ruleComplexTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_3_0, 
                            		"ComplexTypeLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1799:1: entryRuleEnumTypeDeclaration returns [EObject current=null] : iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF ;
    public final EObject entryRuleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1800:2: (iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1801:2: iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3899);
            iv_ruleEnumTypeDeclaration=ruleEnumTypeDeclaration();

            state._fsp--;

             current =iv_ruleEnumTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumTypeDeclaration"


    // $ANTLR start "ruleEnumTypeDeclaration"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1808:1: ruleEnumTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) ;
    public final EObject ruleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_gen_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_superType_4_0 = null;

        EObject lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1811:28: ( ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1812:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1812:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1812:2: ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1812:2: ( (lv_keyword_0_0= 'enum' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1813:1: (lv_keyword_0_0= 'enum' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1813:1: (lv_keyword_0_0= 'enum' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1814:3: lv_keyword_0_0= 'enum'
            {
            lv_keyword_0_0=(Token)match(input,32,FOLLOW_32_in_ruleEnumTypeDeclaration3952); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "enum");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1827:2: ( (lv_gen_1_0= 'generate' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1828:1: (lv_gen_1_0= 'generate' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1828:1: (lv_gen_1_0= 'generate' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1829:3: lv_gen_1_0= 'generate'
                    {
                    lv_gen_1_0=(Token)match(input,31,FOLLOW_31_in_ruleEnumTypeDeclaration3983); 

                            newLeafNode(lv_gen_1_0, grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "gen", true, "generate");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1842:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1843:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1843:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1844:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration4014); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1860:2: (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1860:4: otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleEnumTypeDeclaration4032); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1864:1: ( (lv_superType_4_0= ruleIntegerType ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1865:1: (lv_superType_4_0= ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1865:1: (lv_superType_4_0= ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1866:3: lv_superType_4_0= ruleIntegerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration4053);
                    lv_superType_4_0=ruleIntegerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"superType",
                            		lv_superType_4_0, 
                            		"IntegerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1882:4: ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==13) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1883:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1883:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1884:3: lv_literal_5_0= ruleEnumTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration4076);
                    lv_literal_5_0=ruleEnumTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_5_0, 
                            		"EnumTypeLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeLiteral"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1908:1: entryRuleEnumTypeLiteral returns [EObject current=null] : iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF ;
    public final EObject entryRuleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1909:2: (iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1910:2: iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral4113);
            iv_ruleEnumTypeLiteral=ruleEnumTypeLiteral();

            state._fsp--;

             current =iv_ruleEnumTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral4123); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumTypeLiteral"


    // $ANTLR start "ruleEnumTypeLiteral"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1917:1: ruleEnumTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1920:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1921:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1921:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1921:3: otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleEnumTypeLiteral4160); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1925:1: ( (lv_members_1_0= ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1926:1: (lv_members_1_0= ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1926:1: (lv_members_1_0= ruleEnumMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1927:3: lv_members_1_0= ruleEnumMember
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral4181);
            lv_members_1_0=ruleEnumMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumTypeLiteralRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"EnumMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1943:2: (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1943:4: otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleEnumTypeLiteral4194); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1947:1: ( (lv_members_3_0= ruleEnumMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1948:1: (lv_members_3_0= ruleEnumMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1948:1: (lv_members_3_0= ruleEnumMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1949:3: lv_members_3_0= ruleEnumMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral4215);
            	    lv_members_3_0=ruleEnumMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"EnumMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEnumTypeLiteral4229); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumTypeLiteral"


    // $ANTLR start "entryRuleEnumMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1977:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1978:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1979:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             newCompositeNode(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember4265);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember4275); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1986:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_assignment_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1989:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1990:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1990:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1990:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1990:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1991:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1991:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1992:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember4317); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2008:2: ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2008:3: ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2008:3: ( (lv_assignment_1_0= '=' ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2009:1: (lv_assignment_1_0= '=' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2009:1: (lv_assignment_1_0= '=' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2010:3: lv_assignment_1_0= '='
                    {
                    lv_assignment_1_0=(Token)match(input,34,FOLLOW_34_in_ruleEnumMember4341); 

                            newLeafNode(lv_assignment_1_0, grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(current, "assignment", true, "=");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2023:2: ( (lv_value_2_0= RULE_INT ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2024:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2024:1: (lv_value_2_0= RULE_INT )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2025:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumMember4371); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleComplexTypeLiteral"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2049:1: entryRuleComplexTypeLiteral returns [EObject current=null] : iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF ;
    public final EObject entryRuleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2050:2: (iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2051:2: iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral4414);
            iv_ruleComplexTypeLiteral=ruleComplexTypeLiteral();

            state._fsp--;

             current =iv_ruleComplexTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral4424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexTypeLiteral"


    // $ANTLR start "ruleComplexTypeLiteral"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2058:1: ruleComplexTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2061:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2062:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2062:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2062:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComplexTypeLiteral4461); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2066:1: ( (lv_members_1_0= ruleMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2067:1: (lv_members_1_0= ruleMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2067:1: (lv_members_1_0= ruleMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2068:3: lv_members_1_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral4482);
            lv_members_1_0=ruleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexTypeLiteralRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"Member");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2084:2: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2084:4: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleComplexTypeLiteral4495); 

            	        	newLeafNode(otherlv_2, grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2088:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2089:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2089:1: (lv_members_3_0= ruleMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2090:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral4516);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexTypeLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleComplexTypeLiteral4530); 

                	newLeafNode(otherlv_4, grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexTypeLiteral"


    // $ANTLR start "entryRuleIntrinsicType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2118:1: entryRuleIntrinsicType returns [EObject current=null] : iv_ruleIntrinsicType= ruleIntrinsicType EOF ;
    public final EObject entryRuleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntrinsicType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2119:2: (iv_ruleIntrinsicType= ruleIntrinsicType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2120:2: iv_ruleIntrinsicType= ruleIntrinsicType EOF
            {
             newCompositeNode(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType4566);
            iv_ruleIntrinsicType=ruleIntrinsicType();

            state._fsp--;

             current =iv_ruleIntrinsicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType4576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntrinsicType"


    // $ANTLR start "ruleIntrinsicType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2127:1: ruleIntrinsicType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_DateType_2= ruleDateType | this_NumericType_3= ruleNumericType ) ;
    public final EObject ruleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_DateType_2 = null;

        EObject this_NumericType_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2130:28: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_DateType_2= ruleDateType | this_NumericType_3= ruleNumericType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2131:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_DateType_2= ruleDateType | this_NumericType_3= ruleNumericType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2131:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_DateType_2= ruleDateType | this_NumericType_3= ruleNumericType )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt38=1;
                }
                break;
            case 36:
                {
                alt38=2;
                }
                break;
            case 37:
                {
                alt38=3;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2132:5: this_StringType_0= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleIntrinsicType4623);
                    this_StringType_0=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2142:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleIntrinsicType4650);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2152:5: this_DateType_2= ruleDateType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getDateTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDateType_in_ruleIntrinsicType4677);
                    this_DateType_2=ruleDateType();

                    state._fsp--;

                     
                            current = this_DateType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2162:5: this_NumericType_3= ruleNumericType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNumericType_in_ruleIntrinsicType4704);
                    this_NumericType_3=ruleNumericType();

                    state._fsp--;

                     
                            current = this_NumericType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntrinsicType"


    // $ANTLR start "entryRuleStringType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2178:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2179:2: (iv_ruleStringType= ruleStringType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2180:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType4739);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType4749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2187:1: ruleStringType returns [EObject current=null] : ( (lv_id_0_0= 'String' ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2190:28: ( ( (lv_id_0_0= 'String' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2191:1: ( (lv_id_0_0= 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2191:1: ( (lv_id_0_0= 'String' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2192:1: (lv_id_0_0= 'String' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2192:1: (lv_id_0_0= 'String' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2193:3: lv_id_0_0= 'String'
            {
            lv_id_0_0=(Token)match(input,35,FOLLOW_35_in_ruleStringType4791); 

                    newLeafNode(lv_id_0_0, grammarAccess.getStringTypeAccess().getIdStringKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "String");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2214:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2215:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2216:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType4839);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType4849); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2223:1: ruleBooleanType returns [EObject current=null] : ( (lv_id_0_0= 'boolean' ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2226:28: ( ( (lv_id_0_0= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2227:1: ( (lv_id_0_0= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2227:1: ( (lv_id_0_0= 'boolean' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2228:1: (lv_id_0_0= 'boolean' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2228:1: (lv_id_0_0= 'boolean' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2229:3: lv_id_0_0= 'boolean'
            {
            lv_id_0_0=(Token)match(input,36,FOLLOW_36_in_ruleBooleanType4891); 

                    newLeafNode(lv_id_0_0, grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "boolean");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleDateType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2250:1: entryRuleDateType returns [EObject current=null] : iv_ruleDateType= ruleDateType EOF ;
    public final EObject entryRuleDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2251:2: (iv_ruleDateType= ruleDateType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2252:2: iv_ruleDateType= ruleDateType EOF
            {
             newCompositeNode(grammarAccess.getDateTypeRule()); 
            pushFollow(FOLLOW_ruleDateType_in_entryRuleDateType4939);
            iv_ruleDateType=ruleDateType();

            state._fsp--;

             current =iv_ruleDateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateType4949); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateType"


    // $ANTLR start "ruleDateType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2259:1: ruleDateType returns [EObject current=null] : ( (lv_id_0_0= 'Date' ) ) ;
    public final EObject ruleDateType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2262:28: ( ( (lv_id_0_0= 'Date' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2263:1: ( (lv_id_0_0= 'Date' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2263:1: ( (lv_id_0_0= 'Date' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2264:1: (lv_id_0_0= 'Date' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2264:1: (lv_id_0_0= 'Date' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2265:3: lv_id_0_0= 'Date'
            {
            lv_id_0_0=(Token)match(input,37,FOLLOW_37_in_ruleDateType4991); 

                    newLeafNode(lv_id_0_0, grammarAccess.getDateTypeAccess().getIdDateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateType"


    // $ANTLR start "entryRuleNumericType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2286:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2287:2: (iv_ruleNumericType= ruleNumericType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2288:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType5039);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType5049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2295:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_FloatType_2= ruleFloatType | this_DoubleType_3= ruleDoubleType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_LongType_1 = null;

        EObject this_FloatType_2 = null;

        EObject this_DoubleType_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2298:28: ( (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_FloatType_2= ruleFloatType | this_DoubleType_3= ruleDoubleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2299:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_FloatType_2= ruleFloatType | this_DoubleType_3= ruleDoubleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2299:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_FloatType_2= ruleFloatType | this_DoubleType_3= ruleDoubleType )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt39=1;
                }
                break;
            case 39:
                {
                alt39=2;
                }
                break;
            case 40:
                {
                alt39=3;
                }
                break;
            case 41:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2300:5: this_IntegerType_0= ruleIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleNumericType5096);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;

                     
                            current = this_IntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2310:5: this_LongType_1= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleNumericType5123);
                    this_LongType_1=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2320:5: this_FloatType_2= ruleFloatType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_ruleNumericType5150);
                    this_FloatType_2=ruleFloatType();

                    state._fsp--;

                     
                            current = this_FloatType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2330:5: this_DoubleType_3= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleNumericType5177);
                    this_DoubleType_3=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegerType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2346:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2347:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2348:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType5212);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType5222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2355:1: ruleIntegerType returns [EObject current=null] : ( (lv_id_0_0= 'int' ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2358:28: ( ( (lv_id_0_0= 'int' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2359:1: ( (lv_id_0_0= 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2359:1: ( (lv_id_0_0= 'int' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2360:1: (lv_id_0_0= 'int' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2360:1: (lv_id_0_0= 'int' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2361:3: lv_id_0_0= 'int'
            {
            lv_id_0_0=(Token)match(input,38,FOLLOW_38_in_ruleIntegerType5264); 

                    newLeafNode(lv_id_0_0, grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "int");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleLongType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2382:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2383:2: (iv_ruleLongType= ruleLongType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2384:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType5312);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType5322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2391:1: ruleLongType returns [EObject current=null] : ( (lv_id_0_0= 'long' ) ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2394:28: ( ( (lv_id_0_0= 'long' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2395:1: ( (lv_id_0_0= 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2395:1: ( (lv_id_0_0= 'long' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2396:1: (lv_id_0_0= 'long' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2396:1: (lv_id_0_0= 'long' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2397:3: lv_id_0_0= 'long'
            {
            lv_id_0_0=(Token)match(input,39,FOLLOW_39_in_ruleLongType5364); 

                    newLeafNode(lv_id_0_0, grammarAccess.getLongTypeAccess().getIdLongKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLongTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "long");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleFloatType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2418:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2419:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2420:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType5412);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType5422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2427:1: ruleFloatType returns [EObject current=null] : ( (lv_id_0_0= 'float' ) ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2430:28: ( ( (lv_id_0_0= 'float' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2431:1: ( (lv_id_0_0= 'float' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2431:1: ( (lv_id_0_0= 'float' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2432:1: (lv_id_0_0= 'float' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2432:1: (lv_id_0_0= 'float' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2433:3: lv_id_0_0= 'float'
            {
            lv_id_0_0=(Token)match(input,40,FOLLOW_40_in_ruleFloatType5464); 

                    newLeafNode(lv_id_0_0, grammarAccess.getFloatTypeAccess().getIdFloatKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFloatTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "float");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleDoubleType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2454:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2455:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2456:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType5512);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType5522); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2463:1: ruleDoubleType returns [EObject current=null] : ( (lv_id_0_0= 'double' ) ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2466:28: ( ( (lv_id_0_0= 'double' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2467:1: ( (lv_id_0_0= 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2467:1: ( (lv_id_0_0= 'double' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2468:1: (lv_id_0_0= 'double' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2468:1: (lv_id_0_0= 'double' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2469:3: lv_id_0_0= 'double'
            {
            lv_id_0_0=(Token)match(input,41,FOLLOW_41_in_ruleDoubleType5564); 

                    newLeafNode(lv_id_0_0, grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "double");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2490:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2491:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2492:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5613);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2499:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2502:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2503:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2503:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2503:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5664); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2510:1: (kw= '.' this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==42) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2511:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleFQN5683); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5698); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\15\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\13\7\14\4\uffff";
    static final String DFA26_minS =
        "\1\4\10\16\4\uffff";
    static final String DFA26_maxS =
        "\1\51\10\41\4\uffff";
    static final String DFA26_acceptS =
        "\11\uffff\1\3\1\4\1\1\1\2";
    static final String DFA26_specialS =
        "\15\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\25\uffff\1\11\10\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\13\7\uffff\1\13\6\uffff\1\12\3\uffff\1\13",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "\1\14\7\uffff\1\14\6\uffff\1\12\3\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1439:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType | this_ArrayType_3= ruleArrayType )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000140001002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel164 = new BitSet(new long[]{0x0000000140001002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_ruleDeclaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_entryRuleClient320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClient330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleClient367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClient384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClient406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClient423 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_ruleClient444 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_14_in_ruleClient457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_ruleHttpMethod550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_ruleHttpMethod577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_ruleHttpMethod604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_ruleHttpMethod631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_entryRuleHttpPost666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpPost676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHttpPost713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpPost730 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpPost752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpPost770 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpPost791 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_ruleHttpPost813 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpPost835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpPost848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_entryRuleHttpPut884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpPut894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHttpPut931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpPut948 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpPut970 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpPut988 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpPut1009 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_ruleHttpPut1031 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpPut1053 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpPut1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_entryRuleHttpGet1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpGet1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHttpGet1149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpGet1166 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpGet1188 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpGet1206 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpGet1227 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpGet1249 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpGet1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_entryRuleHttpDelete1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpDelete1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHttpDelete1345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpDelete1362 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpDelete1384 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpDelete1402 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpDelete1423 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpDelete1445 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpDelete1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleParamsBlock1541 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_ruleParamsBlock1562 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParamsBlock1575 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_ruleParamsBlock1596 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock1634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBodyBlock1687 = new BitSet(new long[]{0x000003F804002010L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleBodyBlock1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResponseBlock1810 = new BitSet(new long[]{0x000003F804802012L});
    public static final BitSet FOLLOW_23_in_ruleResponseBlock1836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResponseBlock1856 = new BitSet(new long[]{0x000003F804002012L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleResponseBlock1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType1916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleBlockType1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_ruleMember2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapWithMember_in_ruleMember2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_entryRuleTypedMember2154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedMember2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedMember_in_ruleTypedMember2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedMember_in_ruleTypedMember2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedMember_in_entryRuleIDNamedMember2273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDNamedMember2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDNamedMember2325 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIDNamedMember2342 = new BitSet(new long[]{0x000003F804000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleIDNamedMember2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedMember_in_entryRuleStringNamedMember2399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringNamedMember2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringNamedMember2451 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringNamedMember2468 = new BitSet(new long[]{0x000003F804000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleStringNamedMember2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrapWithMember_in_entryRuleWrapWithMember2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrapWithMember2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWrapWithMember2572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWrapWithMember2589 = new BitSet(new long[]{0x000003F804002010L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleWrapWithMember2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedSimpleMember_in_ruleSimpleMember2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedSimpleMember_in_ruleSimpleMember2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedSimpleMember_in_entryRuleIDNamedSimpleMember2770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDNamedSimpleMember2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDNamedSimpleMember2822 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIDNamedSimpleMember2839 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleIDNamedSimpleMember2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedSimpleMember_in_entryRuleStringNamedSimpleMember2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringNamedSimpleMember2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringNamedSimpleMember2948 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringNamedSimpleMember2965 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleStringNamedSimpleMember2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleType3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleType3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_ruleType3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_entryRuleGenericListType3195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListType3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGenericListType3248 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGenericListType3273 = new BitSet(new long[]{0x000003F800000010L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleGenericListType3296 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleGenericListType3315 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGenericListType3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType3366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleArrayType3424 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleArrayType3443 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArrayType3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserType3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleComplexTypeDeclaration3774 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleComplexTypeDeclaration3805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3836 = new BitSet(new long[]{0x000003F804002012L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEnumTypeDeclaration3952 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleEnumTypeDeclaration3983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration4014 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_23_in_ruleEnumTypeDeclaration4032 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration4053 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral4113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEnumTypeLiteral4160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral4181 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleEnumTypeLiteral4194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral4215 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumTypeLiteral4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember4265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember4317 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleEnumMember4341 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumMember4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral4414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComplexTypeLiteral4461 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral4482 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleComplexTypeLiteral4495 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral4516 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleComplexTypeLiteral4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType4566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleIntrinsicType4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleIntrinsicType4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateType_in_ruleIntrinsicType4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_ruleIntrinsicType4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType4739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStringType4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType4839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBooleanType4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateType_in_entryRuleDateType4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateType4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDateType4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType5039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleNumericType5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleNumericType5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleNumericType5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleNumericType5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType5212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIntegerType5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType5312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLongType5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType5412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFloatType5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType5512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDoubleType5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5664 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleFQN5683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5698 = new BitSet(new long[]{0x0000040000000002L});

}