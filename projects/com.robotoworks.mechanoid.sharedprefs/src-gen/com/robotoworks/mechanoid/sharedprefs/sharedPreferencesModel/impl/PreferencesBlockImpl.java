/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl;

import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preferences Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferencesBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferencesBlockImpl#getPrefs <em>Prefs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferencesBlockImpl extends MinimalEObjectImpl.Container implements PreferencesBlock
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrefs() <em>Prefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefs()
   * @generated
   * @ordered
   */
  protected EList<Preference> prefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferencesBlockImpl()
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
    return SharedPreferencesModelPackage.Literals.PREFERENCES_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SharedPreferencesModelPackage.PREFERENCES_BLOCK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Preference> getPrefs()
  {
    if (prefs == null)
    {
      prefs = new EObjectContainmentEList<Preference>(Preference.class, this, SharedPreferencesModelPackage.PREFERENCES_BLOCK__PREFS);
    }
    return prefs;
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
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__PREFS:
        return ((InternalEList<?>)getPrefs()).basicRemove(otherEnd, msgs);
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
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__NAME:
        return getName();
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__PREFS:
        return getPrefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__NAME:
        setName((String)newValue);
        return;
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__PREFS:
        getPrefs().clear();
        getPrefs().addAll((Collection<? extends Preference>)newValue);
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
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__PREFS:
        getPrefs().clear();
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
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK__PREFS:
        return prefs != null && !prefs.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PreferencesBlockImpl
