/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCore <em>Core</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getOrderby <em>Orderby</em>}</li>
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
   * Returns the value of the '<em><b>Orderby</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orderby</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orderby</em>' containment reference.
   * @see #setOrderby(OrderingTermList)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement_Orderby()
   * @model containment="true"
   * @generated
   */
  OrderingTermList getOrderby();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getOrderby <em>Orderby</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orderby</em>' containment reference.
   * @see #getOrderby()
   * @generated
   */
  void setOrderby(OrderingTermList value);

} // SelectStatement
