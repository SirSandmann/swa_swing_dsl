/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dawn.dawn.SizeAttribute#getHeight <em>Height</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.SizeAttribute#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dawn.dawn.DawnPackage#getSizeAttribute()
 * @model
 * @generated
 */
public interface SizeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see org.xtext.example.dawn.dawn.DawnPackage#getSizeAttribute_Height()
   * @model
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.SizeAttribute#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see org.xtext.example.dawn.dawn.DawnPackage#getSizeAttribute_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.SizeAttribute#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

} // SizeAttribute
