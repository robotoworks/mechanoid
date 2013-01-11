/**
 */
package com.robotoworks.mechanoid.net.netModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#isGen <em>Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getUserTypeDeclaration()
 * @model
 * @generated
 */
public interface UserTypeDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' attribute.
   * @see #setKeyword(String)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getUserTypeDeclaration_Keyword()
   * @model
   * @generated
   */
  String getKeyword();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#getKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(String value);

  /**
   * Returns the value of the '<em><b>Gen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen</em>' attribute.
   * @see #setGen(boolean)
   * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage#getUserTypeDeclaration_Gen()
   * @model
   * @generated
   */
  boolean isGen();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.net.netModel.UserTypeDeclaration#isGen <em>Gen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen</em>' attribute.
   * @see #isGen()
   * @generated
   */
  void setGen(boolean value);

} // UserTypeDeclaration
