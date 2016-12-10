/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dawn.dawn.Element#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.Element#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.Element#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dawn.dawn.DawnPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(Component)
   * @see org.xtext.example.dawn.dawn.DawnPackage#getElement_Component()
   * @model containment="true"
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.Element#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(PositionAttribute)
   * @see org.xtext.example.dawn.dawn.DawnPackage#getElement_Position()
   * @model containment="true"
   * @generated
   */
  PositionAttribute getPosition();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.Element#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(PositionAttribute value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(SizeAttribute)
   * @see org.xtext.example.dawn.dawn.DawnPackage#getElement_Size()
   * @model containment="true"
   * @generated
   */
  SizeAttribute getSize();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.Element#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(SizeAttribute value);

} // Element