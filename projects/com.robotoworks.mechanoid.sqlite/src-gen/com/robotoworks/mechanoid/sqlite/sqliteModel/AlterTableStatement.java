/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getAlterTableStatement()
 * @model
 * @generated
 */
public interface AlterTableStatement extends Statment
{
  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(AlterTableClause)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getAlterTableStatement_Clause()
   * @model containment="true"
   * @generated
   */
  AlterTableClause getClause();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(AlterTableClause value);

} // AlterTableStatement
