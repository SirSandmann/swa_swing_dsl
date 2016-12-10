/*
 * generated by Xtext 2.10.0
 */
grammar InternalDawn;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.dawn.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getWindowWindowParserRuleCall_0_0());
				}
				lv_window_0_0=ruleWindow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"window",
						lv_window_0_0,
						"org.xtext.example.dawn.Dawn.Window");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_1_0());
				}
				lv_components_1_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"components",
						lv_components_1_0,
						"org.xtext.example.dawn.Dawn.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleWindow
entryRuleWindow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWindowRule()); }
	iv_ruleWindow=ruleWindow
	{ $current=$iv_ruleWindow.current; }
	EOF;

// Rule Window
ruleWindow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='create'
		{
			newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getCreateKeyword_0());
		}
		otherlv_1='new'
		{
			newLeafNode(otherlv_1, grammarAccess.getWindowAccess().getNewKeyword_1());
		}
		otherlv_2='window'
		{
			newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getWindowKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getWindowAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWindowRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='with'
		{
			newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getWithKeyword_4());
		}
		otherlv_5='attributes'
		{
			newLeafNode(otherlv_5, grammarAccess.getWindowAccess().getAttributesKeyword_5());
		}
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getWindowAccess().getLeftParenthesisKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWindowAccess().getAttributesWindowAttributesParserRuleCall_7_0());
				}
				lv_attributes_7_0=ruleWindowAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWindowRule());
					}
					set(
						$current,
						"attributes",
						lv_attributes_7_0,
						"org.xtext.example.dawn.Dawn.WindowAttributes");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getWindowAccess().getRightParenthesisKeyword_8());
		}
		otherlv_9='containing'
		{
			newLeafNode(otherlv_9, grammarAccess.getWindowAccess().getContainingKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWindowAccess().getContainerContainerParserRuleCall_10_0());
				}
				lv_container_10_0=ruleContainer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWindowRule());
					}
					set(
						$current,
						"container",
						lv_container_10_0,
						"org.xtext.example.dawn.Dawn.Container");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentAccess().getButtonParserRuleCall_0());
		}
		this_Button_0=ruleButton
		{
			$current = $this_Button_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getTextFieldParserRuleCall_1());
		}
		this_TextField_1=ruleTextField
		{
			$current = $this_TextField_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getSingleChoiceParserRuleCall_2());
		}
		this_SingleChoice_2=ruleSingleChoice
		{
			$current = $this_SingleChoice_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getTextLabelParserRuleCall_3());
		}
		this_TextLabel_3=ruleTextLabel
		{
			$current = $this_TextLabel_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentAccess().getPasswordFieldParserRuleCall_4());
		}
		this_PasswordField_4=rulePasswordField
		{
			$current = $this_PasswordField_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWindowAttributes
entryRuleWindowAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWindowAttributesRule()); }
	iv_ruleWindowAttributes=ruleWindowAttributes
	{ $current=$iv_ruleWindowAttributes.current; }
	EOF;

// Rule WindowAttributes
ruleWindowAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getWindowAttributesAccess().getTextTextAttributeParserRuleCall_0_0_0());
					}
					lv_text_0_0=ruleTextAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWindowAttributesRule());
						}
						set(
							$current,
							"text",
							lv_text_0_0,
							"org.xtext.example.dawn.Dawn.TextAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getWindowAttributesAccess().getCommaKeyword_0_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getWindowAttributesAccess().getSizeSizeAttributeParserRuleCall_1_0());
				}
				lv_size_2_0=ruleSizeAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWindowAttributesRule());
					}
					set(
						$current,
						"size",
						lv_size_2_0,
						"org.xtext.example.dawn.Dawn.SizeAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTextAttribute
entryRuleTextAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextAttributeRule()); }
	iv_ruleTextAttribute=ruleTextAttribute
	{ $current=$iv_ruleTextAttribute.current; }
	EOF;

// Rule TextAttribute
ruleTextAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='name'
		{
			newLeafNode(otherlv_0, grammarAccess.getTextAttributeAccess().getNameKeyword_0());
		}
		(
			(
				lv_text_1_0=RULE_STRING
				{
					newLeafNode(lv_text_1_0, grammarAccess.getTextAttributeAccess().getTextSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleSizeAttribute
entryRuleSizeAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSizeAttributeRule()); }
	iv_ruleSizeAttribute=ruleSizeAttribute
	{ $current=$iv_ruleSizeAttribute.current; }
	EOF;

// Rule SizeAttribute
ruleSizeAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='having'
		{
			newLeafNode(otherlv_0, grammarAccess.getSizeAttributeAccess().getHavingKeyword_0());
		}
		otherlv_1='size'
		{
			newLeafNode(otherlv_1, grammarAccess.getSizeAttributeAccess().getSizeKeyword_1());
		}
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getSizeAttributeAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				lv_height_3_0=RULE_INT
				{
					newLeafNode(lv_height_3_0, grammarAccess.getSizeAttributeAccess().getHeightINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getSizeAttributeAccess().getCommaKeyword_4());
		}
		(
			(
				lv_width_5_0=RULE_INT
				{
					newLeafNode(lv_width_5_0, grammarAccess.getSizeAttributeAccess().getWidthINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getSizeAttributeAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getColonKeyword_0());
		}
		otherlv_1='|'
		{
			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getVerticalLineKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_2_0());
				}
				lv_elements_2_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerRule());
					}
					add(
						$current,
						"elements",
						lv_elements_2_0,
						"org.xtext.example.dawn.Dawn.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='|'
		{
			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getVerticalLineKeyword_3());
		}
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getComponentComponentParserRuleCall_0_0());
				}
				lv_component_0_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"component",
						lv_component_0_0,
						"org.xtext.example.dawn.Dawn.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getPositionPositionAttributeParserRuleCall_1_0());
				}
				lv_position_1_0=rulePositionAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"position",
						lv_position_1_0,
						"org.xtext.example.dawn.Dawn.PositionAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getSizeSizeAttributeParserRuleCall_2_0());
				}
				lv_size_2_0=ruleSizeAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"size",
						lv_size_2_0,
						"org.xtext.example.dawn.Dawn.SizeAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='|'
		{
			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getVerticalLineKeyword_3());
		}
	)
;

// Entry rule entryRulePositionAttribute
entryRulePositionAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPositionAttributeRule()); }
	iv_rulePositionAttribute=rulePositionAttribute
	{ $current=$iv_rulePositionAttribute.current; }
	EOF;

// Rule PositionAttribute
rulePositionAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='at'
		{
			newLeafNode(otherlv_0, grammarAccess.getPositionAttributeAccess().getAtKeyword_0());
		}
		otherlv_1='position'
		{
			newLeafNode(otherlv_1, grammarAccess.getPositionAttributeAccess().getPositionKeyword_1());
		}
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				lv_x_3_0=RULE_INT
				{
					newLeafNode(lv_x_3_0, grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPositionAttributeRule());
					}
					addWithLastConsumed(
						$current,
						"x",
						lv_x_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)+
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getPositionAttributeAccess().getCommaKeyword_4());
		}
		(
			(
				lv_y_5_0=RULE_INT
				{
					newLeafNode(lv_y_5_0, grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPositionAttributeRule());
					}
					addWithLastConsumed(
						$current,
						"y",
						lv_y_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)+
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getNewKeyword_0());
		}
		otherlv_1='button'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='attributes'
		{
			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getAttributesKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonAccess().getAttributesButtonAttributesParserRuleCall_6_0());
				}
				lv_attributes_6_0=ruleButtonAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonRule());
					}
					set(
						$current,
						"attributes",
						lv_attributes_6_0,
						"org.xtext.example.dawn.Dawn.ButtonAttributes");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleButtonAttributes
entryRuleButtonAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonAttributesRule()); }
	iv_ruleButtonAttributes=ruleButtonAttributes
	{ $current=$iv_ruleButtonAttributes.current; }
	EOF;

// Rule ButtonAttributes
ruleButtonAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonAttributesAccess().getTextTextAttributeParserRuleCall_0_0());
				}
				lv_text_0_0=ruleTextAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonAttributesRule());
					}
					set(
						$current,
						"text",
						lv_text_0_0,
						"org.xtext.example.dawn.Dawn.TextAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=','
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonAttributesAccess().getCommaKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonAttributesAccess().getMethodCallParserRuleCall_2_0());
				}
				lv_method_2_0=ruleCall
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonAttributesRule());
					}
					set(
						$current,
						"method",
						lv_method_2_0,
						"org.xtext.example.dawn.Dawn.Call");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCall
entryRuleCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallRule()); }
	iv_ruleCall=ruleCall
	{ $current=$iv_ruleCall.current; }
	EOF;

// Rule Call
ruleCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function:'
		{
			newLeafNode(otherlv_0, grammarAccess.getCallAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCallAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCallRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTextField
entryRuleTextField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextFieldRule()); }
	iv_ruleTextField=ruleTextField
	{ $current=$iv_ruleTextField.current; }
	EOF;

// Rule TextField
ruleTextField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getNewKeyword_0());
		}
		otherlv_1='text-field'
		{
			newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getTextFieldKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getTextFieldAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='attributes'
		{
			newLeafNode(otherlv_4, grammarAccess.getTextFieldAccess().getAttributesKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTextFieldAccess().getTextTextAttributeParserRuleCall_6_0());
				}
				lv_text_6_0=ruleTextAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextFieldRule());
					}
					set(
						$current,
						"text",
						lv_text_6_0,
						"org.xtext.example.dawn.Dawn.TextAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getTextFieldAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleTextLabel
entryRuleTextLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextLabelRule()); }
	iv_ruleTextLabel=ruleTextLabel
	{ $current=$iv_ruleTextLabel.current; }
	EOF;

// Rule TextLabel
ruleTextLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getTextLabelAccess().getNewKeyword_0());
		}
		otherlv_1='text-label'
		{
			newLeafNode(otherlv_1, grammarAccess.getTextLabelAccess().getTextLabelKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getTextLabelAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextLabelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='attributes'
		{
			newLeafNode(otherlv_4, grammarAccess.getTextLabelAccess().getAttributesKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getTextLabelAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTextLabelAccess().getTextTextAttributeParserRuleCall_6_0());
				}
				lv_text_6_0=ruleTextAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextLabelRule());
					}
					set(
						$current,
						"text",
						lv_text_6_0,
						"org.xtext.example.dawn.Dawn.TextAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getTextLabelAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRulePasswordField
entryRulePasswordField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPasswordFieldRule()); }
	iv_rulePasswordField=rulePasswordField
	{ $current=$iv_rulePasswordField.current; }
	EOF;

// Rule PasswordField
rulePasswordField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getPasswordFieldAccess().getNewKeyword_0());
		}
		otherlv_1='password-field'
		{
			newLeafNode(otherlv_1, grammarAccess.getPasswordFieldAccess().getPasswordFieldKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getPasswordFieldAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getPasswordFieldAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPasswordFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='attributes'
		{
			newLeafNode(otherlv_4, grammarAccess.getPasswordFieldAccess().getAttributesKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getPasswordFieldAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPasswordFieldAccess().getTextTextAttributeParserRuleCall_6_0());
				}
				lv_text_6_0=ruleTextAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPasswordFieldRule());
					}
					set(
						$current,
						"text",
						lv_text_6_0,
						"org.xtext.example.dawn.Dawn.TextAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getPasswordFieldAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleSingleChoice
entryRuleSingleChoice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleChoiceRule()); }
	iv_ruleSingleChoice=ruleSingleChoice
	{ $current=$iv_ruleSingleChoice.current; }
	EOF;

// Rule SingleChoice
ruleSingleChoice returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleChoiceAccess().getNewKeyword_0());
		}
		otherlv_1='choice'
		{
			newLeafNode(otherlv_1, grammarAccess.getSingleChoiceAccess().getChoiceKeyword_1());
		}
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getSingleChoiceAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSingleChoiceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='attributes'
		{
			newLeafNode(otherlv_4, grammarAccess.getSingleChoiceAccess().getAttributesKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getSingleChoiceAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleChoiceAccess().getAttributesSingleChoiceAttributesParserRuleCall_6_0());
				}
				lv_attributes_6_0=ruleSingleChoiceAttributes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
					}
					set(
						$current,
						"attributes",
						lv_attributes_6_0,
						"org.xtext.example.dawn.Dawn.SingleChoiceAttributes");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getSingleChoiceAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleSingleChoiceAttributes
entryRuleSingleChoiceAttributes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleChoiceAttributesRule()); }
	iv_ruleSingleChoiceAttributes=ruleSingleChoiceAttributes
	{ $current=$iv_ruleSingleChoiceAttributes.current; }
	EOF;

// Rule SingleChoiceAttributes
ruleSingleChoiceAttributes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleChoiceAttributesAccess().getTextTextAttributeParserRuleCall_0_0());
				}
				lv_text_0_0=ruleTextAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleChoiceAttributesRule());
					}
					set(
						$current,
						"text",
						lv_text_0_0,
						"org.xtext.example.dawn.Dawn.TextAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getSingleChoiceAttributesAccess().getCommaKeyword_1_0());
			}
			otherlv_2='options'
			{
				newLeafNode(otherlv_2, grammarAccess.getSingleChoiceAttributesAccess().getOptionsKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleChoiceAttributesAccess().getComponentsSingleChoiceOptionsParserRuleCall_1_2_0());
					}
					lv_components_3_0=ruleSingleChoiceOptions
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleChoiceAttributesRule());
						}
						add(
							$current,
							"components",
							lv_components_3_0,
							"org.xtext.example.dawn.Dawn.SingleChoiceOptions");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleSingleChoiceOptions
entryRuleSingleChoiceOptions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleChoiceOptionsRule()); }
	iv_ruleSingleChoiceOptions=ruleSingleChoiceOptions
	{ $current=$iv_ruleSingleChoiceOptions.current; }
	EOF;

// Rule SingleChoiceOptions
ruleSingleChoiceOptions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='()'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleChoiceOptionsAccess().getLeftParenthesisRightParenthesisKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceOptionsAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSingleChoiceOptionsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='labels'
		{
			newLeafNode(otherlv_2, grammarAccess.getSingleChoiceOptionsAccess().getLabelsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleChoiceOptionsAccess().getTextTextAttributeParserRuleCall_3_0());
				}
				lv_text_3_0=ruleTextAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleChoiceOptionsRule());
					}
					set(
						$current,
						"text",
						lv_text_3_0,
						"org.xtext.example.dawn.Dawn.TextAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;