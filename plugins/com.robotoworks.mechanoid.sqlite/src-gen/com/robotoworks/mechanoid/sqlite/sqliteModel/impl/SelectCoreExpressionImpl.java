/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.Expression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Core Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#getResultColumns <em>Result Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#getWhereExpression <em>Where Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#getGroupByExpressions <em>Group By Expressions</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreExpressionImpl#getHavingExpression <em>Having Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectCoreExpressionImpl extends MinimalEObjectImpl.Container implements SelectCoreExpression
{
  /**
   * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinct()
   * @generated
   * @ordered
   */
  protected static final boolean DISTINCT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinct()
   * @generated
   * @ordered
   */
  protected boolean distinct = DISTINCT_EDEFAULT;

  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getResultColumns() <em>Result Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultColumns()
   * @generated
   * @ordered
   */
  protected EList<ResultColumn> resultColumns;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected JoinSource source;

  /**
   * The cached value of the '{@link #getWhereExpression() <em>Where Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereExpression()
   * @generated
   * @ordered
   */
  protected Expression whereExpression;

  /**
   * The cached value of the '{@link #getGroupByExpressions() <em>Group By Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupByExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> groupByExpressions;

  /**
   * The cached value of the '{@link #getHavingExpression() <em>Having Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHavingExpression()
   * @generated
   * @ordered
   */
  protected Expression havingExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectCoreExpressionImpl()
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
    return SqliteModelPackage.Literals.SELECT_CORE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistinct()
  {
    return distinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistinct(boolean newDistinct)
  {
    boolean oldDistinct = distinct;
    distinct = newDistinct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__DISTINCT, oldDistinct, distinct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResultColumn> getResultColumns()
  {
    if (resultColumns == null)
    {
      resultColumns = new EObjectContainmentEList<ResultColumn>(ResultColumn.class, this, SqliteModelPackage.SELECT_CORE_EXPRESSION__RESULT_COLUMNS);
    }
    return resultColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(JoinSource newSource, NotificationChain msgs)
  {
    JoinSource oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(JoinSource newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWhereExpression()
  {
    return whereExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereExpression(Expression newWhereExpression, NotificationChain msgs)
  {
    Expression oldWhereExpression = whereExpression;
    whereExpression = newWhereExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION, oldWhereExpression, newWhereExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhereExpression(Expression newWhereExpression)
  {
    if (newWhereExpression != whereExpression)
    {
      NotificationChain msgs = null;
      if (whereExpression != null)
        msgs = ((InternalEObject)whereExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION, null, msgs);
      if (newWhereExpression != null)
        msgs = ((InternalEObject)newWhereExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION, null, msgs);
      msgs = basicSetWhereExpression(newWhereExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION, newWhereExpression, newWhereExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getGroupByExpressions()
  {
    if (groupByExpressions == null)
    {
      groupByExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, SqliteModelPackage.SELECT_CORE_EXPRESSION__GROUP_BY_EXPRESSIONS);
    }
    return groupByExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getHavingExpression()
  {
    return havingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHavingExpression(Expression newHavingExpression, NotificationChain msgs)
  {
    Expression oldHavingExpression = havingExpression;
    havingExpression = newHavingExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION, oldHavingExpression, newHavingExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHavingExpression(Expression newHavingExpression)
  {
    if (newHavingExpression != havingExpression)
    {
      NotificationChain msgs = null;
      if (havingExpression != null)
        msgs = ((InternalEObject)havingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION, null, msgs);
      if (newHavingExpression != null)
        msgs = ((InternalEObject)newHavingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION, null, msgs);
      msgs = basicSetHavingExpression(newHavingExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION, newHavingExpression, newHavingExpression));
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
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__RESULT_COLUMNS:
        return ((InternalEList<?>)getResultColumns()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE:
        return basicSetSource(null, msgs);
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION:
        return basicSetWhereExpression(null, msgs);
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__GROUP_BY_EXPRESSIONS:
        return ((InternalEList<?>)getGroupByExpressions()).basicRemove(otherEnd, msgs);
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION:
        return basicSetHavingExpression(null, msgs);
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
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__DISTINCT:
        return isDistinct();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__ALL:
        return isAll();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__RESULT_COLUMNS:
        return getResultColumns();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE:
        return getSource();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION:
        return getWhereExpression();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__GROUP_BY_EXPRESSIONS:
        return getGroupByExpressions();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION:
        return getHavingExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__DISTINCT:
        setDistinct((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__ALL:
        setAll((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__RESULT_COLUMNS:
        getResultColumns().clear();
        getResultColumns().addAll((Collection<? extends ResultColumn>)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE:
        setSource((JoinSource)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION:
        setWhereExpression((Expression)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__GROUP_BY_EXPRESSIONS:
        getGroupByExpressions().clear();
        getGroupByExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION:
        setHavingExpression((Expression)newValue);
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
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__DISTINCT:
        setDistinct(DISTINCT_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__RESULT_COLUMNS:
        getResultColumns().clear();
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE:
        setSource((JoinSource)null);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION:
        setWhereExpression((Expression)null);
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__GROUP_BY_EXPRESSIONS:
        getGroupByExpressions().clear();
        return;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION:
        setHavingExpression((Expression)null);
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
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__DISTINCT:
        return distinct != DISTINCT_EDEFAULT;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__ALL:
        return all != ALL_EDEFAULT;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__RESULT_COLUMNS:
        return resultColumns != null && !resultColumns.isEmpty();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__SOURCE:
        return source != null;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__WHERE_EXPRESSION:
        return whereExpression != null;
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__GROUP_BY_EXPRESSIONS:
        return groupByExpressions != null && !groupByExpressions.isEmpty();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION__HAVING_EXPRESSION:
        return havingExpression != null;
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
    result.append(" (distinct: ");
    result.append(distinct);
    result.append(", all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //SelectCoreExpressionImpl
