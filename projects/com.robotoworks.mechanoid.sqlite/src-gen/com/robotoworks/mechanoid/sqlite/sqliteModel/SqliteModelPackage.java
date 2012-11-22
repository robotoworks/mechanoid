/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelFactory
 * @model kind="package"
 * @generated
 */
public interface SqliteModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sqliteModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.robotoworks.com/mechanoid/sqlite/SqliteModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sqliteModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqliteModelPackage eINSTANCE = com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ModelImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DATABASE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl <em>Database Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDatabaseBlock()
   * @generated
   */
  int DATABASE_BLOCK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Migrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__MIGRATIONS = 2;

  /**
   * The number of structural features of the '<em>Database Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionBlockImpl <em>Action Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionBlockImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getActionBlock()
   * @generated
   */
  int ACTION_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Action Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionStatementImpl <em>Action Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getActionStatement()
   * @generated
   */
  int ACTION_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__PATH = 1;

  /**
   * The number of structural features of the '<em>Action Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.MigrationBlockImpl <em>Migration Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.MigrationBlockImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getMigrationBlock()
   * @generated
   */
  int MIGRATION_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Migration Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqlExpressionImpl <em>Sql Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqlExpressionImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSqlExpression()
   * @generated
   */
  int SQL_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_EXPRESSION__ROOT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_EXPRESSION__ISNULL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sql Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCase()
   * @generated
   */
  int CASE = 7;

  /**
   * The feature id for the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__WHEN_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__THEN_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StatmentImpl <em>Statment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StatmentImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getStatment()
   * @generated
   */
  int STATMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Statment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableClauseImpl <em>Alter Table Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableClauseImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableClause()
   * @generated
   */
  int ALTER_TABLE_CLAUSE = 9;

  /**
   * The number of structural features of the '<em>Alter Table Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnDefImpl <em>Column Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnDefImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnDef()
   * @generated
   */
  int COLUMN_DEF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF__CONSTRAINTS = 2;

  /**
   * The number of structural features of the '<em>Column Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnConstraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnConstraint()
   * @generated
   */
  int COLUMN_CONSTRAINT = 11;

  /**
   * The number of structural features of the '<em>Column Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultValueImpl <em>Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultValueImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDefaultValue()
   * @generated
   */
  int DEFAULT_VALUE = 12;

  /**
   * The number of structural features of the '<em>Default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.TableConstraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getTableConstraint()
   * @generated
   */
  int TABLE_CONSTRAINT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_CONSTRAINT__NAME = 0;

  /**
   * The number of structural features of the '<em>Table Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.IndexedColumnImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getIndexedColumn()
   * @generated
   */
  int INDEXED_COLUMN = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__ASC = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__DESC = 2;

  /**
   * The number of structural features of the '<em>Indexed Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Core Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__CORE_STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Ordering Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__ORDERING_TERMS = 1;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.OrderingTermImpl <em>Ordering Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.OrderingTermImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getOrderingTerm()
   * @generated
   */
  int ORDERING_TERM = 16;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERING_TERM__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERING_TERM__ASC = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERING_TERM__DESC = 2;

  /**
   * The number of structural features of the '<em>Ordering Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERING_TERM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl <em>Select Core</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSelectCore()
   * @generated
   */
  int SELECT_CORE = 17;

  /**
   * The feature id for the '<em><b>Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__DISTINCT = 0;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__ALL = 1;

  /**
   * The feature id for the '<em><b>Result Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__RESULT_COLUMNS = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__SOURCE = 3;

  /**
   * The feature id for the '<em><b>Where Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__WHERE_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Group By Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__GROUP_BY_EXPRESSIONS = 5;

  /**
   * The number of structural features of the '<em>Select Core</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinSourceImpl <em>Join Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinSourceImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getJoinSource()
   * @generated
   */
  int JOIN_SOURCE = 18;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_SOURCE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Join Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_SOURCE__JOIN_STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Join Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_SOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceImpl <em>Single Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSource()
   * @generated
   */
  int SINGLE_SOURCE = 19;

  /**
   * The number of structural features of the '<em>Single Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinStatementImpl <em>Join Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getJoinStatement()
   * @generated
   */
  int JOIN_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Natural</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__NATURAL = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__LEFT = 1;

  /**
   * The feature id for the '<em><b>Outer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__OUTER = 2;

  /**
   * The feature id for the '<em><b>Inner</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__INNER = 3;

  /**
   * The feature id for the '<em><b>Cross</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__CROSS = 4;

  /**
   * The feature id for the '<em><b>Single Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__SINGLE_SOURCE = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Join Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnImpl <em>Result Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumn()
   * @generated
   */
  int RESULT_COLUMN = 21;

  /**
   * The number of structural features of the '<em>Result Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ConflictClauseImpl <em>Conflict Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ConflictClauseImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getConflictClause()
   * @generated
   */
  int CONFLICT_CLAUSE = 22;

  /**
   * The feature id for the '<em><b>Resolution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT_CLAUSE__RESOLUTION = 0;

  /**
   * The number of structural features of the '<em>Conflict Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralValueImpl <em>Literal Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralValueImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getLiteralValue()
   * @generated
   */
  int LITERAL_VALUE = 23;

  /**
   * The number of structural features of the '<em>Literal Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprConcatImpl <em>Expr Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprConcatImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprConcat()
   * @generated
   */
  int EXPR_CONCAT = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CONCAT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CONCAT__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CONCAT__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CONCAT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprMultImpl <em>Expr Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprMultImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprMult()
   * @generated
   */
  int EXPR_MULT = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MULT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MULT__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MULT__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MULT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAddImpl <em>Expr Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAddImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprAdd()
   * @generated
   */
  int EXPR_ADD = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADD__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADD__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADD__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprBitImpl <em>Expr Bit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprBitImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprBit()
   * @generated
   */
  int EXPR_BIT = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BIT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BIT__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BIT__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Bit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BIT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprRelateImpl <em>Expr Relate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprRelateImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprRelate()
   * @generated
   */
  int EXPR_RELATE = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RELATE__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RELATE__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RELATE__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Relate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RELATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprEqualImpl <em>Expr Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprEqualImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprEqual()
   * @generated
   */
  int EXPR_EQUAL = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAndImpl <em>Expr And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAndImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprAnd()
   * @generated
   */
  int EXPR_AND = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprOrImpl <em>Expr Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprOrImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprOr()
   * @generated
   */
  int EXPR_OR = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnLiteralImpl <em>Column Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnLiteral()
   * @generated
   */
  int COLUMN_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LITERAL__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LITERAL__ISNULL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Column Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 33;

  /**
   * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LITERAL_VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__ISNULL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementExpressionImpl <em>Select Statement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementExpressionImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatementExpression()
   * @generated
   */
  int SELECT_STATEMENT_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_EXPRESSION__NOT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_EXPRESSION__EXISTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_EXPRESSION__SELECT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_EXPRESSION__ISNULL = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Select Statement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseExpressionImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Case Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CASE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__ISNULL = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.FunctionImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ALL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arugments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARUGMENTS = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Isnull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ISNULL = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTableStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCreateTableStatement()
   * @generated
   */
  int CREATE_TABLE_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__NAME = STATMENT__NAME;

  /**
   * The feature id for the '<em><b>Column Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__COLUMN_DEFS = STATMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__CONSTRAINTS = STATMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Table Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT_FEATURE_COUNT = STATMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableStatementImpl <em>Alter Table Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableStatement()
   * @generated
   */
  int ALTER_TABLE_STATEMENT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_STATEMENT__NAME = STATMENT__NAME;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_STATEMENT__CLAUSE = STATMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alter Table Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_STATEMENT_FEATURE_COUNT = STATMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateViewStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCreateViewStatement()
   * @generated
   */
  int CREATE_VIEW_STATEMENT = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT__NAME = STATMENT__NAME;

  /**
   * The feature id for the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT__SELECT_STATEMENT = STATMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Create View Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT_FEATURE_COUNT = STATMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropTableStatementImpl <em>Drop Table Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropTableStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDropTableStatement()
   * @generated
   */
  int DROP_TABLE_STATEMENT = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TABLE_STATEMENT__NAME = STATMENT__NAME;

  /**
   * The number of structural features of the '<em>Drop Table Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TABLE_STATEMENT_FEATURE_COUNT = STATMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropViewStatementImpl <em>Drop View Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropViewStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDropViewStatement()
   * @generated
   */
  int DROP_VIEW_STATEMENT = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_VIEW_STATEMENT__NAME = STATMENT__NAME;

  /**
   * The number of structural features of the '<em>Drop View Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_VIEW_STATEMENT_FEATURE_COUNT = STATMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableRenameClauseImpl <em>Alter Table Rename Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableRenameClauseImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableRenameClause()
   * @generated
   */
  int ALTER_TABLE_RENAME_CLAUSE = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_RENAME_CLAUSE__NAME = ALTER_TABLE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alter Table Rename Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_RENAME_CLAUSE_FEATURE_COUNT = ALTER_TABLE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableAddColumnClauseImpl <em>Alter Table Add Column Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableAddColumnClauseImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableAddColumnClause()
   * @generated
   */
  int ALTER_TABLE_ADD_COLUMN_CLAUSE = 43;

  /**
   * The feature id for the '<em><b>Column Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_ADD_COLUMN_CLAUSE__COLUMN_DEF = ALTER_TABLE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alter Table Add Column Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_ADD_COLUMN_CLAUSE_FEATURE_COUNT = ALTER_TABLE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryKeyColumnConstraintImpl <em>Primary Key Column Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryKeyColumnConstraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryKeyColumnConstraint()
   * @generated
   */
  int PRIMARY_KEY_COLUMN_CONSTRAINT = 44;

  /**
   * The feature id for the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_COLUMN_CONSTRAINT__ASC = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_COLUMN_CONSTRAINT__DESC = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Autoincrement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT = COLUMN_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Primary Key Column Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NotNullConstraintImpl <em>Not Null Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NotNullConstraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getNotNullConstraint()
   * @generated
   */
  int NOT_NULL_CONSTRAINT = 45;

  /**
   * The feature id for the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_NULL_CONSTRAINT__CONFLICT_CLAUSE = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Null Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_NULL_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultConstraintImpl <em>Default Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultConstraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDefaultConstraint()
   * @generated
   */
  int DEFAULT_CONSTRAINT = 46;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CONSTRAINT__DEFAULT_VALUE = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Default Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralDefaultValueImpl <em>Literal Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralDefaultValueImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getLiteralDefaultValue()
   * @generated
   */
  int LITERAL_DEFAULT_VALUE = 47;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_DEFAULT_VALUE__LITERAL = DEFAULT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_DEFAULT_VALUE_FEATURE_COUNT = DEFAULT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionDefaultValueImpl <em>Expression Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionDefaultValueImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExpressionDefaultValue()
   * @generated
   */
  int EXPRESSION_DEFAULT_VALUE = 48;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_DEFAULT_VALUE__EXPRESSION = DEFAULT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_DEFAULT_VALUE_FEATURE_COUNT = DEFAULT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UniqueTableContraintImpl <em>Unique Table Contraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UniqueTableContraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getUniqueTableContraint()
   * @generated
   */
  int UNIQUE_TABLE_CONTRAINT = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONTRAINT__NAME = TABLE_CONSTRAINT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unique Table Contraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryContraintImpl <em>Primary Contraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryContraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryContraint()
   * @generated
   */
  int PRIMARY_CONTRAINT = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONTRAINT__NAME = TABLE_CONSTRAINT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONTRAINT__CONFLICT_CLAUSE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Primary Contraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CheckTableConstraintImpl <em>Check Table Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CheckTableConstraintImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCheckTableConstraint()
   * @generated
   */
  int CHECK_TABLE_CONSTRAINT = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_TABLE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_TABLE_CONSTRAINT__EXPRESSION = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check Table Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceTableImpl <em>Single Source Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceTableImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceTable()
   * @generated
   */
  int SINGLE_SOURCE_TABLE = 52;

  /**
   * The feature id for the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_TABLE__TABLE_NAME = SINGLE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_TABLE__NAME = SINGLE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Single Source Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_TABLE_FEATURE_COUNT = SINGLE_SOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceSelectStatementImpl <em>Single Source Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceSelectStatementImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceSelectStatement()
   * @generated
   */
  int SINGLE_SOURCE_SELECT_STATEMENT = 53;

  /**
   * The feature id for the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT = SINGLE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Source Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_SELECT_STATEMENT_FEATURE_COUNT = SINGLE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceJoinImpl <em>Single Source Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceJoinImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceJoin()
   * @generated
   */
  int SINGLE_SOURCE_JOIN = 54;

  /**
   * The feature id for the '<em><b>Join Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_JOIN__JOIN_SOURCE = SINGLE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Source Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_JOIN_FEATURE_COUNT = SINGLE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllImpl <em>Result Column All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumnAll()
   * @generated
   */
  int RESULT_COLUMN_ALL = 55;

  /**
   * The number of structural features of the '<em>Result Column All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_ALL_FEATURE_COUNT = RESULT_COLUMN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllWithTableRefImpl <em>Result Column All With Table Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllWithTableRefImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumnAllWithTableRef()
   * @generated
   */
  int RESULT_COLUMN_ALL_WITH_TABLE_REF = 56;

  /**
   * The feature id for the '<em><b>Table Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF = RESULT_COLUMN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Result Column All With Table Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_ALL_WITH_TABLE_REF_FEATURE_COUNT = RESULT_COLUMN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnExpressionImpl <em>Result Column Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnExpressionImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumnExpression()
   * @generated
   */
  int RESULT_COLUMN_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_EXPRESSION__EXPRESSION = RESULT_COLUMN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_EXPRESSION__NAME = RESULT_COLUMN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Result Column Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_EXPRESSION_FEATURE_COUNT = RESULT_COLUMN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NumericLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 58;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__NUMBER = LITERAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StringLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 59;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LITERAL = LITERAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NullLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 60;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__LITERAL = LITERAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeLiteralImpl <em>Current Time Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeLiteral()
   * @generated
   */
  int CURRENT_TIME_LITERAL = 61;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME_LITERAL__LITERAL = LITERAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Current Time Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME_LITERAL_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentDateLiteralImpl <em>Current Date Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentDateLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCurrentDateLiteral()
   * @generated
   */
  int CURRENT_DATE_LITERAL = 62;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_DATE_LITERAL__LITERAL = LITERAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Current Date Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_DATE_LITERAL_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeStampLiteralImpl <em>Current Time Stamp Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeStampLiteralImpl
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeStampLiteral()
   * @generated
   */
  int CURRENT_TIME_STAMP_LITERAL = 63;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME_STAMP_LITERAL__LITERAL = LITERAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Current Time Stamp Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME_STAMP_LITERAL_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType <em>Column Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnType()
   * @generated
   */
  int COLUMN_TYPE = 64;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution <em>Conflict Resolution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getConflictResolution()
   * @generated
   */
  int CONFLICT_RESOLUTION = 65;


  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Model#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Model#getDatabase()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Database();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock <em>Database Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Block</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock
   * @generated
   */
  EClass getDatabaseBlock();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getName()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getActions()
   * @see #getDatabaseBlock()
   * @generated
   */
  EReference getDatabaseBlock_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getMigrations <em>Migrations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrations</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock#getMigrations()
   * @see #getDatabaseBlock()
   * @generated
   */
  EReference getDatabaseBlock_Migrations();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Block</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock
   * @generated
   */
  EClass getActionBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionBlock#getActions()
   * @see #getActionBlock()
   * @generated
   */
  EReference getActionBlock_Actions();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement
   * @generated
   */
  EClass getActionStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement#getName()
   * @see #getActionStatement()
   * @generated
   */
  EAttribute getActionStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement#getPath()
   * @see #getActionStatement()
   * @generated
   */
  EAttribute getActionStatement_Path();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock <em>Migration Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Block</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock
   * @generated
   */
  EClass getMigrationBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock#getStatements()
   * @see #getMigrationBlock()
   * @generated
   */
  EReference getMigrationBlock_Statements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression <em>Sql Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sql Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression
   * @generated
   */
  EClass getSqlExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression#getRoot()
   * @see #getSqlExpression()
   * @generated
   */
  EReference getSqlExpression_Root();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression#isIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression#isIsnull()
   * @see #getSqlExpression()
   * @generated
   */
  EAttribute getSqlExpression_Isnull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Case#getWhenExpression <em>When Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Case#getWhenExpression()
   * @see #getCase()
   * @generated
   */
  EReference getCase_WhenExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Case#getThenExpression <em>Then Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Case#getThenExpression()
   * @see #getCase()
   * @generated
   */
  EReference getCase_ThenExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Statment <em>Statment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statment</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Statment
   * @generated
   */
  EClass getStatment();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Statment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Statment#getName()
   * @see #getStatment()
   * @generated
   */
  EAttribute getStatment_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableClause <em>Alter Table Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Table Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableClause
   * @generated
   */
  EClass getAlterTableClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Def</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
   * @generated
   */
  EClass getColumnDef();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef#getName()
   * @see #getColumnDef()
   * @generated
   */
  EAttribute getColumnDef_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef#getType()
   * @see #getColumnDef()
   * @generated
   */
  EAttribute getColumnDef_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef#getConstraints()
   * @see #getColumnDef()
   * @generated
   */
  EReference getColumnDef_Constraints();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnConstraint <em>Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Constraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnConstraint
   * @generated
   */
  EClass getColumnConstraint();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Value</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultValue
   * @generated
   */
  EClass getDefaultValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint <em>Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Constraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint
   * @generated
   */
  EClass getTableConstraint();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint#getName()
   * @see #getTableConstraint()
   * @generated
   */
  EAttribute getTableConstraint_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn <em>Indexed Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Column</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn
   * @generated
   */
  EClass getIndexedColumn();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn#getName()
   * @see #getIndexedColumn()
   * @generated
   */
  EReference getIndexedColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn#isAsc <em>Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn#isAsc()
   * @see #getIndexedColumn()
   * @generated
   */
  EAttribute getIndexedColumn_Asc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn#isDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn#isDesc()
   * @see #getIndexedColumn()
   * @generated
   */
  EAttribute getIndexedColumn_Desc();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCoreStatements <em>Core Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Core Statements</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getCoreStatements()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_CoreStatements();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getOrderingTerms <em>Ordering Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordering Terms</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement#getOrderingTerms()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_OrderingTerms();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm <em>Ordering Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordering Term</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm
   * @generated
   */
  EClass getOrderingTerm();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm#getExpression()
   * @see #getOrderingTerm()
   * @generated
   */
  EReference getOrderingTerm_Expression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm#isAsc <em>Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm#isAsc()
   * @see #getOrderingTerm()
   * @generated
   */
  EAttribute getOrderingTerm_Asc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm#isDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm#isDesc()
   * @see #getOrderingTerm()
   * @generated
   */
  EAttribute getOrderingTerm_Desc();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore <em>Select Core</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Core</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore
   * @generated
   */
  EClass getSelectCore();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isDistinct <em>Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distinct</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isDistinct()
   * @see #getSelectCore()
   * @generated
   */
  EAttribute getSelectCore_Distinct();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#isAll()
   * @see #getSelectCore()
   * @generated
   */
  EAttribute getSelectCore_All();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getResultColumns <em>Result Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result Columns</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getResultColumns()
   * @see #getSelectCore()
   * @generated
   */
  EReference getSelectCore_ResultColumns();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getSource()
   * @see #getSelectCore()
   * @generated
   */
  EReference getSelectCore_Source();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getWhereExpression <em>Where Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getWhereExpression()
   * @see #getSelectCore()
   * @generated
   */
  EReference getSelectCore_WhereExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getGroupByExpressions <em>Group By Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group By Expressions</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore#getGroupByExpressions()
   * @see #getSelectCore()
   * @generated
   */
  EReference getSelectCore_GroupByExpressions();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Source</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource
   * @generated
   */
  EClass getJoinSource();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource#getSource()
   * @see #getJoinSource()
   * @generated
   */
  EReference getJoinSource_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource#getJoinStatements <em>Join Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Statements</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource#getJoinStatements()
   * @see #getJoinSource()
   * @generated
   */
  EReference getJoinSource_JoinStatements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource
   * @generated
   */
  EClass getSingleSource();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement
   * @generated
   */
  EClass getJoinStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isNatural <em>Natural</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Natural</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isNatural()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Natural();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isLeft()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isOuter <em>Outer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Outer</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isOuter()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Outer();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inner</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isInner()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Inner();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isCross <em>Cross</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cross</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#isCross()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Cross();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#getSingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Source</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#getSingleSource()
   * @see #getJoinStatement()
   * @generated
   */
  EReference getJoinStatement_SingleSource();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement#getExpression()
   * @see #getJoinStatement()
   * @generated
   */
  EReference getJoinStatement_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn <em>Result Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Column</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn
   * @generated
   */
  EClass getResultColumn();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause
   * @generated
   */
  EClass getConflictClause();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause#getResolution <em>Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolution</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause#getResolution()
   * @see #getConflictClause()
   * @generated
   */
  EAttribute getConflictClause_Resolution();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Value</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralValue
   * @generated
   */
  EClass getLiteralValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat <em>Expr Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Concat</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat
   * @generated
   */
  EClass getExprConcat();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat#getLeft()
   * @see #getExprConcat()
   * @generated
   */
  EReference getExprConcat_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat#getOp()
   * @see #getExprConcat()
   * @generated
   */
  EAttribute getExprConcat_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat#getRight()
   * @see #getExprConcat()
   * @generated
   */
  EReference getExprConcat_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult <em>Expr Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Mult</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult
   * @generated
   */
  EClass getExprMult();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult#getLeft()
   * @see #getExprMult()
   * @generated
   */
  EReference getExprMult_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult#getOp()
   * @see #getExprMult()
   * @generated
   */
  EAttribute getExprMult_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult#getRight()
   * @see #getExprMult()
   * @generated
   */
  EReference getExprMult_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd <em>Expr Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Add</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd
   * @generated
   */
  EClass getExprAdd();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd#getLeft()
   * @see #getExprAdd()
   * @generated
   */
  EReference getExprAdd_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd#getOp()
   * @see #getExprAdd()
   * @generated
   */
  EAttribute getExprAdd_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd#getRight()
   * @see #getExprAdd()
   * @generated
   */
  EReference getExprAdd_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit <em>Expr Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Bit</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit
   * @generated
   */
  EClass getExprBit();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit#getLeft()
   * @see #getExprBit()
   * @generated
   */
  EReference getExprBit_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit#getOp()
   * @see #getExprBit()
   * @generated
   */
  EAttribute getExprBit_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit#getRight()
   * @see #getExprBit()
   * @generated
   */
  EReference getExprBit_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate <em>Expr Relate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Relate</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate
   * @generated
   */
  EClass getExprRelate();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate#getLeft()
   * @see #getExprRelate()
   * @generated
   */
  EReference getExprRelate_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate#getOp()
   * @see #getExprRelate()
   * @generated
   */
  EAttribute getExprRelate_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate#getRight()
   * @see #getExprRelate()
   * @generated
   */
  EReference getExprRelate_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual <em>Expr Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Equal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual
   * @generated
   */
  EClass getExprEqual();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual#getLeft()
   * @see #getExprEqual()
   * @generated
   */
  EReference getExprEqual_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual#getOp()
   * @see #getExprEqual()
   * @generated
   */
  EAttribute getExprEqual_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual#getRight()
   * @see #getExprEqual()
   * @generated
   */
  EReference getExprEqual_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr And</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd
   * @generated
   */
  EClass getExprAnd();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd#getLeft()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd#getOp()
   * @see #getExprAnd()
   * @generated
   */
  EAttribute getExprAnd_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd#getRight()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Or</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr
   * @generated
   */
  EClass getExprOr();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr#getLeft()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr#getOp()
   * @see #getExprOr()
   * @generated
   */
  EAttribute getExprOr_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr#getRight()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral <em>Column Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral
   * @generated
   */
  EClass getColumnLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#getName()
   * @see #getColumnLiteral()
   * @generated
   */
  EAttribute getColumnLiteral_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#isIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral#isIsnull()
   * @see #getColumnLiteral()
   * @generated
   */
  EAttribute getColumnLiteral_Isnull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#getLiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal Value</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#getLiteralValue()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_LiteralValue();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#isIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Literal#isIsnull()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Isnull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression <em>Select Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression
   * @generated
   */
  EClass getSelectStatementExpression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#isNot()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EAttribute getSelectStatementExpression_Not();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#isExists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exists</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#isExists()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EAttribute getSelectStatementExpression_Exists();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#getSelect()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EReference getSelectStatementExpression_Select();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#isIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression#isIsnull()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EAttribute getSelectStatementExpression_Isnull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression
   * @generated
   */
  EClass getCaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCaseExpression()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_CaseExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getCases()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getElseExpression <em>Else Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#getElseExpression()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_ElseExpression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#isIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression#isIsnull()
   * @see #getCaseExpression()
   * @generated
   */
  EAttribute getCaseExpression_Isnull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function#isAll()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_All();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getArguments()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getArugments <em>Arugments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arugments</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function#getArugments()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Arugments();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.Function#isIsnull <em>Isnull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isnull</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.Function#isIsnull()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Isnull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement <em>Create Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Table Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
   * @generated
   */
  EClass getCreateTableStatement();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement#getColumnDefs <em>Column Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Defs</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement#getColumnDefs()
   * @see #getCreateTableStatement()
   * @generated
   */
  EReference getCreateTableStatement_ColumnDefs();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement#getConstraints()
   * @see #getCreateTableStatement()
   * @generated
   */
  EReference getCreateTableStatement_Constraints();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement <em>Alter Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Table Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement
   * @generated
   */
  EClass getAlterTableStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement#getClause()
   * @see #getAlterTableStatement()
   * @generated
   */
  EReference getAlterTableStatement_Clause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement <em>Create View Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create View Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement
   * @generated
   */
  EClass getCreateViewStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement#getSelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement#getSelectStatement()
   * @see #getCreateViewStatement()
   * @generated
   */
  EReference getCreateViewStatement_SelectStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement <em>Drop Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Table Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement
   * @generated
   */
  EClass getDropTableStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DropViewStatement <em>Drop View Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop View Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DropViewStatement
   * @generated
   */
  EClass getDropViewStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause <em>Alter Table Rename Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Table Rename Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause
   * @generated
   */
  EClass getAlterTableRenameClause();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause#getName()
   * @see #getAlterTableRenameClause()
   * @generated
   */
  EAttribute getAlterTableRenameClause_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause <em>Alter Table Add Column Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Table Add Column Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause
   * @generated
   */
  EClass getAlterTableAddColumnClause();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause#getColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Def</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause#getColumnDef()
   * @see #getAlterTableAddColumnClause()
   * @generated
   */
  EReference getAlterTableAddColumnClause_ColumnDef();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key Column Constraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint
   * @generated
   */
  EClass getPrimaryKeyColumnConstraint();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint#isAsc <em>Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint#isAsc()
   * @see #getPrimaryKeyColumnConstraint()
   * @generated
   */
  EAttribute getPrimaryKeyColumnConstraint_Asc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint#isDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint#isDesc()
   * @see #getPrimaryKeyColumnConstraint()
   * @generated
   */
  EAttribute getPrimaryKeyColumnConstraint_Desc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint#isAutoincrement <em>Autoincrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autoincrement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint#isAutoincrement()
   * @see #getPrimaryKeyColumnConstraint()
   * @generated
   */
  EAttribute getPrimaryKeyColumnConstraint_Autoincrement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint <em>Not Null Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Null Constraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint
   * @generated
   */
  EClass getNotNullConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint#getConflictClause()
   * @see #getNotNullConstraint()
   * @generated
   */
  EReference getNotNullConstraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint <em>Default Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Constraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint
   * @generated
   */
  EClass getDefaultConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint#getDefaultValue()
   * @see #getDefaultConstraint()
   * @generated
   */
  EReference getDefaultConstraint_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue <em>Literal Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Default Value</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue
   * @generated
   */
  EClass getLiteralDefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue#getLiteral()
   * @see #getLiteralDefaultValue()
   * @generated
   */
  EReference getLiteralDefaultValue_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue <em>Expression Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Default Value</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue
   * @generated
   */
  EClass getExpressionDefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue#getExpression()
   * @see #getExpressionDefaultValue()
   * @generated
   */
  EReference getExpressionDefaultValue_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint <em>Unique Table Contraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Table Contraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint
   * @generated
   */
  EClass getUniqueTableContraint();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint#getColumns()
   * @see #getUniqueTableContraint()
   * @generated
   */
  EReference getUniqueTableContraint_Columns();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint#getConflictClause()
   * @see #getUniqueTableContraint()
   * @generated
   */
  EReference getUniqueTableContraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint <em>Primary Contraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Contraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint
   * @generated
   */
  EClass getPrimaryContraint();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getColumns()
   * @see #getPrimaryContraint()
   * @generated
   */
  EReference getPrimaryContraint_Columns();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint#getConflictClause()
   * @see #getPrimaryContraint()
   * @generated
   */
  EReference getPrimaryContraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CheckTableConstraint <em>Check Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Table Constraint</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CheckTableConstraint
   * @generated
   */
  EClass getCheckTableConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CheckTableConstraint#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CheckTableConstraint#getExpression()
   * @see #getCheckTableConstraint()
   * @generated
   */
  EReference getCheckTableConstraint_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable <em>Single Source Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source Table</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
   * @generated
   */
  EClass getSingleSourceTable();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable#getTableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable#getTableName()
   * @see #getSingleSourceTable()
   * @generated
   */
  EAttribute getSingleSourceTable_TableName();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable#getName()
   * @see #getSingleSourceTable()
   * @generated
   */
  EAttribute getSingleSourceTable_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement <em>Single Source Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source Select Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement
   * @generated
   */
  EClass getSingleSourceSelectStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement#getSelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement#getSelectStatement()
   * @see #getSingleSourceSelectStatement()
   * @generated
   */
  EReference getSingleSourceSelectStatement_SelectStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin <em>Single Source Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source Join</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin
   * @generated
   */
  EClass getSingleSourceJoin();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin#getJoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join Source</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin#getJoinSource()
   * @see #getSingleSourceJoin()
   * @generated
   */
  EReference getSingleSourceJoin_JoinSource();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll <em>Result Column All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Column All</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll
   * @generated
   */
  EClass getResultColumnAll();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef <em>Result Column All With Table Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Column All With Table Ref</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef
   * @generated
   */
  EClass getResultColumnAllWithTableRef();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef#getTableRef <em>Table Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Ref</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAllWithTableRef#getTableRef()
   * @see #getResultColumnAllWithTableRef()
   * @generated
   */
  EAttribute getResultColumnAllWithTableRef_TableRef();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression <em>Result Column Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Column Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression
   * @generated
   */
  EClass getResultColumnExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression#getExpression()
   * @see #getResultColumnExpression()
   * @generated
   */
  EReference getResultColumnExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression#getName()
   * @see #getResultColumnExpression()
   * @generated
   */
  EAttribute getResultColumnExpression_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral#getNumber()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_Number();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral#getLiteral()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral#getLiteral()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral <em>Current Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Time Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral
   * @generated
   */
  EClass getCurrentTimeLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral#getLiteral()
   * @see #getCurrentTimeLiteral()
   * @generated
   */
  EAttribute getCurrentTimeLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral <em>Current Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Date Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral
   * @generated
   */
  EClass getCurrentDateLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral#getLiteral()
   * @see #getCurrentDateLiteral()
   * @generated
   */
  EAttribute getCurrentDateLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral <em>Current Time Stamp Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Time Stamp Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral
   * @generated
   */
  EClass getCurrentTimeStampLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral#getLiteral()
   * @see #getCurrentTimeStampLiteral()
   * @generated
   */
  EAttribute getCurrentTimeStampLiteral_Literal();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Column Type</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType
   * @generated
   */
  EEnum getColumnType();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution <em>Conflict Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Conflict Resolution</em>'.
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution
   * @generated
   */
  EEnum getConflictResolution();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SqliteModelFactory getSqliteModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ModelImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGE_NAME = eINSTANCE.getModel_PackageName();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DATABASE = eINSTANCE.getModel_Database();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl <em>Database Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DatabaseBlockImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDatabaseBlock()
     * @generated
     */
    EClass DATABASE_BLOCK = eINSTANCE.getDatabaseBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_BLOCK__NAME = eINSTANCE.getDatabaseBlock_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_BLOCK__ACTIONS = eINSTANCE.getDatabaseBlock_Actions();

    /**
     * The meta object literal for the '<em><b>Migrations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_BLOCK__MIGRATIONS = eINSTANCE.getDatabaseBlock_Migrations();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionBlockImpl <em>Action Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionBlockImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getActionBlock()
     * @generated
     */
    EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_BLOCK__ACTIONS = eINSTANCE.getActionBlock_Actions();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionStatementImpl <em>Action Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ActionStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getActionStatement()
     * @generated
     */
    EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_STATEMENT__NAME = eINSTANCE.getActionStatement_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_STATEMENT__PATH = eINSTANCE.getActionStatement_Path();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.MigrationBlockImpl <em>Migration Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.MigrationBlockImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getMigrationBlock()
     * @generated
     */
    EClass MIGRATION_BLOCK = eINSTANCE.getMigrationBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_BLOCK__STATEMENTS = eINSTANCE.getMigrationBlock_Statements();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqlExpressionImpl <em>Sql Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqlExpressionImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSqlExpression()
     * @generated
     */
    EClass SQL_EXPRESSION = eINSTANCE.getSqlExpression();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_EXPRESSION__ROOT = eINSTANCE.getSqlExpression_Root();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQL_EXPRESSION__ISNULL = eINSTANCE.getSqlExpression_Isnull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>When Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__WHEN_EXPRESSION = eINSTANCE.getCase_WhenExpression();

    /**
     * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__THEN_EXPRESSION = eINSTANCE.getCase_ThenExpression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StatmentImpl <em>Statment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StatmentImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getStatment()
     * @generated
     */
    EClass STATMENT = eINSTANCE.getStatment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATMENT__NAME = eINSTANCE.getStatment_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableClauseImpl <em>Alter Table Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableClauseImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableClause()
     * @generated
     */
    EClass ALTER_TABLE_CLAUSE = eINSTANCE.getAlterTableClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnDefImpl <em>Column Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnDefImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnDef()
     * @generated
     */
    EClass COLUMN_DEF = eINSTANCE.getColumnDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_DEF__NAME = eINSTANCE.getColumnDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_DEF__TYPE = eINSTANCE.getColumnDef_Type();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_DEF__CONSTRAINTS = eINSTANCE.getColumnDef_Constraints();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnConstraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnConstraint()
     * @generated
     */
    EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultValueImpl <em>Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultValueImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDefaultValue()
     * @generated
     */
    EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.TableConstraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getTableConstraint()
     * @generated
     */
    EClass TABLE_CONSTRAINT = eINSTANCE.getTableConstraint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_CONSTRAINT__NAME = eINSTANCE.getTableConstraint_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.IndexedColumnImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getIndexedColumn()
     * @generated
     */
    EClass INDEXED_COLUMN = eINSTANCE.getIndexedColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXED_COLUMN__NAME = eINSTANCE.getIndexedColumn_Name();

    /**
     * The meta object literal for the '<em><b>Asc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_COLUMN__ASC = eINSTANCE.getIndexedColumn_Asc();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_COLUMN__DESC = eINSTANCE.getIndexedColumn_Desc();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl <em>Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatement()
     * @generated
     */
    EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

    /**
     * The meta object literal for the '<em><b>Core Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__CORE_STATEMENTS = eINSTANCE.getSelectStatement_CoreStatements();

    /**
     * The meta object literal for the '<em><b>Ordering Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__ORDERING_TERMS = eINSTANCE.getSelectStatement_OrderingTerms();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.OrderingTermImpl <em>Ordering Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.OrderingTermImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getOrderingTerm()
     * @generated
     */
    EClass ORDERING_TERM = eINSTANCE.getOrderingTerm();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDERING_TERM__EXPRESSION = eINSTANCE.getOrderingTerm_Expression();

    /**
     * The meta object literal for the '<em><b>Asc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDERING_TERM__ASC = eINSTANCE.getOrderingTerm_Asc();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDERING_TERM__DESC = eINSTANCE.getOrderingTerm_Desc();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl <em>Select Core</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectCoreImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSelectCore()
     * @generated
     */
    EClass SELECT_CORE = eINSTANCE.getSelectCore();

    /**
     * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CORE__DISTINCT = eINSTANCE.getSelectCore_Distinct();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CORE__ALL = eINSTANCE.getSelectCore_All();

    /**
     * The meta object literal for the '<em><b>Result Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CORE__RESULT_COLUMNS = eINSTANCE.getSelectCore_ResultColumns();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CORE__SOURCE = eINSTANCE.getSelectCore_Source();

    /**
     * The meta object literal for the '<em><b>Where Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CORE__WHERE_EXPRESSION = eINSTANCE.getSelectCore_WhereExpression();

    /**
     * The meta object literal for the '<em><b>Group By Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CORE__GROUP_BY_EXPRESSIONS = eINSTANCE.getSelectCore_GroupByExpressions();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinSourceImpl <em>Join Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinSourceImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getJoinSource()
     * @generated
     */
    EClass JOIN_SOURCE = eINSTANCE.getJoinSource();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_SOURCE__SOURCE = eINSTANCE.getJoinSource_Source();

    /**
     * The meta object literal for the '<em><b>Join Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_SOURCE__JOIN_STATEMENTS = eINSTANCE.getJoinSource_JoinStatements();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceImpl <em>Single Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSource()
     * @generated
     */
    EClass SINGLE_SOURCE = eINSTANCE.getSingleSource();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinStatementImpl <em>Join Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.JoinStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getJoinStatement()
     * @generated
     */
    EClass JOIN_STATEMENT = eINSTANCE.getJoinStatement();

    /**
     * The meta object literal for the '<em><b>Natural</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_STATEMENT__NATURAL = eINSTANCE.getJoinStatement_Natural();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_STATEMENT__LEFT = eINSTANCE.getJoinStatement_Left();

    /**
     * The meta object literal for the '<em><b>Outer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_STATEMENT__OUTER = eINSTANCE.getJoinStatement_Outer();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_STATEMENT__INNER = eINSTANCE.getJoinStatement_Inner();

    /**
     * The meta object literal for the '<em><b>Cross</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_STATEMENT__CROSS = eINSTANCE.getJoinStatement_Cross();

    /**
     * The meta object literal for the '<em><b>Single Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_STATEMENT__SINGLE_SOURCE = eINSTANCE.getJoinStatement_SingleSource();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_STATEMENT__EXPRESSION = eINSTANCE.getJoinStatement_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnImpl <em>Result Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumn()
     * @generated
     */
    EClass RESULT_COLUMN = eINSTANCE.getResultColumn();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ConflictClauseImpl <em>Conflict Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ConflictClauseImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getConflictClause()
     * @generated
     */
    EClass CONFLICT_CLAUSE = eINSTANCE.getConflictClause();

    /**
     * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFLICT_CLAUSE__RESOLUTION = eINSTANCE.getConflictClause_Resolution();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralValueImpl <em>Literal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralValueImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getLiteralValue()
     * @generated
     */
    EClass LITERAL_VALUE = eINSTANCE.getLiteralValue();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprConcatImpl <em>Expr Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprConcatImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprConcat()
     * @generated
     */
    EClass EXPR_CONCAT = eINSTANCE.getExprConcat();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_CONCAT__LEFT = eINSTANCE.getExprConcat_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_CONCAT__OP = eINSTANCE.getExprConcat_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_CONCAT__RIGHT = eINSTANCE.getExprConcat_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprMultImpl <em>Expr Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprMultImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprMult()
     * @generated
     */
    EClass EXPR_MULT = eINSTANCE.getExprMult();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MULT__LEFT = eINSTANCE.getExprMult_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_MULT__OP = eINSTANCE.getExprMult_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MULT__RIGHT = eINSTANCE.getExprMult_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAddImpl <em>Expr Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAddImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprAdd()
     * @generated
     */
    EClass EXPR_ADD = eINSTANCE.getExprAdd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_ADD__LEFT = eINSTANCE.getExprAdd_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_ADD__OP = eINSTANCE.getExprAdd_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_ADD__RIGHT = eINSTANCE.getExprAdd_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprBitImpl <em>Expr Bit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprBitImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprBit()
     * @generated
     */
    EClass EXPR_BIT = eINSTANCE.getExprBit();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BIT__LEFT = eINSTANCE.getExprBit_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_BIT__OP = eINSTANCE.getExprBit_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BIT__RIGHT = eINSTANCE.getExprBit_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprRelateImpl <em>Expr Relate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprRelateImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprRelate()
     * @generated
     */
    EClass EXPR_RELATE = eINSTANCE.getExprRelate();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_RELATE__LEFT = eINSTANCE.getExprRelate_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_RELATE__OP = eINSTANCE.getExprRelate_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_RELATE__RIGHT = eINSTANCE.getExprRelate_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprEqualImpl <em>Expr Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprEqualImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprEqual()
     * @generated
     */
    EClass EXPR_EQUAL = eINSTANCE.getExprEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQUAL__LEFT = eINSTANCE.getExprEqual_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_EQUAL__OP = eINSTANCE.getExprEqual_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQUAL__RIGHT = eINSTANCE.getExprEqual_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAndImpl <em>Expr And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprAndImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprAnd()
     * @generated
     */
    EClass EXPR_AND = eINSTANCE.getExprAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__LEFT = eINSTANCE.getExprAnd_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_AND__OP = eINSTANCE.getExprAnd_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__RIGHT = eINSTANCE.getExprAnd_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprOrImpl <em>Expr Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExprOrImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExprOr()
     * @generated
     */
    EClass EXPR_OR = eINSTANCE.getExprOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__LEFT = eINSTANCE.getExprOr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_OR__OP = eINSTANCE.getExprOr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__RIGHT = eINSTANCE.getExprOr_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnLiteralImpl <em>Column Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ColumnLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnLiteral()
     * @generated
     */
    EClass COLUMN_LITERAL = eINSTANCE.getColumnLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_LITERAL__NAME = eINSTANCE.getColumnLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_LITERAL__ISNULL = eINSTANCE.getColumnLiteral_Isnull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Literal Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__LITERAL_VALUE = eINSTANCE.getLiteral_LiteralValue();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__ISNULL = eINSTANCE.getLiteral_Isnull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementExpressionImpl <em>Select Statement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SelectStatementExpressionImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatementExpression()
     * @generated
     */
    EClass SELECT_STATEMENT_EXPRESSION = eINSTANCE.getSelectStatementExpression();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_STATEMENT_EXPRESSION__NOT = eINSTANCE.getSelectStatementExpression_Not();

    /**
     * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_STATEMENT_EXPRESSION__EXISTS = eINSTANCE.getSelectStatementExpression_Exists();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT_EXPRESSION__SELECT = eINSTANCE.getSelectStatementExpression_Select();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_STATEMENT_EXPRESSION__ISNULL = eINSTANCE.getSelectStatementExpression_Isnull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CaseExpressionImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCaseExpression()
     * @generated
     */
    EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

    /**
     * The meta object literal for the '<em><b>Case Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__CASE_EXPRESSION = eINSTANCE.getCaseExpression_CaseExpression();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__CASES = eINSTANCE.getCaseExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getCaseExpression_ElseExpression();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_EXPRESSION__ISNULL = eINSTANCE.getCaseExpression_Isnull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.FunctionImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__ALL = eINSTANCE.getFunction_All();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ARGUMENTS = eINSTANCE.getFunction_Arguments();

    /**
     * The meta object literal for the '<em><b>Arugments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ARUGMENTS = eINSTANCE.getFunction_Arugments();

    /**
     * The meta object literal for the '<em><b>Isnull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__ISNULL = eINSTANCE.getFunction_Isnull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateTableStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCreateTableStatement()
     * @generated
     */
    EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

    /**
     * The meta object literal for the '<em><b>Column Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TABLE_STATEMENT__COLUMN_DEFS = eINSTANCE.getCreateTableStatement_ColumnDefs();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TABLE_STATEMENT__CONSTRAINTS = eINSTANCE.getCreateTableStatement_Constraints();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableStatementImpl <em>Alter Table Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableStatement()
     * @generated
     */
    EClass ALTER_TABLE_STATEMENT = eINSTANCE.getAlterTableStatement();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTER_TABLE_STATEMENT__CLAUSE = eINSTANCE.getAlterTableStatement_Clause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CreateViewStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCreateViewStatement()
     * @generated
     */
    EClass CREATE_VIEW_STATEMENT = eINSTANCE.getCreateViewStatement();

    /**
     * The meta object literal for the '<em><b>Select Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_VIEW_STATEMENT__SELECT_STATEMENT = eINSTANCE.getCreateViewStatement_SelectStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropTableStatementImpl <em>Drop Table Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropTableStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDropTableStatement()
     * @generated
     */
    EClass DROP_TABLE_STATEMENT = eINSTANCE.getDropTableStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropViewStatementImpl <em>Drop View Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DropViewStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDropViewStatement()
     * @generated
     */
    EClass DROP_VIEW_STATEMENT = eINSTANCE.getDropViewStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableRenameClauseImpl <em>Alter Table Rename Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableRenameClauseImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableRenameClause()
     * @generated
     */
    EClass ALTER_TABLE_RENAME_CLAUSE = eINSTANCE.getAlterTableRenameClause();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_TABLE_RENAME_CLAUSE__NAME = eINSTANCE.getAlterTableRenameClause_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableAddColumnClauseImpl <em>Alter Table Add Column Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.AlterTableAddColumnClauseImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableAddColumnClause()
     * @generated
     */
    EClass ALTER_TABLE_ADD_COLUMN_CLAUSE = eINSTANCE.getAlterTableAddColumnClause();

    /**
     * The meta object literal for the '<em><b>Column Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTER_TABLE_ADD_COLUMN_CLAUSE__COLUMN_DEF = eINSTANCE.getAlterTableAddColumnClause_ColumnDef();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryKeyColumnConstraintImpl <em>Primary Key Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryKeyColumnConstraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryKeyColumnConstraint()
     * @generated
     */
    EClass PRIMARY_KEY_COLUMN_CONSTRAINT = eINSTANCE.getPrimaryKeyColumnConstraint();

    /**
     * The meta object literal for the '<em><b>Asc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_KEY_COLUMN_CONSTRAINT__ASC = eINSTANCE.getPrimaryKeyColumnConstraint_Asc();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_KEY_COLUMN_CONSTRAINT__DESC = eINSTANCE.getPrimaryKeyColumnConstraint_Desc();

    /**
     * The meta object literal for the '<em><b>Autoincrement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT = eINSTANCE.getPrimaryKeyColumnConstraint_Autoincrement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NotNullConstraintImpl <em>Not Null Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NotNullConstraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getNotNullConstraint()
     * @generated
     */
    EClass NOT_NULL_CONSTRAINT = eINSTANCE.getNotNullConstraint();

    /**
     * The meta object literal for the '<em><b>Conflict Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_NULL_CONSTRAINT__CONFLICT_CLAUSE = eINSTANCE.getNotNullConstraint_ConflictClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultConstraintImpl <em>Default Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.DefaultConstraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getDefaultConstraint()
     * @generated
     */
    EClass DEFAULT_CONSTRAINT = eINSTANCE.getDefaultConstraint();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getDefaultConstraint_DefaultValue();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralDefaultValueImpl <em>Literal Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.LiteralDefaultValueImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getLiteralDefaultValue()
     * @generated
     */
    EClass LITERAL_DEFAULT_VALUE = eINSTANCE.getLiteralDefaultValue();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_DEFAULT_VALUE__LITERAL = eINSTANCE.getLiteralDefaultValue_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionDefaultValueImpl <em>Expression Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ExpressionDefaultValueImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getExpressionDefaultValue()
     * @generated
     */
    EClass EXPRESSION_DEFAULT_VALUE = eINSTANCE.getExpressionDefaultValue();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_DEFAULT_VALUE__EXPRESSION = eINSTANCE.getExpressionDefaultValue_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UniqueTableContraintImpl <em>Unique Table Contraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.UniqueTableContraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getUniqueTableContraint()
     * @generated
     */
    EClass UNIQUE_TABLE_CONTRAINT = eINSTANCE.getUniqueTableContraint();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_TABLE_CONTRAINT__COLUMNS = eINSTANCE.getUniqueTableContraint_Columns();

    /**
     * The meta object literal for the '<em><b>Conflict Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE = eINSTANCE.getUniqueTableContraint_ConflictClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryContraintImpl <em>Primary Contraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.PrimaryContraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryContraint()
     * @generated
     */
    EClass PRIMARY_CONTRAINT = eINSTANCE.getPrimaryContraint();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_CONTRAINT__COLUMNS = eINSTANCE.getPrimaryContraint_Columns();

    /**
     * The meta object literal for the '<em><b>Conflict Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_CONTRAINT__CONFLICT_CLAUSE = eINSTANCE.getPrimaryContraint_ConflictClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CheckTableConstraintImpl <em>Check Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CheckTableConstraintImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCheckTableConstraint()
     * @generated
     */
    EClass CHECK_TABLE_CONSTRAINT = eINSTANCE.getCheckTableConstraint();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_TABLE_CONSTRAINT__EXPRESSION = eINSTANCE.getCheckTableConstraint_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceTableImpl <em>Single Source Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceTableImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceTable()
     * @generated
     */
    EClass SINGLE_SOURCE_TABLE = eINSTANCE.getSingleSourceTable();

    /**
     * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_SOURCE_TABLE__TABLE_NAME = eINSTANCE.getSingleSourceTable_TableName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_SOURCE_TABLE__NAME = eINSTANCE.getSingleSourceTable_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceSelectStatementImpl <em>Single Source Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceSelectStatementImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceSelectStatement()
     * @generated
     */
    EClass SINGLE_SOURCE_SELECT_STATEMENT = eINSTANCE.getSingleSourceSelectStatement();

    /**
     * The meta object literal for the '<em><b>Select Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT = eINSTANCE.getSingleSourceSelectStatement_SelectStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceJoinImpl <em>Single Source Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SingleSourceJoinImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceJoin()
     * @generated
     */
    EClass SINGLE_SOURCE_JOIN = eINSTANCE.getSingleSourceJoin();

    /**
     * The meta object literal for the '<em><b>Join Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_SOURCE_JOIN__JOIN_SOURCE = eINSTANCE.getSingleSourceJoin_JoinSource();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllImpl <em>Result Column All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumnAll()
     * @generated
     */
    EClass RESULT_COLUMN_ALL = eINSTANCE.getResultColumnAll();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllWithTableRefImpl <em>Result Column All With Table Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnAllWithTableRefImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumnAllWithTableRef()
     * @generated
     */
    EClass RESULT_COLUMN_ALL_WITH_TABLE_REF = eINSTANCE.getResultColumnAllWithTableRef();

    /**
     * The meta object literal for the '<em><b>Table Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_COLUMN_ALL_WITH_TABLE_REF__TABLE_REF = eINSTANCE.getResultColumnAllWithTableRef_TableRef();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnExpressionImpl <em>Result Column Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.ResultColumnExpressionImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getResultColumnExpression()
     * @generated
     */
    EClass RESULT_COLUMN_EXPRESSION = eINSTANCE.getResultColumnExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_COLUMN_EXPRESSION__EXPRESSION = eINSTANCE.getResultColumnExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_COLUMN_EXPRESSION__NAME = eINSTANCE.getResultColumnExpression_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NumericLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getNumericLiteral()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_LITERAL__NUMBER = eINSTANCE.getNumericLiteral_Number();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.StringLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__LITERAL = eINSTANCE.getStringLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.NullLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_LITERAL__LITERAL = eINSTANCE.getNullLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeLiteralImpl <em>Current Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeLiteral()
     * @generated
     */
    EClass CURRENT_TIME_LITERAL = eINSTANCE.getCurrentTimeLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENT_TIME_LITERAL__LITERAL = eINSTANCE.getCurrentTimeLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentDateLiteralImpl <em>Current Date Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentDateLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCurrentDateLiteral()
     * @generated
     */
    EClass CURRENT_DATE_LITERAL = eINSTANCE.getCurrentDateLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENT_DATE_LITERAL__LITERAL = eINSTANCE.getCurrentDateLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeStampLiteralImpl <em>Current Time Stamp Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.CurrentTimeStampLiteralImpl
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeStampLiteral()
     * @generated
     */
    EClass CURRENT_TIME_STAMP_LITERAL = eINSTANCE.getCurrentTimeStampLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENT_TIME_STAMP_LITERAL__LITERAL = eINSTANCE.getCurrentTimeStampLiteral_Literal();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType <em>Column Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getColumnType()
     * @generated
     */
    EEnum COLUMN_TYPE = eINSTANCE.getColumnType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution <em>Conflict Resolution</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution
     * @see com.robotoworks.mechanoid.sqlite.sqliteModel.impl.SqliteModelPackageImpl#getConflictResolution()
     * @generated
     */
    EEnum CONFLICT_RESOLUTION = eINSTANCE.getConflictResolution();

  }

} //SqliteModelPackage
