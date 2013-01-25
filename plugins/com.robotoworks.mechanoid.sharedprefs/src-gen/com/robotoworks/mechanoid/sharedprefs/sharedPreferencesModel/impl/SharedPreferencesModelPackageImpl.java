/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl;

import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.BooleanValue;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Literal;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Model;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.NumericLiteral;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.Preference;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferenceType;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.PreferencesBlock;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelFactory;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage;
import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.StringLiteral;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedPreferencesModelPackageImpl extends EPackageImpl implements SharedPreferencesModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferencesBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum preferenceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanValueEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SharedPreferencesModelPackageImpl()
  {
    super(eNS_URI, SharedPreferencesModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SharedPreferencesModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SharedPreferencesModelPackage init()
  {
    if (isInited) return (SharedPreferencesModelPackage)EPackage.Registry.INSTANCE.getEPackage(SharedPreferencesModelPackage.eNS_URI);

    // Obtain or create and register package
    SharedPreferencesModelPackageImpl theSharedPreferencesModelPackage = (SharedPreferencesModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SharedPreferencesModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SharedPreferencesModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSharedPreferencesModelPackage.createPackageContents();

    // Initialize created meta-data
    theSharedPreferencesModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSharedPreferencesModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SharedPreferencesModelPackage.eNS_URI, theSharedPreferencesModelPackage);
    return theSharedPreferencesModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_PackageName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_PreferencesBlock()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferencesBlock()
  {
    return preferencesBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferencesBlock_Name()
  {
    return (EAttribute)preferencesBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreferencesBlock_Prefs()
  {
    return (EReference)preferencesBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreference()
  {
    return preferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreference_Name()
  {
    return (EAttribute)preferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreference_Type()
  {
    return (EAttribute)preferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreference_DefaultValue()
  {
    return (EReference)preferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Literal()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Literal()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericLiteral()
  {
    return numericLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericLiteral_Literal()
  {
    return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPreferenceType()
  {
    return preferenceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanValue()
  {
    return booleanValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SharedPreferencesModelFactory getSharedPreferencesModelFactory()
  {
    return (SharedPreferencesModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PACKAGE_NAME);
    createEReference(modelEClass, MODEL__PREFERENCES_BLOCK);

    preferencesBlockEClass = createEClass(PREFERENCES_BLOCK);
    createEAttribute(preferencesBlockEClass, PREFERENCES_BLOCK__NAME);
    createEReference(preferencesBlockEClass, PREFERENCES_BLOCK__PREFS);

    preferenceEClass = createEClass(PREFERENCE);
    createEAttribute(preferenceEClass, PREFERENCE__NAME);
    createEAttribute(preferenceEClass, PREFERENCE__TYPE);
    createEReference(preferenceEClass, PREFERENCE__DEFAULT_VALUE);

    literalEClass = createEClass(LITERAL);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__LITERAL);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__LITERAL);

    numericLiteralEClass = createEClass(NUMERIC_LITERAL);
    createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__LITERAL);

    // Create enums
    preferenceTypeEEnum = createEEnum(PREFERENCE_TYPE);
    booleanValueEEnum = createEEnum(BOOLEAN_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getLiteral());
    numericLiteralEClass.getESuperTypes().add(this.getLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_PreferencesBlock(), this.getPreferencesBlock(), null, "preferencesBlock", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferencesBlockEClass, PreferencesBlock.class, "PreferencesBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreferencesBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, PreferencesBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreferencesBlock_Prefs(), this.getPreference(), null, "prefs", null, 0, -1, PreferencesBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreference_Type(), this.getPreferenceType(), "type", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreference_DefaultValue(), this.getLiteral(), null, "defaultValue", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Literal(), this.getBooleanValue(), "literal", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericLiteral_Literal(), ecorePackage.getEBigDecimal(), "literal", null, 0, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(preferenceTypeEEnum, PreferenceType.class, "PreferenceType");
    addEEnumLiteral(preferenceTypeEEnum, PreferenceType.STRING);
    addEEnumLiteral(preferenceTypeEEnum, PreferenceType.INTEGER);
    addEEnumLiteral(preferenceTypeEEnum, PreferenceType.BOOLEAN);
    addEEnumLiteral(preferenceTypeEEnum, PreferenceType.FLOAT);
    addEEnumLiteral(preferenceTypeEEnum, PreferenceType.LONG);

    initEEnum(booleanValueEEnum, BooleanValue.class, "BooleanValue");
    addEEnumLiteral(booleanValueEEnum, BooleanValue.TRUE);
    addEEnumLiteral(booleanValueEEnum, BooleanValue.FALSE);

    // Create resource
    createResource(eNS_URI);
  }

} //SharedPreferencesModelPackageImpl
