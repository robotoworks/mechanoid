/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Contraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getConflictClause <em>Conflict Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getPrimaryContraint()
 * @model
 * @generated
 */
public interface PrimaryContraint extends TableConstraint
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getPrimaryContraint_Columns()
   * @model containment="true"
   * @generated
   */
  EList<IndexedColumn> getColumns();

  /**
   * Returns the value of the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflict Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflict Clause</em>' containment reference.
   * @see #setConflictClause(ConflictClause)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getPrimaryContraint_ConflictClause()
   * @model containment="true"
   * @generated
   */
  ConflictClause getConflictClause();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getConflictClause <em>Conflict Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conflict Clause</em>' containment reference.
   * @see #getConflictClause()
   * @generated
   */
  void setConflictClause(ConflictClause value);

} // PrimaryContraint
