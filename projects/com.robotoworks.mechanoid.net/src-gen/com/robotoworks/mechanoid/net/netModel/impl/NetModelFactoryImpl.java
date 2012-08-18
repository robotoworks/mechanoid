/**
 */
package com.robotoworks.mechanoid.net.netModel.impl;

import com.robotoworks.mechanoid.net.netModel.*;

import org.eclipse.emf.ecore.EClass;
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
public class NetModelFactoryImpl extends EFactoryImpl implements NetModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NetModelFactory init()
  {
    try
    {
      NetModelFactory theNetModelFactory = (NetModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.robotoworks.com/mechanoid/net/NetModel"); 
      if (theNetModelFactory != null)
      {
        return theNetModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NetModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetModelFactoryImpl()
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
      case NetModelPackage.MODEL: return createModel();
      case NetModelPackage.DECLARATION: return createDeclaration();
      case NetModelPackage.CLIENT: return createClient();
      case NetModelPackage.HTTP_METHOD: return createHttpMethod();
      case NetModelPackage.HTTP_POST: return createHttpPost();
      case NetModelPackage.HTTP_PUT: return createHttpPut();
      case NetModelPackage.HTTP_GET: return createHttpGet();
      case NetModelPackage.HTTP_DELETE: return createHttpDelete();
      case NetModelPackage.PARAMS_BLOCK: return createParamsBlock();
      case NetModelPackage.BODY_BLOCK: return createBodyBlock();
      case NetModelPackage.RESPONSE_BLOCK: return createResponseBlock();
      case NetModelPackage.BLOCK_TYPE: return createBlockType();
      case NetModelPackage.MEMBER: return createMember();
      case NetModelPackage.TYPED_MEMBER: return createTypedMember();
      case NetModelPackage.ID_NAMED_MEMBER: return createIDNamedMember();
      case NetModelPackage.STRING_NAMED_MEMBER: return createStringNamedMember();
      case NetModelPackage.WRAP_WITH_MEMBER: return createWrapWithMember();
      case NetModelPackage.SIMPLE_MEMBER: return createSimpleMember();
      case NetModelPackage.ID_NAMED_SIMPLE_MEMBER: return createIDNamedSimpleMember();
      case NetModelPackage.STRING_NAMED_SIMPLE_MEMBER: return createStringNamedSimpleMember();
      case NetModelPackage.TYPE: return createType();
      case NetModelPackage.GENERIC_LIST_TYPE: return createGenericListType();
      case NetModelPackage.ARRAY_TYPE: return createArrayType();
      case NetModelPackage.USER_TYPE: return createUserType();
      case NetModelPackage.USER_TYPE_DECLARATION: return createUserTypeDeclaration();
      case NetModelPackage.COMPLEX_TYPE_DECLARATION: return createComplexTypeDeclaration();
      case NetModelPackage.ENUM_TYPE_DECLARATION: return createEnumTypeDeclaration();
      case NetModelPackage.ENUM_TYPE_LITERAL: return createEnumTypeLiteral();
      case NetModelPackage.ENUM_MEMBER: return createEnumMember();
      case NetModelPackage.COMPLEX_TYPE_LITERAL: return createComplexTypeLiteral();
      case NetModelPackage.INTRINSIC_TYPE: return createIntrinsicType();
      case NetModelPackage.STRING_TYPE: return createStringType();
      case NetModelPackage.BOOLEAN_TYPE: return createBooleanType();
      case NetModelPackage.DATE_TYPE: return createDateType();
      case NetModelPackage.NUMERIC_TYPE: return createNumericType();
      case NetModelPackage.INTEGER_TYPE: return createIntegerType();
      case NetModelPackage.LONG_TYPE: return createLongType();
      case NetModelPackage.FLOAT_TYPE: return createFloatType();
      case NetModelPackage.DOUBLE_TYPE: return createDoubleType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Client createClient()
  {
    ClientImpl client = new ClientImpl();
    return client;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethod createHttpMethod()
  {
    HttpMethodImpl httpMethod = new HttpMethodImpl();
    return httpMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpPost createHttpPost()
  {
    HttpPostImpl httpPost = new HttpPostImpl();
    return httpPost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpPut createHttpPut()
  {
    HttpPutImpl httpPut = new HttpPutImpl();
    return httpPut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpGet createHttpGet()
  {
    HttpGetImpl httpGet = new HttpGetImpl();
    return httpGet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpDelete createHttpDelete()
  {
    HttpDeleteImpl httpDelete = new HttpDeleteImpl();
    return httpDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamsBlock createParamsBlock()
  {
    ParamsBlockImpl paramsBlock = new ParamsBlockImpl();
    return paramsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyBlock createBodyBlock()
  {
    BodyBlockImpl bodyBlock = new BodyBlockImpl();
    return bodyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseBlock createResponseBlock()
  {
    ResponseBlockImpl responseBlock = new ResponseBlockImpl();
    return responseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockType createBlockType()
  {
    BlockTypeImpl blockType = new BlockTypeImpl();
    return blockType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedMember createTypedMember()
  {
    TypedMemberImpl typedMember = new TypedMemberImpl();
    return typedMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDNamedMember createIDNamedMember()
  {
    IDNamedMemberImpl idNamedMember = new IDNamedMemberImpl();
    return idNamedMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringNamedMember createStringNamedMember()
  {
    StringNamedMemberImpl stringNamedMember = new StringNamedMemberImpl();
    return stringNamedMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WrapWithMember createWrapWithMember()
  {
    WrapWithMemberImpl wrapWithMember = new WrapWithMemberImpl();
    return wrapWithMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMember createSimpleMember()
  {
    SimpleMemberImpl simpleMember = new SimpleMemberImpl();
    return simpleMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDNamedSimpleMember createIDNamedSimpleMember()
  {
    IDNamedSimpleMemberImpl idNamedSimpleMember = new IDNamedSimpleMemberImpl();
    return idNamedSimpleMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringNamedSimpleMember createStringNamedSimpleMember()
  {
    StringNamedSimpleMemberImpl stringNamedSimpleMember = new StringNamedSimpleMemberImpl();
    return stringNamedSimpleMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericListType createGenericListType()
  {
    GenericListTypeImpl genericListType = new GenericListTypeImpl();
    return genericListType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserType createUserType()
  {
    UserTypeImpl userType = new UserTypeImpl();
    return userType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserTypeDeclaration createUserTypeDeclaration()
  {
    UserTypeDeclarationImpl userTypeDeclaration = new UserTypeDeclarationImpl();
    return userTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexTypeDeclaration createComplexTypeDeclaration()
  {
    ComplexTypeDeclarationImpl complexTypeDeclaration = new ComplexTypeDeclarationImpl();
    return complexTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTypeDeclaration createEnumTypeDeclaration()
  {
    EnumTypeDeclarationImpl enumTypeDeclaration = new EnumTypeDeclarationImpl();
    return enumTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTypeLiteral createEnumTypeLiteral()
  {
    EnumTypeLiteralImpl enumTypeLiteral = new EnumTypeLiteralImpl();
    return enumTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMember createEnumMember()
  {
    EnumMemberImpl enumMember = new EnumMemberImpl();
    return enumMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexTypeLiteral createComplexTypeLiteral()
  {
    ComplexTypeLiteralImpl complexTypeLiteral = new ComplexTypeLiteralImpl();
    return complexTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntrinsicType createIntrinsicType()
  {
    IntrinsicTypeImpl intrinsicType = new IntrinsicTypeImpl();
    return intrinsicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateType createDateType()
  {
    DateTypeImpl dateType = new DateTypeImpl();
    return dateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericType createNumericType()
  {
    NumericTypeImpl numericType = new NumericTypeImpl();
    return numericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerType createIntegerType()
  {
    IntegerTypeImpl integerType = new IntegerTypeImpl();
    return integerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongType createLongType()
  {
    LongTypeImpl longType = new LongTypeImpl();
    return longType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleType createDoubleType()
  {
    DoubleTypeImpl doubleType = new DoubleTypeImpl();
    return doubleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetModelPackage getNetModelPackage()
  {
    return (NetModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NetModelPackage getPackage()
  {
    return NetModelPackage.eINSTANCE;
  }

} //NetModelFactoryImpl
