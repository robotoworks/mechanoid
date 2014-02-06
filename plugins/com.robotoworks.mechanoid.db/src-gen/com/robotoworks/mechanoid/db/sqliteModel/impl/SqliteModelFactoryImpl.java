/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqliteModelFactoryImpl extends EFactoryImpl implements SqliteModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SqliteModelFactory init()
  {
    try
    {
      SqliteModelFactory theSqliteModelFactory = (SqliteModelFactory)EPackage.Registry.INSTANCE.getEFactory(SqliteModelPackage.eNS_URI);
      if (theSqliteModelFactory != null)
      {
        return theSqliteModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SqliteModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SqliteModelPackage.MODEL: return createModel();
      case SqliteModelPackage.DATABASE_BLOCK: return createDatabaseBlock();
      case SqliteModelPackage.CONFIG_BLOCK: return createConfigBlock();
      case SqliteModelPackage.INIT_BLOCK: return createInitBlock();
      case SqliteModelPackage.CONFIGURATION_STATEMENT: return createConfigurationStatement();
      case SqliteModelPackage.FUNCTION_ARG: return createFunctionArg();
      case SqliteModelPackage.CONTENT_URI: return createContentUri();
      case SqliteModelPackage.CONTENT_URI_SEGMENT: return createContentUriSegment();
      case SqliteModelPackage.MIGRATION_BLOCK: return createMigrationBlock();
      case SqliteModelPackage.EXPRESSION: return createExpression();
      case SqliteModelPackage.CASE: return createCase();
      case SqliteModelPackage.SELECT_STATEMENT: return createSelectStatement();
      case SqliteModelPackage.ORDERING_TERM_LIST: return createOrderingTermList();
      case SqliteModelPackage.SELECT_CORE_EXPRESSION: return createSelectCoreExpression();
      case SqliteModelPackage.SELECT_LIST: return createSelectList();
      case SqliteModelPackage.WHERE_EXPRESSIONS: return createWhereExpressions();
      case SqliteModelPackage.GROUP_BY_EXPRESSIONS: return createGroupByExpressions();
      case SqliteModelPackage.HAVING_EXPRESSIONS: return createHavingExpressions();
      case SqliteModelPackage.ORDERING_TERM: return createOrderingTerm();
      case SqliteModelPackage.JOIN_SOURCE: return createJoinSource();
      case SqliteModelPackage.SINGLE_SOURCE: return createSingleSource();
      case SqliteModelPackage.SELECT_SOURCE: return createSelectSource();
      case SqliteModelPackage.SINGLE_SOURCE_JOIN: return createSingleSourceJoin();
      case SqliteModelPackage.JOIN_STATEMENT: return createJoinStatement();
      case SqliteModelPackage.COLUMN_SOURCE: return createColumnSource();
      case SqliteModelPackage.LITERAL_VALUE: return createLiteralValue();
      case SqliteModelPackage.DDL_STATEMENT: return createDDLStatement();
      case SqliteModelPackage.TABLE_DEFINITION: return createTableDefinition();
      case SqliteModelPackage.CREATE_TRIGGER_STATEMENT: return createCreateTriggerStatement();
      case SqliteModelPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT: return createAlterTableAddColumnStatement();
      case SqliteModelPackage.DROP_TABLE_STATEMENT: return createDropTableStatement();
      case SqliteModelPackage.DROP_TRIGGER_STATEMENT: return createDropTriggerStatement();
      case SqliteModelPackage.DROP_VIEW_STATEMENT: return createDropViewStatement();
      case SqliteModelPackage.CREATE_INDEX_STATEMENT: return createCreateIndexStatement();
      case SqliteModelPackage.DROP_INDEX_STATEMENT: return createDropIndexStatement();
      case SqliteModelPackage.COLUMN_CONSTRAINT: return createColumnConstraint();
      case SqliteModelPackage.TABLE_CONSTRAINT: return createTableConstraint();
      case SqliteModelPackage.UNIQUE_TABLE_CONSTRAINT: return createUniqueTableConstraint();
      case SqliteModelPackage.PRIMARY_CONSTRAINT: return createPrimaryConstraint();
      case SqliteModelPackage.CHECK_TABLE_CONSTRAINT: return createCheckTableConstraint();
      case SqliteModelPackage.INDEXED_COLUMN: return createIndexedColumn();
      case SqliteModelPackage.DEFAULT_VALUE: return createDefaultValue();
      case SqliteModelPackage.CONFLICT_CLAUSE: return createConflictClause();
      case SqliteModelPackage.DML_STATEMENT: return createDMLStatement();
      case SqliteModelPackage.DELETE_STATEMENT: return createDeleteStatement();
      case SqliteModelPackage.INSERT_STATEMENT: return createInsertStatement();
      case SqliteModelPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case SqliteModelPackage.UPDATE_COLUMN_EXPRESSION: return createUpdateColumnExpression();
      case SqliteModelPackage.ACTION_STATEMENT: return createActionStatement();
      case SqliteModelPackage.FUNCTION: return createFunction();
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT: return createContentUriParamSegment();
      case SqliteModelPackage.EXPR_CONCAT: return createExprConcat();
      case SqliteModelPackage.EXPR_MULT: return createExprMult();
      case SqliteModelPackage.EXPR_ADD: return createExprAdd();
      case SqliteModelPackage.EXPR_BIT: return createExprBit();
      case SqliteModelPackage.EXPR_RELATE: return createExprRelate();
      case SqliteModelPackage.EXPR_EQUAL: return createExprEqual();
      case SqliteModelPackage.EXPR_AND: return createExprAnd();
      case SqliteModelPackage.EXPR_OR: return createExprOr();
      case SqliteModelPackage.NULL_CHECK_EXPRESSION: return createNullCheckExpression();
      case SqliteModelPackage.IS_NULL: return createIsNull();
      case SqliteModelPackage.NOT_NULL: return createNotNull();
      case SqliteModelPackage.NEW_COLUMN: return createNewColumn();
      case SqliteModelPackage.OLD_COLUMN: return createOldColumn();
      case SqliteModelPackage.COLUMN_SOURCE_REF: return createColumnSourceRef();
      case SqliteModelPackage.LITERAL: return createLiteral();
      case SqliteModelPackage.NESTED_EXPRESSION: return createNestedExpression();
      case SqliteModelPackage.SELECT_STATEMENT_EXPRESSION: return createSelectStatementExpression();
      case SqliteModelPackage.CASE_EXPRESSION: return createCaseExpression();
      case SqliteModelPackage.CAST_EXPRESSION: return createCastExpression();
      case SqliteModelPackage.FUNCTION_ARGUMENT: return createFunctionArgument();
      case SqliteModelPackage.SELECT_CORE: return createSelectCore();
      case SqliteModelPackage.SELECT_EXPRESSION: return createSelectExpression();
      case SqliteModelPackage.SINGLE_SOURCE_TABLE: return createSingleSourceTable();
      case SqliteModelPackage.SINGLE_SOURCE_SELECT_STATEMENT: return createSingleSourceSelectStatement();
      case SqliteModelPackage.RESULT_COLUMN: return createResultColumn();
      case SqliteModelPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case SqliteModelPackage.STRING_LITERAL: return createStringLiteral();
      case SqliteModelPackage.NULL_LITERAL: return createNullLiteral();
      case SqliteModelPackage.CURRENT_TIME_LITERAL: return createCurrentTimeLiteral();
      case SqliteModelPackage.CURRENT_DATE_LITERAL: return createCurrentDateLiteral();
      case SqliteModelPackage.CURRENT_TIME_STAMP_LITERAL: return createCurrentTimeStampLiteral();
      case SqliteModelPackage.CREATE_TABLE_STATEMENT: return createCreateTableStatement();
      case SqliteModelPackage.CREATE_VIEW_STATEMENT: return createCreateViewStatement();
      case SqliteModelPackage.ALTER_TABLE_RENAME_STATEMENT: return createAlterTableRenameStatement();
      case SqliteModelPackage.COLUMN_DEF: return createColumnDef();
      case SqliteModelPackage.PRIMARY_KEY_COLUMN_CONSTRAINT: return createPrimaryKeyColumnConstraint();
      case SqliteModelPackage.NOT_NULL_CONSTRAINT: return createNotNullConstraint();
      case SqliteModelPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
      case SqliteModelPackage.DEFAULT_CONSTRAINT: return createDefaultConstraint();
      case SqliteModelPackage.CHECK_CONSTRAINT: return createCheckConstraint();
      case SqliteModelPackage.LITERAL_DEFAULT_VALUE: return createLiteralDefaultValue();
      case SqliteModelPackage.EXPRESSION_DEFAULT_VALUE: return createExpressionDefaultValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SqliteModelPackage.COMPOUND_OPERATOR:
        return createCompoundOperatorFromString(eDataType, initialValue);
      case SqliteModelPackage.SQLITE_DATA_TYPE:
        return createSqliteDataTypeFromString(eDataType, initialValue);
      case SqliteModelPackage.COLUMN_TYPE:
        return createColumnTypeFromString(eDataType, initialValue);
      case SqliteModelPackage.CONFLICT_RESOLUTION:
        return createConflictResolutionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SqliteModelPackage.COMPOUND_OPERATOR:
        return convertCompoundOperatorToString(eDataType, instanceValue);
      case SqliteModelPackage.SQLITE_DATA_TYPE:
        return convertSqliteDataTypeToString(eDataType, instanceValue);
      case SqliteModelPackage.COLUMN_TYPE:
        return convertColumnTypeToString(eDataType, instanceValue);
      case SqliteModelPackage.CONFLICT_RESOLUTION:
        return convertConflictResolutionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseBlock createDatabaseBlock()
  {
    DatabaseBlockImpl databaseBlock = new DatabaseBlockImpl();
    return databaseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigBlock createConfigBlock()
  {
    ConfigBlockImpl configBlock = new ConfigBlockImpl();
    return configBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitBlock createInitBlock()
  {
    InitBlockImpl initBlock = new InitBlockImpl();
    return initBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationStatement createConfigurationStatement()
  {
    ConfigurationStatementImpl configurationStatement = new ConfigurationStatementImpl();
    return configurationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArg createFunctionArg()
  {
    FunctionArgImpl functionArg = new FunctionArgImpl();
    return functionArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUri createContentUri()
  {
    ContentUriImpl contentUri = new ContentUriImpl();
    return contentUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUriSegment createContentUriSegment()
  {
    ContentUriSegmentImpl contentUriSegment = new ContentUriSegmentImpl();
    return contentUriSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationBlock createMigrationBlock()
  {
    MigrationBlockImpl migrationBlock = new MigrationBlockImpl();
    return migrationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderingTermList createOrderingTermList()
  {
    OrderingTermListImpl orderingTermList = new OrderingTermListImpl();
    return orderingTermList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectCoreExpression createSelectCoreExpression()
  {
    SelectCoreExpressionImpl selectCoreExpression = new SelectCoreExpressionImpl();
    return selectCoreExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectList createSelectList()
  {
    SelectListImpl selectList = new SelectListImpl();
    return selectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereExpressions createWhereExpressions()
  {
    WhereExpressionsImpl whereExpressions = new WhereExpressionsImpl();
    return whereExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupByExpressions createGroupByExpressions()
  {
    GroupByExpressionsImpl groupByExpressions = new GroupByExpressionsImpl();
    return groupByExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingExpressions createHavingExpressions()
  {
    HavingExpressionsImpl havingExpressions = new HavingExpressionsImpl();
    return havingExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderingTerm createOrderingTerm()
  {
    OrderingTermImpl orderingTerm = new OrderingTermImpl();
    return orderingTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource createJoinSource()
  {
    JoinSourceImpl joinSource = new JoinSourceImpl();
    return joinSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSource createSingleSource()
  {
    SingleSourceImpl singleSource = new SingleSourceImpl();
    return singleSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectSource createSelectSource()
  {
    SelectSourceImpl selectSource = new SelectSourceImpl();
    return selectSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceJoin createSingleSourceJoin()
  {
    SingleSourceJoinImpl singleSourceJoin = new SingleSourceJoinImpl();
    return singleSourceJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinStatement createJoinStatement()
  {
    JoinStatementImpl joinStatement = new JoinStatementImpl();
    return joinStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSource createColumnSource()
  {
    ColumnSourceImpl columnSource = new ColumnSourceImpl();
    return columnSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue createLiteralValue()
  {
    LiteralValueImpl literalValue = new LiteralValueImpl();
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DDLStatement createDDLStatement()
  {
    DDLStatementImpl ddlStatement = new DDLStatementImpl();
    return ddlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition createTableDefinition()
  {
    TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
    return tableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTriggerStatement createCreateTriggerStatement()
  {
    CreateTriggerStatementImpl createTriggerStatement = new CreateTriggerStatementImpl();
    return createTriggerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableAddColumnStatement createAlterTableAddColumnStatement()
  {
    AlterTableAddColumnStatementImpl alterTableAddColumnStatement = new AlterTableAddColumnStatementImpl();
    return alterTableAddColumnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropTableStatement createDropTableStatement()
  {
    DropTableStatementImpl dropTableStatement = new DropTableStatementImpl();
    return dropTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropTriggerStatement createDropTriggerStatement()
  {
    DropTriggerStatementImpl dropTriggerStatement = new DropTriggerStatementImpl();
    return dropTriggerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropViewStatement createDropViewStatement()
  {
    DropViewStatementImpl dropViewStatement = new DropViewStatementImpl();
    return dropViewStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateIndexStatement createCreateIndexStatement()
  {
    CreateIndexStatementImpl createIndexStatement = new CreateIndexStatementImpl();
    return createIndexStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropIndexStatement createDropIndexStatement()
  {
    DropIndexStatementImpl dropIndexStatement = new DropIndexStatementImpl();
    return dropIndexStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnConstraint createColumnConstraint()
  {
    ColumnConstraintImpl columnConstraint = new ColumnConstraintImpl();
    return columnConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableConstraint createTableConstraint()
  {
    TableConstraintImpl tableConstraint = new TableConstraintImpl();
    return tableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueTableConstraint createUniqueTableConstraint()
  {
    UniqueTableConstraintImpl uniqueTableConstraint = new UniqueTableConstraintImpl();
    return uniqueTableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryConstraint createPrimaryConstraint()
  {
    PrimaryConstraintImpl primaryConstraint = new PrimaryConstraintImpl();
    return primaryConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckTableConstraint createCheckTableConstraint()
  {
    CheckTableConstraintImpl checkTableConstraint = new CheckTableConstraintImpl();
    return checkTableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedColumn createIndexedColumn()
  {
    IndexedColumnImpl indexedColumn = new IndexedColumnImpl();
    return indexedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultValue createDefaultValue()
  {
    DefaultValueImpl defaultValue = new DefaultValueImpl();
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictClause createConflictClause()
  {
    ConflictClauseImpl conflictClause = new ConflictClauseImpl();
    return conflictClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DMLStatement createDMLStatement()
  {
    DMLStatementImpl dmlStatement = new DMLStatementImpl();
    return dmlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteStatement createDeleteStatement()
  {
    DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
    return deleteStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertStatement createInsertStatement()
  {
    InsertStatementImpl insertStatement = new InsertStatementImpl();
    return insertStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateStatement createUpdateStatement()
  {
    UpdateStatementImpl updateStatement = new UpdateStatementImpl();
    return updateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateColumnExpression createUpdateColumnExpression()
  {
    UpdateColumnExpressionImpl updateColumnExpression = new UpdateColumnExpressionImpl();
    return updateColumnExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement createActionStatement()
  {
    ActionStatementImpl actionStatement = new ActionStatementImpl();
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUriParamSegment createContentUriParamSegment()
  {
    ContentUriParamSegmentImpl contentUriParamSegment = new ContentUriParamSegmentImpl();
    return contentUriParamSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprConcat createExprConcat()
  {
    ExprConcatImpl exprConcat = new ExprConcatImpl();
    return exprConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprMult createExprMult()
  {
    ExprMultImpl exprMult = new ExprMultImpl();
    return exprMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAdd createExprAdd()
  {
    ExprAddImpl exprAdd = new ExprAddImpl();
    return exprAdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBit createExprBit()
  {
    ExprBitImpl exprBit = new ExprBitImpl();
    return exprBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprRelate createExprRelate()
  {
    ExprRelateImpl exprRelate = new ExprRelateImpl();
    return exprRelate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEqual createExprEqual()
  {
    ExprEqualImpl exprEqual = new ExprEqualImpl();
    return exprEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd createExprAnd()
  {
    ExprAndImpl exprAnd = new ExprAndImpl();
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr createExprOr()
  {
    ExprOrImpl exprOr = new ExprOrImpl();
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullCheckExpression createNullCheckExpression()
  {
    NullCheckExpressionImpl nullCheckExpression = new NullCheckExpressionImpl();
    return nullCheckExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsNull createIsNull()
  {
    IsNullImpl isNull = new IsNullImpl();
    return isNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNull createNotNull()
  {
    NotNullImpl notNull = new NotNullImpl();
    return notNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewColumn createNewColumn()
  {
    NewColumnImpl newColumn = new NewColumnImpl();
    return newColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OldColumn createOldColumn()
  {
    OldColumnImpl oldColumn = new OldColumnImpl();
    return oldColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSourceRef createColumnSourceRef()
  {
    ColumnSourceRefImpl columnSourceRef = new ColumnSourceRefImpl();
    return columnSourceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedExpression createNestedExpression()
  {
    NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
    return nestedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatementExpression createSelectStatementExpression()
  {
    SelectStatementExpressionImpl selectStatementExpression = new SelectStatementExpressionImpl();
    return selectStatementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseExpression createCaseExpression()
  {
    CaseExpressionImpl caseExpression = new CaseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArgument createFunctionArgument()
  {
    FunctionArgumentImpl functionArgument = new FunctionArgumentImpl();
    return functionArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectCore createSelectCore()
  {
    SelectCoreImpl selectCore = new SelectCoreImpl();
    return selectCore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectExpression createSelectExpression()
  {
    SelectExpressionImpl selectExpression = new SelectExpressionImpl();
    return selectExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceTable createSingleSourceTable()
  {
    SingleSourceTableImpl singleSourceTable = new SingleSourceTableImpl();
    return singleSourceTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceSelectStatement createSingleSourceSelectStatement()
  {
    SingleSourceSelectStatementImpl singleSourceSelectStatement = new SingleSourceSelectStatementImpl();
    return singleSourceSelectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultColumn createResultColumn()
  {
    ResultColumnImpl resultColumn = new ResultColumnImpl();
    return resultColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTimeLiteral createCurrentTimeLiteral()
  {
    CurrentTimeLiteralImpl currentTimeLiteral = new CurrentTimeLiteralImpl();
    return currentTimeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentDateLiteral createCurrentDateLiteral()
  {
    CurrentDateLiteralImpl currentDateLiteral = new CurrentDateLiteralImpl();
    return currentDateLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTimeStampLiteral createCurrentTimeStampLiteral()
  {
    CurrentTimeStampLiteralImpl currentTimeStampLiteral = new CurrentTimeStampLiteralImpl();
    return currentTimeStampLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTableStatement createCreateTableStatement()
  {
    CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
    return createTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateViewStatement createCreateViewStatement()
  {
    CreateViewStatementImpl createViewStatement = new CreateViewStatementImpl();
    return createViewStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableRenameStatement createAlterTableRenameStatement()
  {
    AlterTableRenameStatementImpl alterTableRenameStatement = new AlterTableRenameStatementImpl();
    return alterTableRenameStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef createColumnDef()
  {
    ColumnDefImpl columnDef = new ColumnDefImpl();
    return columnDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint()
  {
    PrimaryKeyColumnConstraintImpl primaryKeyColumnConstraint = new PrimaryKeyColumnConstraintImpl();
    return primaryKeyColumnConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNullConstraint createNotNullConstraint()
  {
    NotNullConstraintImpl notNullConstraint = new NotNullConstraintImpl();
    return notNullConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueConstraint createUniqueConstraint()
  {
    UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
    return uniqueConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultConstraint createDefaultConstraint()
  {
    DefaultConstraintImpl defaultConstraint = new DefaultConstraintImpl();
    return defaultConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckConstraint createCheckConstraint()
  {
    CheckConstraintImpl checkConstraint = new CheckConstraintImpl();
    return checkConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralDefaultValue createLiteralDefaultValue()
  {
    LiteralDefaultValueImpl literalDefaultValue = new LiteralDefaultValueImpl();
    return literalDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionDefaultValue createExpressionDefaultValue()
  {
    ExpressionDefaultValueImpl expressionDefaultValue = new ExpressionDefaultValueImpl();
    return expressionDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundOperator createCompoundOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompoundOperator result = CompoundOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompoundOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteDataType createSqliteDataTypeFromString(EDataType eDataType, String initialValue)
  {
    SqliteDataType result = SqliteDataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSqliteDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnType createColumnTypeFromString(EDataType eDataType, String initialValue)
  {
    ColumnType result = ColumnType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolution createConflictResolutionFromString(EDataType eDataType, String initialValue)
  {
    ConflictResolution result = ConflictResolution.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConflictResolutionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelPackage getSqliteModelPackage()
  {
    return (SqliteModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SqliteModelPackage getPackage()
  {
    return SqliteModelPackage.eINSTANCE;
  }

} //SqliteModelFactoryImpl
