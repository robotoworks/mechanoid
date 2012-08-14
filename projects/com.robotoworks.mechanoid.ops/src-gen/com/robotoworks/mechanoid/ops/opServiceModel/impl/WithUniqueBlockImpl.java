/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel.impl;

import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage;
import com.robotoworks.mechanoid.ops.opServiceModel.OperationArg;
import com.robotoworks.mechanoid.ops.opServiceModel.WithUniqueBlock;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Unique Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.WithUniqueBlockImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WithUniqueBlockImpl extends MinimalEObjectImpl.Container implements WithUniqueBlock
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<OperationArg> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithUniqueBlockImpl()
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
    return OpServiceModelPackage.Literals.WITH_UNIQUE_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationArg> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<OperationArg>(OperationArg.class, this, OpServiceModelPackage.WITH_UNIQUE_BLOCK__ARGS);
    }
    return args;
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
      case OpServiceModelPackage.WITH_UNIQUE_BLOCK__ARGS:
        return getArgs();
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
      case OpServiceModelPackage.WITH_UNIQUE_BLOCK__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends OperationArg>)newValue);
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
      case OpServiceModelPackage.WITH_UNIQUE_BLOCK__ARGS:
        getArgs().clear();
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
      case OpServiceModelPackage.WITH_UNIQUE_BLOCK__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WithUniqueBlockImpl
