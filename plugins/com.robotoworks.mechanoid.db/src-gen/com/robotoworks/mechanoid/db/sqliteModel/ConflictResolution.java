/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conflict Resolution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getConflictResolution()
 * @model
 * @generated
 */
public enum ConflictResolution implements Enumerator
{
  /**
   * The '<em><b>Rollback</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLLBACK_VALUE
   * @generated
   * @ordered
   */
  ROLLBACK(0, "rollback", "rollback"),

  /**
   * The '<em><b>Abort</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABORT_VALUE
   * @generated
   * @ordered
   */
  ABORT(1, "abort", "abort"),

  /**
   * The '<em><b>Fail</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAIL_VALUE
   * @generated
   * @ordered
   */
  FAIL(2, "fail", "fail"),

  /**
   * The '<em><b>Ignore</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IGNORE_VALUE
   * @generated
   * @ordered
   */
  IGNORE(3, "ignore", "ignore"),

  /**
   * The '<em><b>Replace</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPLACE_VALUE
   * @generated
   * @ordered
   */
  REPLACE(4, "replace", "replace");

  /**
   * The '<em><b>Rollback</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rollback</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLLBACK
   * @model name="rollback"
   * @generated
   * @ordered
   */
  public static final int ROLLBACK_VALUE = 0;

  /**
   * The '<em><b>Abort</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Abort</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABORT
   * @model name="abort"
   * @generated
   * @ordered
   */
  public static final int ABORT_VALUE = 1;

  /**
   * The '<em><b>Fail</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fail</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FAIL
   * @model name="fail"
   * @generated
   * @ordered
   */
  public static final int FAIL_VALUE = 2;

  /**
   * The '<em><b>Ignore</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ignore</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IGNORE
   * @model name="ignore"
   * @generated
   * @ordered
   */
  public static final int IGNORE_VALUE = 3;

  /**
   * The '<em><b>Replace</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Replace</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REPLACE
   * @model name="replace"
   * @generated
   * @ordered
   */
  public static final int REPLACE_VALUE = 4;

  /**
   * An array of all the '<em><b>Conflict Resolution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConflictResolution[] VALUES_ARRAY =
    new ConflictResolution[]
    {
      ROLLBACK,
      ABORT,
      FAIL,
      IGNORE,
      REPLACE,
    };

  /**
   * A public read-only list of all the '<em><b>Conflict Resolution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConflictResolution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Conflict Resolution</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConflictResolution get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConflictResolution result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Conflict Resolution</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConflictResolution getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConflictResolution result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Conflict Resolution</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConflictResolution get(int value)
  {
    switch (value)
    {
      case ROLLBACK_VALUE: return ROLLBACK;
      case ABORT_VALUE: return ABORT;
      case FAIL_VALUE: return FAIL;
      case IGNORE_VALUE: return IGNORE;
      case REPLACE_VALUE: return REPLACE;
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
  private ConflictResolution(int value, String name, String literal)
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
  
} //ConflictResolution
