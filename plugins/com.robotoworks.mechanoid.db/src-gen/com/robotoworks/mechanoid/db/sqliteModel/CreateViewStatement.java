/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#isTemporary <em>Temporary</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateViewStatement()
 * @model
 * @generated
 */
public interface CreateViewStatement extends TableDefinition
{
  /**
   * Returns the value of the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temporary</em>' attribute.
   * @see #setTemporary(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateViewStatement_Temporary()
   * @model
   * @generated
   */
  boolean isTemporary();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#isTemporary <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temporary</em>' attribute.
   * @see #isTemporary()
   * @generated
   */
  void setTemporary(boolean value);

  /**
   * Returns the value of the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Statement</em>' containment reference.
   * @see #setSelectStatement(SelectStatement)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateViewStatement_SelectStatement()
   * @model containment="true"
   * @generated
   */
  SelectStatement getSelectStatement();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#getSelectStatement <em>Select Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Statement</em>' containment reference.
   * @see #getSelectStatement()
   * @generated
   */
  void setSelectStatement(SelectStatement value);

} // CreateViewStatement
