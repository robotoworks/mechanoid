/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getType <em>Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getPath <em>Path</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod()
 * @model
 * @generated
 */
public interface HttpMethod extends ClientBlock
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.net.netModel.HttpMethodType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethodType
   * @see #setType(HttpMethodType)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Type()
   * @model
   * @generated
   */
  HttpMethodType getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.net.netModel.HttpMethodType
   * @see #getType()
   * @generated
   */
  void setType(HttpMethodType value);

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
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Path)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Path()
   * @model containment="true"
   * @generated
   */
  Path getPath();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Path value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.net.netModel.HttpMethodBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<HttpMethodBlock> getBlocks();

} // HttpMethod
