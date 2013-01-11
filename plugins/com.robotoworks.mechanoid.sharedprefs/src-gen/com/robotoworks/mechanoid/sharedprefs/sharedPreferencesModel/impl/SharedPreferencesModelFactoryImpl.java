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
      SharedPreferencesModelFactory theSharedPreferencesModelFactory = (SharedPreferencesModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.robotoworks.com/mechanoid/sharedprefs/SharedPreferencesModel"); 
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
