/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateViewStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateViewStatementImpl#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateViewStatementImpl extends DDLStatementImpl implements CreateViewStatement
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
   * The cached value of the '{@link #getSelectStatement() <em>Select Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectStatement()
   * @generated
   * @ordered
   */
  protected SelectStatement selectStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateViewStatementImpl()
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
    return SqliteModelPackage.Literals.CREATE_VIEW_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_VIEW_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement getSelectStatement()
  {
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectStatement(SelectStatement newSelectStatement, NotificationChain msgs)
  {
    SelectStatement oldSelectStatement = selectStatement;
    selectStatement = newSelectStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT, oldSelectStatement, newSelectStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectStatement(SelectStatement newSelectStatement)
  {
    if (newSelectStatement != selectStatement)
    {
      NotificationChain msgs = null;
      if (selectStatement != null)
        msgs = ((InternalEObject)selectStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT, null, msgs);
      if (newSelectStatement != null)
        msgs = ((InternalEObject)newSelectStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT, null, msgs);
      msgs = basicSetSelectStatement(newSelectStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT, newSelectStatement, newSelectStatement));
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
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT:
        return basicSetSelectStatement(null, msgs);
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
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__NAME:
        return getName();
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT:
        return getSelectStatement();
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
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT:
        setSelectStatement((SelectStatement)newValue);
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
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT:
        setSelectStatement((SelectStatement)null);
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
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SqliteModelPackage.CREATE_VIEW_STATEMENT__SELECT_STATEMENT:
        return selectStatement != null;
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

} //CreateViewStatementImpl
