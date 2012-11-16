/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#isIsnull <em>Isnull</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression
{
  /**
   * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Value</em>' containment reference.
   * @see #setLiteralValue(LiteralValue)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getLiteral_LiteralValue()
   * @model containment="true"
   * @generated
   */
  LiteralValue getLiteralValue();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#getLiteralValue <em>Literal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Value</em>' containment reference.
   * @see #getLiteralValue()
   * @generated
   */
  void setLiteralValue(LiteralValue value);

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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getLiteral_Isnull()
   * @model
   * @generated
   */
  boolean isIsnull();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#isIsnull <em>Isnull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isnull</em>' attribute.
   * @see #isIsnull()
   * @generated
   */
  void setIsnull(boolean value);

} // Literal
