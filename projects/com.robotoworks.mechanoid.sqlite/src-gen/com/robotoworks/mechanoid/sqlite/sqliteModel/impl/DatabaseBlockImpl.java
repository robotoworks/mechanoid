/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

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
 * An implementation of the model object '<em><b>Database Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl#getMigrations <em>Migrations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseBlockImpl extends MinimalEObjectImpl.Container implements DatabaseBlock
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
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected ActionBlock actions;

  /**
   * The cached value of the '{@link #getMigrations() <em>Migrations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigrations()
   * @generated
   * @ordered
   */
  protected EList<MigrationBlock> migrations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseBlockImpl()
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
    return SqliteModelPackage.Literals.DATABASE_BLOCK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DATABASE_BLOCK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionBlock getActions()
  {
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActions(ActionBlock newActions, NotificationChain msgs)
  {
    ActionBlock oldActions = actions;
    actions = newActions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DATABASE_BLOCK__ACTIONS, oldActions, newActions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActions(ActionBlock newActions)
  {
    if (newActions != actions)
    {
      NotificationChain msgs = null;
      if (actions != null)
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.DATABASE_BLOCK__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.DATABASE_BLOCK__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DATABASE_BLOCK__ACTIONS, newActions, newActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MigrationBlock> getMigrations()
  {
    if (migrations == null)
    {
      migrations = new EObjectContainmentEList<MigrationBlock>(MigrationBlock.class, this, SqliteModelPackage.DATABASE_BLOCK__MIGRATIONS);
    }
    return migrations;
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
      case SqliteModelPackage.DATABASE_BLOCK__ACTIONS:
        return basicSetActions(null, msgs);
      case SqliteModelPackage.DATABASE_BLOCK__MIGRATIONS:
        return ((InternalEList<?>)getMigrations()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.DATABASE_BLOCK__NAME:
        return getName();
      case SqliteModelPackage.DATABASE_BLOCK__ACTIONS:
        return getActions();
      case SqliteModelPackage.DATABASE_BLOCK__MIGRATIONS:
        return getMigrations();
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
      case SqliteModelPackage.DATABASE_BLOCK__NAME:
        setName((String)newValue);
        return;
      case SqliteModelPackage.DATABASE_BLOCK__ACTIONS:
        setActions((ActionBlock)newValue);
        return;
      case SqliteModelPackage.DATABASE_BLOCK__MIGRATIONS:
        getMigrations().clear();
        getMigrations().addAll((Collection<? extends MigrationBlock>)newValue);
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
      case SqliteModelPackage.DATABASE_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SqliteModelPackage.DATABASE_BLOCK__ACTIONS:
        setActions((ActionBlock)null);
        return;
      case SqliteModelPackage.DATABASE_BLOCK__MIGRATIONS:
        getMigrations().clear();
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
      case SqliteModelPackage.DATABASE_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SqliteModelPackage.DATABASE_BLOCK__ACTIONS:
        return actions != null;
      case SqliteModelPackage.DATABASE_BLOCK__MIGRATIONS:
        return migrations != null && !migrations.isEmpty();
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

} //DatabaseBlockImpl
