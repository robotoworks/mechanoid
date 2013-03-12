/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Column Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getUpdateColumnExpression()
 * @model
 * @generated
 */
public interface UpdateColumnExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Column Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' reference.
   * @see #setColumnName(ColumnDef)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getUpdateColumnExpression_ColumnName()
   * @model
   * @generated
   */
  ColumnDef getColumnName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getColumnName <em>Column Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' reference.
   * @see #getColumnName()
   * @generated
   */
  void setColumnName(ColumnDef value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getUpdateColumnExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // UpdateColumnExpression
