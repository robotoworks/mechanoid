/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.UserType#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getUserType()
 * @model
 * @generated
 */
public interface UserType extends Type
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' reference.
   * @see #setDeclaration(UserTypeDeclaration)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getUserType_Declaration()
   * @model
   * @generated
   */
  UserTypeDeclaration getDeclaration();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.UserType#getDeclaration <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(UserTypeDeclaration value);

} // UserType
