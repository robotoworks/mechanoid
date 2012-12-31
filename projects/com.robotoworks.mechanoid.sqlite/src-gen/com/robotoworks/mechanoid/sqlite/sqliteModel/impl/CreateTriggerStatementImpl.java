/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DMLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Trigger Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTriggerStatementImpl#getUpdateColumnNames <em>Update Column Names</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTriggerStatementImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTriggerStatementImpl#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTriggerStatementImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateTriggerStatementImpl extends DDLStatementImpl implements CreateTriggerStatement
{
  /**
   * The cached value of the '{@link #getUpdateColumnNames() <em>Update Column Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateColumnNames()
   * @generated
   * @ordered
   */
  protected EList<String> updateColumnNames;

  /**
   * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected static final String TABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected String tableName = TABLE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhenExpression() <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenExpression()
   * @generated
   * @ordered
   */
  protected SqlExpression whenExpression;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<DMLStatement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateTriggerStatementImpl()
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
    return SqliteModelPackage.Literals.CREATE_TRIGGER_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUpdateColumnNames()
  {
    if (updateColumnNames == null)
    {
      updateColumnNames = new EDataTypeEList<String>(String.class, this, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES);
    }
    return updateColumnNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTableName()
  {
    return tableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableName(String newTableName)
  {
    String oldTableName = tableName;
    tableName = newTableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE_NAME, oldTableName, tableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlExpression getWhenExpression()
  {
    return whenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenExpression(SqlExpression newWhenExpression, NotificationChain msgs)
  {
    SqlExpression oldWhenExpression = whenExpression;
    whenExpression = newWhenExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, oldWhenExpression, newWhenExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenExpression(SqlExpression newWhenExpression)
  {
    if (newWhenExpression != whenExpression)
    {
      NotificationChain msgs = null;
      if (whenExpression != null)
        msgs = ((InternalEObject)whenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, null, msgs);
      if (newWhenExpression != null)
        msgs = ((InternalEObject)newWhenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, null, msgs);
      msgs = basicSetWhenExpression(newWhenExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, newWhenExpression, newWhenExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DMLStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<DMLStatement>(DMLStatement.class, this, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS);
    }
    return statements;
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        return basicSetWhenExpression(null, msgs);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        return getUpdateColumnNames();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE_NAME:
        return getTableName();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        return getWhenExpression();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        return getStatements();
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        getUpdateColumnNames().clear();
        getUpdateColumnNames().addAll((Collection<? extends String>)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE_NAME:
        setTableName((String)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        setWhenExpression((SqlExpression)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends DMLStatement>)newValue);
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        getUpdateColumnNames().clear();
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE_NAME:
        setTableName(TABLE_NAME_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        setWhenExpression((SqlExpression)null);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        getStatements().clear();
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        return updateColumnNames != null && !updateColumnNames.isEmpty();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE_NAME:
        return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        return whenExpression != null;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
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
    result.append(" (updateColumnNames: ");
    result.append(updateColumnNames);
    result.append(", tableName: ");
    result.append(tableName);
    result.append(')');
    return result.toString();
  }

} //CreateTriggerStatementImpl
