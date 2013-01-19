/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getConflictResolution <em>Conflict Resolution</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getInsertStatement()
 * @model
 * @generated
 */
public interface InsertStatement extends DMLStatement
{
  /**
   * Returns the value of the '<em><b>Conflict Resolution</b></em>' attribute.
   * The literals are from the enumeration {@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflict Resolution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflict Resolution</em>' attribute.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution
   * @see #setConflictResolution(ConflictResolution)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getInsertStatement_ConflictResolution()
   * @model
   * @generated
   */
  ConflictResolution getConflictResolution();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getConflictResolution <em>Conflict Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conflict Resolution</em>' attribute.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution
   * @see #getConflictResolution()
   * @generated
   */
  void setConflictResolution(ConflictResolution value);

  /**
   * Returns the value of the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Name</em>' attribute.
   * @see #setTableName(String)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getInsertStatement_TableName()
   * @model
   * @generated
   */
  String getTableName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getTableName <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Name</em>' attribute.
   * @see #getTableName()
   * @generated
   */
  void setTableName(String value);

  /**
   * Returns the value of the '<em><b>Column Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Names</em>' attribute list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getInsertStatement_ColumnNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getColumnNames();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.sqlite.sqliteModel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getInsertStatement_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

  /**
   * Returns the value of the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Statement</em>' containment reference.
   * @see #setSelectStatement(SelectStatement)
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#getInsertStatement_SelectStatement()
   * @model containment="true"
   * @generated
   */
  SelectStatement getSelectStatement();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement#getSelectStatement <em>Select Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Statement</em>' containment reference.
   * @see #getSelectStatement()
   * @generated
   */
  void setSelectStatement(SelectStatement value);

} // InsertStatement
