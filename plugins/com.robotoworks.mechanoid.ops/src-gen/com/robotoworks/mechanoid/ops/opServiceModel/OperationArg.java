/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getType <em>Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperationArg()
 * @model
 * @generated
 */
public interface OperationArg extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.ops.opServiceModel.OpArgType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpArgType
   * @see #setType(OpArgType)
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperationArg_Type()
   * @model
   * @generated
   */
  OpArgType getType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpArgType
   * @see #getType()
   * @generated
   */
  void setType(OpArgType value);

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
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getOperationArg_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.OperationArg#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // OperationArg
