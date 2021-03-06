/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.dawn.dawn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DawnFactoryImpl extends EFactoryImpl implements DawnFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DawnFactory init()
  {
    try
    {
      DawnFactory theDawnFactory = (DawnFactory)EPackage.Registry.INSTANCE.getEFactory(DawnPackage.eNS_URI);
      if (theDawnFactory != null)
      {
        return theDawnFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DawnFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DawnFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DawnPackage.MODEL: return createModel();
      case DawnPackage.WINDOW: return createWindow();
      case DawnPackage.COMPONENT: return createComponent();
      case DawnPackage.WINDOW_ATTRIBUTES: return createWindowAttributes();
      case DawnPackage.GAP_ATTRIBUTE: return createGapAttribute();
      case DawnPackage.TEXT_ATTRIBUTE: return createTextAttribute();
      case DawnPackage.SIZE_ATTRIBUTE: return createSizeAttribute();
      case DawnPackage.CONTAINER: return createContainer();
      case DawnPackage.ELEMENT: return createElement();
      case DawnPackage.POSITION_ATTRIBUTE: return createPositionAttribute();
      case DawnPackage.BUTTON: return createButton();
      case DawnPackage.BUTTON_ATTRIBUTES: return createButtonAttributes();
      case DawnPackage.CALL: return createCall();
      case DawnPackage.TEXT_FIELD: return createTextField();
      case DawnPackage.TEXT_LABEL: return createTextLabel();
      case DawnPackage.PASSWORD_FIELD: return createPasswordField();
      case DawnPackage.SINGLE_CHOICE: return createSingleChoice();
      case DawnPackage.SINGLE_CHOICE_ATTRIBUTES: return createSingleChoiceAttributes();
      case DawnPackage.SINGLE_CHOICE_OPTIONS: return createSingleChoiceOptions();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Window createWindow()
  {
    WindowImpl window = new WindowImpl();
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WindowAttributes createWindowAttributes()
  {
    WindowAttributesImpl windowAttributes = new WindowAttributesImpl();
    return windowAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GapAttribute createGapAttribute()
  {
    GapAttributeImpl gapAttribute = new GapAttributeImpl();
    return gapAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextAttribute createTextAttribute()
  {
    TextAttributeImpl textAttribute = new TextAttributeImpl();
    return textAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeAttribute createSizeAttribute()
  {
    SizeAttributeImpl sizeAttribute = new SizeAttributeImpl();
    return sizeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.dawn.dawn.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionAttribute createPositionAttribute()
  {
    PositionAttributeImpl positionAttribute = new PositionAttributeImpl();
    return positionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonAttributes createButtonAttributes()
  {
    ButtonAttributesImpl buttonAttributes = new ButtonAttributesImpl();
    return buttonAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextField createTextField()
  {
    TextFieldImpl textField = new TextFieldImpl();
    return textField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextLabel createTextLabel()
  {
    TextLabelImpl textLabel = new TextLabelImpl();
    return textLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PasswordField createPasswordField()
  {
    PasswordFieldImpl passwordField = new PasswordFieldImpl();
    return passwordField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleChoice createSingleChoice()
  {
    SingleChoiceImpl singleChoice = new SingleChoiceImpl();
    return singleChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleChoiceAttributes createSingleChoiceAttributes()
  {
    SingleChoiceAttributesImpl singleChoiceAttributes = new SingleChoiceAttributesImpl();
    return singleChoiceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleChoiceOptions createSingleChoiceOptions()
  {
    SingleChoiceOptionsImpl singleChoiceOptions = new SingleChoiceOptionsImpl();
    return singleChoiceOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DawnPackage getDawnPackage()
  {
    return (DawnPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DawnPackage getPackage()
  {
    return DawnPackage.eINSTANCE;
  }

} //DawnFactoryImpl
