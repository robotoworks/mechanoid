/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Term List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getOrderingTermList()
 * @model
 * @generated
 */
public interface OrderingTermList extends EObject
{
  /**
   * Returns the value of the '<em><b>Ordering Terms</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering Terms</em>' containment reference list.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getOrderingTermList_OrderingTerms()
   * @model containment="true"
   * @generated
   */
  EList<OrderingTerm> getOrderingTerms();

} // OrderingTermList
