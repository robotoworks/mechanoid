/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Unique Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.WithUniqueBlock#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getWithUniqueBlock()
 * @model
 * @generated
 */
public interface WithUniqueBlock extends EObject
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
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getWithUniqueBlock_Args()
   * @model
   * @generated
   */
  EList<OperationArg> getArgs();

} // WithUniqueBlock
