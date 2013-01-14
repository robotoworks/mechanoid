/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getResponseBlock()
 * @model
 * @generated
 */
public interface ResponseBlock extends HttpMethodBlock
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ComplexTypeDeclaration)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getResponseBlock_SuperType()
   * @model
   * @generated
   */
  ComplexTypeDeclaration getSuperType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ComplexTypeDeclaration value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(BlockType)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getResponseBlock_Type()
   * @model containment="true"
   * @generated
   */
  BlockType getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.ResponseBlock#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(BlockType value);

} // ResponseBlock
