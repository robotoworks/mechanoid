/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Params Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ParamsBlock#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getParamsBlock()
 * @model
 * @generated
 */
public interface ParamsBlock extends ClientBlock, HttpMethodBlock
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.net.netModel.SimpleMemberAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getParamsBlock_Params()
   * @model containment="true"
   * @generated
   */
  EList<SimpleMemberAssignment> getParams();

} // ParamsBlock
