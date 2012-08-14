/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ArrayType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ArrayType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(Type)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getArrayType_ElementType()
   * @model containment="true"
   * @generated
   */
  Type getElementType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.ArrayType#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(Type value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getArrayType_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.ArrayType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // ArrayType
