/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.Expression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateColumnExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Column Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UpdateColumnExpressionImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UpdateColumnExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateColumnExpressionImpl extends MinimalEObjectImpl.Container implements UpdateColumnExpression
{
  /**
   * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected String columnName = COLUMN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateColumnExpressionImpl()
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
    return SqliteModelPackage.Literals.UPDATE_COLUMN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColumnName()
  {
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnName(String newColumnName)
  {
    String oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME, oldColumnName, columnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        return getColumnName();
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        return getExpression();
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
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        setColumnName((String)newValue);
        return;
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        setColumnName(COLUMN_NAME_EDEFAULT);
        return;
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
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
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        return expression != null;
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
    result.append(" (columnName: ");
    result.append(columnName);
    result.append(')');
    return result.toString();
  }

} //UpdateColumnExpressionImpl
