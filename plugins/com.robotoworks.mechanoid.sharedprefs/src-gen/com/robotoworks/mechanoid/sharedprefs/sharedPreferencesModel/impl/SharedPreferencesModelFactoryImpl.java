/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.impl;

import com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedPreferencesModelFactoryImpl extends EFactoryImpl implements SharedPreferencesModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SharedPreferencesModelFactory init()
  {
    try
    {
      SharedPreferencesModelFactory theSharedPreferencesModelFactory = (SharedPreferencesModelFactory)EPackage.Registry.INSTANCE.getEFactory(SharedPreferencesModelPackage.eNS_URI);
      if (theSharedPreferencesModelFactory != null)
      {
        return theSharedPreferencesModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SharedPreferencesModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SharedPreferencesModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SharedPreferencesModelPackage.MODEL: return createModel();
      case SharedPreferencesModelPackage.PREFERENCES_BLOCK: return createPreferencesBlock();
      case SharedPreferencesModelPackage.PREFERENCE: return createPreference();
      case SharedPreferencesModelPackage.LITERAL: return createLiteral();
      case SharedPreferencesModelPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case SharedPreferencesModelPackage.STRING_LITERAL: return createStringLiteral();
      case SharedPreferencesModelPackage.NUMERIC_LITERAL: return createNumericLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SharedPreferencesModelPackage.PREFERENCE_TYPE:
        return createPreferenceTypeFromString(eDataType, initialValue);
      case SharedPreferencesModelPackage.BOOLEAN_VALUE:
        return createBooleanValueFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SharedPreferencesModelPackage.PREFERENCE_TYPE:
        return convertPreferenceTypeToString(eDataType, instanceValue);
      case SharedPreferencesModelPackage.BOOLEAN_VALUE:
        return convertBooleanValueToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferencesBlock createPreferencesBlock()
  {
    PreferencesBlockImpl preferencesBlock = new PreferencesBlockImpl();
    return preferencesBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preference createPreference()
  {
    PreferenceImpl preference = new PreferenceImpl();
    return preference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceType createPreferenceTypeFromString(EDataType eDataType, String initialValue)
  {
    PreferenceType result = PreferenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPreferenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValueFromString(EDataType eDataType, String initialValue)
  {
    BooleanValue result = BooleanValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SharedPreferencesModelPackage getSharedPreferencesModelPackage()
  {
    return (SharedPreferencesModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SharedPreferencesModelPackage getPackage()
  {
    return SharedPreferencesModelPackage.eINSTANCE;
  }

} //SharedPreferencesModelFactoryImpl
