/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isNatural <em>Natural</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isLeft <em>Left</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isOuter <em>Outer</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isInner <em>Inner</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isCross <em>Cross</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getSingleSource <em>Single Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement()
 * @model
 * @generated
 */
public interface JoinStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Natural</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Natural</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Natural</em>' attribute.
   * @see #setNatural(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_Natural()
   * @model
   * @generated
   */
  boolean isNatural();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isNatural <em>Natural</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Natural</em>' attribute.
   * @see #isNatural()
   * @generated
   */
  void setNatural(boolean value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_Left()
   * @model
   * @generated
   */
  boolean isLeft();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #isLeft()
   * @generated
   */
  void setLeft(boolean value);

  /**
   * Returns the value of the '<em><b>Outer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outer</em>' attribute.
   * @see #setOuter(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_Outer()
   * @model
   * @generated
   */
  boolean isOuter();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isOuter <em>Outer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outer</em>' attribute.
   * @see #isOuter()
   * @generated
   */
  void setOuter(boolean value);

  /**
   * Returns the value of the '<em><b>Inner</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' attribute.
   * @see #setInner(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_Inner()
   * @model
   * @generated
   */
  boolean isInner();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isInner <em>Inner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' attribute.
   * @see #isInner()
   * @generated
   */
  void setInner(boolean value);

  /**
   * Returns the value of the '<em><b>Cross</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cross</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cross</em>' attribute.
   * @see #setCross(boolean)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_Cross()
   * @model
   * @generated
   */
  boolean isCross();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isCross <em>Cross</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cross</em>' attribute.
   * @see #isCross()
   * @generated
   */
  void setCross(boolean value);

  /**
   * Returns the value of the '<em><b>Single Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Source</em>' containment reference.
   * @see #setSingleSource(SingleSource)
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_SingleSource()
   * @model containment="true"
   * @generated
   */
  SingleSource getSingleSource();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getSingleSource <em>Single Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Source</em>' containment reference.
   * @see #getSingleSource()
   * @generated
   */
  void setSingleSource(SingleSource value);

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
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#getJoinStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // JoinStatement
