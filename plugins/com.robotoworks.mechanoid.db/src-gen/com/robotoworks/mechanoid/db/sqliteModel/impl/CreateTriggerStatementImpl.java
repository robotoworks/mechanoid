/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DMLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Trigger Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#isTemporary <em>Temporary</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getUpdateColumnNames <em>Update Column Names</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getForEachRow <em>For Each Row</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateTriggerStatementImpl extends DDLStatementImpl implements CreateTriggerStatement
{
  /**
   * The default value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTemporary()
   * @generated
   * @ordered
   */
  protected static final boolean TEMPORARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTemporary()
   * @generated
   * @ordered
   */
  protected boolean temporary = TEMPORARY_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected static final String WHEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected String when = WHEN_EDEFAULT;

  /**
   * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventType()
   * @generated
   * @ordered
   */
  protected static final String EVENT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventType()
   * @generated
   * @ordered
   */
  protected String eventType = EVENT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUpdateColumnNames() <em>Update Column Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateColumnNames()
   * @generated
   * @ordered
   */
  protected EList<String> updateColumnNames;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected TableDefinition table;

  /**
   * The default value of the '{@link #getForEachRow() <em>For Each Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForEachRow()
   * @generated
   * @ordered
   */
  protected static final String FOR_EACH_ROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForEachRow() <em>For Each Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForEachRow()
   * @generated
   * @ordered
   */
  protected String forEachRow = FOR_EACH_ROW_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhenExpression() <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenExpression()
   * @generated
   * @ordered
   */
  protected Expression whenExpression;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<DMLStatement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateTriggerStatementImpl()
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
    return SqliteModelPackage.Literals.CREATE_TRIGGER_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTemporary()
  {
    return temporary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemporary(boolean newTemporary)
  {
    boolean oldTemporary = temporary;
    temporary = newTemporary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TEMPORARY, oldTemporary, temporary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhen(String newWhen)
  {
    String oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN, oldWhen, when));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventType()
  {
    return eventType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventType(String newEventType)
  {
    String oldEventType = eventType;
    eventType = newEventType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__EVENT_TYPE, oldEventType, eventType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUpdateColumnNames()
  {
    if (updateColumnNames == null)
    {
      updateColumnNames = new EDataTypeEList<String>(String.class, this, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES);
    }
    return updateColumnNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition getTable()
  {
    if (table != null && table.eIsProxy())
    {
      InternalEObject oldTable = (InternalEObject)table;
      table = (TableDefinition)eResolveProxy(oldTable);
      if (table != oldTable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE, oldTable, table));
      }
    }
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition basicGetTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(TableDefinition newTable)
  {
    TableDefinition oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getForEachRow()
  {
    return forEachRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForEachRow(String newForEachRow)
  {
    String oldForEachRow = forEachRow;
    forEachRow = newForEachRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW, oldForEachRow, forEachRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWhenExpression()
  {
    return whenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenExpression(Expression newWhenExpression, NotificationChain msgs)
  {
    Expression oldWhenExpression = whenExpression;
    whenExpression = newWhenExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, oldWhenExpression, newWhenExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenExpression(Expression newWhenExpression)
  {
    if (newWhenExpression != whenExpression)
    {
      NotificationChain msgs = null;
      if (whenExpression != null)
        msgs = ((InternalEObject)whenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, null, msgs);
      if (newWhenExpression != null)
        msgs = ((InternalEObject)newWhenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, null, msgs);
      msgs = basicSetWhenExpression(newWhenExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION, newWhenExpression, newWhenExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DMLStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<DMLStatement>(DMLStatement.class, this, SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS);
    }
    return statements;
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        return basicSetWhenExpression(null, msgs);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TEMPORARY:
        return isTemporary();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__NAME:
        return getName();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN:
        return getWhen();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__EVENT_TYPE:
        return getEventType();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        return getUpdateColumnNames();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE:
        if (resolve) return getTable();
        return basicGetTable();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW:
        return getForEachRow();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        return getWhenExpression();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        return getStatements();
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TEMPORARY:
        setTemporary((Boolean)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN:
        setWhen((String)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__EVENT_TYPE:
        setEventType((String)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        getUpdateColumnNames().clear();
        getUpdateColumnNames().addAll((Collection<? extends String>)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE:
        setTable((TableDefinition)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW:
        setForEachRow((String)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        setWhenExpression((Expression)newValue);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends DMLStatement>)newValue);
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TEMPORARY:
        setTemporary(TEMPORARY_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN:
        setWhen(WHEN_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__EVENT_TYPE:
        setEventType(EVENT_TYPE_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        getUpdateColumnNames().clear();
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE:
        setTable((TableDefinition)null);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW:
        setForEachRow(FOR_EACH_ROW_EDEFAULT);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        setWhenExpression((Expression)null);
        return;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        getStatements().clear();
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
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TEMPORARY:
        return temporary != TEMPORARY_EDEFAULT;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN:
        return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__EVENT_TYPE:
        return EVENT_TYPE_EDEFAULT == null ? eventType != null : !EVENT_TYPE_EDEFAULT.equals(eventType);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES:
        return updateColumnNames != null && !updateColumnNames.isEmpty();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__TABLE:
        return table != null;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW:
        return FOR_EACH_ROW_EDEFAULT == null ? forEachRow != null : !FOR_EACH_ROW_EDEFAULT.equals(forEachRow);
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION:
        return whenExpression != null;
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
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
    result.append(" (temporary: ");
    result.append(temporary);
    result.append(", name: ");
    result.append(name);
    result.append(", when: ");
    result.append(when);
    result.append(", eventType: ");
    result.append(eventType);
    result.append(", updateColumnNames: ");
    result.append(updateColumnNames);
    result.append(", forEachRow: ");
    result.append(forEachRow);
    result.append(')');
    return result.toString();
  }

} //CreateTriggerStatementImpl
