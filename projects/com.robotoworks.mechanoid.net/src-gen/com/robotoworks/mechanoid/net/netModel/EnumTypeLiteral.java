/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.EnumTypeLiteral#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getEnumTypeLiteral()
 * @model
 * @generated
 */
public interface EnumTypeLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.net.netModel.EnumMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getEnumTypeLiteral_Members()
   * @model containment="true"
   * @generated
   */
  EList<EnumMember> getMembers();

} // EnumTypeLiteral
