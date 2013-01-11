/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter Table Add Column Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause#getColumnDef <em>Column Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getAlterTableAddColumnClause()
 * @model
 * @generated
 */
public interface AlterTableAddColumnClause extends AlterTableClause
{
  /**
   * Returns the value of the '<em><b>Column Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Def</em>' containment reference.
   * @see #setColumnDef(ColumnDef)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getAlterTableAddColumnClause_ColumnDef()
   * @model containment="true"
   * @generated
   */
  ColumnDef getColumnDef();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause#getColumnDef <em>Column Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Def</em>' containment reference.
   * @see #getColumnDef()
   * @generated
   */
  void setColumnDef(ColumnDef value);

} // AlterTableAddColumnClause
