/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDefaultConstraint()
 * @model
 * @generated
 */
public interface DefaultConstraint extends ColumnConstraint
{
  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(DefaultValue)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getDefaultConstraint_DefaultValue()
   * @model containment="true"
   * @generated
   */
  DefaultValue getDefaultValue();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(DefaultValue value);

} // DefaultConstraint
