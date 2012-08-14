/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.SimpleMember#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.SimpleMember#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getSimpleMember()
 * @model
 * @generated
 */
public interface SimpleMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getSimpleMember_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.SimpleMember#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(IntrinsicType)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getSimpleMember_Type()
   * @model containment="true"
   * @generated
   */
  IntrinsicType getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.SimpleMember#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(IntrinsicType value);

} // SimpleMember
