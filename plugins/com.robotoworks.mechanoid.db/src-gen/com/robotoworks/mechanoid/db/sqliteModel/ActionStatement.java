/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ActionStatement#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getActionStatement()
 * @model
 * @generated
 */
public interface ActionStatement extends ConfigurationStatement
{
  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference.
   * @see #setUri(ContentUri)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getActionStatement_Uri()
   * @model containment="true"
   * @generated
   */
  ContentUri getUri();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ActionStatement#getUri <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' containment reference.
   * @see #getUri()
   * @generated
   */
  void setUri(ContentUri value);

} // ActionStatement
