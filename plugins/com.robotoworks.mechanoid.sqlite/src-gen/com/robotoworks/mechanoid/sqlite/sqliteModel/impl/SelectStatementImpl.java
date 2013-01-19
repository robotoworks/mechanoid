/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

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
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl#getCore <em>Core</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectStatementImpl extends DMLStatementImpl implements SelectStatement
{
  /**
   * The cached value of the '{@link #getCore() <em>Core</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCore()
   * @generated
   * @ordered
   */
  protected SelectCoreExpression core;

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
  public SelectCoreExpression getCore()
  {
    return core;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCore(SelectCoreExpression newCore, NotificationChain msgs)
  {
    SelectCoreExpression oldCore = core;
    core = newCore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__CORE, oldCore, newCore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCore(SelectCoreExpression newCore)
  {
    if (newCore != core)
    {
      NotificationChain msgs = null;
      if (core != null)
        msgs = ((InternalEObject)core).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__CORE, null, msgs);
      if (newCore != null)
        msgs = ((InternalEObject)newCore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__CORE, null, msgs);
      msgs = basicSetCore(newCore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__CORE, newCore, newCore));
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE:
        return basicSetCore(null, msgs);
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE:
        return getCore();
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE:
        setCore((SelectCoreExpression)newValue);
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE:
        setCore((SelectCoreExpression)null);
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE:
        return core != null;
      case SqliteModelPackage.SELECT_STATEMENT__ORDERING_TERMS:
        return orderingTerms != null && !orderingTerms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
