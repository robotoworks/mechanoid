/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableSource#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableSource#getTableAlias <em>Table Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getTableSource()
 * @model
 * @generated
 */
public interface TableSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(CreateTableStatement)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getTableSource_Table()
   * @model
   * @generated
   */
  CreateTableStatement getTable();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableSource#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(CreateTableStatement value);

  /**
   * Returns the value of the '<em><b>Table Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Alias</em>' attribute.
   * @see #setTableAlias(String)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getTableSource_TableAlias()
   * @model
   * @generated
   */
  String getTableAlias();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableSource#getTableAlias <em>Table Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Alias</em>' attribute.
   * @see #getTableAlias()
   * @generated
   */
  void setTableAlias(String value);

} // TableSource
