/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl#getConflictResolution <em>Conflict Resolution</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertStatementImpl extends DMLStatementImpl implements InsertStatement
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
   * The cached value of the '{@link #getColumnNames() <em>Column Names</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnNames()
   * @generated
   * @ordered
   */
  protected EList<ColumnDef> columnNames;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

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
  protected InsertStatementImpl()
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
    return SqliteModelPackage.Literals.INSERT_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INSERT_STATEMENT__CONFLICT_RESOLUTION, oldConflictResolution, conflictResolution));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.INSERT_STATEMENT__TABLE, oldTable, table));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INSERT_STATEMENT__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColumnDef> getColumnNames()
  {
    if (columnNames == null)
    {
      columnNames = new EObjectResolvingEList<ColumnDef>(ColumnDef.class, this, SqliteModelPackage.INSERT_STATEMENT__COLUMN_NAMES);
    }
    return columnNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, SqliteModelPackage.INSERT_STATEMENT__EXPRESSIONS);
    }
    return expressions;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT, oldSelectStatement, newSelectStatement);
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
        msgs = ((InternalEObject)selectStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT, null, msgs);
      if (newSelectStatement != null)
        msgs = ((InternalEObject)newSelectStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT, null, msgs);
      msgs = basicSetSelectStatement(newSelectStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT, newSelectStatement, newSelectStatement));
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
      case SqliteModelPackage.INSERT_STATEMENT__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT:
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
      case SqliteModelPackage.INSERT_STATEMENT__CONFLICT_RESOLUTION:
        return getConflictResolution();
      case SqliteModelPackage.INSERT_STATEMENT__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case SqliteModelPackage.INSERT_STATEMENT__COLUMN_NAMES:
        return getColumnNames();
      case SqliteModelPackage.INSERT_STATEMENT__EXPRESSIONS:
        return getExpressions();
      case SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT:
        return getSelectStatement();
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
      case SqliteModelPackage.INSERT_STATEMENT__CONFLICT_RESOLUTION:
        setConflictResolution((ConflictResolution)newValue);
        return;
      case SqliteModelPackage.INSERT_STATEMENT__TABLE:
        setTable((TableDefinition)newValue);
        return;
      case SqliteModelPackage.INSERT_STATEMENT__COLUMN_NAMES:
        getColumnNames().clear();
        getColumnNames().addAll((Collection<? extends ColumnDef>)newValue);
        return;
      case SqliteModelPackage.INSERT_STATEMENT__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT:
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
      case SqliteModelPackage.INSERT_STATEMENT__CONFLICT_RESOLUTION:
        setConflictResolution(CONFLICT_RESOLUTION_EDEFAULT);
        return;
      case SqliteModelPackage.INSERT_STATEMENT__TABLE:
        setTable((TableDefinition)null);
        return;
      case SqliteModelPackage.INSERT_STATEMENT__COLUMN_NAMES:
        getColumnNames().clear();
        return;
      case SqliteModelPackage.INSERT_STATEMENT__EXPRESSIONS:
        getExpressions().clear();
        return;
      case SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT:
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
      case SqliteModelPackage.INSERT_STATEMENT__CONFLICT_RESOLUTION:
        return conflictResolution != CONFLICT_RESOLUTION_EDEFAULT;
      case SqliteModelPackage.INSERT_STATEMENT__TABLE:
        return table != null;
      case SqliteModelPackage.INSERT_STATEMENT__COLUMN_NAMES:
        return columnNames != null && !columnNames.isEmpty();
      case SqliteModelPackage.INSERT_STATEMENT__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case SqliteModelPackage.INSERT_STATEMENT__SELECT_STATEMENT:
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
    result.append(" (conflictResolution: ");
    result.append(conflictResolution);
    result.append(')');
    return result.toString();
  }

} //InsertStatementImpl
