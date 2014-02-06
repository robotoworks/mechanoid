/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getType <em>Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnDef()
 * @model
 * @generated
 */
public interface ColumnDef extends ColumnSource
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.db.sqliteModel.ColumnType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
   * @see #setType(ColumnType)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnDef_Type()
   * @model
   * @generated
   */
  ColumnType getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
   * @see #getType()
   * @generated
   */
  void setType(ColumnType value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.db.sqliteModel.ColumnConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnDef_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<ColumnConstraint> getConstraints();

} // ColumnDef
