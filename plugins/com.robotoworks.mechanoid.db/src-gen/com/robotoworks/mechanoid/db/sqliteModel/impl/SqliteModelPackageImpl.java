/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ActionStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.db.sqliteModel.Case;
import com.robotoworks.mechanoid.db.sqliteModel.CaseExpression;
import com.robotoworks.mechanoid.db.sqliteModel.CastExpression;
import com.robotoworks.mechanoid.db.sqliteModel.CheckConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.CheckTableConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.db.sqliteModel.CompoundOperator;
import com.robotoworks.mechanoid.db.sqliteModel.ConfigBlock;
import com.robotoworks.mechanoid.db.sqliteModel.ConfigurationStatement;
import com.robotoworks.mechanoid.db.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.db.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.db.sqliteModel.ContentUri;
import com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment;
import com.robotoworks.mechanoid.db.sqliteModel.ContentUriSegment;
import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CurrentDateLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.CurrentTimeStampLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DMLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.db.sqliteModel.DefaultConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.DefaultValue;
import com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.ExprAdd;
import com.robotoworks.mechanoid.db.sqliteModel.ExprAnd;
import com.robotoworks.mechanoid.db.sqliteModel.ExprBit;
import com.robotoworks.mechanoid.db.sqliteModel.ExprConcat;
import com.robotoworks.mechanoid.db.sqliteModel.ExprEqual;
import com.robotoworks.mechanoid.db.sqliteModel.ExprMult;
import com.robotoworks.mechanoid.db.sqliteModel.ExprOr;
import com.robotoworks.mechanoid.db.sqliteModel.ExprRelate;
import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.db.sqliteModel.Function;
import com.robotoworks.mechanoid.db.sqliteModel.FunctionArg;
import com.robotoworks.mechanoid.db.sqliteModel.FunctionArgument;
import com.robotoworks.mechanoid.db.sqliteModel.GroupByExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.HavingExpressions;
import com.robotoworks.mechanoid.db.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.db.sqliteModel.InitBlock;
import com.robotoworks.mechanoid.db.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.db.sqliteModel.IsNull;
import com.robotoworks.mechanoid.db.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.db.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.db.sqliteModel.Literal;
import com.robotoworks.mechanoid.db.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.db.sqliteModel.LiteralValue;
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.db.sqliteModel.Model;
import com.robotoworks.mechanoid.db.sqliteModel.NestedExpression;
import com.robotoworks.mechanoid.db.sqliteModel.NewColumn;
import com.robotoworks.mechanoid.db.sqliteModel.NotNull;
import com.robotoworks.mechanoid.db.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.NullCheckExpression;
import com.robotoworks.mechanoid.db.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.OldColumn;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList;
import com.robotoworks.mechanoid.db.sqliteModel.PrimaryConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectList;
import com.robotoworks.mechanoid.db.sqliteModel.SelectSource;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatementExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.db.sqliteModel.StringLiteral;
import com.robotoworks.mechanoid.db.sqliteModel.TableConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;
import com.robotoworks.mechanoid.db.sqliteModel.UniqueConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.UniqueTableConstraint;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement;
import com.robotoworks.mechanoid.db.sqliteModel.WhereExpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqliteModelPackageImpl extends EPackageImpl implements SqliteModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentUriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentUriSegmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migrationBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderingTermListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectCoreExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereExpressionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupByExpressionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass havingExpressionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderingTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ddlStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createTriggerStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableAddColumnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropTableStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropTriggerStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropViewStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createIndexStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropIndexStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueTableConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkTableConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexedColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conflictClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dmlStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateColumnExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentUriParamSegmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprConcatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAddEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprRelateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullCheckExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oldColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnSourceRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectStatementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectCoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleSourceSelectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentTimeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentDateLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currentTimeStampLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createTableStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createViewStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableRenameStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryKeyColumnConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notNullConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalDefaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionDefaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compoundOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sqliteDataTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum columnTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conflictResolutionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SqliteModelPackageImpl()
  {
    super(eNS_URI, SqliteModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SqliteModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SqliteModelPackage init()
  {
    if (isInited) return (SqliteModelPackage)EPackage.Registry.INSTANCE.getEPackage(SqliteModelPackage.eNS_URI);

    // Obtain or create and register package
    SqliteModelPackageImpl theSqliteModelPackage = (SqliteModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SqliteModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SqliteModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSqliteModelPackage.createPackageContents();

    // Initialize created meta-data
    theSqliteModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSqliteModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SqliteModelPackage.eNS_URI, theSqliteModelPackage);
    return theSqliteModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_PackageName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Database()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseBlock()
  {
    return databaseBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_Name()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseBlock_Config()
  {
    return (EReference)databaseBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseBlock_Init()
  {
    return (EReference)databaseBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseBlock_Migrations()
  {
    return (EReference)databaseBlockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigBlock()
  {
    return configBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigBlock_Statements()
  {
    return (EReference)configBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitBlock()
  {
    return initBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitBlock_Statements()
  {
    return (EReference)initBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationStatement()
  {
    return configurationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigurationStatement_Name()
  {
    return (EAttribute)configurationStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionArg()
  {
    return functionArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionArg_Type()
  {
    return (EAttribute)functionArgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionArg_Name()
  {
    return (EAttribute)functionArgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentUri()
  {
    return contentUriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentUri_Type()
  {
    return (EAttribute)contentUriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentUri_Segments()
  {
    return (EReference)contentUriEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentUriSegment()
  {
    return contentUriSegmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentUriSegment_Name()
  {
    return (EAttribute)contentUriSegmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigrationBlock()
  {
    return migrationBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationBlock_Statements()
  {
    return (EReference)migrationBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_WhenExpression()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_ThenExpression()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectStatement()
  {
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_Core()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_Orderby()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_Limit()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_LimitOffset()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderingTermList()
  {
    return orderingTermListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderingTermList_OrderingTerms()
  {
    return (EReference)orderingTermListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectCoreExpression()
  {
    return selectCoreExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectList()
  {
    return selectListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectList_ResultColumns()
  {
    return (EReference)selectListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhereExpressions()
  {
    return whereExpressionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereExpressions_Expression()
  {
    return (EReference)whereExpressionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupByExpressions()
  {
    return groupByExpressionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupByExpressions_GroupByExpressions()
  {
    return (EReference)groupByExpressionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHavingExpressions()
  {
    return havingExpressionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHavingExpressions_Expression()
  {
    return (EReference)havingExpressionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderingTerm()
  {
    return orderingTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderingTerm_Expression()
  {
    return (EReference)orderingTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrderingTerm_Asc()
  {
    return (EAttribute)orderingTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrderingTerm_Desc()
  {
    return (EAttribute)orderingTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinSource()
  {
    return joinSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinSource_Source()
  {
    return (EReference)joinSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinSource_JoinStatements()
  {
    return (EReference)joinSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSource()
  {
    return singleSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectSource()
  {
    return selectSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectSource_Name()
  {
    return (EAttribute)selectSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSourceJoin()
  {
    return singleSourceJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleSourceJoin_JoinSource()
  {
    return (EReference)singleSourceJoinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinStatement()
  {
    return joinStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Natural()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Left()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Outer()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Inner()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Cross()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinStatement_SingleSource()
  {
    return (EReference)joinStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinStatement_Expression()
  {
    return (EReference)joinStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnSource()
  {
    return columnSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnSource_Name()
  {
    return (EAttribute)columnSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralValue()
  {
    return literalValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDDLStatement()
  {
    return ddlStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableDefinition()
  {
    return tableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableDefinition_Name()
  {
    return (EAttribute)tableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateTriggerStatement()
  {
    return createTriggerStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_Temporary()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_Name()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_When()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_EventType()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_UpdateColumnNames()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTriggerStatement_Table()
  {
    return (EReference)createTriggerStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_ForEachRow()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTriggerStatement_WhenExpression()
  {
    return (EReference)createTriggerStatementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTriggerStatement_Statements()
  {
    return (EReference)createTriggerStatementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableAddColumnStatement()
  {
    return alterTableAddColumnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableAddColumnStatement_Table()
  {
    return (EReference)alterTableAddColumnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableAddColumnStatement_ColumnDef()
  {
    return (EReference)alterTableAddColumnStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropTableStatement()
  {
    return dropTableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropTableStatement_IfExists()
  {
    return (EAttribute)dropTableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDropTableStatement_Table()
  {
    return (EReference)dropTableStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropTriggerStatement()
  {
    return dropTriggerStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropTriggerStatement_IfExists()
  {
    return (EAttribute)dropTriggerStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDropTriggerStatement_Trigger()
  {
    return (EReference)dropTriggerStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropViewStatement()
  {
    return dropViewStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropViewStatement_IfExists()
  {
    return (EAttribute)dropViewStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDropViewStatement_View()
  {
    return (EReference)dropViewStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateIndexStatement()
  {
    return createIndexStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateIndexStatement_Unique()
  {
    return (EAttribute)createIndexStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateIndexStatement_Name()
  {
    return (EAttribute)createIndexStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateIndexStatement_Table()
  {
    return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateIndexStatement_Columns()
  {
    return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropIndexStatement()
  {
    return dropIndexStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropIndexStatement_IfExists()
  {
    return (EAttribute)dropIndexStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDropIndexStatement_Index()
  {
    return (EReference)dropIndexStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnConstraint()
  {
    return columnConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableConstraint()
  {
    return tableConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableConstraint_Name()
  {
    return (EAttribute)tableConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueTableConstraint()
  {
    return uniqueTableConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueTableConstraint_Columns()
  {
    return (EReference)uniqueTableConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueTableConstraint_ConflictClause()
  {
    return (EReference)uniqueTableConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryConstraint()
  {
    return primaryConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryConstraint_Columns()
  {
    return (EReference)primaryConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryConstraint_ConflictClause()
  {
    return (EReference)primaryConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckTableConstraint()
  {
    return checkTableConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckTableConstraint_Expression()
  {
    return (EReference)checkTableConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexedColumn()
  {
    return indexedColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexedColumn_ColumnReference()
  {
    return (EReference)indexedColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_CollationName()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_Asc()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_Desc()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultValue()
  {
    return defaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConflictClause()
  {
    return conflictClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConflictClause_Resolution()
  {
    return (EAttribute)conflictClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDMLStatement()
  {
    return dmlStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteStatement()
  {
    return deleteStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteStatement_Table()
  {
    return (EReference)deleteStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteStatement_Expression()
  {
    return (EReference)deleteStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertStatement()
  {
    return insertStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertStatement_ConflictResolution()
  {
    return (EAttribute)insertStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertStatement_Table()
  {
    return (EReference)insertStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertStatement_ColumnNames()
  {
    return (EReference)insertStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertStatement_Expressions()
  {
    return (EReference)insertStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertStatement_SelectStatement()
  {
    return (EReference)insertStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateStatement()
  {
    return updateStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdateStatement_ConflictResolution()
  {
    return (EAttribute)updateStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateStatement_Table()
  {
    return (EReference)updateStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateStatement_UpdateColumnExpressions()
  {
    return (EReference)updateStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateStatement_WhereExpression()
  {
    return (EReference)updateStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateColumnExpression()
  {
    return updateColumnExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateColumnExpression_ColumnName()
  {
    return (EReference)updateColumnExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateColumnExpression_Expression()
  {
    return (EReference)updateColumnExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionStatement()
  {
    return actionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionStatement_Uri()
  {
    return (EReference)actionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Args()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Statements()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_All()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Arguments()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentUriParamSegment()
  {
    return contentUriParamSegmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentUriParamSegment_Num()
  {
    return (EAttribute)contentUriParamSegmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentUriParamSegment_Text()
  {
    return (EAttribute)contentUriParamSegmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprConcat()
  {
    return exprConcatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprConcat_Left()
  {
    return (EReference)exprConcatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprConcat_Op()
  {
    return (EAttribute)exprConcatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprConcat_Right()
  {
    return (EReference)exprConcatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprMult()
  {
    return exprMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprMult_Left()
  {
    return (EReference)exprMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprMult_Op()
  {
    return (EAttribute)exprMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprMult_Right()
  {
    return (EReference)exprMultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprAdd()
  {
    return exprAddEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAdd_Left()
  {
    return (EReference)exprAddEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprAdd_Op()
  {
    return (EAttribute)exprAddEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAdd_Right()
  {
    return (EReference)exprAddEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBit()
  {
    return exprBitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBit_Left()
  {
    return (EReference)exprBitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprBit_Op()
  {
    return (EAttribute)exprBitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBit_Right()
  {
    return (EReference)exprBitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprRelate()
  {
    return exprRelateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprRelate_Left()
  {
    return (EReference)exprRelateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprRelate_Op()
  {
    return (EAttribute)exprRelateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprRelate_Right()
  {
    return (EReference)exprRelateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprEqual()
  {
    return exprEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEqual_Left()
  {
    return (EReference)exprEqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprEqual_Op()
  {
    return (EAttribute)exprEqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEqual_Right()
  {
    return (EReference)exprEqualEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprAnd()
  {
    return exprAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAnd_Left()
  {
    return (EReference)exprAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprAnd_Op()
  {
    return (EAttribute)exprAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAnd_Right()
  {
    return (EReference)exprAndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprOr()
  {
    return exprOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprOr_Left()
  {
    return (EReference)exprOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprOr_Op()
  {
    return (EAttribute)exprOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprOr_Right()
  {
    return (EReference)exprOrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullCheckExpression()
  {
    return nullCheckExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNullCheckExpression_Left()
  {
    return (EReference)nullCheckExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNullCheckExpression_Right()
  {
    return (EReference)nullCheckExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsNull()
  {
    return isNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotNull()
  {
    return notNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewColumn()
  {
    return newColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewColumn_Column()
  {
    return (EReference)newColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOldColumn()
  {
    return oldColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOldColumn_Column()
  {
    return (EReference)oldColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnSourceRef()
  {
    return columnSourceRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnSourceRef_Source()
  {
    return (EReference)columnSourceRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnSourceRef_All()
  {
    return (EAttribute)columnSourceRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnSourceRef_Column()
  {
    return (EReference)columnSourceRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_LiteralValue()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedExpression()
  {
    return nestedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNestedExpression_Expression()
  {
    return (EReference)nestedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectStatementExpression()
  {
    return selectStatementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectStatementExpression_Not()
  {
    return (EAttribute)selectStatementExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectStatementExpression_Exists()
  {
    return (EAttribute)selectStatementExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatementExpression_Select()
  {
    return (EReference)selectStatementExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseExpression()
  {
    return caseExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseExpression_CaseExpression()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseExpression_Cases()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseExpression_ElseExpression()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastExpression()
  {
    return castExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpression_Expression()
  {
    return (EReference)castExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCastExpression_Type()
  {
    return (EAttribute)castExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionArgument()
  {
    return functionArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionArgument_Arg()
  {
    return (EReference)functionArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectCore()
  {
    return selectCoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_Left()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectCore_Op()
  {
    return (EAttribute)selectCoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_Right()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectExpression()
  {
    return selectExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectExpression_Distinct()
  {
    return (EAttribute)selectExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectExpression_All()
  {
    return (EAttribute)selectExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectExpression_AllColumns()
  {
    return (EAttribute)selectExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectExpression_SelectList()
  {
    return (EReference)selectExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectExpression_Source()
  {
    return (EReference)selectExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectExpression_Where()
  {
    return (EReference)selectExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectExpression_GroupBy()
  {
    return (EReference)selectExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectExpression_Having()
  {
    return (EReference)selectExpressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSourceTable()
  {
    return singleSourceTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleSourceTable_TableReference()
  {
    return (EReference)singleSourceTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleSourceSelectStatement()
  {
    return singleSourceSelectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleSourceSelectStatement_SelectStatement()
  {
    return (EReference)singleSourceSelectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultColumn()
  {
    return resultColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResultColumn_Expression()
  {
    return (EReference)resultColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericLiteral()
  {
    return numericLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericLiteral_Number()
  {
    return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Literal()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    return nullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullLiteral_Literal()
  {
    return (EAttribute)nullLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentTimeLiteral()
  {
    return currentTimeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentTimeLiteral_Literal()
  {
    return (EAttribute)currentTimeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentDateLiteral()
  {
    return currentDateLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentDateLiteral_Literal()
  {
    return (EAttribute)currentDateLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrentTimeStampLiteral()
  {
    return currentTimeStampLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrentTimeStampLiteral_Literal()
  {
    return (EAttribute)currentTimeStampLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateTableStatement()
  {
    return createTableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTableStatement_Temporary()
  {
    return (EAttribute)createTableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTableStatement_ColumnDefs()
  {
    return (EReference)createTableStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTableStatement_Constraints()
  {
    return (EReference)createTableStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateViewStatement()
  {
    return createViewStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateViewStatement_Temporary()
  {
    return (EAttribute)createViewStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateViewStatement_SelectStatement()
  {
    return (EReference)createViewStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableRenameStatement()
  {
    return alterTableRenameStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableRenameStatement_Table()
  {
    return (EReference)alterTableRenameStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnDef()
  {
    return columnDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnDef_Type()
  {
    return (EAttribute)columnDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnDef_Constraints()
  {
    return (EReference)columnDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryKeyColumnConstraint()
  {
    return primaryKeyColumnConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKeyColumnConstraint_Asc()
  {
    return (EAttribute)primaryKeyColumnConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKeyColumnConstraint_Desc()
  {
    return (EAttribute)primaryKeyColumnConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKeyColumnConstraint_Autoincrement()
  {
    return (EAttribute)primaryKeyColumnConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotNullConstraint()
  {
    return notNullConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotNullConstraint_ConflictClause()
  {
    return (EReference)notNullConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueConstraint()
  {
    return uniqueConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueConstraint_ConflictClause()
  {
    return (EReference)uniqueConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultConstraint()
  {
    return defaultConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultConstraint_DefaultValue()
  {
    return (EReference)defaultConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckConstraint()
  {
    return checkConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckConstraint_Expression()
  {
    return (EReference)checkConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralDefaultValue()
  {
    return literalDefaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralDefaultValue_Literal()
  {
    return (EReference)literalDefaultValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionDefaultValue()
  {
    return expressionDefaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionDefaultValue_Expression()
  {
    return (EReference)expressionDefaultValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCompoundOperator()
  {
    return compoundOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSqliteDataType()
  {
    return sqliteDataTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColumnType()
  {
    return columnTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConflictResolution()
  {
    return conflictResolutionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteModelFactory getSqliteModelFactory()
  {
    return (SqliteModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PACKAGE_NAME);
    createEReference(modelEClass, MODEL__DATABASE);

    databaseBlockEClass = createEClass(DATABASE_BLOCK);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__NAME);
    createEReference(databaseBlockEClass, DATABASE_BLOCK__CONFIG);
    createEReference(databaseBlockEClass, DATABASE_BLOCK__INIT);
    createEReference(databaseBlockEClass, DATABASE_BLOCK__MIGRATIONS);

    configBlockEClass = createEClass(CONFIG_BLOCK);
    createEReference(configBlockEClass, CONFIG_BLOCK__STATEMENTS);

    initBlockEClass = createEClass(INIT_BLOCK);
    createEReference(initBlockEClass, INIT_BLOCK__STATEMENTS);

    configurationStatementEClass = createEClass(CONFIGURATION_STATEMENT);
    createEAttribute(configurationStatementEClass, CONFIGURATION_STATEMENT__NAME);

    functionArgEClass = createEClass(FUNCTION_ARG);
    createEAttribute(functionArgEClass, FUNCTION_ARG__TYPE);
    createEAttribute(functionArgEClass, FUNCTION_ARG__NAME);

    contentUriEClass = createEClass(CONTENT_URI);
    createEAttribute(contentUriEClass, CONTENT_URI__TYPE);
    createEReference(contentUriEClass, CONTENT_URI__SEGMENTS);

    contentUriSegmentEClass = createEClass(CONTENT_URI_SEGMENT);
    createEAttribute(contentUriSegmentEClass, CONTENT_URI_SEGMENT__NAME);

    migrationBlockEClass = createEClass(MIGRATION_BLOCK);
    createEReference(migrationBlockEClass, MIGRATION_BLOCK__STATEMENTS);

    expressionEClass = createEClass(EXPRESSION);

    caseEClass = createEClass(CASE);
    createEReference(caseEClass, CASE__WHEN_EXPRESSION);
    createEReference(caseEClass, CASE__THEN_EXPRESSION);

    selectStatementEClass = createEClass(SELECT_STATEMENT);
    createEReference(selectStatementEClass, SELECT_STATEMENT__CORE);
    createEReference(selectStatementEClass, SELECT_STATEMENT__ORDERBY);
    createEReference(selectStatementEClass, SELECT_STATEMENT__LIMIT);
    createEReference(selectStatementEClass, SELECT_STATEMENT__LIMIT_OFFSET);

    orderingTermListEClass = createEClass(ORDERING_TERM_LIST);
    createEReference(orderingTermListEClass, ORDERING_TERM_LIST__ORDERING_TERMS);

    selectCoreExpressionEClass = createEClass(SELECT_CORE_EXPRESSION);

    selectListEClass = createEClass(SELECT_LIST);
    createEReference(selectListEClass, SELECT_LIST__RESULT_COLUMNS);

    whereExpressionsEClass = createEClass(WHERE_EXPRESSIONS);
    createEReference(whereExpressionsEClass, WHERE_EXPRESSIONS__EXPRESSION);

    groupByExpressionsEClass = createEClass(GROUP_BY_EXPRESSIONS);
    createEReference(groupByExpressionsEClass, GROUP_BY_EXPRESSIONS__GROUP_BY_EXPRESSIONS);

    havingExpressionsEClass = createEClass(HAVING_EXPRESSIONS);
    createEReference(havingExpressionsEClass, HAVING_EXPRESSIONS__EXPRESSION);

    orderingTermEClass = createEClass(ORDERING_TERM);
    createEReference(orderingTermEClass, ORDERING_TERM__EXPRESSION);
    createEAttribute(orderingTermEClass, ORDERING_TERM__ASC);
    createEAttribute(orderingTermEClass, ORDERING_TERM__DESC);

    joinSourceEClass = createEClass(JOIN_SOURCE);
    createEReference(joinSourceEClass, JOIN_SOURCE__SOURCE);
    createEReference(joinSourceEClass, JOIN_SOURCE__JOIN_STATEMENTS);

    singleSourceEClass = createEClass(SINGLE_SOURCE);

    selectSourceEClass = createEClass(SELECT_SOURCE);
    createEAttribute(selectSourceEClass, SELECT_SOURCE__NAME);

    singleSourceJoinEClass = createEClass(SINGLE_SOURCE_JOIN);
    createEReference(singleSourceJoinEClass, SINGLE_SOURCE_JOIN__JOIN_SOURCE);

    joinStatementEClass = createEClass(JOIN_STATEMENT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__NATURAL);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__LEFT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__OUTER);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__INNER);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__CROSS);
    createEReference(joinStatementEClass, JOIN_STATEMENT__SINGLE_SOURCE);
    createEReference(joinStatementEClass, JOIN_STATEMENT__EXPRESSION);

    columnSourceEClass = createEClass(COLUMN_SOURCE);
    createEAttribute(columnSourceEClass, COLUMN_SOURCE__NAME);

    literalValueEClass = createEClass(LITERAL_VALUE);

    ddlStatementEClass = createEClass(DDL_STATEMENT);

    tableDefinitionEClass = createEClass(TABLE_DEFINITION);
    createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__NAME);

    createTriggerStatementEClass = createEClass(CREATE_TRIGGER_STATEMENT);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__TEMPORARY);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__NAME);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__WHEN);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__EVENT_TYPE);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES);
    createEReference(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__TABLE);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__FOR_EACH_ROW);
    createEReference(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION);
    createEReference(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__STATEMENTS);

    alterTableAddColumnStatementEClass = createEClass(ALTER_TABLE_ADD_COLUMN_STATEMENT);
    createEReference(alterTableAddColumnStatementEClass, ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE);
    createEReference(alterTableAddColumnStatementEClass, ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF);

    dropTableStatementEClass = createEClass(DROP_TABLE_STATEMENT);
    createEAttribute(dropTableStatementEClass, DROP_TABLE_STATEMENT__IF_EXISTS);
    createEReference(dropTableStatementEClass, DROP_TABLE_STATEMENT__TABLE);

    dropTriggerStatementEClass = createEClass(DROP_TRIGGER_STATEMENT);
    createEAttribute(dropTriggerStatementEClass, DROP_TRIGGER_STATEMENT__IF_EXISTS);
    createEReference(dropTriggerStatementEClass, DROP_TRIGGER_STATEMENT__TRIGGER);

    dropViewStatementEClass = createEClass(DROP_VIEW_STATEMENT);
    createEAttribute(dropViewStatementEClass, DROP_VIEW_STATEMENT__IF_EXISTS);
    createEReference(dropViewStatementEClass, DROP_VIEW_STATEMENT__VIEW);

    createIndexStatementEClass = createEClass(CREATE_INDEX_STATEMENT);
    createEAttribute(createIndexStatementEClass, CREATE_INDEX_STATEMENT__UNIQUE);
    createEAttribute(createIndexStatementEClass, CREATE_INDEX_STATEMENT__NAME);
    createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__TABLE);
    createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__COLUMNS);

    dropIndexStatementEClass = createEClass(DROP_INDEX_STATEMENT);
    createEAttribute(dropIndexStatementEClass, DROP_INDEX_STATEMENT__IF_EXISTS);
    createEReference(dropIndexStatementEClass, DROP_INDEX_STATEMENT__INDEX);

    columnConstraintEClass = createEClass(COLUMN_CONSTRAINT);

    tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
    createEAttribute(tableConstraintEClass, TABLE_CONSTRAINT__NAME);

    uniqueTableConstraintEClass = createEClass(UNIQUE_TABLE_CONSTRAINT);
    createEReference(uniqueTableConstraintEClass, UNIQUE_TABLE_CONSTRAINT__COLUMNS);
    createEReference(uniqueTableConstraintEClass, UNIQUE_TABLE_CONSTRAINT__CONFLICT_CLAUSE);

    primaryConstraintEClass = createEClass(PRIMARY_CONSTRAINT);
    createEReference(primaryConstraintEClass, PRIMARY_CONSTRAINT__COLUMNS);
    createEReference(primaryConstraintEClass, PRIMARY_CONSTRAINT__CONFLICT_CLAUSE);

    checkTableConstraintEClass = createEClass(CHECK_TABLE_CONSTRAINT);
    createEReference(checkTableConstraintEClass, CHECK_TABLE_CONSTRAINT__EXPRESSION);

    indexedColumnEClass = createEClass(INDEXED_COLUMN);
    createEReference(indexedColumnEClass, INDEXED_COLUMN__COLUMN_REFERENCE);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__COLLATION_NAME);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__ASC);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__DESC);

    defaultValueEClass = createEClass(DEFAULT_VALUE);

    conflictClauseEClass = createEClass(CONFLICT_CLAUSE);
    createEAttribute(conflictClauseEClass, CONFLICT_CLAUSE__RESOLUTION);

    dmlStatementEClass = createEClass(DML_STATEMENT);

    deleteStatementEClass = createEClass(DELETE_STATEMENT);
    createEReference(deleteStatementEClass, DELETE_STATEMENT__TABLE);
    createEReference(deleteStatementEClass, DELETE_STATEMENT__EXPRESSION);

    insertStatementEClass = createEClass(INSERT_STATEMENT);
    createEAttribute(insertStatementEClass, INSERT_STATEMENT__CONFLICT_RESOLUTION);
    createEReference(insertStatementEClass, INSERT_STATEMENT__TABLE);
    createEReference(insertStatementEClass, INSERT_STATEMENT__COLUMN_NAMES);
    createEReference(insertStatementEClass, INSERT_STATEMENT__EXPRESSIONS);
    createEReference(insertStatementEClass, INSERT_STATEMENT__SELECT_STATEMENT);

    updateStatementEClass = createEClass(UPDATE_STATEMENT);
    createEAttribute(updateStatementEClass, UPDATE_STATEMENT__CONFLICT_RESOLUTION);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__TABLE);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__WHERE_EXPRESSION);

    updateColumnExpressionEClass = createEClass(UPDATE_COLUMN_EXPRESSION);
    createEReference(updateColumnExpressionEClass, UPDATE_COLUMN_EXPRESSION__COLUMN_NAME);
    createEReference(updateColumnExpressionEClass, UPDATE_COLUMN_EXPRESSION__EXPRESSION);

    actionStatementEClass = createEClass(ACTION_STATEMENT);
    createEReference(actionStatementEClass, ACTION_STATEMENT__URI);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__ARGS);
    createEReference(functionEClass, FUNCTION__STATEMENTS);
    createEAttribute(functionEClass, FUNCTION__ALL);
    createEReference(functionEClass, FUNCTION__ARGUMENTS);

    contentUriParamSegmentEClass = createEClass(CONTENT_URI_PARAM_SEGMENT);
    createEAttribute(contentUriParamSegmentEClass, CONTENT_URI_PARAM_SEGMENT__NUM);
    createEAttribute(contentUriParamSegmentEClass, CONTENT_URI_PARAM_SEGMENT__TEXT);

    exprConcatEClass = createEClass(EXPR_CONCAT);
    createEReference(exprConcatEClass, EXPR_CONCAT__LEFT);
    createEAttribute(exprConcatEClass, EXPR_CONCAT__OP);
    createEReference(exprConcatEClass, EXPR_CONCAT__RIGHT);

    exprMultEClass = createEClass(EXPR_MULT);
    createEReference(exprMultEClass, EXPR_MULT__LEFT);
    createEAttribute(exprMultEClass, EXPR_MULT__OP);
    createEReference(exprMultEClass, EXPR_MULT__RIGHT);

    exprAddEClass = createEClass(EXPR_ADD);
    createEReference(exprAddEClass, EXPR_ADD__LEFT);
    createEAttribute(exprAddEClass, EXPR_ADD__OP);
    createEReference(exprAddEClass, EXPR_ADD__RIGHT);

    exprBitEClass = createEClass(EXPR_BIT);
    createEReference(exprBitEClass, EXPR_BIT__LEFT);
    createEAttribute(exprBitEClass, EXPR_BIT__OP);
    createEReference(exprBitEClass, EXPR_BIT__RIGHT);

    exprRelateEClass = createEClass(EXPR_RELATE);
    createEReference(exprRelateEClass, EXPR_RELATE__LEFT);
    createEAttribute(exprRelateEClass, EXPR_RELATE__OP);
    createEReference(exprRelateEClass, EXPR_RELATE__RIGHT);

    exprEqualEClass = createEClass(EXPR_EQUAL);
    createEReference(exprEqualEClass, EXPR_EQUAL__LEFT);
    createEAttribute(exprEqualEClass, EXPR_EQUAL__OP);
    createEReference(exprEqualEClass, EXPR_EQUAL__RIGHT);

    exprAndEClass = createEClass(EXPR_AND);
    createEReference(exprAndEClass, EXPR_AND__LEFT);
    createEAttribute(exprAndEClass, EXPR_AND__OP);
    createEReference(exprAndEClass, EXPR_AND__RIGHT);

    exprOrEClass = createEClass(EXPR_OR);
    createEReference(exprOrEClass, EXPR_OR__LEFT);
    createEAttribute(exprOrEClass, EXPR_OR__OP);
    createEReference(exprOrEClass, EXPR_OR__RIGHT);

    nullCheckExpressionEClass = createEClass(NULL_CHECK_EXPRESSION);
    createEReference(nullCheckExpressionEClass, NULL_CHECK_EXPRESSION__LEFT);
    createEReference(nullCheckExpressionEClass, NULL_CHECK_EXPRESSION__RIGHT);

    isNullEClass = createEClass(IS_NULL);

    notNullEClass = createEClass(NOT_NULL);

    newColumnEClass = createEClass(NEW_COLUMN);
    createEReference(newColumnEClass, NEW_COLUMN__COLUMN);

    oldColumnEClass = createEClass(OLD_COLUMN);
    createEReference(oldColumnEClass, OLD_COLUMN__COLUMN);

    columnSourceRefEClass = createEClass(COLUMN_SOURCE_REF);
    createEReference(columnSourceRefEClass, COLUMN_SOURCE_REF__SOURCE);
    createEAttribute(columnSourceRefEClass, COLUMN_SOURCE_REF__ALL);
    createEReference(columnSourceRefEClass, COLUMN_SOURCE_REF__COLUMN);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__LITERAL_VALUE);

    nestedExpressionEClass = createEClass(NESTED_EXPRESSION);
    createEReference(nestedExpressionEClass, NESTED_EXPRESSION__EXPRESSION);

    selectStatementExpressionEClass = createEClass(SELECT_STATEMENT_EXPRESSION);
    createEAttribute(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__NOT);
    createEAttribute(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__EXISTS);
    createEReference(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__SELECT);

    caseExpressionEClass = createEClass(CASE_EXPRESSION);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__CASE_EXPRESSION);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__CASES);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__ELSE_EXPRESSION);

    castExpressionEClass = createEClass(CAST_EXPRESSION);
    createEReference(castExpressionEClass, CAST_EXPRESSION__EXPRESSION);
    createEAttribute(castExpressionEClass, CAST_EXPRESSION__TYPE);

    functionArgumentEClass = createEClass(FUNCTION_ARGUMENT);
    createEReference(functionArgumentEClass, FUNCTION_ARGUMENT__ARG);

    selectCoreEClass = createEClass(SELECT_CORE);
    createEReference(selectCoreEClass, SELECT_CORE__LEFT);
    createEAttribute(selectCoreEClass, SELECT_CORE__OP);
    createEReference(selectCoreEClass, SELECT_CORE__RIGHT);

    selectExpressionEClass = createEClass(SELECT_EXPRESSION);
    createEAttribute(selectExpressionEClass, SELECT_EXPRESSION__DISTINCT);
    createEAttribute(selectExpressionEClass, SELECT_EXPRESSION__ALL);
    createEAttribute(selectExpressionEClass, SELECT_EXPRESSION__ALL_COLUMNS);
    createEReference(selectExpressionEClass, SELECT_EXPRESSION__SELECT_LIST);
    createEReference(selectExpressionEClass, SELECT_EXPRESSION__SOURCE);
    createEReference(selectExpressionEClass, SELECT_EXPRESSION__WHERE);
    createEReference(selectExpressionEClass, SELECT_EXPRESSION__GROUP_BY);
    createEReference(selectExpressionEClass, SELECT_EXPRESSION__HAVING);

    singleSourceTableEClass = createEClass(SINGLE_SOURCE_TABLE);
    createEReference(singleSourceTableEClass, SINGLE_SOURCE_TABLE__TABLE_REFERENCE);

    singleSourceSelectStatementEClass = createEClass(SINGLE_SOURCE_SELECT_STATEMENT);
    createEReference(singleSourceSelectStatementEClass, SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT);

    resultColumnEClass = createEClass(RESULT_COLUMN);
    createEReference(resultColumnEClass, RESULT_COLUMN__EXPRESSION);

    numericLiteralEClass = createEClass(NUMERIC_LITERAL);
    createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__NUMBER);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__LITERAL);

    nullLiteralEClass = createEClass(NULL_LITERAL);
    createEAttribute(nullLiteralEClass, NULL_LITERAL__LITERAL);

    currentTimeLiteralEClass = createEClass(CURRENT_TIME_LITERAL);
    createEAttribute(currentTimeLiteralEClass, CURRENT_TIME_LITERAL__LITERAL);

    currentDateLiteralEClass = createEClass(CURRENT_DATE_LITERAL);
    createEAttribute(currentDateLiteralEClass, CURRENT_DATE_LITERAL__LITERAL);

    currentTimeStampLiteralEClass = createEClass(CURRENT_TIME_STAMP_LITERAL);
    createEAttribute(currentTimeStampLiteralEClass, CURRENT_TIME_STAMP_LITERAL__LITERAL);

    createTableStatementEClass = createEClass(CREATE_TABLE_STATEMENT);
    createEAttribute(createTableStatementEClass, CREATE_TABLE_STATEMENT__TEMPORARY);
    createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__COLUMN_DEFS);
    createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__CONSTRAINTS);

    createViewStatementEClass = createEClass(CREATE_VIEW_STATEMENT);
    createEAttribute(createViewStatementEClass, CREATE_VIEW_STATEMENT__TEMPORARY);
    createEReference(createViewStatementEClass, CREATE_VIEW_STATEMENT__SELECT_STATEMENT);

    alterTableRenameStatementEClass = createEClass(ALTER_TABLE_RENAME_STATEMENT);
    createEReference(alterTableRenameStatementEClass, ALTER_TABLE_RENAME_STATEMENT__TABLE);

    columnDefEClass = createEClass(COLUMN_DEF);
    createEAttribute(columnDefEClass, COLUMN_DEF__TYPE);
    createEReference(columnDefEClass, COLUMN_DEF__CONSTRAINTS);

    primaryKeyColumnConstraintEClass = createEClass(PRIMARY_KEY_COLUMN_CONSTRAINT);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__ASC);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__DESC);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT);

    notNullConstraintEClass = createEClass(NOT_NULL_CONSTRAINT);
    createEReference(notNullConstraintEClass, NOT_NULL_CONSTRAINT__CONFLICT_CLAUSE);

    uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);
    createEReference(uniqueConstraintEClass, UNIQUE_CONSTRAINT__CONFLICT_CLAUSE);

    defaultConstraintEClass = createEClass(DEFAULT_CONSTRAINT);
    createEReference(defaultConstraintEClass, DEFAULT_CONSTRAINT__DEFAULT_VALUE);

    checkConstraintEClass = createEClass(CHECK_CONSTRAINT);
    createEReference(checkConstraintEClass, CHECK_CONSTRAINT__EXPRESSION);

    literalDefaultValueEClass = createEClass(LITERAL_DEFAULT_VALUE);
    createEReference(literalDefaultValueEClass, LITERAL_DEFAULT_VALUE__LITERAL);

    expressionDefaultValueEClass = createEClass(EXPRESSION_DEFAULT_VALUE);
    createEReference(expressionDefaultValueEClass, EXPRESSION_DEFAULT_VALUE__EXPRESSION);

    // Create enums
    compoundOperatorEEnum = createEEnum(COMPOUND_OPERATOR);
    sqliteDataTypeEEnum = createEEnum(SQLITE_DATA_TYPE);
    columnTypeEEnum = createEEnum(COLUMN_TYPE);
    conflictResolutionEEnum = createEEnum(CONFLICT_RESOLUTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    selectStatementEClass.getESuperTypes().add(this.getDMLStatement());
    selectSourceEClass.getESuperTypes().add(this.getSingleSource());
    singleSourceJoinEClass.getESuperTypes().add(this.getSingleSource());
    tableDefinitionEClass.getESuperTypes().add(this.getDDLStatement());
    createTriggerStatementEClass.getESuperTypes().add(this.getDDLStatement());
    alterTableAddColumnStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropTableStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropTriggerStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropViewStatementEClass.getESuperTypes().add(this.getDDLStatement());
    createIndexStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropIndexStatementEClass.getESuperTypes().add(this.getDDLStatement());
    uniqueTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
    primaryConstraintEClass.getESuperTypes().add(this.getTableConstraint());
    checkTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
    deleteStatementEClass.getESuperTypes().add(this.getDMLStatement());
    insertStatementEClass.getESuperTypes().add(this.getDMLStatement());
    updateStatementEClass.getESuperTypes().add(this.getDMLStatement());
    actionStatementEClass.getESuperTypes().add(this.getConfigurationStatement());
    functionEClass.getESuperTypes().add(this.getConfigurationStatement());
    functionEClass.getESuperTypes().add(this.getExpression());
    contentUriParamSegmentEClass.getESuperTypes().add(this.getContentUriSegment());
    exprConcatEClass.getESuperTypes().add(this.getExpression());
    exprMultEClass.getESuperTypes().add(this.getExpression());
    exprAddEClass.getESuperTypes().add(this.getExpression());
    exprBitEClass.getESuperTypes().add(this.getExpression());
    exprRelateEClass.getESuperTypes().add(this.getExpression());
    exprEqualEClass.getESuperTypes().add(this.getExpression());
    exprAndEClass.getESuperTypes().add(this.getExpression());
    exprOrEClass.getESuperTypes().add(this.getExpression());
    nullCheckExpressionEClass.getESuperTypes().add(this.getExpression());
    isNullEClass.getESuperTypes().add(this.getExpression());
    notNullEClass.getESuperTypes().add(this.getExpression());
    newColumnEClass.getESuperTypes().add(this.getExpression());
    oldColumnEClass.getESuperTypes().add(this.getExpression());
    columnSourceRefEClass.getESuperTypes().add(this.getExpression());
    literalEClass.getESuperTypes().add(this.getExpression());
    nestedExpressionEClass.getESuperTypes().add(this.getExpression());
    selectStatementExpressionEClass.getESuperTypes().add(this.getExpression());
    caseExpressionEClass.getESuperTypes().add(this.getExpression());
    castExpressionEClass.getESuperTypes().add(this.getExpression());
    functionArgumentEClass.getESuperTypes().add(this.getExpression());
    selectCoreEClass.getESuperTypes().add(this.getSelectCoreExpression());
    selectExpressionEClass.getESuperTypes().add(this.getSelectCoreExpression());
    singleSourceTableEClass.getESuperTypes().add(this.getSelectSource());
    singleSourceSelectStatementEClass.getESuperTypes().add(this.getSelectSource());
    resultColumnEClass.getESuperTypes().add(this.getColumnSource());
    numericLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    stringLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    nullLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentTimeLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentDateLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentTimeStampLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    createTableStatementEClass.getESuperTypes().add(this.getTableDefinition());
    createViewStatementEClass.getESuperTypes().add(this.getTableDefinition());
    alterTableRenameStatementEClass.getESuperTypes().add(this.getTableDefinition());
    columnDefEClass.getESuperTypes().add(this.getColumnSource());
    primaryKeyColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    notNullConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    uniqueConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    defaultConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    checkConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    literalDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());
    expressionDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Database(), this.getDatabaseBlock(), null, "database", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseBlockEClass, DatabaseBlock.class, "DatabaseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseBlock_Config(), this.getConfigBlock(), null, "config", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseBlock_Init(), this.getInitBlock(), null, "init", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseBlock_Migrations(), this.getMigrationBlock(), null, "migrations", null, 0, -1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configBlockEClass, ConfigBlock.class, "ConfigBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigBlock_Statements(), this.getConfigurationStatement(), null, "statements", null, 0, -1, ConfigBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initBlockEClass, InitBlock.class, "InitBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitBlock_Statements(), this.getDDLStatement(), null, "statements", null, 0, -1, InitBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationStatementEClass, ConfigurationStatement.class, "ConfigurationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigurationStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigurationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgEClass, FunctionArg.class, "FunctionArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionArg_Type(), this.getColumnType(), "type", null, 0, 1, FunctionArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionArg_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentUriEClass, ContentUri.class, "ContentUri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContentUri_Type(), ecorePackage.getEString(), "type", null, 0, 1, ContentUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContentUri_Segments(), this.getContentUriSegment(), null, "segments", null, 0, -1, ContentUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentUriSegmentEClass, ContentUriSegment.class, "ContentUriSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContentUriSegment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContentUriSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migrationBlockEClass, MigrationBlock.class, "MigrationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigrationBlock_Statements(), this.getDDLStatement(), null, "statements", null, 0, -1, MigrationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_WhenExpression(), this.getExpression(), null, "whenExpression", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_ThenExpression(), this.getExpression(), null, "thenExpression", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementEClass, SelectStatement.class, "SelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectStatement_Core(), this.getSelectCoreExpression(), null, "core", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_Orderby(), this.getOrderingTermList(), null, "orderby", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_Limit(), this.getExpression(), null, "limit", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_LimitOffset(), this.getExpression(), null, "limitOffset", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderingTermListEClass, OrderingTermList.class, "OrderingTermList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderingTermList_OrderingTerms(), this.getOrderingTerm(), null, "orderingTerms", null, 0, -1, OrderingTermList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectCoreExpressionEClass, SelectCoreExpression.class, "SelectCoreExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectListEClass, SelectList.class, "SelectList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectList_ResultColumns(), this.getColumnSource(), null, "resultColumns", null, 0, -1, SelectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereExpressionsEClass, WhereExpressions.class, "WhereExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhereExpressions_Expression(), this.getExpression(), null, "expression", null, 0, 1, WhereExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupByExpressionsEClass, GroupByExpressions.class, "GroupByExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupByExpressions_GroupByExpressions(), this.getExpression(), null, "groupByExpressions", null, 0, -1, GroupByExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(havingExpressionsEClass, HavingExpressions.class, "HavingExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHavingExpressions_Expression(), this.getExpression(), null, "expression", null, 0, 1, HavingExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderingTermEClass, OrderingTerm.class, "OrderingTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderingTerm_Expression(), this.getExpression(), null, "expression", null, 0, 1, OrderingTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrderingTerm_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, OrderingTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrderingTerm_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, OrderingTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinSourceEClass, JoinSource.class, "JoinSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoinSource_Source(), this.getSingleSource(), null, "source", null, 0, 1, JoinSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinSource_JoinStatements(), this.getJoinStatement(), null, "joinStatements", null, 0, -1, JoinSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceEClass, SingleSource.class, "SingleSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectSourceEClass, SelectSource.class, "SelectSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, SelectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceJoinEClass, SingleSourceJoin.class, "SingleSourceJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceJoin_JoinSource(), this.getJoinSource(), null, "joinSource", null, 0, 1, SingleSourceJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinStatementEClass, JoinStatement.class, "JoinStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinStatement_Natural(), ecorePackage.getEBoolean(), "natural", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Left(), ecorePackage.getEBoolean(), "left", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Outer(), ecorePackage.getEBoolean(), "outer", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Inner(), ecorePackage.getEBoolean(), "inner", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Cross(), ecorePackage.getEBoolean(), "cross", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_SingleSource(), this.getSingleSource(), null, "singleSource", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnSourceEClass, ColumnSource.class, "ColumnSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ddlStatementEClass, DDLStatement.class, "DDLStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableDefinitionEClass, TableDefinition.class, "TableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createTriggerStatementEClass, CreateTriggerStatement.class, "CreateTriggerStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateTriggerStatement_Temporary(), ecorePackage.getEBoolean(), "temporary", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateTriggerStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateTriggerStatement_When(), ecorePackage.getEString(), "when", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateTriggerStatement_EventType(), ecorePackage.getEString(), "eventType", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateTriggerStatement_UpdateColumnNames(), ecorePackage.getEString(), "updateColumnNames", null, 0, -1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTriggerStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateTriggerStatement_ForEachRow(), ecorePackage.getEString(), "forEachRow", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTriggerStatement_WhenExpression(), this.getExpression(), null, "whenExpression", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTriggerStatement_Statements(), this.getDMLStatement(), null, "statements", null, 0, -1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableAddColumnStatementEClass, AlterTableAddColumnStatement.class, "AlterTableAddColumnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterTableAddColumnStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, AlterTableAddColumnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterTableAddColumnStatement_ColumnDef(), this.getColumnSource(), null, "columnDef", null, 0, 1, AlterTableAddColumnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropTableStatementEClass, DropTableStatement.class, "DropTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropTableStatement_IfExists(), ecorePackage.getEBoolean(), "ifExists", null, 0, 1, DropTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDropTableStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, DropTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropTriggerStatementEClass, DropTriggerStatement.class, "DropTriggerStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropTriggerStatement_IfExists(), ecorePackage.getEBoolean(), "ifExists", null, 0, 1, DropTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDropTriggerStatement_Trigger(), this.getCreateTriggerStatement(), null, "trigger", null, 0, 1, DropTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropViewStatementEClass, DropViewStatement.class, "DropViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropViewStatement_IfExists(), ecorePackage.getEBoolean(), "ifExists", null, 0, 1, DropViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDropViewStatement_View(), this.getCreateViewStatement(), null, "view", null, 0, 1, DropViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createIndexStatementEClass, CreateIndexStatement.class, "CreateIndexStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateIndexStatement_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateIndexStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateIndexStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateIndexStatement_Columns(), this.getIndexedColumn(), null, "columns", null, 0, -1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropIndexStatementEClass, DropIndexStatement.class, "DropIndexStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropIndexStatement_IfExists(), ecorePackage.getEBoolean(), "ifExists", null, 0, 1, DropIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDropIndexStatement_Index(), this.getCreateIndexStatement(), null, "index", null, 0, 1, DropIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnConstraintEClass, ColumnConstraint.class, "ColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uniqueTableConstraintEClass, UniqueTableConstraint.class, "UniqueTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniqueTableConstraint_Columns(), this.getIndexedColumn(), null, "columns", null, 0, -1, UniqueTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUniqueTableConstraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, UniqueTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryConstraintEClass, PrimaryConstraint.class, "PrimaryConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryConstraint_Columns(), this.getIndexedColumn(), null, "columns", null, 0, -1, PrimaryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryConstraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, PrimaryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkTableConstraintEClass, CheckTableConstraint.class, "CheckTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheckTableConstraint_Expression(), this.getExpression(), null, "expression", null, 0, 1, CheckTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexedColumnEClass, IndexedColumn.class, "IndexedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexedColumn_ColumnReference(), this.getColumnDef(), null, "columnReference", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_CollationName(), ecorePackage.getEString(), "collationName", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conflictClauseEClass, ConflictClause.class, "ConflictClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConflictClause_Resolution(), this.getConflictResolution(), "resolution", null, 0, 1, ConflictClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dmlStatementEClass, DMLStatement.class, "DMLStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deleteStatementEClass, DeleteStatement.class, "DeleteStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeleteStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, DeleteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, DeleteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertStatementEClass, InsertStatement.class, "InsertStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInsertStatement_ConflictResolution(), this.getConflictResolution(), "conflictResolution", null, 0, 1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertStatement_ColumnNames(), this.getColumnDef(), null, "columnNames", null, 0, -1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertStatement_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateStatementEClass, UpdateStatement.class, "UpdateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdateStatement_ConflictResolution(), this.getConflictResolution(), "conflictResolution", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateStatement_UpdateColumnExpressions(), this.getUpdateColumnExpression(), null, "updateColumnExpressions", null, 0, -1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateStatement_WhereExpression(), this.getExpression(), null, "whereExpression", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateColumnExpressionEClass, UpdateColumnExpression.class, "UpdateColumnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateColumnExpression_ColumnName(), this.getColumnDef(), null, "columnName", null, 0, 1, UpdateColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateColumnExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, UpdateColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionStatementEClass, ActionStatement.class, "ActionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionStatement_Uri(), this.getContentUri(), null, "uri", null, 0, 1, ActionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_Args(), this.getFunctionArg(), null, "args", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Statements(), this.getDMLStatement(), null, "statements", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentUriParamSegmentEClass, ContentUriParamSegment.class, "ContentUriParamSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContentUriParamSegment_Num(), ecorePackage.getEBoolean(), "num", null, 0, 1, ContentUriParamSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContentUriParamSegment_Text(), ecorePackage.getEBoolean(), "text", null, 0, 1, ContentUriParamSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprConcatEClass, ExprConcat.class, "ExprConcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprConcat_Left(), this.getExpression(), null, "left", null, 0, 1, ExprConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprConcat_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprConcat_Right(), this.getExpression(), null, "right", null, 0, 1, ExprConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprMultEClass, ExprMult.class, "ExprMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprMult_Left(), this.getExpression(), null, "left", null, 0, 1, ExprMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprMult_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprMult_Right(), this.getExpression(), null, "right", null, 0, 1, ExprMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprAddEClass, ExprAdd.class, "ExprAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprAdd_Left(), this.getExpression(), null, "left", null, 0, 1, ExprAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprAdd_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAdd_Right(), this.getExpression(), null, "right", null, 0, 1, ExprAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBitEClass, ExprBit.class, "ExprBit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBit_Left(), this.getExpression(), null, "left", null, 0, 1, ExprBit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprBit_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprBit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprBit_Right(), this.getExpression(), null, "right", null, 0, 1, ExprBit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprRelateEClass, ExprRelate.class, "ExprRelate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprRelate_Left(), this.getExpression(), null, "left", null, 0, 1, ExprRelate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprRelate_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprRelate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprRelate_Right(), this.getExpression(), null, "right", null, 0, 1, ExprRelate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEqualEClass, ExprEqual.class, "ExprEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprEqual_Left(), this.getExpression(), null, "left", null, 0, 1, ExprEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprEqual_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprEqual_Right(), this.getExpression(), null, "right", null, 0, 1, ExprEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprAndEClass, ExprAnd.class, "ExprAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprAnd_Left(), this.getExpression(), null, "left", null, 0, 1, ExprAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprAnd_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAnd_Right(), this.getExpression(), null, "right", null, 0, 1, ExprAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprOrEClass, ExprOr.class, "ExprOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprOr_Left(), this.getExpression(), null, "left", null, 0, 1, ExprOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprOr_Op(), ecorePackage.getEString(), "op", null, 0, 1, ExprOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprOr_Right(), this.getExpression(), null, "right", null, 0, 1, ExprOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullCheckExpressionEClass, NullCheckExpression.class, "NullCheckExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNullCheckExpression_Left(), this.getExpression(), null, "left", null, 0, 1, NullCheckExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNullCheckExpression_Right(), this.getExpression(), null, "right", null, 0, 1, NullCheckExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isNullEClass, IsNull.class, "IsNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notNullEClass, NotNull.class, "NotNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newColumnEClass, NewColumn.class, "NewColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewColumn_Column(), this.getColumnSource(), null, "column", null, 0, 1, NewColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oldColumnEClass, OldColumn.class, "OldColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOldColumn_Column(), this.getColumnSource(), null, "column", null, 0, 1, OldColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnSourceRefEClass, ColumnSourceRef.class, "ColumnSourceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnSourceRef_Source(), this.getSelectSource(), null, "source", null, 0, 1, ColumnSourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnSourceRef_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, ColumnSourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnSourceRef_Column(), this.getColumnSource(), null, "column", null, 0, 1, ColumnSourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_LiteralValue(), this.getLiteralValue(), null, "literalValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nestedExpressionEClass, NestedExpression.class, "NestedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, NestedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementExpressionEClass, SelectStatementExpression.class, "SelectStatementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectStatementExpression_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectStatementExpression_Exists(), ecorePackage.getEBoolean(), "exists", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatementExpression_Select(), this.getSelectStatement(), null, "select", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseExpression_CaseExpression(), this.getExpression(), null, "caseExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseExpression_Cases(), this.getCase(), null, "cases", null, 0, -1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseExpression_ElseExpression(), this.getExpression(), null, "elseExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCastExpression_Type(), this.getSqliteDataType(), "type", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgumentEClass, FunctionArgument.class, "FunctionArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionArgument_Arg(), this.getFunctionArg(), null, "arg", null, 0, 1, FunctionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectCoreEClass, SelectCore.class, "SelectCore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectCore_Left(), this.getSelectCoreExpression(), null, "left", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectCore_Op(), this.getCompoundOperator(), "op", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_Right(), this.getSelectCoreExpression(), null, "right", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectExpressionEClass, SelectExpression.class, "SelectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectExpression_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectExpression_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectExpression_AllColumns(), ecorePackage.getEBoolean(), "allColumns", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectExpression_SelectList(), this.getSelectList(), null, "selectList", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectExpression_Source(), this.getJoinSource(), null, "source", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectExpression_Where(), this.getWhereExpressions(), null, "where", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectExpression_GroupBy(), this.getGroupByExpressions(), null, "groupBy", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectExpression_Having(), this.getHavingExpressions(), null, "having", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceTableEClass, SingleSourceTable.class, "SingleSourceTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceTable_TableReference(), this.getTableDefinition(), null, "tableReference", null, 0, 1, SingleSourceTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceSelectStatementEClass, SingleSourceSelectStatement.class, "SingleSourceSelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceSelectStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, SingleSourceSelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnEClass, ResultColumn.class, "ResultColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResultColumn_Expression(), this.getExpression(), null, "expression", null, 0, 1, ResultColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericLiteral_Number(), ecorePackage.getEBigDecimal(), "number", null, 0, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, NullLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentTimeLiteralEClass, CurrentTimeLiteral.class, "CurrentTimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurrentTimeLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, CurrentTimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentDateLiteralEClass, CurrentDateLiteral.class, "CurrentDateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurrentDateLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, CurrentDateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(currentTimeStampLiteralEClass, CurrentTimeStampLiteral.class, "CurrentTimeStampLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCurrentTimeStampLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, CurrentTimeStampLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createTableStatementEClass, CreateTableStatement.class, "CreateTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateTableStatement_Temporary(), ecorePackage.getEBoolean(), "temporary", null, 0, 1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTableStatement_ColumnDefs(), this.getColumnSource(), null, "columnDefs", null, 0, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTableStatement_Constraints(), this.getTableConstraint(), null, "constraints", null, 0, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createViewStatementEClass, CreateViewStatement.class, "CreateViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateViewStatement_Temporary(), ecorePackage.getEBoolean(), "temporary", null, 0, 1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateViewStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableRenameStatementEClass, AlterTableRenameStatement.class, "AlterTableRenameStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterTableRenameStatement_Table(), this.getTableDefinition(), null, "table", null, 0, 1, AlterTableRenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnDefEClass, ColumnDef.class, "ColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnDef_Type(), this.getColumnType(), "type", null, 0, 1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnDef_Constraints(), this.getColumnConstraint(), null, "constraints", null, 0, -1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryKeyColumnConstraintEClass, PrimaryKeyColumnConstraint.class, "PrimaryKeyColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimaryKeyColumnConstraint_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryKeyColumnConstraint_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryKeyColumnConstraint_Autoincrement(), ecorePackage.getEBoolean(), "autoincrement", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notNullConstraintEClass, NotNullConstraint.class, "NotNullConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotNullConstraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, NotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniqueConstraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, UniqueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultConstraintEClass, DefaultConstraint.class, "DefaultConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultConstraint_DefaultValue(), this.getDefaultValue(), null, "defaultValue", null, 0, 1, DefaultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkConstraintEClass, CheckConstraint.class, "CheckConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheckConstraint_Expression(), this.getExpression(), null, "expression", null, 0, 1, CheckConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalDefaultValueEClass, LiteralDefaultValue.class, "LiteralDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralDefaultValue_Literal(), this.getLiteralValue(), null, "literal", null, 0, 1, LiteralDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionDefaultValueEClass, ExpressionDefaultValue.class, "ExpressionDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionDefaultValue_Expression(), this.getExpression(), null, "expression", null, 0, 1, ExpressionDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(compoundOperatorEEnum, CompoundOperator.class, "CompoundOperator");
    addEEnumLiteral(compoundOperatorEEnum, CompoundOperator.UNIONALL);
    addEEnumLiteral(compoundOperatorEEnum, CompoundOperator.UNION);
    addEEnumLiteral(compoundOperatorEEnum, CompoundOperator.INTERSECT);
    addEEnumLiteral(compoundOperatorEEnum, CompoundOperator.EXCEPT);

    initEEnum(sqliteDataTypeEEnum, SqliteDataType.class, "SqliteDataType");
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.TEXT);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.INTEGER);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.REAL);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.BLOB);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.NONE);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.NUMERIC);

    initEEnum(columnTypeEEnum, ColumnType.class, "ColumnType");
    addEEnumLiteral(columnTypeEEnum, ColumnType.TEXT);
    addEEnumLiteral(columnTypeEEnum, ColumnType.INTEGER);
    addEEnumLiteral(columnTypeEEnum, ColumnType.REAL);
    addEEnumLiteral(columnTypeEEnum, ColumnType.BLOB);
    addEEnumLiteral(columnTypeEEnum, ColumnType.BOOLEAN);

    initEEnum(conflictResolutionEEnum, ConflictResolution.class, "ConflictResolution");
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.ROLLBACK);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.ABORT);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.FAIL);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.IGNORE);
    addEEnumLiteral(conflictResolutionEEnum, ConflictResolution.REPLACE);

    // Create resource
    createResource(eNS_URI);
  }

} //SqliteModelPackageImpl
