/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Column All With Table Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllWithTableRefImpl#getTableRef <em>Table Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultColumnAllWithTableRefImpl extends ResultColumnImpl implements ResultColumnAllWithTableRef
{
  /**
   * The default value of the '{@link #getTableRef() <em>Table Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableRef()
   * @generated
   * @ordered
   */
  protected static final String TABLE_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTableRef() <em>Table Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableRef()
   * @generated
   * @ordered
   */
  protected String tableRef = TABLE_REF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResultColumnAllWithTableRefImpl()
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
    return SqliteModelPackage.Literals.RESULT_COLUMN_ALL_WITH_TABLE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTableRef()
  {
    return tableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableRef(String newTableRef)
  {
    String oldTableRef = tableRef;
    tableRef = newTableRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF, oldTableRef, tableRef));
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
      case SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF:
        return getTableRef();
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
      case SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF:
        setTableRef((String)newValue);
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
      case SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF:
        setTableRef(TABLE_REF_EDEFAULT);
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
      case SqliteModelPackage.RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF:
        return TABLE_REF_EDEFAULT == null ? tableRef != null : !TABLE_REF_EDEFAULT.equals(tableRef);
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
    result.append(" (tableRef: ");
    result.append(tableRef);
    result.append(')');
    return result.toString();
  }

} //ResultColumnAllWithTableRefImpl
