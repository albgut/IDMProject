package org.xtext.idmProject.parser.antlr.internal;

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
import org.xtext.idmProject.services.IDMProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIDMProjectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_GOBACK", "RULE_ROOT", "RULE_ID", "RULE_NULL", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load'", "'insertPair'", "'.'", "'modify'", "'sum'", "'remove'", "'mult'", "'select'", "'store'", "'print'", "'['", "','", "']'", "'{'", "'}'", "'\"'", "':'", "'true'", "'false'"
    };
    public static final int RULE_GOBACK=5;
    public static final int RULE_STRING=4;
    public static final int RULE_NULL=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_ROOT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIDMProjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIDMProjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIDMProjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIDMProject.g"; }



     	private IDMProjectGrammarAccess grammarAccess;

        public InternalIDMProjectParser(TokenStream input, IDMProjectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JsonCommands";
       	}

       	@Override
       	protected IDMProjectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJsonCommands"
    // InternalIDMProject.g:65:1: entryRuleJsonCommands returns [EObject current=null] : iv_ruleJsonCommands= ruleJsonCommands EOF ;
    public final EObject entryRuleJsonCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCommands = null;


        try {
            // InternalIDMProject.g:65:53: (iv_ruleJsonCommands= ruleJsonCommands EOF )
            // InternalIDMProject.g:66:2: iv_ruleJsonCommands= ruleJsonCommands EOF
            {
             newCompositeNode(grammarAccess.getJsonCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonCommands=ruleJsonCommands();

            state._fsp--;

             current =iv_ruleJsonCommands; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonCommands"


    // $ANTLR start "ruleJsonCommands"
    // InternalIDMProject.g:72:1: ruleJsonCommands returns [EObject current=null] : ( (lv_jsonCommands_0_0= ruleJsonCommand ) )* ;
    public final EObject ruleJsonCommands() throws RecognitionException {
        EObject current = null;

        EObject lv_jsonCommands_0_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:78:2: ( ( (lv_jsonCommands_0_0= ruleJsonCommand ) )* )
            // InternalIDMProject.g:79:2: ( (lv_jsonCommands_0_0= ruleJsonCommand ) )*
            {
            // InternalIDMProject.g:79:2: ( (lv_jsonCommands_0_0= ruleJsonCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIDMProject.g:80:3: (lv_jsonCommands_0_0= ruleJsonCommand )
            	    {
            	    // InternalIDMProject.g:80:3: (lv_jsonCommands_0_0= ruleJsonCommand )
            	    // InternalIDMProject.g:81:4: lv_jsonCommands_0_0= ruleJsonCommand
            	    {

            	    				newCompositeNode(grammarAccess.getJsonCommandsAccess().getJsonCommandsJsonCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_jsonCommands_0_0=ruleJsonCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getJsonCommandsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"jsonCommands",
            	    					lv_jsonCommands_0_0,
            	    					"org.xtext.idmProject.IDMProject.JsonCommand");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleJsonCommands"


    // $ANTLR start "entryRuleJsonCommand"
    // InternalIDMProject.g:101:1: entryRuleJsonCommand returns [EObject current=null] : iv_ruleJsonCommand= ruleJsonCommand EOF ;
    public final EObject entryRuleJsonCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCommand = null;


        try {
            // InternalIDMProject.g:101:52: (iv_ruleJsonCommand= ruleJsonCommand EOF )
            // InternalIDMProject.g:102:2: iv_ruleJsonCommand= ruleJsonCommand EOF
            {
             newCompositeNode(grammarAccess.getJsonCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonCommand=ruleJsonCommand();

            state._fsp--;

             current =iv_ruleJsonCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonCommand"


    // $ANTLR start "ruleJsonCommand"
    // InternalIDMProject.g:108:1: ruleJsonCommand returns [EObject current=null] : ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) ) ;
    public final EObject ruleJsonCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_init_0_0 = null;

        EObject lv_operations_1_0 = null;

        EObject lv_final_2_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:114:2: ( ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) ) )
            // InternalIDMProject.g:115:2: ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) )
            {
            // InternalIDMProject.g:115:2: ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) )
            // InternalIDMProject.g:116:3: ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) )
            {
            // InternalIDMProject.g:116:3: ( (lv_init_0_0= ruleInitialisation ) )
            // InternalIDMProject.g:117:4: (lv_init_0_0= ruleInitialisation )
            {
            // InternalIDMProject.g:117:4: (lv_init_0_0= ruleInitialisation )
            // InternalIDMProject.g:118:5: lv_init_0_0= ruleInitialisation
            {

            					newCompositeNode(grammarAccess.getJsonCommandAccess().getInitInitialisationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_init_0_0=ruleInitialisation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonCommandRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_0_0,
            						"org.xtext.idmProject.IDMProject.Initialisation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDMProject.g:135:3: ( (lv_operations_1_0= ruleOperation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=18 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIDMProject.g:136:4: (lv_operations_1_0= ruleOperation )
            	    {
            	    // InternalIDMProject.g:136:4: (lv_operations_1_0= ruleOperation )
            	    // InternalIDMProject.g:137:5: lv_operations_1_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getJsonCommandAccess().getOperationsOperationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_operations_1_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJsonCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"org.xtext.idmProject.IDMProject.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalIDMProject.g:154:3: ( (lv_final_2_0= ruleFinal ) )
            // InternalIDMProject.g:155:4: (lv_final_2_0= ruleFinal )
            {
            // InternalIDMProject.g:155:4: (lv_final_2_0= ruleFinal )
            // InternalIDMProject.g:156:5: lv_final_2_0= ruleFinal
            {

            					newCompositeNode(grammarAccess.getJsonCommandAccess().getFinalFinalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_final_2_0=ruleFinal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonCommandRule());
            					}
            					set(
            						current,
            						"final",
            						lv_final_2_0,
            						"org.xtext.idmProject.IDMProject.Final");
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
    // $ANTLR end "ruleJsonCommand"


    // $ANTLR start "entryRuleInitialisation"
    // InternalIDMProject.g:177:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // InternalIDMProject.g:177:55: (iv_ruleInitialisation= ruleInitialisation EOF )
            // InternalIDMProject.g:178:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // InternalIDMProject.g:184:1: ruleInitialisation returns [EObject current=null] : (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filePath_1_0=null;


        	enterRule();

        try {
            // InternalIDMProject.g:190:2: ( (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) ) )
            // InternalIDMProject.g:191:2: (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) )
            {
            // InternalIDMProject.g:191:2: (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) )
            // InternalIDMProject.g:192:3: otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getLoadKeyword_0());
            		
            // InternalIDMProject.g:196:3: ( (lv_filePath_1_0= RULE_STRING ) )
            // InternalIDMProject.g:197:4: (lv_filePath_1_0= RULE_STRING )
            {
            // InternalIDMProject.g:197:4: (lv_filePath_1_0= RULE_STRING )
            // InternalIDMProject.g:198:5: lv_filePath_1_0= RULE_STRING
            {
            lv_filePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_filePath_1_0, grammarAccess.getInitialisationAccess().getFilePathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleOperation"
    // InternalIDMProject.g:218:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalIDMProject.g:218:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalIDMProject.g:219:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIDMProject.g:225:1: ruleOperation returns [EObject current=null] : (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Insert_0 = null;

        EObject this_Modify_1 = null;

        EObject this_Sum_2 = null;

        EObject this_Remove_3 = null;

        EObject this_Mult_4 = null;

        EObject this_Select_5 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:231:2: ( (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect ) )
            // InternalIDMProject.g:232:2: (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect )
            {
            // InternalIDMProject.g:232:2: (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalIDMProject.g:233:3: this_Insert_0= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getInsertParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_0=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:242:3: this_Modify_1= ruleModify
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getModifyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modify_1=ruleModify();

                    state._fsp--;


                    			current = this_Modify_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIDMProject.g:251:3: this_Sum_2= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_2=ruleSum();

                    state._fsp--;


                    			current = this_Sum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIDMProject.g:260:3: this_Remove_3= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getRemoveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_3=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalIDMProject.g:269:3: this_Mult_4= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getMultParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_4=ruleMult();

                    state._fsp--;


                    			current = this_Mult_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalIDMProject.g:278:3: this_Select_5= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSelectParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_5=ruleSelect();

                    state._fsp--;


                    			current = this_Select_5;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleInsert"
    // InternalIDMProject.g:290:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalIDMProject.g:290:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalIDMProject.g:291:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalIDMProject.g:297:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insertPair' ( (lv_path_1_0= rulePath ) ) ( (lv_jsonInString_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_jsonInString_2_0=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:303:2: ( (otherlv_0= 'insertPair' ( (lv_path_1_0= rulePath ) ) ( (lv_jsonInString_2_0= RULE_STRING ) ) ) )
            // InternalIDMProject.g:304:2: (otherlv_0= 'insertPair' ( (lv_path_1_0= rulePath ) ) ( (lv_jsonInString_2_0= RULE_STRING ) ) )
            {
            // InternalIDMProject.g:304:2: (otherlv_0= 'insertPair' ( (lv_path_1_0= rulePath ) ) ( (lv_jsonInString_2_0= RULE_STRING ) ) )
            // InternalIDMProject.g:305:3: otherlv_0= 'insertPair' ( (lv_path_1_0= rulePath ) ) ( (lv_jsonInString_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertPairKeyword_0());
            		
            // InternalIDMProject.g:309:3: ( (lv_path_1_0= rulePath ) )
            // InternalIDMProject.g:310:4: (lv_path_1_0= rulePath )
            {
            // InternalIDMProject.g:310:4: (lv_path_1_0= rulePath )
            // InternalIDMProject.g:311:5: lv_path_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getPathPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.idmProject.IDMProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDMProject.g:328:3: ( (lv_jsonInString_2_0= RULE_STRING ) )
            // InternalIDMProject.g:329:4: (lv_jsonInString_2_0= RULE_STRING )
            {
            // InternalIDMProject.g:329:4: (lv_jsonInString_2_0= RULE_STRING )
            // InternalIDMProject.g:330:5: lv_jsonInString_2_0= RULE_STRING
            {
            lv_jsonInString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_jsonInString_2_0, grammarAccess.getInsertAccess().getJsonInStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"jsonInString",
            						lv_jsonInString_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRulePath"
    // InternalIDMProject.g:350:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalIDMProject.g:350:45: (iv_rulePath= rulePath EOF )
            // InternalIDMProject.g:351:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIDMProject.g:357:1: rulePath returns [EObject current=null] : ( ( ( (lv_values_0_0= RULE_GOBACK ) ) | ( (lv_values_1_0= RULE_ROOT ) ) | ( (lv_values_2_0= RULE_ID ) ) ) (otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;
        Token lv_values_1_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_1=null;
        Token lv_values_4_2=null;


        	enterRule();

        try {
            // InternalIDMProject.g:363:2: ( ( ( ( (lv_values_0_0= RULE_GOBACK ) ) | ( (lv_values_1_0= RULE_ROOT ) ) | ( (lv_values_2_0= RULE_ID ) ) ) (otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) ) )* ) )
            // InternalIDMProject.g:364:2: ( ( ( (lv_values_0_0= RULE_GOBACK ) ) | ( (lv_values_1_0= RULE_ROOT ) ) | ( (lv_values_2_0= RULE_ID ) ) ) (otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) ) )* )
            {
            // InternalIDMProject.g:364:2: ( ( ( (lv_values_0_0= RULE_GOBACK ) ) | ( (lv_values_1_0= RULE_ROOT ) ) | ( (lv_values_2_0= RULE_ID ) ) ) (otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) ) )* )
            // InternalIDMProject.g:365:3: ( ( (lv_values_0_0= RULE_GOBACK ) ) | ( (lv_values_1_0= RULE_ROOT ) ) | ( (lv_values_2_0= RULE_ID ) ) ) (otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) ) )*
            {
            // InternalIDMProject.g:365:3: ( ( (lv_values_0_0= RULE_GOBACK ) ) | ( (lv_values_1_0= RULE_ROOT ) ) | ( (lv_values_2_0= RULE_ID ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_GOBACK:
                {
                alt4=1;
                }
                break;
            case RULE_ROOT:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
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
                    // InternalIDMProject.g:366:4: ( (lv_values_0_0= RULE_GOBACK ) )
                    {
                    // InternalIDMProject.g:366:4: ( (lv_values_0_0= RULE_GOBACK ) )
                    // InternalIDMProject.g:367:5: (lv_values_0_0= RULE_GOBACK )
                    {
                    // InternalIDMProject.g:367:5: (lv_values_0_0= RULE_GOBACK )
                    // InternalIDMProject.g:368:6: lv_values_0_0= RULE_GOBACK
                    {
                    lv_values_0_0=(Token)match(input,RULE_GOBACK,FOLLOW_7); 

                    						newLeafNode(lv_values_0_0, grammarAccess.getPathAccess().getValuesGOBACKTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPathRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_0_0,
                    							"org.xtext.idmProject.IDMProject.GOBACK");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:385:4: ( (lv_values_1_0= RULE_ROOT ) )
                    {
                    // InternalIDMProject.g:385:4: ( (lv_values_1_0= RULE_ROOT ) )
                    // InternalIDMProject.g:386:5: (lv_values_1_0= RULE_ROOT )
                    {
                    // InternalIDMProject.g:386:5: (lv_values_1_0= RULE_ROOT )
                    // InternalIDMProject.g:387:6: lv_values_1_0= RULE_ROOT
                    {
                    lv_values_1_0=(Token)match(input,RULE_ROOT,FOLLOW_7); 

                    						newLeafNode(lv_values_1_0, grammarAccess.getPathAccess().getValuesROOTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPathRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"org.xtext.idmProject.IDMProject.ROOT");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIDMProject.g:404:4: ( (lv_values_2_0= RULE_ID ) )
                    {
                    // InternalIDMProject.g:404:4: ( (lv_values_2_0= RULE_ID ) )
                    // InternalIDMProject.g:405:5: (lv_values_2_0= RULE_ID )
                    {
                    // InternalIDMProject.g:405:5: (lv_values_2_0= RULE_ID )
                    // InternalIDMProject.g:406:6: lv_values_2_0= RULE_ID
                    {
                    lv_values_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_values_2_0, grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPathRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIDMProject.g:423:3: (otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIDMProject.g:424:4: otherlv_3= '.' ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPathAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalIDMProject.g:428:4: ( ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) ) )
            	    // InternalIDMProject.g:429:5: ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) )
            	    {
            	    // InternalIDMProject.g:429:5: ( (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID ) )
            	    // InternalIDMProject.g:430:6: (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID )
            	    {
            	    // InternalIDMProject.g:430:6: (lv_values_4_1= RULE_GOBACK | lv_values_4_2= RULE_ID )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_GOBACK) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==RULE_ID) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalIDMProject.g:431:7: lv_values_4_1= RULE_GOBACK
            	            {
            	            lv_values_4_1=(Token)match(input,RULE_GOBACK,FOLLOW_7); 

            	            							newLeafNode(lv_values_4_1, grammarAccess.getPathAccess().getValuesGOBACKTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPathRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"values",
            	            								lv_values_4_1,
            	            								"org.xtext.idmProject.IDMProject.GOBACK");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalIDMProject.g:446:7: lv_values_4_2= RULE_ID
            	            {
            	            lv_values_4_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	            							newLeafNode(lv_values_4_2, grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPathRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"values",
            	            								lv_values_4_2,
            	            								"org.eclipse.xtext.common.Terminals.ID");
            	            						

            	            }
            	            break;

            	    }


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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleModify"
    // InternalIDMProject.g:468:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalIDMProject.g:468:47: (iv_ruleModify= ruleModify EOF )
            // InternalIDMProject.g:469:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalIDMProject.g:475:1: ruleModify returns [EObject current=null] : (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_path_1_0 = null;

        EObject lv_jsonObject_2_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:481:2: ( (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) ) )
            // InternalIDMProject.g:482:2: (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) )
            {
            // InternalIDMProject.g:482:2: (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) )
            // InternalIDMProject.g:483:3: otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            // InternalIDMProject.g:487:3: ( (lv_path_1_0= rulePath ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_GOBACK && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIDMProject.g:488:4: (lv_path_1_0= rulePath )
                    {
                    // InternalIDMProject.g:488:4: (lv_path_1_0= rulePath )
                    // InternalIDMProject.g:489:5: lv_path_1_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getModifyAccess().getPathPathParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_path_1_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModifyRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_1_0,
                    						"org.xtext.idmProject.IDMProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalIDMProject.g:506:3: ( (lv_jsonObject_2_0= ruleJsonObject ) )
            // InternalIDMProject.g:507:4: (lv_jsonObject_2_0= ruleJsonObject )
            {
            // InternalIDMProject.g:507:4: (lv_jsonObject_2_0= ruleJsonObject )
            // InternalIDMProject.g:508:5: lv_jsonObject_2_0= ruleJsonObject
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getJsonObjectJsonObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_jsonObject_2_0=ruleJsonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"jsonObject",
            						lv_jsonObject_2_0,
            						"org.xtext.idmProject.IDMProject.JsonObject");
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
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleSum"
    // InternalIDMProject.g:529:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalIDMProject.g:529:44: (iv_ruleSum= ruleSum EOF )
            // InternalIDMProject.g:530:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalIDMProject.g:536:1: ruleSum returns [EObject current=null] : (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pathTOStore_1_0 = null;

        EObject lv_pathToAdd_2_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:542:2: ( (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) ) )
            // InternalIDMProject.g:543:2: (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) )
            {
            // InternalIDMProject.g:543:2: (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) )
            // InternalIDMProject.g:544:3: otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalIDMProject.g:548:3: ( (lv_pathTOStore_1_0= rulePath ) )
            // InternalIDMProject.g:549:4: (lv_pathTOStore_1_0= rulePath )
            {
            // InternalIDMProject.g:549:4: (lv_pathTOStore_1_0= rulePath )
            // InternalIDMProject.g:550:5: lv_pathTOStore_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getSumAccess().getPathTOStorePathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_pathTOStore_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"pathTOStore",
            						lv_pathTOStore_1_0,
            						"org.xtext.idmProject.IDMProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDMProject.g:567:3: ( (lv_pathToAdd_2_0= rulePath ) )
            // InternalIDMProject.g:568:4: (lv_pathToAdd_2_0= rulePath )
            {
            // InternalIDMProject.g:568:4: (lv_pathToAdd_2_0= rulePath )
            // InternalIDMProject.g:569:5: lv_pathToAdd_2_0= rulePath
            {

            					newCompositeNode(grammarAccess.getSumAccess().getPathToAddPathParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToAdd_2_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"pathToAdd",
            						lv_pathToAdd_2_0,
            						"org.xtext.idmProject.IDMProject.Path");
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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleRemove"
    // InternalIDMProject.g:590:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalIDMProject.g:590:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalIDMProject.g:591:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalIDMProject.g:597:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:603:2: ( ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? ) )
            // InternalIDMProject.g:604:2: ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? )
            {
            // InternalIDMProject.g:604:2: ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? )
            // InternalIDMProject.g:605:3: () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )?
            {
            // InternalIDMProject.g:605:3: ()
            // InternalIDMProject.g:606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRemoveAccess().getRemoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
            		
            // InternalIDMProject.g:616:3: ( (lv_path_2_0= rulePath ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_GOBACK && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIDMProject.g:617:4: (lv_path_2_0= rulePath )
                    {
                    // InternalIDMProject.g:617:4: (lv_path_2_0= rulePath )
                    // InternalIDMProject.g:618:5: lv_path_2_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getRemoveAccess().getPathPathParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRemoveRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_2_0,
                    						"org.xtext.idmProject.IDMProject.Path");
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
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleMult"
    // InternalIDMProject.g:639:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalIDMProject.g:639:45: (iv_ruleMult= ruleMult EOF )
            // InternalIDMProject.g:640:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalIDMProject.g:646:1: ruleMult returns [EObject current=null] : (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pathTOStore_1_0 = null;

        EObject lv_pathToMult_2_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:652:2: ( (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) ) )
            // InternalIDMProject.g:653:2: (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) )
            {
            // InternalIDMProject.g:653:2: (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) )
            // InternalIDMProject.g:654:3: otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
            		
            // InternalIDMProject.g:658:3: ( (lv_pathTOStore_1_0= rulePath ) )
            // InternalIDMProject.g:659:4: (lv_pathTOStore_1_0= rulePath )
            {
            // InternalIDMProject.g:659:4: (lv_pathTOStore_1_0= rulePath )
            // InternalIDMProject.g:660:5: lv_pathTOStore_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getMultAccess().getPathTOStorePathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_pathTOStore_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultRule());
            					}
            					set(
            						current,
            						"pathTOStore",
            						lv_pathTOStore_1_0,
            						"org.xtext.idmProject.IDMProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDMProject.g:677:3: ( (lv_pathToMult_2_0= rulePath ) )
            // InternalIDMProject.g:678:4: (lv_pathToMult_2_0= rulePath )
            {
            // InternalIDMProject.g:678:4: (lv_pathToMult_2_0= rulePath )
            // InternalIDMProject.g:679:5: lv_pathToMult_2_0= rulePath
            {

            					newCompositeNode(grammarAccess.getMultAccess().getPathToMultPathParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToMult_2_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultRule());
            					}
            					set(
            						current,
            						"pathToMult",
            						lv_pathToMult_2_0,
            						"org.xtext.idmProject.IDMProject.Path");
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
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleSelect"
    // InternalIDMProject.g:700:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalIDMProject.g:700:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalIDMProject.g:701:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalIDMProject.g:707:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:713:2: ( (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) ) )
            // InternalIDMProject.g:714:2: (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) )
            {
            // InternalIDMProject.g:714:2: (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) )
            // InternalIDMProject.g:715:3: otherlv_0= 'select' ( (lv_path_1_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalIDMProject.g:719:3: ( (lv_path_1_0= rulePath ) )
            // InternalIDMProject.g:720:4: (lv_path_1_0= rulePath )
            {
            // InternalIDMProject.g:720:4: (lv_path_1_0= rulePath )
            // InternalIDMProject.g:721:5: lv_path_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getPathPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.idmProject.IDMProject.Path");
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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleFinal"
    // InternalIDMProject.g:742:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalIDMProject.g:742:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalIDMProject.g:743:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalIDMProject.g:749:1: ruleFinal returns [EObject current=null] : (this_Print_0= rulePrint | this_Store_1= ruleStore ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_Store_1 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:755:2: ( (this_Print_0= rulePrint | this_Store_1= ruleStore ) )
            // InternalIDMProject.g:756:2: (this_Print_0= rulePrint | this_Store_1= ruleStore )
            {
            // InternalIDMProject.g:756:2: (this_Print_0= rulePrint | this_Store_1= ruleStore )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIDMProject.g:757:3: this_Print_0= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getFinalAccess().getPrintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_0=rulePrint();

                    state._fsp--;


                    			current = this_Print_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:766:3: this_Store_1= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getFinalAccess().getStoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;


                    			current = this_Store_1;
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
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleStore"
    // InternalIDMProject.g:778:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalIDMProject.g:778:46: (iv_ruleStore= ruleStore EOF )
            // InternalIDMProject.g:779:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalIDMProject.g:785:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filePath_2_0=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:791:2: ( (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) ) )
            // InternalIDMProject.g:792:2: (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) )
            {
            // InternalIDMProject.g:792:2: (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) )
            // InternalIDMProject.g:793:3: otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalIDMProject.g:797:3: ( (lv_path_1_0= rulePath ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_GOBACK && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIDMProject.g:798:4: (lv_path_1_0= rulePath )
                    {
                    // InternalIDMProject.g:798:4: (lv_path_1_0= rulePath )
                    // InternalIDMProject.g:799:5: lv_path_1_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getStoreAccess().getPathPathParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_path_1_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStoreRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_1_0,
                    						"org.xtext.idmProject.IDMProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalIDMProject.g:816:3: ( (lv_filePath_2_0= RULE_STRING ) )
            // InternalIDMProject.g:817:4: (lv_filePath_2_0= RULE_STRING )
            {
            // InternalIDMProject.g:817:4: (lv_filePath_2_0= RULE_STRING )
            // InternalIDMProject.g:818:5: lv_filePath_2_0= RULE_STRING
            {
            lv_filePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_filePath_2_0, grammarAccess.getStoreAccess().getFilePathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRulePrint"
    // InternalIDMProject.g:838:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalIDMProject.g:838:46: (iv_rulePrint= rulePrint EOF )
            // InternalIDMProject.g:839:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalIDMProject.g:845:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:851:2: ( ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? ) )
            // InternalIDMProject.g:852:2: ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? )
            {
            // InternalIDMProject.g:852:2: ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? )
            // InternalIDMProject.g:853:3: () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )?
            {
            // InternalIDMProject.g:853:3: ()
            // InternalIDMProject.g:854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintAccess().getPrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
            		
            // InternalIDMProject.g:864:3: ( (lv_path_2_0= rulePath ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_GOBACK && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIDMProject.g:865:4: (lv_path_2_0= rulePath )
                    {
                    // InternalIDMProject.g:865:4: (lv_path_2_0= rulePath )
                    // InternalIDMProject.g:866:5: lv_path_2_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getPrintAccess().getPathPathParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrintRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_2_0,
                    						"org.xtext.idmProject.IDMProject.Path");
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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleJsonObject"
    // InternalIDMProject.g:887:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // InternalIDMProject.g:887:51: (iv_ruleJsonObject= ruleJsonObject EOF )
            // InternalIDMProject.g:888:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // InternalIDMProject.g:894:1: ruleJsonObject returns [EObject current=null] : (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject this_JsonEntries_0 = null;

        EObject this_JsonPrimitive_1 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:900:2: ( (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive ) )
            // InternalIDMProject.g:901:2: (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive )
            {
            // InternalIDMProject.g:901:2: (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING||(LA12_0>=RULE_NULL && LA12_0<=RULE_DOUBLE)||LA12_0==25||(LA12_0>=32 && LA12_0<=33)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalIDMProject.g:902:3: this_JsonEntries_0= ruleJsonEntries
                    {

                    			newCompositeNode(grammarAccess.getJsonObjectAccess().getJsonEntriesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonEntries_0=ruleJsonEntries();

                    state._fsp--;


                    			current = this_JsonEntries_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:911:3: this_JsonPrimitive_1= ruleJsonPrimitive
                    {

                    			newCompositeNode(grammarAccess.getJsonObjectAccess().getJsonPrimitiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonPrimitive_1=ruleJsonPrimitive();

                    state._fsp--;


                    			current = this_JsonPrimitive_1;
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
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonPrimitive"
    // InternalIDMProject.g:923:1: entryRuleJsonPrimitive returns [EObject current=null] : iv_ruleJsonPrimitive= ruleJsonPrimitive EOF ;
    public final EObject entryRuleJsonPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPrimitive = null;


        try {
            // InternalIDMProject.g:923:54: (iv_ruleJsonPrimitive= ruleJsonPrimitive EOF )
            // InternalIDMProject.g:924:2: iv_ruleJsonPrimitive= ruleJsonPrimitive EOF
            {
             newCompositeNode(grammarAccess.getJsonPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonPrimitive=ruleJsonPrimitive();

            state._fsp--;

             current =iv_ruleJsonPrimitive; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonPrimitive"


    // $ANTLR start "ruleJsonPrimitive"
    // InternalIDMProject.g:930:1: ruleJsonPrimitive returns [EObject current=null] : (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) ) ;
    public final EObject ruleJsonPrimitive() throws RecognitionException {
        EObject current = null;

        Token this_NULL_3=null;
        EObject this_StringObject_0 = null;

        EObject this_BooleanObject_1 = null;

        EObject this_ArrayObject_4 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:936:2: ( (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) ) )
            // InternalIDMProject.g:937:2: (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) )
            {
            // InternalIDMProject.g:937:2: (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case 32:
            case 33:
                {
                alt13=2;
                }
                break;
            case RULE_NULL:
                {
                alt13=3;
                }
                break;
            case 25:
                {
                alt13=4;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalIDMProject.g:938:3: this_StringObject_0= ruleStringObject
                    {

                    			newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getStringObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringObject_0=ruleStringObject();

                    state._fsp--;


                    			current = this_StringObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:947:3: this_BooleanObject_1= ruleBooleanObject
                    {

                    			newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getBooleanObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanObject_1=ruleBooleanObject();

                    state._fsp--;


                    			current = this_BooleanObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIDMProject.g:956:3: ( () this_NULL_3= RULE_NULL )
                    {
                    // InternalIDMProject.g:956:3: ( () this_NULL_3= RULE_NULL )
                    // InternalIDMProject.g:957:4: () this_NULL_3= RULE_NULL
                    {
                    // InternalIDMProject.g:957:4: ()
                    // InternalIDMProject.g:958:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_2_0(),
                    						current);
                    				

                    }

                    this_NULL_3=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    				newLeafNode(this_NULL_3, grammarAccess.getJsonPrimitiveAccess().getNULLTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIDMProject.g:970:3: this_ArrayObject_4= ruleArrayObject
                    {

                    			newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getArrayObjectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayObject_4=ruleArrayObject();

                    state._fsp--;


                    			current = this_ArrayObject_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalIDMProject.g:979:3: ( () ruleNumberObject )
                    {
                    // InternalIDMProject.g:979:3: ( () ruleNumberObject )
                    // InternalIDMProject.g:980:4: () ruleNumberObject
                    {
                    // InternalIDMProject.g:980:4: ()
                    // InternalIDMProject.g:981:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_4_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getNumberObjectParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleNumberObject();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleJsonPrimitive"


    // $ANTLR start "entryRuleNumberObject"
    // InternalIDMProject.g:999:1: entryRuleNumberObject returns [String current=null] : iv_ruleNumberObject= ruleNumberObject EOF ;
    public final String entryRuleNumberObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberObject = null;


        try {
            // InternalIDMProject.g:999:52: (iv_ruleNumberObject= ruleNumberObject EOF )
            // InternalIDMProject.g:1000:2: iv_ruleNumberObject= ruleNumberObject EOF
            {
             newCompositeNode(grammarAccess.getNumberObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberObject=ruleNumberObject();

            state._fsp--;

             current =iv_ruleNumberObject.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberObject"


    // $ANTLR start "ruleNumberObject"
    // InternalIDMProject.g:1006:1: ruleNumberObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumberObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalIDMProject.g:1012:2: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalIDMProject.g:1013:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalIDMProject.g:1013:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_DOUBLE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalIDMProject.g:1014:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNumberObjectAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:1022:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getNumberObjectAccess().getDOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleNumberObject"


    // $ANTLR start "entryRuleArrayObject"
    // InternalIDMProject.g:1033:1: entryRuleArrayObject returns [EObject current=null] : iv_ruleArrayObject= ruleArrayObject EOF ;
    public final EObject entryRuleArrayObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayObject = null;


        try {
            // InternalIDMProject.g:1033:52: (iv_ruleArrayObject= ruleArrayObject EOF )
            // InternalIDMProject.g:1034:2: iv_ruleArrayObject= ruleArrayObject EOF
            {
             newCompositeNode(grammarAccess.getArrayObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayObject=ruleArrayObject();

            state._fsp--;

             current =iv_ruleArrayObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArrayObject"


    // $ANTLR start "ruleArrayObject"
    // InternalIDMProject.g:1040:1: ruleArrayObject returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:1046:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' ) )
            // InternalIDMProject.g:1047:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' )
            {
            // InternalIDMProject.g:1047:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' )
            // InternalIDMProject.g:1048:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']'
            {
            // InternalIDMProject.g:1048:3: ()
            // InternalIDMProject.g:1049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayObjectAccess().getArrayObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayObjectAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalIDMProject.g:1059:3: ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||(LA16_0>=RULE_NULL && LA16_0<=RULE_DOUBLE)||LA16_0==25||LA16_0==28||(LA16_0>=32 && LA16_0<=33)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIDMProject.g:1060:4: ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )*
                    {
                    // InternalIDMProject.g:1060:4: ( (lv_values_2_0= ruleJsonObject ) )
                    // InternalIDMProject.g:1061:5: (lv_values_2_0= ruleJsonObject )
                    {
                    // InternalIDMProject.g:1061:5: (lv_values_2_0= ruleJsonObject )
                    // InternalIDMProject.g:1062:6: lv_values_2_0= ruleJsonObject
                    {

                    						newCompositeNode(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_values_2_0=ruleJsonObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayObjectRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"org.xtext.idmProject.IDMProject.JsonObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIDMProject.g:1079:4: (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==26) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalIDMProject.g:1080:5: otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayObjectAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalIDMProject.g:1084:5: ( (lv_values_4_0= ruleJsonObject ) )
                    	    // InternalIDMProject.g:1085:6: (lv_values_4_0= ruleJsonObject )
                    	    {
                    	    // InternalIDMProject.g:1085:6: (lv_values_4_0= ruleJsonObject )
                    	    // InternalIDMProject.g:1086:7: lv_values_4_0= ruleJsonObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_values_4_0=ruleJsonObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"org.xtext.idmProject.IDMProject.JsonObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayObjectAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayObject"


    // $ANTLR start "entryRuleBooleanObject"
    // InternalIDMProject.g:1113:1: entryRuleBooleanObject returns [EObject current=null] : iv_ruleBooleanObject= ruleBooleanObject EOF ;
    public final EObject entryRuleBooleanObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanObject = null;


        try {
            // InternalIDMProject.g:1113:54: (iv_ruleBooleanObject= ruleBooleanObject EOF )
            // InternalIDMProject.g:1114:2: iv_ruleBooleanObject= ruleBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanObject=ruleBooleanObject();

            state._fsp--;

             current =iv_ruleBooleanObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanObject"


    // $ANTLR start "ruleBooleanObject"
    // InternalIDMProject.g:1120:1: ruleBooleanObject returns [EObject current=null] : ( (lv_value_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanObject() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:1126:2: ( ( (lv_value_0_0= ruleBoolean ) ) )
            // InternalIDMProject.g:1127:2: ( (lv_value_0_0= ruleBoolean ) )
            {
            // InternalIDMProject.g:1127:2: ( (lv_value_0_0= ruleBoolean ) )
            // InternalIDMProject.g:1128:3: (lv_value_0_0= ruleBoolean )
            {
            // InternalIDMProject.g:1128:3: (lv_value_0_0= ruleBoolean )
            // InternalIDMProject.g:1129:4: lv_value_0_0= ruleBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanObjectAccess().getValueBooleanEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanObjectRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.idmProject.IDMProject.Boolean");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBooleanObject"


    // $ANTLR start "entryRuleStringObject"
    // InternalIDMProject.g:1149:1: entryRuleStringObject returns [EObject current=null] : iv_ruleStringObject= ruleStringObject EOF ;
    public final EObject entryRuleStringObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringObject = null;


        try {
            // InternalIDMProject.g:1149:53: (iv_ruleStringObject= ruleStringObject EOF )
            // InternalIDMProject.g:1150:2: iv_ruleStringObject= ruleStringObject EOF
            {
             newCompositeNode(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringObject=ruleStringObject();

            state._fsp--;

             current =iv_ruleStringObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalIDMProject.g:1156:1: ruleStringObject returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalIDMProject.g:1162:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalIDMProject.g:1163:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalIDMProject.g:1163:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalIDMProject.g:1164:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalIDMProject.g:1164:3: (lv_value_0_0= RULE_STRING )
            // InternalIDMProject.g:1165:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringObjectRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRuleJsonEntries"
    // InternalIDMProject.g:1184:1: entryRuleJsonEntries returns [EObject current=null] : iv_ruleJsonEntries= ruleJsonEntries EOF ;
    public final EObject entryRuleJsonEntries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonEntries = null;


        try {
            // InternalIDMProject.g:1184:52: (iv_ruleJsonEntries= ruleJsonEntries EOF )
            // InternalIDMProject.g:1185:2: iv_ruleJsonEntries= ruleJsonEntries EOF
            {
             newCompositeNode(grammarAccess.getJsonEntriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonEntries=ruleJsonEntries();

            state._fsp--;

             current =iv_ruleJsonEntries; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonEntries"


    // $ANTLR start "ruleJsonEntries"
    // InternalIDMProject.g:1191:1: ruleJsonEntries returns [EObject current=null] : (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleJsonEntries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_listEntries_1_0 = null;

        EObject lv_listEntries_3_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:1197:2: ( (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' ) )
            // InternalIDMProject.g:1198:2: (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' )
            {
            // InternalIDMProject.g:1198:2: (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' )
            // InternalIDMProject.g:1199:3: otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonEntriesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalIDMProject.g:1203:3: ( (lv_listEntries_1_0= ruleJsonEntry ) )
            // InternalIDMProject.g:1204:4: (lv_listEntries_1_0= ruleJsonEntry )
            {
            // InternalIDMProject.g:1204:4: (lv_listEntries_1_0= ruleJsonEntry )
            // InternalIDMProject.g:1205:5: lv_listEntries_1_0= ruleJsonEntry
            {

            					newCompositeNode(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_listEntries_1_0=ruleJsonEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonEntriesRule());
            					}
            					add(
            						current,
            						"listEntries",
            						lv_listEntries_1_0,
            						"org.xtext.idmProject.IDMProject.JsonEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIDMProject.g:1222:3: (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIDMProject.g:1223:4: otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getJsonEntriesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIDMProject.g:1227:4: ( (lv_listEntries_3_0= ruleJsonEntry ) )
            	    // InternalIDMProject.g:1228:5: (lv_listEntries_3_0= ruleJsonEntry )
            	    {
            	    // InternalIDMProject.g:1228:5: (lv_listEntries_3_0= ruleJsonEntry )
            	    // InternalIDMProject.g:1229:6: lv_listEntries_3_0= ruleJsonEntry
            	    {

            	    						newCompositeNode(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_listEntries_3_0=ruleJsonEntry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJsonEntriesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listEntries",
            	    							lv_listEntries_3_0,
            	    							"org.xtext.idmProject.IDMProject.JsonEntry");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJsonEntriesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleJsonEntries"


    // $ANTLR start "entryRuleJsonEntry"
    // InternalIDMProject.g:1255:1: entryRuleJsonEntry returns [EObject current=null] : iv_ruleJsonEntry= ruleJsonEntry EOF ;
    public final EObject entryRuleJsonEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonEntry = null;


        try {
            // InternalIDMProject.g:1255:50: (iv_ruleJsonEntry= ruleJsonEntry EOF )
            // InternalIDMProject.g:1256:2: iv_ruleJsonEntry= ruleJsonEntry EOF
            {
             newCompositeNode(grammarAccess.getJsonEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonEntry=ruleJsonEntry();

            state._fsp--;

             current =iv_ruleJsonEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonEntry"


    // $ANTLR start "ruleJsonEntry"
    // InternalIDMProject.g:1262:1: ruleJsonEntry returns [EObject current=null] : (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) ) ;
    public final EObject ruleJsonEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_jsonObject_4_0 = null;



        	enterRule();

        try {
            // InternalIDMProject.g:1268:2: ( (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) ) )
            // InternalIDMProject.g:1269:2: (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) )
            {
            // InternalIDMProject.g:1269:2: (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) )
            // InternalIDMProject.g:1270:3: otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_0());
            		
            // InternalIDMProject.g:1274:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalIDMProject.g:1275:4: (lv_key_1_0= RULE_ID )
            {
            // InternalIDMProject.g:1275:4: (lv_key_1_0= RULE_ID )
            // InternalIDMProject.g:1276:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_key_1_0, grammarAccess.getJsonEntryAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getJsonEntryAccess().getColonKeyword_3());
            		
            // InternalIDMProject.g:1300:3: ( (lv_jsonObject_4_0= ruleJsonObject ) )
            // InternalIDMProject.g:1301:4: (lv_jsonObject_4_0= ruleJsonObject )
            {
            // InternalIDMProject.g:1301:4: (lv_jsonObject_4_0= ruleJsonObject )
            // InternalIDMProject.g:1302:5: lv_jsonObject_4_0= ruleJsonObject
            {

            					newCompositeNode(grammarAccess.getJsonEntryAccess().getJsonObjectJsonObjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_jsonObject_4_0=ruleJsonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonEntryRule());
            					}
            					set(
            						current,
            						"jsonObject",
            						lv_jsonObject_4_0,
            						"org.xtext.idmProject.IDMProject.JsonObject");
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
    // $ANTLR end "ruleJsonEntry"


    // $ANTLR start "ruleBoolean"
    // InternalIDMProject.g:1323:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIDMProject.g:1329:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalIDMProject.g:1330:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalIDMProject.g:1330:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIDMProject.g:1331:3: (enumLiteral_0= 'true' )
                    {
                    // InternalIDMProject.g:1331:3: (enumLiteral_0= 'true' )
                    // InternalIDMProject.g:1332:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDMProject.g:1339:3: (enumLiteral_1= 'false' )
                    {
                    // InternalIDMProject.g:1339:3: (enumLiteral_1= 'false' )
                    // InternalIDMProject.g:1340:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001FD0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003120007F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000031A0007F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});

}