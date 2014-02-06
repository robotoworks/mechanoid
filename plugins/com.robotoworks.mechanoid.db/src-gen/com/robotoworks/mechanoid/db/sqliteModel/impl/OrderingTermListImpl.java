/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList;
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
 * An implementation of the model object '<em><b>Ordering Term List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermListImpl#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderingTermListImpl extends MinimalEObjectImpl.Container implements OrderingTermList
{
  /**
   * The cached value of the '{@link #getOrderingTerms() <em>Ordering Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderingTerms()
   * @generated
   * @ordered
   */
  protected EList<OrderingTerm> orderingTerms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderingTermListImpl()
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
    return SqliteModelPackage.Literals.ORDERING_TERM_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrderingTerm> getOrderingTerms()
  {
    if (orderingTerms == null)
    {
      orderingTerms = new EObjectContainmentEList<OrderingTerm>(OrderingTerm.class, this, SqliteModelPackage.ORDERING_TERM_LIST__ORDERING_TERMS);
    }
    return orderingTerms;
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
      case SqliteModelPackage.ORDERING_TERM_LIST__ORDERING_TERMS:
        return ((InternalEList<?>)getOrderingTerms()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.ORDERING_TERM_LIST__ORDERING_TERMS:
        return getOrderingTerms();
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
      case SqliteModelPackage.ORDERING_TERM_LIST__ORDERING_TERMS:
        getOrderingTerms().clear();
        getOrderingTerms().addAll((Collection<? extends OrderingTerm>)newValue);
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
      case SqliteModelPackage.ORDERING_TERM_LIST__ORDERING_TERMS:
        getOrderingTerms().clear();
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
      case SqliteModelPackage.ORDERING_TERM_LIST__ORDERING_TERMS:
        return orderingTerms != null && !orderingTerms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OrderingTermListImpl
