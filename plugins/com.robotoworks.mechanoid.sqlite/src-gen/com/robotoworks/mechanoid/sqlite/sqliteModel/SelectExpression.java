/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getResultColumns <em>Result Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getWhereExpression <em>Where Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getGroupByExpressions <em>Group By Expressions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getHavingExpression <em>Having Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression()
 * @model
 * @generated
 */
public interface SelectExpression extends SelectCoreExpression
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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_Distinct()
   * @model
   * @generated
   */
  boolean isDistinct();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#isDistinct <em>Distinct</em>}' attribute.
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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#isAll <em>All</em>}' attribute.
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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_ResultColumns()
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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_Source()
   * @model containment="true"
   * @generated
   */
  JoinSource getSource();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getSource <em>Source</em>}' containment reference.
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
   * @see #setWhereExpression(Expression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_WhereExpression()
   * @model containment="true"
   * @generated
   */
  Expression getWhereExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getWhereExpression <em>Where Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Expression</em>' containment reference.
   * @see #getWhereExpression()
   * @generated
   */
  void setWhereExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Group By Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By Expressions</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_GroupByExpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getGroupByExpressions();

  /**
   * Returns the value of the '<em><b>Having Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Having Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having Expression</em>' containment reference.
   * @see #setHavingExpression(Expression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getSelectExpression_HavingExpression()
   * @model containment="true"
   * @generated
   */
  Expression getHavingExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression#getHavingExpression <em>Having Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having Expression</em>' containment reference.
   * @see #getHavingExpression()
   * @generated
   */
  void setHavingExpression(Expression value);

} // SelectExpression
