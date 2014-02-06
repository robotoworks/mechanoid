/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl#getCore <em>Core</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl#getOrderby <em>Orderby</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl#getLimitOffset <em>Limit Offset</em>}</li>
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
   * The cached value of the '{@link #getOrderby() <em>Orderby</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderby()
   * @generated
   * @ordered
   */
  protected OrderingTermList orderby;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected Expression limit;

  /**
   * The cached value of the '{@link #getLimitOffset() <em>Limit Offset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimitOffset()
   * @generated
   * @ordered
   */
  protected Expression limitOffset;

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
  public OrderingTermList getOrderby()
  {
    return orderby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderby(OrderingTermList newOrderby, NotificationChain msgs)
  {
    OrderingTermList oldOrderby = orderby;
    orderby = newOrderby;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__ORDERBY, oldOrderby, newOrderby);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderby(OrderingTermList newOrderby)
  {
    if (newOrderby != orderby)
    {
      NotificationChain msgs = null;
      if (orderby != null)
        msgs = ((InternalEObject)orderby).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__ORDERBY, null, msgs);
      if (newOrderby != null)
        msgs = ((InternalEObject)newOrderby).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__ORDERBY, null, msgs);
      msgs = basicSetOrderby(newOrderby, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__ORDERBY, newOrderby, newOrderby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimit(Expression newLimit, NotificationChain msgs)
  {
    Expression oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__LIMIT, oldLimit, newLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(Expression newLimit)
  {
    if (newLimit != limit)
    {
      NotificationChain msgs = null;
      if (limit != null)
        msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__LIMIT, null, msgs);
      if (newLimit != null)
        msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__LIMIT, null, msgs);
      msgs = basicSetLimit(newLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__LIMIT, newLimit, newLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLimitOffset()
  {
    return limitOffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimitOffset(Expression newLimitOffset, NotificationChain msgs)
  {
    Expression oldLimitOffset = limitOffset;
    limitOffset = newLimitOffset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET, oldLimitOffset, newLimitOffset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimitOffset(Expression newLimitOffset)
  {
    if (newLimitOffset != limitOffset)
    {
      NotificationChain msgs = null;
      if (limitOffset != null)
        msgs = ((InternalEObject)limitOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET, null, msgs);
      if (newLimitOffset != null)
        msgs = ((InternalEObject)newLimitOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET, null, msgs);
      msgs = basicSetLimitOffset(newLimitOffset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET, newLimitOffset, newLimitOffset));
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
      case SqliteModelPackage.SELECT_STATEMENT__ORDERBY:
        return basicSetOrderby(null, msgs);
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT:
        return basicSetLimit(null, msgs);
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET:
        return basicSetLimitOffset(null, msgs);
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
      case SqliteModelPackage.SELECT_STATEMENT__ORDERBY:
        return getOrderby();
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT:
        return getLimit();
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET:
        return getLimitOffset();
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
      case SqliteModelPackage.SELECT_STATEMENT__CORE:
        setCore((SelectCoreExpression)newValue);
        return;
      case SqliteModelPackage.SELECT_STATEMENT__ORDERBY:
        setOrderby((OrderingTermList)newValue);
        return;
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT:
        setLimit((Expression)newValue);
        return;
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET:
        setLimitOffset((Expression)newValue);
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
      case SqliteModelPackage.SELECT_STATEMENT__ORDERBY:
        setOrderby((OrderingTermList)null);
        return;
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT:
        setLimit((Expression)null);
        return;
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET:
        setLimitOffset((Expression)null);
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
      case SqliteModelPackage.SELECT_STATEMENT__ORDERBY:
        return orderby != null;
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT:
        return limit != null;
      case SqliteModelPackage.SELECT_STATEMENT__LIMIT_OFFSET:
        return limitOffset != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
