/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.Expression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqlExpressionImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqlExpressionImpl#isIsnull <em>Isnull</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlExpressionImpl extends ExpressionImpl implements SqlExpression
{
  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected Expression root;

  /**
   * The default value of the '{@link #isIsnull() <em>Isnull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsnull()
   * @generated
   * @ordered
   */
  protected static final boolean ISNULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsnull() <em>Isnull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsnull()
   * @generated
   * @ordered
   */
  protected boolean isnull = ISNULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SqlExpressionImpl()
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
    return SqliteModelPackage.Literals.SQL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(Expression newRoot, NotificationChain msgs)
  {
    Expression oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SQL_EXPRESSION__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(Expression newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SQL_EXPRESSION__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SQL_EXPRESSION__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SQL_EXPRESSION__ROOT, newRoot, newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsnull()
  {
    return isnull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsnull(boolean newIsnull)
  {
    boolean oldIsnull = isnull;
    isnull = newIsnull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SQL_EXPRESSION__ISNULL, oldIsnull, isnull));
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
      case SqliteModelPackage.SQL_EXPRESSION__ROOT:
        return basicSetRoot(null, msgs);
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
      case SqliteModelPackage.SQL_EXPRESSION__ROOT:
        return getRoot();
      case SqliteModelPackage.SQL_EXPRESSION__ISNULL:
        return isIsnull();
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
      case SqliteModelPackage.SQL_EXPRESSION__ROOT:
        setRoot((Expression)newValue);
        return;
      case SqliteModelPackage.SQL_EXPRESSION__ISNULL:
        setIsnull((Boolean)newValue);
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
      case SqliteModelPackage.SQL_EXPRESSION__ROOT:
        setRoot((Expression)null);
        return;
      case SqliteModelPackage.SQL_EXPRESSION__ISNULL:
        setIsnull(ISNULL_EDEFAULT);
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
      case SqliteModelPackage.SQL_EXPRESSION__ROOT:
        return root != null;
      case SqliteModelPackage.SQL_EXPRESSION__ISNULL:
        return isnull != ISNULL_EDEFAULT;
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
    result.append(" (isnull: ");
    result.append(isnull);
    result.append(')');
    return result.toString();
  }

} //SqlExpressionImpl
