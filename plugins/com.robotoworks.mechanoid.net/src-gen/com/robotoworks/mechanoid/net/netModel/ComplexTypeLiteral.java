/**
 */
package com.robotoworks.mechanoid.net.netModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeLiteral#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getComplexTypeLiteral()
 * @model
 * @generated
 */
public interface ComplexTypeLiteral extends BlockType
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.net.netModel.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getComplexTypeLiteral_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // ComplexTypeLiteral
