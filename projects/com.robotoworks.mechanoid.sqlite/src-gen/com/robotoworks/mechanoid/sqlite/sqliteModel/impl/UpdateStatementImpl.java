/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UpdateStatementImpl#getConflictResolution <em>Conflict Resolution</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UpdateStatementImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UpdateStatementImpl#getUpdateColumnExpressions <em>Update Column Expressions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UpdateStatementImpl#getWhereExpression <em>Where Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateStatementImpl extends DMLStatementImpl implements UpdateStatement
{
  /**
   * The default value of the '{@link #getConflictResolution() <em>Conflict Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictResolution()
   * @generated
   * @ordered
   */
  protected static final ConflictResolution CONFLICT_RESOLUTION_EDEFAULT = ConflictResolution.ROLLBACK;

  /**
   * The cached value of the '{@link #getConflictResolution() <em>Conflict Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictResolution()
   * @generated
   * @ordered
   */
  protected ConflictResolution conflictResolution = CONFLICT_RESOLUTION_EDEFAULT;

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
   * The cached value of the '{@link #getUpdateColumnExpressions() <em>Update Column Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateColumnExpressions()
   * @generated
   * @ordered
   */
  protected EList<UpdateColumnExpression> updateColumnExpressions;

  /**
   * The cached value of the '{@link #getWhereExpression() <em>Where Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereExpression()
   * @generated
   * @ordered
   */
  protected SqlExpression whereExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateStatementImpl()
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
    return SqliteModelPackage.Literals.UPDATE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolution getConflictResolution()
  {
    return conflictResolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConflictResolution(ConflictResolution newConflictResolution)
  {
    ConflictResolution oldConflictResolution = conflictResolution;
    conflictResolution = newConflictResolution == null ? CONFLICT_RESOLUTION_EDEFAULT : newConflictResolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_STATEMENT__CONFLICT_RESOLUTION, oldConflictResolution, conflictResolution));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_STATEMENT__TABLE_NAME, oldTableName, tableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UpdateColumnExpression> getUpdateColumnExpressions()
  {
    if (updateColumnExpressions == null)
    {
      updateColumnExpressions = new EObjectContainmentEList<UpdateColumnExpression>(UpdateColumnExpression.class, this, SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS);
    }
    return updateColumnExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlExpression getWhereExpression()
  {
    return whereExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereExpression(SqlExpression newWhereExpression, NotificationChain msgs)
  {
    SqlExpression oldWhereExpression = whereExpression;
    whereExpression = newWhereExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION, oldWhereExpression, newWhereExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhereExpression(SqlExpression newWhereExpression)
  {
    if (newWhereExpression != whereExpression)
    {
      NotificationChain msgs = null;
      if (whereExpression != null)
        msgs = ((InternalEObject)whereExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION, null, msgs);
      if (newWhereExpression != null)
        msgs = ((InternalEObject)newWhereExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION, null, msgs);
      msgs = basicSetWhereExpression(newWhereExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION, newWhereExpression, newWhereExpression));
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
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        return ((InternalEList<?>)getUpdateColumnExpressions()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        return basicSetWhereExpression(null, msgs);
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
      case SqliteModelPackage.UPDATE_STATEMENT__CONFLICT_RESOLUTION:
        return getConflictResolution();
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE_NAME:
        return getTableName();
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        return getUpdateColumnExpressions();
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        return getWhereExpression();
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
      case SqliteModelPackage.UPDATE_STATEMENT__CONFLICT_RESOLUTION:
        setConflictResolution((ConflictResolution)newValue);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE_NAME:
        setTableName((String)newValue);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        getUpdateColumnExpressions().clear();
        getUpdateColumnExpressions().addAll((Collection<? extends UpdateColumnExpression>)newValue);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        setWhereExpression((SqlExpression)newValue);
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
      case SqliteModelPackage.UPDATE_STATEMENT__CONFLICT_RESOLUTION:
        setConflictResolution(CONFLICT_RESOLUTION_EDEFAULT);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE_NAME:
        setTableName(TABLE_NAME_EDEFAULT);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        getUpdateColumnExpressions().clear();
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        setWhereExpression((SqlExpression)null);
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
      case SqliteModelPackage.UPDATE_STATEMENT__CONFLICT_RESOLUTION:
        return conflictResolution != CONFLICT_RESOLUTION_EDEFAULT;
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE_NAME:
        return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        return updateColumnExpressions != null && !updateColumnExpressions.isEmpty();
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        return whereExpression != null;
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
    result.append(" (conflictResolution: ");
    result.append(conflictResolution);
    result.append(", tableName: ");
    result.append(tableName);
    result.append(')');
    return result.toString();
  }

} //UpdateStatementImpl
