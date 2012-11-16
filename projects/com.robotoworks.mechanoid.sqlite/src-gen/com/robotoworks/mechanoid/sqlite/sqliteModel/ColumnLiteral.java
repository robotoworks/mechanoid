/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#isIsnull <em>Isnull</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getColumnLiteral()
 * @model
 * @generated
 */
public interface ColumnLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getColumnLiteral_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isnull</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isnull</em>' attribute.
   * @see #setIsnull(boolean)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getColumnLiteral_Isnull()
   * @model
   * @generated
   */
  boolean isIsnull();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#isIsnull <em>Isnull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isnull</em>' attribute.
   * @see #isIsnull()
   * @generated
   */
  void setIsnull(boolean value);

} // ColumnLiteral
