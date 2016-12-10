/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Choice Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dawn.dawn.SingleChoiceAttributes#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.SingleChoiceAttributes#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dawn.dawn.DawnPackage#getSingleChoiceAttributes()
 * @model
 * @generated
 */
public interface SingleChoiceAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(TextAttribute)
   * @see org.xtext.example.dawn.dawn.DawnPackage#getSingleChoiceAttributes_Text()
   * @model containment="true"
   * @generated
   */
  TextAttribute getText();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.SingleChoiceAttributes#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(TextAttribute value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.dawn.dawn.SingleChoiceOptions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.example.dawn.dawn.DawnPackage#getSingleChoiceAttributes_Components()
   * @model containment="true"
   * @generated
   */
  EList<SingleChoiceOptions> getComponents();

} // SingleChoiceAttributes
