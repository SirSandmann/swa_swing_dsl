/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dawn.dawn.Model#getWindow <em>Window</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.Model#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dawn.dawn.DawnPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Window</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.dawn.dawn.Window}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Window</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Window</em>' containment reference list.
   * @see org.xtext.example.dawn.dawn.DawnPackage#getModel_Window()
   * @model containment="true"
   * @generated
   */
  EList<Window> getWindow();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.dawn.dawn.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.example.dawn.dawn.DawnPackage#getModel_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // Model
