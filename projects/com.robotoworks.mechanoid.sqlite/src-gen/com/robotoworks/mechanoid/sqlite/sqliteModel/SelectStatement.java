/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCoreStatements <em>Core Statements</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Core Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core Statements</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement_CoreStatements()
   * @model containment="true"
   * @generated
   */
  EList<SelectCore> getCoreStatements();

  /**
   * Returns the value of the '<em><b>Ordering Terms</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering Terms</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement_OrderingTerms()
   * @model containment="true"
   * @generated
   */
  EList<OrderingTerm> getOrderingTerms();

} // SelectStatement
