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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'client'", "'{'", "'}'", "'post'", "'put'", "'get'", "'delete'", "'params'", "','", "'body'", "'response'", "'extends'", "':'", "'[]'", "'entity'", "'generate'", "'enum'", "'='", "'String'", "'boolean'", "'int'", "'long'", "'double'", "'.'"
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

                if ( (LA1_0==12||LA1_0==26||LA1_0==28) ) {
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

            if ( (LA2_0==26||LA2_0==28) ) {
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:177:1: ruleClient returns [EObject current=null] : (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_methods_5_0= ruleHttpMethod ) )* otherlv_6= '}' ) ;
    public final EObject ruleClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_baseUrl_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_params_4_0 = null;

        EObject lv_methods_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:180:28: ( (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_methods_5_0= ruleHttpMethod ) )* otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:1: (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_methods_5_0= ruleHttpMethod ) )* otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:1: (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_methods_5_0= ruleHttpMethod ) )* otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:3: otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_methods_5_0= ruleHttpMethod ) )* otherlv_6= '}'
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:203:2: ( (lv_baseUrl_2_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
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
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClient424); 

                	newLeafNode(otherlv_3, grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:225:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:226:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:226:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:227:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getClientAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleClient445);
                    lv_params_4_0=ruleParamsBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClientRule());
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:243:3: ( (lv_methods_5_0= ruleHttpMethod ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:244:1: (lv_methods_5_0= ruleHttpMethod )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:244:1: (lv_methods_5_0= ruleHttpMethod )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:245:3: lv_methods_5_0= ruleHttpMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClientAccess().getMethodsHttpMethodParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHttpMethod_in_ruleClient467);
            	    lv_methods_5_0=ruleHttpMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClientRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_5_0, 
            	            		"HttpMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClient480); 

                	newLeafNode(otherlv_6, grammarAccess.getClientAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:273:1: entryRuleHttpMethod returns [EObject current=null] : iv_ruleHttpMethod= ruleHttpMethod EOF ;
    public final EObject entryRuleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethod = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:274:2: (iv_ruleHttpMethod= ruleHttpMethod EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:275:2: iv_ruleHttpMethod= ruleHttpMethod EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod516);
            iv_ruleHttpMethod=ruleHttpMethod();

            state._fsp--;

             current =iv_ruleHttpMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod526); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:282:1: ruleHttpMethod returns [EObject current=null] : (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete ) ;
    public final EObject ruleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject this_HttpPost_0 = null;

        EObject this_HttpGet_1 = null;

        EObject this_HttpPut_2 = null;

        EObject this_HttpDelete_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:285:28: ( (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:286:1: (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:286:1: (this_HttpPost_0= ruleHttpPost | this_HttpGet_1= ruleHttpGet | this_HttpPut_2= ruleHttpPut | this_HttpDelete_3= ruleHttpDelete )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:287:5: this_HttpPost_0= ruleHttpPost
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpPostParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHttpPost_in_ruleHttpMethod573);
                    this_HttpPost_0=ruleHttpPost();

                    state._fsp--;

                     
                            current = this_HttpPost_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:297:5: this_HttpGet_1= ruleHttpGet
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpGetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHttpGet_in_ruleHttpMethod600);
                    this_HttpGet_1=ruleHttpGet();

                    state._fsp--;

                     
                            current = this_HttpGet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:307:5: this_HttpPut_2= ruleHttpPut
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpPutParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHttpPut_in_ruleHttpMethod627);
                    this_HttpPut_2=ruleHttpPut();

                    state._fsp--;

                     
                            current = this_HttpPut_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:317:5: this_HttpDelete_3= ruleHttpDelete
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodAccess().getHttpDeleteParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleHttpDelete_in_ruleHttpMethod654);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:333:1: entryRuleHttpPost returns [EObject current=null] : iv_ruleHttpPost= ruleHttpPost EOF ;
    public final EObject entryRuleHttpPost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpPost = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:334:2: (iv_ruleHttpPost= ruleHttpPost EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:335:2: iv_ruleHttpPost= ruleHttpPost EOF
            {
             newCompositeNode(grammarAccess.getHttpPostRule()); 
            pushFollow(FOLLOW_ruleHttpPost_in_entryRuleHttpPost689);
            iv_ruleHttpPost=ruleHttpPost();

            state._fsp--;

             current =iv_ruleHttpPost; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpPost699); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:342:1: ruleHttpPost returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) ;
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
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:345:28: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:346:1: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:346:1: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:346:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHttpPost736); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpPostAccess().getPostKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:350:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:351:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:351:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpPost753); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:368:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:369:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:369:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:370:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpPost775); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpPost793); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpPostAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:390:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:391:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:391:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:392:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPostAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpPost814);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:408:3: ( (lv_body_5_0= ruleBodyBlock ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:409:1: (lv_body_5_0= ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:409:1: (lv_body_5_0= ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:410:3: lv_body_5_0= ruleBodyBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPostAccess().getBodyBodyBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBodyBlock_in_ruleHttpPost836);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:426:3: ( (lv_response_6_0= ruleResponseBlock ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:427:1: (lv_response_6_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:427:1: (lv_response_6_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:428:3: lv_response_6_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPostAccess().getResponseResponseBlockParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpPost858);
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

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleHttpPost871); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:456:1: entryRuleHttpPut returns [EObject current=null] : iv_ruleHttpPut= ruleHttpPut EOF ;
    public final EObject entryRuleHttpPut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpPut = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:457:2: (iv_ruleHttpPut= ruleHttpPut EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:458:2: iv_ruleHttpPut= ruleHttpPut EOF
            {
             newCompositeNode(grammarAccess.getHttpPutRule()); 
            pushFollow(FOLLOW_ruleHttpPut_in_entryRuleHttpPut907);
            iv_ruleHttpPut=ruleHttpPut();

            state._fsp--;

             current =iv_ruleHttpPut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpPut917); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:465:1: ruleHttpPut returns [EObject current=null] : (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) ;
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
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:468:28: ( (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:469:1: (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:469:1: (otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:469:3: otherlv_0= 'put' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_body_5_0= ruleBodyBlock ) )? ( (lv_response_6_0= ruleResponseBlock ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHttpPut954); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpPutAccess().getPutKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:473:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:474:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:474:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:475:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpPut971); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:491:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:492:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:492:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:493:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpPut993); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpPut1011); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpPutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:513:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:514:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:514:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:515:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPutAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpPut1032);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:531:3: ( (lv_body_5_0= ruleBodyBlock ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:532:1: (lv_body_5_0= ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:532:1: (lv_body_5_0= ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:533:3: lv_body_5_0= ruleBodyBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPutAccess().getBodyBodyBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBodyBlock_in_ruleHttpPut1054);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:549:3: ( (lv_response_6_0= ruleResponseBlock ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:550:1: (lv_response_6_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:550:1: (lv_response_6_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:551:3: lv_response_6_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpPutAccess().getResponseResponseBlockParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpPut1076);
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

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleHttpPut1089); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:579:1: entryRuleHttpGet returns [EObject current=null] : iv_ruleHttpGet= ruleHttpGet EOF ;
    public final EObject entryRuleHttpGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpGet = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:580:2: (iv_ruleHttpGet= ruleHttpGet EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:581:2: iv_ruleHttpGet= ruleHttpGet EOF
            {
             newCompositeNode(grammarAccess.getHttpGetRule()); 
            pushFollow(FOLLOW_ruleHttpGet_in_entryRuleHttpGet1125);
            iv_ruleHttpGet=ruleHttpGet();

            state._fsp--;

             current =iv_ruleHttpGet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpGet1135); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:588:1: ruleHttpGet returns [EObject current=null] : (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) ;
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
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:591:28: ( (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:592:1: (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:592:1: (otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:592:3: otherlv_0= 'get' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleHttpGet1172); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpGetAccess().getGetKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:596:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:597:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpGet1189); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:614:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:615:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:615:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:616:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpGet1211); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpGet1229); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpGetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:636:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:637:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:637:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:638:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpGetAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpGet1250);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:654:3: ( (lv_response_5_0= ruleResponseBlock ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:655:1: (lv_response_5_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:655:1: (lv_response_5_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:656:3: lv_response_5_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpGetAccess().getResponseResponseBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpGet1272);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleHttpGet1285); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:684:1: entryRuleHttpDelete returns [EObject current=null] : iv_ruleHttpDelete= ruleHttpDelete EOF ;
    public final EObject entryRuleHttpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpDelete = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:685:2: (iv_ruleHttpDelete= ruleHttpDelete EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:686:2: iv_ruleHttpDelete= ruleHttpDelete EOF
            {
             newCompositeNode(grammarAccess.getHttpDeleteRule()); 
            pushFollow(FOLLOW_ruleHttpDelete_in_entryRuleHttpDelete1321);
            iv_ruleHttpDelete=ruleHttpDelete();

            state._fsp--;

             current =iv_ruleHttpDelete; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpDelete1331); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:693:1: ruleHttpDelete returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) ;
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
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:696:28: ( (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:697:1: (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:697:1: (otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:697:3: otherlv_0= 'delete' ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_params_4_0= ruleParamsBlock ) )? ( (lv_response_5_0= ruleResponseBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleHttpDelete1368); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:701:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:702:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:702:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:703:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpDelete1385); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:719:2: ( (lv_path_2_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:720:1: (lv_path_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:720:1: (lv_path_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:721:3: lv_path_2_0= RULE_STRING
                    {
                    lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpDelete1407); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpDelete1425); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpDeleteAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:741:1: ( (lv_params_4_0= ruleParamsBlock ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:742:1: (lv_params_4_0= ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:742:1: (lv_params_4_0= ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:743:3: lv_params_4_0= ruleParamsBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpDeleteAccess().getParamsParamsBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpDelete1446);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:759:3: ( (lv_response_5_0= ruleResponseBlock ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:760:1: (lv_response_5_0= ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:760:1: (lv_response_5_0= ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:761:3: lv_response_5_0= ruleResponseBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpDeleteAccess().getResponseResponseBlockParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpDelete1468);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleHttpDelete1481); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:789:1: entryRuleParamsBlock returns [EObject current=null] : iv_ruleParamsBlock= ruleParamsBlock EOF ;
    public final EObject entryRuleParamsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamsBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:790:2: (iv_ruleParamsBlock= ruleParamsBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:791:2: iv_ruleParamsBlock= ruleParamsBlock EOF
            {
             newCompositeNode(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1517);
            iv_ruleParamsBlock=ruleParamsBlock();

            state._fsp--;

             current =iv_ruleParamsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock1527); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:798:1: ruleParamsBlock returns [EObject current=null] : ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMember ) )* (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) ) )* ) ;
    public final EObject ruleParamsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:801:28: ( ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMember ) )* (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:802:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMember ) )* (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:802:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMember ) )* (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:802:2: () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMember ) )* (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) ) )*
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:802:2: ()
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:803:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamsBlockAccess().getParamsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleParamsBlock1573); 

                	newLeafNode(otherlv_1, grammarAccess.getParamsBlockAccess().getParamsKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:812:1: ( (lv_params_2_0= ruleSimpleMember ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:813:1: (lv_params_2_0= ruleSimpleMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:813:1: (lv_params_2_0= ruleSimpleMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:814:3: lv_params_2_0= ruleSimpleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleMember_in_ruleParamsBlock1594);
            	    lv_params_2_0=ruleSimpleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_2_0, 
            	            		"SimpleMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:830:3: (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:830:5: otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMember ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleParamsBlock1608); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:834:1: ( (lv_params_4_0= ruleSimpleMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:835:1: (lv_params_4_0= ruleSimpleMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:835:1: (lv_params_4_0= ruleSimpleMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:836:3: lv_params_4_0= ruleSimpleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleMember_in_ruleParamsBlock1629);
            	    lv_params_4_0=ruleSimpleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"SimpleMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:860:1: entryRuleBodyBlock returns [EObject current=null] : iv_ruleBodyBlock= ruleBodyBlock EOF ;
    public final EObject entryRuleBodyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:861:2: (iv_ruleBodyBlock= ruleBodyBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:862:2: iv_ruleBodyBlock= ruleBodyBlock EOF
            {
             newCompositeNode(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock1667);
            iv_ruleBodyBlock=ruleBodyBlock();

            state._fsp--;

             current =iv_ruleBodyBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock1677); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:869:1: ruleBodyBlock returns [EObject current=null] : (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) ) ;
    public final EObject ruleBodyBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:872:28: ( (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:873:1: (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:873:1: (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:873:3: otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleBodyBlock1714); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyBlockAccess().getBodyKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:877:1: ( (lv_type_1_0= ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:878:1: (lv_type_1_0= ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:878:1: (lv_type_1_0= ruleBlockType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:879:3: lv_type_1_0= ruleBlockType
            {
             
            	        newCompositeNode(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlockType_in_ruleBodyBlock1735);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:903:1: entryRuleResponseBlock returns [EObject current=null] : iv_ruleResponseBlock= ruleResponseBlock EOF ;
    public final EObject entryRuleResponseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:904:2: (iv_ruleResponseBlock= ruleResponseBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:905:2: iv_ruleResponseBlock= ruleResponseBlock EOF
            {
             newCompositeNode(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock1771);
            iv_ruleResponseBlock=ruleResponseBlock();

            state._fsp--;

             current =iv_ruleResponseBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock1781); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:912:1: ruleResponseBlock returns [EObject current=null] : ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? ) ;
    public final EObject ruleResponseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:915:28: ( ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:916:1: ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:916:1: ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:916:2: () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:916:2: ()
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:917:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResponseBlockAccess().getResponseBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleResponseBlock1827); 

                	newLeafNode(otherlv_1, grammarAccess.getResponseBlockAccess().getResponseKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:926:1: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:926:3: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleResponseBlock1840); 

                        	newLeafNode(otherlv_2, grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:930:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:931:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:931:1: (otherlv_3= RULE_ID )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:932:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResponseBlock1860); 

                    		newLeafNode(otherlv_3, grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:943:4: ( (lv_type_4_0= ruleBlockType ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==13||(LA24_0>=30 && LA24_0<=34)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:944:1: (lv_type_4_0= ruleBlockType )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:944:1: (lv_type_4_0= ruleBlockType )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:945:3: lv_type_4_0= ruleBlockType
                    {
                     
                    	        newCompositeNode(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockType_in_ruleResponseBlock1883);
                    lv_type_4_0=ruleBlockType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResponseBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:969:1: entryRuleBlockType returns [EObject current=null] : iv_ruleBlockType= ruleBlockType EOF ;
    public final EObject entryRuleBlockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:970:2: (iv_ruleBlockType= ruleBlockType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:971:2: iv_ruleBlockType= ruleBlockType EOF
            {
             newCompositeNode(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType1920);
            iv_ruleBlockType=ruleBlockType();

            state._fsp--;

             current =iv_ruleBlockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType1930); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:978:1: ruleBlockType returns [EObject current=null] : (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) ;
    public final EObject ruleBlockType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ComplexTypeLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:981:28: ( (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:982:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:982:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=30 && LA25_0<=34)) ) {
                alt25=1;
            }
            else if ( (LA25_0==13) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:983:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleBlockType1977);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:993:5: this_ComplexTypeLiteral_1= ruleComplexTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2004);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1009:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1010:2: (iv_ruleMember= ruleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1011:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2039);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2049); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1018:1: ruleMember returns [EObject current=null] : (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_TypedMember_0 = null;

        EObject this_SkipMember_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1021:28: ( (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1022:1: (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1022:1: (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==13) ) {
                    alt26=2;
                }
                else if ( (LA26_1==24) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0==RULE_STRING) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==24) ) {
                    alt26=1;
                }
                else if ( (LA26_2==13) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1023:5: this_TypedMember_0= ruleTypedMember
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypedMember_in_ruleMember2096);
                    this_TypedMember_0=ruleTypedMember();

                    state._fsp--;

                     
                            current = this_TypedMember_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1033:5: this_SkipMember_1= ruleSkipMember
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSkipMember_in_ruleMember2123);
                    this_SkipMember_1=ruleSkipMember();

                    state._fsp--;

                     
                            current = this_SkipMember_1; 
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1049:1: entryRuleTypedMember returns [EObject current=null] : iv_ruleTypedMember= ruleTypedMember EOF ;
    public final EObject entryRuleTypedMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1050:2: (iv_ruleTypedMember= ruleTypedMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1051:2: iv_ruleTypedMember= ruleTypedMember EOF
            {
             newCompositeNode(grammarAccess.getTypedMemberRule()); 
            pushFollow(FOLLOW_ruleTypedMember_in_entryRuleTypedMember2158);
            iv_ruleTypedMember=ruleTypedMember();

            state._fsp--;

             current =iv_ruleTypedMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedMember2168); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1058:1: ruleTypedMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleTypedMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1061:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1062:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1062:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1062:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1062:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1063:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1063:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1064:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1064:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1065:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypedMember2212); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypedMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1080:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypedMember2232); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getTypedMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypedMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTypedMember2252); 

                	newLeafNode(otherlv_1, grammarAccess.getTypedMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1102:1: ( (lv_type_2_0= ruleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1103:1: (lv_type_2_0= ruleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1103:1: (lv_type_2_0= ruleType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1104:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypedMember2273);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedMemberRule());
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
    // $ANTLR end "ruleTypedMember"


    // $ANTLR start "entryRuleSkipMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1128:1: entryRuleSkipMember returns [EObject current=null] : iv_ruleSkipMember= ruleSkipMember EOF ;
    public final EObject entryRuleSkipMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1129:2: (iv_ruleSkipMember= ruleSkipMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1130:2: iv_ruleSkipMember= ruleSkipMember EOF
            {
             newCompositeNode(grammarAccess.getSkipMemberRule()); 
            pushFollow(FOLLOW_ruleSkipMember_in_entryRuleSkipMember2309);
            iv_ruleSkipMember=ruleSkipMember();

            state._fsp--;

             current =iv_ruleSkipMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkipMember2319); 

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
    // $ANTLR end "entryRuleSkipMember"


    // $ANTLR start "ruleSkipMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1137:1: ruleSkipMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) ) ;
    public final EObject ruleSkipMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        EObject lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1140:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1141:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1141:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1141:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1141:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1142:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1142:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1143:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1143:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1144:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkipMember2363); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSkipMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1159:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSkipMember2383); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSkipMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1177:2: ( (lv_literal_1_0= ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1178:1: (lv_literal_1_0= ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1178:1: (lv_literal_1_0= ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1179:3: lv_literal_1_0= ruleComplexTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleSkipMember2412);
            lv_literal_1_0=ruleComplexTypeLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSkipMemberRule());
            	        }
                   		set(
                   			current, 
                   			"literal",
                    		lv_literal_1_0, 
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
    // $ANTLR end "ruleSkipMember"


    // $ANTLR start "entryRuleSimpleMember"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1203:1: entryRuleSimpleMember returns [EObject current=null] : iv_ruleSimpleMember= ruleSimpleMember EOF ;
    public final EObject entryRuleSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1204:2: (iv_ruleSimpleMember= ruleSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1205:2: iv_ruleSimpleMember= ruleSimpleMember EOF
            {
             newCompositeNode(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2448);
            iv_ruleSimpleMember=ruleSimpleMember();

            state._fsp--;

             current =iv_ruleSimpleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember2458); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1212:1: ruleSimpleMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) ;
    public final EObject ruleSimpleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1215:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1216:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1217:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1217:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1218:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1218:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1219:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleMember2502); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1234:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleMember2522); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSimpleMember2542); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1256:1: ( (lv_type_2_0= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1257:1: (lv_type_2_0= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1257:1: (lv_type_2_0= ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1258:3: lv_type_2_0= ruleIntrinsicType
            {
             
            	        newCompositeNode(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntrinsicType_in_ruleSimpleMember2563);
            lv_type_2_0=ruleIntrinsicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleMemberRule());
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
    // $ANTLR end "ruleSimpleMember"


    // $ANTLR start "entryRuleType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1282:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1283:2: (iv_ruleType= ruleType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1284:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2599);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2609); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1291:1: ruleType returns [EObject current=null] : (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_UserType_0 = null;

        EObject this_IntrinsicType_1 = null;

        EObject this_GenericListType_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1294:28: ( (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1295:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1295:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1296:5: this_UserType_0= ruleUserType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserType_in_ruleType2656);
                    this_UserType_0=ruleUserType();

                    state._fsp--;

                     
                            current = this_UserType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1306:5: this_IntrinsicType_1= ruleIntrinsicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleType2683);
                    this_IntrinsicType_1=ruleIntrinsicType();

                    state._fsp--;

                     
                            current = this_IntrinsicType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1316:5: this_GenericListType_2= ruleGenericListType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGenericListType_in_ruleType2710);
                    this_GenericListType_2=ruleGenericListType();

                    state._fsp--;

                     
                            current = this_GenericListType_2; 
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1332:1: entryRuleGenericListType returns [EObject current=null] : iv_ruleGenericListType= ruleGenericListType EOF ;
    public final EObject entryRuleGenericListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericListType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1333:2: (iv_ruleGenericListType= ruleGenericListType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1334:2: iv_ruleGenericListType= ruleGenericListType EOF
            {
             newCompositeNode(grammarAccess.getGenericListTypeRule()); 
            pushFollow(FOLLOW_ruleGenericListType_in_entryRuleGenericListType2745);
            iv_ruleGenericListType=ruleGenericListType();

            state._fsp--;

             current =iv_ruleGenericListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListType2755); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1341:1: ruleGenericListType returns [EObject current=null] : ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) ;
    public final EObject ruleGenericListType() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_elementType_0_1 = null;

        EObject lv_elementType_0_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1344:28: ( ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1345:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1345:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1345:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1345:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1346:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1346:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1347:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1347:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=30 && LA31_0<=34)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1348:3: lv_elementType_0_1= ruleUserType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserType_in_ruleGenericListType2803);
                    lv_elementType_0_1=ruleUserType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericListTypeRule());
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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1363:8: lv_elementType_0_2= ruleIntrinsicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleGenericListType2822);
                    lv_elementType_0_2=ruleIntrinsicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericListTypeRule());
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1381:2: ( (lv_id_1_0= '[]' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1382:1: (lv_id_1_0= '[]' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1382:1: (lv_id_1_0= '[]' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1383:3: lv_id_1_0= '[]'
            {
            lv_id_1_0=(Token)match(input,25,FOLLOW_25_in_ruleGenericListType2843); 

                    newLeafNode(lv_id_1_0, grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenericListTypeRule());
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
    // $ANTLR end "ruleGenericListType"


    // $ANTLR start "entryRuleUserType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1404:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1405:2: (iv_ruleUserType= ruleUserType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1406:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType2892);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType2902); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1413:1: ruleUserType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1416:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1417:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1417:1: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1418:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1418:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1419:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserType2946); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1438:1: entryRuleUserTypeDeclaration returns [EObject current=null] : iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF ;
    public final EObject entryRuleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1439:2: (iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1440:2: iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration2981);
            iv_ruleUserTypeDeclaration=ruleUserTypeDeclaration();

            state._fsp--;

             current =iv_ruleUserTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration2991); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1447:1: ruleUserTypeDeclaration returns [EObject current=null] : (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) ;
    public final EObject ruleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexTypeDeclaration_0 = null;

        EObject this_EnumTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1450:28: ( (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1451:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1451:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            else if ( (LA32_0==28) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1452:5: this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3038);
                    this_ComplexTypeDeclaration_0=ruleComplexTypeDeclaration();

                    state._fsp--;

                     
                            current = this_ComplexTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1462:5: this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3065);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1478:1: entryRuleComplexTypeDeclaration returns [EObject current=null] : iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF ;
    public final EObject entryRuleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1479:2: (iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1480:2: iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3100);
            iv_ruleComplexTypeDeclaration=ruleComplexTypeDeclaration();

            state._fsp--;

             current =iv_ruleComplexTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3110); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1487:1: ruleComplexTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) ;
    public final EObject ruleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_gen_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1490:28: ( ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1491:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1491:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1491:2: ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1491:2: ( (lv_keyword_0_0= 'entity' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1492:1: (lv_keyword_0_0= 'entity' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1492:1: (lv_keyword_0_0= 'entity' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1493:3: lv_keyword_0_0= 'entity'
            {
            lv_keyword_0_0=(Token)match(input,26,FOLLOW_26_in_ruleComplexTypeDeclaration3153); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "entity");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1506:2: ( (lv_gen_1_0= 'generate' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1507:1: (lv_gen_1_0= 'generate' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1507:1: (lv_gen_1_0= 'generate' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1508:3: lv_gen_1_0= 'generate'
                    {
                    lv_gen_1_0=(Token)match(input,27,FOLLOW_27_in_ruleComplexTypeDeclaration3184); 

                            newLeafNode(lv_gen_1_0, grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "gen", true, "generate");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1521:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1522:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1522:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1523:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3215); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1539:2: ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==13) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1540:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1540:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1541:3: lv_literal_3_0= ruleComplexTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3241);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1565:1: entryRuleEnumTypeDeclaration returns [EObject current=null] : iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF ;
    public final EObject entryRuleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1566:2: (iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1567:2: iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3278);
            iv_ruleEnumTypeDeclaration=ruleEnumTypeDeclaration();

            state._fsp--;

             current =iv_ruleEnumTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3288); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1574:1: ruleEnumTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) ;
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
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1577:28: ( ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1578:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1578:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1578:2: ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1578:2: ( (lv_keyword_0_0= 'enum' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1579:1: (lv_keyword_0_0= 'enum' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1579:1: (lv_keyword_0_0= 'enum' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1580:3: lv_keyword_0_0= 'enum'
            {
            lv_keyword_0_0=(Token)match(input,28,FOLLOW_28_in_ruleEnumTypeDeclaration3331); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "enum");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1593:2: ( (lv_gen_1_0= 'generate' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1594:1: (lv_gen_1_0= 'generate' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1594:1: (lv_gen_1_0= 'generate' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1595:3: lv_gen_1_0= 'generate'
                    {
                    lv_gen_1_0=(Token)match(input,27,FOLLOW_27_in_ruleEnumTypeDeclaration3362); 

                            newLeafNode(lv_gen_1_0, grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "gen", true, "generate");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1608:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1609:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1609:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1610:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3393); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1626:2: (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1626:4: otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleEnumTypeDeclaration3411); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1630:1: ( (lv_superType_4_0= ruleIntegerType ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1631:1: (lv_superType_4_0= ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1631:1: (lv_superType_4_0= ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1632:3: lv_superType_4_0= ruleIntegerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3432);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1648:4: ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1649:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1649:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1650:3: lv_literal_5_0= ruleEnumTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3455);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1674:1: entryRuleEnumTypeLiteral returns [EObject current=null] : iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF ;
    public final EObject entryRuleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1675:2: (iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1676:2: iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3492);
            iv_ruleEnumTypeLiteral=ruleEnumTypeLiteral();

            state._fsp--;

             current =iv_ruleEnumTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral3502); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1683:1: ruleEnumTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1686:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1687:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1687:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1687:3: otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleEnumTypeLiteral3539); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1691:1: ( (lv_members_1_0= ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1692:1: (lv_members_1_0= ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1692:1: (lv_members_1_0= ruleEnumMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1693:3: lv_members_1_0= ruleEnumMember
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3560);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1709:2: (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1709:4: otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnumTypeLiteral3573); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1713:1: ( (lv_members_3_0= ruleEnumMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1714:1: (lv_members_3_0= ruleEnumMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1714:1: (lv_members_3_0= ruleEnumMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1715:3: lv_members_3_0= ruleEnumMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3594);
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
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEnumTypeLiteral3608); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1743:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1744:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1745:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             newCompositeNode(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember3644);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember3654); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1752:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_assignment_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1755:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1757:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1757:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1758:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember3696); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1774:2: ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1774:3: ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1774:3: ( (lv_assignment_1_0= '=' ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1775:1: (lv_assignment_1_0= '=' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1775:1: (lv_assignment_1_0= '=' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1776:3: lv_assignment_1_0= '='
                    {
                    lv_assignment_1_0=(Token)match(input,29,FOLLOW_29_in_ruleEnumMember3720); 

                            newLeafNode(lv_assignment_1_0, grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(current, "assignment", true, "=");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1789:2: ( (lv_value_2_0= RULE_INT ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1790:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1790:1: (lv_value_2_0= RULE_INT )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1791:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumMember3750); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1815:1: entryRuleComplexTypeLiteral returns [EObject current=null] : iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF ;
    public final EObject entryRuleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1816:2: (iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1817:2: iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral3793);
            iv_ruleComplexTypeLiteral=ruleComplexTypeLiteral();

            state._fsp--;

             current =iv_ruleComplexTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral3803); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1824:1: ruleComplexTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1827:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1828:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1828:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1828:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComplexTypeLiteral3840); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1832:1: ( (lv_members_1_0= ruleMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1833:1: (lv_members_1_0= ruleMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1833:1: (lv_members_1_0= ruleMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1834:3: lv_members_1_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral3861);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1850:2: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1850:4: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleComplexTypeLiteral3874); 

            	        	newLeafNode(otherlv_2, grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1854:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1855:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1855:1: (lv_members_3_0= ruleMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1856:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral3895);
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
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleComplexTypeLiteral3909); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1884:1: entryRuleIntrinsicType returns [EObject current=null] : iv_ruleIntrinsicType= ruleIntrinsicType EOF ;
    public final EObject entryRuleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntrinsicType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1885:2: (iv_ruleIntrinsicType= ruleIntrinsicType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1886:2: iv_ruleIntrinsicType= ruleIntrinsicType EOF
            {
             newCompositeNode(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType3945);
            iv_ruleIntrinsicType=ruleIntrinsicType();

            state._fsp--;

             current =iv_ruleIntrinsicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType3955); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1893:1: ruleIntrinsicType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject ruleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1896:28: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1897:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1897:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt41=1;
                }
                break;
            case 31:
                {
                alt41=2;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1898:5: this_StringType_0= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleIntrinsicType4002);
                    this_StringType_0=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1908:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleIntrinsicType4029);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1918:5: this_NumericType_2= ruleNumericType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumericType_in_ruleIntrinsicType4056);
                    this_NumericType_2=ruleNumericType();

                    state._fsp--;

                     
                            current = this_NumericType_2; 
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1934:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1935:2: (iv_ruleStringType= ruleStringType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1936:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType4091);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType4101); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1943:1: ruleStringType returns [EObject current=null] : ( (lv_id_0_0= 'String' ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1946:28: ( ( (lv_id_0_0= 'String' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1947:1: ( (lv_id_0_0= 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1947:1: ( (lv_id_0_0= 'String' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1948:1: (lv_id_0_0= 'String' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1948:1: (lv_id_0_0= 'String' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1949:3: lv_id_0_0= 'String'
            {
            lv_id_0_0=(Token)match(input,30,FOLLOW_30_in_ruleStringType4143); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1970:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1971:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1972:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType4191);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType4201); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1979:1: ruleBooleanType returns [EObject current=null] : ( (lv_id_0_0= 'boolean' ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1982:28: ( ( (lv_id_0_0= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1983:1: ( (lv_id_0_0= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1983:1: ( (lv_id_0_0= 'boolean' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1984:1: (lv_id_0_0= 'boolean' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1984:1: (lv_id_0_0= 'boolean' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1985:3: lv_id_0_0= 'boolean'
            {
            lv_id_0_0=(Token)match(input,31,FOLLOW_31_in_ruleBooleanType4243); 

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


    // $ANTLR start "entryRuleNumericType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2006:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2007:2: (iv_ruleNumericType= ruleNumericType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2008:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType4291);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType4301); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2015:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_LongType_1 = null;

        EObject this_DoubleType_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2018:28: ( (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2019:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2019:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt42=1;
                }
                break;
            case 33:
                {
                alt42=2;
                }
                break;
            case 34:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2020:5: this_IntegerType_0= ruleIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleNumericType4348);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;

                     
                            current = this_IntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2030:5: this_LongType_1= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleNumericType4375);
                    this_LongType_1=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2040:5: this_DoubleType_2= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleNumericType4402);
                    this_DoubleType_2=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_2; 
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2056:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2057:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2058:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType4437);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType4447); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2065:1: ruleIntegerType returns [EObject current=null] : ( (lv_id_0_0= 'int' ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2068:28: ( ( (lv_id_0_0= 'int' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2069:1: ( (lv_id_0_0= 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2069:1: ( (lv_id_0_0= 'int' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2070:1: (lv_id_0_0= 'int' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2070:1: (lv_id_0_0= 'int' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2071:3: lv_id_0_0= 'int'
            {
            lv_id_0_0=(Token)match(input,32,FOLLOW_32_in_ruleIntegerType4489); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2092:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2093:2: (iv_ruleLongType= ruleLongType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2094:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType4537);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType4547); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2101:1: ruleLongType returns [EObject current=null] : ( (lv_id_0_0= 'long' ) ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2104:28: ( ( (lv_id_0_0= 'long' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2105:1: ( (lv_id_0_0= 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2105:1: ( (lv_id_0_0= 'long' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2106:1: (lv_id_0_0= 'long' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2106:1: (lv_id_0_0= 'long' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2107:3: lv_id_0_0= 'long'
            {
            lv_id_0_0=(Token)match(input,33,FOLLOW_33_in_ruleLongType4589); 

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


    // $ANTLR start "entryRuleDoubleType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2128:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2129:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2130:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType4637);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType4647); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2137:1: ruleDoubleType returns [EObject current=null] : ( (lv_id_0_0= 'double' ) ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2140:28: ( ( (lv_id_0_0= 'double' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2141:1: ( (lv_id_0_0= 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2141:1: ( (lv_id_0_0= 'double' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2142:1: (lv_id_0_0= 'double' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2142:1: (lv_id_0_0= 'double' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2143:3: lv_id_0_0= 'double'
            {
            lv_id_0_0=(Token)match(input,34,FOLLOW_34_in_ruleDoubleType4689); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2164:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2165:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2166:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4738);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4749); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2173:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2176:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2177:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2177:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2177:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4789); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2184:1: (kw= '.' this_ID_2= RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==35) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2185:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleFQN4808); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4823); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
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


    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA30_eotS =
        "\12\uffff";
    static final String DFA30_eofS =
        "\1\uffff\1\10\5\11\3\uffff";
    static final String DFA30_minS =
        "\1\4\6\16\3\uffff";
    static final String DFA30_maxS =
        "\1\42\6\31\3\uffff";
    static final String DFA30_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA30_specialS =
        "\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\31\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\10\5\uffff\1\10\1\uffff\1\10\2\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\2\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\2\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\2\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\2\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\2\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1295:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000014001002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel164 = new BitSet(new long[]{0x0000000014001002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_ruleDeclaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_entryRuleClient320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClient330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleClient367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClient384 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClient406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClient424 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleClient445 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_ruleClient467 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_14_in_ruleClient480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_ruleHttpMethod573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_ruleHttpMethod600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_ruleHttpMethod627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_ruleHttpMethod654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_entryRuleHttpPost689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpPost699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHttpPost736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpPost753 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpPost775 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpPost793 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpPost814 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_ruleHttpPost836 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpPost858 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpPost871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_entryRuleHttpPut907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpPut917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHttpPut954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpPut971 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpPut993 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpPut1011 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpPut1032 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_ruleHttpPut1054 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpPut1076 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpPut1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_entryRuleHttpGet1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpGet1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHttpGet1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpGet1189 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpGet1211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpGet1229 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpGet1250 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpGet1272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpGet1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_entryRuleHttpDelete1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpDelete1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHttpDelete1368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpDelete1385 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpDelete1407 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpDelete1425 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpDelete1446 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpDelete1468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpDelete1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleParamsBlock1573 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_ruleParamsBlock1594 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_20_in_ruleParamsBlock1608 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_ruleParamsBlock1629 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBodyBlock1714 = new BitSet(new long[]{0x00000007C0002010L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleBodyBlock1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock1771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResponseBlock1827 = new BitSet(new long[]{0x00000007C0802012L});
    public static final BitSet FOLLOW_23_in_ruleResponseBlock1840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResponseBlock1860 = new BitSet(new long[]{0x00000007C0002012L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleResponseBlock1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleBlockType1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_ruleMember2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_ruleMember2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_entryRuleTypedMember2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedMember2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypedMember2212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypedMember2232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTypedMember2252 = new BitSet(new long[]{0x00000007C0000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypedMember2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_entryRuleSkipMember2309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkipMember2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkipMember2363 = new BitSet(new long[]{0x00000007C0002010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSkipMember2383 = new BitSet(new long[]{0x00000007C0002010L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleSkipMember2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMember2502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleMember2522 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSimpleMember2542 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleSimpleMember2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleType2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleType2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_ruleType2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_entryRuleGenericListType2745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListType2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleGenericListType2803 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleGenericListType2822 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGenericListType2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserType2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComplexTypeDeclaration3153 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleComplexTypeDeclaration3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3215 = new BitSet(new long[]{0x00000007C0002012L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumTypeDeclaration3331 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleEnumTypeDeclaration3362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3393 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_23_in_ruleEnumTypeDeclaration3411 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3432 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEnumTypeLiteral3539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3560 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_ruleEnumTypeLiteral3573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3594 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleEnumTypeLiteral3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember3644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember3696 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleEnumMember3720 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumMember3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComplexTypeLiteral3840 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral3861 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_ruleComplexTypeLiteral3874 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral3895 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruleComplexTypeLiteral3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType3945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleIntrinsicType4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleIntrinsicType4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_ruleIntrinsicType4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType4091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStringType4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType4191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanType4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType4291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleNumericType4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleNumericType4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleNumericType4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType4437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIntegerType4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType4537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLongType4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType4637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDoubleType4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4789 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFQN4808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4823 = new BitSet(new long[]{0x0000000800000002L});

}