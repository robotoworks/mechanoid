/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.db.sqliteModel.SelectList;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectListImpl#getResultColumns <em>Result Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectListImpl extends MinimalEObjectImpl.Container implements SelectList
{
  /**
   * The cached value of the '{@link #getResultColumns() <em>Result Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultColumns()
   * @generated
   * @ordered
   */
  protected EList<ColumnSource> resultColumns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectListImpl()
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
    return SqliteModelPackage.Literals.SELECT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColumnSource> getResultColumns()
  {
    if (resultColumns == null)
    {
      resultColumns = new EObjectContainmentEList<ColumnSource>(ColumnSource.class, this, SqliteModelPackage.SELECT_LIST__RESULT_COLUMNS);
    }
    return resultColumns;
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
      case SqliteModelPackage.SELECT_LIST__RESULT_COLUMNS:
        return ((InternalEList<?>)getResultColumns()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.SELECT_LIST__RESULT_COLUMNS:
        return getResultColumns();
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
      case SqliteModelPackage.SELECT_LIST__RESULT_COLUMNS:
        getResultColumns().clear();
        getResultColumns().addAll((Collection<? extends ColumnSource>)newValue);
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
      case SqliteModelPackage.SELECT_LIST__RESULT_COLUMNS:
        getResultColumns().clear();
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
      case SqliteModelPackage.SELECT_LIST__RESULT_COLUMNS:
        return resultColumns != null && !resultColumns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectListImpl
