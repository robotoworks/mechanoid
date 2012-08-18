/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.GenericListType#getId <em>Id</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.GenericListType#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getGenericListType()
 * @model
 * @generated
 */
public interface GenericListType extends Type
{
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
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getGenericListType_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.GenericListType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Generic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Type</em>' containment reference.
   * @see #setGenericType(Type)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getGenericListType_GenericType()
   * @model containment="true"
   * @generated
   */
  Type getGenericType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.GenericListType#getGenericType <em>Generic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type</em>' containment reference.
   * @see #getGenericType()
   * @generated
   */
  void setGenericType(Type value);

} // GenericListType
