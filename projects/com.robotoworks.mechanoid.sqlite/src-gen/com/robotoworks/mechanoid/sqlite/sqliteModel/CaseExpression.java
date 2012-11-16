/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCases <em>Cases</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#isIsnull <em>Isnull</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Case Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Expression</em>' containment reference.
   * @see #setCaseExpression(SqlExpression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCaseExpression_CaseExpression()
   * @model containment="true"
   * @generated
   */
  SqlExpression getCaseExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCaseExpression <em>Case Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Expression</em>' containment reference.
   * @see #getCaseExpression()
   * @generated
   */
  void setCaseExpression(SqlExpression value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCaseExpression_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Case> getCases();

  /**
   * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expression</em>' containment reference.
   * @see #setElseExpression(SqlExpression)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCaseExpression_ElseExpression()
   * @model containment="true"
   * @generated
   */
  SqlExpression getElseExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expression</em>' containment reference.
   * @see #getElseExpression()
   * @generated
   */
  void setElseExpression(SqlExpression value);

  /**
   * Returns the value of the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isnull</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isnull</em>' attribute.
   * @see #setIsnull(boolean)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getCaseExpression_Isnull()
   * @model
   * @generated
   */
  boolean isIsnull();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#isIsnull <em>Isnull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isnull</em>' attribute.
   * @see #isIsnull()
   * @generated
   */
  void setIsnull(boolean value);

} // CaseExpression
