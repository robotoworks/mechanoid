/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel.impl;

import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.NotUnique;
import com.robotoworks.mechanoid.ops.opServiceModel.OpArgType;
import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelFactory;
import com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage;
import com.robotoworks.mechanoid.ops.opServiceModel.Operation;
import com.robotoworks.mechanoid.ops.opServiceModel.OperationArg;
import com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock;
import com.robotoworks.mechanoid.ops.opServiceModel.UniqueClause;
import com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpServiceModelPackageImpl extends EPackageImpl implements OpServiceModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notUniqueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opArgTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OpServiceModelPackageImpl()
  {
    super(eNS_URI, OpServiceModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OpServiceModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OpServiceModelPackage init()
  {
    if (isInited) return (OpServiceModelPackage)EPackage.Registry.INSTANCE.getEPackage(OpServiceModelPackage.eNS_URI);

    // Obtain or create and register package
    OpServiceModelPackageImpl theOpServiceModelPackage = (OpServiceModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpServiceModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpServiceModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOpServiceModelPackage.createPackageContents();

    // Initialize created meta-data
    theOpServiceModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOpServiceModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OpServiceModelPackage.eNS_URI, theOpServiceModelPackage);
    return theOpServiceModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_PackageName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Service()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceBlock()
  {
    return serviceBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceBlock_Name()
  {
    return (EAttribute)serviceBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceBlock_Ops()
  {
    return (EReference)serviceBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Args()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_UniqueClause()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationArg()
  {
    return operationArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationArg_Type()
  {
    return (EAttribute)operationArgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationArg_Name()
  {
    return (EAttribute)operationArgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueClause()
  {
    return uniqueClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotUnique()
  {
    return notUniqueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueDeclaration()
  {
    return uniqueDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueDeclaration_Args()
  {
    return (EReference)uniqueDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpArgType()
  {
    return opArgTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpServiceModelFactory getOpServiceModelFactory()
  {
    return (OpServiceModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PACKAGE_NAME);
    createEReference(modelEClass, MODEL__SERVICE);

    serviceBlockEClass = createEClass(SERVICE_BLOCK);
    createEAttribute(serviceBlockEClass, SERVICE_BLOCK__NAME);
    createEReference(serviceBlockEClass, SERVICE_BLOCK__OPS);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEReference(operationEClass, OPERATION__ARGS);
    createEReference(operationEClass, OPERATION__UNIQUE_CLAUSE);

    operationArgEClass = createEClass(OPERATION_ARG);
    createEAttribute(operationArgEClass, OPERATION_ARG__TYPE);
    createEAttribute(operationArgEClass, OPERATION_ARG__NAME);

    uniqueClauseEClass = createEClass(UNIQUE_CLAUSE);

    notUniqueEClass = createEClass(NOT_UNIQUE);

    uniqueDeclarationEClass = createEClass(UNIQUE_DECLARATION);
    createEReference(uniqueDeclarationEClass, UNIQUE_DECLARATION__ARGS);

    // Create enums
    opArgTypeEEnum = createEEnum(OP_ARG_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    notUniqueEClass.getESuperTypes().add(this.getUniqueClause());
    uniqueDeclarationEClass.getESuperTypes().add(this.getUniqueClause());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Service(), this.getServiceBlock(), null, "service", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceBlockEClass, ServiceBlock.class, "ServiceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceBlock_Ops(), this.getOperation(), null, "ops", null, 0, -1, ServiceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Args(), this.getOperationArg(), null, "args", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_UniqueClause(), this.getUniqueClause(), null, "uniqueClause", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationArgEClass, OperationArg.class, "OperationArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationArg_Type(), this.getOpArgType(), "type", null, 0, 1, OperationArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperationArg_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperationArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uniqueClauseEClass, UniqueClause.class, "UniqueClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notUniqueEClass, NotUnique.class, "NotUnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uniqueDeclarationEClass, UniqueDeclaration.class, "UniqueDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniqueDeclaration_Args(), this.getOperationArg(), null, "args", null, 0, -1, UniqueDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(opArgTypeEEnum, OpArgType.class, "OpArgType");
    addEEnumLiteral(opArgTypeEEnum, OpArgType.BOOLEAN);
    addEEnumLiteral(opArgTypeEEnum, OpArgType.STRING);
    addEEnumLiteral(opArgTypeEEnum, OpArgType.INTEGER);
    addEEnumLiteral(opArgTypeEEnum, OpArgType.FLOAT);
    addEEnumLiteral(opArgTypeEEnum, OpArgType.DOUBLE);
    addEEnumLiteral(opArgTypeEEnum, OpArgType.LONG);
    addEEnumLiteral(opArgTypeEEnum, OpArgType.PARCELABLE);

    // Create resource
    createResource(eNS_URI);
  }

} //OpServiceModelPackageImpl
