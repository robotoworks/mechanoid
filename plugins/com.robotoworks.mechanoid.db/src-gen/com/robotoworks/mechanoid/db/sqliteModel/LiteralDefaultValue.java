/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getLiteralDefaultValue()
 * @model
 * @generated
 */
public interface LiteralDefaultValue extends DefaultValue
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(LiteralValue)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getLiteralDefaultValue_Literal()
   * @model containment="true"
   * @generated
   */
  LiteralValue getLiteral();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(LiteralValue value);

} // LiteralDefaultValue
