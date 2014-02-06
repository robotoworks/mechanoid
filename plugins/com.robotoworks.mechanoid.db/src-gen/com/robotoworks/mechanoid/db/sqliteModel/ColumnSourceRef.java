/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Source Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnSourceRef()
 * @model
 * @generated
 */
public interface ColumnSourceRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(SelectSource)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnSourceRef_Source()
   * @model
   * @generated
   */
  SelectSource getSource();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(SelectSource value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnSourceRef_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference.
   * @see #setColumn(ColumnSource)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getColumnSourceRef_Column()
   * @model
   * @generated
   */
  ColumnSource getColumn();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getColumn <em>Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(ColumnSource value);

} // ColumnSourceRef
