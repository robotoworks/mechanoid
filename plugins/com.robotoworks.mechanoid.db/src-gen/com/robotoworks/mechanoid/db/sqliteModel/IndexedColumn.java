/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexed Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isAsc <em>Asc</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getIndexedColumn()
 * @model
 * @generated
 */
public interface IndexedColumn extends EObject
{
  /**
   * Returns the value of the '<em><b>Column Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Reference</em>' reference.
   * @see #setColumnReference(ColumnDef)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getIndexedColumn_ColumnReference()
   * @model
   * @generated
   */
  ColumnDef getColumnReference();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getColumnReference <em>Column Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Reference</em>' reference.
   * @see #getColumnReference()
   * @generated
   */
  void setColumnReference(ColumnDef value);

  /**
   * Returns the value of the '<em><b>Collation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collation Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collation Name</em>' attribute.
   * @see #setCollationName(String)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getIndexedColumn_CollationName()
   * @model
   * @generated
   */
  String getCollationName();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getCollationName <em>Collation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collation Name</em>' attribute.
   * @see #getCollationName()
   * @generated
   */
  void setCollationName(String value);

  /**
   * Returns the value of the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asc</em>' attribute.
   * @see #setAsc(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getIndexedColumn_Asc()
   * @model
   * @generated
   */
  boolean isAsc();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isAsc <em>Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asc</em>' attribute.
   * @see #isAsc()
   * @generated
   */
  void setAsc(boolean value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getIndexedColumn_Desc()
   * @model
   * @generated
   */
  boolean isDesc();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #isDesc()
   * @generated
   */
  void setDesc(boolean value);

} // IndexedColumn
