/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Index Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateIndexStatementImpl extends DDLStatementImpl implements CreateIndexStatement
{
  /**
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected boolean unique = UNIQUE_EDEFAULT;

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
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected TableDefinition table;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<IndexedColumn> columns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateIndexStatementImpl()
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
    return SqliteModelPackage.Literals.CREATE_INDEX_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnique()
  {
    return unique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(boolean newUnique)
  {
    boolean oldUnique = unique;
    unique = newUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_INDEX_STATEMENT__UNIQUE, oldUnique, unique));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_INDEX_STATEMENT__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.CREATE_INDEX_STATEMENT__TABLE, oldTable, table));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_INDEX_STATEMENT__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IndexedColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<IndexedColumn>(IndexedColumn.class, this, SqliteModelPackage.CREATE_INDEX_STATEMENT__COLUMNS);
    }
    return columns;
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
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__UNIQUE:
        return isUnique();
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__NAME:
        return getName();
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__COLUMNS:
        return getColumns();
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
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__UNIQUE:
        setUnique((Boolean)newValue);
        return;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__TABLE:
        setTable((TableDefinition)newValue);
        return;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends IndexedColumn>)newValue);
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
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__UNIQUE:
        setUnique(UNIQUE_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__TABLE:
        setTable((TableDefinition)null);
        return;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__COLUMNS:
        getColumns().clear();
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
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__UNIQUE:
        return unique != UNIQUE_EDEFAULT;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__TABLE:
        return table != null;
      case SqliteModelPackage.CREATE_INDEX_STATEMENT__COLUMNS:
        return columns != null && !columns.isEmpty();
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
    result.append(" (unique: ");
    result.append(unique);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CreateIndexStatementImpl
