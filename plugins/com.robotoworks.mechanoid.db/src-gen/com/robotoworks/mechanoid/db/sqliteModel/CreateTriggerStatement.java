/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Trigger Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#isTemporary <em>Temporary</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhen <em>When</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getEventType <em>Event Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getUpdateColumnNames <em>Update Column Names</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getForEachRow <em>For Each Row</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement()
 * @model
 * @generated
 */
public interface CreateTriggerStatement extends DDLStatement
{
  /**
   * Returns the value of the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temporary</em>' attribute.
   * @see #setTemporary(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_Temporary()
   * @model
   * @generated
   */
  boolean isTemporary();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#isTemporary <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temporary</em>' attribute.
   * @see #isTemporary()
   * @generated
   */
  void setTemporary(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' attribute.
   * @see #setWhen(String)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_When()
   * @model
   * @generated
   */
  String getWhen();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhen <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' attribute.
   * @see #getWhen()
   * @generated
   */
  void setWhen(String value);

  /**
   * Returns the value of the '<em><b>Event Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Type</em>' attribute.
   * @see #setEventType(String)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_EventType()
   * @model
   * @generated
   */
  String getEventType();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getEventType <em>Event Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Type</em>' attribute.
   * @see #getEventType()
   * @generated
   */
  void setEventType(String value);

  /**
   * Returns the value of the '<em><b>Update Column Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Column Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Column Names</em>' attribute list.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_UpdateColumnNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getUpdateColumnNames();

  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(TableDefinition)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

  /**
   * Returns the value of the '<em><b>For Each Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Each Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Each Row</em>' attribute.
   * @see #setForEachRow(String)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_ForEachRow()
   * @model
   * @generated
   */
  String getForEachRow();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getForEachRow <em>For Each Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Each Row</em>' attribute.
   * @see #getForEachRow()
   * @generated
   */
  void setForEachRow(String value);

  /**
   * Returns the value of the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Expression</em>' containment reference.
   * @see #setWhenExpression(Expression)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_WhenExpression()
   * @model containment="true"
   * @generated
   */
  Expression getWhenExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhenExpression <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Expression</em>' containment reference.
   * @see #getWhenExpression()
   * @generated
   */
  void setWhenExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.robotoworks.mechanoid.db.sqliteModel.DMLStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getCreateTriggerStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<DMLStatement> getStatements();

} // CreateTriggerStatement
