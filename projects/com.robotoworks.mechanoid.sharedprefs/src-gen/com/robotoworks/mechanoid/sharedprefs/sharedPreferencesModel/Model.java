/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPreferencesBlock <em>Preferences Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#getModel()
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
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#getModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Preferences Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferences Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preferences Block</em>' containment reference.
   * @see #setPreferencesBlock(PreferencesBlock)
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#getModel_PreferencesBlock()
   * @model containment="true"
   * @generated
   */
  PreferencesBlock getPreferencesBlock();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPreferencesBlock <em>Preferences Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preferences Block</em>' containment reference.
   * @see #getPreferencesBlock()
   * @generated
   */
  void setPreferencesBlock(PreferencesBlock value);

} // Model
