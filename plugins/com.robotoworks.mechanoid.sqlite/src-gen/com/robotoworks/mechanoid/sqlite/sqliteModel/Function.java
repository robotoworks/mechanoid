/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getFunction_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getFunction_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // Function
