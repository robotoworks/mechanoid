/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectList;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#isAll <em>All</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#isAllColumns <em>All Columns</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#getSelectList <em>Select List</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl#getHaving <em>Having</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectExpressionImpl extends SelectCoreExpressionImpl implements SelectExpression
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
   * The default value of the '{@link #isAllColumns() <em>All Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllColumns()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_COLUMNS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllColumns() <em>All Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllColumns()
   * @generated
   * @ordered
   */
  protected boolean allColumns = ALL_COLUMNS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelectList() <em>Select List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectList()
   * @generated
   * @ordered
   */
  protected SelectList selectList;

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
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected WhereExpressions where;

  /**
   * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupBy()
   * @generated
   * @ordered
   */
  protected GroupByExpressions groupBy;

  /**
   * The cached value of the '{@link #getHaving() <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHaving()
   * @generated
   * @ordered
   */
  protected HavingExpressions having;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectExpressionImpl()
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
    return SqliteModelPackage.Literals.SELECT_EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__DISTINCT, oldDistinct, distinct));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllColumns()
  {
    return allColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllColumns(boolean newAllColumns)
  {
    boolean oldAllColumns = allColumns;
    allColumns = newAllColumns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__ALL_COLUMNS, oldAllColumns, allColumns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectList getSelectList()
  {
    return selectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectList(SelectList newSelectList, NotificationChain msgs)
  {
    SelectList oldSelectList = selectList;
    selectList = newSelectList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST, oldSelectList, newSelectList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectList(SelectList newSelectList)
  {
    if (newSelectList != selectList)
    {
      NotificationChain msgs = null;
      if (selectList != null)
        msgs = ((InternalEObject)selectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST, null, msgs);
      if (newSelectList != null)
        msgs = ((InternalEObject)newSelectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST, null, msgs);
      msgs = basicSetSelectList(newSelectList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST, newSelectList, newSelectList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__SOURCE, oldSource, newSource);
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
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereExpressions getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhere(WhereExpressions newWhere, NotificationChain msgs)
  {
    WhereExpressions oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__WHERE, oldWhere, newWhere);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhere(WhereExpressions newWhere)
  {
    if (newWhere != where)
    {
      NotificationChain msgs = null;
      if (where != null)
        msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__WHERE, null, msgs);
      if (newWhere != null)
        msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__WHERE, null, msgs);
      msgs = basicSetWhere(newWhere, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__WHERE, newWhere, newWhere));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupByExpressions getGroupBy()
  {
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupBy(GroupByExpressions newGroupBy, NotificationChain msgs)
  {
    GroupByExpressions oldGroupBy = groupBy;
    groupBy = newGroupBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY, oldGroupBy, newGroupBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupBy(GroupByExpressions newGroupBy)
  {
    if (newGroupBy != groupBy)
    {
      NotificationChain msgs = null;
      if (groupBy != null)
        msgs = ((InternalEObject)groupBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY, null, msgs);
      if (newGroupBy != null)
        msgs = ((InternalEObject)newGroupBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY, null, msgs);
      msgs = basicSetGroupBy(newGroupBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY, newGroupBy, newGroupBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingExpressions getHaving()
  {
    return having;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHaving(HavingExpressions newHaving, NotificationChain msgs)
  {
    HavingExpressions oldHaving = having;
    having = newHaving;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__HAVING, oldHaving, newHaving);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHaving(HavingExpressions newHaving)
  {
    if (newHaving != having)
    {
      NotificationChain msgs = null;
      if (having != null)
        msgs = ((InternalEObject)having).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__HAVING, null, msgs);
      if (newHaving != null)
        msgs = ((InternalEObject)newHaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.SELECT_EXPRESSION__HAVING, null, msgs);
      msgs = basicSetHaving(newHaving, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.SELECT_EXPRESSION__HAVING, newHaving, newHaving));
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
      case SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST:
        return basicSetSelectList(null, msgs);
      case SqliteModelPackage.SELECT_EXPRESSION__SOURCE:
        return basicSetSource(null, msgs);
      case SqliteModelPackage.SELECT_EXPRESSION__WHERE:
        return basicSetWhere(null, msgs);
      case SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY:
        return basicSetGroupBy(null, msgs);
      case SqliteModelPackage.SELECT_EXPRESSION__HAVING:
        return basicSetHaving(null, msgs);
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
      case SqliteModelPackage.SELECT_EXPRESSION__DISTINCT:
        return isDistinct();
      case SqliteModelPackage.SELECT_EXPRESSION__ALL:
        return isAll();
      case SqliteModelPackage.SELECT_EXPRESSION__ALL_COLUMNS:
        return isAllColumns();
      case SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST:
        return getSelectList();
      case SqliteModelPackage.SELECT_EXPRESSION__SOURCE:
        return getSource();
      case SqliteModelPackage.SELECT_EXPRESSION__WHERE:
        return getWhere();
      case SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY:
        return getGroupBy();
      case SqliteModelPackage.SELECT_EXPRESSION__HAVING:
        return getHaving();
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
      case SqliteModelPackage.SELECT_EXPRESSION__DISTINCT:
        setDistinct((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__ALL:
        setAll((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__ALL_COLUMNS:
        setAllColumns((Boolean)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST:
        setSelectList((SelectList)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__SOURCE:
        setSource((JoinSource)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__WHERE:
        setWhere((WhereExpressions)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY:
        setGroupBy((GroupByExpressions)newValue);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__HAVING:
        setHaving((HavingExpressions)newValue);
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
      case SqliteModelPackage.SELECT_EXPRESSION__DISTINCT:
        setDistinct(DISTINCT_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__ALL_COLUMNS:
        setAllColumns(ALL_COLUMNS_EDEFAULT);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST:
        setSelectList((SelectList)null);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__SOURCE:
        setSource((JoinSource)null);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__WHERE:
        setWhere((WhereExpressions)null);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY:
        setGroupBy((GroupByExpressions)null);
        return;
      case SqliteModelPackage.SELECT_EXPRESSION__HAVING:
        setHaving((HavingExpressions)null);
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
      case SqliteModelPackage.SELECT_EXPRESSION__DISTINCT:
        return distinct != DISTINCT_EDEFAULT;
      case SqliteModelPackage.SELECT_EXPRESSION__ALL:
        return all != ALL_EDEFAULT;
      case SqliteModelPackage.SELECT_EXPRESSION__ALL_COLUMNS:
        return allColumns != ALL_COLUMNS_EDEFAULT;
      case SqliteModelPackage.SELECT_EXPRESSION__SELECT_LIST:
        return selectList != null;
      case SqliteModelPackage.SELECT_EXPRESSION__SOURCE:
        return source != null;
      case SqliteModelPackage.SELECT_EXPRESSION__WHERE:
        return where != null;
      case SqliteModelPackage.SELECT_EXPRESSION__GROUP_BY:
        return groupBy != null;
      case SqliteModelPackage.SELECT_EXPRESSION__HAVING:
        return having != null;
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
    result.append(", allColumns: ");
    result.append(allColumns);
    result.append(')');
    return result.toString();
  }

} //SelectExpressionImpl
