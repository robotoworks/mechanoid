/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isAsc <em>Asc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getOrderingTerm()
 * @model
 * @generated
 */
public interface OrderingTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getOrderingTerm_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asc</em>' attribute.
   * @see #setAsc(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getOrderingTerm_Asc()
   * @model
   * @generated
   */
  boolean isAsc();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isAsc <em>Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asc</em>' attribute.
   * @see #isAsc()
   * @generated
   */
  void setAsc(boolean value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getOrderingTerm_Desc()
   * @model
   * @generated
   */
  boolean isDesc();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #isDesc()
   * @generated
   */
  void setDesc(boolean value);

} // OrderingTerm
