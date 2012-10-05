/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage
 * @generated
 */
public interface NetModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NetModelFactory eINSTANCE = com.robotoworks.mechanoid.net.netModel.impl.NetModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Client</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Client</em>'.
   * @generated
   */
  Client createClient();

  /**
   * Returns a new object of class '<em>Http Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Method</em>'.
   * @generated
   */
  HttpMethod createHttpMethod();

  /**
   * Returns a new object of class '<em>Http Post</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Post</em>'.
   * @generated
   */
  HttpPost createHttpPost();

  /**
   * Returns a new object of class '<em>Http Put</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Put</em>'.
   * @generated
   */
  HttpPut createHttpPut();

  /**
   * Returns a new object of class '<em>Http Get</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Get</em>'.
   * @generated
   */
  HttpGet createHttpGet();

  /**
   * Returns a new object of class '<em>Http Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Delete</em>'.
   * @generated
   */
  HttpDelete createHttpDelete();

  /**
   * Returns a new object of class '<em>Params Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Params Block</em>'.
   * @generated
   */
  ParamsBlock createParamsBlock();

  /**
   * Returns a new object of class '<em>Body Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Block</em>'.
   * @generated
   */
  BodyBlock createBodyBlock();

  /**
   * Returns a new object of class '<em>Response Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Response Block</em>'.
   * @generated
   */
  ResponseBlock createResponseBlock();

  /**
   * Returns a new object of class '<em>Block Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Type</em>'.
   * @generated
   */
  BlockType createBlockType();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Typed Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Member</em>'.
   * @generated
   */
  TypedMember createTypedMember();

  /**
   * Returns a new object of class '<em>ID Named Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Named Member</em>'.
   * @generated
   */
  IDNamedMember createIDNamedMember();

  /**
   * Returns a new object of class '<em>String Named Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Named Member</em>'.
   * @generated
   */
  StringNamedMember createStringNamedMember();

  /**
   * Returns a new object of class '<em>Skip Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skip Member</em>'.
   * @generated
   */
  SkipMember createSkipMember();

  /**
   * Returns a new object of class '<em>Simple Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Member</em>'.
   * @generated
   */
  SimpleMember createSimpleMember();

  /**
   * Returns a new object of class '<em>ID Named Simple Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Named Simple Member</em>'.
   * @generated
   */
  IDNamedSimpleMember createIDNamedSimpleMember();

  /**
   * Returns a new object of class '<em>String Named Simple Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Named Simple Member</em>'.
   * @generated
   */
  StringNamedSimpleMember createStringNamedSimpleMember();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Generic List Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic List Type</em>'.
   * @generated
   */
  GenericListType createGenericListType();

  /**
   * Returns a new object of class '<em>User Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Type</em>'.
   * @generated
   */
  UserType createUserType();

  /**
   * Returns a new object of class '<em>User Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Type Declaration</em>'.
   * @generated
   */
  UserTypeDeclaration createUserTypeDeclaration();

  /**
   * Returns a new object of class '<em>Complex Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type Declaration</em>'.
   * @generated
   */
  ComplexTypeDeclaration createComplexTypeDeclaration();

  /**
   * Returns a new object of class '<em>Enum Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type Declaration</em>'.
   * @generated
   */
  EnumTypeDeclaration createEnumTypeDeclaration();

  /**
   * Returns a new object of class '<em>Enum Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type Literal</em>'.
   * @generated
   */
  EnumTypeLiteral createEnumTypeLiteral();

  /**
   * Returns a new object of class '<em>Enum Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Member</em>'.
   * @generated
   */
  EnumMember createEnumMember();

  /**
   * Returns a new object of class '<em>Complex Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type Literal</em>'.
   * @generated
   */
  ComplexTypeLiteral createComplexTypeLiteral();

  /**
   * Returns a new object of class '<em>Intrinsic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intrinsic Type</em>'.
   * @generated
   */
  IntrinsicType createIntrinsicType();

  /**
   * Returns a new object of class '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Type</em>'.
   * @generated
   */
  StringType createStringType();

  /**
   * Returns a new object of class '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Type</em>'.
   * @generated
   */
  BooleanType createBooleanType();

  /**
   * Returns a new object of class '<em>Numeric Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Type</em>'.
   * @generated
   */
  NumericType createNumericType();

  /**
   * Returns a new object of class '<em>Integer Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Type</em>'.
   * @generated
   */
  IntegerType createIntegerType();

  /**
   * Returns a new object of class '<em>Long Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Type</em>'.
   * @generated
   */
  LongType createLongType();

  /**
   * Returns a new object of class '<em>Double Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Type</em>'.
   * @generated
   */
  DoubleType createDoubleType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NetModelPackage getNetModelPackage();

} //NetModelFactory
