/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DivisionExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DivisionExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDivisionExpr()
 * @model
 * @generated
 */
public interface DivisionExpr extends Expression
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
   * @see #setLeft(Expression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDivisionExpr_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DivisionExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDivisionExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DivisionExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // DivisionExpr
