package org.xtext.example.dawn.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.dawn.services.DawnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDawnParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'new'", "'window'", "'with'", "'attributes'", "'('", "')'", "'containing'", "','", "'name'", "'having'", "'size'", "'['", "']'", "':'", "'|'", "'at'", "'position'", "'button'", "'='", "'function:'", "'text-field'", "'text-label'", "'password-field'", "'choice'", "'options'", "'()'", "'labels'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDawnParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDawnParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDawnParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDawn.g"; }



     	private DawnGrammarAccess grammarAccess;

        public InternalDawnParser(TokenStream input, DawnGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DawnGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDawn.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDawn.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDawn.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDawn.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_window_0_0= ruleWindow ) )* ( (lv_components_1_0= ruleComponent ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_window_0_0 = null;

        EObject lv_components_1_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:77:2: ( ( ( (lv_window_0_0= ruleWindow ) )* ( (lv_components_1_0= ruleComponent ) )* ) )
            // InternalDawn.g:78:2: ( ( (lv_window_0_0= ruleWindow ) )* ( (lv_components_1_0= ruleComponent ) )* )
            {
            // InternalDawn.g:78:2: ( ( (lv_window_0_0= ruleWindow ) )* ( (lv_components_1_0= ruleComponent ) )* )
            // InternalDawn.g:79:3: ( (lv_window_0_0= ruleWindow ) )* ( (lv_components_1_0= ruleComponent ) )*
            {
            // InternalDawn.g:79:3: ( (lv_window_0_0= ruleWindow ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDawn.g:80:4: (lv_window_0_0= ruleWindow )
            	    {
            	    // InternalDawn.g:80:4: (lv_window_0_0= ruleWindow )
            	    // InternalDawn.g:81:5: lv_window_0_0= ruleWindow
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getWindowWindowParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_window_0_0=ruleWindow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"window",
            	    						lv_window_0_0,
            	    						"org.xtext.example.dawn.Dawn.Window");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDawn.g:98:3: ( (lv_components_1_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDawn.g:99:4: (lv_components_1_0= ruleComponent )
            	    {
            	    // InternalDawn.g:99:4: (lv_components_1_0= ruleComponent )
            	    // InternalDawn.g:100:5: lv_components_1_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_components_1_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_1_0,
            	    						"org.xtext.example.dawn.Dawn.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleWindow"
    // InternalDawn.g:121:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalDawn.g:121:47: (iv_ruleWindow= ruleWindow EOF )
            // InternalDawn.g:122:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalDawn.g:128:1: ruleWindow returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'window' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'attributes' otherlv_6= '(' ( (lv_attributes_7_0= ruleWindowAttributes ) ) otherlv_8= ')' otherlv_9= 'containing' ( (lv_container_10_0= ruleContainer ) ) ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_container_10_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:134:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'window' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'attributes' otherlv_6= '(' ( (lv_attributes_7_0= ruleWindowAttributes ) ) otherlv_8= ')' otherlv_9= 'containing' ( (lv_container_10_0= ruleContainer ) ) ) )
            // InternalDawn.g:135:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'window' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'attributes' otherlv_6= '(' ( (lv_attributes_7_0= ruleWindowAttributes ) ) otherlv_8= ')' otherlv_9= 'containing' ( (lv_container_10_0= ruleContainer ) ) )
            {
            // InternalDawn.g:135:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'window' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'attributes' otherlv_6= '(' ( (lv_attributes_7_0= ruleWindowAttributes ) ) otherlv_8= ')' otherlv_9= 'containing' ( (lv_container_10_0= ruleContainer ) ) )
            // InternalDawn.g:136:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'window' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'attributes' otherlv_6= '(' ( (lv_attributes_7_0= ruleWindowAttributes ) ) otherlv_8= ')' otherlv_9= 'containing' ( (lv_container_10_0= ruleContainer ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getWindowKeyword_2());
            		
            // InternalDawn.g:148:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDawn.g:149:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDawn.g:149:4: (lv_name_3_0= RULE_ID )
            // InternalDawn.g:150:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getWindowAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWindowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowAccess().getAttributesKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getWindowAccess().getLeftParenthesisKeyword_6());
            		
            // InternalDawn.g:178:3: ( (lv_attributes_7_0= ruleWindowAttributes ) )
            // InternalDawn.g:179:4: (lv_attributes_7_0= ruleWindowAttributes )
            {
            // InternalDawn.g:179:4: (lv_attributes_7_0= ruleWindowAttributes )
            // InternalDawn.g:180:5: lv_attributes_7_0= ruleWindowAttributes
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getAttributesWindowAttributesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_attributes_7_0=ruleWindowAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_7_0,
            						"org.xtext.example.dawn.Dawn.WindowAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getWindowAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getWindowAccess().getContainingKeyword_9());
            		
            // InternalDawn.g:205:3: ( (lv_container_10_0= ruleContainer ) )
            // InternalDawn.g:206:4: (lv_container_10_0= ruleContainer )
            {
            // InternalDawn.g:206:4: (lv_container_10_0= ruleContainer )
            // InternalDawn.g:207:5: lv_container_10_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getContainerContainerParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_container_10_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_10_0,
            						"org.xtext.example.dawn.Dawn.Container");
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
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleComponent"
    // InternalDawn.g:228:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDawn.g:228:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDawn.g:229:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDawn.g:235:1: ruleComponent returns [EObject current=null] : (this_Button_0= ruleButton | this_TextField_1= ruleTextField | this_SingleChoice_2= ruleSingleChoice | this_TextLabel_3= ruleTextLabel | this_PasswordField_4= rulePasswordField ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_TextField_1 = null;

        EObject this_SingleChoice_2 = null;

        EObject this_TextLabel_3 = null;

        EObject this_PasswordField_4 = null;



        	enterRule();

        try {
            // InternalDawn.g:241:2: ( (this_Button_0= ruleButton | this_TextField_1= ruleTextField | this_SingleChoice_2= ruleSingleChoice | this_TextLabel_3= ruleTextLabel | this_PasswordField_4= rulePasswordField ) )
            // InternalDawn.g:242:2: (this_Button_0= ruleButton | this_TextField_1= ruleTextField | this_SingleChoice_2= ruleSingleChoice | this_TextLabel_3= ruleTextLabel | this_PasswordField_4= rulePasswordField )
            {
            // InternalDawn.g:242:2: (this_Button_0= ruleButton | this_TextField_1= ruleTextField | this_SingleChoice_2= ruleSingleChoice | this_TextLabel_3= ruleTextLabel | this_PasswordField_4= rulePasswordField )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt3=5;
                    }
                    break;
                case 32:
                    {
                    alt3=2;
                    }
                    break;
                case 33:
                    {
                    alt3=4;
                    }
                    break;
                case 35:
                    {
                    alt3=3;
                    }
                    break;
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDawn.g:243:3: this_Button_0= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getButtonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_0=ruleButton();

                    state._fsp--;


                    			current = this_Button_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDawn.g:252:3: this_TextField_1= ruleTextField
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getTextFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextField_1=ruleTextField();

                    state._fsp--;


                    			current = this_TextField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDawn.g:261:3: this_SingleChoice_2= ruleSingleChoice
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSingleChoiceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleChoice_2=ruleSingleChoice();

                    state._fsp--;


                    			current = this_SingleChoice_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDawn.g:270:3: this_TextLabel_3= ruleTextLabel
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getTextLabelParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextLabel_3=ruleTextLabel();

                    state._fsp--;


                    			current = this_TextLabel_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDawn.g:279:3: this_PasswordField_4= rulePasswordField
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getPasswordFieldParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PasswordField_4=rulePasswordField();

                    state._fsp--;


                    			current = this_PasswordField_4;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleWindowAttributes"
    // InternalDawn.g:291:1: entryRuleWindowAttributes returns [EObject current=null] : iv_ruleWindowAttributes= ruleWindowAttributes EOF ;
    public final EObject entryRuleWindowAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowAttributes = null;


        try {
            // InternalDawn.g:291:57: (iv_ruleWindowAttributes= ruleWindowAttributes EOF )
            // InternalDawn.g:292:2: iv_ruleWindowAttributes= ruleWindowAttributes EOF
            {
             newCompositeNode(grammarAccess.getWindowAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindowAttributes=ruleWindowAttributes();

            state._fsp--;

             current =iv_ruleWindowAttributes; 
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
    // $ANTLR end "entryRuleWindowAttributes"


    // $ANTLR start "ruleWindowAttributes"
    // InternalDawn.g:298:1: ruleWindowAttributes returns [EObject current=null] : ( ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' )? ( (lv_size_2_0= ruleSizeAttribute ) ) ) ;
    public final EObject ruleWindowAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_text_0_0 = null;

        EObject lv_size_2_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:304:2: ( ( ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' )? ( (lv_size_2_0= ruleSizeAttribute ) ) ) )
            // InternalDawn.g:305:2: ( ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' )? ( (lv_size_2_0= ruleSizeAttribute ) ) )
            {
            // InternalDawn.g:305:2: ( ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' )? ( (lv_size_2_0= ruleSizeAttribute ) ) )
            // InternalDawn.g:306:3: ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' )? ( (lv_size_2_0= ruleSizeAttribute ) )
            {
            // InternalDawn.g:306:3: ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDawn.g:307:4: ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ','
                    {
                    // InternalDawn.g:307:4: ( (lv_text_0_0= ruleTextAttribute ) )
                    // InternalDawn.g:308:5: (lv_text_0_0= ruleTextAttribute )
                    {
                    // InternalDawn.g:308:5: (lv_text_0_0= ruleTextAttribute )
                    // InternalDawn.g:309:6: lv_text_0_0= ruleTextAttribute
                    {

                    						newCompositeNode(grammarAccess.getWindowAttributesAccess().getTextTextAttributeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_text_0_0=ruleTextAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWindowAttributesRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_0_0,
                    							"org.xtext.example.dawn.Dawn.TextAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getWindowAttributesAccess().getCommaKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDawn.g:331:3: ( (lv_size_2_0= ruleSizeAttribute ) )
            // InternalDawn.g:332:4: (lv_size_2_0= ruleSizeAttribute )
            {
            // InternalDawn.g:332:4: (lv_size_2_0= ruleSizeAttribute )
            // InternalDawn.g:333:5: lv_size_2_0= ruleSizeAttribute
            {

            					newCompositeNode(grammarAccess.getWindowAttributesAccess().getSizeSizeAttributeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_size_2_0=ruleSizeAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowAttributesRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_2_0,
            						"org.xtext.example.dawn.Dawn.SizeAttribute");
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
    // $ANTLR end "ruleWindowAttributes"


    // $ANTLR start "entryRuleTextAttribute"
    // InternalDawn.g:354:1: entryRuleTextAttribute returns [EObject current=null] : iv_ruleTextAttribute= ruleTextAttribute EOF ;
    public final EObject entryRuleTextAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAttribute = null;


        try {
            // InternalDawn.g:354:54: (iv_ruleTextAttribute= ruleTextAttribute EOF )
            // InternalDawn.g:355:2: iv_ruleTextAttribute= ruleTextAttribute EOF
            {
             newCompositeNode(grammarAccess.getTextAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextAttribute=ruleTextAttribute();

            state._fsp--;

             current =iv_ruleTextAttribute; 
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
    // $ANTLR end "entryRuleTextAttribute"


    // $ANTLR start "ruleTextAttribute"
    // InternalDawn.g:361:1: ruleTextAttribute returns [EObject current=null] : (otherlv_0= 'name' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalDawn.g:367:2: ( (otherlv_0= 'name' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalDawn.g:368:2: (otherlv_0= 'name' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalDawn.g:368:2: (otherlv_0= 'name' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalDawn.g:369:3: otherlv_0= 'name' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAttributeAccess().getNameKeyword_0());
            		
            // InternalDawn.g:373:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalDawn.g:374:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalDawn.g:374:4: (lv_text_1_0= RULE_STRING )
            // InternalDawn.g:375:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextAttributeAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
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
    // $ANTLR end "ruleTextAttribute"


    // $ANTLR start "entryRuleSizeAttribute"
    // InternalDawn.g:395:1: entryRuleSizeAttribute returns [EObject current=null] : iv_ruleSizeAttribute= ruleSizeAttribute EOF ;
    public final EObject entryRuleSizeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeAttribute = null;


        try {
            // InternalDawn.g:395:54: (iv_ruleSizeAttribute= ruleSizeAttribute EOF )
            // InternalDawn.g:396:2: iv_ruleSizeAttribute= ruleSizeAttribute EOF
            {
             newCompositeNode(grammarAccess.getSizeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizeAttribute=ruleSizeAttribute();

            state._fsp--;

             current =iv_ruleSizeAttribute; 
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
    // $ANTLR end "entryRuleSizeAttribute"


    // $ANTLR start "ruleSizeAttribute"
    // InternalDawn.g:402:1: ruleSizeAttribute returns [EObject current=null] : (otherlv_0= 'having' otherlv_1= 'size' otherlv_2= '[' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= ']' ) ;
    public final EObject ruleSizeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;
        Token lv_width_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDawn.g:408:2: ( (otherlv_0= 'having' otherlv_1= 'size' otherlv_2= '[' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            // InternalDawn.g:409:2: (otherlv_0= 'having' otherlv_1= 'size' otherlv_2= '[' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= ']' )
            {
            // InternalDawn.g:409:2: (otherlv_0= 'having' otherlv_1= 'size' otherlv_2= '[' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= ']' )
            // InternalDawn.g:410:3: otherlv_0= 'having' otherlv_1= 'size' otherlv_2= '[' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAttributeAccess().getHavingKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAttributeAccess().getSizeKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSizeAttributeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDawn.g:422:3: ( (lv_height_3_0= RULE_INT ) )
            // InternalDawn.g:423:4: (lv_height_3_0= RULE_INT )
            {
            // InternalDawn.g:423:4: (lv_height_3_0= RULE_INT )
            // InternalDawn.g:424:5: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_height_3_0, grammarAccess.getSizeAttributeAccess().getHeightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getSizeAttributeAccess().getCommaKeyword_4());
            		
            // InternalDawn.g:444:3: ( (lv_width_5_0= RULE_INT ) )
            // InternalDawn.g:445:4: (lv_width_5_0= RULE_INT )
            {
            // InternalDawn.g:445:4: (lv_width_5_0= RULE_INT )
            // InternalDawn.g:446:5: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_width_5_0, grammarAccess.getSizeAttributeAccess().getWidthINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSizeAttributeAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSizeAttribute"


    // $ANTLR start "entryRuleContainer"
    // InternalDawn.g:470:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDawn.g:470:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDawn.g:471:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDawn.g:477:1: ruleContainer returns [EObject current=null] : (otherlv_0= ':' otherlv_1= '|' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '|' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:483:2: ( (otherlv_0= ':' otherlv_1= '|' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '|' ) )
            // InternalDawn.g:484:2: (otherlv_0= ':' otherlv_1= '|' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '|' )
            {
            // InternalDawn.g:484:2: (otherlv_0= ':' otherlv_1= '|' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '|' )
            // InternalDawn.g:485:3: otherlv_0= ':' otherlv_1= '|' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '|'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getColonKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getVerticalLineKeyword_1());
            		
            // InternalDawn.g:493:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDawn.g:494:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalDawn.g:494:4: (lv_elements_2_0= ruleElement )
            	    // InternalDawn.g:495:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.dawn.Dawn.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getVerticalLineKeyword_3());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleElement"
    // InternalDawn.g:520:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDawn.g:520:48: (iv_ruleElement= ruleElement EOF )
            // InternalDawn.g:521:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDawn.g:527:1: ruleElement returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent ) ) ( (lv_position_1_0= rulePositionAttribute ) ) ( (lv_size_2_0= ruleSizeAttribute ) )? otherlv_3= '|' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_component_0_0 = null;

        EObject lv_position_1_0 = null;

        EObject lv_size_2_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:533:2: ( ( ( (lv_component_0_0= ruleComponent ) ) ( (lv_position_1_0= rulePositionAttribute ) ) ( (lv_size_2_0= ruleSizeAttribute ) )? otherlv_3= '|' ) )
            // InternalDawn.g:534:2: ( ( (lv_component_0_0= ruleComponent ) ) ( (lv_position_1_0= rulePositionAttribute ) ) ( (lv_size_2_0= ruleSizeAttribute ) )? otherlv_3= '|' )
            {
            // InternalDawn.g:534:2: ( ( (lv_component_0_0= ruleComponent ) ) ( (lv_position_1_0= rulePositionAttribute ) ) ( (lv_size_2_0= ruleSizeAttribute ) )? otherlv_3= '|' )
            // InternalDawn.g:535:3: ( (lv_component_0_0= ruleComponent ) ) ( (lv_position_1_0= rulePositionAttribute ) ) ( (lv_size_2_0= ruleSizeAttribute ) )? otherlv_3= '|'
            {
            // InternalDawn.g:535:3: ( (lv_component_0_0= ruleComponent ) )
            // InternalDawn.g:536:4: (lv_component_0_0= ruleComponent )
            {
            // InternalDawn.g:536:4: (lv_component_0_0= ruleComponent )
            // InternalDawn.g:537:5: lv_component_0_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getElementAccess().getComponentComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_component_0_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_0_0,
            						"org.xtext.example.dawn.Dawn.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDawn.g:554:3: ( (lv_position_1_0= rulePositionAttribute ) )
            // InternalDawn.g:555:4: (lv_position_1_0= rulePositionAttribute )
            {
            // InternalDawn.g:555:4: (lv_position_1_0= rulePositionAttribute )
            // InternalDawn.g:556:5: lv_position_1_0= rulePositionAttribute
            {

            					newCompositeNode(grammarAccess.getElementAccess().getPositionPositionAttributeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_position_1_0=rulePositionAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.xtext.example.dawn.Dawn.PositionAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDawn.g:573:3: ( (lv_size_2_0= ruleSizeAttribute ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDawn.g:574:4: (lv_size_2_0= ruleSizeAttribute )
                    {
                    // InternalDawn.g:574:4: (lv_size_2_0= ruleSizeAttribute )
                    // InternalDawn.g:575:5: lv_size_2_0= ruleSizeAttribute
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getSizeSizeAttributeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_size_2_0=ruleSizeAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_2_0,
                    						"org.xtext.example.dawn.Dawn.SizeAttribute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getVerticalLineKeyword_3());
            		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePositionAttribute"
    // InternalDawn.g:600:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // InternalDawn.g:600:58: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // InternalDawn.g:601:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
             newCompositeNode(grammarAccess.getPositionAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositionAttribute=rulePositionAttribute();

            state._fsp--;

             current =iv_rulePositionAttribute; 
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
    // $ANTLR end "entryRulePositionAttribute"


    // $ANTLR start "rulePositionAttribute"
    // InternalDawn.g:607:1: rulePositionAttribute returns [EObject current=null] : (otherlv_0= 'at' otherlv_1= 'position' otherlv_2= '[' ( (lv_x_3_0= RULE_INT ) )+ otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )+ otherlv_6= ']' ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDawn.g:613:2: ( (otherlv_0= 'at' otherlv_1= 'position' otherlv_2= '[' ( (lv_x_3_0= RULE_INT ) )+ otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )+ otherlv_6= ']' ) )
            // InternalDawn.g:614:2: (otherlv_0= 'at' otherlv_1= 'position' otherlv_2= '[' ( (lv_x_3_0= RULE_INT ) )+ otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )+ otherlv_6= ']' )
            {
            // InternalDawn.g:614:2: (otherlv_0= 'at' otherlv_1= 'position' otherlv_2= '[' ( (lv_x_3_0= RULE_INT ) )+ otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )+ otherlv_6= ']' )
            // InternalDawn.g:615:3: otherlv_0= 'at' otherlv_1= 'position' otherlv_2= '[' ( (lv_x_3_0= RULE_INT ) )+ otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )+ otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAttributeAccess().getAtKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAttributeAccess().getPositionKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDawn.g:627:3: ( (lv_x_3_0= RULE_INT ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDawn.g:628:4: (lv_x_3_0= RULE_INT )
            	    {
            	    // InternalDawn.g:628:4: (lv_x_3_0= RULE_INT )
            	    // InternalDawn.g:629:5: lv_x_3_0= RULE_INT
            	    {
            	    lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            	    					newLeafNode(lv_x_3_0, grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPositionAttributeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"x",
            	    						lv_x_3_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getPositionAttributeAccess().getCommaKeyword_4());
            		
            // InternalDawn.g:649:3: ( (lv_y_5_0= RULE_INT ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDawn.g:650:4: (lv_y_5_0= RULE_INT )
            	    {
            	    // InternalDawn.g:650:4: (lv_y_5_0= RULE_INT )
            	    // InternalDawn.g:651:5: lv_y_5_0= RULE_INT
            	    {
            	    lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            	    					newLeafNode(lv_y_5_0, grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPositionAttributeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"y",
            	    						lv_y_5_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "rulePositionAttribute"


    // $ANTLR start "entryRuleButton"
    // InternalDawn.g:675:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalDawn.g:675:47: (iv_ruleButton= ruleButton EOF )
            // InternalDawn.g:676:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalDawn.g:682:1: ruleButton returns [EObject current=null] : (otherlv_0= 'new' otherlv_1= 'button' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleButtonAttributes ) ) otherlv_7= ')' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:688:2: ( (otherlv_0= 'new' otherlv_1= 'button' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleButtonAttributes ) ) otherlv_7= ')' ) )
            // InternalDawn.g:689:2: (otherlv_0= 'new' otherlv_1= 'button' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleButtonAttributes ) ) otherlv_7= ')' )
            {
            // InternalDawn.g:689:2: (otherlv_0= 'new' otherlv_1= 'button' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleButtonAttributes ) ) otherlv_7= ')' )
            // InternalDawn.g:690:3: otherlv_0= 'new' otherlv_1= 'button' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleButtonAttributes ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getNewKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getEqualsSignKeyword_2());
            		
            // InternalDawn.g:702:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDawn.g:703:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDawn.g:703:4: (lv_name_3_0= RULE_ID )
            // InternalDawn.g:704:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getAttributesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_5());
            		
            // InternalDawn.g:728:3: ( (lv_attributes_6_0= ruleButtonAttributes ) )
            // InternalDawn.g:729:4: (lv_attributes_6_0= ruleButtonAttributes )
            {
            // InternalDawn.g:729:4: (lv_attributes_6_0= ruleButtonAttributes )
            // InternalDawn.g:730:5: lv_attributes_6_0= ruleButtonAttributes
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_attributes_6_0=ruleButtonAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_6_0,
            						"org.xtext.example.dawn.Dawn.ButtonAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonAttributes"
    // InternalDawn.g:755:1: entryRuleButtonAttributes returns [EObject current=null] : iv_ruleButtonAttributes= ruleButtonAttributes EOF ;
    public final EObject entryRuleButtonAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonAttributes = null;


        try {
            // InternalDawn.g:755:57: (iv_ruleButtonAttributes= ruleButtonAttributes EOF )
            // InternalDawn.g:756:2: iv_ruleButtonAttributes= ruleButtonAttributes EOF
            {
             newCompositeNode(grammarAccess.getButtonAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonAttributes=ruleButtonAttributes();

            state._fsp--;

             current =iv_ruleButtonAttributes; 
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
    // $ANTLR end "entryRuleButtonAttributes"


    // $ANTLR start "ruleButtonAttributes"
    // InternalDawn.g:762:1: ruleButtonAttributes returns [EObject current=null] : ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' ( (lv_method_2_0= ruleCall ) ) ) ;
    public final EObject ruleButtonAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_text_0_0 = null;

        EObject lv_method_2_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:768:2: ( ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' ( (lv_method_2_0= ruleCall ) ) ) )
            // InternalDawn.g:769:2: ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' ( (lv_method_2_0= ruleCall ) ) )
            {
            // InternalDawn.g:769:2: ( ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' ( (lv_method_2_0= ruleCall ) ) )
            // InternalDawn.g:770:3: ( (lv_text_0_0= ruleTextAttribute ) ) otherlv_1= ',' ( (lv_method_2_0= ruleCall ) )
            {
            // InternalDawn.g:770:3: ( (lv_text_0_0= ruleTextAttribute ) )
            // InternalDawn.g:771:4: (lv_text_0_0= ruleTextAttribute )
            {
            // InternalDawn.g:771:4: (lv_text_0_0= ruleTextAttribute )
            // InternalDawn.g:772:5: lv_text_0_0= ruleTextAttribute
            {

            					newCompositeNode(grammarAccess.getButtonAttributesAccess().getTextTextAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_text_0_0=ruleTextAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonAttributesRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_0_0,
            						"org.xtext.example.dawn.Dawn.TextAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAttributesAccess().getCommaKeyword_1());
            		
            // InternalDawn.g:793:3: ( (lv_method_2_0= ruleCall ) )
            // InternalDawn.g:794:4: (lv_method_2_0= ruleCall )
            {
            // InternalDawn.g:794:4: (lv_method_2_0= ruleCall )
            // InternalDawn.g:795:5: lv_method_2_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getButtonAttributesAccess().getMethodCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_method_2_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonAttributesRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_2_0,
            						"org.xtext.example.dawn.Dawn.Call");
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
    // $ANTLR end "ruleButtonAttributes"


    // $ANTLR start "entryRuleCall"
    // InternalDawn.g:816:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalDawn.g:816:45: (iv_ruleCall= ruleCall EOF )
            // InternalDawn.g:817:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalDawn.g:823:1: ruleCall returns [EObject current=null] : (otherlv_0= 'function:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDawn.g:829:2: ( (otherlv_0= 'function:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDawn.g:830:2: (otherlv_0= 'function:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDawn.g:830:2: (otherlv_0= 'function:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDawn.g:831:3: otherlv_0= 'function:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCallAccess().getFunctionKeyword_0());
            		
            // InternalDawn.g:835:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDawn.g:836:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDawn.g:836:4: (lv_name_1_0= RULE_ID )
            // InternalDawn.g:837:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCallAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleTextField"
    // InternalDawn.g:857:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // InternalDawn.g:857:50: (iv_ruleTextField= ruleTextField EOF )
            // InternalDawn.g:858:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
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
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalDawn.g:864:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'new' otherlv_1= 'text-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_text_6_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:870:2: ( (otherlv_0= 'new' otherlv_1= 'text-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' ) )
            // InternalDawn.g:871:2: (otherlv_0= 'new' otherlv_1= 'text-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' )
            {
            // InternalDawn.g:871:2: (otherlv_0= 'new' otherlv_1= 'text-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' )
            // InternalDawn.g:872:3: otherlv_0= 'new' otherlv_1= 'text-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getNewKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getTextFieldKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getEqualsSignKeyword_2());
            		
            // InternalDawn.g:884:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDawn.g:885:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDawn.g:885:4: (lv_name_3_0= RULE_ID )
            // InternalDawn.g:886:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTextFieldAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTextFieldAccess().getAttributesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getLeftParenthesisKeyword_5());
            		
            // InternalDawn.g:910:3: ( (lv_text_6_0= ruleTextAttribute ) )
            // InternalDawn.g:911:4: (lv_text_6_0= ruleTextAttribute )
            {
            // InternalDawn.g:911:4: (lv_text_6_0= ruleTextAttribute )
            // InternalDawn.g:912:5: lv_text_6_0= ruleTextAttribute
            {

            					newCompositeNode(grammarAccess.getTextFieldAccess().getTextTextAttributeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_text_6_0=ruleTextAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFieldRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_6_0,
            						"org.xtext.example.dawn.Dawn.TextAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTextFieldAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTextLabel"
    // InternalDawn.g:937:1: entryRuleTextLabel returns [EObject current=null] : iv_ruleTextLabel= ruleTextLabel EOF ;
    public final EObject entryRuleTextLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLabel = null;


        try {
            // InternalDawn.g:937:50: (iv_ruleTextLabel= ruleTextLabel EOF )
            // InternalDawn.g:938:2: iv_ruleTextLabel= ruleTextLabel EOF
            {
             newCompositeNode(grammarAccess.getTextLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextLabel=ruleTextLabel();

            state._fsp--;

             current =iv_ruleTextLabel; 
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
    // $ANTLR end "entryRuleTextLabel"


    // $ANTLR start "ruleTextLabel"
    // InternalDawn.g:944:1: ruleTextLabel returns [EObject current=null] : (otherlv_0= 'new' otherlv_1= 'text-label' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' ) ;
    public final EObject ruleTextLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_text_6_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:950:2: ( (otherlv_0= 'new' otherlv_1= 'text-label' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' ) )
            // InternalDawn.g:951:2: (otherlv_0= 'new' otherlv_1= 'text-label' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' )
            {
            // InternalDawn.g:951:2: (otherlv_0= 'new' otherlv_1= 'text-label' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' )
            // InternalDawn.g:952:3: otherlv_0= 'new' otherlv_1= 'text-label' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getTextLabelAccess().getNewKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTextLabelAccess().getTextLabelKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTextLabelAccess().getEqualsSignKeyword_2());
            		
            // InternalDawn.g:964:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDawn.g:965:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDawn.g:965:4: (lv_name_3_0= RULE_ID )
            // InternalDawn.g:966:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTextLabelAccess().getAttributesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getTextLabelAccess().getLeftParenthesisKeyword_5());
            		
            // InternalDawn.g:990:3: ( (lv_text_6_0= ruleTextAttribute ) )
            // InternalDawn.g:991:4: (lv_text_6_0= ruleTextAttribute )
            {
            // InternalDawn.g:991:4: (lv_text_6_0= ruleTextAttribute )
            // InternalDawn.g:992:5: lv_text_6_0= ruleTextAttribute
            {

            					newCompositeNode(grammarAccess.getTextLabelAccess().getTextTextAttributeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_text_6_0=ruleTextAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextLabelRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_6_0,
            						"org.xtext.example.dawn.Dawn.TextAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTextLabelAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleTextLabel"


    // $ANTLR start "entryRulePasswordField"
    // InternalDawn.g:1017:1: entryRulePasswordField returns [EObject current=null] : iv_rulePasswordField= rulePasswordField EOF ;
    public final EObject entryRulePasswordField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePasswordField = null;


        try {
            // InternalDawn.g:1017:54: (iv_rulePasswordField= rulePasswordField EOF )
            // InternalDawn.g:1018:2: iv_rulePasswordField= rulePasswordField EOF
            {
             newCompositeNode(grammarAccess.getPasswordFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePasswordField=rulePasswordField();

            state._fsp--;

             current =iv_rulePasswordField; 
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
    // $ANTLR end "entryRulePasswordField"


    // $ANTLR start "rulePasswordField"
    // InternalDawn.g:1024:1: rulePasswordField returns [EObject current=null] : (otherlv_0= 'new' otherlv_1= 'password-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' ) ;
    public final EObject rulePasswordField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_text_6_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:1030:2: ( (otherlv_0= 'new' otherlv_1= 'password-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' ) )
            // InternalDawn.g:1031:2: (otherlv_0= 'new' otherlv_1= 'password-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' )
            {
            // InternalDawn.g:1031:2: (otherlv_0= 'new' otherlv_1= 'password-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')' )
            // InternalDawn.g:1032:3: otherlv_0= 'new' otherlv_1= 'password-field' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_text_6_0= ruleTextAttribute ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPasswordFieldAccess().getNewKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getPasswordFieldAccess().getPasswordFieldKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPasswordFieldAccess().getEqualsSignKeyword_2());
            		
            // InternalDawn.g:1044:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDawn.g:1045:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDawn.g:1045:4: (lv_name_3_0= RULE_ID )
            // InternalDawn.g:1046:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPasswordFieldAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPasswordFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getPasswordFieldAccess().getAttributesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getPasswordFieldAccess().getLeftParenthesisKeyword_5());
            		
            // InternalDawn.g:1070:3: ( (lv_text_6_0= ruleTextAttribute ) )
            // InternalDawn.g:1071:4: (lv_text_6_0= ruleTextAttribute )
            {
            // InternalDawn.g:1071:4: (lv_text_6_0= ruleTextAttribute )
            // InternalDawn.g:1072:5: lv_text_6_0= ruleTextAttribute
            {

            					newCompositeNode(grammarAccess.getPasswordFieldAccess().getTextTextAttributeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_text_6_0=ruleTextAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPasswordFieldRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_6_0,
            						"org.xtext.example.dawn.Dawn.TextAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPasswordFieldAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "rulePasswordField"


    // $ANTLR start "entryRuleSingleChoice"
    // InternalDawn.g:1097:1: entryRuleSingleChoice returns [EObject current=null] : iv_ruleSingleChoice= ruleSingleChoice EOF ;
    public final EObject entryRuleSingleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoice = null;


        try {
            // InternalDawn.g:1097:53: (iv_ruleSingleChoice= ruleSingleChoice EOF )
            // InternalDawn.g:1098:2: iv_ruleSingleChoice= ruleSingleChoice EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleChoice=ruleSingleChoice();

            state._fsp--;

             current =iv_ruleSingleChoice; 
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
    // $ANTLR end "entryRuleSingleChoice"


    // $ANTLR start "ruleSingleChoice"
    // InternalDawn.g:1104:1: ruleSingleChoice returns [EObject current=null] : (otherlv_0= 'new' otherlv_1= 'choice' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleSingleChoiceAttributes ) ) otherlv_7= ')' ) ;
    public final EObject ruleSingleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:1110:2: ( (otherlv_0= 'new' otherlv_1= 'choice' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleSingleChoiceAttributes ) ) otherlv_7= ')' ) )
            // InternalDawn.g:1111:2: (otherlv_0= 'new' otherlv_1= 'choice' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleSingleChoiceAttributes ) ) otherlv_7= ')' )
            {
            // InternalDawn.g:1111:2: (otherlv_0= 'new' otherlv_1= 'choice' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleSingleChoiceAttributes ) ) otherlv_7= ')' )
            // InternalDawn.g:1112:3: otherlv_0= 'new' otherlv_1= 'choice' otherlv_2= '=' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'attributes' otherlv_5= '(' ( (lv_attributes_6_0= ruleSingleChoiceAttributes ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleChoiceAccess().getNewKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleChoiceAccess().getChoiceKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleChoiceAccess().getEqualsSignKeyword_2());
            		
            // InternalDawn.g:1124:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDawn.g:1125:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDawn.g:1125:4: (lv_name_3_0= RULE_ID )
            // InternalDawn.g:1126:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleChoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getSingleChoiceAccess().getAttributesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleChoiceAccess().getLeftParenthesisKeyword_5());
            		
            // InternalDawn.g:1150:3: ( (lv_attributes_6_0= ruleSingleChoiceAttributes ) )
            // InternalDawn.g:1151:4: (lv_attributes_6_0= ruleSingleChoiceAttributes )
            {
            // InternalDawn.g:1151:4: (lv_attributes_6_0= ruleSingleChoiceAttributes )
            // InternalDawn.g:1152:5: lv_attributes_6_0= ruleSingleChoiceAttributes
            {

            					newCompositeNode(grammarAccess.getSingleChoiceAccess().getAttributesSingleChoiceAttributesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_attributes_6_0=ruleSingleChoiceAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_6_0,
            						"org.xtext.example.dawn.Dawn.SingleChoiceAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSingleChoiceAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleSingleChoice"


    // $ANTLR start "entryRuleSingleChoiceAttributes"
    // InternalDawn.g:1177:1: entryRuleSingleChoiceAttributes returns [EObject current=null] : iv_ruleSingleChoiceAttributes= ruleSingleChoiceAttributes EOF ;
    public final EObject entryRuleSingleChoiceAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceAttributes = null;


        try {
            // InternalDawn.g:1177:63: (iv_ruleSingleChoiceAttributes= ruleSingleChoiceAttributes EOF )
            // InternalDawn.g:1178:2: iv_ruleSingleChoiceAttributes= ruleSingleChoiceAttributes EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleChoiceAttributes=ruleSingleChoiceAttributes();

            state._fsp--;

             current =iv_ruleSingleChoiceAttributes; 
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
    // $ANTLR end "entryRuleSingleChoiceAttributes"


    // $ANTLR start "ruleSingleChoiceAttributes"
    // InternalDawn.g:1184:1: ruleSingleChoiceAttributes returns [EObject current=null] : ( ( (lv_text_0_0= ruleTextAttribute ) ) (otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) ) )+ ) ;
    public final EObject ruleSingleChoiceAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_text_0_0 = null;

        EObject lv_components_3_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:1190:2: ( ( ( (lv_text_0_0= ruleTextAttribute ) ) (otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) ) )+ ) )
            // InternalDawn.g:1191:2: ( ( (lv_text_0_0= ruleTextAttribute ) ) (otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) ) )+ )
            {
            // InternalDawn.g:1191:2: ( ( (lv_text_0_0= ruleTextAttribute ) ) (otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) ) )+ )
            // InternalDawn.g:1192:3: ( (lv_text_0_0= ruleTextAttribute ) ) (otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) ) )+
            {
            // InternalDawn.g:1192:3: ( (lv_text_0_0= ruleTextAttribute ) )
            // InternalDawn.g:1193:4: (lv_text_0_0= ruleTextAttribute )
            {
            // InternalDawn.g:1193:4: (lv_text_0_0= ruleTextAttribute )
            // InternalDawn.g:1194:5: lv_text_0_0= ruleTextAttribute
            {

            					newCompositeNode(grammarAccess.getSingleChoiceAttributesAccess().getTextTextAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_text_0_0=ruleTextAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleChoiceAttributesRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_0_0,
            						"org.xtext.example.dawn.Dawn.TextAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDawn.g:1211:3: (otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDawn.g:1212:4: otherlv_1= ',' otherlv_2= 'options' ( (lv_components_3_0= ruleSingleChoiceOptions ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_36); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSingleChoiceAttributesAccess().getCommaKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,36,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSingleChoiceAttributesAccess().getOptionsKeyword_1_1());
            	    			
            	    // InternalDawn.g:1220:4: ( (lv_components_3_0= ruleSingleChoiceOptions ) )
            	    // InternalDawn.g:1221:5: (lv_components_3_0= ruleSingleChoiceOptions )
            	    {
            	    // InternalDawn.g:1221:5: (lv_components_3_0= ruleSingleChoiceOptions )
            	    // InternalDawn.g:1222:6: lv_components_3_0= ruleSingleChoiceOptions
            	    {

            	    						newCompositeNode(grammarAccess.getSingleChoiceAttributesAccess().getComponentsSingleChoiceOptionsParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_components_3_0=ruleSingleChoiceOptions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSingleChoiceAttributesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_3_0,
            	    							"org.xtext.example.dawn.Dawn.SingleChoiceOptions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "ruleSingleChoiceAttributes"


    // $ANTLR start "entryRuleSingleChoiceOptions"
    // InternalDawn.g:1244:1: entryRuleSingleChoiceOptions returns [EObject current=null] : iv_ruleSingleChoiceOptions= ruleSingleChoiceOptions EOF ;
    public final EObject entryRuleSingleChoiceOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceOptions = null;


        try {
            // InternalDawn.g:1244:60: (iv_ruleSingleChoiceOptions= ruleSingleChoiceOptions EOF )
            // InternalDawn.g:1245:2: iv_ruleSingleChoiceOptions= ruleSingleChoiceOptions EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleChoiceOptions=ruleSingleChoiceOptions();

            state._fsp--;

             current =iv_ruleSingleChoiceOptions; 
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
    // $ANTLR end "entryRuleSingleChoiceOptions"


    // $ANTLR start "ruleSingleChoiceOptions"
    // InternalDawn.g:1251:1: ruleSingleChoiceOptions returns [EObject current=null] : (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'labels' ( (lv_text_3_0= ruleTextAttribute ) ) ) ;
    public final EObject ruleSingleChoiceOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalDawn.g:1257:2: ( (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'labels' ( (lv_text_3_0= ruleTextAttribute ) ) ) )
            // InternalDawn.g:1258:2: (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'labels' ( (lv_text_3_0= ruleTextAttribute ) ) )
            {
            // InternalDawn.g:1258:2: (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'labels' ( (lv_text_3_0= ruleTextAttribute ) ) )
            // InternalDawn.g:1259:3: otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'labels' ( (lv_text_3_0= ruleTextAttribute ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleChoiceOptionsAccess().getLeftParenthesisRightParenthesisKeyword_0());
            		
            // InternalDawn.g:1263:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDawn.g:1264:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDawn.g:1264:4: (lv_name_1_0= RULE_ID )
            // InternalDawn.g:1265:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceOptionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleChoiceOptionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleChoiceOptionsAccess().getLabelsKeyword_2());
            		
            // InternalDawn.g:1285:3: ( (lv_text_3_0= ruleTextAttribute ) )
            // InternalDawn.g:1286:4: (lv_text_3_0= ruleTextAttribute )
            {
            // InternalDawn.g:1286:4: (lv_text_3_0= ruleTextAttribute )
            // InternalDawn.g:1287:5: lv_text_3_0= ruleTextAttribute
            {

            					newCompositeNode(grammarAccess.getSingleChoiceOptionsAccess().getTextTextAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_3_0=ruleTextAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleChoiceOptionsRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.example.dawn.Dawn.TextAttribute");
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
    // $ANTLR end "ruleSingleChoiceOptions"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004300000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});

}