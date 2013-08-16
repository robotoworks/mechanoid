/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.TableConstraint;

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
 * An implementation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl#isTemporary <em>Temporary</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl#getColumnDefs <em>Column Defs</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateTableStatementImpl extends TableDefinitionImpl implements CreateTableStatement
{
  /**
   * The default value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTemporary()
   * @generated
   * @ordered
   */
  protected static final boolean TEMPORARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTemporary()
   * @generated
   * @ordered
   */
  protected boolean temporary = TEMPORARY_EDEFAULT;

  /**
   * The cached value of the '{@link #getColumnDefs() <em>Column Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnDefs()
   * @generated
   * @ordered
   */
  protected EList<ColumnSource> columnDefs;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<TableConstraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateTableStatementImpl()
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
    return SqliteModelPackage.Literals.CREATE_TABLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTemporary()
  {
    return temporary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemporary(boolean newTemporary)
  {
    boolean oldTemporary = temporary;
    temporary = newTemporary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TABLE_STATEMENT__TEMPORARY, oldTemporary, temporary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColumnSource> getColumnDefs()
  {
    if (columnDefs == null)
    {
      columnDefs = new EObjectContainmentEList<ColumnSource>(ColumnSource.class, this, SqliteModelPackage.CREATE_TABLE_STATEMENT__COLUMN_DEFS);
    }
    return columnDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableConstraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<TableConstraint>(TableConstraint.class, this, SqliteModelPackage.CREATE_TABLE_STATEMENT__CONSTRAINTS);
    }
    return constraints;
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
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__COLUMN_DEFS:
        return ((InternalEList<?>)getColumnDefs()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__TEMPORARY:
        return isTemporary();
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__COLUMN_DEFS:
        return getColumnDefs();
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__CONSTRAINTS:
        return getConstraints();
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
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__TEMPORARY:
        setTemporary((Boolean)newValue);
        return;
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__COLUMN_DEFS:
        getColumnDefs().clear();
        getColumnDefs().addAll((Collection<? extends ColumnSource>)newValue);
        return;
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends TableConstraint>)newValue);
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
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__TEMPORARY:
        setTemporary(TEMPORARY_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__COLUMN_DEFS:
        getColumnDefs().clear();
        return;
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__CONSTRAINTS:
        getConstraints().clear();
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
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__TEMPORARY:
        return temporary != TEMPORARY_EDEFAULT;
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__COLUMN_DEFS:
        return columnDefs != null && !columnDefs.isEmpty();
      case SqliteModelPackage.CREATE_TABLE_STATEMENT__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
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
    result.append(" (temporary: ");
    result.append(temporary);
    result.append(')');
    return result.toString();
  }

} //CreateTableStatementImpl
