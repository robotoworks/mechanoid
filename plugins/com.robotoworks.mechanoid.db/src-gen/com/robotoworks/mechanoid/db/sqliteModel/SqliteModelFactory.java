/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage
 * @generated
 */
public interface SqliteModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqliteModelFactory eINSTANCE = com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Database Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Block</em>'.
   * @generated
   */
  DatabaseBlock createDatabaseBlock();

  /**
   * Returns a new object of class '<em>Config Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Block</em>'.
   * @generated
   */
  ConfigBlock createConfigBlock();

  /**
   * Returns a new object of class '<em>Init Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Block</em>'.
   * @generated
   */
  InitBlock createInitBlock();

  /**
   * Returns a new object of class '<em>Configuration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Statement</em>'.
   * @generated
   */
  ConfigurationStatement createConfigurationStatement();

  /**
   * Returns a new object of class '<em>Function Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Arg</em>'.
   * @generated
   */
  FunctionArg createFunctionArg();

  /**
   * Returns a new object of class '<em>Content Uri</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Uri</em>'.
   * @generated
   */
  ContentUri createContentUri();

  /**
   * Returns a new object of class '<em>Content Uri Segment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Uri Segment</em>'.
   * @generated
   */
  ContentUriSegment createContentUriSegment();

  /**
   * Returns a new object of class '<em>Migration Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Migration Block</em>'.
   * @generated
   */
  MigrationBlock createMigrationBlock();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  Case createCase();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>Ordering Term List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordering Term List</em>'.
   * @generated
   */
  OrderingTermList createOrderingTermList();

  /**
   * Returns a new object of class '<em>Select Core Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Core Expression</em>'.
   * @generated
   */
  SelectCoreExpression createSelectCoreExpression();

  /**
   * Returns a new object of class '<em>Select List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select List</em>'.
   * @generated
   */
  SelectList createSelectList();

  /**
   * Returns a new object of class '<em>Where Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Expressions</em>'.
   * @generated
   */
  WhereExpressions createWhereExpressions();

  /**
   * Returns a new object of class '<em>Group By Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group By Expressions</em>'.
   * @generated
   */
  GroupByExpressions createGroupByExpressions();

  /**
   * Returns a new object of class '<em>Having Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Having Expressions</em>'.
   * @generated
   */
  HavingExpressions createHavingExpressions();

  /**
   * Returns a new object of class '<em>Ordering Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordering Term</em>'.
   * @generated
   */
  OrderingTerm createOrderingTerm();

  /**
   * Returns a new object of class '<em>Join Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Source</em>'.
   * @generated
   */
  JoinSource createJoinSource();

  /**
   * Returns a new object of class '<em>Single Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source</em>'.
   * @generated
   */
  SingleSource createSingleSource();

  /**
   * Returns a new object of class '<em>Select Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Source</em>'.
   * @generated
   */
  SelectSource createSelectSource();

  /**
   * Returns a new object of class '<em>Single Source Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source Join</em>'.
   * @generated
   */
  SingleSourceJoin createSingleSourceJoin();

  /**
   * Returns a new object of class '<em>Join Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Statement</em>'.
   * @generated
   */
  JoinStatement createJoinStatement();

  /**
   * Returns a new object of class '<em>Column Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Source</em>'.
   * @generated
   */
  ColumnSource createColumnSource();

  /**
   * Returns a new object of class '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Value</em>'.
   * @generated
   */
  LiteralValue createLiteralValue();

  /**
   * Returns a new object of class '<em>DDL Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DDL Statement</em>'.
   * @generated
   */
  DDLStatement createDDLStatement();

  /**
   * Returns a new object of class '<em>Table Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Definition</em>'.
   * @generated
   */
  TableDefinition createTableDefinition();

  /**
   * Returns a new object of class '<em>Create Trigger Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Trigger Statement</em>'.
   * @generated
   */
  CreateTriggerStatement createCreateTriggerStatement();

  /**
   * Returns a new object of class '<em>Alter Table Add Column Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Add Column Statement</em>'.
   * @generated
   */
  AlterTableAddColumnStatement createAlterTableAddColumnStatement();

  /**
   * Returns a new object of class '<em>Drop Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Table Statement</em>'.
   * @generated
   */
  DropTableStatement createDropTableStatement();

  /**
   * Returns a new object of class '<em>Drop Trigger Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Trigger Statement</em>'.
   * @generated
   */
  DropTriggerStatement createDropTriggerStatement();

  /**
   * Returns a new object of class '<em>Drop View Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop View Statement</em>'.
   * @generated
   */
  DropViewStatement createDropViewStatement();

  /**
   * Returns a new object of class '<em>Create Index Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Index Statement</em>'.
   * @generated
   */
  CreateIndexStatement createCreateIndexStatement();

  /**
   * Returns a new object of class '<em>Drop Index Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Index Statement</em>'.
   * @generated
   */
  DropIndexStatement createDropIndexStatement();

  /**
   * Returns a new object of class '<em>Column Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Constraint</em>'.
   * @generated
   */
  ColumnConstraint createColumnConstraint();

  /**
   * Returns a new object of class '<em>Table Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Constraint</em>'.
   * @generated
   */
  TableConstraint createTableConstraint();

  /**
   * Returns a new object of class '<em>Unique Table Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Table Constraint</em>'.
   * @generated
   */
  UniqueTableConstraint createUniqueTableConstraint();

  /**
   * Returns a new object of class '<em>Primary Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Constraint</em>'.
   * @generated
   */
  PrimaryConstraint createPrimaryConstraint();

  /**
   * Returns a new object of class '<em>Check Table Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Table Constraint</em>'.
   * @generated
   */
  CheckTableConstraint createCheckTableConstraint();

  /**
   * Returns a new object of class '<em>Indexed Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed Column</em>'.
   * @generated
   */
  IndexedColumn createIndexedColumn();

  /**
   * Returns a new object of class '<em>Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Value</em>'.
   * @generated
   */
  DefaultValue createDefaultValue();

  /**
   * Returns a new object of class '<em>Conflict Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conflict Clause</em>'.
   * @generated
   */
  ConflictClause createConflictClause();

  /**
   * Returns a new object of class '<em>DML Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DML Statement</em>'.
   * @generated
   */
  DMLStatement createDMLStatement();

  /**
   * Returns a new object of class '<em>Delete Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Statement</em>'.
   * @generated
   */
  DeleteStatement createDeleteStatement();

  /**
   * Returns a new object of class '<em>Insert Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Statement</em>'.
   * @generated
   */
  InsertStatement createInsertStatement();

  /**
   * Returns a new object of class '<em>Update Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Statement</em>'.
   * @generated
   */
  UpdateStatement createUpdateStatement();

  /**
   * Returns a new object of class '<em>Update Column Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Column Expression</em>'.
   * @generated
   */
  UpdateColumnExpression createUpdateColumnExpression();

  /**
   * Returns a new object of class '<em>Action Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Statement</em>'.
   * @generated
   */
  ActionStatement createActionStatement();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Content Uri Param Segment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Uri Param Segment</em>'.
   * @generated
   */
  ContentUriParamSegment createContentUriParamSegment();

  /**
   * Returns a new object of class '<em>Expr Concat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Concat</em>'.
   * @generated
   */
  ExprConcat createExprConcat();

  /**
   * Returns a new object of class '<em>Expr Mult</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Mult</em>'.
   * @generated
   */
  ExprMult createExprMult();

  /**
   * Returns a new object of class '<em>Expr Add</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Add</em>'.
   * @generated
   */
  ExprAdd createExprAdd();

  /**
   * Returns a new object of class '<em>Expr Bit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Bit</em>'.
   * @generated
   */
  ExprBit createExprBit();

  /**
   * Returns a new object of class '<em>Expr Relate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Relate</em>'.
   * @generated
   */
  ExprRelate createExprRelate();

  /**
   * Returns a new object of class '<em>Expr Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Equal</em>'.
   * @generated
   */
  ExprEqual createExprEqual();

  /**
   * Returns a new object of class '<em>Expr And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr And</em>'.
   * @generated
   */
  ExprAnd createExprAnd();

  /**
   * Returns a new object of class '<em>Expr Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Or</em>'.
   * @generated
   */
  ExprOr createExprOr();

  /**
   * Returns a new object of class '<em>Null Check Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Check Expression</em>'.
   * @generated
   */
  NullCheckExpression createNullCheckExpression();

  /**
   * Returns a new object of class '<em>Is Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Null</em>'.
   * @generated
   */
  IsNull createIsNull();

  /**
   * Returns a new object of class '<em>Not Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Null</em>'.
   * @generated
   */
  NotNull createNotNull();

  /**
   * Returns a new object of class '<em>New Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Column</em>'.
   * @generated
   */
  NewColumn createNewColumn();

  /**
   * Returns a new object of class '<em>Old Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Old Column</em>'.
   * @generated
   */
  OldColumn createOldColumn();

  /**
   * Returns a new object of class '<em>Column Source Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Source Ref</em>'.
   * @generated
   */
  ColumnSourceRef createColumnSourceRef();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Nested Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Expression</em>'.
   * @generated
   */
  NestedExpression createNestedExpression();

  /**
   * Returns a new object of class '<em>Select Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement Expression</em>'.
   * @generated
   */
  SelectStatementExpression createSelectStatementExpression();

  /**
   * Returns a new object of class '<em>Case Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Expression</em>'.
   * @generated
   */
  CaseExpression createCaseExpression();

  /**
   * Returns a new object of class '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expression</em>'.
   * @generated
   */
  CastExpression createCastExpression();

  /**
   * Returns a new object of class '<em>Function Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Argument</em>'.
   * @generated
   */
  FunctionArgument createFunctionArgument();

  /**
   * Returns a new object of class '<em>Select Core</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Core</em>'.
   * @generated
   */
  SelectCore createSelectCore();

  /**
   * Returns a new object of class '<em>Select Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Expression</em>'.
   * @generated
   */
  SelectExpression createSelectExpression();

  /**
   * Returns a new object of class '<em>Single Source Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source Table</em>'.
   * @generated
   */
  SingleSourceTable createSingleSourceTable();

  /**
   * Returns a new object of class '<em>Single Source Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Source Select Statement</em>'.
   * @generated
   */
  SingleSourceSelectStatement createSingleSourceSelectStatement();

  /**
   * Returns a new object of class '<em>Result Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Column</em>'.
   * @generated
   */
  ResultColumn createResultColumn();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  NumericLiteral createNumericLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Current Time Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Time Literal</em>'.
   * @generated
   */
  CurrentTimeLiteral createCurrentTimeLiteral();

  /**
   * Returns a new object of class '<em>Current Date Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Date Literal</em>'.
   * @generated
   */
  CurrentDateLiteral createCurrentDateLiteral();

  /**
   * Returns a new object of class '<em>Current Time Stamp Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Current Time Stamp Literal</em>'.
   * @generated
   */
  CurrentTimeStampLiteral createCurrentTimeStampLiteral();

  /**
   * Returns a new object of class '<em>Create Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table Statement</em>'.
   * @generated
   */
  CreateTableStatement createCreateTableStatement();

  /**
   * Returns a new object of class '<em>Create View Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create View Statement</em>'.
   * @generated
   */
  CreateViewStatement createCreateViewStatement();

  /**
   * Returns a new object of class '<em>Alter Table Rename Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Rename Statement</em>'.
   * @generated
   */
  AlterTableRenameStatement createAlterTableRenameStatement();

  /**
   * Returns a new object of class '<em>Column Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Def</em>'.
   * @generated
   */
  ColumnDef createColumnDef();

  /**
   * Returns a new object of class '<em>Primary Key Column Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key Column Constraint</em>'.
   * @generated
   */
  PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint();

  /**
   * Returns a new object of class '<em>Not Null Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Null Constraint</em>'.
   * @generated
   */
  NotNullConstraint createNotNullConstraint();

  /**
   * Returns a new object of class '<em>Unique Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Constraint</em>'.
   * @generated
   */
  UniqueConstraint createUniqueConstraint();

  /**
   * Returns a new object of class '<em>Default Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Constraint</em>'.
   * @generated
   */
  DefaultConstraint createDefaultConstraint();

  /**
   * Returns a new object of class '<em>Check Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Constraint</em>'.
   * @generated
   */
  CheckConstraint createCheckConstraint();

  /**
   * Returns a new object of class '<em>Literal Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Default Value</em>'.
   * @generated
   */
  LiteralDefaultValue createLiteralDefaultValue();

  /**
   * Returns a new object of class '<em>Expression Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Default Value</em>'.
   * @generated
   */
  ExpressionDefaultValue createExpressionDefaultValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SqliteModelPackage getSqliteModelPackage();

} //SqliteModelFactory
