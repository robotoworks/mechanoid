/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop View Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropViewStatementImpl#isIfExists <em>If Exists</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropViewStatementImpl#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropViewStatementImpl extends DDLStatementImpl implements DropViewStatement
{
  /**
   * The default value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIfExists()
   * @generated
   * @ordered
   */
  protected static final boolean IF_EXISTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIfExists()
   * @generated
   * @ordered
   */
  protected boolean ifExists = IF_EXISTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getView() <em>View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected CreateViewStatement view;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DropViewStatementImpl()
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
    return SqliteModelPackage.Literals.DROP_VIEW_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIfExists()
  {
    return ifExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfExists(boolean newIfExists)
  {
    boolean oldIfExists = ifExists;
    ifExists = newIfExists;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DROP_VIEW_STATEMENT__IF_EXISTS, oldIfExists, ifExists));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateViewStatement getView()
  {
    if (view != null && view.eIsProxy())
    {
      InternalEObject oldView = (InternalEObject)view;
      view = (CreateViewStatement)eResolveProxy(oldView);
      if (view != oldView)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.DROP_VIEW_STATEMENT__VIEW, oldView, view));
      }
    }
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateViewStatement basicGetView()
  {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(CreateViewStatement newView)
  {
    CreateViewStatement oldView = view;
    view = newView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.DROP_VIEW_STATEMENT__VIEW, oldView, view));
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
      case SqliteModelPackage.DROP_VIEW_STATEMENT__IF_EXISTS:
        return isIfExists();
      case SqliteModelPackage.DROP_VIEW_STATEMENT__VIEW:
        if (resolve) return getView();
        return basicGetView();
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
      case SqliteModelPackage.DROP_VIEW_STATEMENT__IF_EXISTS:
        setIfExists((Boolean)newValue);
        return;
      case SqliteModelPackage.DROP_VIEW_STATEMENT__VIEW:
        setView((CreateViewStatement)newValue);
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
      case SqliteModelPackage.DROP_VIEW_STATEMENT__IF_EXISTS:
        setIfExists(IF_EXISTS_EDEFAULT);
        return;
      case SqliteModelPackage.DROP_VIEW_STATEMENT__VIEW:
        setView((CreateViewStatement)null);
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
      case SqliteModelPackage.DROP_VIEW_STATEMENT__IF_EXISTS:
        return ifExists != IF_EXISTS_EDEFAULT;
      case SqliteModelPackage.DROP_VIEW_STATEMENT__VIEW:
        return view != null;
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
    result.append(" (ifExists: ");
    result.append(ifExists);
    result.append(')');
    return result.toString();
  }

} //DropViewStatementImpl
