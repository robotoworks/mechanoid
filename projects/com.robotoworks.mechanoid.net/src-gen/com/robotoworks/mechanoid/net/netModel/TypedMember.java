/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.TypedMember#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getTypedMember()
 * @model
 * @generated
 */
public interface TypedMember extends Member
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getTypedMember_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.TypedMember#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // TypedMember
