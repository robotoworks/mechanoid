/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Source Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceJoinImpl#getJoinSource <em>Join Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleSourceJoinImpl extends SingleSourceImpl implements SingleSourceJoin
{
  /**
   * The cached value of the '{@link #getJoinSource() <em>Join Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinSource()
   * @generated
   * @ordered
   */
  protected JoinSource joinSource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleSourceJoinImpl()
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
    return SqliteModelPackage.Literals.SINGLE_SOURCE_JOIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource getJoinSource()
  {
    return joinSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoinSource(JoinSource newJoinSource, NotificationChain msgs)
  {
    JoinSource oldJoinSource = joinSource;
    joinSource = newJoinSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE, oldJoinSource, newJoinSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoinSource(JoinSource newJoinSource)
  {
    if (newJoinSource != joinSource)
    {
      NotificationChain msgs = null;
      if (joinSource != null)
        msgs = ((InternalEObject)joinSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE, null, msgs);
      if (newJoinSource != null)
        msgs = ((InternalEObject)newJoinSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE, null, msgs);
      msgs = basicSetJoinSource(newJoinSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE, newJoinSource, newJoinSource));
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
      case SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE:
        return basicSetJoinSource(null, msgs);
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
      case SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE:
        return getJoinSource();
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
      case SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE:
        setJoinSource((JoinSource)newValue);
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
      case SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE:
        setJoinSource((JoinSource)null);
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
      case SqliteModelPackage.SINGLE_SOURCE_JOIN__JOIN_SOURCE:
        return joinSource != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleSourceJoinImpl
