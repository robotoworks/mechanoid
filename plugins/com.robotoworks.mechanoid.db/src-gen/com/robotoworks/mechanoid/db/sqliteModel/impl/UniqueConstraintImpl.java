/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueConstraintImpl#getConflictClause <em>Conflict Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniqueConstraintImpl extends ColumnConstraintImpl implements UniqueConstraint
{
  /**
   * The cached value of the '{@link #getConflictClause() <em>Conflict Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictClause()
   * @generated
   * @ordered
   */
  protected ConflictClause conflictClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UniqueConstraintImpl()
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
    return SqliteModelPackage.Literals.UNIQUE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictClause getConflictClause()
  {
    return conflictClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConflictClause(ConflictClause newConflictClause, NotificationChain msgs)
  {
    ConflictClause oldConflictClause = conflictClause;
    conflictClause = newConflictClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE, oldConflictClause, newConflictClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConflictClause(ConflictClause newConflictClause)
  {
    if (newConflictClause != conflictClause)
    {
      NotificationChain msgs = null;
      if (conflictClause != null)
        msgs = ((InternalEObject)conflictClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE, null, msgs);
      if (newConflictClause != null)
        msgs = ((InternalEObject)newConflictClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE, null, msgs);
      msgs = basicSetConflictClause(newConflictClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE, newConflictClause, newConflictClause));
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
      case SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE:
        return basicSetConflictClause(null, msgs);
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
      case SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE:
        return getConflictClause();
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
      case SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE:
        setConflictClause((ConflictClause)newValue);
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
      case SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE:
        setConflictClause((ConflictClause)null);
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
      case SqliteModelPackage.UNIQUE_CONSTRAINT__CONFLICT_CLAUSE:
        return conflictClause != null;
    }
    return super.eIsSet(featureID);
  }

} //UniqueConstraintImpl
