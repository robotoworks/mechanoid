/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getNumericLiteral()
 * @model
 * @generated
 */
public interface NumericLiteral extends LiteralValue
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(BigDecimal)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getNumericLiteral_Number()
   * @model
   * @generated
   */
  BigDecimal getNumber();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(BigDecimal value);

} // NumericLiteral
