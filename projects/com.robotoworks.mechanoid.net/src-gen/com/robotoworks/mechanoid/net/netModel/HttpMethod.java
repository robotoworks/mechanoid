/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getPath <em>Path</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getParams <em>Params</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod()
 * @model
 * @generated
 */
public interface HttpMethod extends EObject
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
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(ParamsBlock)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Params()
   * @model containment="true"
   * @generated
   */
  ParamsBlock getParams();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(ParamsBlock value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' containment reference.
   * @see #setResponse(ResponseBlock)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getHttpMethod_Response()
   * @model containment="true"
   * @generated
   */
  ResponseBlock getResponse();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.HttpMethod#getResponse <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' containment reference.
   * @see #getResponse()
   * @generated
   */
  void setResponse(ResponseBlock value);

} // HttpMethod
