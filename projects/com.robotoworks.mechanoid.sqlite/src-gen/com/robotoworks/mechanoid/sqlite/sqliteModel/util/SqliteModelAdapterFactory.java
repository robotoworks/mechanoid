/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.util;

import com.robotoworks.mechanoid.sqlite.sqliteModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage
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
      public Adapter caseActionBlock(ActionBlock object)
      {
        return createActionBlockAdapter();
      }
      @Override
      public Adapter caseActionStatement(ActionStatement object)
      {
        return createActionStatementAdapter();
      }
      @Override
      public Adapter caseMigrationBlock(MigrationBlock object)
      {
        return createMigrationBlockAdapter();
      }
      @Override
      public Adapter caseSqlExpression(SqlExpression object)
      {
        return createSqlExpressionAdapter();
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
      public Adapter caseStatment(Statment object)
      {
        return createStatmentAdapter();
      }
      @Override
      public Adapter caseTableDecl(TableDecl object)
      {
        return createTableDeclAdapter();
      }
      @Override
      public Adapter caseAlterTableClause(AlterTableClause object)
      {
        return createAlterTableClauseAdapter();
      }
      @Override
      public Adapter caseColumnDef(ColumnDef object)
      {
        return createColumnDefAdapter();
      }
      @Override
      public Adapter caseColumnConstraint(ColumnConstraint object)
      {
        return createColumnConstraintAdapter();
      }
      @Override
      public Adapter caseDefaultValue(DefaultValue object)
      {
        return createDefaultValueAdapter();
      }
      @Override
      public Adapter caseTableConstraint(TableConstraint object)
      {
        return createTableConstraintAdapter();
      }
      @Override
      public Adapter caseUniqueTableContraint(UniqueTableContraint object)
      {
        return createUniqueTableContraintAdapter();
      }
      @Override
      public Adapter caseIndexedColumn(IndexedColumn object)
      {
        return createIndexedColumnAdapter();
      }
      @Override
      public Adapter caseSelectStatement(SelectStatement object)
      {
        return createSelectStatementAdapter();
      }
      @Override
      public Adapter caseOrderingTerm(OrderingTerm object)
      {
        return createOrderingTermAdapter();
      }
      @Override
      public Adapter caseSelectCore(SelectCore object)
      {
        return createSelectCoreAdapter();
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
      public Adapter caseJoinStatement(JoinStatement object)
      {
        return createJoinStatementAdapter();
      }
      @Override
      public Adapter caseResultColumn(ResultColumn object)
      {
        return createResultColumnAdapter();
      }
      @Override
      public Adapter caseConflictClause(ConflictClause object)
      {
        return createConflictClauseAdapter();
      }
      @Override
      public Adapter caseLiteralValue(LiteralValue object)
      {
        return createLiteralValueAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter casePrimaryComparison(PrimaryComparison object)
      {
        return createPrimaryComparisonAdapter();
      }
      @Override
      public Adapter caseSecondaryComparison(SecondaryComparison object)
      {
        return createSecondaryComparisonAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseSubtraction(Subtraction object)
      {
        return createSubtractionAdapter();
      }
      @Override
      public Adapter caseColumnLiteral(ColumnLiteral object)
      {
        return createColumnLiteralAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
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
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseCreateTableStatement(CreateTableStatement object)
      {
        return createCreateTableStatementAdapter();
      }
      @Override
      public Adapter caseAlterTableStatement(AlterTableStatement object)
      {
        return createAlterTableStatementAdapter();
      }
      @Override
      public Adapter caseCreateViewStatement(CreateViewStatement object)
      {
        return createCreateViewStatementAdapter();
      }
      @Override
      public Adapter caseAlterTableRenameClause(AlterTableRenameClause object)
      {
        return createAlterTableRenameClauseAdapter();
      }
      @Override
      public Adapter caseAlterTableAddColumnClause(AlterTableAddColumnClause object)
      {
        return createAlterTableAddColumnClauseAdapter();
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
      public Adapter caseDefaultConstraint(DefaultConstraint object)
      {
        return createDefaultConstraintAdapter();
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
      public Adapter caseSingleSourceJoin(SingleSourceJoin object)
      {
        return createSingleSourceJoinAdapter();
      }
      @Override
      public Adapter caseResultColumnAll(ResultColumnAll object)
      {
        return createResultColumnAllAdapter();
      }
      @Override
      public Adapter caseResultColumnAllWithTableRef(ResultColumnAllWithTableRef object)
      {
        return createResultColumnAllWithTableRefAdapter();
      }
      @Override
      public Adapter caseResultColumnExpression(ResultColumnExpression object)
      {
        return createResultColumnExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock <em>Database Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock
   * @generated
   */
  public Adapter createDatabaseBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock
   * @generated
   */
  public Adapter createActionBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement
   * @generated
   */
  public Adapter createActionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock <em>Migration Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock
   * @generated
   */
  public Adapter createMigrationBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression <em>Sql Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression
   * @generated
   */
  public Adapter createSqlExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Statment <em>Statment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Statment
   * @generated
   */
  public Adapter createStatmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableDecl <em>Table Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.TableDecl
   * @generated
   */
  public Adapter createTableDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableClause <em>Alter Table Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableClause
   * @generated
   */
  public Adapter createAlterTableClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
   * @generated
   */
  public Adapter createColumnDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnConstraint <em>Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnConstraint
   * @generated
   */
  public Adapter createColumnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultValue
   * @generated
   */
  public Adapter createDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint <em>Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint
   * @generated
   */
  public Adapter createTableConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint <em>Unique Table Contraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint
   * @generated
   */
  public Adapter createUniqueTableContraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn <em>Indexed Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn
   * @generated
   */
  public Adapter createIndexedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement
   * @generated
   */
  public Adapter createSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm <em>Ordering Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm
   * @generated
   */
  public Adapter createOrderingTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore <em>Select Core</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore
   * @generated
   */
  public Adapter createSelectCoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource
   * @generated
   */
  public Adapter createJoinSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource
   * @generated
   */
  public Adapter createSingleSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement
   * @generated
   */
  public Adapter createJoinStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn <em>Result Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn
   * @generated
   */
  public Adapter createResultColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause
   * @generated
   */
  public Adapter createConflictClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralValue
   * @generated
   */
  public Adapter createLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryComparison <em>Primary Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryComparison
   * @generated
   */
  public Adapter createPrimaryComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SecondaryComparison <em>Secondary Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SecondaryComparison
   * @generated
   */
  public Adapter createSecondaryComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Subtraction <em>Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Subtraction
   * @generated
   */
  public Adapter createSubtractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral <em>Column Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral
   * @generated
   */
  public Adapter createColumnLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression <em>Select Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression
   * @generated
   */
  public Adapter createSelectStatementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression
   * @generated
   */
  public Adapter createCaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement <em>Create Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
   * @generated
   */
  public Adapter createCreateTableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement <em>Alter Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement
   * @generated
   */
  public Adapter createAlterTableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement <em>Create View Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement
   * @generated
   */
  public Adapter createCreateViewStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause <em>Alter Table Rename Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause
   * @generated
   */
  public Adapter createAlterTableRenameClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause <em>Alter Table Add Column Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause
   * @generated
   */
  public Adapter createAlterTableAddColumnClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint
   * @generated
   */
  public Adapter createPrimaryKeyColumnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint <em>Not Null Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint
   * @generated
   */
  public Adapter createNotNullConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint <em>Default Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint
   * @generated
   */
  public Adapter createDefaultConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue <em>Literal Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue
   * @generated
   */
  public Adapter createLiteralDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue <em>Expression Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue
   * @generated
   */
  public Adapter createExpressionDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable <em>Single Source Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
   * @generated
   */
  public Adapter createSingleSourceTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement <em>Single Source Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement
   * @generated
   */
  public Adapter createSingleSourceSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin <em>Single Source Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin
   * @generated
   */
  public Adapter createSingleSourceJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll <em>Result Column All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll
   * @generated
   */
  public Adapter createResultColumnAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef <em>Result Column All With Table Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef
   * @generated
   */
  public Adapter createResultColumnAllWithTableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression <em>Result Column Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression
   * @generated
   */
  public Adapter createResultColumnExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral <em>Current Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral
   * @generated
   */
  public Adapter createCurrentTimeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral <em>Current Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral
   * @generated
   */
  public Adapter createCurrentDateLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral <em>Current Time Stamp Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral
   * @generated
   */
  public Adapter createCurrentTimeStampLiteralAdapter()
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
