/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getLeft <em>Left</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getOp <em>Op</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectCore()
 * @model
 * @generated
 */
public interface SelectCore extends SelectCoreExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SelectCoreExpression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectCore_Left()
   * @model containment="true"
   * @generated
   */
  SelectCoreExpression getLeft();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SelectCoreExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator
   * @see #setOp(CompoundOperator)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectCore_Op()
   * @model
   * @generated
   */
  CompoundOperator getOp();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator
   * @see #getOp()
   * @generated
   */
  void setOp(CompoundOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SelectCoreExpression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectCore_Right()
   * @model containment="true"
   * @generated
   */
  SelectCoreExpression getRight();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SelectCoreExpression value);

} // SelectCore
