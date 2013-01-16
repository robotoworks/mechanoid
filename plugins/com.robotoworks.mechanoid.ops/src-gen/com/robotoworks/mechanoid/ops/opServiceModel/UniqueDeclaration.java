/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.UniqueDeclaration#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getUniqueDeclaration()
 * @model
 * @generated
 */
public interface UniqueDeclaration extends UniqueClause
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' reference list.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getUniqueDeclaration_Args()
   * @model
   * @generated
   */
  EList<OperationArg> getArgs();

} // UniqueDeclaration
