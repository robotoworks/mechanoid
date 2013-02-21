/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter Table Add Column Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableAddColumnStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableAddColumnStatementImpl#getColumnDef <em>Column Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlterTableAddColumnStatementImpl extends DDLStatementImpl implements AlterTableAddColumnStatement
{
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
   * The cached value of the '{@link #getColumnDef() <em>Column Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnDef()
   * @generated
   * @ordered
   */
  protected ColumnSource columnDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlterTableAddColumnStatementImpl()
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
    return SqliteModelPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE, oldTable, table));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSource getColumnDef()
  {
    return columnDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnDef(ColumnSource newColumnDef, NotificationChain msgs)
  {
    ColumnSource oldColumnDef = columnDef;
    columnDef = newColumnDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF, oldColumnDef, newColumnDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnDef(ColumnSource newColumnDef)
  {
    if (newColumnDef != columnDef)
    {
      NotificationChain msgs = null;
      if (columnDef != null)
        msgs = ((InternalEObject)columnDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF, null, msgs);
      if (newColumnDef != null)
        msgs = ((InternalEObject)newColumnDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF, null, msgs);
      msgs = basicSetColumnDef(newColumnDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF, newColumnDef, newColumnDef));
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
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF:
        return basicSetColumnDef(null, msgs);
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
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF:
        return getColumnDef();
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
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE:
        setTable((TableDefinition)newValue);
        return;
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF:
        setColumnDef((ColumnSource)newValue);
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
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE:
        setTable((TableDefinition)null);
        return;
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF:
        setColumnDef((ColumnSource)null);
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
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE:
        return table != null;
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF:
        return columnDef != null;
    }
    return super.eIsSet(featureID);
  }

} //AlterTableAddColumnStatementImpl
