/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getConfigBlock()
 * @model
 * @generated
 */
public interface ConfigBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getConfigBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationStatement> getStatements();

} // ConfigBlock
