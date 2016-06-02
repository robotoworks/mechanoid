/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl#isAsc <em>Asc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl#isDesc <em>Desc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl#isAutoincrement <em>Autoincrement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyColumnConstraintImpl extends ColumnConstraintImpl implements PrimaryKeyColumnConstraint
{
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
   * The default value of the '{@link #isAutoincrement() <em>Autoincrement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoincrement()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOINCREMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutoincrement() <em>Autoincrement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoincrement()
   * @generated
   * @ordered
   */
  protected boolean autoincrement = AUTOINCREMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryKeyColumnConstraintImpl()
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
    return SqliteModelPackage.Literals.PRIMARY_KEY_COLUMN_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__ASC, oldAsc, asc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutoincrement()
  {
    return autoincrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoincrement(boolean newAutoincrement)
  {
    boolean oldAutoincrement = autoincrement;
    autoincrement = newAutoincrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT, oldAutoincrement, autoincrement));
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
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__ASC:
        return isAsc();
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__DESC:
        return isDesc();
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT:
        return isAutoincrement();
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
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__ASC:
        setAsc((Boolean)newValue);
        return;
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__DESC:
        setDesc((Boolean)newValue);
        return;
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT:
        setAutoincrement((Boolean)newValue);
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
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__ASC:
        setAsc(ASC_EDEFAULT);
        return;
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT:
        setAutoincrement(AUTOINCREMENT_EDEFAULT);
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
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__ASC:
        return asc != ASC_EDEFAULT;
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__DESC:
        return desc != DESC_EDEFAULT;
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT:
        return autoincrement != AUTOINCREMENT_EDEFAULT;
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
    result.append(" (asc: ");
    result.append(asc);
    result.append(", desc: ");
    result.append(desc);
    result.append(", autoincrement: ");
    result.append(autoincrement);
    result.append(')');
    return result.toString();
  }

} //PrimaryKeyColumnConstraintImpl
