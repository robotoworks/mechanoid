/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Source Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSingleSourceSelectStatement()
 * @model
 * @generated
 */
public interface SingleSourceSelectStatement extends SelectSource
{
  /**
   * Returns the value of the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Statement</em>' containment reference.
   * @see #setSelectStatement(SelectStatement)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSingleSourceSelectStatement_SelectStatement()
   * @model containment="true"
   * @generated
   */
  SelectStatement getSelectStatement();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement#getSelectStatement <em>Select Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Statement</em>' containment reference.
   * @see #getSelectStatement()
   * @generated
   */
  void setSelectStatement(SelectStatement value);

} // SingleSourceSelectStatement
