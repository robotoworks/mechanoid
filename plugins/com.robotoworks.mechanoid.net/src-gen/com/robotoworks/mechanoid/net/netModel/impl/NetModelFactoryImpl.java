/**
 */
package com.robotoworks.mechanoid.net.netModel.impl;

import com.robotoworks.mechanoid.net.netModel.*;

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
      NetModelFactory theNetModelFactory = (NetModelFactory)EPackage.Registry.INSTANCE.getEFactory(NetModelPackage.eNS_URI);
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
      case NetModelPackage.CLIENT_BLOCK: return createClientBlock();
      case NetModelPackage.HEADER_BLOCK: return createHeaderBlock();
      case NetModelPackage.HEADER: return createHeader();
      case NetModelPackage.HTTP_METHOD: return createHttpMethod();
      case NetModelPackage.HTTP_METHOD_BLOCK: return createHttpMethodBlock();
      case NetModelPackage.PATH: return createPath();
      case NetModelPackage.PARAMS_BLOCK: return createParamsBlock();
      case NetModelPackage.SIMPLE_MEMBER_ASSIGNMENT: return createSimpleMemberAssignment();
      case NetModelPackage.LITERAL: return createLiteral();
      case NetModelPackage.BODY_BLOCK: return createBodyBlock();
      case NetModelPackage.RESPONSE_BLOCK: return createResponseBlock();
      case NetModelPackage.BLOCK_TYPE: return createBlockType();
      case NetModelPackage.MEMBER: return createMember();
      case NetModelPackage.TYPED_MEMBER: return createTypedMember();
      case NetModelPackage.SKIP_MEMBER: return createSkipMember();
      case NetModelPackage.SIMPLE_MEMBER: return createSimpleMember();
      case NetModelPackage.TYPE: return createType();
      case NetModelPackage.GENERIC_LIST_TYPE: return createGenericListType();
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
      case NetModelPackage.NUMERIC_TYPE: return createNumericType();
      case NetModelPackage.INTEGER_TYPE: return createIntegerType();
      case NetModelPackage.LONG_TYPE: return createLongType();
      case NetModelPackage.DOUBLE_TYPE: return createDoubleType();
      case NetModelPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case NetModelPackage.STRING_LITERAL: return createStringLiteral();
      case NetModelPackage.NUMERIC_LITERAL: return createNumericLiteral();
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
      case NetModelPackage.HTTP_METHOD_TYPE:
        return createHttpMethodTypeFromString(eDataType, initialValue);
      case NetModelPackage.BOOLEAN_VALUE:
        return createBooleanValueFromString(eDataType, initialValue);
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
      case NetModelPackage.HTTP_METHOD_TYPE:
        return convertHttpMethodTypeToString(eDataType, instanceValue);
      case NetModelPackage.BOOLEAN_VALUE:
        return convertBooleanValueToString(eDataType, instanceValue);
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
  public ClientBlock createClientBlock()
  {
    ClientBlockImpl clientBlock = new ClientBlockImpl();
    return clientBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderBlock createHeaderBlock()
  {
    HeaderBlockImpl headerBlock = new HeaderBlockImpl();
    return headerBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
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
  public HttpMethodBlock createHttpMethodBlock()
  {
    HttpMethodBlockImpl httpMethodBlock = new HttpMethodBlockImpl();
    return httpMethodBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
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
  public SimpleMemberAssignment createSimpleMemberAssignment()
  {
    SimpleMemberAssignmentImpl simpleMemberAssignment = new SimpleMemberAssignmentImpl();
    return simpleMemberAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
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
  public SkipMember createSkipMember()
  {
    SkipMemberImpl skipMember = new SkipMemberImpl();
    return skipMember;
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
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethodType createHttpMethodTypeFromString(EDataType eDataType, String initialValue)
  {
    HttpMethodType result = HttpMethodType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHttpMethodTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValueFromString(EDataType eDataType, String initialValue)
  {
    BooleanValue result = BooleanValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
