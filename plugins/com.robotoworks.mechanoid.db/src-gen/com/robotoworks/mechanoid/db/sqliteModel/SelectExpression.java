/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAllColumns <em>All Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSelectList <em>Select List</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getWhere <em>Where</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getHaving <em>Having</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression()
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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_Distinct()
   * @model
   * @generated
   */
  boolean isDistinct();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isDistinct <em>Distinct</em>}' attribute.
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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>All Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Columns</em>' attribute.
   * @see #setAllColumns(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_AllColumns()
   * @model
   * @generated
   */
  boolean isAllColumns();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAllColumns <em>All Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Columns</em>' attribute.
   * @see #isAllColumns()
   * @generated
   */
  void setAllColumns(boolean value);

  /**
   * Returns the value of the '<em><b>Select List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select List</em>' containment reference.
   * @see #setSelectList(SelectList)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_SelectList()
   * @model containment="true"
   * @generated
   */
  SelectList getSelectList();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSelectList <em>Select List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select List</em>' containment reference.
   * @see #getSelectList()
   * @generated
   */
  void setSelectList(SelectList value);

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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_Source()
   * @model containment="true"
   * @generated
   */
  JoinSource getSource();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(JoinSource value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(WhereExpressions)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_Where()
   * @model containment="true"
   * @generated
   */
  WhereExpressions getWhere();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(WhereExpressions value);

  /**
   * Returns the value of the '<em><b>Group By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By</em>' containment reference.
   * @see #setGroupBy(GroupByExpressions)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_GroupBy()
   * @model containment="true"
   * @generated
   */
  GroupByExpressions getGroupBy();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getGroupBy <em>Group By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group By</em>' containment reference.
   * @see #getGroupBy()
   * @generated
   */
  void setGroupBy(GroupByExpressions value);

  /**
   * Returns the value of the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Having</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having</em>' containment reference.
   * @see #setHaving(HavingExpressions)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSelectExpression_Having()
   * @model containment="true"
   * @generated
   */
  HavingExpressions getHaving();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getHaving <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having</em>' containment reference.
   * @see #getHaving()
   * @generated
   */
  void setHaving(HavingExpressions value);

} // SelectExpression
