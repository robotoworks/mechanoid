/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.Client#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.Client#getHeaders <em>Headers</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.Client#getParams <em>Params</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.Client#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Declaration
{
  /**
   * Returns the value of the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Url</em>' attribute.
   * @see #setBaseUrl(String)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getClient_BaseUrl()
   * @model
   * @generated
   */
  String getBaseUrl();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.Client#getBaseUrl <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Url</em>' attribute.
   * @see #getBaseUrl()
   * @generated
   */
  void setBaseUrl(String value);

  /**
   * Returns the value of the '<em><b>Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headers</em>' containment reference.
   * @see #setHeaders(HeaderBlock)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getClient_Headers()
   * @model containment="true"
   * @generated
   */
  HeaderBlock getHeaders();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.Client#getHeaders <em>Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Headers</em>' containment reference.
   * @see #getHeaders()
   * @generated
   */
  void setHeaders(HeaderBlock value);

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
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getClient_Params()
   * @model containment="true"
   * @generated
   */
  ParamsBlock getParams();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.Client#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(ParamsBlock value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.net.netModel.HttpMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getClient_Methods()
   * @model containment="true"
   * @generated
   */
  EList<HttpMethod> getMethods();

} // Client
