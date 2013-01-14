package com.robotoworks.mechanoid.net.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'client'", "'{'", "'}'", "'headers'", "','", "':'", "'/'", "'params'", "'='", "'body'", "'response'", "'extends'", "'[]'", "'entity'", "'generate'", "'enum'", "'String'", "'boolean'", "'int'", "'long'", "'double'", "'.'", "'-'", "'get'", "'put'", "'post'", "'delete'", "'true'", "'false'"
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
    public static final int RULE_NUMBER=7;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_declarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:85:1: ( (lv_packageName_1_0= ruleFQN ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:86:1: (lv_packageName_1_0= ruleFQN )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:86:1: (lv_packageName_1_0= ruleFQN )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:87:3: lv_packageName_1_0= ruleFQN
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:103:2: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==26||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:104:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:104:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:105:3: lv_declarations_2_0= ruleDeclaration
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:129:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:130:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:131:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:138:1: ruleDeclaration returns [EObject current=null] : (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_UserTypeDeclaration_0 = null;

        EObject this_Client_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:141:28: ( (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:142:1: (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:142:1: (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Client_1= ruleClient )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:143:5: this_UserTypeDeclaration_0= ruleUserTypeDeclaration
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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:153:5: this_Client_1= ruleClient
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:169:1: entryRuleClient returns [EObject current=null] : iv_ruleClient= ruleClient EOF ;
    public final EObject entryRuleClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClient = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:170:2: (iv_ruleClient= ruleClient EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:171:2: iv_ruleClient= ruleClient EOF
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:178:1: ruleClient returns [EObject current=null] : (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleClientBlock ) )* otherlv_5= '}' ) ;
    public final EObject ruleClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_baseUrl_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_blocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:181:28: ( (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleClientBlock ) )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:182:1: (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleClientBlock ) )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:182:1: (otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleClientBlock ) )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:182:3: otherlv_0= 'client' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleClientBlock ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleClient367); 

                	newLeafNode(otherlv_0, grammarAccess.getClientAccess().getClientKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:186:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:187:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:187:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:188:3: lv_name_1_0= RULE_ID
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:204:2: ( (lv_baseUrl_2_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:205:1: (lv_baseUrl_2_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:205:1: (lv_baseUrl_2_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:206:3: lv_baseUrl_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleClient424); 

                	newLeafNode(otherlv_3, grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:226:1: ( (lv_blocks_4_0= ruleClientBlock ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==20||(LA4_0>=36 && LA4_0<=39)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:227:1: (lv_blocks_4_0= ruleClientBlock )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:227:1: (lv_blocks_4_0= ruleClientBlock )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:228:3: lv_blocks_4_0= ruleClientBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClientAccess().getBlocksClientBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClientBlock_in_ruleClient445);
            	    lv_blocks_4_0=ruleClientBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClientRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_4_0, 
            	            		"ClientBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleClient458); 

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


    // $ANTLR start "entryRuleClientBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:256:1: entryRuleClientBlock returns [EObject current=null] : iv_ruleClientBlock= ruleClientBlock EOF ;
    public final EObject entryRuleClientBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:257:2: (iv_ruleClientBlock= ruleClientBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:258:2: iv_ruleClientBlock= ruleClientBlock EOF
            {
             newCompositeNode(grammarAccess.getClientBlockRule()); 
            pushFollow(FOLLOW_ruleClientBlock_in_entryRuleClientBlock494);
            iv_ruleClientBlock=ruleClientBlock();

            state._fsp--;

             current =iv_ruleClientBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClientBlock504); 

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
    // $ANTLR end "entryRuleClientBlock"


    // $ANTLR start "ruleClientBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:265:1: ruleClientBlock returns [EObject current=null] : (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod ) ;
    public final EObject ruleClientBlock() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderBlock_0 = null;

        EObject this_ParamsBlock_1 = null;

        EObject this_HttpMethod_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:268:28: ( (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:269:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:269:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:270:5: this_HeaderBlock_0= ruleHeaderBlock
                    {
                     
                            newCompositeNode(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderBlock_in_ruleClientBlock551);
                    this_HeaderBlock_0=ruleHeaderBlock();

                    state._fsp--;

                     
                            current = this_HeaderBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:280:5: this_ParamsBlock_1= ruleParamsBlock
                    {
                     
                            newCompositeNode(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleClientBlock578);
                    this_ParamsBlock_1=ruleParamsBlock();

                    state._fsp--;

                     
                            current = this_ParamsBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:290:5: this_HttpMethod_2= ruleHttpMethod
                    {
                     
                            newCompositeNode(grammarAccess.getClientBlockAccess().getHttpMethodParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHttpMethod_in_ruleClientBlock605);
                    this_HttpMethod_2=ruleHttpMethod();

                    state._fsp--;

                     
                            current = this_HttpMethod_2; 
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
    // $ANTLR end "ruleClientBlock"


    // $ANTLR start "entryRuleHeaderBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:306:1: entryRuleHeaderBlock returns [EObject current=null] : iv_ruleHeaderBlock= ruleHeaderBlock EOF ;
    public final EObject entryRuleHeaderBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:307:2: (iv_ruleHeaderBlock= ruleHeaderBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:308:2: iv_ruleHeaderBlock= ruleHeaderBlock EOF
            {
             newCompositeNode(grammarAccess.getHeaderBlockRule()); 
            pushFollow(FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock640);
            iv_ruleHeaderBlock=ruleHeaderBlock();

            state._fsp--;

             current =iv_ruleHeaderBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderBlock650); 

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
    // $ANTLR end "entryRuleHeaderBlock"


    // $ANTLR start "ruleHeaderBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:315:1: ruleHeaderBlock returns [EObject current=null] : (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headers_1_0 = null;

        EObject lv_headers_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:318:28: ( (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:319:1: (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:319:1: (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:319:3: otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHeaderBlock687); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:323:1: ( (lv_headers_1_0= ruleHeader ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:324:1: (lv_headers_1_0= ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:324:1: (lv_headers_1_0= ruleHeader )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:325:3: lv_headers_1_0= ruleHeader
            {
             
            	        newCompositeNode(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHeader_in_ruleHeaderBlock708);
            lv_headers_1_0=ruleHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderBlockRule());
            	        }
                   		add(
                   			current, 
                   			"headers",
                    		lv_headers_1_0, 
                    		"Header");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:341:2: (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:341:4: otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleHeaderBlock721); 

            	        	newLeafNode(otherlv_2, grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:345:1: ( (lv_headers_3_0= ruleHeader ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:346:1: (lv_headers_3_0= ruleHeader )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:346:1: (lv_headers_3_0= ruleHeader )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:347:3: lv_headers_3_0= ruleHeader
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeader_in_ruleHeaderBlock742);
            	    lv_headers_3_0=ruleHeader();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"headers",
            	            		lv_headers_3_0, 
            	            		"Header");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleHeaderBlock"


    // $ANTLR start "entryRuleHeader"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:371:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:372:2: (iv_ruleHeader= ruleHeader EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:373:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader780);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader790); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:380:1: ruleHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:383:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:384:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:384:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:384:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:384:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:385:1: (lv_name_0_0= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:385:1: (lv_name_0_0= RULE_STRING )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:386:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeader832); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleHeader849); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:406:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:407:1: (lv_value_2_0= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:407:1: (lv_value_2_0= RULE_STRING )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:408:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeader866); 

            			newLeafNode(lv_value_2_0, grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleHttpMethod"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:432:1: entryRuleHttpMethod returns [EObject current=null] : iv_ruleHttpMethod= ruleHttpMethod EOF ;
    public final EObject entryRuleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethod = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:433:2: (iv_ruleHttpMethod= ruleHttpMethod EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:434:2: iv_ruleHttpMethod= ruleHttpMethod EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod907);
            iv_ruleHttpMethod=ruleHttpMethod();

            state._fsp--;

             current =iv_ruleHttpMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod917); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:441:1: ruleHttpMethod returns [EObject current=null] : ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' ) ;
    public final EObject ruleHttpMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_path_2_0 = null;

        EObject lv_blocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:444:28: ( ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:445:1: ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:445:1: ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:445:2: ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}'
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:445:2: ( (lv_type_0_0= ruleHttpMethodType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:446:1: (lv_type_0_0= ruleHttpMethodType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:446:1: (lv_type_0_0= ruleHttpMethodType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:447:3: lv_type_0_0= ruleHttpMethodType
            {
             
            	        newCompositeNode(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHttpMethodType_in_ruleHttpMethod963);
            lv_type_0_0=ruleHttpMethodType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHttpMethodRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"HttpMethodType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:463:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:464:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpMethod980); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:481:2: ( (lv_path_2_0= rulePath ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:482:1: (lv_path_2_0= rulePath )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:482:1: (lv_path_2_0= rulePath )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:483:3: lv_path_2_0= rulePath
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_ruleHttpMethod1006);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"Path");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleHttpMethod1019); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:503:1: ( (lv_blocks_4_0= ruleHttpMethodBlock ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||LA8_0==20||(LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:504:1: (lv_blocks_4_0= ruleHttpMethodBlock )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:504:1: (lv_blocks_4_0= ruleHttpMethodBlock )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:505:3: lv_blocks_4_0= ruleHttpMethodBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHttpMethodBlock_in_ruleHttpMethod1040);
            	    lv_blocks_4_0=ruleHttpMethodBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHttpMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_4_0, 
            	            		"HttpMethodBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleHttpMethod1053); 

                	newLeafNode(otherlv_5, grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleHttpMethodBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:533:1: entryRuleHttpMethodBlock returns [EObject current=null] : iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF ;
    public final EObject entryRuleHttpMethodBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethodBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:534:2: (iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:535:2: iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodBlockRule()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock1089);
            iv_ruleHttpMethodBlock=ruleHttpMethodBlock();

            state._fsp--;

             current =iv_ruleHttpMethodBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethodBlock1099); 

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
    // $ANTLR end "entryRuleHttpMethodBlock"


    // $ANTLR start "ruleHttpMethodBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:542:1: ruleHttpMethodBlock returns [EObject current=null] : (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock ) ;
    public final EObject ruleHttpMethodBlock() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderBlock_0 = null;

        EObject this_ParamsBlock_1 = null;

        EObject this_BodyBlock_2 = null;

        EObject this_ResponseBlock_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:545:28: ( (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:546:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:546:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:547:5: this_HeaderBlock_0= ruleHeaderBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderBlock_in_ruleHttpMethodBlock1146);
                    this_HeaderBlock_0=ruleHeaderBlock();

                    state._fsp--;

                     
                            current = this_HeaderBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:557:5: this_ParamsBlock_1= ruleParamsBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpMethodBlock1173);
                    this_ParamsBlock_1=ruleParamsBlock();

                    state._fsp--;

                     
                            current = this_ParamsBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:567:5: this_BodyBlock_2= ruleBodyBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBodyBlock_in_ruleHttpMethodBlock1200);
                    this_BodyBlock_2=ruleBodyBlock();

                    state._fsp--;

                     
                            current = this_BodyBlock_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:577:5: this_ResponseBlock_3= ruleResponseBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpMethodBlock1227);
                    this_ResponseBlock_3=ruleResponseBlock();

                    state._fsp--;

                     
                            current = this_ResponseBlock_3; 
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
    // $ANTLR end "ruleHttpMethodBlock"


    // $ANTLR start "entryRulePath"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:593:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:594:2: (iv_rulePath= rulePath EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:595:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath1262);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1272); 

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:602:1: rulePath returns [EObject current=null] : ( () otherlv_1= '/' (this_ID_2= RULE_ID | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_4=null;
        Token this_ID_5=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:605:28: ( ( () otherlv_1= '/' (this_ID_2= RULE_ID | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:606:1: ( () otherlv_1= '/' (this_ID_2= RULE_ID | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:606:1: ( () otherlv_1= '/' (this_ID_2= RULE_ID | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:606:2: () otherlv_1= '/' (this_ID_2= RULE_ID | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )*
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:606:2: ()
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:607:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPathAccess().getPathAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePath1318); 

                	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getSolidusKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:616:1: (this_ID_2= RULE_ID | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==14||LA10_1==19) ) {
                    alt10=1;
                }
                else if ( (LA10_1==18) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:616:2: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath1330); 
                     
                        newLeafNode(this_ID_2, grammarAccess.getPathAccess().getIDTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:621:6: ( (lv_params_3_0= ruleSimpleMemberAssignment ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:621:6: ( (lv_params_3_0= ruleSimpleMemberAssignment ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:622:1: (lv_params_3_0= ruleSimpleMemberAssignment )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:622:1: (lv_params_3_0= ruleSimpleMemberAssignment )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:623:3: lv_params_3_0= ruleSimpleMemberAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rulePath1356);
                    lv_params_3_0=ruleSimpleMemberAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"SimpleMemberAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:639:3: (otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:639:5: otherlv_4= '/' (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePath1370); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getSolidusKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:643:1: (this_ID_5= RULE_ID | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ID) ) {
            	        int LA11_1 = input.LA(2);

            	        if ( (LA11_1==EOF||LA11_1==14||LA11_1==19) ) {
            	            alt11=1;
            	        }
            	        else if ( (LA11_1==18) ) {
            	            alt11=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 1, input);

            	            throw nvae;
            	        }
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
            	            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:643:2: this_ID_5= RULE_ID
            	            {
            	            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath1382); 
            	             
            	                newLeafNode(this_ID_5, grammarAccess.getPathAccess().getIDTerminalRuleCall_3_1_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:648:6: ( (lv_params_6_0= ruleSimpleMemberAssignment ) )
            	            {
            	            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:648:6: ( (lv_params_6_0= ruleSimpleMemberAssignment ) )
            	            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:649:1: (lv_params_6_0= ruleSimpleMemberAssignment )
            	            {
            	            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:649:1: (lv_params_6_0= ruleSimpleMemberAssignment )
            	            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:650:3: lv_params_6_0= ruleSimpleMemberAssignment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rulePath1408);
            	            lv_params_6_0=ruleSimpleMemberAssignment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"params",
            	                    		lv_params_6_0, 
            	                    		"SimpleMemberAssignment");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleParamsBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:674:1: entryRuleParamsBlock returns [EObject current=null] : iv_ruleParamsBlock= ruleParamsBlock EOF ;
    public final EObject entryRuleParamsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamsBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:675:2: (iv_ruleParamsBlock= ruleParamsBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:676:2: iv_ruleParamsBlock= ruleParamsBlock EOF
            {
             newCompositeNode(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1447);
            iv_ruleParamsBlock=ruleParamsBlock();

            state._fsp--;

             current =iv_ruleParamsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock1457); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:683:1: ruleParamsBlock returns [EObject current=null] : ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* ) ;
    public final EObject ruleParamsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:686:28: ( ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:687:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:687:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:687:2: () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )*
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:687:2: ()
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:688:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamsBlockAccess().getParamsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParamsBlock1503); 

                	newLeafNode(otherlv_1, grammarAccess.getParamsBlockAccess().getParamsKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:697:1: ( (lv_params_2_0= ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:698:1: (lv_params_2_0= ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:698:1: (lv_params_2_0= ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:699:3: lv_params_2_0= ruleSimpleMemberAssignment
            {
             
            	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1524);
            lv_params_2_0=ruleSimpleMemberAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"SimpleMemberAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:715:2: (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:715:4: otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleParamsBlock1537); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:719:1: ( (lv_params_4_0= ruleSimpleMemberAssignment ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:720:1: (lv_params_4_0= ruleSimpleMemberAssignment )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:720:1: (lv_params_4_0= ruleSimpleMemberAssignment )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:721:3: lv_params_4_0= ruleSimpleMemberAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1558);
            	    lv_params_4_0=ruleSimpleMemberAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"SimpleMemberAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "entryRuleSimpleMemberAssignment"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:745:1: entryRuleSimpleMemberAssignment returns [EObject current=null] : iv_ruleSimpleMemberAssignment= ruleSimpleMemberAssignment EOF ;
    public final EObject entryRuleSimpleMemberAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMemberAssignment = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:746:2: (iv_ruleSimpleMemberAssignment= ruleSimpleMemberAssignment EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:747:2: iv_ruleSimpleMemberAssignment= ruleSimpleMemberAssignment EOF
            {
             newCompositeNode(grammarAccess.getSimpleMemberAssignmentRule()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment1596);
            iv_ruleSimpleMemberAssignment=ruleSimpleMemberAssignment();

            state._fsp--;

             current =iv_ruleSimpleMemberAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMemberAssignment1606); 

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
    // $ANTLR end "entryRuleSimpleMemberAssignment"


    // $ANTLR start "ruleSimpleMemberAssignment"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:754:1: ruleSimpleMemberAssignment returns [EObject current=null] : ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleSimpleMemberAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_member_0_0 = null;

        EObject lv_defaultValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:757:28: ( ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:758:1: ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:758:1: ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:758:2: ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:758:2: ( (lv_member_0_0= ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:759:1: (lv_member_0_0= ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:759:1: (lv_member_0_0= ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:760:3: lv_member_0_0= ruleSimpleMember
            {
             
            	        newCompositeNode(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleMember_in_ruleSimpleMemberAssignment1652);
            lv_member_0_0=ruleSimpleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleMemberAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"member",
                    		lv_member_0_0, 
                    		"SimpleMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:776:2: (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:776:4: otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSimpleMemberAssignment1665); 

                        	newLeafNode(otherlv_1, grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:780:1: ( (lv_defaultValue_2_0= ruleLiteral ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:781:1: (lv_defaultValue_2_0= ruleLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:781:1: (lv_defaultValue_2_0= ruleLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:782:3: lv_defaultValue_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleSimpleMemberAssignment1686);
                    lv_defaultValue_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleMemberAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleSimpleMemberAssignment"


    // $ANTLR start "entryRuleLiteral"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:806:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:807:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:808:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1724);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1734); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:815:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Enumerator lv_literal_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:818:28: ( ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:819:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:819:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case RULE_NUMBER:
            case 35:
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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:819:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:819:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:819:3: () ( (lv_literal_1_0= ruleBooleanValue ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:819:3: ()
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:820:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:825:2: ( (lv_literal_1_0= ruleBooleanValue ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:826:1: (lv_literal_1_0= ruleBooleanValue )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:826:1: (lv_literal_1_0= ruleBooleanValue )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:827:3: lv_literal_1_0= ruleBooleanValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteral1790);
                    lv_literal_1_0=ruleBooleanValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_1_0, 
                            		"BooleanValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:844:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:844:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:844:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:844:7: ()
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:845:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:850:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:851:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:851:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:852:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral1824); 

                    			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"literal",
                            		lv_literal_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:869:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:869:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:869:7: () ( (lv_literal_5_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:869:7: ()
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:870:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:875:2: ( (lv_literal_5_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:876:1: (lv_literal_5_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:876:1: (lv_literal_5_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:877:3: lv_literal_5_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteral1867);
                    lv_literal_5_0=ruleSignedNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_5_0, 
                            		"SignedNumber");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBodyBlock"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:901:1: entryRuleBodyBlock returns [EObject current=null] : iv_ruleBodyBlock= ruleBodyBlock EOF ;
    public final EObject entryRuleBodyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:902:2: (iv_ruleBodyBlock= ruleBodyBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:903:2: iv_ruleBodyBlock= ruleBodyBlock EOF
            {
             newCompositeNode(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock1904);
            iv_ruleBodyBlock=ruleBodyBlock();

            state._fsp--;

             current =iv_ruleBodyBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock1914); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:910:1: ruleBodyBlock returns [EObject current=null] : (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) ) ;
    public final EObject ruleBodyBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:913:28: ( (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:914:1: (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:914:1: (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:914:3: otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBodyBlock1951); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyBlockAccess().getBodyKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:918:1: ( (lv_type_1_0= ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:919:1: (lv_type_1_0= ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:919:1: (lv_type_1_0= ruleBlockType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:920:3: lv_type_1_0= ruleBlockType
            {
             
            	        newCompositeNode(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlockType_in_ruleBodyBlock1972);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:944:1: entryRuleResponseBlock returns [EObject current=null] : iv_ruleResponseBlock= ruleResponseBlock EOF ;
    public final EObject entryRuleResponseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseBlock = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:945:2: (iv_ruleResponseBlock= ruleResponseBlock EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:946:2: iv_ruleResponseBlock= ruleResponseBlock EOF
            {
             newCompositeNode(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock2008);
            iv_ruleResponseBlock=ruleResponseBlock();

            state._fsp--;

             current =iv_ruleResponseBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock2018); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:953:1: ruleResponseBlock returns [EObject current=null] : ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? ) ;
    public final EObject ruleResponseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:956:28: ( ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:957:1: ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:957:1: ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:957:2: () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:957:2: ()
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:958:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResponseBlockAccess().getResponseBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleResponseBlock2064); 

                	newLeafNode(otherlv_1, grammarAccess.getResponseBlockAccess().getResponseKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:967:1: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:967:3: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleResponseBlock2077); 

                        	newLeafNode(otherlv_2, grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:971:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:972:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:972:1: (otherlv_3= RULE_ID )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:973:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResponseBlock2097); 

                    		newLeafNode(otherlv_3, grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:984:4: ( (lv_type_4_0= ruleBlockType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==14||(LA17_0>=29 && LA17_0<=33)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:985:1: (lv_type_4_0= ruleBlockType )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:985:1: (lv_type_4_0= ruleBlockType )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:986:3: lv_type_4_0= ruleBlockType
                    {
                     
                    	        newCompositeNode(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockType_in_ruleResponseBlock2120);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1010:1: entryRuleBlockType returns [EObject current=null] : iv_ruleBlockType= ruleBlockType EOF ;
    public final EObject entryRuleBlockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1011:2: (iv_ruleBlockType= ruleBlockType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1012:2: iv_ruleBlockType= ruleBlockType EOF
            {
             newCompositeNode(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType2157);
            iv_ruleBlockType=ruleBlockType();

            state._fsp--;

             current =iv_ruleBlockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType2167); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1019:1: ruleBlockType returns [EObject current=null] : (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) ;
    public final EObject ruleBlockType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ComplexTypeLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1022:28: ( (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1023:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1023:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=29 && LA18_0<=33)) ) {
                alt18=1;
            }
            else if ( (LA18_0==14) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1024:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleBlockType2214);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1034:5: this_ComplexTypeLiteral_1= ruleComplexTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2241);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1050:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1051:2: (iv_ruleMember= ruleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1052:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2276);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2286); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1059:1: ruleMember returns [EObject current=null] : (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_TypedMember_0 = null;

        EObject this_SkipMember_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1062:28: ( (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1063:1: (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1063:1: (this_TypedMember_0= ruleTypedMember | this_SkipMember_1= ruleSkipMember )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==14) ) {
                    alt19=2;
                }
                else if ( (LA19_1==18) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_STRING) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==14) ) {
                    alt19=2;
                }
                else if ( (LA19_2==18) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1064:5: this_TypedMember_0= ruleTypedMember
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypedMember_in_ruleMember2333);
                    this_TypedMember_0=ruleTypedMember();

                    state._fsp--;

                     
                            current = this_TypedMember_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1074:5: this_SkipMember_1= ruleSkipMember
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSkipMember_in_ruleMember2360);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1090:1: entryRuleTypedMember returns [EObject current=null] : iv_ruleTypedMember= ruleTypedMember EOF ;
    public final EObject entryRuleTypedMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1091:2: (iv_ruleTypedMember= ruleTypedMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1092:2: iv_ruleTypedMember= ruleTypedMember EOF
            {
             newCompositeNode(grammarAccess.getTypedMemberRule()); 
            pushFollow(FOLLOW_ruleTypedMember_in_entryRuleTypedMember2395);
            iv_ruleTypedMember=ruleTypedMember();

            state._fsp--;

             current =iv_ruleTypedMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedMember2405); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1099:1: ruleTypedMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleTypedMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1102:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1103:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1103:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1103:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1103:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1104:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1104:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1105:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1105:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1106:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypedMember2449); 

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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1121:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypedMember2469); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTypedMember2489); 

                	newLeafNode(otherlv_1, grammarAccess.getTypedMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1143:1: ( (lv_type_2_0= ruleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1144:1: (lv_type_2_0= ruleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1144:1: (lv_type_2_0= ruleType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1145:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypedMember2510);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1169:1: entryRuleSkipMember returns [EObject current=null] : iv_ruleSkipMember= ruleSkipMember EOF ;
    public final EObject entryRuleSkipMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1170:2: (iv_ruleSkipMember= ruleSkipMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1171:2: iv_ruleSkipMember= ruleSkipMember EOF
            {
             newCompositeNode(grammarAccess.getSkipMemberRule()); 
            pushFollow(FOLLOW_ruleSkipMember_in_entryRuleSkipMember2546);
            iv_ruleSkipMember=ruleSkipMember();

            state._fsp--;

             current =iv_ruleSkipMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkipMember2556); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1178:1: ruleSkipMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) ) ;
    public final EObject ruleSkipMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        EObject lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1181:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1182:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1182:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1182:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ( (lv_literal_1_0= ruleComplexTypeLiteral ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1182:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1183:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1183:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1184:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1184:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1185:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkipMember2600); 

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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1200:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSkipMember2620); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1218:2: ( (lv_literal_1_0= ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1219:1: (lv_literal_1_0= ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1219:1: (lv_literal_1_0= ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1220:3: lv_literal_1_0= ruleComplexTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleSkipMember2649);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1244:1: entryRuleSimpleMember returns [EObject current=null] : iv_ruleSimpleMember= ruleSimpleMember EOF ;
    public final EObject entryRuleSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1245:2: (iv_ruleSimpleMember= ruleSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1246:2: iv_ruleSimpleMember= ruleSimpleMember EOF
            {
             newCompositeNode(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2685);
            iv_ruleSimpleMember=ruleSimpleMember();

            state._fsp--;

             current =iv_ruleSimpleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember2695); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1253:1: ruleSimpleMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) ;
    public final EObject ruleSimpleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1256:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1257:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1257:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1257:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1257:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1258:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1258:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1259:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1259:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1260:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleMember2739); 

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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1275:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleMember2759); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSimpleMember2779); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleMemberAccess().getColonKeyword_1());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1297:1: ( (lv_type_2_0= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1298:1: (lv_type_2_0= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1298:1: (lv_type_2_0= ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1299:3: lv_type_2_0= ruleIntrinsicType
            {
             
            	        newCompositeNode(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntrinsicType_in_ruleSimpleMember2800);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1323:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1324:2: (iv_ruleType= ruleType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1325:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2836);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2846); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1332:1: ruleType returns [EObject current=null] : (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_UserType_0 = null;

        EObject this_IntrinsicType_1 = null;

        EObject this_GenericListType_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1335:28: ( (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1336:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1336:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1337:5: this_UserType_0= ruleUserType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserType_in_ruleType2893);
                    this_UserType_0=ruleUserType();

                    state._fsp--;

                     
                            current = this_UserType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1347:5: this_IntrinsicType_1= ruleIntrinsicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleType2920);
                    this_IntrinsicType_1=ruleIntrinsicType();

                    state._fsp--;

                     
                            current = this_IntrinsicType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1357:5: this_GenericListType_2= ruleGenericListType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGenericListType_in_ruleType2947);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1373:1: entryRuleGenericListType returns [EObject current=null] : iv_ruleGenericListType= ruleGenericListType EOF ;
    public final EObject entryRuleGenericListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericListType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1374:2: (iv_ruleGenericListType= ruleGenericListType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1375:2: iv_ruleGenericListType= ruleGenericListType EOF
            {
             newCompositeNode(grammarAccess.getGenericListTypeRule()); 
            pushFollow(FOLLOW_ruleGenericListType_in_entryRuleGenericListType2982);
            iv_ruleGenericListType=ruleGenericListType();

            state._fsp--;

             current =iv_ruleGenericListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListType2992); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1382:1: ruleGenericListType returns [EObject current=null] : ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) ;
    public final EObject ruleGenericListType() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_elementType_0_1 = null;

        EObject lv_elementType_0_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1385:28: ( ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1386:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1386:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1386:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1386:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1387:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1387:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1388:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1388:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=29 && LA24_0<=33)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1389:3: lv_elementType_0_1= ruleUserType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserType_in_ruleGenericListType3040);
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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1404:8: lv_elementType_0_2= ruleIntrinsicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleGenericListType3059);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1422:2: ( (lv_id_1_0= '[]' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1423:1: (lv_id_1_0= '[]' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1423:1: (lv_id_1_0= '[]' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1424:3: lv_id_1_0= '[]'
            {
            lv_id_1_0=(Token)match(input,25,FOLLOW_25_in_ruleGenericListType3080); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1445:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1446:2: (iv_ruleUserType= ruleUserType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1447:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType3129);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType3139); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1454:1: ruleUserType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1457:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1458:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1458:1: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1459:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1459:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1460:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserType3183); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1479:1: entryRuleUserTypeDeclaration returns [EObject current=null] : iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF ;
    public final EObject entryRuleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1480:2: (iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1481:2: iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration3218);
            iv_ruleUserTypeDeclaration=ruleUserTypeDeclaration();

            state._fsp--;

             current =iv_ruleUserTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration3228); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1488:1: ruleUserTypeDeclaration returns [EObject current=null] : (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) ;
    public final EObject ruleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexTypeDeclaration_0 = null;

        EObject this_EnumTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1491:28: ( (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1492:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1492:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            else if ( (LA25_0==28) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1493:5: this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3275);
                    this_ComplexTypeDeclaration_0=ruleComplexTypeDeclaration();

                    state._fsp--;

                     
                            current = this_ComplexTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1503:5: this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3302);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1519:1: entryRuleComplexTypeDeclaration returns [EObject current=null] : iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF ;
    public final EObject entryRuleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1520:2: (iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1521:2: iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3337);
            iv_ruleComplexTypeDeclaration=ruleComplexTypeDeclaration();

            state._fsp--;

             current =iv_ruleComplexTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3347); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1528:1: ruleComplexTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) ;
    public final EObject ruleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_gen_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1531:28: ( ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1532:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1532:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1532:2: ( (lv_keyword_0_0= 'entity' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1532:2: ( (lv_keyword_0_0= 'entity' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1533:1: (lv_keyword_0_0= 'entity' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1533:1: (lv_keyword_0_0= 'entity' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1534:3: lv_keyword_0_0= 'entity'
            {
            lv_keyword_0_0=(Token)match(input,26,FOLLOW_26_in_ruleComplexTypeDeclaration3390); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "entity");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1547:2: ( (lv_gen_1_0= 'generate' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1548:1: (lv_gen_1_0= 'generate' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1548:1: (lv_gen_1_0= 'generate' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1549:3: lv_gen_1_0= 'generate'
                    {
                    lv_gen_1_0=(Token)match(input,27,FOLLOW_27_in_ruleComplexTypeDeclaration3421); 

                            newLeafNode(lv_gen_1_0, grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "gen", true, "generate");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1562:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1563:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1563:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1564:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3452); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1580:2: ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1581:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1581:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1582:3: lv_literal_3_0= ruleComplexTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3478);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1606:1: entryRuleEnumTypeDeclaration returns [EObject current=null] : iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF ;
    public final EObject entryRuleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDeclaration = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1607:2: (iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1608:2: iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3515);
            iv_ruleEnumTypeDeclaration=ruleEnumTypeDeclaration();

            state._fsp--;

             current =iv_ruleEnumTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3525); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1615:1: ruleEnumTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) ;
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
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1618:28: ( ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1619:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1619:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1619:2: ( (lv_keyword_0_0= 'enum' ) ) ( (lv_gen_1_0= 'generate' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1619:2: ( (lv_keyword_0_0= 'enum' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1620:1: (lv_keyword_0_0= 'enum' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1620:1: (lv_keyword_0_0= 'enum' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1621:3: lv_keyword_0_0= 'enum'
            {
            lv_keyword_0_0=(Token)match(input,28,FOLLOW_28_in_ruleEnumTypeDeclaration3568); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "enum");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1634:2: ( (lv_gen_1_0= 'generate' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1635:1: (lv_gen_1_0= 'generate' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1635:1: (lv_gen_1_0= 'generate' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1636:3: lv_gen_1_0= 'generate'
                    {
                    lv_gen_1_0=(Token)match(input,27,FOLLOW_27_in_ruleEnumTypeDeclaration3599); 

                            newLeafNode(lv_gen_1_0, grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "gen", true, "generate");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1649:3: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1650:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1650:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1651:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3630); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1667:2: (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1667:4: otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleEnumTypeDeclaration3648); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1671:1: ( (lv_superType_4_0= ruleIntegerType ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1672:1: (lv_superType_4_0= ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1672:1: (lv_superType_4_0= ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1673:3: lv_superType_4_0= ruleIntegerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3669);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1689:4: ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1690:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1690:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1691:3: lv_literal_5_0= ruleEnumTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3692);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1715:1: entryRuleEnumTypeLiteral returns [EObject current=null] : iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF ;
    public final EObject entryRuleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1716:2: (iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1717:2: iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3729);
            iv_ruleEnumTypeLiteral=ruleEnumTypeLiteral();

            state._fsp--;

             current =iv_ruleEnumTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral3739); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1724:1: ruleEnumTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1727:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1728:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1728:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1728:3: otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEnumTypeLiteral3776); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1732:1: ( (lv_members_1_0= ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1733:1: (lv_members_1_0= ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1733:1: (lv_members_1_0= ruleEnumMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1734:3: lv_members_1_0= ruleEnumMember
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3797);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1750:2: (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1750:4: otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEnumTypeLiteral3810); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1754:1: ( (lv_members_3_0= ruleEnumMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1755:1: (lv_members_3_0= ruleEnumMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1755:1: (lv_members_3_0= ruleEnumMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1756:3: lv_members_3_0= ruleEnumMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3831);
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
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEnumTypeLiteral3845); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1784:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1785:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1786:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             newCompositeNode(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember3881);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember3891); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1793:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_assignment_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1796:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1797:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1797:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1797:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1797:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1798:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1798:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1799:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember3933); 

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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1815:2: ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1815:3: ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1815:3: ( (lv_assignment_1_0= '=' ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1816:1: (lv_assignment_1_0= '=' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1816:1: (lv_assignment_1_0= '=' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1817:3: lv_assignment_1_0= '='
                    {
                    lv_assignment_1_0=(Token)match(input,21,FOLLOW_21_in_ruleEnumMember3957); 

                            newLeafNode(lv_assignment_1_0, grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(current, "assignment", true, "=");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1830:2: ( (lv_value_2_0= RULE_INT ) )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1831:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1831:1: (lv_value_2_0= RULE_INT )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1832:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumMember3987); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1856:1: entryRuleComplexTypeLiteral returns [EObject current=null] : iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF ;
    public final EObject entryRuleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1857:2: (iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1858:2: iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral4030);
            iv_ruleComplexTypeLiteral=ruleComplexTypeLiteral();

            state._fsp--;

             current =iv_ruleComplexTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral4040); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1865:1: ruleComplexTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1868:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1869:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1869:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1869:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComplexTypeLiteral4077); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1873:1: ( (lv_members_1_0= ruleMember ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1874:1: (lv_members_1_0= ruleMember )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1874:1: (lv_members_1_0= ruleMember )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1875:3: lv_members_1_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral4098);
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

            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1891:2: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1891:4: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleComplexTypeLiteral4111); 

            	        	newLeafNode(otherlv_2, grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1895:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1896:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1896:1: (lv_members_3_0= ruleMember )
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1897:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral4132);
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
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleComplexTypeLiteral4146); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1925:1: entryRuleIntrinsicType returns [EObject current=null] : iv_ruleIntrinsicType= ruleIntrinsicType EOF ;
    public final EObject entryRuleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntrinsicType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1926:2: (iv_ruleIntrinsicType= ruleIntrinsicType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1927:2: iv_ruleIntrinsicType= ruleIntrinsicType EOF
            {
             newCompositeNode(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType4182);
            iv_ruleIntrinsicType=ruleIntrinsicType();

            state._fsp--;

             current =iv_ruleIntrinsicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType4192); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1934:1: ruleIntrinsicType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject ruleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1937:28: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1938:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1938:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt34=1;
                }
                break;
            case 30:
                {
                alt34=2;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1939:5: this_StringType_0= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleIntrinsicType4239);
                    this_StringType_0=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1949:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleIntrinsicType4266);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1959:5: this_NumericType_2= ruleNumericType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumericType_in_ruleIntrinsicType4293);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1975:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1976:2: (iv_ruleStringType= ruleStringType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1977:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType4328);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType4338); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1984:1: ruleStringType returns [EObject current=null] : ( (lv_id_0_0= 'String' ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1987:28: ( ( (lv_id_0_0= 'String' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1988:1: ( (lv_id_0_0= 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1988:1: ( (lv_id_0_0= 'String' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1989:1: (lv_id_0_0= 'String' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1989:1: (lv_id_0_0= 'String' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:1990:3: lv_id_0_0= 'String'
            {
            lv_id_0_0=(Token)match(input,29,FOLLOW_29_in_ruleStringType4380); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2011:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2012:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2013:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType4428);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType4438); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2020:1: ruleBooleanType returns [EObject current=null] : ( (lv_id_0_0= 'boolean' ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2023:28: ( ( (lv_id_0_0= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2024:1: ( (lv_id_0_0= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2024:1: ( (lv_id_0_0= 'boolean' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2025:1: (lv_id_0_0= 'boolean' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2025:1: (lv_id_0_0= 'boolean' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2026:3: lv_id_0_0= 'boolean'
            {
            lv_id_0_0=(Token)match(input,30,FOLLOW_30_in_ruleBooleanType4480); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2047:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2048:2: (iv_ruleNumericType= ruleNumericType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2049:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType4528);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType4538); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2056:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_LongType_1 = null;

        EObject this_DoubleType_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2059:28: ( (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2060:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2060:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt35=1;
                }
                break;
            case 32:
                {
                alt35=2;
                }
                break;
            case 33:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2061:5: this_IntegerType_0= ruleIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleNumericType4585);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;

                     
                            current = this_IntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2071:5: this_LongType_1= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleNumericType4612);
                    this_LongType_1=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2081:5: this_DoubleType_2= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleNumericType4639);
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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2097:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2098:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2099:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType4674);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType4684); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2106:1: ruleIntegerType returns [EObject current=null] : ( (lv_id_0_0= 'int' ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2109:28: ( ( (lv_id_0_0= 'int' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2110:1: ( (lv_id_0_0= 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2110:1: ( (lv_id_0_0= 'int' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2111:1: (lv_id_0_0= 'int' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2111:1: (lv_id_0_0= 'int' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2112:3: lv_id_0_0= 'int'
            {
            lv_id_0_0=(Token)match(input,31,FOLLOW_31_in_ruleIntegerType4726); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2133:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2134:2: (iv_ruleLongType= ruleLongType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2135:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType4774);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType4784); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2142:1: ruleLongType returns [EObject current=null] : ( (lv_id_0_0= 'long' ) ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2145:28: ( ( (lv_id_0_0= 'long' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2146:1: ( (lv_id_0_0= 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2146:1: ( (lv_id_0_0= 'long' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2147:1: (lv_id_0_0= 'long' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2147:1: (lv_id_0_0= 'long' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2148:3: lv_id_0_0= 'long'
            {
            lv_id_0_0=(Token)match(input,32,FOLLOW_32_in_ruleLongType4826); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2169:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2170:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2171:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType4874);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType4884); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2178:1: ruleDoubleType returns [EObject current=null] : ( (lv_id_0_0= 'double' ) ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2181:28: ( ( (lv_id_0_0= 'double' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2182:1: ( (lv_id_0_0= 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2182:1: ( (lv_id_0_0= 'double' ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2183:1: (lv_id_0_0= 'double' )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2183:1: (lv_id_0_0= 'double' )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2184:3: lv_id_0_0= 'double'
            {
            lv_id_0_0=(Token)match(input,33,FOLLOW_33_in_ruleDoubleType4926); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2205:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2206:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2207:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4975);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4986); 

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
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2214:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2217:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2218:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5026); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2225:1: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2226:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleFQN5045); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5060); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
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


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2246:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2247:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2248:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber5108);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber5119); 

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
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2255:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2258:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2259:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2259:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2259:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2259:2: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2260:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSignedNumber5158); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber5175); 

            		current.merge(this_NUMBER_1);
                
             
                newLeafNode(this_NUMBER_1, grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "ruleHttpMethodType"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2280:1: ruleHttpMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator ruleHttpMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2282:28: ( ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2283:1: ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2283:1: ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt38=1;
                }
                break;
            case 37:
                {
                alt38=2;
                }
                break;
            case 38:
                {
                alt38=3;
                }
                break;
            case 39:
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
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2283:2: (enumLiteral_0= 'get' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2283:2: (enumLiteral_0= 'get' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2283:4: enumLiteral_0= 'get'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleHttpMethodType5234); 

                            current = grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2289:6: (enumLiteral_1= 'put' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2289:6: (enumLiteral_1= 'put' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2289:8: enumLiteral_1= 'put'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleHttpMethodType5251); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2295:6: (enumLiteral_2= 'post' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2295:6: (enumLiteral_2= 'post' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2295:8: enumLiteral_2= 'post'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_ruleHttpMethodType5268); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2301:6: (enumLiteral_3= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2301:6: (enumLiteral_3= 'delete' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2301:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_39_in_ruleHttpMethodType5285); 

                            current = grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleHttpMethodType"


    // $ANTLR start "ruleBooleanValue"
    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2311:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2313:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2314:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2314:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            else if ( (LA39_0==41) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2314:2: (enumLiteral_0= 'true' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2314:2: (enumLiteral_0= 'true' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2314:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleBooleanValue5330); 

                            current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2320:6: (enumLiteral_1= 'false' )
                    {
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2320:6: (enumLiteral_1= 'false' )
                    // ../com.robotoworks.mechanoid.net/src-gen/com/robotoworks/mechanoid/net/parser/antlr/internal/InternalNetModel.g:2320:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleBooleanValue5347); 

                            current = grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleBooleanValue"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\12\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\7\5\11\3\uffff";
    static final String DFA23_minS =
        "\1\4\6\17\3\uffff";
    static final String DFA23_maxS =
        "\1\41\6\31\3\uffff";
    static final String DFA23_acceptS =
        "\7\uffff\1\1\1\3\1\2";
    static final String DFA23_specialS =
        "\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\30\uffff\1\2\1\3\1\4\1\5\1\6",
            "\3\7\2\uffff\1\7\1\uffff\2\7\1\uffff\1\10",
            "\3\11\2\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\2\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\2\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\2\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\2\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1336:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_GenericListType_2= ruleGenericListType )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000014002002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel164 = new BitSet(new long[]{0x0000000014002002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_ruleDeclaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_entryRuleClient320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClient330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleClient367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClient384 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClient406 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClient424 = new BitSet(new long[]{0x000000F000118000L});
    public static final BitSet FOLLOW_ruleClientBlock_in_ruleClient445 = new BitSet(new long[]{0x000000F000118000L});
    public static final BitSet FOLLOW_15_in_ruleClient458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientBlock_in_entryRuleClientBlock494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClientBlock504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_ruleClientBlock551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleClientBlock578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_ruleClientBlock605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderBlock650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHeaderBlock687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleHeaderBlock708 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleHeaderBlock721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleHeaderBlock742 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeader832 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHeader849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeader866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_ruleHttpMethod963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpMethod980 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rulePath_in_ruleHttpMethod1006 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHttpMethod1019 = new BitSet(new long[]{0x0000000000D18000L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_ruleHttpMethod1040 = new BitSet(new long[]{0x0000000000D18000L});
    public static final BitSet FOLLOW_15_in_ruleHttpMethod1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethodBlock1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_ruleHttpMethodBlock1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpMethodBlock1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_ruleHttpMethodBlock1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpMethodBlock1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePath1318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath1330 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rulePath1356 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePath1370 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath1382 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rulePath1408 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleParamsBlock1503 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1524 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleParamsBlock1537 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1558 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment1596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMemberAssignment1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_ruleSimpleMemberAssignment1652 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleMemberAssignment1665 = new BitSet(new long[]{0x00000308000000A0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleSimpleMemberAssignment1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteral1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteral1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock1904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBodyBlock1951 = new BitSet(new long[]{0x00000003E0004010L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleBodyBlock1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock2008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResponseBlock2064 = new BitSet(new long[]{0x00000003E1004012L});
    public static final BitSet FOLLOW_24_in_ruleResponseBlock2077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResponseBlock2097 = new BitSet(new long[]{0x00000003E0004012L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleResponseBlock2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleBlockType2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_ruleMember2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_ruleMember2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_entryRuleTypedMember2395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedMember2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypedMember2449 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypedMember2469 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTypedMember2489 = new BitSet(new long[]{0x00000003E0000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypedMember2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_entryRuleSkipMember2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkipMember2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkipMember2600 = new BitSet(new long[]{0x00000003E0004010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSkipMember2620 = new BitSet(new long[]{0x00000003E0004010L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleSkipMember2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMember2739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleMember2759 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSimpleMember2779 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleSimpleMember2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleType2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleType2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_ruleType2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_entryRuleGenericListType2982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListType2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleGenericListType3040 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleGenericListType3059 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGenericListType3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType3129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserType3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration3218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComplexTypeDeclaration3390 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleComplexTypeDeclaration3421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3452 = new BitSet(new long[]{0x00000003E0004012L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumTypeDeclaration3568 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleEnumTypeDeclaration3599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3630 = new BitSet(new long[]{0x0000000001004002L});
    public static final BitSet FOLLOW_24_in_ruleEnumTypeDeclaration3648 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3669 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEnumTypeLiteral3776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3797 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleEnumTypeLiteral3810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3831 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleEnumTypeLiteral3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember3933 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleEnumMember3957 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumMember3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral4030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComplexTypeLiteral4077 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral4098 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleComplexTypeLiteral4111 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral4132 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleComplexTypeLiteral4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType4182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleIntrinsicType4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleIntrinsicType4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_ruleIntrinsicType4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType4328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStringType4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanType4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType4528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleNumericType4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleNumericType4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleNumericType4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIntegerType4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLongType4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDoubleType4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5026 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleFQN5045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5060 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber5108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSignedNumber5158 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleHttpMethodType5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHttpMethodType5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHttpMethodType5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHttpMethodType5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBooleanValue5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBooleanValue5347 = new BitSet(new long[]{0x0000000000000002L});

}