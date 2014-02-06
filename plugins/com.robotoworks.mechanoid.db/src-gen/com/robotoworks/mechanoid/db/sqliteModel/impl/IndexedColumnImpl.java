/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indexed Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl#isAsc <em>Asc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl#isDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexedColumnImpl extends MinimalEObjectImpl.Container implements IndexedColumn
{
  /**
   * The cached value of the '{@link #getColumnReference() <em>Column Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnReference()
   * @generated
   * @ordered
   */
  protected ColumnDef columnReference;

  /**
   * The default value of the '{@link #getCollationName() <em>Collation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollationName()
   * @generated
   * @ordered
   */
  protected static final String COLLATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollationName() <em>Collation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollationName()
   * @generated
   * @ordered
   */
  protected String collationName = COLLATION_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isAsc() <em>Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsc()
   * @generated
   * @ordered
   */
  protected static final boolean ASC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAsc() <em>Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsc()
   * @generated
   * @ordered
   */
  protected boolean asc = ASC_EDEFAULT;

  /**
   * The default value of the '{@link #isDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDesc()
   * @generated
   * @ordered
   */
  protected static final boolean DESC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDesc()
   * @generated
   * @ordered
   */
  protected boolean desc = DESC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexedColumnImpl()
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
    return SqliteModelPackage.Literals.INDEXED_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef getColumnReference()
  {
    if (columnReference != null && columnReference.eIsProxy())
    {
      InternalEObject oldColumnReference = (InternalEObject)columnReference;
      columnReference = (ColumnDef)eResolveProxy(oldColumnReference);
      if (columnReference != oldColumnReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.INDEXED_COLUMN__COLUMN_REFERENCE, oldColumnReference, columnReference));
      }
    }
    return columnReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef basicGetColumnReference()
  {
    return columnReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnReference(ColumnDef newColumnReference)
  {
    ColumnDef oldColumnReference = columnReference;
    columnReference = newColumnReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INDEXED_COLUMN__COLUMN_REFERENCE, oldColumnReference, columnReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCollationName()
  {
    return collationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollationName(String newCollationName)
  {
    String oldCollationName = collationName;
    collationName = newCollationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INDEXED_COLUMN__COLLATION_NAME, oldCollationName, collationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAsc()
  {
    return asc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsc(boolean newAsc)
  {
    boolean oldAsc = asc;
    asc = newAsc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INDEXED_COLUMN__ASC, oldAsc, asc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(boolean newDesc)
  {
    boolean oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.INDEXED_COLUMN__DESC, oldDesc, desc));
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
      case SqliteModelPackage.INDEXED_COLUMN__COLUMN_REFERENCE:
        if (resolve) return getColumnReference();
        return basicGetColumnReference();
      case SqliteModelPackage.INDEXED_COLUMN__COLLATION_NAME:
        return getCollationName();
      case SqliteModelPackage.INDEXED_COLUMN__ASC:
        return isAsc();
      case SqliteModelPackage.INDEXED_COLUMN__DESC:
        return isDesc();
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
      case SqliteModelPackage.INDEXED_COLUMN__COLUMN_REFERENCE:
        setColumnReference((ColumnDef)newValue);
        return;
      case SqliteModelPackage.INDEXED_COLUMN__COLLATION_NAME:
        setCollationName((String)newValue);
        return;
      case SqliteModelPackage.INDEXED_COLUMN__ASC:
        setAsc((Boolean)newValue);
        return;
      case SqliteModelPackage.INDEXED_COLUMN__DESC:
        setDesc((Boolean)newValue);
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
      case SqliteModelPackage.INDEXED_COLUMN__COLUMN_REFERENCE:
        setColumnReference((ColumnDef)null);
        return;
      case SqliteModelPackage.INDEXED_COLUMN__COLLATION_NAME:
        setCollationName(COLLATION_NAME_EDEFAULT);
        return;
      case SqliteModelPackage.INDEXED_COLUMN__ASC:
        setAsc(ASC_EDEFAULT);
        return;
      case SqliteModelPackage.INDEXED_COLUMN__DESC:
        setDesc(DESC_EDEFAULT);
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
      case SqliteModelPackage.INDEXED_COLUMN__COLUMN_REFERENCE:
        return columnReference != null;
      case SqliteModelPackage.INDEXED_COLUMN__COLLATION_NAME:
        return COLLATION_NAME_EDEFAULT == null ? collationName != null : !COLLATION_NAME_EDEFAULT.equals(collationName);
      case SqliteModelPackage.INDEXED_COLUMN__ASC:
        return asc != ASC_EDEFAULT;
      case SqliteModelPackage.INDEXED_COLUMN__DESC:
        return desc != DESC_EDEFAULT;
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
    result.append(" (collationName: ");
    result.append(collationName);
    result.append(", asc: ");
    result.append(asc);
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //IndexedColumnImpl
