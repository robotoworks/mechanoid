/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getServiceBlock()
 * @model
 * @generated
 */
public interface ServiceBlock extends EObject
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
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getServiceBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.ops.opServiceModel.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference list.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getServiceBlock_Ops()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOps();

} // ServiceBlock
