/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl;

import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.ModelImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.ModelImpl#getPreferencesBlock <em>Preferences Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreferencesBlock() <em>Preferences Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferencesBlock()
   * @generated
   * @ordered
   */
  protected PreferencesBlock preferencesBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return SharedPreferencesModelPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SharedPreferencesModelPackage.MODEL__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferencesBlock getPreferencesBlock()
  {
    return preferencesBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreferencesBlock(PreferencesBlock newPreferencesBlock, NotificationChain msgs)
  {
    PreferencesBlock oldPreferencesBlock = preferencesBlock;
    preferencesBlock = newPreferencesBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK, oldPreferencesBlock, newPreferencesBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreferencesBlock(PreferencesBlock newPreferencesBlock)
  {
    if (newPreferencesBlock != preferencesBlock)
    {
      NotificationChain msgs = null;
      if (preferencesBlock != null)
        msgs = ((InternalEObject)preferencesBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK, null, msgs);
      if (newPreferencesBlock != null)
        msgs = ((InternalEObject)newPreferencesBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK, null, msgs);
      msgs = basicSetPreferencesBlock(newPreferencesBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK, newPreferencesBlock, newPreferencesBlock));
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
      case SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK:
        return basicSetPreferencesBlock(null, msgs);
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
      case SharedPreferencesModelPackage.MODEL__PACKAGE_NAME:
        return getPackageName();
      case SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK:
        return getPreferencesBlock();
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
      case SharedPreferencesModelPackage.MODEL__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK:
        setPreferencesBlock((PreferencesBlock)newValue);
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
      case SharedPreferencesModelPackage.MODEL__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK:
        setPreferencesBlock((PreferencesBlock)null);
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
      case SharedPreferencesModelPackage.MODEL__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case SharedPreferencesModelPackage.MODEL__PREFERENCES_BLOCK:
        return preferencesBlock != null;
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
    result.append(" (packageName: ");
    result.append(packageName);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
