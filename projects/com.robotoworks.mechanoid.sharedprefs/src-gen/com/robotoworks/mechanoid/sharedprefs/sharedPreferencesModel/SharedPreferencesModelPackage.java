/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelFactory
 * @model kind="package"
 * @generated
 */
public interface SharedPreferencesModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sharedPreferencesModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.robotoworks.com/mechanoid/sharedprefs/SharedPreferencesModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sharedPreferencesModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SharedPreferencesModelPackage eINSTANCE = com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.ModelImpl
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Preferences Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PREFERENCES_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferencesBlockImpl <em>Preferences Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferencesBlockImpl
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getPreferencesBlock()
   * @generated
   */
  int PREFERENCES_BLOCK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Prefs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES_BLOCK__PREFS = 1;

  /**
   * The number of structural features of the '<em>Preferences Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferenceImpl <em>Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferenceImpl
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getPreference()
   * @generated
   */
  int PREFERENCE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType <em>Preference Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getPreferenceType()
   * @generated
   */
  int PREFERENCE_TYPE = 3;


  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPreferencesBlock <em>Preferences Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preferences Block</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model#getPreferencesBlock()
   * @see #getModel()
   * @generated
   */
  EReference getModel_PreferencesBlock();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock <em>Preferences Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preferences Block</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock
   * @generated
   */
  EClass getPreferencesBlock();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock#getName()
   * @see #getPreferencesBlock()
   * @generated
   */
  EAttribute getPreferencesBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock#getPrefs <em>Prefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefs</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock#getPrefs()
   * @see #getPreferencesBlock()
   * @generated
   */
  EReference getPreferencesBlock_Prefs();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference <em>Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference
   * @generated
   */
  EClass getPreference();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference#getName()
   * @see #getPreference()
   * @generated
   */
  EAttribute getPreference_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference#getType()
   * @see #getPreference()
   * @generated
   */
  EAttribute getPreference_Type();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType <em>Preference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Preference Type</em>'.
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType
   * @generated
   */
  EEnum getPreferenceType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SharedPreferencesModelFactory getSharedPreferencesModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.ModelImpl
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGE_NAME = eINSTANCE.getModel_PackageName();

    /**
     * The meta object literal for the '<em><b>Preferences Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PREFERENCES_BLOCK = eINSTANCE.getModel_PreferencesBlock();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferencesBlockImpl <em>Preferences Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferencesBlockImpl
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getPreferencesBlock()
     * @generated
     */
    EClass PREFERENCES_BLOCK = eINSTANCE.getPreferencesBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES_BLOCK__NAME = eINSTANCE.getPreferencesBlock_Name();

    /**
     * The meta object literal for the '<em><b>Prefs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCES_BLOCK__PREFS = eINSTANCE.getPreferencesBlock_Prefs();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferenceImpl <em>Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.PreferenceImpl
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getPreference()
     * @generated
     */
    EClass PREFERENCE = eINSTANCE.getPreference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE__NAME = eINSTANCE.getPreference_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCE__TYPE = eINSTANCE.getPreference_Type();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType <em>Preference Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType
     * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl.SharedPreferencesModelPackageImpl#getPreferenceType()
     * @generated
     */
    EEnum PREFERENCE_TYPE = eINSTANCE.getPreferenceType();

  }

} //SharedPreferencesModelPackage
