/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanLiteral#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanValue
   * @see #setLiteral(BooleanValue)
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#getBooleanLiteral_Literal()
   * @model
   * @generated
   */
  BooleanValue getLiteral();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanLiteral#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanValue
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(BooleanValue value);

} // BooleanLiteral
