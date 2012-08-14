/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.Model#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.ops.opServiceModel.Model#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.Model#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' containment reference.
   * @see #setService(ServiceBlock)
   * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage#getModel_Service()
   * @model containment="true"
   * @generated
   */
  ServiceBlock getService();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.ops.opServiceModel.Model#getService <em>Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' containment reference.
   * @see #getService()
   * @generated
   */
  void setService(ServiceBlock value);

} // Model
