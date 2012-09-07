/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getActions <em>Actions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getMigrations <em>Migrations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDatabaseBlock()
 * @model
 * @generated
 */
public interface DatabaseBlock extends EObject
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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDatabaseBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference.
   * @see #setActions(ActionBlock)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDatabaseBlock_Actions()
   * @model containment="true"
   * @generated
   */
  ActionBlock getActions();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getActions <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' containment reference.
   * @see #getActions()
   * @generated
   */
  void setActions(ActionBlock value);

  /**
   * Returns the value of the '<em><b>Migrations</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migrations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migrations</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getDatabaseBlock_Migrations()
   * @model containment="true"
   * @generated
   */
  EList<MigrationBlock> getMigrations();

} // DatabaseBlock
