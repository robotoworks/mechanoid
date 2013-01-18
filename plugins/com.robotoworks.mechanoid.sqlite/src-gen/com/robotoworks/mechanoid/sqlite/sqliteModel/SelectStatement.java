/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCore <em>Core</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends DMLStatement
{
  /**
   * Returns the value of the '<em><b>Core</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core</em>' containment reference.
   * @see #setCore(SelectCoreExpression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement_Core()
   * @model containment="true"
   * @generated
   */
  SelectCoreExpression getCore();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCore <em>Core</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Core</em>' containment reference.
   * @see #getCore()
   * @generated
   */
  void setCore(SelectCoreExpression value);

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
