/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Select#getLeft <em>Left</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Select#getCompoundOperator <em>Compound Operator</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Select#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject
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
   * @see #setLeft(SelectCore)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelect_Left()
   * @model containment="true"
   * @generated
   */
  SelectCore getLeft();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Select#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SelectCore value);

  /**
   * Returns the value of the '<em><b>Compound Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound Operator</em>' attribute.
   * @see #setCompoundOperator(String)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelect_CompoundOperator()
   * @model
   * @generated
   */
  String getCompoundOperator();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Select#getCompoundOperator <em>Compound Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound Operator</em>' attribute.
   * @see #getCompoundOperator()
   * @generated
   */
  void setCompoundOperator(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SelectCore)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelect_Right()
   * @model containment="true"
   * @generated
   */
  SelectCore getRight();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Select#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SelectCore value);

} // Select
