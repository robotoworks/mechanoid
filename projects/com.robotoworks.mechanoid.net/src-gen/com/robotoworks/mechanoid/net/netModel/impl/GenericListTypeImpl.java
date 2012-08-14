/**
 */
package com.robotoworks.mechanoid.net.netModel.impl;

import com.robotoworks.mechanoid.net.netModel.GenericListType;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.GenericListTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.GenericListTypeImpl#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericListTypeImpl extends TypeImpl implements GenericListType
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected Type genericType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericListTypeImpl()
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
    return NetModelPackage.Literals.GENERIC_LIST_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.GENERIC_LIST_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getGenericType()
  {
    return genericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericType(Type newGenericType, NotificationChain msgs)
  {
    Type oldGenericType = genericType;
    genericType = newGenericType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE, oldGenericType, newGenericType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericType(Type newGenericType)
  {
    if (newGenericType != genericType)
    {
      NotificationChain msgs = null;
      if (genericType != null)
        msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE, null, msgs);
      if (newGenericType != null)
        msgs = ((InternalEObject)newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE, null, msgs);
      msgs = basicSetGenericType(newGenericType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE, newGenericType, newGenericType));
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
      case NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE:
        return basicSetGenericType(null, msgs);
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
      case NetModelPackage.GENERIC_LIST_TYPE__ID:
        return getId();
      case NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE:
        return getGenericType();
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
      case NetModelPackage.GENERIC_LIST_TYPE__ID:
        setId((String)newValue);
        return;
      case NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE:
        setGenericType((Type)newValue);
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
      case NetModelPackage.GENERIC_LIST_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE:
        setGenericType((Type)null);
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
      case NetModelPackage.GENERIC_LIST_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case NetModelPackage.GENERIC_LIST_TYPE__GENERIC_TYPE:
        return genericType != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //GenericListTypeImpl
