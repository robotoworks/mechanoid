/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel.impl;

import com.robotoworks.mechanoid.ops.opServiceModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpServiceModelFactoryImpl extends EFactoryImpl implements OpServiceModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OpServiceModelFactory init()
  {
    try
    {
      OpServiceModelFactory theOpServiceModelFactory = (OpServiceModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.robotoworks.com/mechanoid/ops/OpServiceModel"); 
      if (theOpServiceModelFactory != null)
      {
        return theOpServiceModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OpServiceModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpServiceModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OpServiceModelPackage.MODEL: return createModel();
      case OpServiceModelPackage.SERVICE_BLOCK: return createServiceBlock();
      case OpServiceModelPackage.OPERATION: return createOperation();
      case OpServiceModelPackage.OPERATION_ARG: return createOperationArg();
      case OpServiceModelPackage.WITH_UNIQUE_BLOCK: return createWithUniqueBlock();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OpServiceModelPackage.OP_ARG_TYPE:
        return createOpArgTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OpServiceModelPackage.OP_ARG_TYPE:
        return convertOpArgTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceBlock createServiceBlock()
  {
    ServiceBlockImpl serviceBlock = new ServiceBlockImpl();
    return serviceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationArg createOperationArg()
  {
    OperationArgImpl operationArg = new OperationArgImpl();
    return operationArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithUniqueBlock createWithUniqueBlock()
  {
    WithUniqueBlockImpl withUniqueBlock = new WithUniqueBlockImpl();
    return withUniqueBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpArgType createOpArgTypeFromString(EDataType eDataType, String initialValue)
  {
    OpArgType result = OpArgType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpArgTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpServiceModelPackage getOpServiceModelPackage()
  {
    return (OpServiceModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OpServiceModelPackage getPackage()
  {
    return OpServiceModelPackage.eINSTANCE;
  }

} //OpServiceModelFactoryImpl
