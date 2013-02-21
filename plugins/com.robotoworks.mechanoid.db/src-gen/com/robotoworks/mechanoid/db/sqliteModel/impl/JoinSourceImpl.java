/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.db.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinSourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinSourceImpl#getJoinStatements <em>Join Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinSourceImpl extends MinimalEObjectImpl.Container implements JoinSource
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected SingleSource source;

  /**
   * The cached value of the '{@link #getJoinStatements() <em>Join Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinStatements()
   * @generated
   * @ordered
   */
  protected EList<JoinStatement> joinStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinSourceImpl()
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
    return SqliteModelPackage.Literals.JOIN_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSource getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(SingleSource newSource, NotificationChain msgs)
  {
    SingleSource oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_SOURCE__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(SingleSource newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.JOIN_SOURCE__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.JOIN_SOURCE__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_SOURCE__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinStatement> getJoinStatements()
  {
    if (joinStatements == null)
    {
      joinStatements = new EObjectContainmentEList<JoinStatement>(JoinStatement.class, this, SqliteModelPackage.JOIN_SOURCE__JOIN_STATEMENTS);
    }
    return joinStatements;
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
      case SqliteModelPackage.JOIN_SOURCE__SOURCE:
        return basicSetSource(null, msgs);
      case SqliteModelPackage.JOIN_SOURCE__JOIN_STATEMENTS:
        return ((InternalEList<?>)getJoinStatements()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.JOIN_SOURCE__SOURCE:
        return getSource();
      case SqliteModelPackage.JOIN_SOURCE__JOIN_STATEMENTS:
        return getJoinStatements();
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
      case SqliteModelPackage.JOIN_SOURCE__SOURCE:
        setSource((SingleSource)newValue);
        return;
      case SqliteModelPackage.JOIN_SOURCE__JOIN_STATEMENTS:
        getJoinStatements().clear();
        getJoinStatements().addAll((Collection<? extends JoinStatement>)newValue);
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
      case SqliteModelPackage.JOIN_SOURCE__SOURCE:
        setSource((SingleSource)null);
        return;
      case SqliteModelPackage.JOIN_SOURCE__JOIN_STATEMENTS:
        getJoinStatements().clear();
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
      case SqliteModelPackage.JOIN_SOURCE__SOURCE:
        return source != null;
      case SqliteModelPackage.JOIN_SOURCE__JOIN_STATEMENTS:
        return joinStatements != null && !joinStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JoinSourceImpl
