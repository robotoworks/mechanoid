/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.util;

import com.robotoworks.mechanoid.sqlite.sqliteModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage
 * @generated
 */
public class SqliteModelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SqliteModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SqliteModelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SqliteModelPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DATABASE_BLOCK:
      {
        DatabaseBlock databaseBlock = (DatabaseBlock)theEObject;
        T result = caseDatabaseBlock(databaseBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CONFIG_BLOCK:
      {
        ConfigBlock configBlock = (ConfigBlock)theEObject;
        T result = caseConfigBlock(configBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CONFIGURATION_STATEMENT:
      {
        ConfigurationStatement configurationStatement = (ConfigurationStatement)theEObject;
        T result = caseConfigurationStatement(configurationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.MIGRATION_BLOCK:
      {
        MigrationBlock migrationBlock = (MigrationBlock)theEObject;
        T result = caseMigrationBlock(migrationBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SQL_EXPRESSION:
      {
        SqlExpression sqlExpression = (SqlExpression)theEObject;
        T result = caseSqlExpression(sqlExpression);
        if (result == null) result = caseExpression(sqlExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DDL_STATEMENT:
      {
        DDLStatement ddlStatement = (DDLStatement)theEObject;
        T result = caseDDLStatement(ddlStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DML_STATEMENT:
      {
        DMLStatement dmlStatement = (DMLStatement)theEObject;
        T result = caseDMLStatement(dmlStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DELETE_STATEMENT:
      {
        DeleteStatement deleteStatement = (DeleteStatement)theEObject;
        T result = caseDeleteStatement(deleteStatement);
        if (result == null) result = caseDMLStatement(deleteStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.INSERT_STATEMENT:
      {
        InsertStatement insertStatement = (InsertStatement)theEObject;
        T result = caseInsertStatement(insertStatement);
        if (result == null) result = caseDMLStatement(insertStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.UPDATE_STATEMENT:
      {
        UpdateStatement updateStatement = (UpdateStatement)theEObject;
        T result = caseUpdateStatement(updateStatement);
        if (result == null) result = caseDMLStatement(updateStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION:
      {
        UpdateColumnExpression updateColumnExpression = (UpdateColumnExpression)theEObject;
        T result = caseUpdateColumnExpression(updateColumnExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SELECT_STATEMENT:
      {
        SelectStatement selectStatement = (SelectStatement)theEObject;
        T result = caseSelectStatement(selectStatement);
        if (result == null) result = caseDMLStatement(selectStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ALTER_TABLE_CLAUSE:
      {
        AlterTableClause alterTableClause = (AlterTableClause)theEObject;
        T result = caseAlterTableClause(alterTableClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.COLUMN_DEF:
      {
        ColumnDef columnDef = (ColumnDef)theEObject;
        T result = caseColumnDef(columnDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.COLUMN_CONSTRAINT:
      {
        ColumnConstraint columnConstraint = (ColumnConstraint)theEObject;
        T result = caseColumnConstraint(columnConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DEFAULT_VALUE:
      {
        DefaultValue defaultValue = (DefaultValue)theEObject;
        T result = caseDefaultValue(defaultValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.TABLE_CONSTRAINT:
      {
        TableConstraint tableConstraint = (TableConstraint)theEObject;
        T result = caseTableConstraint(tableConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.INDEXED_COLUMN:
      {
        IndexedColumn indexedColumn = (IndexedColumn)theEObject;
        T result = caseIndexedColumn(indexedColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ORDERING_TERM:
      {
        OrderingTerm orderingTerm = (OrderingTerm)theEObject;
        T result = caseOrderingTerm(orderingTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SELECT_CORE:
      {
        SelectCore selectCore = (SelectCore)theEObject;
        T result = caseSelectCore(selectCore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.JOIN_SOURCE:
      {
        JoinSource joinSource = (JoinSource)theEObject;
        T result = caseJoinSource(joinSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SINGLE_SOURCE:
      {
        SingleSource singleSource = (SingleSource)theEObject;
        T result = caseSingleSource(singleSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.JOIN_STATEMENT:
      {
        JoinStatement joinStatement = (JoinStatement)theEObject;
        T result = caseJoinStatement(joinStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.RESULT_COLUMN:
      {
        ResultColumn resultColumn = (ResultColumn)theEObject;
        T result = caseResultColumn(resultColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CONFLICT_CLAUSE:
      {
        ConflictClause conflictClause = (ConflictClause)theEObject;
        T result = caseConflictClause(conflictClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.LITERAL_VALUE:
      {
        LiteralValue literalValue = (LiteralValue)theEObject;
        T result = caseLiteralValue(literalValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.TABLE_SOURCE:
      {
        TableSource tableSource = (TableSource)theEObject;
        T result = caseTableSource(tableSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ACTION_STATEMENT:
      {
        ActionStatement actionStatement = (ActionStatement)theEObject;
        T result = caseActionStatement(actionStatement);
        if (result == null) result = caseConfigurationStatement(actionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ACTIVE_RECORD_REGISTRATION_STATEMENT:
      {
        ActiveRecordRegistrationStatement activeRecordRegistrationStatement = (ActiveRecordRegistrationStatement)theEObject;
        T result = caseActiveRecordRegistrationStatement(activeRecordRegistrationStatement);
        if (result == null) result = caseConfigurationStatement(activeRecordRegistrationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_CONCAT:
      {
        ExprConcat exprConcat = (ExprConcat)theEObject;
        T result = caseExprConcat(exprConcat);
        if (result == null) result = caseExpression(exprConcat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_MULT:
      {
        ExprMult exprMult = (ExprMult)theEObject;
        T result = caseExprMult(exprMult);
        if (result == null) result = caseExpression(exprMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_ADD:
      {
        ExprAdd exprAdd = (ExprAdd)theEObject;
        T result = caseExprAdd(exprAdd);
        if (result == null) result = caseExpression(exprAdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_BIT:
      {
        ExprBit exprBit = (ExprBit)theEObject;
        T result = caseExprBit(exprBit);
        if (result == null) result = caseExpression(exprBit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_RELATE:
      {
        ExprRelate exprRelate = (ExprRelate)theEObject;
        T result = caseExprRelate(exprRelate);
        if (result == null) result = caseExpression(exprRelate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_EQUAL:
      {
        ExprEqual exprEqual = (ExprEqual)theEObject;
        T result = caseExprEqual(exprEqual);
        if (result == null) result = caseExpression(exprEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_AND:
      {
        ExprAnd exprAnd = (ExprAnd)theEObject;
        T result = caseExprAnd(exprAnd);
        if (result == null) result = caseExpression(exprAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPR_OR:
      {
        ExprOr exprOr = (ExprOr)theEObject;
        T result = caseExprOr(exprOr);
        if (result == null) result = caseExpression(exprOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.COLUMN_LITERAL:
      {
        ColumnLiteral columnLiteral = (ColumnLiteral)theEObject;
        T result = caseColumnLiteral(columnLiteral);
        if (result == null) result = caseExpression(columnLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SELECT_STATEMENT_EXPRESSION:
      {
        SelectStatementExpression selectStatementExpression = (SelectStatementExpression)theEObject;
        T result = caseSelectStatementExpression(selectStatementExpression);
        if (result == null) result = caseExpression(selectStatementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CASE_EXPRESSION:
      {
        CaseExpression caseExpression = (CaseExpression)theEObject;
        T result = caseCaseExpression(caseExpression);
        if (result == null) result = caseExpression(caseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseExpression(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CAST_EXPRESSION:
      {
        CastExpression castExpression = (CastExpression)theEObject;
        T result = caseCastExpression(castExpression);
        if (result == null) result = caseExpression(castExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CREATE_TABLE_STATEMENT:
      {
        CreateTableStatement createTableStatement = (CreateTableStatement)theEObject;
        T result = caseCreateTableStatement(createTableStatement);
        if (result == null) result = caseDDLStatement(createTableStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CREATE_VIEW_STATEMENT:
      {
        CreateViewStatement createViewStatement = (CreateViewStatement)theEObject;
        T result = caseCreateViewStatement(createViewStatement);
        if (result == null) result = caseDDLStatement(createViewStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT:
      {
        CreateTriggerStatement createTriggerStatement = (CreateTriggerStatement)theEObject;
        T result = caseCreateTriggerStatement(createTriggerStatement);
        if (result == null) result = caseDDLStatement(createTriggerStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ALTER_TABLE_STATEMENT:
      {
        AlterTableStatement alterTableStatement = (AlterTableStatement)theEObject;
        T result = caseAlterTableStatement(alterTableStatement);
        if (result == null) result = caseDDLStatement(alterTableStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DROP_TABLE_STATEMENT:
      {
        DropTableStatement dropTableStatement = (DropTableStatement)theEObject;
        T result = caseDropTableStatement(dropTableStatement);
        if (result == null) result = caseDDLStatement(dropTableStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT:
      {
        DropTriggerStatement dropTriggerStatement = (DropTriggerStatement)theEObject;
        T result = caseDropTriggerStatement(dropTriggerStatement);
        if (result == null) result = caseDDLStatement(dropTriggerStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DROP_VIEW_STATEMENT:
      {
        DropViewStatement dropViewStatement = (DropViewStatement)theEObject;
        T result = caseDropViewStatement(dropViewStatement);
        if (result == null) result = caseDDLStatement(dropViewStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ALTER_TABLE_RENAME_CLAUSE:
      {
        AlterTableRenameClause alterTableRenameClause = (AlterTableRenameClause)theEObject;
        T result = caseAlterTableRenameClause(alterTableRenameClause);
        if (result == null) result = caseAlterTableClause(alterTableRenameClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_CLAUSE:
      {
        AlterTableAddColumnClause alterTableAddColumnClause = (AlterTableAddColumnClause)theEObject;
        T result = caseAlterTableAddColumnClause(alterTableAddColumnClause);
        if (result == null) result = caseAlterTableClause(alterTableAddColumnClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT:
      {
        PrimaryKeyColumnConstraint primaryKeyColumnConstraint = (PrimaryKeyColumnConstraint)theEObject;
        T result = casePrimaryKeyColumnConstraint(primaryKeyColumnConstraint);
        if (result == null) result = caseColumnConstraint(primaryKeyColumnConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.NOT_NULL_CONSTRAINT:
      {
        NotNullConstraint notNullConstraint = (NotNullConstraint)theEObject;
        T result = caseNotNullConstraint(notNullConstraint);
        if (result == null) result = caseColumnConstraint(notNullConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.DEFAULT_CONSTRAINT:
      {
        DefaultConstraint defaultConstraint = (DefaultConstraint)theEObject;
        T result = caseDefaultConstraint(defaultConstraint);
        if (result == null) result = caseColumnConstraint(defaultConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.LITERAL_DEFAULT_VALUE:
      {
        LiteralDefaultValue literalDefaultValue = (LiteralDefaultValue)theEObject;
        T result = caseLiteralDefaultValue(literalDefaultValue);
        if (result == null) result = caseDefaultValue(literalDefaultValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.EXPRESSION_DEFAULT_VALUE:
      {
        ExpressionDefaultValue expressionDefaultValue = (ExpressionDefaultValue)theEObject;
        T result = caseExpressionDefaultValue(expressionDefaultValue);
        if (result == null) result = caseDefaultValue(expressionDefaultValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.UNIQUE_TABLE_CONTRAINT:
      {
        UniqueTableContraint uniqueTableContraint = (UniqueTableContraint)theEObject;
        T result = caseUniqueTableContraint(uniqueTableContraint);
        if (result == null) result = caseTableConstraint(uniqueTableContraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.PRIMARY_CONTRAINT:
      {
        PrimaryContraint primaryContraint = (PrimaryContraint)theEObject;
        T result = casePrimaryContraint(primaryContraint);
        if (result == null) result = caseTableConstraint(primaryContraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CHECK_TABLE_CONSTRAINT:
      {
        CheckTableConstraint checkTableConstraint = (CheckTableConstraint)theEObject;
        T result = caseCheckTableConstraint(checkTableConstraint);
        if (result == null) result = caseTableConstraint(checkTableConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SINGLE_SOURCE_TABLE:
      {
        SingleSourceTable singleSourceTable = (SingleSourceTable)theEObject;
        T result = caseSingleSourceTable(singleSourceTable);
        if (result == null) result = caseSingleSource(singleSourceTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT:
      {
        SingleSourceSelectStatement singleSourceSelectStatement = (SingleSourceSelectStatement)theEObject;
        T result = caseSingleSourceSelectStatement(singleSourceSelectStatement);
        if (result == null) result = caseSingleSource(singleSourceSelectStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.SINGLE_SOURCE_JOIN:
      {
        SingleSourceJoin singleSourceJoin = (SingleSourceJoin)theEObject;
        T result = caseSingleSourceJoin(singleSourceJoin);
        if (result == null) result = caseSingleSource(singleSourceJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.RESULT_COLUMN_ALL:
      {
        ResultColumnAll resultColumnAll = (ResultColumnAll)theEObject;
        T result = caseResultColumnAll(resultColumnAll);
        if (result == null) result = caseResultColumn(resultColumnAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.RESULT_COLUMN_EXPRESSION:
      {
        ResultColumnExpression resultColumnExpression = (ResultColumnExpression)theEObject;
        T result = caseResultColumnExpression(resultColumnExpression);
        if (result == null) result = caseResultColumn(resultColumnExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.NUMERIC_LITERAL:
      {
        NumericLiteral numericLiteral = (NumericLiteral)theEObject;
        T result = caseNumericLiteral(numericLiteral);
        if (result == null) result = caseLiteralValue(numericLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteralValue(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseLiteralValue(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CURRENT_TIME_LITERAL:
      {
        CurrentTimeLiteral currentTimeLiteral = (CurrentTimeLiteral)theEObject;
        T result = caseCurrentTimeLiteral(currentTimeLiteral);
        if (result == null) result = caseLiteralValue(currentTimeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CURRENT_DATE_LITERAL:
      {
        CurrentDateLiteral currentDateLiteral = (CurrentDateLiteral)theEObject;
        T result = caseCurrentDateLiteral(currentDateLiteral);
        if (result == null) result = caseLiteralValue(currentDateLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqliteModelPackage.CURRENT_TIME_STAMP_LITERAL:
      {
        CurrentTimeStampLiteral currentTimeStampLiteral = (CurrentTimeStampLiteral)theEObject;
        T result = caseCurrentTimeStampLiteral(currentTimeStampLiteral);
        if (result == null) result = caseLiteralValue(currentTimeStampLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseBlock(DatabaseBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigBlock(ConfigBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationStatement(ConfigurationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migration Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migration Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigrationBlock(MigrationBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sql Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sql Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSqlExpression(SqlExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DDL Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DDL Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDDLStatement(DDLStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DML Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DML Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDMLStatement(DMLStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteStatement(DeleteStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertStatement(InsertStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateStatement(UpdateStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Column Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Column Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateColumnExpression(UpdateColumnExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectStatement(SelectStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alter Table Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alter Table Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlterTableClause(AlterTableClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnDef(ColumnDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnConstraint(ColumnConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultValue(DefaultValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableConstraint(TableConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexedColumn(IndexedColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordering Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordering Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderingTerm(OrderingTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Core</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Core</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectCore(SelectCore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinSource(JoinSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleSource(SingleSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinStatement(JoinStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultColumn(ResultColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conflict Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conflict Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConflictClause(ConflictClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralValue(LiteralValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableSource(TableSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionStatement(ActionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Active Record Registration Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Active Record Registration Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActiveRecordRegistrationStatement(ActiveRecordRegistrationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Concat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Concat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprConcat(ExprConcat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprMult(ExprMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAdd(ExprAdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Bit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Bit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBit(ExprBit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Relate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Relate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprRelate(ExprRelate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprEqual(ExprEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAnd(ExprAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprOr(ExprOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnLiteral(ColumnLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Statement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectStatementExpression(SelectStatementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseExpression(CaseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastExpression(CastExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Table Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Table Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateTableStatement(CreateTableStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create View Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create View Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateViewStatement(CreateViewStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Trigger Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Trigger Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateTriggerStatement(CreateTriggerStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alter Table Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alter Table Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlterTableStatement(AlterTableStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Table Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Table Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropTableStatement(DropTableStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Trigger Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Trigger Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropTriggerStatement(DropTriggerStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop View Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop View Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropViewStatement(DropViewStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alter Table Rename Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alter Table Rename Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlterTableRenameClause(AlterTableRenameClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alter Table Add Column Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alter Table Add Column Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlterTableAddColumnClause(AlterTableAddColumnClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Key Column Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Key Column Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryKeyColumnConstraint(PrimaryKeyColumnConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Null Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Null Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotNullConstraint(NotNullConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultConstraint(DefaultConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Default Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Default Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralDefaultValue(LiteralDefaultValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Default Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Default Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionDefaultValue(ExpressionDefaultValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unique Table Contraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unique Table Contraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniqueTableContraint(UniqueTableContraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Contraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Contraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryContraint(PrimaryContraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Table Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Table Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckTableConstraint(CheckTableConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Source Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Source Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleSourceTable(SingleSourceTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Source Select Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Source Select Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleSourceSelectStatement(SingleSourceSelectStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Source Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Source Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleSourceJoin(SingleSourceJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Column All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Column All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultColumnAll(ResultColumnAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Column Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Column Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultColumnExpression(ResultColumnExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericLiteral(NumericLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Time Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Time Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentTimeLiteral(CurrentTimeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Date Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Date Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentDateLiteral(CurrentDateLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Time Stamp Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Time Stamp Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentTimeStampLiteral(CurrentTimeStampLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SqliteModelSwitch
