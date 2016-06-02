/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group By Expressions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.GroupByExpressionsImpl#getGroupByExpressions <em>Group By Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupByExpressionsImpl extends MinimalEObjectImpl.Container implements GroupByExpressions
{
  /**
   * The cached value of the '{@link #getGroupByExpressions() <em>Group By Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupByExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> groupByExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupByExpressionsImpl()
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
    return SqliteModelPackage.Literals.GROUP_BY_EXPRESSIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getGroupByExpressions()
  {
    if (groupByExpressions == null)
    {
      groupByExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, SqliteModelPackage.GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS);
    }
    return groupByExpressions;
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
      case SqliteModelPackage.GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS:
        return ((InternalEList<?>)getGroupByExpressions()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS:
        return getGroupByExpressions();
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
      case SqliteModelPackage.GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS:
        getGroupByExpressions().clear();
        getGroupByExpressions().addAll((Collection<? extends Expression>)newValue);
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
      case SqliteModelPackage.GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS:
        getGroupByExpressions().clear();
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
      case SqliteModelPackage.GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS:
        return groupByExpressions != null && !groupByExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GroupByExpressionsImpl
