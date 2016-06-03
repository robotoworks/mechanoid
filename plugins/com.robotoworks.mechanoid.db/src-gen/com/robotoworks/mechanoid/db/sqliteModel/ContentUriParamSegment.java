/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Uri Param Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isNum <em>Num</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getContentUriParamSegment()
 * @model
 * @generated
 */
public interface ContentUriParamSegment extends ContentUriSegment
{
  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getContentUriParamSegment_Num()
   * @model
   * @generated
   */
  boolean isNum();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #isNum()
   * @generated
   */
  void setNum(boolean value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getContentUriParamSegment_Text()
   * @model
   * @generated
   */
  boolean isText();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #isText()
   * @generated
   */
  void setText(boolean value);

} // ContentUriParamSegment
