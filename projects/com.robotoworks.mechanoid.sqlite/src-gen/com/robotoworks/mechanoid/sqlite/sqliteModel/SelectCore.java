/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getResultColumns <em>Result Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getWhereExpression <em>Where Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getGroupByExpressions <em>Group By Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore()
 * @model
 * @generated
 */
public interface SelectCore extends EObject
{
  /**
   * Returns the value of the '<em><b>Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distinct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distinct</em>' attribute.
   * @see #setDistinct(boolean)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore_Distinct()
   * @model
   * @generated
   */
  boolean isDistinct();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isDistinct <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distinct</em>' attribute.
   * @see #isDistinct()
   * @generated
   */
  void setDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Result Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Columns</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore_ResultColumns()
   * @model containment="true"
   * @generated
   */
  EList<ResultColumn> getResultColumns();

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(JoinSource)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore_Source()
   * @model containment="true"
   * @generated
   */
  JoinSource getSource();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(JoinSource value);

  /**
   * Returns the value of the '<em><b>Where Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Expression</em>' containment reference.
   * @see #setWhereExpression(SqlExpression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore_WhereExpression()
   * @model containment="true"
   * @generated
   */
  SqlExpression getWhereExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getWhereExpression <em>Where Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Expression</em>' containment reference.
   * @see #getWhereExpression()
   * @generated
   */
  void setWhereExpression(SqlExpression value);

  /**
   * Returns the value of the '<em><b>Group By Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By Expressions</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectCore_GroupByExpressions()
   * @model containment="true"
   * @generated
   */
  EList<SqlExpression> getGroupByExpressions();

} // SelectCore
