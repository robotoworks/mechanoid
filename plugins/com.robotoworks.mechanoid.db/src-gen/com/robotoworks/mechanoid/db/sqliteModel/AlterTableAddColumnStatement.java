/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter Table Add Column Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getColumnDef <em>Column Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getAlterTableAddColumnStatement()
 * @model
 * @generated
 */
public interface AlterTableAddColumnStatement extends DDLStatement
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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getAlterTableAddColumnStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

  /**
   * Returns the value of the '<em><b>Column Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Def</em>' containment reference.
   * @see #setColumnDef(ColumnSource)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getAlterTableAddColumnStatement_ColumnDef()
   * @model containment="true"
   * @generated
   */
  ColumnSource getColumnDef();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getColumnDef <em>Column Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Def</em>' containment reference.
   * @see #getColumnDef()
   * @generated
   */
  void setColumnDef(ColumnSource value);

} // AlterTableAddColumnStatement
