/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#isNatural <em>Natural</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#isLeft <em>Left</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#isOuter <em>Outer</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#isInner <em>Inner</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#isCross <em>Cross</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#getSingleSource <em>Single Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinStatementImpl extends MinimalEObjectImpl.Container implements JoinStatement
{
  /**
   * The default value of the '{@link #isNatural() <em>Natural</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNatural()
   * @generated
   * @ordered
   */
  protected static final boolean NATURAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNatural() <em>Natural</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNatural()
   * @generated
   * @ordered
   */
  protected boolean natural = NATURAL_EDEFAULT;

  /**
   * The default value of the '{@link #isLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeft()
   * @generated
   * @ordered
   */
  protected static final boolean LEFT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeft()
   * @generated
   * @ordered
   */
  protected boolean left = LEFT_EDEFAULT;

  /**
   * The default value of the '{@link #isOuter() <em>Outer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOuter()
   * @generated
   * @ordered
   */
  protected static final boolean OUTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOuter() <em>Outer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOuter()
   * @generated
   * @ordered
   */
  protected boolean outer = OUTER_EDEFAULT;

  /**
   * The default value of the '{@link #isInner() <em>Inner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInner()
   * @generated
   * @ordered
   */
  protected static final boolean INNER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInner() <em>Inner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInner()
   * @generated
   * @ordered
   */
  protected boolean inner = INNER_EDEFAULT;

  /**
   * The default value of the '{@link #isCross() <em>Cross</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCross()
   * @generated
   * @ordered
   */
  protected static final boolean CROSS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCross() <em>Cross</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCross()
   * @generated
   * @ordered
   */
  protected boolean cross = CROSS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSingleSource() <em>Single Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleSource()
   * @generated
   * @ordered
   */
  protected SingleSource singleSource;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SqliteModelPackage.Literals.JOIN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNatural()
  {
    return natural;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNatural(boolean newNatural)
  {
    boolean oldNatural = natural;
    natural = newNatural;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__NATURAL, oldNatural, natural));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(boolean newLeft)
  {
    boolean oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOuter()
  {
    return outer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOuter(boolean newOuter)
  {
    boolean oldOuter = outer;
    outer = newOuter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__OUTER, oldOuter, outer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInner()
  {
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInner(boolean newInner)
  {
    boolean oldInner = inner;
    inner = newInner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__INNER, oldInner, inner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCross()
  {
    return cross;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCross(boolean newCross)
  {
    boolean oldCross = cross;
    cross = newCross;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__CROSS, oldCross, cross));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSource getSingleSource()
  {
    return singleSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleSource(SingleSource newSingleSource, NotificationChain msgs)
  {
    SingleSource oldSingleSource = singleSource;
    singleSource = newSingleSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE, oldSingleSource, newSingleSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleSource(SingleSource newSingleSource)
  {
    if (newSingleSource != singleSource)
    {
      NotificationChain msgs = null;
      if (singleSource != null)
        msgs = ((InternalEObject)singleSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE, null, msgs);
      if (newSingleSource != null)
        msgs = ((InternalEObject)newSingleSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE, null, msgs);
      msgs = basicSetSingleSource(newSingleSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE, newSingleSource, newSingleSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.JOIN_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.JOIN_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.JOIN_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE:
        return basicSetSingleSource(null, msgs);
      case SqliteModelPackage.JOIN_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SqliteModelPackage.JOIN_STATEMENT__NATURAL:
        return isNatural();
      case SqliteModelPackage.JOIN_STATEMENT__LEFT:
        return isLeft();
      case SqliteModelPackage.JOIN_STATEMENT__OUTER:
        return isOuter();
      case SqliteModelPackage.JOIN_STATEMENT__INNER:
        return isInner();
      case SqliteModelPackage.JOIN_STATEMENT__CROSS:
        return isCross();
      case SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE:
        return getSingleSource();
      case SqliteModelPackage.JOIN_STATEMENT__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqliteModelPackage.JOIN_STATEMENT__NATURAL:
        setNatural((Boolean)newValue);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__LEFT:
        setLeft((Boolean)newValue);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__OUTER:
        setOuter((Boolean)newValue);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__INNER:
        setInner((Boolean)newValue);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__CROSS:
        setCross((Boolean)newValue);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE:
        setSingleSource((SingleSource)newValue);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SqliteModelPackage.JOIN_STATEMENT__NATURAL:
        setNatural(NATURAL_EDEFAULT);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__LEFT:
        setLeft(LEFT_EDEFAULT);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__OUTER:
        setOuter(OUTER_EDEFAULT);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__INNER:
        setInner(INNER_EDEFAULT);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__CROSS:
        setCross(CROSS_EDEFAULT);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE:
        setSingleSource((SingleSource)null);
        return;
      case SqliteModelPackage.JOIN_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SqliteModelPackage.JOIN_STATEMENT__NATURAL:
        return natural != NATURAL_EDEFAULT;
      case SqliteModelPackage.JOIN_STATEMENT__LEFT:
        return left != LEFT_EDEFAULT;
      case SqliteModelPackage.JOIN_STATEMENT__OUTER:
        return outer != OUTER_EDEFAULT;
      case SqliteModelPackage.JOIN_STATEMENT__INNER:
        return inner != INNER_EDEFAULT;
      case SqliteModelPackage.JOIN_STATEMENT__CROSS:
        return cross != CROSS_EDEFAULT;
      case SqliteModelPackage.JOIN_STATEMENT__SINGLE_SOURCE:
        return singleSource != null;
      case SqliteModelPackage.JOIN_STATEMENT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (natural: ");
    result.append(natural);
    result.append(", left: ");
    result.append(left);
    result.append(", outer: ");
    result.append(outer);
    result.append(", inner: ");
    result.append(inner);
    result.append(", cross: ");
    result.append(cross);
    result.append(')');
    return result.toString();
  }

} //JoinStatementImpl
