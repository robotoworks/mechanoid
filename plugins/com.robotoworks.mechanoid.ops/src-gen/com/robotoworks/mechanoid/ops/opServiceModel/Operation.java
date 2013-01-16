/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getArgs <em>Args</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getUniqueClause <em>Unique Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
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
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperation_Args()
   * @model containment="true"
   * @generated
   */
  EList<OperationArg> getArgs();

  /**
   * Returns the value of the '<em><b>Unique Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Clause</em>' containment reference.
   * @see #setUniqueClause(UniqueClause)
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperation_UniqueClause()
   * @model containment="true"
   * @generated
   */
  UniqueClause getUniqueClause();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.Operation#getUniqueClause <em>Unique Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Clause</em>' containment reference.
   * @see #getUniqueClause()
   * @generated
   */
  void setUniqueClause(UniqueClause value);

} // Operation
