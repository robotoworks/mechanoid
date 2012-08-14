/**
 */
package com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Preference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.sharedprefs.sharedPreferencesModel.SharedPreferencesModelPackage#getPreferenceType()
 * @model
 * @generated
 */
public enum PreferenceType implements Enumerator
{
  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "String", "String"),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(1, "Integer", "int"),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(2, "Boolean", "boolean"),

  /**
   * The '<em><b>Float</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(3, "Float", "float"),

  /**
   * The '<em><b>Long</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_VALUE
   * @generated
   * @ordered
   */
  LONG(4, "Long", "long");

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="Integer" literal="int"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 1;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="Boolean" literal="boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 2;

  /**
   * The '<em><b>Float</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model name="Float" literal="float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 3;

  /**
   * The '<em><b>Long</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONG
   * @model name="Long" literal="long"
   * @generated
   * @ordered
   */
  public static final int LONG_VALUE = 4;

  /**
   * An array of all the '<em><b>Preference Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PreferenceType[] VALUES_ARRAY =
    new PreferenceType[]
    {
      STRING,
      INTEGER,
      BOOLEAN,
      FLOAT,
      LONG,
    };

  /**
   * A public read-only list of all the '<em><b>Preference Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PreferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Preference Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PreferenceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PreferenceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Preference Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PreferenceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PreferenceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Preference Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PreferenceType get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case INTEGER_VALUE: return INTEGER;
      case BOOLEAN_VALUE: return BOOLEAN;
      case FLOAT_VALUE: return FLOAT;
      case LONG_VALUE: return LONG;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private PreferenceType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PreferenceType
