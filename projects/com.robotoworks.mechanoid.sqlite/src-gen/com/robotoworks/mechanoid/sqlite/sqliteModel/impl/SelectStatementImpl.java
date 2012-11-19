/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

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
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl#getCoreStatements <em>Core Statements</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectStatementImpl extends MinimalEObjectImpl.Container implements SelectStatement
{
  /**
   * The cached value of the '{@link #getCoreStatements() <em>Core Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoreStatements()
   * @generated
   * @ordered
   */
  protected EList<SelectCore> coreStatements;

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
  protected SelectStatementImpl()
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
    return SqliteModelPackage.Literals.SELECT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SelectCore> getCoreStatements()
  {
    if (coreStatements == null)
    {
      coreStatements = new EObjectContainmentEList<SelectCore>(SelectCore.class, this, SqliteModelPackage.SELECT_STATEMENT__CORE_STATEMENTS);
    }
    return coreStatements;
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
      orderingTerms = new EObjectContainmentEList<OrderingTerm>(OrderingTerm.class, this, SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS);
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE_STATEMENTS:
        return ((InternalEList<?>)getCoreStatements()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS:
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE_STATEMENTS:
        return getCoreStatements();
      case SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS:
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE_STATEMENTS:
        getCoreStatements().clear();
        getCoreStatements().addAll((Collection<? extends SelectCore>)newValue);
        return;
      case SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS:
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE_STATEMENTS:
        getCoreStatements().clear();
        return;
      case SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS:
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE_STATEMENTS:
        return coreStatements != null && !coreStatements.isEmpty();
      case SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS:
        return orderingTerms != null && !orderingTerms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
