package com.robotoworks.mechanoid.db.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.robotoworks.mechanoid.db.generator.SqliteDatabaseSnapshot;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CastExpression;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.db.sqliteModel.ExprConcat;
import com.robotoworks.mechanoid.db.sqliteModel.Expression;
import com.robotoworks.mechanoid.db.sqliteModel.Function;
import com.robotoworks.mechanoid.db.sqliteModel.InitBlock;
import com.robotoworks.mechanoid.db.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.db.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.db.sqliteModel.MigrationBlock;
import com.robotoworks.mechanoid.db.sqliteModel.Model;
import com.robotoworks.mechanoid.db.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectList;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteDataType;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelUtil {
  public static <T extends DDLStatement> ArrayList<T> findPreviousStatementsOfType(final DDLStatement stmt, final Class<T> statementType, final boolean inclusive) {
    ArrayList<T> _arrayList = new ArrayList<T>();
    ArrayList<T> list = _arrayList;
    DatabaseBlock db = ModelUtil.<DatabaseBlock>getAncestorOfType(stmt, DatabaseBlock.class);
    EList<MigrationBlock> _migrations = db.getMigrations();
    for (final MigrationBlock migration : _migrations) {
      EList<DDLStatement> _statements = migration.getStatements();
      for (final DDLStatement ddl : _statements) {
        {
          boolean _not = (!inclusive);
          if (_not) {
            boolean _equals = Objects.equal(ddl, stmt);
            if (_equals) {
              return list;
            }
          }
          Class<? extends DDLStatement> _class = ddl.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            list.add(((T) ddl));
          }
          boolean _equals_1 = Objects.equal(ddl, stmt);
          if (_equals_1) {
            return list;
          }
        }
      }
    }
    InitBlock _ancestorOfType = ModelUtil.<InitBlock>getAncestorOfType(stmt, InitBlock.class);
    boolean _notEquals = (!Objects.equal(_ancestorOfType, null));
    if (_notEquals) {
      InitBlock _init = db.getInit();
      EList<DDLStatement> _statements_1 = _init.getStatements();
      for (final DDLStatement ddl_1 : _statements_1) {
        {
          boolean _not = (!inclusive);
          if (_not) {
            boolean _equals = Objects.equal(ddl_1, stmt);
            if (_equals) {
              return list;
            }
          }
          Class<? extends DDLStatement> _class = ddl_1.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            list.add(((T) ddl_1));
          }
          boolean _equals_1 = Objects.equal(ddl_1, stmt);
          if (_equals_1) {
            return list;
          }
        }
      }
    }
    return list;
  }
  
  public static <T extends DDLStatement> ArrayList<T> findPreviousStatementsOfType(final DatabaseBlock db, final DDLStatement stmt, final Class<T> statementType, final boolean inclusive) {
    ArrayList<T> _arrayList = new ArrayList<T>();
    ArrayList<T> list = _arrayList;
    EList<MigrationBlock> _migrations = db.getMigrations();
    for (final MigrationBlock migration : _migrations) {
      EList<DDLStatement> _statements = migration.getStatements();
      for (final DDLStatement ddl : _statements) {
        {
          boolean _not = (!inclusive);
          if (_not) {
            boolean _equals = Objects.equal(ddl, stmt);
            if (_equals) {
              return list;
            }
          }
          Class<? extends DDLStatement> _class = ddl.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            list.add(((T) ddl));
          }
          boolean _equals_1 = Objects.equal(ddl, stmt);
          if (_equals_1) {
            return list;
          }
        }
      }
    }
    InitBlock _init = db.getInit();
    boolean _notEquals = (!Objects.equal(_init, null));
    if (_notEquals) {
      InitBlock _init_1 = db.getInit();
      EList<DDLStatement> _statements_1 = _init_1.getStatements();
      for (final DDLStatement ddl_1 : _statements_1) {
        {
          boolean _not = (!inclusive);
          if (_not) {
            boolean _equals = Objects.equal(ddl_1, stmt);
            if (_equals) {
              return list;
            }
          }
          Class<? extends DDLStatement> _class = ddl_1.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            list.add(((T) ddl_1));
          }
          boolean _equals_1 = Objects.equal(ddl_1, stmt);
          if (_equals_1) {
            return list;
          }
        }
      }
    }
    return list;
  }
  
  public static <T extends DDLStatement> ArrayList<T> findStatementsOfTypeBetween(final Class<T> statementType, final DDLStatement from, final DDLStatement to) {
    ArrayList<T> _arrayList = new ArrayList<T>();
    ArrayList<T> list = _arrayList;
    boolean between = false;
    DatabaseBlock db = ModelUtil.<DatabaseBlock>getAncestorOfType(from, DatabaseBlock.class);
    EList<MigrationBlock> _migrations = db.getMigrations();
    for (final MigrationBlock migration : _migrations) {
      EList<DDLStatement> _statements = migration.getStatements();
      for (final DDLStatement ddl : _statements) {
        {
          boolean _equals = Objects.equal(ddl, to);
          if (_equals) {
            return list;
          }
          Class<? extends DDLStatement> _class = ddl.getClass();
          boolean _isAssignableFrom = statementType.isAssignableFrom(_class);
          if (_isAssignableFrom) {
            if (between) {
              list.add(((T) ddl));
            }
          }
          boolean _equals_1 = Objects.equal(ddl, from);
          if (_equals_1) {
            between = true;
          }
        }
      }
    }
    return list;
  }
  
  public static <T extends EObject> T getAncestorOfType(final EObject obj, final Class<T> ancestorType) {
    EObject temp = ((EObject) obj);
    EObject _eContainer = temp.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
        Class<? extends EObject> _class = temp.getClass();
        boolean _isAssignableFrom = ancestorType.isAssignableFrom(_class);
        if (_isAssignableFrom) {
          return ((T) temp);
        }
      }
      EObject _eContainer_1 = temp.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  /**
   * walks back and visits each previous statement from the given statement, returning
   * false will cancel the process
   */
  public static void forEachPreviousStatement(final DDLStatement stmt, final Function1<DDLStatement,Boolean> delegate) {
    EObject current = ((EObject) stmt);
    MigrationBlock migration = null;
    boolean _dowhile = false;
    do {
      {
        EObject _previousSibling = EcoreUtil2.getPreviousSibling(current);
        boolean _notEquals = (!Objects.equal(_previousSibling, null));
        boolean _while = _notEquals;
        while (_while) {
          {
            EObject _previousSibling_1 = EcoreUtil2.getPreviousSibling(current);
            current = _previousSibling_1;
            Boolean _apply = delegate.apply(((DDLStatement) current));
            boolean _not = (!(_apply).booleanValue());
            if (_not) {
              return;
            }
          }
          EObject _previousSibling_1 = EcoreUtil2.getPreviousSibling(current);
          boolean _notEquals_1 = (!Objects.equal(_previousSibling_1, null));
          _while = _notEquals_1;
        }
        EObject _eContainer = current.eContainer();
        EObject previousContainer = EcoreUtil2.getPreviousSibling(_eContainer);
        boolean _and = false;
        boolean _notEquals_1 = (!Objects.equal(previousContainer, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          _and = (_notEquals_1 && (previousContainer instanceof MigrationBlock));
        }
        if (_and) {
          migration = ((MigrationBlock) previousContainer);
          EList<DDLStatement> _statements = migration.getStatements();
          DDLStatement _last = IterableExtensions.<DDLStatement>last(_statements);
          current = _last;
          boolean _equals = Objects.equal(current, null);
          if (_equals) {
            return;
          }
          Boolean _apply = delegate.apply(((DDLStatement) current));
          boolean _not = (!(_apply).booleanValue());
          if (_not) {
            return;
          }
        } else {
          migration = null;
        }
      }
      boolean _notEquals = (!Objects.equal(migration, null));
      _dowhile = _notEquals;
    } while(_dowhile);
  }
  
  public static ArrayList<EObject> getAllReferenceableSingleSources(final SelectCoreExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    if ((expr instanceof SelectCore)) {
      SelectCoreExpression _left = ((SelectCore) expr).getLeft();
      ArrayList<EObject> _allReferenceableSingleSources = ModelUtil.getAllReferenceableSingleSources(_left);
      items.addAll(_allReferenceableSingleSources);
      SelectCoreExpression _right = ((SelectCore) expr).getRight();
      ArrayList<EObject> _allReferenceableSingleSources_1 = ModelUtil.getAllReferenceableSingleSources(_right);
      items.addAll(_allReferenceableSingleSources_1);
    } else {
      if ((expr instanceof SelectExpression)) {
        ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(((SelectExpression) expr));
        items.addAll(_findAllSingleSources);
      }
    }
    return items;
  }
  
  public static ArrayList<SingleSource> findAllSingleSources(final SelectExpression expr) {
    final ArrayList<SingleSource> items = Lists.<SingleSource>newArrayList();
    JoinSource _source = expr.getSource();
    SingleSource _source_1 = _source.getSource();
    items.add(_source_1);
    JoinSource _source_2 = expr.getSource();
    EList<JoinStatement> _joinStatements = _source_2.getJoinStatements();
    for (final JoinStatement join : _joinStatements) {
      SingleSource _singleSource = join.getSingleSource();
      items.add(_singleSource);
    }
    return items;
  }
  
  public static ColumnType toColumnType(final SqliteDataType dt) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(dt,SqliteDataType.BLOB)) {
        _matched=true;
        return ColumnType.BLOB;
      }
    }
    if (!_matched) {
      if (Objects.equal(dt,SqliteDataType.INTEGER)) {
        _matched=true;
        return ColumnType.INTEGER;
      }
    }
    if (!_matched) {
      if (Objects.equal(dt,SqliteDataType.REAL)) {
        _matched=true;
        return ColumnType.REAL;
      }
    }
    return ColumnType.TEXT;
  }
  
  public static String toJavaTypeName(final ColumnType type) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type,ColumnType.TEXT)) {
        _matched=true;
        return "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,ColumnType.INTEGER)) {
        _matched=true;
        return "long";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,ColumnType.REAL)) {
        _matched=true;
        return "double";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,ColumnType.BLOB)) {
        _matched=true;
        return "byte[]";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,ColumnType.BOOLEAN)) {
        _matched=true;
        return "boolean";
      }
    }
    return "!!ERROR!!";
  }
  
  public static ColumnType getInferredColumnType(final ResultColumn col) {
    Expression expr = col.getExpression();
    boolean _matched = false;
    if (!_matched) {
      if (expr instanceof CastExpression) {
        final CastExpression _castExpression = (CastExpression)expr;
        _matched=true;
        SqliteDataType _type = _castExpression.getType();
        return ModelUtil.toColumnType(_type);
      }
    }
    if (!_matched) {
      if (expr instanceof ColumnSourceRef) {
        final ColumnSourceRef _columnSourceRef = (ColumnSourceRef)expr;
        _matched=true;
        ColumnSource _column = _columnSourceRef.getColumn();
        if ((_column instanceof ResultColumn)) {
          ColumnSource _column_1 = _columnSourceRef.getColumn();
          ColumnType _inferredColumnType = ModelUtil.getInferredColumnType(((ResultColumn) _column_1));
          return ((ColumnType) _inferredColumnType);
        } else {
          ColumnSource _column_2 = _columnSourceRef.getColumn();
          return ((ColumnDef) _column_2).getType();
        }
      }
    }
    if (!_matched) {
      if (expr instanceof ExprConcat) {
        final ExprConcat _exprConcat = (ExprConcat)expr;
        _matched=true;
        return ColumnType.TEXT;
      }
    }
    if (!_matched) {
      if (expr instanceof Function) {
        final Function _function = (Function)expr;
        _matched=true;
        boolean _or = false;
        boolean _or_1 = false;
        String _name = _function.getName();
        boolean _equalsIgnoreCase = _name.equalsIgnoreCase("count");
        if (_equalsIgnoreCase) {
          _or_1 = true;
        } else {
          String _name_1 = _function.getName();
          boolean _equalsIgnoreCase_1 = _name_1.equalsIgnoreCase("length");
          _or_1 = (_equalsIgnoreCase || _equalsIgnoreCase_1);
        }
        if (_or_1) {
          _or = true;
        } else {
          String _name_2 = _function.getName();
          boolean _equalsIgnoreCase_2 = _name_2.equalsIgnoreCase("random");
          _or = (_or_1 || _equalsIgnoreCase_2);
        }
        if (_or) {
          return ColumnType.INTEGER;
        }
        return ColumnType.TEXT;
      }
    }
    return ColumnType.TEXT;
  }
  
  public static ArrayList<ColumnSource> getViewResultColumns(final CreateViewStatement stmt) {
    ArrayList<ColumnSource> _arrayList = new ArrayList<ColumnSource>();
    ArrayList<ColumnSource> result = _arrayList;
    SelectStatement _selectStatement = stmt.getSelectStatement();
    SelectCoreExpression coreExpr = _selectStatement.getCore();
    if ((coreExpr instanceof SelectCore)) {
      SelectCore core = ((SelectCore) coreExpr);
      SelectCoreExpression _right = core.getRight();
      SelectList selectList = ((SelectExpression) _right).getSelectList();
      boolean _notEquals = (!Objects.equal(selectList, null));
      if (_notEquals) {
        EList<ColumnSource> _resultColumns = selectList.getResultColumns();
        final Function1<ColumnSource,Boolean> _function = new Function1<ColumnSource,Boolean>() {
            public Boolean apply(final ColumnSource it) {
              boolean _and = false;
              String _name = it.getName();
              boolean _notEquals = (!Objects.equal(_name, null));
              if (!_notEquals) {
                _and = false;
              } else {
                String _name_1 = it.getName();
                boolean _equals = _name_1.equals("");
                boolean _not = (!_equals);
                _and = (_notEquals && _not);
              }
              return Boolean.valueOf(_and);
            }
          };
        Iterable<ColumnSource> _filter = IterableExtensions.<ColumnSource>filter(_resultColumns, _function);
        Iterables.<ColumnSource>addAll(result, _filter);
      }
    } else {
      SelectList selectList_1 = ((SelectExpression) coreExpr).getSelectList();
      boolean _notEquals_1 = (!Objects.equal(selectList_1, null));
      if (_notEquals_1) {
        EList<ColumnSource> _resultColumns_1 = selectList_1.getResultColumns();
        final Function1<ColumnSource,Boolean> _function_1 = new Function1<ColumnSource,Boolean>() {
            public Boolean apply(final ColumnSource it) {
              boolean _and = false;
              String _name = it.getName();
              boolean _notEquals = (!Objects.equal(_name, null));
              if (!_notEquals) {
                _and = false;
              } else {
                String _name_1 = it.getName();
                boolean _equals = _name_1.equals("");
                boolean _not = (!_equals);
                _and = (_notEquals && _not);
              }
              return Boolean.valueOf(_and);
            }
          };
        Iterable<ColumnSource> _filter_1 = IterableExtensions.<ColumnSource>filter(_resultColumns_1, _function_1);
        Iterables.<ColumnSource>addAll(result, _filter_1);
      }
    }
    return result;
  }
  
  public static HashSet<CreateViewStatement> getAllViewsReferencingTable(final SqliteDatabaseSnapshot snapshot, final TableDefinition tableDef) {
    HashSet<CreateViewStatement> _hashSet = new HashSet<CreateViewStatement>();
    HashSet<CreateViewStatement> matches = _hashSet;
    Collection<CreateViewStatement> _views = snapshot.getViews();
    for (final CreateViewStatement view : _views) {
      boolean _isDefinitionReferencedByView = ModelUtil.isDefinitionReferencedByView(tableDef, view);
      if (_isDefinitionReferencedByView) {
        matches.add(view);
      }
    }
    return matches;
  }
  
  public static HashSet<CreateViewStatement> getAllViewsInConfigInitReferencingTable(final Model model, final TableDefinition tableDef) {
    HashSet<CreateViewStatement> _hashSet = new HashSet<CreateViewStatement>();
    HashSet<CreateViewStatement> matches = _hashSet;
    Collection<CreateViewStatement> _configInitViews = ModelUtil.getConfigInitViews(model);
    for (final CreateViewStatement view : _configInitViews) {
      boolean _isDefinitionReferencedByView = ModelUtil.isDefinitionReferencedByView(tableDef, view);
      if (_isDefinitionReferencedByView) {
        matches.add(view);
      }
    }
    return matches;
  }
  
  public static boolean isDefinitionReferencedByView(final TableDefinition tableDef, final CreateViewStatement view) {
    TreeIterator<EObject> _eAllContents = view.eAllContents();
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject obj) {
          if ((obj instanceof SingleSourceTable)) {
            SingleSourceTable sourceTable = ((SingleSourceTable) obj);
            TableDefinition _tableReference = sourceTable.getTableReference();
            boolean _not = (!(_tableReference instanceof CreateViewStatement));
            if (_not) {
              TableDefinition _tableReference_1 = sourceTable.getTableReference();
              String _name = _tableReference_1.getName();
              String _name_1 = tableDef.getName();
              boolean _equals = _name.equals(_name_1);
              if (_equals) {
                return Boolean.valueOf(true);
              }
            } else {
              TableDefinition _tableReference_2 = sourceTable.getTableReference();
              return Boolean.valueOf(ModelUtil.isDefinitionReferencedByView(tableDef, ((CreateViewStatement) _tableReference_2)));
            }
          }
          return Boolean.valueOf(false);
        }
      };
    return IteratorExtensions.<EObject>exists(_eAllContents, _function);
  }
  
  public static boolean hasAndroidPrimaryKey(final CreateTableStatement stmt) {
    EList<ColumnSource> _columnDefs = stmt.getColumnDefs();
    final Function1<ColumnSource,Boolean> _function = new Function1<ColumnSource,Boolean>() {
        public Boolean apply(final ColumnSource it) {
          String _name = it.getName();
          boolean _equals = _name.equals("_id");
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<ColumnSource>exists(_columnDefs, _function);
  }
  
  public static boolean hasAndroidPrimaryKey(final CreateViewStatement stmt) {
    ArrayList<ColumnSource> _viewResultColumns = ModelUtil.getViewResultColumns(stmt);
    final Function1<ColumnSource,Boolean> _function = new Function1<ColumnSource,Boolean>() {
        public Boolean apply(final ColumnSource it) {
          boolean _and = false;
          String _name = it.getName();
          boolean _isEmpty = Strings.isEmpty(_name);
          boolean _not = (!_isEmpty);
          if (!_not) {
            _and = false;
          } else {
            String _name_1 = it.getName();
            boolean _equals = _name_1.equals("_id");
            _and = (_not && _equals);
          }
          return Boolean.valueOf(_and);
        }
      };
    return IterableExtensions.<ColumnSource>exists(_viewResultColumns, _function);
  }
  
  /**
   * Find column definitions from caller going back to the definition
   */
  public static ArrayList<EObject> findColumnDefs(final DDLStatement caller, final TableDefinition definition) {
    ArrayList<EObject> _arrayList = new ArrayList<EObject>();
    final ArrayList<EObject> columns = _arrayList;
    LinkedList<TableDefinition> tableHistory = ModelUtil.getHistory(definition);
    TableDefinition last = tableHistory.peekLast();
    if ((last instanceof CreateViewStatement)) {
      CreateViewStatement view = ((CreateViewStatement) last);
      ArrayList<ColumnSource> _viewResultColumns = ModelUtil.getViewResultColumns(view);
      columns.addAll(_viewResultColumns);
      return columns;
    }
    EList<ColumnSource> _columnDefs = ((CreateTableStatement) last).getColumnDefs();
    columns.addAll(_columnDefs);
    boolean _isEmpty = tableHistory.isEmpty();
    boolean _not = (!_isEmpty);
    boolean _while = _not;
    while (_while) {
      {
        final TableDefinition stmt = tableHistory.removeLast();
        ArrayList<AlterTableAddColumnStatement> _findStatementsOfTypeBetween = ModelUtil.<AlterTableAddColumnStatement>findStatementsOfTypeBetween(AlterTableAddColumnStatement.class, stmt, caller);
        final Function1<AlterTableAddColumnStatement,Boolean> _function = new Function1<AlterTableAddColumnStatement,Boolean>() {
            public Boolean apply(final AlterTableAddColumnStatement it) {
              TableDefinition _table = it.getTable();
              boolean _equals = Objects.equal(_table, stmt);
              return Boolean.valueOf(_equals);
            }
          };
        Iterable<AlterTableAddColumnStatement> _filter = IterableExtensions.<AlterTableAddColumnStatement>filter(_findStatementsOfTypeBetween, _function);
        final Procedure1<AlterTableAddColumnStatement> _function_1 = new Procedure1<AlterTableAddColumnStatement>() {
            public void apply(final AlterTableAddColumnStatement it) {
              ColumnSource _columnDef = it.getColumnDef();
              columns.add(_columnDef);
            }
          };
        IterableExtensions.<AlterTableAddColumnStatement>forEach(_filter, _function_1);
      }
      boolean _isEmpty_1 = tableHistory.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      _while = _not_1;
    }
    return columns;
  }
  
  public static LinkedList<TableDefinition> getHistory(final TableDefinition ref) {
    LinkedList<TableDefinition> _linkedList = new LinkedList<TableDefinition>();
    LinkedList<TableDefinition> refs = _linkedList;
    TableDefinition current = ref;
    boolean _while = (current instanceof AlterTableRenameStatement);
    while (_while) {
      {
        refs.add(current);
        TableDefinition _table = ((AlterTableRenameStatement) current).getTable();
        current = _table;
      }
      _while = (current instanceof AlterTableRenameStatement);
    }
    refs.add(current);
    return refs;
  }
  
  public static ArrayList<EObject> getAllReferenceableColumns(final SelectCoreExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    if ((expr instanceof SelectCore)) {
      SelectCoreExpression _left = ((SelectCore) expr).getLeft();
      ArrayList<EObject> _allReferenceableColumns = ModelUtil.getAllReferenceableColumns(_left);
      items.addAll(_allReferenceableColumns);
      SelectCoreExpression _right = ((SelectCore) expr).getRight();
      ArrayList<EObject> _allReferenceableColumns_1 = ModelUtil.getAllReferenceableColumns(_right);
      items.addAll(_allReferenceableColumns_1);
    } else {
      if ((expr instanceof SelectExpression)) {
        ArrayList<EObject> _allReferenceableColumns_2 = ModelUtil.getAllReferenceableColumns(((SelectExpression) expr), true);
        items.addAll(_allReferenceableColumns_2);
      }
    }
    return items;
  }
  
  public static ArrayList<EObject> getAllReferenceableColumns(final SelectExpression expr, final boolean includeAliases) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    boolean _and = false;
    SelectList _selectList = expr.getSelectList();
    boolean _notEquals = (!Objects.equal(_selectList, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (_notEquals && includeAliases);
    }
    if (_and) {
      SelectList _selectList_1 = expr.getSelectList();
      EList<ColumnSource> _resultColumns = _selectList_1.getResultColumns();
      final Function1<ColumnSource,Boolean> _function = new Function1<ColumnSource,Boolean>() {
          public Boolean apply(final ColumnSource it) {
            String _name = it.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            return Boolean.valueOf(_notEquals);
          }
        };
      Iterable<ColumnSource> _filter = IterableExtensions.<ColumnSource>filter(_resultColumns, _function);
      Iterables.<EObject>addAll(items, _filter);
    }
    ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(expr);
    final Function1<SingleSource,Boolean> _function_1 = new Function1<SingleSource,Boolean>() {
        public Boolean apply(final SingleSource item) {
          if ((item instanceof SingleSourceTable)) {
            String _name = ((SingleSourceTable) item).getName();
            return Boolean.valueOf(Objects.equal(_name, null));
          }
          return Boolean.valueOf(false);
        }
      };
    Iterable<SingleSource> _filter_1 = IterableExtensions.<SingleSource>filter(_findAllSingleSources, _function_1);
    final Procedure1<SingleSource> _function_2 = new Procedure1<SingleSource>() {
        public void apply(final SingleSource item) {
          SingleSourceTable source = ((SingleSourceTable) item);
          DDLStatement _ancestorOfType = ModelUtil.<DDLStatement>getAncestorOfType(item, DDLStatement.class);
          TableDefinition _tableReference = source.getTableReference();
          ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(_ancestorOfType, _tableReference);
          items.addAll(_findColumnDefs);
        }
      };
    IterableExtensions.<SingleSource>forEach(_filter_1, _function_2);
    return items;
  }
  
  public static Collection<CreateViewStatement> getConfigInitViews(final Model model) {
    final ArrayList<CreateViewStatement> items = Lists.<CreateViewStatement>newArrayList();
    DatabaseBlock _database = model.getDatabase();
    InitBlock _init = _database.getInit();
    boolean _notEquals = (!Objects.equal(_init, null));
    if (_notEquals) {
      DatabaseBlock _database_1 = model.getDatabase();
      InitBlock _init_1 = _database_1.getInit();
      EList<DDLStatement> _statements = _init_1.getStatements();
      Iterable<CreateViewStatement> _filter = Iterables.<CreateViewStatement>filter(_statements, CreateViewStatement.class);
      Iterables.<CreateViewStatement>addAll(items, _filter);
    }
    return items;
  }
  
  public static Collection<CreateTableStatement> getConfigInitTables(final Model model) {
    final ArrayList<CreateTableStatement> items = Lists.<CreateTableStatement>newArrayList();
    DatabaseBlock _database = model.getDatabase();
    InitBlock _init = _database.getInit();
    boolean _notEquals = (!Objects.equal(_init, null));
    if (_notEquals) {
      DatabaseBlock _database_1 = model.getDatabase();
      InitBlock _init_1 = _database_1.getInit();
      EList<DDLStatement> _statements = _init_1.getStatements();
      Iterable<CreateTableStatement> _filter = Iterables.<CreateTableStatement>filter(_statements, CreateTableStatement.class);
      Iterables.<CreateTableStatement>addAll(items, _filter);
    }
    return items;
  }
}
