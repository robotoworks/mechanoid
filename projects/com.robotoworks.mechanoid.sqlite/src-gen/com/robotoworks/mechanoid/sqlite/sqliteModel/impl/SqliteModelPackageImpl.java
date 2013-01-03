/**
 */
package com.robotoworks.mechanoid.sqlite.sqliteModel.impl;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ActionStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ActiveRecordRegistrationStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableAddColumnClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableRenameClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.AlterTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Case;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CaseExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CastExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CheckTableConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConfigBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConfigurationStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictClause;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ConflictResolution;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentDateLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CurrentTimeStampLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DMLStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DeleteStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAdd;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprAnd;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprBit;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprConcat;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprEqual;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprMult;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprOr;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExprRelate;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Expression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ExpressionDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Function;
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Literal;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralDefaultValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.LiteralValue;
import com.robotoworks.mechanoid.sqlite.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NotNullConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NullLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NumericLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTerm;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryContraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.PrimaryKeyColumnConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnAll;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatementExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceJoin;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceSelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqlExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteDataType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelFactory;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage;
import com.robotoworks.mechanoid.sqlite.sqliteModel.StringLiteral;
import com.robotoworks.mechanoid.sqlite.sqliteModel.TableConstraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UniqueTableContraint;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateStatement;

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
  private EClass configurationStatementEClass = null;

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
  private EClass sqlExpressionEClass = null;

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
  private EClass ddlStatementEClass = null;

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
  private EClass selectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableClauseEClass = null;

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
  private EClass columnConstraintEClass = null;

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
  private EClass tableConstraintEClass = null;

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
  private EClass orderingTermEClass = null;

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
  private EClass joinStatementEClass = null;

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
  private EClass conflictClauseEClass = null;

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
  private EClass actionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activeRecordRegistrationStatementEClass = null;

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
  private EClass columnLiteralEClass = null;

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
  private EClass functionEClass = null;

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
  private EClass createTriggerStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableStatementEClass = null;

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
  private EClass alterTableRenameClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alterTableAddColumnClauseEClass = null;

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
  private EClass defaultConstraintEClass = null;

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
  private EClass uniqueTableContraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryContraintEClass = null;

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
  private EClass singleSourceJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultColumnExpressionEClass = null;

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
  private EEnum columnTypeEEnum = null;

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
   * @see com.robotoworks.mechanoid.sqlite.sqliteModel.SqliteModelPackage#eNS_URI
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
  public EReference getDatabaseBlock_Migrations()
  {
    return (EReference)databaseBlockEClass.getEStructuralFeatures().get(2);
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
  public EClass getSqlExpression()
  {
    return sqlExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlExpression_Root()
  {
    return (EReference)sqlExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlExpression_Isnull()
  {
    return (EAttribute)sqlExpressionEClass.getEStructuralFeatures().get(1);
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
  public EClass getDDLStatement()
  {
    return ddlStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDDLStatement_Name()
  {
    return (EAttribute)ddlStatementEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getDeleteStatement_TableName()
  {
    return (EAttribute)deleteStatementEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getInsertStatement_TableName()
  {
    return (EAttribute)insertStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertStatement_ColumnNames()
  {
    return (EAttribute)insertStatementEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getUpdateStatement_TableName()
  {
    return (EAttribute)updateStatementEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getUpdateColumnExpression_ColumnName()
  {
    return (EAttribute)updateColumnExpressionEClass.getEStructuralFeatures().get(0);
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
  public EClass getSelectStatement()
  {
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_CoreStatements()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_OrderingTerms()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableClause()
  {
    return alterTableClauseEClass;
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
  public EAttribute getColumnDef_Name()
  {
    return (EAttribute)columnDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnDef_Type()
  {
    return (EAttribute)columnDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnDef_Constraints()
  {
    return (EReference)columnDefEClass.getEStructuralFeatures().get(2);
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
  public EClass getDefaultValue()
  {
    return defaultValueEClass;
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
  public EClass getIndexedColumn()
  {
    return indexedColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexedColumn_Name()
  {
    return (EReference)indexedColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_Asc()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexedColumn_Desc()
  {
    return (EAttribute)indexedColumnEClass.getEStructuralFeatures().get(2);
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
  public EClass getSelectCore()
  {
    return selectCoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectCore_Distinct()
  {
    return (EAttribute)selectCoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectCore_All()
  {
    return (EAttribute)selectCoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_ResultColumns()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_Source()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_WhereExpression()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_GroupByExpressions()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectCore_HavingExpression()
  {
    return (EReference)selectCoreEClass.getEStructuralFeatures().get(6);
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
  public EClass getResultColumn()
  {
    return resultColumnEClass;
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
  public EClass getLiteralValue()
  {
    return literalValueEClass;
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
  public EAttribute getActionStatement_Path()
  {
    return (EAttribute)actionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActiveRecordRegistrationStatement()
  {
    return activeRecordRegistrationStatementEClass;
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
  public EClass getColumnLiteral()
  {
    return columnLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnLiteral_Name()
  {
    return (EAttribute)columnLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnLiteral_Isnull()
  {
    return (EAttribute)columnLiteralEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getLiteral_Isnull()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getSelectStatementExpression_Isnull()
  {
    return (EAttribute)selectStatementExpressionEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getCaseExpression_Isnull()
  {
    return (EAttribute)caseExpressionEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_All()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Arguments()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Arugments()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Isnull()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getCastExpression_Isnull()
  {
    return (EAttribute)castExpressionEClass.getEStructuralFeatures().get(2);
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
  public EReference getCreateTableStatement_ColumnDefs()
  {
    return (EReference)createTableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTableStatement_Constraints()
  {
    return (EReference)createTableStatementEClass.getEStructuralFeatures().get(1);
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
  public EReference getCreateViewStatement_SelectStatement()
  {
    return (EReference)createViewStatementEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getCreateTriggerStatement_UpdateColumnNames()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateTriggerStatement_TableName()
  {
    return (EAttribute)createTriggerStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTriggerStatement_WhenExpression()
  {
    return (EReference)createTriggerStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateTriggerStatement_Statements()
  {
    return (EReference)createTriggerStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableStatement()
  {
    return alterTableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableStatement_Clause()
  {
    return (EReference)alterTableStatementEClass.getEStructuralFeatures().get(0);
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
  public EClass getDropTriggerStatement()
  {
    return dropTriggerStatementEClass;
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
  public EClass getAlterTableRenameClause()
  {
    return alterTableRenameClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterTableRenameClause_Name()
  {
    return (EAttribute)alterTableRenameClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterTableAddColumnClause()
  {
    return alterTableAddColumnClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterTableAddColumnClause_ColumnDef()
  {
    return (EReference)alterTableAddColumnClauseEClass.getEStructuralFeatures().get(0);
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
  public EClass getUniqueTableContraint()
  {
    return uniqueTableContraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueTableContraint_Columns()
  {
    return (EReference)uniqueTableContraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueTableContraint_ConflictClause()
  {
    return (EReference)uniqueTableContraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryContraint()
  {
    return primaryContraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryContraint_Columns()
  {
    return (EReference)primaryContraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryContraint_ConflictClause()
  {
    return (EReference)primaryContraintEClass.getEStructuralFeatures().get(1);
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
  public EClass getSingleSourceTable()
  {
    return singleSourceTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleSourceTable_Table()
  {
    return (EAttribute)singleSourceTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleSourceTable_Alias()
  {
    return (EAttribute)singleSourceTableEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getSingleSourceSelectStatement_Alias()
  {
    return (EAttribute)singleSourceSelectStatementEClass.getEStructuralFeatures().get(1);
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
  public EClass getResultColumnAll()
  {
    return resultColumnAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultColumnAll_Table()
  {
    return (EAttribute)resultColumnAllEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultColumnExpression()
  {
    return resultColumnExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResultColumnExpression_Expression()
  {
    return (EReference)resultColumnExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultColumnExpression_Alias()
  {
    return (EAttribute)resultColumnExpressionEClass.getEStructuralFeatures().get(1);
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
  public EEnum getColumnType()
  {
    return columnTypeEEnum;
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
    createEReference(databaseBlockEClass, DATABASE_BLOCK__MIGRATIONS);

    configBlockEClass = createEClass(CONFIG_BLOCK);
    createEReference(configBlockEClass, CONFIG_BLOCK__STATEMENTS);

    configurationStatementEClass = createEClass(CONFIGURATION_STATEMENT);
    createEAttribute(configurationStatementEClass, CONFIGURATION_STATEMENT__NAME);

    migrationBlockEClass = createEClass(MIGRATION_BLOCK);
    createEReference(migrationBlockEClass, MIGRATION_BLOCK__STATEMENTS);

    sqlExpressionEClass = createEClass(SQL_EXPRESSION);
    createEReference(sqlExpressionEClass, SQL_EXPRESSION__ROOT);
    createEAttribute(sqlExpressionEClass, SQL_EXPRESSION__ISNULL);

    expressionEClass = createEClass(EXPRESSION);

    caseEClass = createEClass(CASE);
    createEReference(caseEClass, CASE__WHEN_EXPRESSION);
    createEReference(caseEClass, CASE__THEN_EXPRESSION);

    ddlStatementEClass = createEClass(DDL_STATEMENT);
    createEAttribute(ddlStatementEClass, DDL_STATEMENT__NAME);

    dmlStatementEClass = createEClass(DML_STATEMENT);

    deleteStatementEClass = createEClass(DELETE_STATEMENT);
    createEAttribute(deleteStatementEClass, DELETE_STATEMENT__TABLE_NAME);
    createEReference(deleteStatementEClass, DELETE_STATEMENT__EXPRESSION);

    insertStatementEClass = createEClass(INSERT_STATEMENT);
    createEAttribute(insertStatementEClass, INSERT_STATEMENT__CONFLICT_RESOLUTION);
    createEAttribute(insertStatementEClass, INSERT_STATEMENT__TABLE_NAME);
    createEAttribute(insertStatementEClass, INSERT_STATEMENT__COLUMN_NAMES);
    createEReference(insertStatementEClass, INSERT_STATEMENT__EXPRESSIONS);
    createEReference(insertStatementEClass, INSERT_STATEMENT__SELECT_STATEMENT);

    updateStatementEClass = createEClass(UPDATE_STATEMENT);
    createEAttribute(updateStatementEClass, UPDATE_STATEMENT__CONFLICT_RESOLUTION);
    createEAttribute(updateStatementEClass, UPDATE_STATEMENT__TABLE_NAME);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__UPDATE_COLUMN_EXPRESSIONS);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__WHERE_EXPRESSION);

    updateColumnExpressionEClass = createEClass(UPDATE_COLUMN_EXPRESSION);
    createEAttribute(updateColumnExpressionEClass, UPDATE_COLUMN_EXPRESSION__COLUMN_NAME);
    createEReference(updateColumnExpressionEClass, UPDATE_COLUMN_EXPRESSION__EXPRESSION);

    selectStatementEClass = createEClass(SELECT_STATEMENT);
    createEReference(selectStatementEClass, SELECT_STATEMENT__CORE_STATEMENTS);
    createEReference(selectStatementEClass, SELECT_STATEMENT__ORDERING_TERMS);

    alterTableClauseEClass = createEClass(ALTER_TABLE_CLAUSE);

    columnDefEClass = createEClass(COLUMN_DEF);
    createEAttribute(columnDefEClass, COLUMN_DEF__NAME);
    createEAttribute(columnDefEClass, COLUMN_DEF__TYPE);
    createEReference(columnDefEClass, COLUMN_DEF__CONSTRAINTS);

    columnConstraintEClass = createEClass(COLUMN_CONSTRAINT);

    defaultValueEClass = createEClass(DEFAULT_VALUE);

    tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
    createEAttribute(tableConstraintEClass, TABLE_CONSTRAINT__NAME);

    indexedColumnEClass = createEClass(INDEXED_COLUMN);
    createEReference(indexedColumnEClass, INDEXED_COLUMN__NAME);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__ASC);
    createEAttribute(indexedColumnEClass, INDEXED_COLUMN__DESC);

    orderingTermEClass = createEClass(ORDERING_TERM);
    createEReference(orderingTermEClass, ORDERING_TERM__EXPRESSION);
    createEAttribute(orderingTermEClass, ORDERING_TERM__ASC);
    createEAttribute(orderingTermEClass, ORDERING_TERM__DESC);

    selectCoreEClass = createEClass(SELECT_CORE);
    createEAttribute(selectCoreEClass, SELECT_CORE__DISTINCT);
    createEAttribute(selectCoreEClass, SELECT_CORE__ALL);
    createEReference(selectCoreEClass, SELECT_CORE__RESULT_COLUMNS);
    createEReference(selectCoreEClass, SELECT_CORE__SOURCE);
    createEReference(selectCoreEClass, SELECT_CORE__WHERE_EXPRESSION);
    createEReference(selectCoreEClass, SELECT_CORE__GROUP_BY_EXPRESSIONS);
    createEReference(selectCoreEClass, SELECT_CORE__HAVING_EXPRESSION);

    joinSourceEClass = createEClass(JOIN_SOURCE);
    createEReference(joinSourceEClass, JOIN_SOURCE__SOURCE);
    createEReference(joinSourceEClass, JOIN_SOURCE__JOIN_STATEMENTS);

    singleSourceEClass = createEClass(SINGLE_SOURCE);

    joinStatementEClass = createEClass(JOIN_STATEMENT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__NATURAL);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__LEFT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__OUTER);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__INNER);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__CROSS);
    createEReference(joinStatementEClass, JOIN_STATEMENT__SINGLE_SOURCE);
    createEReference(joinStatementEClass, JOIN_STATEMENT__EXPRESSION);

    resultColumnEClass = createEClass(RESULT_COLUMN);

    conflictClauseEClass = createEClass(CONFLICT_CLAUSE);
    createEAttribute(conflictClauseEClass, CONFLICT_CLAUSE__RESOLUTION);

    literalValueEClass = createEClass(LITERAL_VALUE);

    actionStatementEClass = createEClass(ACTION_STATEMENT);
    createEAttribute(actionStatementEClass, ACTION_STATEMENT__PATH);

    activeRecordRegistrationStatementEClass = createEClass(ACTIVE_RECORD_REGISTRATION_STATEMENT);

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

    columnLiteralEClass = createEClass(COLUMN_LITERAL);
    createEAttribute(columnLiteralEClass, COLUMN_LITERAL__NAME);
    createEAttribute(columnLiteralEClass, COLUMN_LITERAL__ISNULL);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__LITERAL_VALUE);
    createEAttribute(literalEClass, LITERAL__ISNULL);

    selectStatementExpressionEClass = createEClass(SELECT_STATEMENT_EXPRESSION);
    createEAttribute(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__NOT);
    createEAttribute(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__EXISTS);
    createEReference(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__SELECT);
    createEAttribute(selectStatementExpressionEClass, SELECT_STATEMENT_EXPRESSION__ISNULL);

    caseExpressionEClass = createEClass(CASE_EXPRESSION);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__CASE_EXPRESSION);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__CASES);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__ELSE_EXPRESSION);
    createEAttribute(caseExpressionEClass, CASE_EXPRESSION__ISNULL);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEAttribute(functionEClass, FUNCTION__ALL);
    createEReference(functionEClass, FUNCTION__ARGUMENTS);
    createEReference(functionEClass, FUNCTION__ARUGMENTS);
    createEAttribute(functionEClass, FUNCTION__ISNULL);

    castExpressionEClass = createEClass(CAST_EXPRESSION);
    createEReference(castExpressionEClass, CAST_EXPRESSION__EXPRESSION);
    createEAttribute(castExpressionEClass, CAST_EXPRESSION__TYPE);
    createEAttribute(castExpressionEClass, CAST_EXPRESSION__ISNULL);

    createTableStatementEClass = createEClass(CREATE_TABLE_STATEMENT);
    createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__COLUMN_DEFS);
    createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__CONSTRAINTS);

    createViewStatementEClass = createEClass(CREATE_VIEW_STATEMENT);
    createEReference(createViewStatementEClass, CREATE_VIEW_STATEMENT__SELECT_STATEMENT);

    createTriggerStatementEClass = createEClass(CREATE_TRIGGER_STATEMENT);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__UPDATE_COLUMN_NAMES);
    createEAttribute(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__TABLE_NAME);
    createEReference(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__WHEN_EXPRESSION);
    createEReference(createTriggerStatementEClass, CREATE_TRIGGER_STATEMENT__STATEMENTS);

    alterTableStatementEClass = createEClass(ALTER_TABLE_STATEMENT);
    createEReference(alterTableStatementEClass, ALTER_TABLE_STATEMENT__CLAUSE);

    dropTableStatementEClass = createEClass(DROP_TABLE_STATEMENT);

    dropTriggerStatementEClass = createEClass(DROP_TRIGGER_STATEMENT);

    dropViewStatementEClass = createEClass(DROP_VIEW_STATEMENT);

    alterTableRenameClauseEClass = createEClass(ALTER_TABLE_RENAME_CLAUSE);
    createEAttribute(alterTableRenameClauseEClass, ALTER_TABLE_RENAME_CLAUSE__NAME);

    alterTableAddColumnClauseEClass = createEClass(ALTER_TABLE_ADD_COLUMN_CLAUSE);
    createEReference(alterTableAddColumnClauseEClass, ALTER_TABLE_ADD_COLUMN_CLAUSE__COLUMN_DEF);

    primaryKeyColumnConstraintEClass = createEClass(PRIMARY_KEY_COLUMN_CONSTRAINT);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__ASC);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__DESC);
    createEAttribute(primaryKeyColumnConstraintEClass, PRIMARY_KEY_COLUMN_CONSTRAINT__AUTOINCREMENT);

    notNullConstraintEClass = createEClass(NOT_NULL_CONSTRAINT);
    createEReference(notNullConstraintEClass, NOT_NULL_CONSTRAINT__CONFLICT_CLAUSE);

    defaultConstraintEClass = createEClass(DEFAULT_CONSTRAINT);
    createEReference(defaultConstraintEClass, DEFAULT_CONSTRAINT__DEFAULT_VALUE);

    literalDefaultValueEClass = createEClass(LITERAL_DEFAULT_VALUE);
    createEReference(literalDefaultValueEClass, LITERAL_DEFAULT_VALUE__LITERAL);

    expressionDefaultValueEClass = createEClass(EXPRESSION_DEFAULT_VALUE);
    createEReference(expressionDefaultValueEClass, EXPRESSION_DEFAULT_VALUE__EXPRESSION);

    uniqueTableContraintEClass = createEClass(UNIQUE_TABLE_CONTRAINT);
    createEReference(uniqueTableContraintEClass, UNIQUE_TABLE_CONTRAINT__COLUMNS);
    createEReference(uniqueTableContraintEClass, UNIQUE_TABLE_CONTRAINT__CONFLICT_CLAUSE);

    primaryContraintEClass = createEClass(PRIMARY_CONTRAINT);
    createEReference(primaryContraintEClass, PRIMARY_CONTRAINT__COLUMNS);
    createEReference(primaryContraintEClass, PRIMARY_CONTRAINT__CONFLICT_CLAUSE);

    checkTableConstraintEClass = createEClass(CHECK_TABLE_CONSTRAINT);
    createEReference(checkTableConstraintEClass, CHECK_TABLE_CONSTRAINT__EXPRESSION);

    singleSourceTableEClass = createEClass(SINGLE_SOURCE_TABLE);
    createEAttribute(singleSourceTableEClass, SINGLE_SOURCE_TABLE__TABLE);
    createEAttribute(singleSourceTableEClass, SINGLE_SOURCE_TABLE__ALIAS);

    singleSourceSelectStatementEClass = createEClass(SINGLE_SOURCE_SELECT_STATEMENT);
    createEReference(singleSourceSelectStatementEClass, SINGLE_SOURCE_SELECT_STATEMENT__SELECT_STATEMENT);
    createEAttribute(singleSourceSelectStatementEClass, SINGLE_SOURCE_SELECT_STATEMENT__ALIAS);

    singleSourceJoinEClass = createEClass(SINGLE_SOURCE_JOIN);
    createEReference(singleSourceJoinEClass, SINGLE_SOURCE_JOIN__JOIN_SOURCE);

    resultColumnAllEClass = createEClass(RESULT_COLUMN_ALL);
    createEAttribute(resultColumnAllEClass, RESULT_COLUMN_ALL__TABLE);

    resultColumnExpressionEClass = createEClass(RESULT_COLUMN_EXPRESSION);
    createEReference(resultColumnExpressionEClass, RESULT_COLUMN_EXPRESSION__EXPRESSION);
    createEAttribute(resultColumnExpressionEClass, RESULT_COLUMN_EXPRESSION__ALIAS);

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

    // Create enums
    columnTypeEEnum = createEEnum(COLUMN_TYPE);
    sqliteDataTypeEEnum = createEEnum(SQLITE_DATA_TYPE);
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
    sqlExpressionEClass.getESuperTypes().add(this.getExpression());
    deleteStatementEClass.getESuperTypes().add(this.getDMLStatement());
    insertStatementEClass.getESuperTypes().add(this.getDMLStatement());
    updateStatementEClass.getESuperTypes().add(this.getDMLStatement());
    selectStatementEClass.getESuperTypes().add(this.getDMLStatement());
    actionStatementEClass.getESuperTypes().add(this.getConfigurationStatement());
    activeRecordRegistrationStatementEClass.getESuperTypes().add(this.getConfigurationStatement());
    exprConcatEClass.getESuperTypes().add(this.getExpression());
    exprMultEClass.getESuperTypes().add(this.getExpression());
    exprAddEClass.getESuperTypes().add(this.getExpression());
    exprBitEClass.getESuperTypes().add(this.getExpression());
    exprRelateEClass.getESuperTypes().add(this.getExpression());
    exprEqualEClass.getESuperTypes().add(this.getExpression());
    exprAndEClass.getESuperTypes().add(this.getExpression());
    exprOrEClass.getESuperTypes().add(this.getExpression());
    columnLiteralEClass.getESuperTypes().add(this.getExpression());
    literalEClass.getESuperTypes().add(this.getExpression());
    selectStatementExpressionEClass.getESuperTypes().add(this.getExpression());
    caseExpressionEClass.getESuperTypes().add(this.getExpression());
    functionEClass.getESuperTypes().add(this.getExpression());
    castExpressionEClass.getESuperTypes().add(this.getExpression());
    createTableStatementEClass.getESuperTypes().add(this.getDDLStatement());
    createViewStatementEClass.getESuperTypes().add(this.getDDLStatement());
    createTriggerStatementEClass.getESuperTypes().add(this.getDDLStatement());
    alterTableStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropTableStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropTriggerStatementEClass.getESuperTypes().add(this.getDDLStatement());
    dropViewStatementEClass.getESuperTypes().add(this.getDDLStatement());
    alterTableRenameClauseEClass.getESuperTypes().add(this.getAlterTableClause());
    alterTableAddColumnClauseEClass.getESuperTypes().add(this.getAlterTableClause());
    primaryKeyColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    notNullConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    defaultConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
    literalDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());
    expressionDefaultValueEClass.getESuperTypes().add(this.getDefaultValue());
    uniqueTableContraintEClass.getESuperTypes().add(this.getTableConstraint());
    primaryContraintEClass.getESuperTypes().add(this.getTableConstraint());
    checkTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
    singleSourceTableEClass.getESuperTypes().add(this.getSingleSource());
    singleSourceSelectStatementEClass.getESuperTypes().add(this.getSingleSource());
    singleSourceJoinEClass.getESuperTypes().add(this.getSingleSource());
    resultColumnAllEClass.getESuperTypes().add(this.getResultColumn());
    resultColumnExpressionEClass.getESuperTypes().add(this.getResultColumn());
    numericLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    stringLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    nullLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentTimeLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentDateLiteralEClass.getESuperTypes().add(this.getLiteralValue());
    currentTimeStampLiteralEClass.getESuperTypes().add(this.getLiteralValue());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Database(), this.getDatabaseBlock(), null, "database", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseBlockEClass, DatabaseBlock.class, "DatabaseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseBlock_Config(), this.getConfigBlock(), null, "config", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseBlock_Migrations(), this.getMigrationBlock(), null, "migrations", null, 0, -1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configBlockEClass, ConfigBlock.class, "ConfigBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigBlock_Statements(), this.getConfigurationStatement(), null, "statements", null, 0, -1, ConfigBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationStatementEClass, ConfigurationStatement.class, "ConfigurationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigurationStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigurationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migrationBlockEClass, MigrationBlock.class, "MigrationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigrationBlock_Statements(), this.getDDLStatement(), null, "statements", null, 0, -1, MigrationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlExpressionEClass, SqlExpression.class, "SqlExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSqlExpression_Root(), this.getExpression(), null, "root", null, 0, 1, SqlExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSqlExpression_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, SqlExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_WhenExpression(), this.getSqlExpression(), null, "whenExpression", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_ThenExpression(), this.getSqlExpression(), null, "thenExpression", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ddlStatementEClass, DDLStatement.class, "DDLStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDDLStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DDLStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dmlStatementEClass, DMLStatement.class, "DMLStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deleteStatementEClass, DeleteStatement.class, "DeleteStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeleteStatement_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, DeleteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteStatement_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, DeleteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertStatementEClass, InsertStatement.class, "InsertStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInsertStatement_ConflictResolution(), this.getConflictResolution(), "conflictResolution", null, 0, 1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsertStatement_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsertStatement_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertStatement_Expressions(), this.getSqlExpression(), null, "expressions", null, 0, -1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, InsertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateStatementEClass, UpdateStatement.class, "UpdateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdateStatement_ConflictResolution(), this.getConflictResolution(), "conflictResolution", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUpdateStatement_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateStatement_UpdateColumnExpressions(), this.getUpdateColumnExpression(), null, "updateColumnExpressions", null, 0, -1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateStatement_WhereExpression(), this.getSqlExpression(), null, "whereExpression", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateColumnExpressionEClass, UpdateColumnExpression.class, "UpdateColumnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdateColumnExpression_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, UpdateColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateColumnExpression_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, UpdateColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementEClass, SelectStatement.class, "SelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectStatement_CoreStatements(), this.getSelectCore(), null, "coreStatements", null, 0, -1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_OrderingTerms(), this.getOrderingTerm(), null, "orderingTerms", null, 0, -1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableClauseEClass, AlterTableClause.class, "AlterTableClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(columnDefEClass, ColumnDef.class, "ColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnDef_Type(), this.getColumnType(), "type", null, 0, 1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnDef_Constraints(), this.getColumnConstraint(), null, "constraints", null, 0, -1, ColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnConstraintEClass, ColumnConstraint.class, "ColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexedColumnEClass, IndexedColumn.class, "IndexedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexedColumn_Name(), this.getColumnDef(), null, "name", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexedColumn_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderingTermEClass, OrderingTerm.class, "OrderingTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderingTerm_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, OrderingTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrderingTerm_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, OrderingTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrderingTerm_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, OrderingTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectCoreEClass, SelectCore.class, "SelectCore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectCore_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectCore_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_ResultColumns(), this.getResultColumn(), null, "resultColumns", null, 0, -1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_Source(), this.getJoinSource(), null, "source", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_WhereExpression(), this.getSqlExpression(), null, "whereExpression", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_GroupByExpressions(), this.getSqlExpression(), null, "groupByExpressions", null, 0, -1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectCore_HavingExpression(), this.getSqlExpression(), null, "havingExpression", null, 0, 1, SelectCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinSourceEClass, JoinSource.class, "JoinSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoinSource_Source(), this.getSingleSource(), null, "source", null, 0, 1, JoinSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinSource_JoinStatements(), this.getJoinStatement(), null, "joinStatements", null, 0, -1, JoinSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceEClass, SingleSource.class, "SingleSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(joinStatementEClass, JoinStatement.class, "JoinStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinStatement_Natural(), ecorePackage.getEBoolean(), "natural", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Left(), ecorePackage.getEBoolean(), "left", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Outer(), ecorePackage.getEBoolean(), "outer", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Inner(), ecorePackage.getEBoolean(), "inner", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinStatement_Cross(), ecorePackage.getEBoolean(), "cross", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_SingleSource(), this.getSingleSource(), null, "singleSource", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnEClass, ResultColumn.class, "ResultColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conflictClauseEClass, ConflictClause.class, "ConflictClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConflictClause_Resolution(), this.getConflictResolution(), "resolution", null, 0, 1, ConflictClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actionStatementEClass, ActionStatement.class, "ActionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionStatement_Path(), ecorePackage.getEString(), "path", null, 0, 1, ActionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activeRecordRegistrationStatementEClass, ActiveRecordRegistrationStatement.class, "ActiveRecordRegistrationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

    initEClass(columnLiteralEClass, ColumnLiteral.class, "ColumnLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnLiteral_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, ColumnLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_LiteralValue(), this.getLiteralValue(), null, "literalValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementExpressionEClass, SelectStatementExpression.class, "SelectStatementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectStatementExpression_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectStatementExpression_Exists(), ecorePackage.getEBoolean(), "exists", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatementExpression_Select(), this.getSelectStatement(), null, "select", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectStatementExpression_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, SelectStatementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseExpression_CaseExpression(), this.getSqlExpression(), null, "caseExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseExpression_Cases(), this.getCase(), null, "cases", null, 0, -1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseExpression_ElseExpression(), this.getSqlExpression(), null, "elseExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaseExpression_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Arguments(), this.getSqlExpression(), null, "arguments", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Arugments(), this.getSqlExpression(), null, "arugments", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastExpression_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCastExpression_Type(), this.getSqliteDataType(), "type", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCastExpression_Isnull(), ecorePackage.getEBoolean(), "isnull", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createTableStatementEClass, CreateTableStatement.class, "CreateTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateTableStatement_ColumnDefs(), this.getColumnDef(), null, "columnDefs", null, 0, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTableStatement_Constraints(), this.getTableConstraint(), null, "constraints", null, 0, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createViewStatementEClass, CreateViewStatement.class, "CreateViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateViewStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createTriggerStatementEClass, CreateTriggerStatement.class, "CreateTriggerStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateTriggerStatement_UpdateColumnNames(), ecorePackage.getEString(), "updateColumnNames", null, 0, -1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateTriggerStatement_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTriggerStatement_WhenExpression(), this.getSqlExpression(), null, "whenExpression", null, 0, 1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateTriggerStatement_Statements(), this.getDMLStatement(), null, "statements", null, 0, -1, CreateTriggerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableStatementEClass, AlterTableStatement.class, "AlterTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterTableStatement_Clause(), this.getAlterTableClause(), null, "clause", null, 0, 1, AlterTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropTableStatementEClass, DropTableStatement.class, "DropTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dropTriggerStatementEClass, DropTriggerStatement.class, "DropTriggerStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dropViewStatementEClass, DropViewStatement.class, "DropViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alterTableRenameClauseEClass, AlterTableRenameClause.class, "AlterTableRenameClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlterTableRenameClause_Name(), ecorePackage.getEString(), "name", null, 0, 1, AlterTableRenameClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterTableAddColumnClauseEClass, AlterTableAddColumnClause.class, "AlterTableAddColumnClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterTableAddColumnClause_ColumnDef(), this.getColumnDef(), null, "columnDef", null, 0, 1, AlterTableAddColumnClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryKeyColumnConstraintEClass, PrimaryKeyColumnConstraint.class, "PrimaryKeyColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimaryKeyColumnConstraint_Asc(), ecorePackage.getEBoolean(), "asc", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryKeyColumnConstraint_Desc(), ecorePackage.getEBoolean(), "desc", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryKeyColumnConstraint_Autoincrement(), ecorePackage.getEBoolean(), "autoincrement", null, 0, 1, PrimaryKeyColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notNullConstraintEClass, NotNullConstraint.class, "NotNullConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotNullConstraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, NotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultConstraintEClass, DefaultConstraint.class, "DefaultConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefaultConstraint_DefaultValue(), this.getDefaultValue(), null, "defaultValue", null, 0, 1, DefaultConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalDefaultValueEClass, LiteralDefaultValue.class, "LiteralDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralDefaultValue_Literal(), this.getLiteralValue(), null, "literal", null, 0, 1, LiteralDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionDefaultValueEClass, ExpressionDefaultValue.class, "ExpressionDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionDefaultValue_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, ExpressionDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uniqueTableContraintEClass, UniqueTableContraint.class, "UniqueTableContraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniqueTableContraint_Columns(), this.getIndexedColumn(), null, "columns", null, 0, -1, UniqueTableContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUniqueTableContraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, UniqueTableContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryContraintEClass, PrimaryContraint.class, "PrimaryContraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryContraint_Columns(), this.getIndexedColumn(), null, "columns", null, 0, -1, PrimaryContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryContraint_ConflictClause(), this.getConflictClause(), null, "conflictClause", null, 0, 1, PrimaryContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkTableConstraintEClass, CheckTableConstraint.class, "CheckTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheckTableConstraint_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, CheckTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceTableEClass, SingleSourceTable.class, "SingleSourceTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleSourceTable_Table(), ecorePackage.getEString(), "table", null, 0, 1, SingleSourceTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleSourceTable_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, SingleSourceTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceSelectStatementEClass, SingleSourceSelectStatement.class, "SingleSourceSelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceSelectStatement_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, SingleSourceSelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleSourceSelectStatement_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, SingleSourceSelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleSourceJoinEClass, SingleSourceJoin.class, "SingleSourceJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleSourceJoin_JoinSource(), this.getJoinSource(), null, "joinSource", null, 0, 1, SingleSourceJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnAllEClass, ResultColumnAll.class, "ResultColumnAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResultColumnAll_Table(), ecorePackage.getEString(), "table", null, 0, 1, ResultColumnAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultColumnExpressionEClass, ResultColumnExpression.class, "ResultColumnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResultColumnExpression_Expression(), this.getSqlExpression(), null, "expression", null, 0, 1, ResultColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResultColumnExpression_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ResultColumnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    // Initialize enums and add enum literals
    initEEnum(columnTypeEEnum, ColumnType.class, "ColumnType");
    addEEnumLiteral(columnTypeEEnum, ColumnType.TEXT);
    addEEnumLiteral(columnTypeEEnum, ColumnType.INTEGER);
    addEEnumLiteral(columnTypeEEnum, ColumnType.REAL);
    addEEnumLiteral(columnTypeEEnum, ColumnType.BLOB);
    addEEnumLiteral(columnTypeEEnum, ColumnType.BOOLEAN);

    initEEnum(sqliteDataTypeEEnum, SqliteDataType.class, "SqliteDataType");
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.TEXT);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.INTEGER);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.REAL);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.BLOB);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.NONE);
    addEEnumLiteral(sqliteDataTypeEEnum, SqliteDataType.NUMERIC);

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
