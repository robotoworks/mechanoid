/**
 */
package com.robotoworks.mechanoid.net.netModel.util;

import com.robotoworks.mechanoid.net.netModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage
 * @generated
 */
public class NetModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NetModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NetModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetModelSwitch<Adapter> modelSwitch =
    new NetModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseClient(Client object)
      {
        return createClientAdapter();
      }
      @Override
      public Adapter caseClientBlock(ClientBlock object)
      {
        return createClientBlockAdapter();
      }
      @Override
      public Adapter caseHeaderBlock(HeaderBlock object)
      {
        return createHeaderBlockAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseHttpMethod(HttpMethod object)
      {
        return createHttpMethodAdapter();
      }
      @Override
      public Adapter caseHttpMethodBlock(HttpMethodBlock object)
      {
        return createHttpMethodBlockAdapter();
      }
      @Override
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter caseParamsBlock(ParamsBlock object)
      {
        return createParamsBlockAdapter();
      }
      @Override
      public Adapter caseSimpleMemberAssignment(SimpleMemberAssignment object)
      {
        return createSimpleMemberAssignmentAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseBodyBlock(BodyBlock object)
      {
        return createBodyBlockAdapter();
      }
      @Override
      public Adapter caseResponseBlock(ResponseBlock object)
      {
        return createResponseBlockAdapter();
      }
      @Override
      public Adapter caseBlockType(BlockType object)
      {
        return createBlockTypeAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseTypedMember(TypedMember object)
      {
        return createTypedMemberAdapter();
      }
      @Override
      public Adapter caseSkipMember(SkipMember object)
      {
        return createSkipMemberAdapter();
      }
      @Override
      public Adapter caseSimpleMember(SimpleMember object)
      {
        return createSimpleMemberAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseGenericListType(GenericListType object)
      {
        return createGenericListTypeAdapter();
      }
      @Override
      public Adapter caseUserType(UserType object)
      {
        return createUserTypeAdapter();
      }
      @Override
      public Adapter caseUserTypeDeclaration(UserTypeDeclaration object)
      {
        return createUserTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseComplexTypeDeclaration(ComplexTypeDeclaration object)
      {
        return createComplexTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseEnumTypeDeclaration(EnumTypeDeclaration object)
      {
        return createEnumTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseEnumTypeLiteral(EnumTypeLiteral object)
      {
        return createEnumTypeLiteralAdapter();
      }
      @Override
      public Adapter caseEnumMember(EnumMember object)
      {
        return createEnumMemberAdapter();
      }
      @Override
      public Adapter caseComplexTypeLiteral(ComplexTypeLiteral object)
      {
        return createComplexTypeLiteralAdapter();
      }
      @Override
      public Adapter caseIntrinsicType(IntrinsicType object)
      {
        return createIntrinsicTypeAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseBooleanType(BooleanType object)
      {
        return createBooleanTypeAdapter();
      }
      @Override
      public Adapter caseNumericType(NumericType object)
      {
        return createNumericTypeAdapter();
      }
      @Override
      public Adapter caseIntegerType(IntegerType object)
      {
        return createIntegerTypeAdapter();
      }
      @Override
      public Adapter caseLongType(LongType object)
      {
        return createLongTypeAdapter();
      }
      @Override
      public Adapter caseDoubleType(DoubleType object)
      {
        return createDoubleTypeAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Client <em>Client</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Client
   * @generated
   */
  public Adapter createClientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.ClientBlock <em>Client Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.ClientBlock
   * @generated
   */
  public Adapter createClientBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.HeaderBlock <em>Header Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.HeaderBlock
   * @generated
   */
  public Adapter createHeaderBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod <em>Http Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethod
   * @generated
   */
  public Adapter createHttpMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.HttpMethodBlock <em>Http Method Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethodBlock
   * @generated
   */
  public Adapter createHttpMethodBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.ParamsBlock <em>Params Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.ParamsBlock
   * @generated
   */
  public Adapter createParamsBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment <em>Simple Member Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment
   * @generated
   */
  public Adapter createSimpleMemberAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.BodyBlock <em>Body Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.BodyBlock
   * @generated
   */
  public Adapter createBodyBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock <em>Response Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.ResponseBlock
   * @generated
   */
  public Adapter createResponseBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.BlockType <em>Block Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.BlockType
   * @generated
   */
  public Adapter createBlockTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.TypedMember <em>Typed Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.TypedMember
   * @generated
   */
  public Adapter createTypedMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.SkipMember <em>Skip Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.SkipMember
   * @generated
   */
  public Adapter createSkipMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.SimpleMember <em>Simple Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.SimpleMember
   * @generated
   */
  public Adapter createSimpleMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.GenericListType <em>Generic List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.GenericListType
   * @generated
   */
  public Adapter createGenericListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.UserType <em>User Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.UserType
   * @generated
   */
  public Adapter createUserTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration <em>User Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration
   * @generated
   */
  public Adapter createUserTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration <em>Complex Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration
   * @generated
   */
  public Adapter createComplexTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration <em>Enum Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeDeclaration
   * @generated
   */
  public Adapter createEnumTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral <em>Enum Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral
   * @generated
   */
  public Adapter createEnumTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.EnumMember
   * @generated
   */
  public Adapter createEnumMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral <em>Complex Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral
   * @generated
   */
  public Adapter createComplexTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.IntrinsicType <em>Intrinsic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.IntrinsicType
   * @generated
   */
  public Adapter createIntrinsicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.BooleanType
   * @generated
   */
  public Adapter createBooleanTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.NumericType <em>Numeric Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.NumericType
   * @generated
   */
  public Adapter createNumericTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.IntegerType <em>Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.IntegerType
   * @generated
   */
  public Adapter createIntegerTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.LongType <em>Long Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.LongType
   * @generated
   */
  public Adapter createLongTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.DoubleType
   * @generated
   */
  public Adapter createDoubleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.net.netModel.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.net.netModel.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NetModelAdapterFactory
