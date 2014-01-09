/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.DMLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.Function;
import com.robotoworks.mechanoid.db.sqliteModel.FunctionArg;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

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
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends ConfigurationStatementImpl implements Function
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<FunctionArg> args;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<DMLStatement> statements;

  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Expression> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return SqliteModelPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionArg> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<FunctionArg>(FunctionArg.class, this, SqliteModelPackage.FUNCTION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DMLStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<DMLStatement>(DMLStatement.class, this, SqliteModelPackage.FUNCTION__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.FUNCTION__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Expression>(Expression.class, this, SqliteModelPackage.FUNCTION__ARGUMENTS);
    }
    return arguments;
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
      case SqliteModelPackage.FUNCTION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.FUNCTION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.FUNCTION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.FUNCTION__ARGS:
        return getArgs();
      case SqliteModelPackage.FUNCTION__STATEMENTS:
        return getStatements();
      case SqliteModelPackage.FUNCTION__ALL:
        return isAll();
      case SqliteModelPackage.FUNCTION__ARGUMENTS:
        return getArguments();
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
      case SqliteModelPackage.FUNCTION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends FunctionArg>)newValue);
        return;
      case SqliteModelPackage.FUNCTION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends DMLStatement>)newValue);
        return;
      case SqliteModelPackage.FUNCTION__ALL:
        setAll((Boolean)newValue);
        return;
      case SqliteModelPackage.FUNCTION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Expression>)newValue);
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
      case SqliteModelPackage.FUNCTION__ARGS:
        getArgs().clear();
        return;
      case SqliteModelPackage.FUNCTION__STATEMENTS:
        getStatements().clear();
        return;
      case SqliteModelPackage.FUNCTION__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case SqliteModelPackage.FUNCTION__ARGUMENTS:
        getArguments().clear();
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
      case SqliteModelPackage.FUNCTION__ARGS:
        return args != null && !args.isEmpty();
      case SqliteModelPackage.FUNCTION__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case SqliteModelPackage.FUNCTION__ALL:
        return all != ALL_EDEFAULT;
      case SqliteModelPackage.FUNCTION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
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
    result.append(" (all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
