/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getActionBlock()
 * @model
 * @generated
 */
public interface ActionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getActionBlock_Actions()
   * @model containment="true"
   * @generated
   */
  EList<ActionStatement> getActions();

} // ActionBlock
