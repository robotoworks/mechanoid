/**
 */
package com.robotoworks.mechanoid.net.netModel.impl;

import com.robotoworks.mechanoid.net.netModel.HttpMethod;
import com.robotoworks.mechanoid.net.netModel.HttpMethodBlock;
import com.robotoworks.mechanoid.net.netModel.HttpMethodType;
import com.robotoworks.mechanoid.net.netModel.NetModelPackage;
import com.robotoworks.mechanoid.net.netModel.Path;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.impl.HttpMethodImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpMethodImpl extends ClientBlockImpl implements HttpMethod
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final HttpMethodType TYPE_EDEFAULT = HttpMethodType.GET;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected HttpMethodType type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected Path path;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<HttpMethodBlock> blocks;

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
  public HttpMethodType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(HttpMethodType newType)
  {
    HttpMethodType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__TYPE, oldType, type));
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
  public Path getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(Path newPath, NotificationChain msgs)
  {
    Path oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(Path newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetModelPackage.HTTP_METHOD__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetModelPackage.HTTP_METHOD__PATH, newPath, newPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HttpMethodBlock> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<HttpMethodBlock>(HttpMethodBlock.class, this, NetModelPackage.HTTP_METHOD__BLOCKS);
    }
    return blocks;
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
      case NetModelPackage.HTTP_METHOD__PATH:
        return basicSetPath(null, msgs);
      case NetModelPackage.HTTP_METHOD__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
      case NetModelPackage.HTTP_METHOD__TYPE:
        return getType();
      case NetModelPackage.HTTP_METHOD__NAME:
        return getName();
      case NetModelPackage.HTTP_METHOD__PATH:
        return getPath();
      case NetModelPackage.HTTP_METHOD__BLOCKS:
        return getBlocks();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NetModelPackage.HTTP_METHOD__TYPE:
        setType((HttpMethodType)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__NAME:
        setName((String)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__PATH:
        setPath((Path)newValue);
        return;
      case NetModelPackage.HTTP_METHOD__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends HttpMethodBlock>)newValue);
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
      case NetModelPackage.HTTP_METHOD__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case NetModelPackage.HTTP_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NetModelPackage.HTTP_METHOD__PATH:
        setPath((Path)null);
        return;
      case NetModelPackage.HTTP_METHOD__BLOCKS:
        getBlocks().clear();
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
      case NetModelPackage.HTTP_METHOD__TYPE:
        return type != TYPE_EDEFAULT;
      case NetModelPackage.HTTP_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NetModelPackage.HTTP_METHOD__PATH:
        return path != null;
      case NetModelPackage.HTTP_METHOD__BLOCKS:
        return blocks != null && !blocks.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HttpMethodImpl
