/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getComplexTypeDeclaration()
 * @model
 * @generated
 */
public interface ComplexTypeDeclaration extends UserTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(ComplexTypeLiteral)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getComplexTypeDeclaration_Literal()
   * @model containment="true"
   * @generated
   */
  ComplexTypeLiteral getLiteral();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.ComplexTypeDeclaration#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(ComplexTypeLiteral value);

} // ComplexTypeDeclaration
