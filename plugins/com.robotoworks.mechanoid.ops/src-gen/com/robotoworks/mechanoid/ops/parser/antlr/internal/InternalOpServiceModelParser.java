package com.robotoworks.mechanoid.ops.parser.antlr.internal; 

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
import com.robotoworks.mechanoid.ops.services.OpServiceModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpServiceModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'service'", "'{'", "'}'", "'operation'", "'('", "','", "')'", "'not'", "'unique'", "'.'", "'boolean'", "'String'", "'int'", "'float'", "'double'", "'long'", "'Parcelable'"
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
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g"; }



     	private OpServiceModelGrammarAccess grammarAccess;
     	
        public InternalOpServiceModelParser(TokenStream input, OpServiceModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected OpServiceModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_service_2_0= ruleServiceBlock ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_service_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_service_2_0= ruleServiceBlock ) ) ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_service_2_0= ruleServiceBlock ) ) )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_service_2_0= ruleServiceBlock ) ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_service_2_0= ruleServiceBlock ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:85:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:87:3: lv_packageName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:103:2: ( (lv_service_2_0= ruleServiceBlock ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:104:1: (lv_service_2_0= ruleServiceBlock )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:104:1: (lv_service_2_0= ruleServiceBlock )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:105:3: lv_service_2_0= ruleServiceBlock
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getServiceServiceBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleServiceBlock_in_ruleModel164);
            lv_service_2_0=ruleServiceBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"service",
                    		lv_service_2_0, 
                    		"ServiceBlock");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleServiceBlock"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:129:1: entryRuleServiceBlock returns [EObject current=null] : iv_ruleServiceBlock= ruleServiceBlock EOF ;
    public final EObject entryRuleServiceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceBlock = null;


        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:130:2: (iv_ruleServiceBlock= ruleServiceBlock EOF )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:131:2: iv_ruleServiceBlock= ruleServiceBlock EOF
            {
             newCompositeNode(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock200);
            iv_ruleServiceBlock=ruleServiceBlock();

            state._fsp--;

             current =iv_ruleServiceBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock210); 

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
    // $ANTLR end "entryRuleServiceBlock"


    // $ANTLR start "ruleServiceBlock"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:138:1: ruleServiceBlock returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ops_3_0= ruleOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleServiceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:141:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ops_3_0= ruleOperation ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:142:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ops_3_0= ruleOperation ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:142:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ops_3_0= ruleOperation ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:142:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ops_3_0= ruleOperation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleServiceBlock247); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceBlockAccess().getServiceKeyword_0());
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:146:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:147:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:147:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:148:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceBlock264); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleServiceBlock281); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:168:1: ( (lv_ops_3_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:169:1: (lv_ops_3_0= ruleOperation )
            	    {
            	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:169:1: (lv_ops_3_0= ruleOperation )
            	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:170:3: lv_ops_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceBlockAccess().getOpsOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleServiceBlock302);
            	    lv_ops_3_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ops",
            	            		lv_ops_3_0, 
            	            		"Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleServiceBlock315); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleServiceBlock"


    // $ANTLR start "entryRuleOperation"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:198:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:199:2: (iv_ruleOperation= ruleOperation EOF )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:200:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation351);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation361); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:207:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )* )? otherlv_6= ')' ( (lv_uniqueClause_7_0= ruleUniqueClause ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_uniqueClause_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:210:28: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )* )? otherlv_6= ')' ( (lv_uniqueClause_7_0= ruleUniqueClause ) )? ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:211:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )* )? otherlv_6= ')' ( (lv_uniqueClause_7_0= ruleUniqueClause ) )? )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:211:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )* )? otherlv_6= ')' ( (lv_uniqueClause_7_0= ruleUniqueClause ) )? )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:211:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )* )? otherlv_6= ')' ( (lv_uniqueClause_7_0= ruleUniqueClause ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOperation398); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:215:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:216:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:216:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:217:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation415); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleOperation432); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:237:1: ( ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=22 && LA3_0<=28)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:237:2: ( (lv_args_3_0= ruleOperationArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )*
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:237:2: ( (lv_args_3_0= ruleOperationArg ) )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:238:1: (lv_args_3_0= ruleOperationArg )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:238:1: (lv_args_3_0= ruleOperationArg )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:239:3: lv_args_3_0= ruleOperationArg
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperationArg_in_ruleOperation454);
                    lv_args_3_0=ruleOperationArg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_3_0, 
                            		"OperationArg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:255:2: (otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:255:4: otherlv_4= ',' ( (lv_args_5_0= ruleOperationArg ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleOperation467); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:259:1: ( (lv_args_5_0= ruleOperationArg ) )
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:260:1: (lv_args_5_0= ruleOperationArg )
                    	    {
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:260:1: (lv_args_5_0= ruleOperationArg )
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:261:3: lv_args_5_0= ruleOperationArg
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOperationArg_in_ruleOperation488);
                    	    lv_args_5_0=ruleOperationArg();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_5_0, 
                    	            		"OperationArg");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleOperation504); 

                	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:281:1: ( (lv_uniqueClause_7_0= ruleUniqueClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:282:1: (lv_uniqueClause_7_0= ruleUniqueClause )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:282:1: (lv_uniqueClause_7_0= ruleUniqueClause )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:283:3: lv_uniqueClause_7_0= ruleUniqueClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getUniqueClauseUniqueClauseParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUniqueClause_in_ruleOperation525);
                    lv_uniqueClause_7_0=ruleUniqueClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"uniqueClause",
                            		lv_uniqueClause_7_0, 
                            		"UniqueClause");
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationArg"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:307:1: entryRuleOperationArg returns [EObject current=null] : iv_ruleOperationArg= ruleOperationArg EOF ;
    public final EObject entryRuleOperationArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationArg = null;


        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:308:2: (iv_ruleOperationArg= ruleOperationArg EOF )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:309:2: iv_ruleOperationArg= ruleOperationArg EOF
            {
             newCompositeNode(grammarAccess.getOperationArgRule()); 
            pushFollow(FOLLOW_ruleOperationArg_in_entryRuleOperationArg562);
            iv_ruleOperationArg=ruleOperationArg();

            state._fsp--;

             current =iv_ruleOperationArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationArg572); 

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
    // $ANTLR end "entryRuleOperationArg"


    // $ANTLR start "ruleOperationArg"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:316:1: ruleOperationArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleOpArgType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOperationArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:319:28: ( ( ( (lv_type_0_0= ruleOpArgType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:320:1: ( ( (lv_type_0_0= ruleOpArgType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:320:1: ( ( (lv_type_0_0= ruleOpArgType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:320:2: ( (lv_type_0_0= ruleOpArgType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:320:2: ( (lv_type_0_0= ruleOpArgType ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:321:1: (lv_type_0_0= ruleOpArgType )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:321:1: (lv_type_0_0= ruleOpArgType )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:322:3: lv_type_0_0= ruleOpArgType
            {
             
            	        newCompositeNode(grammarAccess.getOperationArgAccess().getTypeOpArgTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleOpArgType_in_ruleOperationArg618);
            lv_type_0_0=ruleOpArgType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationArgRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"OpArgType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:338:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:339:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:339:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:340:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationArg635); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationArgAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationArgRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleOperationArg"


    // $ANTLR start "entryRuleUniqueClause"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:364:1: entryRuleUniqueClause returns [EObject current=null] : iv_ruleUniqueClause= ruleUniqueClause EOF ;
    public final EObject entryRuleUniqueClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueClause = null;


        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:365:2: (iv_ruleUniqueClause= ruleUniqueClause EOF )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:366:2: iv_ruleUniqueClause= ruleUniqueClause EOF
            {
             newCompositeNode(grammarAccess.getUniqueClauseRule()); 
            pushFollow(FOLLOW_ruleUniqueClause_in_entryRuleUniqueClause676);
            iv_ruleUniqueClause=ruleUniqueClause();

            state._fsp--;

             current =iv_ruleUniqueClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueClause686); 

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
    // $ANTLR end "entryRuleUniqueClause"


    // $ANTLR start "ruleUniqueClause"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:373:1: ruleUniqueClause returns [EObject current=null] : ( ( () otherlv_1= 'not' otherlv_2= 'unique' ) | ( () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' ) ) ;
    public final EObject ruleUniqueClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:376:28: ( ( ( () otherlv_1= 'not' otherlv_2= 'unique' ) | ( () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' ) ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:377:1: ( ( () otherlv_1= 'not' otherlv_2= 'unique' ) | ( () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' ) )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:377:1: ( ( () otherlv_1= 'not' otherlv_2= 'unique' ) | ( () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:377:2: ( () otherlv_1= 'not' otherlv_2= 'unique' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:377:2: ( () otherlv_1= 'not' otherlv_2= 'unique' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:377:3: () otherlv_1= 'not' otherlv_2= 'unique'
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:377:3: ()
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:378:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUniqueClauseAccess().getNotUniqueAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleUniqueClause733); 

                        	newLeafNode(otherlv_1, grammarAccess.getUniqueClauseAccess().getNotKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleUniqueClause745); 

                        	newLeafNode(otherlv_2, grammarAccess.getUniqueClauseAccess().getUniqueKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:392:6: ( () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:392:6: ( () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:392:7: () otherlv_4= 'unique' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')'
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:392:7: ()
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:393:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUniqueClauseAccess().getUniqueDeclarationAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleUniqueClause774); 

                        	newLeafNode(otherlv_4, grammarAccess.getUniqueClauseAccess().getUniqueKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleUniqueClause786); 

                        	newLeafNode(otherlv_5, grammarAccess.getUniqueClauseAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:406:1: ( (otherlv_6= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:407:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:407:1: (otherlv_6= RULE_ID )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:408:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUniqueClauseRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueClause806); 

                    		newLeafNode(otherlv_6, grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_3_0()); 
                    	

                    }


                    }

                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:419:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:419:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleUniqueClause819); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getUniqueClauseAccess().getCommaKeyword_1_4_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:423:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:424:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:424:1: (otherlv_8= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:425:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getUniqueClauseRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueClause839); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleUniqueClause853); 

                        	newLeafNode(otherlv_9, grammarAccess.getUniqueClauseAccess().getRightParenthesisKeyword_1_5());
                        

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
    // $ANTLR end "ruleUniqueClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:448:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:449:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:450:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName891);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName902); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:457:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:460:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:461:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:461:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:461:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName942); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:468:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:469:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName961); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName976); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleOpArgType"
    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:489:1: ruleOpArgType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'long' ) | (enumLiteral_6= 'Parcelable' ) ) ;
    public final Enumerator ruleOpArgType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:491:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'long' ) | (enumLiteral_6= 'Parcelable' ) ) )
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:492:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'long' ) | (enumLiteral_6= 'Parcelable' ) )
            {
            // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:492:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'long' ) | (enumLiteral_6= 'Parcelable' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            case 28:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:492:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:492:2: (enumLiteral_0= 'boolean' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:492:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleOpArgType1037); 

                            current = grammarAccess.getOpArgTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpArgTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:498:6: (enumLiteral_1= 'String' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:498:6: (enumLiteral_1= 'String' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:498:8: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleOpArgType1054); 

                            current = grammarAccess.getOpArgTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOpArgTypeAccess().getStringEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:504:6: (enumLiteral_2= 'int' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:504:6: (enumLiteral_2= 'int' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:504:8: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_24_in_ruleOpArgType1071); 

                            current = grammarAccess.getOpArgTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOpArgTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:510:6: (enumLiteral_3= 'float' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:510:6: (enumLiteral_3= 'float' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:510:8: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_25_in_ruleOpArgType1088); 

                            current = grammarAccess.getOpArgTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOpArgTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:516:6: (enumLiteral_4= 'double' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:516:6: (enumLiteral_4= 'double' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:516:8: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_26_in_ruleOpArgType1105); 

                            current = grammarAccess.getOpArgTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOpArgTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:522:6: (enumLiteral_5= 'long' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:522:6: (enumLiteral_5= 'long' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:522:8: enumLiteral_5= 'long'
                    {
                    enumLiteral_5=(Token)match(input,27,FOLLOW_27_in_ruleOpArgType1122); 

                            current = grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:528:6: (enumLiteral_6= 'Parcelable' )
                    {
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:528:6: (enumLiteral_6= 'Parcelable' )
                    // ../com.robotoworks.mechanoid.ops/src-gen/com/robotoworks/mechanoid/ops/parser/antlr/internal/InternalOpServiceModel.g:528:8: enumLiteral_6= 'Parcelable'
                    {
                    enumLiteral_6=(Token)match(input,28,FOLLOW_28_in_ruleOpArgType1139); 

                            current = grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_6()); 
                        

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
    // $ANTLR end "ruleOpArgType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleServiceBlock247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceBlock264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleServiceBlock281 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleServiceBlock302 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleServiceBlock315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOperation398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperation432 = new BitSet(new long[]{0x000000001FC40000L});
    public static final BitSet FOLLOW_ruleOperationArg_in_ruleOperation454 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleOperation467 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_ruleOperationArg_in_ruleOperation488 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleOperation504 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleUniqueClause_in_ruleOperation525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_entryRuleOperationArg562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationArg572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpArgType_in_ruleOperationArg618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationArg635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueClause_in_entryRuleUniqueClause676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueClause686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUniqueClause733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUniqueClause745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUniqueClause774 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUniqueClause786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueClause806 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleUniqueClause819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueClause839 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleUniqueClause853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName942 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName976 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22_in_ruleOpArgType1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpArgType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpArgType1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpArgType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpArgType1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpArgType1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpArgType1139 = new BitSet(new long[]{0x0000000000000002L});

}