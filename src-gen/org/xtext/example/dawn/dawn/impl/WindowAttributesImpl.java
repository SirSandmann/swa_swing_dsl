/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.dawn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.dawn.dawn.DawnPackage;
import org.xtext.example.dawn.dawn.SizeAttribute;
import org.xtext.example.dawn.dawn.TextAttribute;
import org.xtext.example.dawn.dawn.WindowAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dawn.dawn.impl.WindowAttributesImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.impl.WindowAttributesImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.dawn.dawn.impl.WindowAttributesImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowAttributesImpl extends MinimalEObjectImpl.Container implements WindowAttributes
{
  /**
   * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected static final String LAYOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected String layout = LAYOUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TextAttribute text;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected SizeAttribute size;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WindowAttributesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DawnPackage.Literals.WINDOW_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(String newLayout)
  {
    String oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DawnPackage.WINDOW_ATTRIBUTES__LAYOUT, oldLayout, layout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextAttribute getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(TextAttribute newText, NotificationChain msgs)
  {
    TextAttribute oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DawnPackage.WINDOW_ATTRIBUTES__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(TextAttribute newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DawnPackage.WINDOW_ATTRIBUTES__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DawnPackage.WINDOW_ATTRIBUTES__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DawnPackage.WINDOW_ATTRIBUTES__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeAttribute getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(SizeAttribute newSize, NotificationChain msgs)
  {
    SizeAttribute oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DawnPackage.WINDOW_ATTRIBUTES__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(SizeAttribute newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DawnPackage.WINDOW_ATTRIBUTES__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DawnPackage.WINDOW_ATTRIBUTES__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DawnPackage.WINDOW_ATTRIBUTES__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DawnPackage.WINDOW_ATTRIBUTES__TEXT:
        return basicSetText(null, msgs);
      case DawnPackage.WINDOW_ATTRIBUTES__SIZE:
        return basicSetSize(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DawnPackage.WINDOW_ATTRIBUTES__LAYOUT:
        return getLayout();
      case DawnPackage.WINDOW_ATTRIBUTES__TEXT:
        return getText();
      case DawnPackage.WINDOW_ATTRIBUTES__SIZE:
        return getSize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DawnPackage.WINDOW_ATTRIBUTES__LAYOUT:
        setLayout((String)newValue);
        return;
      case DawnPackage.WINDOW_ATTRIBUTES__TEXT:
        setText((TextAttribute)newValue);
        return;
      case DawnPackage.WINDOW_ATTRIBUTES__SIZE:
        setSize((SizeAttribute)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DawnPackage.WINDOW_ATTRIBUTES__LAYOUT:
        setLayout(LAYOUT_EDEFAULT);
        return;
      case DawnPackage.WINDOW_ATTRIBUTES__TEXT:
        setText((TextAttribute)null);
        return;
      case DawnPackage.WINDOW_ATTRIBUTES__SIZE:
        setSize((SizeAttribute)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DawnPackage.WINDOW_ATTRIBUTES__LAYOUT:
        return LAYOUT_EDEFAULT == null ? layout != null : !LAYOUT_EDEFAULT.equals(layout);
      case DawnPackage.WINDOW_ATTRIBUTES__TEXT:
        return text != null;
      case DawnPackage.WINDOW_ATTRIBUTES__SIZE:
        return size != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (layout: ");
    result.append(layout);
    result.append(')');
    return result.toString();
  }

} //WindowAttributesImpl
