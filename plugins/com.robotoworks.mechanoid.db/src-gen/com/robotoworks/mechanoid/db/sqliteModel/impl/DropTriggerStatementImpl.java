/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Trigger Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropTriggerStatementImpl#isIfExists <em>If Exists</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropTriggerStatementImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropTriggerStatementImpl extends DDLStatementImpl implements DropTriggerStatement
{
  /**
   * The default value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIfExists()
   * @generated
   * @ordered
   */
  protected static final boolean IF_EXISTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIfExists()
   * @generated
   * @ordered
   */
  protected boolean ifExists = IF_EXISTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected CreateTriggerStatement trigger;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DropTriggerStatementImpl()
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
    return SqliteModelPackage.Literals.DROP_TRIGGER_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIfExists()
  {
    return ifExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfExists(boolean newIfExists)
  {
    boolean oldIfExists = ifExists;
    ifExists = newIfExists;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DROP_TRIGGER_STATEMENT__IF_EXISTS, oldIfExists, ifExists));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTriggerStatement getTrigger()
  {
    if (trigger != null && trigger.eIsProxy())
    {
      InternalEObject oldTrigger = (InternalEObject)trigger;
      trigger = (CreateTriggerStatement)eResolveProxy(oldTrigger);
      if (trigger != oldTrigger)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.DROP_TRIGGER_STATEMENT__TRIGGER, oldTrigger, trigger));
      }
    }
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTriggerStatement basicGetTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(CreateTriggerStatement newTrigger)
  {
    CreateTriggerStatement oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DROP_TRIGGER_STATEMENT__TRIGGER, oldTrigger, trigger));
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
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__IF_EXISTS:
        return isIfExists();
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__TRIGGER:
        if (resolve) return getTrigger();
        return basicGetTrigger();
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
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__IF_EXISTS:
        setIfExists((Boolean)newValue);
        return;
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__TRIGGER:
        setTrigger((CreateTriggerStatement)newValue);
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
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__IF_EXISTS:
        setIfExists(IF_EXISTS_EDEFAULT);
        return;
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__TRIGGER:
        setTrigger((CreateTriggerStatement)null);
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
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__IF_EXISTS:
        return ifExists != IF_EXISTS_EDEFAULT;
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT__TRIGGER:
        return trigger != null;
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
    result.append(" (ifExists: ");
    result.append(ifExists);
    result.append(')');
    return result.toString();
  }

} //DropTriggerStatementImpl
