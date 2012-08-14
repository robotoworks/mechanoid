/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

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
 * An implementation of the model object '<em><b>Select Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl#getResultColumns <em>Result Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectCoreImpl extends MinimalEObjectImpl.Container implements SelectCore
{
  /**
   * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinct()
   * @generated
   * @ordered
   */
  protected static final boolean DISTINCT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinct()
   * @generated
   * @ordered
   */
  protected boolean distinct = DISTINCT_EDEFAULT;

  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getResultColumns() <em>Result Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultColumns()
   * @generated
   * @ordered
   */
  protected EList<ResultColumn> resultColumns;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected JoinSource source;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectCoreImpl()
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
    return SqliteModelPackage.Literals.SELECT_CORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistinct()
  {
    return distinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistinct(boolean newDistinct)
  {
    boolean oldDistinct = distinct;
    distinct = newDistinct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE__DISTINCT, oldDistinct, distinct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResultColumn> getResultColumns()
  {
    if (resultColumns == null)
    {
      resultColumns = new EObjectContainmentEList<ResultColumn>(ResultColumn.class, this, SqliteModelPackage.SELECT_CORE__RESULT_COLUMNS);
    }
    return resultColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(JoinSource newSource, NotificationChain msgs)
  {
    JoinSource oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(JoinSource newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE__SOURCE, newSource, newSource));
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
      case SqliteModelPackage.SELECT_CORE__RESULT_COLUMNS:
        return ((InternalEList<?>)getResultColumns()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.SELECT_CORE__SOURCE:
        return basicSetSource(null, msgs);
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
      case SqliteModelPackage.SELECT_CORE__DISTINCT:
        return isDistinct();
      case SqliteModelPackage.SELECT_CORE__ALL:
        return isAll();
      case SqliteModelPackage.SELECT_CORE__RESULT_COLUMNS:
        return getResultColumns();
      case SqliteModelPackage.SELECT_CORE__SOURCE:
        return getSource();
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
      case SqliteModelPackage.SELECT_CORE__DISTINCT:
        setDistinct((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE__ALL:
        setAll((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE__RESULT_COLUMNS:
        getResultColumns().clear();
        getResultColumns().addAll((Collection<? extends ResultColumn>)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE__SOURCE:
        setSource((JoinSource)newValue);
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
      case SqliteModelPackage.SELECT_CORE__DISTINCT:
        setDistinct(DISTINCT_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_CORE__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_CORE__RESULT_COLUMNS:
        getResultColumns().clear();
        return;
      case SqliteModelPackage.SELECT_CORE__SOURCE:
        setSource((JoinSource)null);
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
      case SqliteModelPackage.SELECT_CORE__DISTINCT:
        return distinct != DISTINCT_EDEFAULT;
      case SqliteModelPackage.SELECT_CORE__ALL:
        return all != ALL_EDEFAULT;
      case SqliteModelPackage.SELECT_CORE__RESULT_COLUMNS:
        return resultColumns != null && !resultColumns.isEmpty();
      case SqliteModelPackage.SELECT_CORE__SOURCE:
        return source != null;
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
    result.append(" (distinct: ");
    result.append(distinct);
    result.append(", all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //SelectCoreImpl
