/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAsc <em>Asc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isDesc <em>Desc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAutoincrement <em>Autoincrement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getPrimaryKeyColumnConstraint()
 * @model
 * @generated
 */
public interface PrimaryKeyColumnConstraint extends ColumnConstraint
{
  /**
   * Returns the value of the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asc</em>' attribute.
   * @see #setAsc(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getPrimaryKeyColumnConstraint_Asc()
   * @model
   * @generated
   */
  boolean isAsc();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAsc <em>Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asc</em>' attribute.
   * @see #isAsc()
   * @generated
   */
  void setAsc(boolean value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getPrimaryKeyColumnConstraint_Desc()
   * @model
   * @generated
   */
  boolean isDesc();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #isDesc()
   * @generated
   */
  void setDesc(boolean value);

  /**
   * Returns the value of the '<em><b>Autoincrement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autoincrement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autoincrement</em>' attribute.
   * @see #setAutoincrement(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getPrimaryKeyColumnConstraint_Autoincrement()
   * @model
   * @generated
   */
  boolean isAutoincrement();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAutoincrement <em>Autoincrement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autoincrement</em>' attribute.
   * @see #isAutoincrement()
   * @generated
   */
  void setAutoincrement(boolean value);

} // PrimaryKeyColumnConstraint
