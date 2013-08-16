/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getType <em>Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getFunctionArg()
 * @model
 * @generated
 */
public interface FunctionArg extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.db.sqliteModel.ColumnType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
   * @see #setType(ColumnType)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getFunctionArg_Type()
   * @model
   * @generated
   */
  ColumnType getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
   * @see #getType()
   * @generated
   */
  void setType(ColumnType value);

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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getFunctionArg_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FunctionArg
