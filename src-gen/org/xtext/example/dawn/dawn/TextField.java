/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dawn.dawn.TextField#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dawn.dawn.DawnPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends Component
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
   * @see org.xtext.example.dawn.dawn.DawnPackage#getTextField_Text()
   * @model containment="true"
   * @generated
   */
  TextAttribute getText();

  /**
   * Sets the value of the '{@link org.xtext.example.dawn.dawn.TextField#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(TextAttribute value);

} // TextField