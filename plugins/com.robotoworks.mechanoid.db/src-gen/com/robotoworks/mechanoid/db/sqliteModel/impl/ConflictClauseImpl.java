/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConflictClauseImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConflictClauseImpl extends MinimalEObjectImpl.Container implements ConflictClause
{
  /**
   * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolution()
   * @generated
   * @ordered
   */
  protected static final ConflictResolution RESOLUTION_EDEFAULT = ConflictResolution.ROLLBACK;

  /**
   * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolution()
   * @generated
   * @ordered
   */
  protected ConflictResolution resolution = RESOLUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConflictClauseImpl()
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
    return SqliteModelPackage.Literals.CONFLICT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolution getResolution()
  {
    return resolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolution(ConflictResolution newResolution)
  {
    ConflictResolution oldResolution = resolution;
    resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CONFLICT_CLAUSE__RESOLUTION, oldResolution, resolution));
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
      case SqliteModelPackage.CONFLICT_CLAUSE__RESOLUTION:
        return getResolution();
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
      case SqliteModelPackage.CONFLICT_CLAUSE__RESOLUTION:
        setResolution((ConflictResolution)newValue);
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
      case SqliteModelPackage.CONFLICT_CLAUSE__RESOLUTION:
        setResolution(RESOLUTION_EDEFAULT);
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
      case SqliteModelPackage.CONFLICT_CLAUSE__RESOLUTION:
        return resolution != RESOLUTION_EDEFAULT;
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
    result.append(" (resolution: ");
    result.append(resolution);
    result.append(')');
    return result.toString();
  }

} //ConflictClauseImpl
