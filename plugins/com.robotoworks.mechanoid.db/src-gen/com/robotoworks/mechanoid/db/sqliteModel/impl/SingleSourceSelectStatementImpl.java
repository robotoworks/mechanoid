/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Source Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceSelectStatementImpl#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleSourceSelectStatementImpl extends SelectSourceImpl implements SingleSourceSelectStatement
{
  /**
   * The cached value of the '{@link #getSelectStatement() <em>Select Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectStatement()
   * @generated
   * @ordered
   */
  protected SelectStatement selectStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleSourceSelectStatementImpl()
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
    return SqliteModelPackage.Literals.SINGLE_SOURCE_SELECT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement getSelectStatement()
  {
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectStatement(SelectStatement newSelectStatement, NotificationChain msgs)
  {
    SelectStatement oldSelectStatement = selectStatement;
    selectStatement = newSelectStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT, oldSelectStatement, newSelectStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectStatement(SelectStatement newSelectStatement)
  {
    if (newSelectStatement != selectStatement)
    {
      NotificationChain msgs = null;
      if (selectStatement != null)
        msgs = ((InternalEObject)selectStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT, null, msgs);
      if (newSelectStatement != null)
        msgs = ((InternalEObject)newSelectStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT, null, msgs);
      msgs = basicSetSelectStatement(newSelectStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT, newSelectStatement, newSelectStatement));
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
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT:
        return basicSetSelectStatement(null, msgs);
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
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT:
        return getSelectStatement();
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
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT:
        setSelectStatement((SelectStatement)newValue);
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
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT:
        setSelectStatement((SelectStatement)null);
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
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT:
        return selectStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleSourceSelectStatementImpl
