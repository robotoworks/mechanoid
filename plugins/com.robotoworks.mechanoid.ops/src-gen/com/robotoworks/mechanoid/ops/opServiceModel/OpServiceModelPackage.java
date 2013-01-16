/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelFactory
 * @model kind="package"
 * @generated
 */
public interface OpServiceModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "opServiceModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.robotoworks.com/mechanoid/ops/OpServiceModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "opServiceModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OpServiceModelPackage eINSTANCE = com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.ModelImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SERVICE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.ServiceBlockImpl <em>Service Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.ServiceBlockImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getServiceBlock()
   * @generated
   */
  int SERVICE_BLOCK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK__OPS = 1;

  /**
   * The number of structural features of the '<em>Service Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ARGS = 1;

  /**
   * The feature id for the '<em><b>Unique Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__UNIQUE_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationArgImpl <em>Operation Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationArgImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getOperationArg()
   * @generated
   */
  int OPERATION_ARG = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ARG__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ARG__NAME = 1;

  /**
   * The number of structural features of the '<em>Operation Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueClauseImpl <em>Unique Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueClauseImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getUniqueClause()
   * @generated
   */
  int UNIQUE_CLAUSE = 4;

  /**
   * The number of structural features of the '<em>Unique Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.NotUniqueImpl <em>Not Unique</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.NotUniqueImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getNotUnique()
   * @generated
   */
  int NOT_UNIQUE = 5;

  /**
   * The number of structural features of the '<em>Not Unique</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_UNIQUE_FEATURE_COUNT = UNIQUE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueDeclarationImpl <em>Unique Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueDeclarationImpl
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getUniqueDeclaration()
   * @generated
   */
  int UNIQUE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_DECLARATION__ARGS = UNIQUE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unique Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_DECLARATION_FEATURE_COUNT = UNIQUE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.OpArgType <em>Op Arg Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpArgType
   * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getOpArgType()
   * @generated
   */
  int OP_ARG_TYPE = 7;


  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.ops.opServiceModel.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.ops.opServiceModel.Model#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Service</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Model#getService()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Service();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock <em>Service Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Block</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock
   * @generated
   */
  EClass getServiceBlock();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getName()
   * @see #getServiceBlock()
   * @generated
   */
  EAttribute getServiceBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ops</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getOps()
   * @see #getServiceBlock()
   * @generated
   */
  EReference getServiceBlock_Ops();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Operation#getArgs()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Args();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getUniqueClause <em>Unique Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unique Clause</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.Operation#getUniqueClause()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_UniqueClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg <em>Operation Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Arg</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OperationArg
   * @generated
   */
  EClass getOperationArg();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getType()
   * @see #getOperationArg()
   * @generated
   */
  EAttribute getOperationArg_Type();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getName()
   * @see #getOperationArg()
   * @generated
   */
  EAttribute getOperationArg_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.UniqueClause <em>Unique Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Clause</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.UniqueClause
   * @generated
   */
  EClass getUniqueClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.NotUnique <em>Not Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Unique</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.NotUnique
   * @generated
   */
  EClass getNotUnique();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration <em>Unique Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Declaration</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration
   * @generated
   */
  EClass getUniqueDeclaration();

  /**
   * Returns the meta object for the reference list '{@link com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Args</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration#getArgs()
   * @see #getUniqueDeclaration()
   * @generated
   */
  EReference getUniqueDeclaration_Args();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.ops.opServiceModel.OpArgType <em>Op Arg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Arg Type</em>'.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpArgType
   * @generated
   */
  EEnum getOpArgType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OpServiceModelFactory getOpServiceModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.ModelImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGE_NAME = eINSTANCE.getModel_PackageName();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SERVICE = eINSTANCE.getModel_Service();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.ServiceBlockImpl <em>Service Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.ServiceBlockImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getServiceBlock()
     * @generated
     */
    EClass SERVICE_BLOCK = eINSTANCE.getServiceBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_BLOCK__NAME = eINSTANCE.getServiceBlock_Name();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_BLOCK__OPS = eINSTANCE.getServiceBlock_Ops();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__ARGS = eINSTANCE.getOperation_Args();

    /**
     * The meta object literal for the '<em><b>Unique Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__UNIQUE_CLAUSE = eINSTANCE.getOperation_UniqueClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationArgImpl <em>Operation Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OperationArgImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getOperationArg()
     * @generated
     */
    EClass OPERATION_ARG = eINSTANCE.getOperationArg();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_ARG__TYPE = eINSTANCE.getOperationArg_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_ARG__NAME = eINSTANCE.getOperationArg_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueClauseImpl <em>Unique Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueClauseImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getUniqueClause()
     * @generated
     */
    EClass UNIQUE_CLAUSE = eINSTANCE.getUniqueClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.NotUniqueImpl <em>Not Unique</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.NotUniqueImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getNotUnique()
     * @generated
     */
    EClass NOT_UNIQUE = eINSTANCE.getNotUnique();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueDeclarationImpl <em>Unique Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.UniqueDeclarationImpl
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getUniqueDeclaration()
     * @generated
     */
    EClass UNIQUE_DECLARATION = eINSTANCE.getUniqueDeclaration();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_DECLARATION__ARGS = eINSTANCE.getUniqueDeclaration_Args();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.ops.opServiceModel.OpArgType <em>Op Arg Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.ops.opServiceModel.OpArgType
     * @see com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelPackageImpl#getOpArgType()
     * @generated
     */
    EEnum OP_ARG_TYPE = eINSTANCE.getOpArgType();

  }

} //OpServiceModelPackage
