/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement#getColumnDefs <em>Column Defs</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCreateTableStatement()
 * @model
 * @generated
 */
public interface CreateTableStatement extends Statment
{
  /**
   * Returns the value of the '<em><b>Column Defs</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Defs</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCreateTableStatement_ColumnDefs()
   * @model containment="true"
   * @generated
   */
  EList<ColumnDef> getColumnDefs();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCreateTableStatement_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<TableConstraint> getConstraints();

} // CreateTableStatement
