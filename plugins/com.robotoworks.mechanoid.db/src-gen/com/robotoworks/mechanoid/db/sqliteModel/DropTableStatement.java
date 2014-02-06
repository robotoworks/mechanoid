/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#isIfExists <em>If Exists</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDropTableStatement()
 * @model
 * @generated
 */
public interface DropTableStatement extends DDLStatement
{
  /**
   * Returns the value of the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Exists</em>' attribute.
   * @see #setIfExists(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDropTableStatement_IfExists()
   * @model
   * @generated
   */
  boolean isIfExists();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#isIfExists <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Exists</em>' attribute.
   * @see #isIfExists()
   * @generated
   */
  void setIfExists(boolean value);

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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDropTableStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

} // DropTableStatement
