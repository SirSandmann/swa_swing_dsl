/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.dawn.dawn.Button;
import org.xtext.example.dawn.dawn.ButtonAttributes;
import org.xtext.example.dawn.dawn.Call;
import org.xtext.example.dawn.dawn.Container;
import org.xtext.example.dawn.dawn.DawnPackage;
import org.xtext.example.dawn.dawn.Element;
import org.xtext.example.dawn.dawn.GapAttribute;
import org.xtext.example.dawn.dawn.Model;
import org.xtext.example.dawn.dawn.PasswordField;
import org.xtext.example.dawn.dawn.PositionAttribute;
import org.xtext.example.dawn.dawn.SingleChoice;
import org.xtext.example.dawn.dawn.SingleChoiceAttributes;
import org.xtext.example.dawn.dawn.SingleChoiceOptions;
import org.xtext.example.dawn.dawn.SizeAttribute;
import org.xtext.example.dawn.dawn.TextAttribute;
import org.xtext.example.dawn.dawn.TextField;
import org.xtext.example.dawn.dawn.TextLabel;
import org.xtext.example.dawn.dawn.Window;
import org.xtext.example.dawn.dawn.WindowAttributes;
import org.xtext.example.dawn.services.DawnGrammarAccess;

@SuppressWarnings("all")
public class DawnSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DawnGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DawnPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DawnPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case DawnPackage.BUTTON_ATTRIBUTES:
				sequence_ButtonAttributes(context, (ButtonAttributes) semanticObject); 
				return; 
			case DawnPackage.CALL:
				sequence_Call(context, (Call) semanticObject); 
				return; 
			case DawnPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case DawnPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case DawnPackage.GAP_ATTRIBUTE:
				sequence_GapAttribute(context, (GapAttribute) semanticObject); 
				return; 
			case DawnPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DawnPackage.PASSWORD_FIELD:
				sequence_PasswordField(context, (PasswordField) semanticObject); 
				return; 
			case DawnPackage.POSITION_ATTRIBUTE:
				sequence_PositionAttribute(context, (PositionAttribute) semanticObject); 
				return; 
			case DawnPackage.SINGLE_CHOICE:
				sequence_SingleChoice(context, (SingleChoice) semanticObject); 
				return; 
			case DawnPackage.SINGLE_CHOICE_ATTRIBUTES:
				sequence_SingleChoiceAttributes(context, (SingleChoiceAttributes) semanticObject); 
				return; 
			case DawnPackage.SINGLE_CHOICE_OPTIONS:
				sequence_SingleChoiceOptions(context, (SingleChoiceOptions) semanticObject); 
				return; 
			case DawnPackage.SIZE_ATTRIBUTE:
				sequence_SizeAttribute(context, (SizeAttribute) semanticObject); 
				return; 
			case DawnPackage.TEXT_ATTRIBUTE:
				sequence_TextAttribute(context, (TextAttribute) semanticObject); 
				return; 
			case DawnPackage.TEXT_FIELD:
				sequence_TextField(context, (TextField) semanticObject); 
				return; 
			case DawnPackage.TEXT_LABEL:
				sequence_TextLabel(context, (TextLabel) semanticObject); 
				return; 
			case DawnPackage.WINDOW:
				sequence_Window(context, (Window) semanticObject); 
				return; 
			case DawnPackage.WINDOW_ATTRIBUTES:
				sequence_WindowAttributes(context, (WindowAttributes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ButtonAttributes returns ButtonAttributes
	 *
	 * Constraint:
	 *     (text=TextAttribute method=Call)
	 */
	protected void sequence_ButtonAttributes(ISerializationContext context, ButtonAttributes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.BUTTON_ATTRIBUTES__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.BUTTON_ATTRIBUTES__TEXT));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.BUTTON_ATTRIBUTES__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.BUTTON_ATTRIBUTES__METHOD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAttributesAccess().getTextTextAttributeParserRuleCall_0_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getButtonAttributesAccess().getMethodCallParserRuleCall_2_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (name=ID attributes=ButtonAttributes)
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.COMPONENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.BUTTON__ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.BUTTON__ATTRIBUTES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getButtonAccess().getAttributesButtonAttributesParserRuleCall_6_0(), semanticObject.getAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Call returns Call
	 *
	 * Constraint:
	 *     (name=ID action=ActionEnum)
	 */
	protected void sequence_Call(ISerializationContext context, Call semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.CALL__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.CALL__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.CALL__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCallAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCallAccess().getActionActionEnumParserRuleCall_3_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     elements+=Element+
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Element
	 *
	 * Constraint:
	 *     (component=Component position=PositionAttribute size=SizeAttribute?)
	 */
	protected void sequence_Element(ISerializationContext context, Element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GapAttribute returns GapAttribute
	 *
	 * Constraint:
	 *     (gapWidth=INT gapHeight=INT)
	 */
	protected void sequence_GapAttribute(ISerializationContext context, GapAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.GAP_ATTRIBUTE__GAP_WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.GAP_ATTRIBUTE__GAP_WIDTH));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.GAP_ATTRIBUTE__GAP_HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.GAP_ATTRIBUTE__GAP_HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGapAttributeAccess().getGapWidthINTTerminalRuleCall_3_0(), semanticObject.getGapWidth());
		feeder.accept(grammarAccess.getGapAttributeAccess().getGapHeightINTTerminalRuleCall_5_0(), semanticObject.getGapHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((window+=Window+ components+=Component+) | components+=Component+)?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns PasswordField
	 *     PasswordField returns PasswordField
	 *
	 * Constraint:
	 *     (name=ID text=TextAttribute)
	 */
	protected void sequence_PasswordField(ISerializationContext context, PasswordField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.COMPONENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.PASSWORD_FIELD__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.PASSWORD_FIELD__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPasswordFieldAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPasswordFieldAccess().getTextTextAttributeParserRuleCall_6_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PositionAttribute returns PositionAttribute
	 *
	 * Constraint:
	 *     positionEnum=PositionEnum
	 */
	protected void sequence_PositionAttribute(ISerializationContext context, PositionAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.POSITION_ATTRIBUTE__POSITION_ENUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.POSITION_ATTRIBUTE__POSITION_ENUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPositionAttributeAccess().getPositionEnumPositionEnumParserRuleCall_3_0(), semanticObject.getPositionEnum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SingleChoiceAttributes returns SingleChoiceAttributes
	 *
	 * Constraint:
	 *     (text=TextAttribute components+=SingleChoiceOptions+)
	 */
	protected void sequence_SingleChoiceAttributes(ISerializationContext context, SingleChoiceAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleChoiceOptions returns SingleChoiceOptions
	 *
	 * Constraint:
	 *     (name=ID text=TextAttribute)
	 */
	protected void sequence_SingleChoiceOptions(ISerializationContext context, SingleChoiceOptions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.SINGLE_CHOICE_OPTIONS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.SINGLE_CHOICE_OPTIONS__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.SINGLE_CHOICE_OPTIONS__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.SINGLE_CHOICE_OPTIONS__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleChoiceOptionsAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSingleChoiceOptionsAccess().getTextTextAttributeParserRuleCall_3_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns SingleChoice
	 *     SingleChoice returns SingleChoice
	 *
	 * Constraint:
	 *     (name=ID attributes=SingleChoiceAttributes)
	 */
	protected void sequence_SingleChoice(ISerializationContext context, SingleChoice semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.COMPONENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.SINGLE_CHOICE__ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.SINGLE_CHOICE__ATTRIBUTES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSingleChoiceAccess().getAttributesSingleChoiceAttributesParserRuleCall_6_0(), semanticObject.getAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SizeAttribute returns SizeAttribute
	 *
	 * Constraint:
	 *     (height=INT width=INT)
	 */
	protected void sequence_SizeAttribute(ISerializationContext context, SizeAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.SIZE_ATTRIBUTE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.SIZE_ATTRIBUTE__HEIGHT));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.SIZE_ATTRIBUTE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.SIZE_ATTRIBUTE__WIDTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeAttributeAccess().getHeightINTTerminalRuleCall_3_0(), semanticObject.getHeight());
		feeder.accept(grammarAccess.getSizeAttributeAccess().getWidthINTTerminalRuleCall_5_0(), semanticObject.getWidth());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TextAttribute returns TextAttribute
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_TextAttribute(ISerializationContext context, TextAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.TEXT_ATTRIBUTE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.TEXT_ATTRIBUTE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextAttributeAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns TextField
	 *     TextField returns TextField
	 *
	 * Constraint:
	 *     (name=ID text=TextAttribute)
	 */
	protected void sequence_TextField(ISerializationContext context, TextField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.COMPONENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.TEXT_FIELD__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.TEXT_FIELD__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextFieldAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextFieldAccess().getTextTextAttributeParserRuleCall_6_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns TextLabel
	 *     TextLabel returns TextLabel
	 *
	 * Constraint:
	 *     (name=ID text=TextAttribute)
	 */
	protected void sequence_TextLabel(ISerializationContext context, TextLabel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.COMPONENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.TEXT_LABEL__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.TEXT_LABEL__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextLabelAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextLabelAccess().getTextTextAttributeParserRuleCall_6_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WindowAttributes returns WindowAttributes
	 *
	 * Constraint:
	 *     (layout=LayoutAttribute? text=TextAttribute? size=SizeAttribute)
	 */
	protected void sequence_WindowAttributes(ISerializationContext context, WindowAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Window returns Window
	 *
	 * Constraint:
	 *     (name=ID attributes=WindowAttributes container=Container)
	 */
	protected void sequence_Window(ISerializationContext context, Window semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.WINDOW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.WINDOW__NAME));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.WINDOW__ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.WINDOW__ATTRIBUTES));
			if (transientValues.isValueTransient(semanticObject, DawnPackage.Literals.WINDOW__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DawnPackage.Literals.WINDOW__CONTAINER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWindowAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWindowAccess().getAttributesWindowAttributesParserRuleCall_7_0(), semanticObject.getAttributes());
		feeder.accept(grammarAccess.getWindowAccess().getContainerContainerParserRuleCall_10_0(), semanticObject.getContainer());
		feeder.finish();
	}
	
	
}
