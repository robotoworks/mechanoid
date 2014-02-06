/**
 */
package com.robotoworks.mechanoid.db.sqliteModel;

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
 * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelFactory
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
  String eNS_URI = "http://www.robotoworks.com/mechanoid/db/SqliteModel";

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
  SqliteModelPackage eINSTANCE = com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ModelImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getModel()
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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DatabaseBlockImpl <em>Database Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DatabaseBlockImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDatabaseBlock()
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
   * The feature id for the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__CONFIG = 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__INIT = 2;

  /**
   * The feature id for the '<em><b>Migrations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__MIGRATIONS = 3;

  /**
   * The number of structural features of the '<em>Database Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigBlockImpl <em>Config Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigBlockImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConfigBlock()
   * @generated
   */
  int CONFIG_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Config Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InitBlockImpl <em>Init Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.InitBlockImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getInitBlock()
   * @generated
   */
  int INIT_BLOCK = 3;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Init Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigurationStatementImpl <em>Configuration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigurationStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConfigurationStatement()
   * @generated
   */
  int CONFIGURATION_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_STATEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Configuration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgImpl <em>Function Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getFunctionArg()
   * @generated
   */
  int FUNCTION_ARG = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARG__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARG__NAME = 1;

  /**
   * The number of structural features of the '<em>Function Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriImpl <em>Content Uri</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getContentUri()
   * @generated
   */
  int CONTENT_URI = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI__TYPE = 0;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI__SEGMENTS = 1;

  /**
   * The number of structural features of the '<em>Content Uri</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriSegmentImpl <em>Content Uri Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriSegmentImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getContentUriSegment()
   * @generated
   */
  int CONTENT_URI_SEGMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_SEGMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Content Uri Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_SEGMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.MigrationBlockImpl <em>Migration Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.MigrationBlockImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getMigrationBlock()
   * @generated
   */
  int MIGRATION_BLOCK = 8;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CaseImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCase()
   * @generated
   */
  int CASE = 10;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DMLStatementImpl <em>DML Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DMLStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDMLStatement()
   * @generated
   */
  int DML_STATEMENT = 43;

  /**
   * The number of structural features of the '<em>DML Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DML_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Core</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__CORE = DML_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Orderby</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__ORDERBY = DML_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__LIMIT = DML_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Limit Offset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__LIMIT_OFFSET = DML_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = DML_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermListImpl <em>Ordering Term List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermListImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getOrderingTermList()
   * @generated
   */
  int ORDERING_TERM_LIST = 12;

  /**
   * The feature id for the '<em><b>Ordering Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERING_TERM_LIST__ORDERING_TERMS = 0;

  /**
   * The number of structural features of the '<em>Ordering Term List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERING_TERM_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreExpressionImpl <em>Select Core Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectCoreExpression()
   * @generated
   */
  int SELECT_CORE_EXPRESSION = 13;

  /**
   * The number of structural features of the '<em>Select Core Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectListImpl <em>Select List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectListImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectList()
   * @generated
   */
  int SELECT_LIST = 14;

  /**
   * The feature id for the '<em><b>Result Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST__RESULT_COLUMNS = 0;

  /**
   * The number of structural features of the '<em>Select List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.WhereExpressionsImpl <em>Where Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.WhereExpressionsImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getWhereExpressions()
   * @generated
   */
  int WHERE_EXPRESSIONS = 15;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSIONS__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Where Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.GroupByExpressionsImpl <em>Group By Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.GroupByExpressionsImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getGroupByExpressions()
   * @generated
   */
  int GROUP_BY_EXPRESSIONS = 16;

  /**
   * The feature id for the '<em><b>Group By Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Group By Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_EXPRESSIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.HavingExpressionsImpl <em>Having Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.HavingExpressionsImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getHavingExpressions()
   * @generated
   */
  int HAVING_EXPRESSIONS = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_EXPRESSIONS__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Having Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_EXPRESSIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermImpl <em>Ordering Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getOrderingTerm()
   * @generated
   */
  int ORDERING_TERM = 18;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinSourceImpl <em>Join Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.JoinSourceImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getJoinSource()
   * @generated
   */
  int JOIN_SOURCE = 19;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceImpl <em>Single Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSource()
   * @generated
   */
  int SINGLE_SOURCE = 20;

  /**
   * The number of structural features of the '<em>Single Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectSourceImpl <em>Select Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectSourceImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectSource()
   * @generated
   */
  int SELECT_SOURCE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SOURCE__NAME = SINGLE_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SOURCE_FEATURE_COUNT = SINGLE_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceJoinImpl <em>Single Source Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceJoinImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceJoin()
   * @generated
   */
  int SINGLE_SOURCE_JOIN = 22;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl <em>Join Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getJoinStatement()
   * @generated
   */
  int JOIN_STATEMENT = 23;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceImpl <em>Column Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnSource()
   * @generated
   */
  int COLUMN_SOURCE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SOURCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Column Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralValueImpl <em>Literal Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralValueImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getLiteralValue()
   * @generated
   */
  int LITERAL_VALUE = 25;

  /**
   * The number of structural features of the '<em>Literal Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DDLStatementImpl <em>DDL Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DDLStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDDLStatement()
   * @generated
   */
  int DDL_STATEMENT = 26;

  /**
   * The number of structural features of the '<em>DDL Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDL_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.TableDefinitionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getTableDefinition()
   * @generated
   */
  int TABLE_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__NAME = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Table Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl <em>Create Trigger Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateTriggerStatement()
   * @generated
   */
  int CREATE_TRIGGER_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__TEMPORARY = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__NAME = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__WHEN = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Event Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__EVENT_TYPE = DDL_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Update Column Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES = DDL_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__TABLE = DDL_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>For Each Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW = DDL_STATEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION = DDL_STATEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT__STATEMENTS = DDL_STATEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Create Trigger Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TRIGGER_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableAddColumnStatementImpl <em>Alter Table Add Column Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableAddColumnStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableAddColumnStatement()
   * @generated
   */
  int ALTER_TABLE_ADD_COLUMN_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Column Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alter Table Add Column Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_ADD_COLUMN_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropTableStatementImpl <em>Drop Table Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropTableStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropTableStatement()
   * @generated
   */
  int DROP_TABLE_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TABLE_STATEMENT__IF_EXISTS = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TABLE_STATEMENT__TABLE = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drop Table Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TABLE_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropTriggerStatementImpl <em>Drop Trigger Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropTriggerStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropTriggerStatement()
   * @generated
   */
  int DROP_TRIGGER_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TRIGGER_STATEMENT__IF_EXISTS = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TRIGGER_STATEMENT__TRIGGER = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drop Trigger Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_TRIGGER_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropViewStatementImpl <em>Drop View Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropViewStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropViewStatement()
   * @generated
   */
  int DROP_VIEW_STATEMENT = 32;

  /**
   * The feature id for the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_VIEW_STATEMENT__IF_EXISTS = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_VIEW_STATEMENT__VIEW = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drop View Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_VIEW_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateIndexStatement()
   * @generated
   */
  int CREATE_INDEX_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INDEX_STATEMENT__UNIQUE = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INDEX_STATEMENT__NAME = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INDEX_STATEMENT__TABLE = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INDEX_STATEMENT__COLUMNS = DDL_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Create Index Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_INDEX_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropIndexStatementImpl <em>Drop Index Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropIndexStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropIndexStatement()
   * @generated
   */
  int DROP_INDEX_STATEMENT = 34;

  /**
   * The feature id for the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_INDEX_STATEMENT__IF_EXISTS = DDL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_INDEX_STATEMENT__INDEX = DDL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drop Index Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_INDEX_STATEMENT_FEATURE_COUNT = DDL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnConstraint()
   * @generated
   */
  int COLUMN_CONSTRAINT = 35;

  /**
   * The number of structural features of the '<em>Column Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.TableConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getTableConstraint()
   * @generated
   */
  int TABLE_CONSTRAINT = 36;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueTableConstraintImpl <em>Unique Table Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueTableConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUniqueTableConstraint()
   * @generated
   */
  int UNIQUE_TABLE_CONSTRAINT = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONSTRAINT__CONFLICT_CLAUSE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unique Table Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryConstraintImpl <em>Primary Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryConstraint()
   * @generated
   */
  int PRIMARY_CONSTRAINT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONSTRAINT__CONFLICT_CLAUSE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Primary Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CheckTableConstraintImpl <em>Check Table Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CheckTableConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCheckTableConstraint()
   * @generated
   */
  int CHECK_TABLE_CONSTRAINT = 39;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getIndexedColumn()
   * @generated
   */
  int INDEXED_COLUMN = 40;

  /**
   * The feature id for the '<em><b>Column Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__COLUMN_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Collation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__COLLATION_NAME = 1;

  /**
   * The feature id for the '<em><b>Asc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__ASC = 2;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN__DESC = 3;

  /**
   * The number of structural features of the '<em>Indexed Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_COLUMN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultValueImpl <em>Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultValueImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDefaultValue()
   * @generated
   */
  int DEFAULT_VALUE = 41;

  /**
   * The number of structural features of the '<em>Default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConflictClauseImpl <em>Conflict Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ConflictClauseImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConflictClause()
   * @generated
   */
  int CONFLICT_CLAUSE = 42;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DeleteStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDeleteStatement()
   * @generated
   */
  int DELETE_STATEMENT = 44;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT__TABLE = DML_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT__EXPRESSION = DML_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Delete Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT_FEATURE_COUNT = DML_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl <em>Insert Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getInsertStatement()
   * @generated
   */
  int INSERT_STATEMENT = 45;

  /**
   * The feature id for the '<em><b>Conflict Resolution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_STATEMENT__CONFLICT_RESOLUTION = DML_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_STATEMENT__TABLE = DML_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Column Names</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_STATEMENT__COLUMN_NAMES = DML_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_STATEMENT__EXPRESSIONS = DML_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_STATEMENT__SELECT_STATEMENT = DML_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Insert Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_STATEMENT_FEATURE_COUNT = DML_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUpdateStatement()
   * @generated
   */
  int UPDATE_STATEMENT = 46;

  /**
   * The feature id for the '<em><b>Conflict Resolution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__CONFLICT_RESOLUTION = DML_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__TABLE = DML_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Update Column Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS = DML_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Where Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__WHERE_EXPRESSION = DML_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Update Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT_FEATURE_COUNT = DML_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateColumnExpressionImpl <em>Update Column Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateColumnExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUpdateColumnExpression()
   * @generated
   */
  int UPDATE_COLUMN_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COLUMN_EXPRESSION__COLUMN_NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COLUMN_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Update Column Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_COLUMN_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ActionStatementImpl <em>Action Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ActionStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getActionStatement()
   * @generated
   */
  int ACTION_STATEMENT = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__NAME = CONFIGURATION_STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__URI = CONFIGURATION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT_FEATURE_COUNT = CONFIGURATION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = CONFIGURATION_STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARGS = CONFIGURATION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__STATEMENTS = CONFIGURATION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ALL = CONFIGURATION_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARGUMENTS = CONFIGURATION_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = CONFIGURATION_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriParamSegmentImpl <em>Content Uri Param Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriParamSegmentImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getContentUriParamSegment()
   * @generated
   */
  int CONTENT_URI_PARAM_SEGMENT = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_PARAM_SEGMENT__NAME = CONTENT_URI_SEGMENT__NAME;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_PARAM_SEGMENT__NUM = CONTENT_URI_SEGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_PARAM_SEGMENT__TEXT = CONTENT_URI_SEGMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Content Uri Param Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_URI_PARAM_SEGMENT_FEATURE_COUNT = CONTENT_URI_SEGMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprConcatImpl <em>Expr Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprConcatImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprConcat()
   * @generated
   */
  int EXPR_CONCAT = 51;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprMultImpl <em>Expr Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprMultImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprMult()
   * @generated
   */
  int EXPR_MULT = 52;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAddImpl <em>Expr Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAddImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprAdd()
   * @generated
   */
  int EXPR_ADD = 53;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprBitImpl <em>Expr Bit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprBitImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprBit()
   * @generated
   */
  int EXPR_BIT = 54;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprRelateImpl <em>Expr Relate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprRelateImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprRelate()
   * @generated
   */
  int EXPR_RELATE = 55;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprEqualImpl <em>Expr Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprEqualImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprEqual()
   * @generated
   */
  int EXPR_EQUAL = 56;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAndImpl <em>Expr And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAndImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprAnd()
   * @generated
   */
  int EXPR_AND = 57;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprOrImpl <em>Expr Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprOrImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprOr()
   * @generated
   */
  int EXPR_OR = 58;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NullCheckExpressionImpl <em>Null Check Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NullCheckExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNullCheckExpression()
   * @generated
   */
  int NULL_CHECK_EXPRESSION = 59;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_CHECK_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_CHECK_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Null Check Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_CHECK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IsNullImpl <em>Is Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.IsNullImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getIsNull()
   * @generated
   */
  int IS_NULL = 60;

  /**
   * The number of structural features of the '<em>Is Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullImpl <em>Not Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNotNull()
   * @generated
   */
  int NOT_NULL = 61;

  /**
   * The number of structural features of the '<em>Not Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NewColumnImpl <em>New Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NewColumnImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNewColumn()
   * @generated
   */
  int NEW_COLUMN = 62;

  /**
   * The feature id for the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_COLUMN__COLUMN = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_COLUMN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OldColumnImpl <em>Old Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.OldColumnImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getOldColumn()
   * @generated
   */
  int OLD_COLUMN = 63;

  /**
   * The feature id for the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OLD_COLUMN__COLUMN = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Old Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OLD_COLUMN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceRefImpl <em>Column Source Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceRefImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnSourceRef()
   * @generated
   */
  int COLUMN_SOURCE_REF = 64;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SOURCE_REF__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SOURCE_REF__ALL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SOURCE_REF__COLUMN = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Column Source Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_SOURCE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 65;

  /**
   * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LITERAL_VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NestedExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNestedExpression()
   * @generated
   */
  int NESTED_EXPRESSION = 66;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementExpressionImpl <em>Select Statement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatementExpression()
   * @generated
   */
  int SELECT_STATEMENT_EXPRESSION = 67;

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
   * The number of structural features of the '<em>Select Statement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CaseExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 68;

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
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CastExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgumentImpl <em>Function Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgumentImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getFunctionArgument()
   * @generated
   */
  int FUNCTION_ARGUMENT = 70;

  /**
   * The feature id for the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENT__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreImpl <em>Select Core</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectCore()
   * @generated
   */
  int SELECT_CORE = 71;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__LEFT = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__OP = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE__RIGHT = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Select Core</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CORE_FEATURE_COUNT = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectExpression()
   * @generated
   */
  int SELECT_EXPRESSION = 72;

  /**
   * The feature id for the '<em><b>Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__DISTINCT = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__ALL = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__ALL_COLUMNS = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Select List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__SELECT_LIST = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__SOURCE = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__WHERE = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Group By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__GROUP_BY = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION__HAVING = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Select Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION_FEATURE_COUNT = SELECT_CORE_EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceTableImpl <em>Single Source Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceTableImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceTable()
   * @generated
   */
  int SINGLE_SOURCE_TABLE = 73;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_TABLE__NAME = SELECT_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Table Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_TABLE__TABLE_REFERENCE = SELECT_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Source Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_TABLE_FEATURE_COUNT = SELECT_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceSelectStatementImpl <em>Single Source Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceSelectStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceSelectStatement()
   * @generated
   */
  int SINGLE_SOURCE_SELECT_STATEMENT = 74;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_SELECT_STATEMENT__NAME = SELECT_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT = SELECT_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Source Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_SOURCE_SELECT_STATEMENT_FEATURE_COUNT = SELECT_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ResultColumnImpl <em>Result Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ResultColumnImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getResultColumn()
   * @generated
   */
  int RESULT_COLUMN = 75;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN__NAME = COLUMN_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN__EXPRESSION = COLUMN_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Result Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_COLUMN_FEATURE_COUNT = COLUMN_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NumericLiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 76;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.StringLiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 77;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NullLiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 78;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeLiteralImpl <em>Current Time Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeLiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeLiteral()
   * @generated
   */
  int CURRENT_TIME_LITERAL = 79;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentDateLiteralImpl <em>Current Date Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentDateLiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCurrentDateLiteral()
   * @generated
   */
  int CURRENT_DATE_LITERAL = 80;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeStampLiteralImpl <em>Current Time Stamp Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeStampLiteralImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeStampLiteral()
   * @generated
   */
  int CURRENT_TIME_STAMP_LITERAL = 81;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateTableStatement()
   * @generated
   */
  int CREATE_TABLE_STATEMENT = 82;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__NAME = TABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__TEMPORARY = TABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Column Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__COLUMN_DEFS = TABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__CONSTRAINTS = TABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Create Table Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT_FEATURE_COUNT = TABLE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateViewStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateViewStatement()
   * @generated
   */
  int CREATE_VIEW_STATEMENT = 83;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT__NAME = TABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT__TEMPORARY = TABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT__SELECT_STATEMENT = TABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create View Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_VIEW_STATEMENT_FEATURE_COUNT = TABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableRenameStatementImpl <em>Alter Table Rename Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableRenameStatementImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableRenameStatement()
   * @generated
   */
  int ALTER_TABLE_RENAME_STATEMENT = 84;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_RENAME_STATEMENT__NAME = TABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_RENAME_STATEMENT__TABLE = TABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alter Table Rename Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTER_TABLE_RENAME_STATEMENT_FEATURE_COUNT = TABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnDefImpl <em>Column Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnDefImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnDef()
   * @generated
   */
  int COLUMN_DEF = 85;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF__NAME = COLUMN_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF__TYPE = COLUMN_SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF__CONSTRAINTS = COLUMN_SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Column Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_DEF_FEATURE_COUNT = COLUMN_SOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl <em>Primary Key Column Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryKeyColumnConstraint()
   * @generated
   */
  int PRIMARY_KEY_COLUMN_CONSTRAINT = 86;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullConstraintImpl <em>Not Null Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNotNullConstraint()
   * @generated
   */
  int NOT_NULL_CONSTRAINT = 87;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUniqueConstraint()
   * @generated
   */
  int UNIQUE_CONSTRAINT = 88;

  /**
   * The feature id for the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_CONSTRAINT__CONFLICT_CLAUSE = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unique Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultConstraintImpl <em>Default Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDefaultConstraint()
   * @generated
   */
  int DEFAULT_CONSTRAINT = 89;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CheckConstraintImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCheckConstraint()
   * @generated
   */
  int CHECK_CONSTRAINT = 90;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_CONSTRAINT__EXPRESSION = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralDefaultValueImpl <em>Literal Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralDefaultValueImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getLiteralDefaultValue()
   * @generated
   */
  int LITERAL_DEFAULT_VALUE = 91;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionDefaultValueImpl <em>Expression Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionDefaultValueImpl
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExpressionDefaultValue()
   * @generated
   */
  int EXPRESSION_DEFAULT_VALUE = 92;

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
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator <em>Compound Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCompoundOperator()
   * @generated
   */
  int COMPOUND_OPERATOR = 93;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType <em>Sqlite Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSqliteDataType()
   * @generated
   */
  int SQLITE_DATA_TYPE = 94;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnType <em>Column Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnType()
   * @generated
   */
  int COLUMN_TYPE = 95;

  /**
   * The meta object id for the '{@link com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution <em>Conflict Resolution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution
   * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConflictResolution()
   * @generated
   */
  int CONFLICT_RESOLUTION = 96;


  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.Model#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Model#getDatabase()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Database();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock <em>Database Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Block</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock
   * @generated
   */
  EClass getDatabaseBlock();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getName()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Config</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getConfig()
   * @see #getDatabaseBlock()
   * @generated
   */
  EReference getDatabaseBlock_Config();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getInit()
   * @see #getDatabaseBlock()
   * @generated
   */
  EReference getDatabaseBlock_Init();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getMigrations <em>Migrations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrations</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock#getMigrations()
   * @see #getDatabaseBlock()
   * @generated
   */
  EReference getDatabaseBlock_Migrations();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock <em>Config Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Block</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock
   * @generated
   */
  EClass getConfigBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock#getStatements()
   * @see #getConfigBlock()
   * @generated
   */
  EReference getConfigBlock_Statements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.InitBlock <em>Init Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Block</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InitBlock
   * @generated
   */
  EClass getInitBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.InitBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InitBlock#getStatements()
   * @see #getInitBlock()
   * @generated
   */
  EReference getInitBlock_Statements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement <em>Configuration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement
   * @generated
   */
  EClass getConfigurationStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement#getName()
   * @see #getConfigurationStatement()
   * @generated
   */
  EAttribute getConfigurationStatement_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg <em>Function Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Arg</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArg
   * @generated
   */
  EClass getFunctionArg();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getType()
   * @see #getFunctionArg()
   * @generated
   */
  EAttribute getFunctionArg_Type();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArg#getName()
   * @see #getFunctionArg()
   * @generated
   */
  EAttribute getFunctionArg_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUri <em>Content Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Uri</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUri
   * @generated
   */
  EClass getContentUri();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUri#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUri#getType()
   * @see #getContentUri()
   * @generated
   */
  EAttribute getContentUri_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUri#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUri#getSegments()
   * @see #getContentUri()
   * @generated
   */
  EReference getContentUri_Segments();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment <em>Content Uri Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Uri Segment</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment
   * @generated
   */
  EClass getContentUriSegment();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment#getName()
   * @see #getContentUriSegment()
   * @generated
   */
  EAttribute getContentUriSegment_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock <em>Migration Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Block</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock
   * @generated
   */
  EClass getMigrationBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock#getStatements()
   * @see #getMigrationBlock()
   * @generated
   */
  EReference getMigrationBlock_Statements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.Case#getWhenExpression <em>When Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Case#getWhenExpression()
   * @see #getCase()
   * @generated
   */
  EReference getCase_WhenExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.Case#getThenExpression <em>Then Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Case#getThenExpression()
   * @see #getCase()
   * @generated
   */
  EReference getCase_ThenExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getCore <em>Core</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Core</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getCore()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Core();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getOrderby <em>Orderby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orderby</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getOrderby()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Orderby();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimit()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Limit();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimitOffset <em>Limit Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit Offset</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatement#getLimitOffset()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_LimitOffset();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList <em>Ordering Term List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordering Term List</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList
   * @generated
   */
  EClass getOrderingTermList();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList#getOrderingTerms <em>Ordering Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordering Terms</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList#getOrderingTerms()
   * @see #getOrderingTermList()
   * @generated
   */
  EReference getOrderingTermList_OrderingTerms();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression <em>Select Core Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Core Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression
   * @generated
   */
  EClass getSelectCoreExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectList <em>Select List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select List</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectList
   * @generated
   */
  EClass getSelectList();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectList#getResultColumns <em>Result Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result Columns</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectList#getResultColumns()
   * @see #getSelectList()
   * @generated
   */
  EReference getSelectList_ResultColumns();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions <em>Where Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Expressions</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions
   * @generated
   */
  EClass getWhereExpressions();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions#getExpression()
   * @see #getWhereExpressions()
   * @generated
   */
  EReference getWhereExpressions_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions <em>Group By Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group By Expressions</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions
   * @generated
   */
  EClass getGroupByExpressions();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions#getGroupByExpressions <em>Group By Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group By Expressions</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions#getGroupByExpressions()
   * @see #getGroupByExpressions()
   * @generated
   */
  EReference getGroupByExpressions_GroupByExpressions();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions <em>Having Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Having Expressions</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions
   * @generated
   */
  EClass getHavingExpressions();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions#getExpression()
   * @see #getHavingExpressions()
   * @generated
   */
  EReference getHavingExpressions_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm <em>Ordering Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordering Term</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm
   * @generated
   */
  EClass getOrderingTerm();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#getExpression()
   * @see #getOrderingTerm()
   * @generated
   */
  EReference getOrderingTerm_Expression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isAsc <em>Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isAsc()
   * @see #getOrderingTerm()
   * @generated
   */
  EAttribute getOrderingTerm_Asc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm#isDesc()
   * @see #getOrderingTerm()
   * @generated
   */
  EAttribute getOrderingTerm_Desc();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinSource
   * @generated
   */
  EClass getJoinSource();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinSource#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinSource#getSource()
   * @see #getJoinSource()
   * @generated
   */
  EReference getJoinSource_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinSource#getJoinStatements <em>Join Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Statements</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinSource#getJoinStatements()
   * @see #getJoinSource()
   * @generated
   */
  EReference getJoinSource_JoinStatements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSource
   * @generated
   */
  EClass getSingleSource();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectSource <em>Select Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectSource
   * @generated
   */
  EClass getSelectSource();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectSource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectSource#getName()
   * @see #getSelectSource()
   * @generated
   */
  EAttribute getSelectSource_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin <em>Single Source Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source Join</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin
   * @generated
   */
  EClass getSingleSourceJoin();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin#getJoinSource <em>Join Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin#getJoinSource()
   * @see #getSingleSourceJoin()
   * @generated
   */
  EReference getSingleSourceJoin_JoinSource();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement
   * @generated
   */
  EClass getJoinStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isNatural <em>Natural</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Natural</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isNatural()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Natural();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isLeft()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isOuter <em>Outer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Outer</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isOuter()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Outer();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inner</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isInner()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Inner();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isCross <em>Cross</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cross</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#isCross()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Cross();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getSingleSource <em>Single Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getSingleSource()
   * @see #getJoinStatement()
   * @generated
   */
  EReference getJoinStatement_SingleSource();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.JoinStatement#getExpression()
   * @see #getJoinStatement()
   * @generated
   */
  EReference getJoinStatement_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSource <em>Column Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSource
   * @generated
   */
  EClass getColumnSource();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSource#getName()
   * @see #getColumnSource()
   * @generated
   */
  EAttribute getColumnSource_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Value</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.LiteralValue
   * @generated
   */
  EClass getLiteralValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DDLStatement <em>DDL Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DDL Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DDLStatement
   * @generated
   */
  EClass getDDLStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Definition</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.TableDefinition
   * @generated
   */
  EClass getTableDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.TableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.TableDefinition#getName()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement <em>Create Trigger Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Trigger Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement
   * @generated
   */
  EClass getCreateTriggerStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#isTemporary <em>Temporary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temporary</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#isTemporary()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EAttribute getCreateTriggerStatement_Temporary();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getName()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EAttribute getCreateTriggerStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhen()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EAttribute getCreateTriggerStatement_When();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getEventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getEventType()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EAttribute getCreateTriggerStatement_EventType();

  /**
   * Returns the meta object for the attribute list '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getUpdateColumnNames <em>Update Column Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Update Column Names</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getUpdateColumnNames()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EAttribute getCreateTriggerStatement_UpdateColumnNames();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getTable()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EReference getCreateTriggerStatement_Table();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getForEachRow <em>For Each Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>For Each Row</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getForEachRow()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EAttribute getCreateTriggerStatement_ForEachRow();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhenExpression <em>When Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getWhenExpression()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EReference getCreateTriggerStatement_WhenExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement#getStatements()
   * @see #getCreateTriggerStatement()
   * @generated
   */
  EReference getCreateTriggerStatement_Statements();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement <em>Alter Table Add Column Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Table Add Column Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement
   * @generated
   */
  EClass getAlterTableAddColumnStatement();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getTable()
   * @see #getAlterTableAddColumnStatement()
   * @generated
   */
  EReference getAlterTableAddColumnStatement_Table();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Def</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement#getColumnDef()
   * @see #getAlterTableAddColumnStatement()
   * @generated
   */
  EReference getAlterTableAddColumnStatement_ColumnDef();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement <em>Drop Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Table Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement
   * @generated
   */
  EClass getDropTableStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#isIfExists <em>If Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>If Exists</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#isIfExists()
   * @see #getDropTableStatement()
   * @generated
   */
  EAttribute getDropTableStatement_IfExists();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement#getTable()
   * @see #getDropTableStatement()
   * @generated
   */
  EReference getDropTableStatement_Table();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement <em>Drop Trigger Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Trigger Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement
   * @generated
   */
  EClass getDropTriggerStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement#isIfExists <em>If Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>If Exists</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement#isIfExists()
   * @see #getDropTriggerStatement()
   * @generated
   */
  EAttribute getDropTriggerStatement_IfExists();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trigger</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement#getTrigger()
   * @see #getDropTriggerStatement()
   * @generated
   */
  EReference getDropTriggerStatement_Trigger();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement <em>Drop View Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop View Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement
   * @generated
   */
  EClass getDropViewStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement#isIfExists <em>If Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>If Exists</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement#isIfExists()
   * @see #getDropViewStatement()
   * @generated
   */
  EAttribute getDropViewStatement_IfExists();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement#getView()
   * @see #getDropViewStatement()
   * @generated
   */
  EReference getDropViewStatement_View();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement <em>Create Index Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Index Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement
   * @generated
   */
  EClass getCreateIndexStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#isUnique()
   * @see #getCreateIndexStatement()
   * @generated
   */
  EAttribute getCreateIndexStatement_Unique();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#getName()
   * @see #getCreateIndexStatement()
   * @generated
   */
  EAttribute getCreateIndexStatement_Name();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#getTable()
   * @see #getCreateIndexStatement()
   * @generated
   */
  EReference getCreateIndexStatement_Table();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement#getColumns()
   * @see #getCreateIndexStatement()
   * @generated
   */
  EReference getCreateIndexStatement_Columns();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement <em>Drop Index Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Index Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement
   * @generated
   */
  EClass getDropIndexStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement#isIfExists <em>If Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>If Exists</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement#isIfExists()
   * @see #getDropIndexStatement()
   * @generated
   */
  EAttribute getDropIndexStatement_IfExists();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Index</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement#getIndex()
   * @see #getDropIndexStatement()
   * @generated
   */
  EReference getDropIndexStatement_Index();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnConstraint <em>Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnConstraint
   * @generated
   */
  EClass getColumnConstraint();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.TableConstraint <em>Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.TableConstraint
   * @generated
   */
  EClass getTableConstraint();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.TableConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.TableConstraint#getName()
   * @see #getTableConstraint()
   * @generated
   */
  EAttribute getTableConstraint_Name();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Table Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint
   * @generated
   */
  EClass getUniqueTableConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint#getColumns()
   * @see #getUniqueTableConstraint()
   * @generated
   */
  EReference getUniqueTableConstraint_Columns();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint#getConflictClause()
   * @see #getUniqueTableConstraint()
   * @generated
   */
  EReference getUniqueTableConstraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint <em>Primary Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint
   * @generated
   */
  EClass getPrimaryConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint#getColumns()
   * @see #getPrimaryConstraint()
   * @generated
   */
  EReference getPrimaryConstraint_Columns();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint#getConflictClause()
   * @see #getPrimaryConstraint()
   * @generated
   */
  EReference getPrimaryConstraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint <em>Check Table Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Table Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint
   * @generated
   */
  EClass getCheckTableConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint#getExpression()
   * @see #getCheckTableConstraint()
   * @generated
   */
  EReference getCheckTableConstraint_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn <em>Indexed Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn
   * @generated
   */
  EClass getIndexedColumn();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getColumnReference <em>Column Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column Reference</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getColumnReference()
   * @see #getIndexedColumn()
   * @generated
   */
  EReference getIndexedColumn_ColumnReference();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getCollationName <em>Collation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collation Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#getCollationName()
   * @see #getIndexedColumn()
   * @generated
   */
  EAttribute getIndexedColumn_CollationName();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isAsc <em>Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isAsc()
   * @see #getIndexedColumn()
   * @generated
   */
  EAttribute getIndexedColumn_Asc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn#isDesc()
   * @see #getIndexedColumn()
   * @generated
   */
  EAttribute getIndexedColumn_Desc();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Value</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DefaultValue
   * @generated
   */
  EClass getDefaultValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConflictClause
   * @generated
   */
  EClass getConflictClause();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ConflictClause#getResolution <em>Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolution</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConflictClause#getResolution()
   * @see #getConflictClause()
   * @generated
   */
  EAttribute getConflictClause_Resolution();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DMLStatement <em>DML Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DML Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DMLStatement
   * @generated
   */
  EClass getDMLStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement
   * @generated
   */
  EClass getDeleteStatement();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getTable()
   * @see #getDeleteStatement()
   * @generated
   */
  EReference getDeleteStatement_Table();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement#getExpression()
   * @see #getDeleteStatement()
   * @generated
   */
  EReference getDeleteStatement_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement <em>Insert Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement
   * @generated
   */
  EClass getInsertStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getConflictResolution <em>Conflict Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conflict Resolution</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getConflictResolution()
   * @see #getInsertStatement()
   * @generated
   */
  EAttribute getInsertStatement_ConflictResolution();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getTable()
   * @see #getInsertStatement()
   * @generated
   */
  EReference getInsertStatement_Table();

  /**
   * Returns the meta object for the reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getColumnNames <em>Column Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Column Names</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getColumnNames()
   * @see #getInsertStatement()
   * @generated
   */
  EReference getInsertStatement_ColumnNames();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getExpressions()
   * @see #getInsertStatement()
   * @generated
   */
  EReference getInsertStatement_Expressions();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getSelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.InsertStatement#getSelectStatement()
   * @see #getInsertStatement()
   * @generated
   */
  EReference getInsertStatement_SelectStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement
   * @generated
   */
  EClass getUpdateStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getConflictResolution <em>Conflict Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conflict Resolution</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getConflictResolution()
   * @see #getUpdateStatement()
   * @generated
   */
  EAttribute getUpdateStatement_ConflictResolution();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getTable()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_Table();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getUpdateColumnExpressions <em>Update Column Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update Column Expressions</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getUpdateColumnExpressions()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_UpdateColumnExpressions();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getWhereExpression <em>Where Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement#getWhereExpression()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_WhereExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression <em>Update Column Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Column Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression
   * @generated
   */
  EClass getUpdateColumnExpression();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column Name</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getColumnName()
   * @see #getUpdateColumnExpression()
   * @generated
   */
  EReference getUpdateColumnExpression_ColumnName();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression#getExpression()
   * @see #getUpdateColumnExpression()
   * @generated
   */
  EReference getUpdateColumnExpression_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ActionStatement
   * @generated
   */
  EClass getActionStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ActionStatement#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ActionStatement#getUri()
   * @see #getActionStatement()
   * @generated
   */
  EReference getActionStatement_Uri();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.Function#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Function#getArgs()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Args();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.Function#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Function#getStatements()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Statements();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.Function#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Function#isAll()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_All();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.Function#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Function#getArguments()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Arguments();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment <em>Content Uri Param Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Uri Param Segment</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment
   * @generated
   */
  EClass getContentUriParamSegment();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isNum()
   * @see #getContentUriParamSegment()
   * @generated
   */
  EAttribute getContentUriParamSegment_Num();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment#isText()
   * @see #getContentUriParamSegment()
   * @generated
   */
  EAttribute getContentUriParamSegment_Text();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprConcat <em>Expr Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Concat</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprConcat
   * @generated
   */
  EClass getExprConcat();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprConcat#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprConcat#getLeft()
   * @see #getExprConcat()
   * @generated
   */
  EReference getExprConcat_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprConcat#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprConcat#getOp()
   * @see #getExprConcat()
   * @generated
   */
  EAttribute getExprConcat_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprConcat#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprConcat#getRight()
   * @see #getExprConcat()
   * @generated
   */
  EReference getExprConcat_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprMult <em>Expr Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Mult</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprMult
   * @generated
   */
  EClass getExprMult();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprMult#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprMult#getLeft()
   * @see #getExprMult()
   * @generated
   */
  EReference getExprMult_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprMult#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprMult#getOp()
   * @see #getExprMult()
   * @generated
   */
  EAttribute getExprMult_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprMult#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprMult#getRight()
   * @see #getExprMult()
   * @generated
   */
  EReference getExprMult_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAdd <em>Expr Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Add</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAdd
   * @generated
   */
  EClass getExprAdd();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAdd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAdd#getLeft()
   * @see #getExprAdd()
   * @generated
   */
  EReference getExprAdd_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAdd#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAdd#getOp()
   * @see #getExprAdd()
   * @generated
   */
  EAttribute getExprAdd_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAdd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAdd#getRight()
   * @see #getExprAdd()
   * @generated
   */
  EReference getExprAdd_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprBit <em>Expr Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Bit</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprBit
   * @generated
   */
  EClass getExprBit();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprBit#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprBit#getLeft()
   * @see #getExprBit()
   * @generated
   */
  EReference getExprBit_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprBit#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprBit#getOp()
   * @see #getExprBit()
   * @generated
   */
  EAttribute getExprBit_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprBit#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprBit#getRight()
   * @see #getExprBit()
   * @generated
   */
  EReference getExprBit_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprRelate <em>Expr Relate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Relate</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprRelate
   * @generated
   */
  EClass getExprRelate();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprRelate#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprRelate#getLeft()
   * @see #getExprRelate()
   * @generated
   */
  EReference getExprRelate_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprRelate#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprRelate#getOp()
   * @see #getExprRelate()
   * @generated
   */
  EAttribute getExprRelate_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprRelate#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprRelate#getRight()
   * @see #getExprRelate()
   * @generated
   */
  EReference getExprRelate_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprEqual <em>Expr Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Equal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprEqual
   * @generated
   */
  EClass getExprEqual();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprEqual#getLeft()
   * @see #getExprEqual()
   * @generated
   */
  EReference getExprEqual_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprEqual#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprEqual#getOp()
   * @see #getExprEqual()
   * @generated
   */
  EAttribute getExprEqual_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprEqual#getRight()
   * @see #getExprEqual()
   * @generated
   */
  EReference getExprEqual_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr And</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAnd
   * @generated
   */
  EClass getExprAnd();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAnd#getLeft()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAnd#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAnd#getOp()
   * @see #getExprAnd()
   * @generated
   */
  EAttribute getExprAnd_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprAnd#getRight()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Or</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprOr
   * @generated
   */
  EClass getExprOr();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprOr#getLeft()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprOr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprOr#getOp()
   * @see #getExprOr()
   * @generated
   */
  EAttribute getExprOr_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExprOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExprOr#getRight()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression <em>Null Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Check Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression
   * @generated
   */
  EClass getNullCheckExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression#getLeft()
   * @see #getNullCheckExpression()
   * @generated
   */
  EReference getNullCheckExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression#getRight()
   * @see #getNullCheckExpression()
   * @generated
   */
  EReference getNullCheckExpression_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.IsNull <em>Is Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Null</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.IsNull
   * @generated
   */
  EClass getIsNull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Null</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NotNull
   * @generated
   */
  EClass getNotNull();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NewColumn <em>New Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NewColumn
   * @generated
   */
  EClass getNewColumn();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.NewColumn#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NewColumn#getColumn()
   * @see #getNewColumn()
   * @generated
   */
  EReference getNewColumn_Column();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.OldColumn <em>Old Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Old Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OldColumn
   * @generated
   */
  EClass getOldColumn();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.OldColumn#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.OldColumn#getColumn()
   * @see #getOldColumn()
   * @generated
   */
  EReference getOldColumn_Column();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef <em>Column Source Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Source Ref</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef
   * @generated
   */
  EClass getColumnSourceRef();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getSource()
   * @see #getColumnSourceRef()
   * @generated
   */
  EReference getColumnSourceRef_Source();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#isAll()
   * @see #getColumnSourceRef()
   * @generated
   */
  EAttribute getColumnSourceRef_All();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef#getColumn()
   * @see #getColumnSourceRef()
   * @generated
   */
  EReference getColumnSourceRef_Column();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.Literal#getLiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal Value</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.Literal#getLiteralValue()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_LiteralValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NestedExpression
   * @generated
   */
  EClass getNestedExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.NestedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NestedExpression#getExpression()
   * @see #getNestedExpression()
   * @generated
   */
  EReference getNestedExpression_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression <em>Select Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression
   * @generated
   */
  EClass getSelectStatementExpression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isNot()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EAttribute getSelectStatementExpression_Not();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isExists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exists</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#isExists()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EAttribute getSelectStatementExpression_Exists();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression#getSelect()
   * @see #getSelectStatementExpression()
   * @generated
   */
  EReference getSelectStatementExpression_Select();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CaseExpression
   * @generated
   */
  EClass getCaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CaseExpression#getCaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CaseExpression#getCaseExpression()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_CaseExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.CaseExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CaseExpression#getCases()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CaseExpression#getElseExpression <em>Else Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CaseExpression#getElseExpression()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_ElseExpression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CastExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CastExpression#getExpression()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CastExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CastExpression#getType()
   * @see #getCastExpression()
   * @generated
   */
  EAttribute getCastExpression_Type();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument <em>Function Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Argument</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument
   * @generated
   */
  EClass getFunctionArgument();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Arg</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument#getArg()
   * @see #getFunctionArgument()
   * @generated
   */
  EReference getFunctionArgument_Arg();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore <em>Select Core</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Core</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCore
   * @generated
   */
  EClass getSelectCore();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getLeft()
   * @see #getSelectCore()
   * @generated
   */
  EReference getSelectCore_Left();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getOp()
   * @see #getSelectCore()
   * @generated
   */
  EAttribute getSelectCore_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectCore#getRight()
   * @see #getSelectCore()
   * @generated
   */
  EReference getSelectCore_Right();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression
   * @generated
   */
  EClass getSelectExpression();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isDistinct <em>Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distinct</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isDistinct()
   * @see #getSelectExpression()
   * @generated
   */
  EAttribute getSelectExpression_Distinct();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAll()
   * @see #getSelectExpression()
   * @generated
   */
  EAttribute getSelectExpression_All();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAllColumns <em>All Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Columns</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#isAllColumns()
   * @see #getSelectExpression()
   * @generated
   */
  EAttribute getSelectExpression_AllColumns();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSelectList <em>Select List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select List</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSelectList()
   * @see #getSelectExpression()
   * @generated
   */
  EReference getSelectExpression_SelectList();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getSource()
   * @see #getSelectExpression()
   * @generated
   */
  EReference getSelectExpression_Source();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getWhere()
   * @see #getSelectExpression()
   * @generated
   */
  EReference getSelectExpression_Where();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getGroupBy <em>Group By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group By</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getGroupBy()
   * @see #getSelectExpression()
   * @generated
   */
  EReference getSelectExpression_GroupBy();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getHaving <em>Having</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SelectExpression#getHaving()
   * @see #getSelectExpression()
   * @generated
   */
  EReference getSelectExpression_Having();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable <em>Single Source Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable
   * @generated
   */
  EClass getSingleSourceTable();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable#getTableReference <em>Table Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table Reference</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable#getTableReference()
   * @see #getSingleSourceTable()
   * @generated
   */
  EReference getSingleSourceTable_TableReference();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement <em>Single Source Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Source Select Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement
   * @generated
   */
  EClass getSingleSourceSelectStatement();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement#getSelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement#getSelectStatement()
   * @see #getSingleSourceSelectStatement()
   * @generated
   */
  EReference getSingleSourceSelectStatement_SelectStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ResultColumn <em>Result Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Column</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ResultColumn
   * @generated
   */
  EClass getResultColumn();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ResultColumn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ResultColumn#getExpression()
   * @see #getResultColumn()
   * @generated
   */
  EReference getResultColumn_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral#getNumber()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_Number();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.StringLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.StringLiteral#getLiteral()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.NullLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NullLiteral#getLiteral()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral <em>Current Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Time Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral
   * @generated
   */
  EClass getCurrentTimeLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral#getLiteral()
   * @see #getCurrentTimeLiteral()
   * @generated
   */
  EAttribute getCurrentTimeLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral <em>Current Date Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Date Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral
   * @generated
   */
  EClass getCurrentDateLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral#getLiteral()
   * @see #getCurrentDateLiteral()
   * @generated
   */
  EAttribute getCurrentDateLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral <em>Current Time Stamp Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Time Stamp Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral
   * @generated
   */
  EClass getCurrentTimeStampLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral#getLiteral()
   * @see #getCurrentTimeStampLiteral()
   * @generated
   */
  EAttribute getCurrentTimeStampLiteral_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement <em>Create Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Table Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement
   * @generated
   */
  EClass getCreateTableStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement#isTemporary <em>Temporary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temporary</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement#isTemporary()
   * @see #getCreateTableStatement()
   * @generated
   */
  EAttribute getCreateTableStatement_Temporary();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement#getColumnDefs <em>Column Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Defs</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement#getColumnDefs()
   * @see #getCreateTableStatement()
   * @generated
   */
  EReference getCreateTableStatement_ColumnDefs();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement#getConstraints()
   * @see #getCreateTableStatement()
   * @generated
   */
  EReference getCreateTableStatement_Constraints();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement <em>Create View Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create View Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement
   * @generated
   */
  EClass getCreateViewStatement();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#isTemporary <em>Temporary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temporary</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#isTemporary()
   * @see #getCreateViewStatement()
   * @generated
   */
  EAttribute getCreateViewStatement_Temporary();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#getSelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement#getSelectStatement()
   * @see #getCreateViewStatement()
   * @generated
   */
  EReference getCreateViewStatement_SelectStatement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement <em>Alter Table Rename Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Table Rename Statement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement
   * @generated
   */
  EClass getAlterTableRenameStatement();

  /**
   * Returns the meta object for the reference '{@link com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement#getTable()
   * @see #getAlterTableRenameStatement()
   * @generated
   */
  EReference getAlterTableRenameStatement_Table();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef <em>Column Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Def</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnDef
   * @generated
   */
  EClass getColumnDef();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getType()
   * @see #getColumnDef()
   * @generated
   */
  EAttribute getColumnDef_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnDef#getConstraints()
   * @see #getColumnDef()
   * @generated
   */
  EReference getColumnDef_Constraints();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key Column Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint
   * @generated
   */
  EClass getPrimaryKeyColumnConstraint();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAsc <em>Asc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAsc()
   * @see #getPrimaryKeyColumnConstraint()
   * @generated
   */
  EAttribute getPrimaryKeyColumnConstraint_Asc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isDesc()
   * @see #getPrimaryKeyColumnConstraint()
   * @generated
   */
  EAttribute getPrimaryKeyColumnConstraint_Desc();

  /**
   * Returns the meta object for the attribute '{@link com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAutoincrement <em>Autoincrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autoincrement</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint#isAutoincrement()
   * @see #getPrimaryKeyColumnConstraint()
   * @generated
   */
  EAttribute getPrimaryKeyColumnConstraint_Autoincrement();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint <em>Not Null Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Null Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint
   * @generated
   */
  EClass getNotNullConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint#getConflictClause()
   * @see #getNotNullConstraint()
   * @generated
   */
  EReference getNotNullConstraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint
   * @generated
   */
  EClass getUniqueConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint#getConflictClause <em>Conflict Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conflict Clause</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint#getConflictClause()
   * @see #getUniqueConstraint()
   * @generated
   */
  EReference getUniqueConstraint_ConflictClause();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint <em>Default Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint
   * @generated
   */
  EClass getDefaultConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint#getDefaultValue()
   * @see #getDefaultConstraint()
   * @generated
   */
  EReference getDefaultConstraint_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint <em>Check Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Constraint</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint
   * @generated
   */
  EClass getCheckConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint#getExpression()
   * @see #getCheckConstraint()
   * @generated
   */
  EReference getCheckConstraint_Expression();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue <em>Literal Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Default Value</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue
   * @generated
   */
  EClass getLiteralDefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue#getLiteral()
   * @see #getLiteralDefaultValue()
   * @generated
   */
  EReference getLiteralDefaultValue_Literal();

  /**
   * Returns the meta object for class '{@link com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue <em>Expression Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Default Value</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue
   * @generated
   */
  EClass getExpressionDefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue#getExpression()
   * @see #getExpressionDefaultValue()
   * @generated
   */
  EReference getExpressionDefaultValue_Expression();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator <em>Compound Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compound Operator</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator
   * @generated
   */
  EEnum getCompoundOperator();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType <em>Sqlite Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sqlite Data Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType
   * @generated
   */
  EEnum getSqliteDataType();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Column Type</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
   * @generated
   */
  EEnum getColumnType();

  /**
   * Returns the meta object for enum '{@link com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution <em>Conflict Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Conflict Resolution</em>'.
   * @see com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ModelImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getModel()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DatabaseBlockImpl <em>Database Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DatabaseBlockImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDatabaseBlock()
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
     * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_BLOCK__CONFIG = eINSTANCE.getDatabaseBlock_Config();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_BLOCK__INIT = eINSTANCE.getDatabaseBlock_Init();

    /**
     * The meta object literal for the '<em><b>Migrations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_BLOCK__MIGRATIONS = eINSTANCE.getDatabaseBlock_Migrations();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigBlockImpl <em>Config Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigBlockImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConfigBlock()
     * @generated
     */
    EClass CONFIG_BLOCK = eINSTANCE.getConfigBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_BLOCK__STATEMENTS = eINSTANCE.getConfigBlock_Statements();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InitBlockImpl <em>Init Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.InitBlockImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getInitBlock()
     * @generated
     */
    EClass INIT_BLOCK = eINSTANCE.getInitBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_BLOCK__STATEMENTS = eINSTANCE.getInitBlock_Statements();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigurationStatementImpl <em>Configuration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ConfigurationStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConfigurationStatement()
     * @generated
     */
    EClass CONFIGURATION_STATEMENT = eINSTANCE.getConfigurationStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION_STATEMENT__NAME = eINSTANCE.getConfigurationStatement_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgImpl <em>Function Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getFunctionArg()
     * @generated
     */
    EClass FUNCTION_ARG = eINSTANCE.getFunctionArg();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_ARG__TYPE = eINSTANCE.getFunctionArg_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_ARG__NAME = eINSTANCE.getFunctionArg_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriImpl <em>Content Uri</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getContentUri()
     * @generated
     */
    EClass CONTENT_URI = eINSTANCE.getContentUri();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_URI__TYPE = eINSTANCE.getContentUri_Type();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_URI__SEGMENTS = eINSTANCE.getContentUri_Segments();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriSegmentImpl <em>Content Uri Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriSegmentImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getContentUriSegment()
     * @generated
     */
    EClass CONTENT_URI_SEGMENT = eINSTANCE.getContentUriSegment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_URI_SEGMENT__NAME = eINSTANCE.getContentUriSegment_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.MigrationBlockImpl <em>Migration Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.MigrationBlockImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getMigrationBlock()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CaseImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCase()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl <em>Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatement()
     * @generated
     */
    EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

    /**
     * The meta object literal for the '<em><b>Core</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__CORE = eINSTANCE.getSelectStatement_Core();

    /**
     * The meta object literal for the '<em><b>Orderby</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__ORDERBY = eINSTANCE.getSelectStatement_Orderby();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__LIMIT = eINSTANCE.getSelectStatement_Limit();

    /**
     * The meta object literal for the '<em><b>Limit Offset</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__LIMIT_OFFSET = eINSTANCE.getSelectStatement_LimitOffset();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermListImpl <em>Ordering Term List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermListImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getOrderingTermList()
     * @generated
     */
    EClass ORDERING_TERM_LIST = eINSTANCE.getOrderingTermList();

    /**
     * The meta object literal for the '<em><b>Ordering Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDERING_TERM_LIST__ORDERING_TERMS = eINSTANCE.getOrderingTermList_OrderingTerms();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreExpressionImpl <em>Select Core Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectCoreExpression()
     * @generated
     */
    EClass SELECT_CORE_EXPRESSION = eINSTANCE.getSelectCoreExpression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectListImpl <em>Select List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectListImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectList()
     * @generated
     */
    EClass SELECT_LIST = eINSTANCE.getSelectList();

    /**
     * The meta object literal for the '<em><b>Result Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_LIST__RESULT_COLUMNS = eINSTANCE.getSelectList_ResultColumns();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.WhereExpressionsImpl <em>Where Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.WhereExpressionsImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getWhereExpressions()
     * @generated
     */
    EClass WHERE_EXPRESSIONS = eINSTANCE.getWhereExpressions();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_EXPRESSIONS__EXPRESSION = eINSTANCE.getWhereExpressions_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.GroupByExpressionsImpl <em>Group By Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.GroupByExpressionsImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getGroupByExpressions()
     * @generated
     */
    EClass GROUP_BY_EXPRESSIONS = eINSTANCE.getGroupByExpressions();

    /**
     * The meta object literal for the '<em><b>Group By Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS = eINSTANCE.getGroupByExpressions_GroupByExpressions();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.HavingExpressionsImpl <em>Having Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.HavingExpressionsImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getHavingExpressions()
     * @generated
     */
    EClass HAVING_EXPRESSIONS = eINSTANCE.getHavingExpressions();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAVING_EXPRESSIONS__EXPRESSION = eINSTANCE.getHavingExpressions_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermImpl <em>Ordering Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.OrderingTermImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getOrderingTerm()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinSourceImpl <em>Join Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.JoinSourceImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getJoinSource()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceImpl <em>Single Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSource()
     * @generated
     */
    EClass SINGLE_SOURCE = eINSTANCE.getSingleSource();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectSourceImpl <em>Select Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectSourceImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectSource()
     * @generated
     */
    EClass SELECT_SOURCE = eINSTANCE.getSelectSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_SOURCE__NAME = eINSTANCE.getSelectSource_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceJoinImpl <em>Single Source Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceJoinImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceJoin()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl <em>Join Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.JoinStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getJoinStatement()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceImpl <em>Column Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnSource()
     * @generated
     */
    EClass COLUMN_SOURCE = eINSTANCE.getColumnSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_SOURCE__NAME = eINSTANCE.getColumnSource_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralValueImpl <em>Literal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralValueImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getLiteralValue()
     * @generated
     */
    EClass LITERAL_VALUE = eINSTANCE.getLiteralValue();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DDLStatementImpl <em>DDL Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DDLStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDDLStatement()
     * @generated
     */
    EClass DDL_STATEMENT = eINSTANCE.getDDLStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.TableDefinitionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getTableDefinition()
     * @generated
     */
    EClass TABLE_DEFINITION = eINSTANCE.getTableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__NAME = eINSTANCE.getTableDefinition_Name();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl <em>Create Trigger Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTriggerStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateTriggerStatement()
     * @generated
     */
    EClass CREATE_TRIGGER_STATEMENT = eINSTANCE.getCreateTriggerStatement();

    /**
     * The meta object literal for the '<em><b>Temporary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER_STATEMENT__TEMPORARY = eINSTANCE.getCreateTriggerStatement_Temporary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER_STATEMENT__NAME = eINSTANCE.getCreateTriggerStatement_Name();

    /**
     * The meta object literal for the '<em><b>When</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER_STATEMENT__WHEN = eINSTANCE.getCreateTriggerStatement_When();

    /**
     * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER_STATEMENT__EVENT_TYPE = eINSTANCE.getCreateTriggerStatement_EventType();

    /**
     * The meta object literal for the '<em><b>Update Column Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES = eINSTANCE.getCreateTriggerStatement_UpdateColumnNames();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TRIGGER_STATEMENT__TABLE = eINSTANCE.getCreateTriggerStatement_Table();

    /**
     * The meta object literal for the '<em><b>For Each Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW = eINSTANCE.getCreateTriggerStatement_ForEachRow();

    /**
     * The meta object literal for the '<em><b>When Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION = eINSTANCE.getCreateTriggerStatement_WhenExpression();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TRIGGER_STATEMENT__STATEMENTS = eINSTANCE.getCreateTriggerStatement_Statements();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableAddColumnStatementImpl <em>Alter Table Add Column Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableAddColumnStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableAddColumnStatement()
     * @generated
     */
    EClass ALTER_TABLE_ADD_COLUMN_STATEMENT = eINSTANCE.getAlterTableAddColumnStatement();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE = eINSTANCE.getAlterTableAddColumnStatement_Table();

    /**
     * The meta object literal for the '<em><b>Column Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF = eINSTANCE.getAlterTableAddColumnStatement_ColumnDef();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropTableStatementImpl <em>Drop Table Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropTableStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropTableStatement()
     * @generated
     */
    EClass DROP_TABLE_STATEMENT = eINSTANCE.getDropTableStatement();

    /**
     * The meta object literal for the '<em><b>If Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_TABLE_STATEMENT__IF_EXISTS = eINSTANCE.getDropTableStatement_IfExists();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_TABLE_STATEMENT__TABLE = eINSTANCE.getDropTableStatement_Table();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropTriggerStatementImpl <em>Drop Trigger Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropTriggerStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropTriggerStatement()
     * @generated
     */
    EClass DROP_TRIGGER_STATEMENT = eINSTANCE.getDropTriggerStatement();

    /**
     * The meta object literal for the '<em><b>If Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_TRIGGER_STATEMENT__IF_EXISTS = eINSTANCE.getDropTriggerStatement_IfExists();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_TRIGGER_STATEMENT__TRIGGER = eINSTANCE.getDropTriggerStatement_Trigger();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropViewStatementImpl <em>Drop View Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropViewStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropViewStatement()
     * @generated
     */
    EClass DROP_VIEW_STATEMENT = eINSTANCE.getDropViewStatement();

    /**
     * The meta object literal for the '<em><b>If Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_VIEW_STATEMENT__IF_EXISTS = eINSTANCE.getDropViewStatement_IfExists();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_VIEW_STATEMENT__VIEW = eINSTANCE.getDropViewStatement_View();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateIndexStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateIndexStatement()
     * @generated
     */
    EClass CREATE_INDEX_STATEMENT = eINSTANCE.getCreateIndexStatement();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_INDEX_STATEMENT__UNIQUE = eINSTANCE.getCreateIndexStatement_Unique();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_INDEX_STATEMENT__NAME = eINSTANCE.getCreateIndexStatement_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_INDEX_STATEMENT__TABLE = eINSTANCE.getCreateIndexStatement_Table();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_INDEX_STATEMENT__COLUMNS = eINSTANCE.getCreateIndexStatement_Columns();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DropIndexStatementImpl <em>Drop Index Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DropIndexStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDropIndexStatement()
     * @generated
     */
    EClass DROP_INDEX_STATEMENT = eINSTANCE.getDropIndexStatement();

    /**
     * The meta object literal for the '<em><b>If Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_INDEX_STATEMENT__IF_EXISTS = eINSTANCE.getDropIndexStatement_IfExists();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_INDEX_STATEMENT__INDEX = eINSTANCE.getDropIndexStatement_Index();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnConstraint()
     * @generated
     */
    EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.TableConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getTableConstraint()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueTableConstraintImpl <em>Unique Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueTableConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUniqueTableConstraint()
     * @generated
     */
    EClass UNIQUE_TABLE_CONSTRAINT = eINSTANCE.getUniqueTableConstraint();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_TABLE_CONSTRAINT__COLUMNS = eINSTANCE.getUniqueTableConstraint_Columns();

    /**
     * The meta object literal for the '<em><b>Conflict Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_TABLE_CONSTRAINT__CONFLICT_CLAUSE = eINSTANCE.getUniqueTableConstraint_ConflictClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryConstraintImpl <em>Primary Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryConstraint()
     * @generated
     */
    EClass PRIMARY_CONSTRAINT = eINSTANCE.getPrimaryConstraint();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_CONSTRAINT__COLUMNS = eINSTANCE.getPrimaryConstraint_Columns();

    /**
     * The meta object literal for the '<em><b>Conflict Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_CONSTRAINT__CONFLICT_CLAUSE = eINSTANCE.getPrimaryConstraint_ConflictClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CheckTableConstraintImpl <em>Check Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CheckTableConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCheckTableConstraint()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.IndexedColumnImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getIndexedColumn()
     * @generated
     */
    EClass INDEXED_COLUMN = eINSTANCE.getIndexedColumn();

    /**
     * The meta object literal for the '<em><b>Column Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXED_COLUMN__COLUMN_REFERENCE = eINSTANCE.getIndexedColumn_ColumnReference();

    /**
     * The meta object literal for the '<em><b>Collation Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEXED_COLUMN__COLLATION_NAME = eINSTANCE.getIndexedColumn_CollationName();

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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultValueImpl <em>Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultValueImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDefaultValue()
     * @generated
     */
    EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ConflictClauseImpl <em>Conflict Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ConflictClauseImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConflictClause()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DMLStatementImpl <em>DML Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DMLStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDMLStatement()
     * @generated
     */
    EClass DML_STATEMENT = eINSTANCE.getDMLStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DeleteStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDeleteStatement()
     * @generated
     */
    EClass DELETE_STATEMENT = eINSTANCE.getDeleteStatement();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_STATEMENT__TABLE = eINSTANCE.getDeleteStatement_Table();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_STATEMENT__EXPRESSION = eINSTANCE.getDeleteStatement_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl <em>Insert Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.InsertStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getInsertStatement()
     * @generated
     */
    EClass INSERT_STATEMENT = eINSTANCE.getInsertStatement();

    /**
     * The meta object literal for the '<em><b>Conflict Resolution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSERT_STATEMENT__CONFLICT_RESOLUTION = eINSTANCE.getInsertStatement_ConflictResolution();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_STATEMENT__TABLE = eINSTANCE.getInsertStatement_Table();

    /**
     * The meta object literal for the '<em><b>Column Names</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_STATEMENT__COLUMN_NAMES = eINSTANCE.getInsertStatement_ColumnNames();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_STATEMENT__EXPRESSIONS = eINSTANCE.getInsertStatement_Expressions();

    /**
     * The meta object literal for the '<em><b>Select Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_STATEMENT__SELECT_STATEMENT = eINSTANCE.getInsertStatement_SelectStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUpdateStatement()
     * @generated
     */
    EClass UPDATE_STATEMENT = eINSTANCE.getUpdateStatement();

    /**
     * The meta object literal for the '<em><b>Conflict Resolution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE_STATEMENT__CONFLICT_RESOLUTION = eINSTANCE.getUpdateStatement_ConflictResolution();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__TABLE = eINSTANCE.getUpdateStatement_Table();

    /**
     * The meta object literal for the '<em><b>Update Column Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS = eINSTANCE.getUpdateStatement_UpdateColumnExpressions();

    /**
     * The meta object literal for the '<em><b>Where Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__WHERE_EXPRESSION = eINSTANCE.getUpdateStatement_WhereExpression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateColumnExpressionImpl <em>Update Column Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UpdateColumnExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUpdateColumnExpression()
     * @generated
     */
    EClass UPDATE_COLUMN_EXPRESSION = eINSTANCE.getUpdateColumnExpression();

    /**
     * The meta object literal for the '<em><b>Column Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_COLUMN_EXPRESSION__COLUMN_NAME = eINSTANCE.getUpdateColumnExpression_ColumnName();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_COLUMN_EXPRESSION__EXPRESSION = eINSTANCE.getUpdateColumnExpression_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ActionStatementImpl <em>Action Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ActionStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getActionStatement()
     * @generated
     */
    EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATEMENT__URI = eINSTANCE.getActionStatement_Uri();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ARGS = eINSTANCE.getFunction_Args();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__STATEMENTS = eINSTANCE.getFunction_Statements();

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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriParamSegmentImpl <em>Content Uri Param Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriParamSegmentImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getContentUriParamSegment()
     * @generated
     */
    EClass CONTENT_URI_PARAM_SEGMENT = eINSTANCE.getContentUriParamSegment();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_URI_PARAM_SEGMENT__NUM = eINSTANCE.getContentUriParamSegment_Num();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_URI_PARAM_SEGMENT__TEXT = eINSTANCE.getContentUriParamSegment_Text();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprConcatImpl <em>Expr Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprConcatImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprConcat()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprMultImpl <em>Expr Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprMultImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprMult()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAddImpl <em>Expr Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAddImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprAdd()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprBitImpl <em>Expr Bit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprBitImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprBit()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprRelateImpl <em>Expr Relate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprRelateImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprRelate()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprEqualImpl <em>Expr Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprEqualImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprEqual()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAndImpl <em>Expr And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprAndImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprAnd()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExprOrImpl <em>Expr Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExprOrImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExprOr()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NullCheckExpressionImpl <em>Null Check Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NullCheckExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNullCheckExpression()
     * @generated
     */
    EClass NULL_CHECK_EXPRESSION = eINSTANCE.getNullCheckExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NULL_CHECK_EXPRESSION__LEFT = eINSTANCE.getNullCheckExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NULL_CHECK_EXPRESSION__RIGHT = eINSTANCE.getNullCheckExpression_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.IsNullImpl <em>Is Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.IsNullImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getIsNull()
     * @generated
     */
    EClass IS_NULL = eINSTANCE.getIsNull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullImpl <em>Not Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNotNull()
     * @generated
     */
    EClass NOT_NULL = eINSTANCE.getNotNull();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NewColumnImpl <em>New Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NewColumnImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNewColumn()
     * @generated
     */
    EClass NEW_COLUMN = eINSTANCE.getNewColumn();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_COLUMN__COLUMN = eINSTANCE.getNewColumn_Column();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.OldColumnImpl <em>Old Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.OldColumnImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getOldColumn()
     * @generated
     */
    EClass OLD_COLUMN = eINSTANCE.getOldColumn();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OLD_COLUMN__COLUMN = eINSTANCE.getOldColumn_Column();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceRefImpl <em>Column Source Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnSourceRefImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnSourceRef()
     * @generated
     */
    EClass COLUMN_SOURCE_REF = eINSTANCE.getColumnSourceRef();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_SOURCE_REF__SOURCE = eINSTANCE.getColumnSourceRef_Source();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_SOURCE_REF__ALL = eINSTANCE.getColumnSourceRef_All();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_SOURCE_REF__COLUMN = eINSTANCE.getColumnSourceRef_Column();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NestedExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNestedExpression()
     * @generated
     */
    EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_EXPRESSION__EXPRESSION = eINSTANCE.getNestedExpression_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementExpressionImpl <em>Select Statement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectStatementExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectStatementExpression()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CaseExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCaseExpression()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CastExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCastExpression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCastExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgumentImpl <em>Function Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.FunctionArgumentImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getFunctionArgument()
     * @generated
     */
    EClass FUNCTION_ARGUMENT = eINSTANCE.getFunctionArgument();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ARGUMENT__ARG = eINSTANCE.getFunctionArgument_Arg();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreImpl <em>Select Core</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectCoreImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectCore()
     * @generated
     */
    EClass SELECT_CORE = eINSTANCE.getSelectCore();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CORE__LEFT = eINSTANCE.getSelectCore_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CORE__OP = eINSTANCE.getSelectCore_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CORE__RIGHT = eINSTANCE.getSelectCore_Right();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SelectExpressionImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSelectExpression()
     * @generated
     */
    EClass SELECT_EXPRESSION = eINSTANCE.getSelectExpression();

    /**
     * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_EXPRESSION__DISTINCT = eINSTANCE.getSelectExpression_Distinct();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_EXPRESSION__ALL = eINSTANCE.getSelectExpression_All();

    /**
     * The meta object literal for the '<em><b>All Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_EXPRESSION__ALL_COLUMNS = eINSTANCE.getSelectExpression_AllColumns();

    /**
     * The meta object literal for the '<em><b>Select List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_EXPRESSION__SELECT_LIST = eINSTANCE.getSelectExpression_SelectList();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_EXPRESSION__SOURCE = eINSTANCE.getSelectExpression_Source();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_EXPRESSION__WHERE = eINSTANCE.getSelectExpression_Where();

    /**
     * The meta object literal for the '<em><b>Group By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_EXPRESSION__GROUP_BY = eINSTANCE.getSelectExpression_GroupBy();

    /**
     * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_EXPRESSION__HAVING = eINSTANCE.getSelectExpression_Having();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceTableImpl <em>Single Source Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceTableImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceTable()
     * @generated
     */
    EClass SINGLE_SOURCE_TABLE = eINSTANCE.getSingleSourceTable();

    /**
     * The meta object literal for the '<em><b>Table Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_SOURCE_TABLE__TABLE_REFERENCE = eINSTANCE.getSingleSourceTable_TableReference();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceSelectStatementImpl <em>Single Source Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SingleSourceSelectStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSingleSourceSelectStatement()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ResultColumnImpl <em>Result Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ResultColumnImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getResultColumn()
     * @generated
     */
    EClass RESULT_COLUMN = eINSTANCE.getResultColumn();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_COLUMN__EXPRESSION = eINSTANCE.getResultColumn_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NumericLiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNumericLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.StringLiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getStringLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NullLiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNullLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeLiteralImpl <em>Current Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeLiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentDateLiteralImpl <em>Current Date Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentDateLiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCurrentDateLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeStampLiteralImpl <em>Current Time Stamp Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CurrentTimeStampLiteralImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCurrentTimeStampLiteral()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateTableStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateTableStatement()
     * @generated
     */
    EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

    /**
     * The meta object literal for the '<em><b>Temporary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_TABLE_STATEMENT__TEMPORARY = eINSTANCE.getCreateTableStatement_Temporary();

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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CreateViewStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCreateViewStatement()
     * @generated
     */
    EClass CREATE_VIEW_STATEMENT = eINSTANCE.getCreateViewStatement();

    /**
     * The meta object literal for the '<em><b>Temporary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_VIEW_STATEMENT__TEMPORARY = eINSTANCE.getCreateViewStatement_Temporary();

    /**
     * The meta object literal for the '<em><b>Select Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_VIEW_STATEMENT__SELECT_STATEMENT = eINSTANCE.getCreateViewStatement_SelectStatement();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableRenameStatementImpl <em>Alter Table Rename Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.AlterTableRenameStatementImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getAlterTableRenameStatement()
     * @generated
     */
    EClass ALTER_TABLE_RENAME_STATEMENT = eINSTANCE.getAlterTableRenameStatement();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTER_TABLE_RENAME_STATEMENT__TABLE = eINSTANCE.getAlterTableRenameStatement_Table();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnDefImpl <em>Column Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ColumnDefImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnDef()
     * @generated
     */
    EClass COLUMN_DEF = eINSTANCE.getColumnDef();

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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl <em>Primary Key Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.PrimaryKeyColumnConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getPrimaryKeyColumnConstraint()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullConstraintImpl <em>Not Null Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.NotNullConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getNotNullConstraint()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.UniqueConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getUniqueConstraint()
     * @generated
     */
    EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

    /**
     * The meta object literal for the '<em><b>Conflict Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_CONSTRAINT__CONFLICT_CLAUSE = eINSTANCE.getUniqueConstraint_ConflictClause();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultConstraintImpl <em>Default Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.DefaultConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getDefaultConstraint()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.CheckConstraintImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCheckConstraint()
     * @generated
     */
    EClass CHECK_CONSTRAINT = eINSTANCE.getCheckConstraint();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_CONSTRAINT__EXPRESSION = eINSTANCE.getCheckConstraint_Expression();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralDefaultValueImpl <em>Literal Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.LiteralDefaultValueImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getLiteralDefaultValue()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionDefaultValueImpl <em>Expression Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.ExpressionDefaultValueImpl
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getExpressionDefaultValue()
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
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator <em>Compound Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getCompoundOperator()
     * @generated
     */
    EEnum COMPOUND_OPERATOR = eINSTANCE.getCompoundOperator();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType <em>Sqlite Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getSqliteDataType()
     * @generated
     */
    EEnum SQLITE_DATA_TYPE = eINSTANCE.getSqliteDataType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.ColumnType <em>Column Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.ColumnType
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getColumnType()
     * @generated
     */
    EEnum COLUMN_TYPE = eINSTANCE.getColumnType();

    /**
     * The meta object literal for the '{@link com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution <em>Conflict Resolution</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution
     * @see com.robotoworks.mechanoid.db.sqliteModel.impl.SqliteModelPackageImpl#getConflictResolution()
     * @generated
     */
    EEnum CONFLICT_RESOLUTION = eINSTANCE.getConflictResolution();

  }

} //SqliteModelPackage
