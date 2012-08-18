/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCore <em>Core</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Core</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core</em>' containment reference.
   * @see #setCore(SelectCore)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectStatement_Core()
   * @model containment="true"
   * @generated
   */
  SelectCore getCore();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCore <em>Core</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Core</em>' containment reference.
   * @see #getCore()
   * @generated
   */
  void setCore(SelectCore value);

} // SelectStatement
