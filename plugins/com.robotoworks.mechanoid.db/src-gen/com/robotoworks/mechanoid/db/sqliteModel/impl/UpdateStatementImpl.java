/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement;

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
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl#getConflictResolution <em>Conflict Resolution</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl#getUpdateColumnExpressions <em>Update Column Expressions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl#getWhereExpression <em>Where Expression</em>}</li>
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
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected TableDefinition table;

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
  protected Expression whereExpression;

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
  public TableDefinition getTable()
  {
    if (table != null && table.eIsProxy())
    {
      InternalEObject oldTable = (InternalEObject)table;
      table = (TableDefinition)eResolveProxy(oldTable);
      if (table != oldTable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.UPDATE_STATEMENT__TABLE, oldTable, table));
      }
    }
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition basicGetTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(TableDefinition newTable)
  {
    TableDefinition oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_STATEMENT__TABLE, oldTable, table));
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
  public Expression getWhereExpression()
  {
    return whereExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereExpression(Expression newWhereExpression, NotificationChain msgs)
  {
    Expression oldWhereExpression = whereExpression;
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
  public void setWhereExpression(Expression newWhereExpression)
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
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
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
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE:
        setTable((TableDefinition)newValue);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        getUpdateColumnExpressions().clear();
        getUpdateColumnExpressions().addAll((Collection<? extends UpdateColumnExpression>)newValue);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        setWhereExpression((Expression)newValue);
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
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE:
        setTable((TableDefinition)null);
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS:
        getUpdateColumnExpressions().clear();
        return;
      case SqliteModelPackage.UPDATE_STATEMENT__WHERE_EXPRESSION:
        setWhereExpression((Expression)null);
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
      case SqliteModelPackage.UPDATE_STATEMENT__TABLE:
        return table != null;
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
    result.append(')');
    return result.toString();
  }

} //UpdateStatementImpl
