/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.util;

import com.robotoworks.mechanoid.db.sqliteModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage
 * @generated
 */
public class SqliteModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SqliteModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SqliteModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SqliteModelSwitch<Adapter> modelSwitch =
    new SqliteModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDatabaseBlock(DatabaseBlock object)
      {
        return createDatabaseBlockAdapter();
      }
      @Override
      public Adapter caseConfigBlock(ConfigBlock object)
      {
        return createConfigBlockAdapter();
      }
      @Override
      public Adapter caseInitBlock(InitBlock object)
      {
        return createInitBlockAdapter();
      }
      @Override
      public Adapter caseConfigurationStatement(ConfigurationStatement object)
      {
        return createConfigurationStatementAdapter();
      }
      @Override
      public Adapter caseFunctionArg(FunctionArg object)
      {
        return createFunctionArgAdapter();
      }
      @Override
      public Adapter caseContentUri(ContentUri object)
      {
        return createContentUriAdapter();
      }
      @Override
      public Adapter caseContentUriSegment(ContentUriSegment object)
      {
        return createContentUriSegmentAdapter();
      }
      @Override
      public Adapter caseMigrationBlock(MigrationBlock object)
      {
        return createMigrationBlockAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseSelectStatement(SelectStatement object)
      {
        return createSelectStatementAdapter();
      }
      @Override
      public Adapter caseOrderingTermList(OrderingTermList object)
      {
        return createOrderingTermListAdapter();
      }
      @Override
      public Adapter caseSelectCoreExpression(SelectCoreExpression object)
      {
        return createSelectCoreExpressionAdapter();
      }
      @Override
      public Adapter caseSelectList(SelectList object)
      {
        return createSelectListAdapter();
      }
      @Override
      public Adapter caseWhereExpressions(WhereExpressions object)
      {
        return createWhereExpressionsAdapter();
      }
      @Override
      public Adapter caseGroupByExpressions(GroupByExpressions object)
      {
        return createGroupByExpressionsAdapter();
      }
      @Override
      public Adapter caseHavingExpressions(HavingExpressions object)
      {
        return createHavingExpressionsAdapter();
      }
      @Override
      public Adapter caseOrderingTerm(OrderingTerm object)
      {
        return createOrderingTermAdapter();
      }
      @Override
      public Adapter caseJoinSource(JoinSource object)
      {
        return createJoinSourceAdapter();
      }
      @Override
      public Adapter caseSingleSource(SingleSource object)
      {
        return createSingleSourceAdapter();
      }
      @Override
      public Adapter caseSelectSource(SelectSource object)
      {
        return createSelectSourceAdapter();
      }
      @Override
      public Adapter caseSingleSourceJoin(SingleSourceJoin object)
      {
        return createSingleSourceJoinAdapter();
      }
      @Override
      public Adapter caseJoinStatement(JoinStatement object)
      {
        return createJoinStatementAdapter();
      }
      @Override
      public Adapter caseColumnSource(ColumnSource object)
      {
        return createColumnSourceAdapter();
      }
      @Override
      public Adapter caseLiteralValue(LiteralValue object)
      {
        return createLiteralValueAdapter();
      }
      @Override
      public Adapter caseDDLStatement(DDLStatement object)
      {
        return createDDLStatementAdapter();
      }
      @Override
      public Adapter caseTableDefinition(TableDefinition object)
      {
        return createTableDefinitionAdapter();
      }
      @Override
      public Adapter caseCreateTriggerStatement(CreateTriggerStatement object)
      {
        return createCreateTriggerStatementAdapter();
      }
      @Override
      public Adapter caseAlterTableAddColumnStatement(AlterTableAddColumnStatement object)
      {
        return createAlterTableAddColumnStatementAdapter();
      }
      @Override
      public Adapter caseDropTableStatement(DropTableStatement object)
      {
        return createDropTableStatementAdapter();
      }
      @Override
      public Adapter caseDropTriggerStatement(DropTriggerStatement object)
      {
        return createDropTriggerStatementAdapter();
      }
      @Override
      public Adapter caseDropViewStatement(DropViewStatement object)
      {
        return createDropViewStatementAdapter();
      }
      @Override
      public Adapter caseCreateIndexStatement(CreateIndexStatement object)
      {
        return createCreateIndexStatementAdapter();
      }
      @Override
      public Adapter caseDropIndexStatement(DropIndexStatement object)
      {
        return createDropIndexStatementAdapter();
      }
      @Override
      public Adapter caseColumnConstraint(ColumnConstraint object)
      {
        return createColumnConstraintAdapter();
      }
      @Override
      public Adapter caseTableConstraint(TableConstraint object)
      {
        return createTableConstraintAdapter();
      }
      @Override
      public Adapter caseUniqueTableConstraint(UniqueTableConstraint object)
      {
        return createUniqueTableConstraintAdapter();
      }
      @Override
      public Adapter casePrimaryConstraint(PrimaryConstraint object)
      {
        return createPrimaryConstraintAdapter();
      }
      @Override
      public Adapter caseCheckTableConstraint(CheckTableConstraint object)
      {
        return createCheckTableConstraintAdapter();
      }
      @Override
      public Adapter caseIndexedColumn(IndexedColumn object)
      {
        return createIndexedColumnAdapter();
      }
      @Override
      public Adapter caseDefaultValue(DefaultValue object)
      {
        return createDefaultValueAdapter();
      }
      @Override
      public Adapter caseConflictClause(ConflictClause object)
      {
        return createConflictClauseAdapter();
      }
      @Override
      public Adapter caseDMLStatement(DMLStatement object)
      {
        return createDMLStatementAdapter();
      }
      @Override
      public Adapter caseDeleteStatement(DeleteStatement object)
      {
        return createDeleteStatementAdapter();
      }
      @Override
      public Adapter caseInsertStatement(InsertStatement object)
      {
        return createInsertStatementAdapter();
      }
      @Override
      public Adapter caseUpdateStatement(UpdateStatement object)
      {
        return createUpdateStatementAdapter();
      }
      @Override
      public Adapter caseUpdateColumnExpression(UpdateColumnExpression object)
      {
        return createUpdateColumnExpressionAdapter();
      }
      @Override
      public Adapter caseActionStatement(ActionStatement object)
      {
        return createActionStatementAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseContentUriParamSegment(ContentUriParamSegment object)
      {
        return createContentUriParamSegmentAdapter();
      }
      @Override
      public Adapter caseExprConcat(ExprConcat object)
      {
        return createExprConcatAdapter();
      }
      @Override
      public Adapter caseExprMult(ExprMult object)
      {
        return createExprMultAdapter();
      }
      @Override
      public Adapter caseExprAdd(ExprAdd object)
      {
        return createExprAddAdapter();
      }
      @Override
      public Adapter caseExprBit(ExprBit object)
      {
        return createExprBitAdapter();
      }
      @Override
      public Adapter caseExprRelate(ExprRelate object)
      {
        return createExprRelateAdapter();
      }
      @Override
      public Adapter caseExprEqual(ExprEqual object)
      {
        return createExprEqualAdapter();
      }
      @Override
      public Adapter caseExprAnd(ExprAnd object)
      {
        return createExprAndAdapter();
      }
      @Override
      public Adapter caseExprOr(ExprOr object)
      {
        return createExprOrAdapter();
      }
      @Override
      public Adapter caseNullCheckExpression(NullCheckExpression object)
      {
        return createNullCheckExpressionAdapter();
      }
      @Override
      public Adapter caseIsNull(IsNull object)
      {
        return createIsNullAdapter();
      }
      @Override
      public Adapter caseNotNull(NotNull object)
      {
        return createNotNullAdapter();
      }
      @Override
      public Adapter caseNewColumn(NewColumn object)
      {
        return createNewColumnAdapter();
      }
      @Override
      public Adapter caseOldColumn(OldColumn object)
      {
        return createOldColumnAdapter();
      }
      @Override
      public Adapter caseColumnSourceRef(ColumnSourceRef object)
      {
        return createColumnSourceRefAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNestedExpression(NestedExpression object)
      {
        return createNestedExpressionAdapter();
      }
      @Override
      public Adapter caseSelectStatementExpression(SelectStatementExpression object)
      {
        return createSelectStatementExpressionAdapter();
      }
      @Override
      public Adapter caseCaseExpression(CaseExpression object)
      {
        return createCaseExpressionAdapter();
      }
      @Override
      public Adapter caseCastExpression(CastExpression object)
      {
        return createCastExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionArgument(FunctionArgument object)
      {
        return createFunctionArgumentAdapter();
      }
      @Override
      public Adapter caseSelectCore(SelectCore object)
      {
        return createSelectCoreAdapter();
      }
      @Override
      public Adapter caseSelectExpression(SelectExpression object)
      {
        return createSelectExpressionAdapter();
      }
      @Override
      public Adapter caseSingleSourceTable(SingleSourceTable object)
      {
        return createSingleSourceTableAdapter();
      }
      @Override
      public Adapter caseSingleSourceSelectStatement(SingleSourceSelectStatement object)
      {
        return createSingleSourceSelectStatementAdapter();
      }
      @Override
      public Adapter caseResultColumn(ResultColumn object)
      {
        return createResultColumnAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter caseCurrentTimeLiteral(CurrentTimeLiteral object)
      {
        return createCurrentTimeLiteralAdapter();
      }
      @Override
      public Adapter caseCurrentDateLiteral(CurrentDateLiteral object)
      {
        return createCurrentDateLiteralAdapter();
      }
      @Override
      public Adapter caseCurrentTimeStampLiteral(CurrentTimeStampLiteral object)
      {
        return createCurrentTimeStampLiteralAdapter();
      }
      @Override
      public Adapter caseCreateTableStatement(CreateTableStatement object)
      {
        return createCreateTableStatementAdapter();
      }
      @Override
      public Adapter caseCreateViewStatement(CreateViewStatement object)
      {
        return createCreateViewStatementAdapter();
      }
      @Override
      public Adapter caseAlterTableRenameStatement(AlterTableRenameStatement object)
      {
        return createAlterTableRenameStatementAdapter();
      }
      @Override
      public Adapter caseColumnDef(ColumnDef object)
      {
        return createColumnDefAdapter();
      }
      @Override
      public Adapter casePrimaryKeyColumnConstraint(PrimaryKeyColumnConstraint object)
      {
        return createPrimaryKeyColumnConstraintAdapter();
      }
      @Override
      public Adapter caseNotNullConstraint(NotNullConstraint object)
      {
        return createNotNullConstraintAdapter();
      }
      @Override
      public Adapter caseUniqueConstraint(UniqueConstraint object)
      {
        return createUniqueConstraintAdapter();
      }
      @Override
      public Adapter caseDefaultConstraint(DefaultConstraint object)
      {
        return createDefaultConstraintAdapter();
      }
      @Override
      public Adapter caseCheckConstraint(CheckConstraint object)
      {
        return createCheckConstraintAdapter();
      }
      @Override
      public Adapter caseLiteralDefaultValue(LiteralDefaultValue object)
      {
        return createLiteralDefaultValueAdapter();
      }
      @Override
      public Adapter caseExpressionDefaultValue(ExpressionDefaultValue object)
      {
        return createExpressionDefaultValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock <em>Database Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock
   * @generated
   */
  public Adapter createDatabaseBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock <em>Config Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock
   * @generated
   */
  public Adapter createConfigBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.InitBlock <em>Init Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InitBlock
   * @generated
   */
  public Adapter createInitBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement <em>Configuration Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement
   * @generated
   */
  public Adapter createConfigurationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg <em>Function Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArg
   * @generated
   */
  public Adapter createFunctionArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUri <em>Content Uri</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUri
   * @generated
   */
  public Adapter createContentUriAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment <em>Content Uri Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment
   * @generated
   */
  public Adapter createContentUriSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock <em>Migration Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock
   * @generated
   */
  public Adapter createMigrationBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatement
   * @generated
   */
  public Adapter createSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList <em>Ordering Term List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList
   * @generated
   */
  public Adapter createOrderingTermListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression <em>Select Core Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression
   * @generated
   */
  public Adapter createSelectCoreExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectList <em>Select List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectList
   * @generated
   */
  public Adapter createSelectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions <em>Where Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions
   * @generated
   */
  public Adapter createWhereExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions <em>Group By Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions
   * @generated
   */
  public Adapter createGroupByExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions <em>Having Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions
   * @generated
   */
  public Adapter createHavingExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm <em>Ordering Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm
   * @generated
   */
  public Adapter createOrderingTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinSource
   * @generated
   */
  public Adapter createJoinSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSource
   * @generated
   */
  public Adapter createSingleSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectSource <em>Select Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectSource
   * @generated
   */
  public Adapter createSelectSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin <em>Single Source Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin
   * @generated
   */
  public Adapter createSingleSourceJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement
   * @generated
   */
  public Adapter createJoinStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSource <em>Column Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSource
   * @generated
   */
  public Adapter createColumnSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.LiteralValue
   * @generated
   */
  public Adapter createLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DDLStatement <em>DDL Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DDLStatement
   * @generated
   */
  public Adapter createDDLStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.TableDefinition
   * @generated
   */
  public Adapter createTableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement <em>Create Trigger Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement
   * @generated
   */
  public Adapter createCreateTriggerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement <em>Alter Table Add Column Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement
   * @generated
   */
  public Adapter createAlterTableAddColumnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement <em>Drop Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement
   * @generated
   */
  public Adapter createDropTableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement <em>Drop Trigger Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement
   * @generated
   */
  public Adapter createDropTriggerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement <em>Drop View Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement
   * @generated
   */
  public Adapter createDropViewStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement <em>Create Index Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement
   * @generated
   */
  public Adapter createCreateIndexStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement <em>Drop Index Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement
   * @generated
   */
  public Adapter createDropIndexStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnConstraint <em>Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnConstraint
   * @generated
   */
  public Adapter createColumnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.TableConstraint <em>Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.TableConstraint
   * @generated
   */
  public Adapter createTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint
   * @generated
   */
  public Adapter createUniqueTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint <em>Primary Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint
   * @generated
   */
  public Adapter createPrimaryConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint <em>Check Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint
   * @generated
   */
  public Adapter createCheckTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn <em>Indexed Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn
   * @generated
   */
  public Adapter createIndexedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DefaultValue
   * @generated
   */
  public Adapter createDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConflictClause
   * @generated
   */
  public Adapter createConflictClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DMLStatement <em>DML Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DMLStatement
   * @generated
   */
  public Adapter createDMLStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement
   * @generated
   */
  public Adapter createDeleteStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement <em>Insert Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement
   * @generated
   */
  public Adapter createInsertStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement
   * @generated
   */
  public Adapter createUpdateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression <em>Update Column Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression
   * @generated
   */
  public Adapter createUpdateColumnExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ActionStatement
   * @generated
   */
  public Adapter createActionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment <em>Content Uri Param Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment
   * @generated
   */
  public Adapter createContentUriParamSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprConcat <em>Expr Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprConcat
   * @generated
   */
  public Adapter createExprConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprMult <em>Expr Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprMult
   * @generated
   */
  public Adapter createExprMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAdd <em>Expr Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAdd
   * @generated
   */
  public Adapter createExprAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprBit <em>Expr Bit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprBit
   * @generated
   */
  public Adapter createExprBitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprRelate <em>Expr Relate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprRelate
   * @generated
   */
  public Adapter createExprRelateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprEqual <em>Expr Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprEqual
   * @generated
   */
  public Adapter createExprEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAnd
   * @generated
   */
  public Adapter createExprAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprOr
   * @generated
   */
  public Adapter createExprOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression <em>Null Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression
   * @generated
   */
  public Adapter createNullCheckExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.IsNull <em>Is Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IsNull
   * @generated
   */
  public Adapter createIsNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NotNull
   * @generated
   */
  public Adapter createNotNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NewColumn <em>New Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NewColumn
   * @generated
   */
  public Adapter createNewColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.OldColumn <em>Old Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OldColumn
   * @generated
   */
  public Adapter createOldColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef <em>Column Source Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef
   * @generated
   */
  public Adapter createColumnSourceRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NestedExpression
   * @generated
   */
  public Adapter createNestedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression <em>Select Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression
   * @generated
   */
  public Adapter createSelectStatementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CaseExpression
   * @generated
   */
  public Adapter createCaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CastExpression
   * @generated
   */
  public Adapter createCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument <em>Function Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument
   * @generated
   */
  public Adapter createFunctionArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore <em>Select Core</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCore
   * @generated
   */
  public Adapter createSelectCoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression
   * @generated
   */
  public Adapter createSelectExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable <em>Single Source Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable
   * @generated
   */
  public Adapter createSingleSourceTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement <em>Single Source Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement
   * @generated
   */
  public Adapter createSingleSourceSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ResultColumn <em>Result Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ResultColumn
   * @generated
   */
  public Adapter createResultColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral <em>Current Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral
   * @generated
   */
  public Adapter createCurrentTimeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral <em>Current Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral
   * @generated
   */
  public Adapter createCurrentDateLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral <em>Current Time Stamp Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral
   * @generated
   */
  public Adapter createCurrentTimeStampLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement <em>Create Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement
   * @generated
   */
  public Adapter createCreateTableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement <em>Create View Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement
   * @generated
   */
  public Adapter createCreateViewStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement <em>Alter Table Rename Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement
   * @generated
   */
  public Adapter createAlterTableRenameStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnDef
   * @generated
   */
  public Adapter createColumnDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint
   * @generated
   */
  public Adapter createPrimaryKeyColumnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint <em>Not Null Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint
   * @generated
   */
  public Adapter createNotNullConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint
   * @generated
   */
  public Adapter createUniqueConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint <em>Default Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint
   * @generated
   */
  public Adapter createDefaultConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint <em>Check Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint
   * @generated
   */
  public Adapter createCheckConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue <em>Literal Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue
   * @generated
   */
  public Adapter createLiteralDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue <em>Expression Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue
   * @generated
   */
  public Adapter createExpressionDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SqliteModelAdapterFactory
