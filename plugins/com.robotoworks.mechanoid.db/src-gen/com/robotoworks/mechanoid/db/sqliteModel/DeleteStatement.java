/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDeleteStatement()
 * @model
 * @generated
 */
public interface DeleteStatement extends DMLStatement
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(TableDefinition)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDeleteStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDeleteStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // DeleteStatement
