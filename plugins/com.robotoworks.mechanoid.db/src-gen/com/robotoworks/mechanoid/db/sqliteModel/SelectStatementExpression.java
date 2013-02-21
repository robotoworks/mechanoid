/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isNot <em>Not</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isExists <em>Exists</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#getSelect <em>Select</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatementExpression()
 * @model
 * @generated
 */
public interface SelectStatementExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatementExpression_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

  /**
   * Returns the value of the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exists</em>' attribute.
   * @see #setExists(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatementExpression_Exists()
   * @model
   * @generated
   */
  boolean isExists();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exists</em>' attribute.
   * @see #isExists()
   * @generated
   */
  void setExists(boolean value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(SelectStatement)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectStatementExpression_Select()
   * @model containment="true"
   * @generated
   */
  SelectStatement getSelect();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SelectStatement value);

} // SelectStatementExpression
