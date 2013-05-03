/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getCore <em>Core</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getOrderby <em>Orderby</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimit <em>Limit</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimitOffset <em>Limit Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatement()
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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatement_Core()
   * @model containment="true"
   * @generated
   */
  SelectCoreExpression getCore();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getCore <em>Core</em>}' containment reference.
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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatement_Orderby()
   * @model containment="true"
   * @generated
   */
  OrderingTermList getOrderby();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getOrderby <em>Orderby</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orderby</em>' containment reference.
   * @see #getOrderby()
   * @generated
   */
  void setOrderby(OrderingTermList value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(Expression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatement_Limit()
   * @model containment="true"
   * @generated
   */
  Expression getLimit();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(Expression value);

  /**
   * Returns the value of the '<em><b>Limit Offset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit Offset</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit Offset</em>' containment reference.
   * @see #setLimitOffset(Expression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatement_LimitOffset()
   * @model containment="true"
   * @generated
   */
  Expression getLimitOffset();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimitOffset <em>Limit Offset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit Offset</em>' containment reference.
   * @see #getLimitOffset()
   * @generated
   */
  void setLimitOffset(Expression value);

} // SelectStatement
