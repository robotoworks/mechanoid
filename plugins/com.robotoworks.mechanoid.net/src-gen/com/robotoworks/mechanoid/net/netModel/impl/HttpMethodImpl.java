/**
 */
package com.robotoworks.mechanoid.net.netModel.impl;

import com.robotoworks.mechanoid.net.netModel.HeaderBlock;
import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.ParamsBlock;
import com.robotoworks.mechanoid.net.netModel.ResponseBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpMethodImpl extends MinimalEObjectImpl.Container implements HttpMethod
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected HeaderBlock headers;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected ParamsBlock params;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected ResponseBlock response;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HttpMethodImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NetModelPackage.Literals.HTTP_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderBlock getHeaders()
  {
    return headers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeaders(HeaderBlock newHeaders, NotificationChain msgs)
  {
    HeaderBlock oldHeaders = headers;
    headers = newHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__HEADERS, oldHeaders, newHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeaders(HeaderBlock newHeaders)
  {
    if (newHeaders != headers)
    {
      NotificationChain msgs = null;
      if (headers != null)
        msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__HEADERS, null, msgs);
      if (newHeaders != null)
        msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__HEADERS, null, msgs);
      msgs = basicSetHeaders(newHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__HEADERS, newHeaders, newHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamsBlock getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(ParamsBlock newParams, NotificationChain msgs)
  {
    ParamsBlock oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__PARAMS, oldParams, newParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(ParamsBlock newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseBlock getResponse()
  {
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponse(ResponseBlock newResponse, NotificationChain msgs)
  {
    ResponseBlock oldResponse = response;
    response = newResponse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__RESPONSE, oldResponse, newResponse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse(ResponseBlock newResponse)
  {
    if (newResponse != response)
    {
      NotificationChain msgs = null;
      if (response != null)
        msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__RESPONSE, null, msgs);
      if (newResponse != null)
        msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__RESPONSE, null, msgs);
      msgs = basicSetResponse(newResponse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__RESPONSE, newResponse, newResponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NetModelPackage.HTTP_METHOD__HEADERS:
        return basicSetHeaders(null, msgs);
      case NetModelPackage.HTTP_METHOD__PARAMS:
        return basicSetParams(null, msgs);
      case NetModelPackage.HTTP_METHOD__RESPONSE:
        return basicSetResponse(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NetModelPackage.HTTP_METHOD__NAME:
        return getName();
      case NetModelPackage.HTTP_METHOD__PATH:
        return getPath();
      case NetModelPackage.HTTP_METHOD__HEADERS:
        return getHeaders();
      case NetModelPackage.HTTP_METHOD__PARAMS:
        return getParams();
      case NetModelPackage.HTTP_METHOD__RESPONSE:
        return getResponse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NetModelPackage.HTTP_METHOD__NAME:
        setName((String)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__PATH:
        setPath((String)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__HEADERS:
        setHeaders((HeaderBlock)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__PARAMS:
        setParams((ParamsBlock)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__RESPONSE:
        setResponse((ResponseBlock)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NetModelPackage.HTTP_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NetModelPackage.HTTP_METHOD__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case NetModelPackage.HTTP_METHOD__HEADERS:
        setHeaders((HeaderBlock)null);
        return;
      case NetModelPackage.HTTP_METHOD__PARAMS:
        setParams((ParamsBlock)null);
        return;
      case NetModelPackage.HTTP_METHOD__RESPONSE:
        setResponse((ResponseBlock)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NetModelPackage.HTTP_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NetModelPackage.HTTP_METHOD__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case NetModelPackage.HTTP_METHOD__HEADERS:
        return headers != null;
      case NetModelPackage.HTTP_METHOD__PARAMS:
        return params != null;
      case NetModelPackage.HTTP_METHOD__RESPONSE:
        return response != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //HttpMethodImpl
