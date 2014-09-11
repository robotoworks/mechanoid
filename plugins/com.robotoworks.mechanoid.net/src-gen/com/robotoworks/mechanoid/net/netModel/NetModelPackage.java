/**
 */
package com.robotoworks.mechanoid.net.netModel;

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
 * @see com.robotoworks.mechanoid.net.netModel.NetModelFactory
 * @model kind="package"
 * @generated
 */
public interface NetModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "netModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.robotoworks.com/mechanoid/net/NetModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "netModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NetModelPackage eINSTANCE = com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ModelImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getModel()
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
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.DeclarationImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ClientImpl <em>Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ClientImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getClient()
   * @generated
   */
  int CLIENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT__BASE_URL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT__BLOCKS = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ClientBlockImpl <em>Client Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ClientBlockImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getClientBlock()
   * @generated
   */
  int CLIENT_BLOCK = 3;

  /**
   * The number of structural features of the '<em>Client Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HeaderBlockImpl <em>Header Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.HeaderBlockImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHeaderBlock()
   * @generated
   */
  int HEADER_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Headers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_BLOCK__HEADERS = CLIENT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_BLOCK_FEATURE_COUNT = CLIENT_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.HeaderImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl <em>Http Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHttpMethod()
   * @generated
   */
  int HTTP_METHOD = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__TYPE = CLIENT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__NAME = CLIENT_BLOCK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__PATH = CLIENT_BLOCK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__BLOCKS = CLIENT_BLOCK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Http Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_FEATURE_COUNT = CLIENT_BLOCK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodBlockImpl <em>Http Method Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.HttpMethodBlockImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHttpMethodBlock()
   * @generated
   */
  int HTTP_METHOD_BLOCK = 7;

  /**
   * The number of structural features of the '<em>Http Method Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.PathImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getPath()
   * @generated
   */
  int PATH = 8;

  /**
   * The feature id for the '<em><b>Arb</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__ARB = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ParamsBlockImpl <em>Params Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ParamsBlockImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getParamsBlock()
   * @generated
   */
  int PARAMS_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_BLOCK__PARAMS = CLIENT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Params Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_BLOCK_FEATURE_COUNT = CLIENT_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberAssignmentImpl <em>Simple Member Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberAssignmentImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getSimpleMemberAssignment()
   * @generated
   */
  int SIMPLE_MEMBER_ASSIGNMENT = 10;

  /**
   * The feature id for the '<em><b>Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_ASSIGNMENT__MEMBER = 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Simple Member Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.LiteralImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 11;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BodyBlockImpl <em>Body Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.BodyBlockImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBodyBlock()
   * @generated
   */
  int BODY_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_BLOCK__TYPE = HTTP_METHOD_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_BLOCK_FEATURE_COUNT = HTTP_METHOD_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ResponseBlockImpl <em>Response Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ResponseBlockImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getResponseBlock()
   * @generated
   */
  int RESPONSE_BLOCK = 13;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_BLOCK__SUPER_TYPE = HTTP_METHOD_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_BLOCK__TYPE = HTTP_METHOD_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Response Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_BLOCK_FEATURE_COUNT = HTTP_METHOD_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BlockTypeImpl <em>Block Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.BlockTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBlockType()
   * @generated
   */
  int BLOCK_TYPE = 14;

  /**
   * The number of structural features of the '<em>Block Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.MemberImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.TypedMemberImpl <em>Typed Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.TypedMemberImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getTypedMember()
   * @generated
   */
  int TYPED_MEMBER = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_MEMBER__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_MEMBER__TYPE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typed Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.SkipMemberImpl <em>Skip Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.SkipMemberImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getSkipMember()
   * @generated
   */
  int SKIP_MEMBER = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_MEMBER__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_MEMBER__LITERAL = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Skip Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberImpl <em>Simple Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getSimpleMember()
   * @generated
   */
  int SIMPLE_MEMBER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Simple Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.TypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getType()
   * @generated
   */
  int TYPE = 19;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = BLOCK_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.GenericListTypeImpl <em>Generic List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.GenericListTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getGenericListType()
   * @generated
   */
  int GENERIC_LIST_TYPE = 20;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_LIST_TYPE__ELEMENT_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_LIST_TYPE__ID = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generic List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_LIST_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.UserTypeImpl <em>User Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.UserTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getUserType()
   * @generated
   */
  int USER_TYPE = 21;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE__DECLARATION = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.UserTypeDeclarationImpl <em>User Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.UserTypeDeclarationImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getUserTypeDeclaration()
   * @generated
   */
  int USER_TYPE_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION__KEYWORD = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nogen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION__NOGEN = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>User Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeDeclarationImpl <em>Complex Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeDeclarationImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getComplexTypeDeclaration()
   * @generated
   */
  int COMPLEX_TYPE_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__NAME = USER_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__KEYWORD = USER_TYPE_DECLARATION__KEYWORD;

  /**
   * The feature id for the '<em><b>Nogen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__NOGEN = USER_TYPE_DECLARATION__NOGEN;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__LITERAL = USER_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION_FEATURE_COUNT = USER_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.EnumTypeDeclarationImpl <em>Enum Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.EnumTypeDeclarationImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getEnumTypeDeclaration()
   * @generated
   */
  int ENUM_TYPE_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__NAME = USER_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__KEYWORD = USER_TYPE_DECLARATION__KEYWORD;

  /**
   * The feature id for the '<em><b>Nogen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__NOGEN = USER_TYPE_DECLARATION__NOGEN;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__SUPER_TYPE = USER_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__LITERAL = USER_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION_FEATURE_COUNT = USER_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.EnumTypeLiteralImpl <em>Enum Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.EnumTypeLiteralImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getEnumTypeLiteral()
   * @generated
   */
  int ENUM_TYPE_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_LITERAL__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Enum Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.EnumMemberImpl <em>Enum Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.EnumMemberImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getEnumMember()
   * @generated
   */
  int ENUM_MEMBER = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__ASSIGNMENT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__VALUE = 2;

  /**
   * The number of structural features of the '<em>Enum Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeLiteralImpl <em>Complex Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeLiteralImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getComplexTypeLiteral()
   * @generated
   */
  int COMPLEX_TYPE_LITERAL = 27;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_LITERAL__MEMBERS = BLOCK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_LITERAL_FEATURE_COUNT = BLOCK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.IntrinsicTypeImpl <em>Intrinsic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.IntrinsicTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getIntrinsicType()
   * @generated
   */
  int INTRINSIC_TYPE = 28;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_TYPE__ID = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Intrinsic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.StringTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__ID = INTRINSIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = INTRINSIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.BooleanTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE__ID = INTRINSIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = INTRINSIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.NumericTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getNumericType()
   * @generated
   */
  int NUMERIC_TYPE = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_TYPE__ID = INTRINSIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Numeric Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_TYPE_FEATURE_COUNT = INTRINSIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.IntegerTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getIntegerType()
   * @generated
   */
  int INTEGER_TYPE = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__ID = NUMERIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Integer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.LongTypeImpl <em>Long Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.LongTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getLongType()
   * @generated
   */
  int LONG_TYPE = 33;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TYPE__ID = NUMERIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Long Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.DoubleTypeImpl <em>Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.DoubleTypeImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getDoubleType()
   * @generated
   */
  int DOUBLE_TYPE = 34;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE__ID = NUMERIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.BooleanLiteralImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 35;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.StringLiteralImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 36;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.impl.NumericLiteralImpl
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 37;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethodType <em>Http Method Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethodType
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHttpMethodType()
   * @generated
   */
  int HTTP_METHOD_TYPE = 38;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.net.netModel.BooleanValue <em>Boolean Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.net.netModel.BooleanValue
   * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 39;


  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Client <em>Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Client</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Client
   * @generated
   */
  EClass getClient();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.Client#getBaseUrl <em>Base Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Url</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Client#getBaseUrl()
   * @see #getClient()
   * @generated
   */
  EAttribute getClient_BaseUrl();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.Client#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Client#getBlocks()
   * @see #getClient()
   * @generated
   */
  EReference getClient_Blocks();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.ClientBlock <em>Client Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Client Block</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ClientBlock
   * @generated
   */
  EClass getClientBlock();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.HeaderBlock <em>Header Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Block</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HeaderBlock
   * @generated
   */
  EClass getHeaderBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.HeaderBlock#getHeaders <em>Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Headers</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HeaderBlock#getHeaders()
   * @see #getHeaderBlock()
   * @generated
   */
  EReference getHeaderBlock_Headers();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.Header#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Header#getValue()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Value();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod <em>Http Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Method</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethod
   * @generated
   */
  EClass getHttpMethod();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethod#getType()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethod#getName()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethod#getPath()
   * @see #getHttpMethod()
   * @generated
   */
  EReference getHttpMethod_Path();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethod#getBlocks()
   * @see #getHttpMethod()
   * @generated
   */
  EReference getHttpMethod_Blocks();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.HttpMethodBlock <em>Http Method Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Method Block</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethodBlock
   * @generated
   */
  EClass getHttpMethodBlock();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the attribute list '{@link com.robotoworks.mechanoid.net.netModel.Path#getArb <em>Arb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arb</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Path#getArb()
   * @see #getPath()
   * @generated
   */
  EAttribute getPath_Arb();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.Path#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Path#getParams()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Params();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.ParamsBlock <em>Params Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params Block</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ParamsBlock
   * @generated
   */
  EClass getParamsBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.ParamsBlock#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ParamsBlock#getParams()
   * @see #getParamsBlock()
   * @generated
   */
  EReference getParamsBlock_Params();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment <em>Simple Member Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Member Assignment</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment
   * @generated
   */
  EClass getSimpleMemberAssignment();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment#getMember()
   * @see #getSimpleMemberAssignment()
   * @generated
   */
  EReference getSimpleMemberAssignment_Member();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment#getDefaultValue()
   * @see #getSimpleMemberAssignment()
   * @generated
   */
  EReference getSimpleMemberAssignment_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.BodyBlock <em>Body Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Block</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BodyBlock
   * @generated
   */
  EClass getBodyBlock();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.BodyBlock#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BodyBlock#getType()
   * @see #getBodyBlock()
   * @generated
   */
  EReference getBodyBlock_Type();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock <em>Response Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response Block</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ResponseBlock
   * @generated
   */
  EClass getResponseBlock();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ResponseBlock#getSuperType()
   * @see #getResponseBlock()
   * @generated
   */
  EReference getResponseBlock_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ResponseBlock#getType()
   * @see #getResponseBlock()
   * @generated
   */
  EReference getResponseBlock_Type();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.BlockType <em>Block Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BlockType
   * @generated
   */
  EClass getBlockType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.TypedMember <em>Typed Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Member</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.TypedMember
   * @generated
   */
  EClass getTypedMember();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.TypedMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.TypedMember#getType()
   * @see #getTypedMember()
   * @generated
   */
  EReference getTypedMember_Type();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.SkipMember <em>Skip Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip Member</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SkipMember
   * @generated
   */
  EClass getSkipMember();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.SkipMember#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SkipMember#getLiteral()
   * @see #getSkipMember()
   * @generated
   */
  EReference getSkipMember_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.SimpleMember <em>Simple Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Member</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMember
   * @generated
   */
  EClass getSimpleMember();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.SimpleMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMember#getName()
   * @see #getSimpleMember()
   * @generated
   */
  EAttribute getSimpleMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.SimpleMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMember#getType()
   * @see #getSimpleMember()
   * @generated
   */
  EReference getSimpleMember_Type();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.GenericListType <em>Generic List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic List Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.GenericListType
   * @generated
   */
  EClass getGenericListType();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.GenericListType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.GenericListType#getElementType()
   * @see #getGenericListType()
   * @generated
   */
  EReference getGenericListType_ElementType();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.GenericListType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.GenericListType#getId()
   * @see #getGenericListType()
   * @generated
   */
  EAttribute getGenericListType_Id();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.UserType <em>User Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.UserType
   * @generated
   */
  EClass getUserType();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.net.netModel.UserType#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.UserType#getDeclaration()
   * @see #getUserType()
   * @generated
   */
  EReference getUserType_Declaration();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration <em>User Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Type Declaration</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration
   * @generated
   */
  EClass getUserTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#getKeyword()
   * @see #getUserTypeDeclaration()
   * @generated
   */
  EAttribute getUserTypeDeclaration_Keyword();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#isNogen <em>Nogen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nogen</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#isNogen()
   * @see #getUserTypeDeclaration()
   * @generated
   */
  EAttribute getUserTypeDeclaration_Nogen();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration <em>Complex Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type Declaration</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
   * @generated
   */
  EClass getComplexTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration#getLiteral()
   * @see #getComplexTypeDeclaration()
   * @generated
   */
  EReference getComplexTypeDeclaration_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration <em>Enum Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type Declaration</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
   * @generated
   */
  EClass getEnumTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration#getSuperType()
   * @see #getEnumTypeDeclaration()
   * @generated
   */
  EReference getEnumTypeDeclaration_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration#getLiteral()
   * @see #getEnumTypeDeclaration()
   * @generated
   */
  EReference getEnumTypeDeclaration_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral <em>Enum Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral
   * @generated
   */
  EClass getEnumTypeLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral#getMembers()
   * @see #getEnumTypeLiteral()
   * @generated
   */
  EReference getEnumTypeLiteral_Members();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumMember
   * @generated
   */
  EClass getEnumMember();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.EnumMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumMember#getName()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.EnumMember#isAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignment</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumMember#isAssignment()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Assignment();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.EnumMember#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.EnumMember#getValue()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Value();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral <em>Complex Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
   * @generated
   */
  EClass getComplexTypeLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral#getMembers()
   * @see #getComplexTypeLiteral()
   * @generated
   */
  EReference getComplexTypeLiteral_Members();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.IntrinsicType <em>Intrinsic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intrinsic Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.IntrinsicType
   * @generated
   */
  EClass getIntrinsicType();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.IntrinsicType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.IntrinsicType#getId()
   * @see #getIntrinsicType()
   * @generated
   */
  EAttribute getIntrinsicType_Id();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.NumericType <em>Numeric Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.NumericType
   * @generated
   */
  EClass getNumericType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.IntegerType <em>Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.IntegerType
   * @generated
   */
  EClass getIntegerType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.LongType <em>Long Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.LongType
   * @generated
   */
  EClass getLongType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.DoubleType
   * @generated
   */
  EClass getDoubleType();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.BooleanLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BooleanLiteral#getLiteral()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.StringLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.StringLiteral#getLiteral()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.net.netModel.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.net.netModel.NumericLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.NumericLiteral#getLiteral()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_Literal();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.net.netModel.HttpMethodType <em>Http Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Method Type</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethodType
   * @generated
   */
  EEnum getHttpMethodType();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.net.netModel.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Value</em>'.
   * @see com.robotoworks.mechanoid.net.netModel.BooleanValue
   * @generated
   */
  EEnum getBooleanValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NetModelFactory getNetModelFactory();

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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ModelImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.DeclarationImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ClientImpl <em>Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ClientImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getClient()
     * @generated
     */
    EClass CLIENT = eINSTANCE.getClient();

    /**
     * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLIENT__BASE_URL = eINSTANCE.getClient_BaseUrl();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLIENT__BLOCKS = eINSTANCE.getClient_Blocks();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ClientBlockImpl <em>Client Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ClientBlockImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getClientBlock()
     * @generated
     */
    EClass CLIENT_BLOCK = eINSTANCE.getClientBlock();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HeaderBlockImpl <em>Header Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.HeaderBlockImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHeaderBlock()
     * @generated
     */
    EClass HEADER_BLOCK = eINSTANCE.getHeaderBlock();

    /**
     * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER_BLOCK__HEADERS = eINSTANCE.getHeaderBlock_Headers();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.HeaderImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__VALUE = eINSTANCE.getHeader_Value();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl <em>Http Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHttpMethod()
     * @generated
     */
    EClass HTTP_METHOD = eINSTANCE.getHttpMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__TYPE = eINSTANCE.getHttpMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__NAME = eINSTANCE.getHttpMethod_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_METHOD__PATH = eINSTANCE.getHttpMethod_Path();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_METHOD__BLOCKS = eINSTANCE.getHttpMethod_Blocks();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodBlockImpl <em>Http Method Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.HttpMethodBlockImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHttpMethodBlock()
     * @generated
     */
    EClass HTTP_METHOD_BLOCK = eINSTANCE.getHttpMethodBlock();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.PathImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Arb</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH__ARB = eINSTANCE.getPath_Arb();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH__PARAMS = eINSTANCE.getPath_Params();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ParamsBlockImpl <em>Params Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ParamsBlockImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getParamsBlock()
     * @generated
     */
    EClass PARAMS_BLOCK = eINSTANCE.getParamsBlock();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMS_BLOCK__PARAMS = eINSTANCE.getParamsBlock_Params();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberAssignmentImpl <em>Simple Member Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberAssignmentImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getSimpleMemberAssignment()
     * @generated
     */
    EClass SIMPLE_MEMBER_ASSIGNMENT = eINSTANCE.getSimpleMemberAssignment();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MEMBER_ASSIGNMENT__MEMBER = eINSTANCE.getSimpleMemberAssignment_Member();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE = eINSTANCE.getSimpleMemberAssignment_DefaultValue();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.LiteralImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BodyBlockImpl <em>Body Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.BodyBlockImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBodyBlock()
     * @generated
     */
    EClass BODY_BLOCK = eINSTANCE.getBodyBlock();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_BLOCK__TYPE = eINSTANCE.getBodyBlock_Type();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ResponseBlockImpl <em>Response Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ResponseBlockImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getResponseBlock()
     * @generated
     */
    EClass RESPONSE_BLOCK = eINSTANCE.getResponseBlock();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSE_BLOCK__SUPER_TYPE = eINSTANCE.getResponseBlock_SuperType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSE_BLOCK__TYPE = eINSTANCE.getResponseBlock_Type();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BlockTypeImpl <em>Block Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.BlockTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBlockType()
     * @generated
     */
    EClass BLOCK_TYPE = eINSTANCE.getBlockType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.MemberImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.TypedMemberImpl <em>Typed Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.TypedMemberImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getTypedMember()
     * @generated
     */
    EClass TYPED_MEMBER = eINSTANCE.getTypedMember();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_MEMBER__TYPE = eINSTANCE.getTypedMember_Type();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.SkipMemberImpl <em>Skip Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.SkipMemberImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getSkipMember()
     * @generated
     */
    EClass SKIP_MEMBER = eINSTANCE.getSkipMember();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKIP_MEMBER__LITERAL = eINSTANCE.getSkipMember_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberImpl <em>Simple Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.SimpleMemberImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getSimpleMember()
     * @generated
     */
    EClass SIMPLE_MEMBER = eINSTANCE.getSimpleMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_MEMBER__NAME = eINSTANCE.getSimpleMember_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MEMBER__TYPE = eINSTANCE.getSimpleMember_Type();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.TypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.GenericListTypeImpl <em>Generic List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.GenericListTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getGenericListType()
     * @generated
     */
    EClass GENERIC_LIST_TYPE = eINSTANCE.getGenericListType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_LIST_TYPE__ELEMENT_TYPE = eINSTANCE.getGenericListType_ElementType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_LIST_TYPE__ID = eINSTANCE.getGenericListType_Id();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.UserTypeImpl <em>User Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.UserTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getUserType()
     * @generated
     */
    EClass USER_TYPE = eINSTANCE.getUserType();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_TYPE__DECLARATION = eINSTANCE.getUserType_Declaration();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.UserTypeDeclarationImpl <em>User Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.UserTypeDeclarationImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getUserTypeDeclaration()
     * @generated
     */
    EClass USER_TYPE_DECLARATION = eINSTANCE.getUserTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_TYPE_DECLARATION__KEYWORD = eINSTANCE.getUserTypeDeclaration_Keyword();

    /**
     * The meta object literal for the '<em><b>Nogen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_TYPE_DECLARATION__NOGEN = eINSTANCE.getUserTypeDeclaration_Nogen();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeDeclarationImpl <em>Complex Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeDeclarationImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getComplexTypeDeclaration()
     * @generated
     */
    EClass COMPLEX_TYPE_DECLARATION = eINSTANCE.getComplexTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE_DECLARATION__LITERAL = eINSTANCE.getComplexTypeDeclaration_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.EnumTypeDeclarationImpl <em>Enum Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.EnumTypeDeclarationImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getEnumTypeDeclaration()
     * @generated
     */
    EClass ENUM_TYPE_DECLARATION = eINSTANCE.getEnumTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_DECLARATION__SUPER_TYPE = eINSTANCE.getEnumTypeDeclaration_SuperType();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_DECLARATION__LITERAL = eINSTANCE.getEnumTypeDeclaration_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.EnumTypeLiteralImpl <em>Enum Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.EnumTypeLiteralImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getEnumTypeLiteral()
     * @generated
     */
    EClass ENUM_TYPE_LITERAL = eINSTANCE.getEnumTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_LITERAL__MEMBERS = eINSTANCE.getEnumTypeLiteral_Members();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.EnumMemberImpl <em>Enum Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.EnumMemberImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getEnumMember()
     * @generated
     */
    EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__NAME = eINSTANCE.getEnumMember_Name();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__ASSIGNMENT = eINSTANCE.getEnumMember_Assignment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__VALUE = eINSTANCE.getEnumMember_Value();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeLiteralImpl <em>Complex Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.ComplexTypeLiteralImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getComplexTypeLiteral()
     * @generated
     */
    EClass COMPLEX_TYPE_LITERAL = eINSTANCE.getComplexTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE_LITERAL__MEMBERS = eINSTANCE.getComplexTypeLiteral_Members();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.IntrinsicTypeImpl <em>Intrinsic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.IntrinsicTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getIntrinsicType()
     * @generated
     */
    EClass INTRINSIC_TYPE = eINSTANCE.getIntrinsicType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTRINSIC_TYPE__ID = eINSTANCE.getIntrinsicType_Id();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.StringTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.BooleanTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.NumericTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getNumericType()
     * @generated
     */
    EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.IntegerTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getIntegerType()
     * @generated
     */
    EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.LongTypeImpl <em>Long Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.LongTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getLongType()
     * @generated
     */
    EClass LONG_TYPE = eINSTANCE.getLongType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.DoubleTypeImpl <em>Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.DoubleTypeImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getDoubleType()
     * @generated
     */
    EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.BooleanLiteralImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__LITERAL = eINSTANCE.getBooleanLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.StringLiteralImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__LITERAL = eINSTANCE.getStringLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.impl.NumericLiteralImpl
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getNumericLiteral()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_LITERAL__LITERAL = eINSTANCE.getNumericLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethodType <em>Http Method Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.HttpMethodType
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getHttpMethodType()
     * @generated
     */
    EEnum HTTP_METHOD_TYPE = eINSTANCE.getHttpMethodType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.net.netModel.BooleanValue <em>Boolean Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.net.netModel.BooleanValue
     * @see com.robotoworks.mechanoid.net.netModel.impl.NetModelPackageImpl#getBooleanValue()
     * @generated
     */
    EEnum BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

  }

} //NetModelPackage
