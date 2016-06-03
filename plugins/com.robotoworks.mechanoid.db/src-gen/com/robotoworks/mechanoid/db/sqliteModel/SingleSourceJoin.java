/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Source Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin#getJoinSource <em>Join Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSingleSourceJoin()
 * @model
 * @generated
 */
public interface SingleSourceJoin extends SingleSource
{
  /**
   * Returns the value of the '<em><b>Join Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Source</em>' containment reference.
   * @see #setJoinSource(JoinSource)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getSingleSourceJoin_JoinSource()
   * @model containment="true"
   * @generated
   */
  JoinSource getJoinSource();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin#getJoinSource <em>Join Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Source</em>' containment reference.
   * @see #getJoinSource()
   * @generated
   */
  void setJoinSource(JoinSource value);

} // SingleSourceJoin
