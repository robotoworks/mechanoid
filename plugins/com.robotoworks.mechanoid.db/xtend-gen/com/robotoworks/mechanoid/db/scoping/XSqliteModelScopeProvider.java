package com.robotoworks.mechanoid.db.scoping;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.robotoworks.mechanoid.db.naming.NameHelper;
import com.robotoworks.mechanoid.db.scoping.SqliteModelScopeProvider;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableAddColumnStatement;
import com.robotoworks.mechanoid.db.sqliteModel.AlterTableRenameStatement;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.db.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.db.sqliteModel.CreateIndexStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.db.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DDLStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.db.sqliteModel.DeleteStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropTableStatement;
import com.robotoworks.mechanoid.db.sqliteModel.DropViewStatement;
import com.robotoworks.mechanoid.db.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.db.sqliteModel.NewColumn;
import com.robotoworks.mechanoid.db.sqliteModel.OldColumn;
import com.robotoworks.mechanoid.db.sqliteModel.OrderingTermList;
import com.robotoworks.mechanoid.db.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.db.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.db.sqliteModel.SelectList;
import com.robotoworks.mechanoid.db.sqliteModel.SelectSource;
import com.robotoworks.mechanoid.db.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.db.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.db.sqliteModel.TableDefinition;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateColumnExpression;
import com.robotoworks.mechanoid.db.sqliteModel.UpdateStatement;
import com.robotoworks.mechanoid.db.util.ModelUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  public IScope scope_IndexedColumn_columnReference(final CreateTableStatement context, final EReference reference) {
    EList<ColumnSource> _columnDefs = context.getColumnDefs();
    return Scopes.<EObject>scopeFor(_columnDefs, this.nameProvider, IScope.NULLSCOPE);
  }
  
  public IScope scope_ColumnSourceRef_column(final SelectList context, final EReference reference) {
    SelectExpression expr = ModelUtil.<SelectExpression>getAncestorOfType(context, SelectExpression.class);
    ArrayList<EObject> _allReferenceableColumns = ModelUtil.getAllReferenceableColumns(expr, false);
    return Scopes.scopeFor(_allReferenceableColumns);
  }
  
  public IScope scope_ColumnSourceRef_column(final ColumnSourceRef context, final EReference reference) {
    SelectSource _source = context.getSource();
    boolean _equals = Objects.equal(_source, null);
    if (_equals) {
      IScope scope = this.buildScopeForColumnSourceRef_column(context, context);
      return scope;
    } else {
      SelectSource _source_1 = context.getSource();
      if ((_source_1 instanceof SingleSourceTable)) {
        SelectSource _source_2 = context.getSource();
        SingleSourceTable tableSource = ((SingleSourceTable) _source_2);
        DDLStatement _ancestorOfType = ModelUtil.<DDLStatement>getAncestorOfType(tableSource, DDLStatement.class);
        TableDefinition _tableReference = tableSource.getTableReference();
        ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(_ancestorOfType, _tableReference);
        return Scopes.scopeFor(_findColumnDefs);
      }
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ColumnSourceRef_source(final ColumnSourceRef context, final EReference reference) {
    IScope scope = this.buildScopeForColumnSourceRef_source(context, context);
    return scope;
  }
  
  public IScope scope_NewColumn_column(final NewColumn context, final EReference reference) {
    CreateTriggerStatement trigger = ModelUtil.<CreateTriggerStatement>getAncestorOfType(context, CreateTriggerStatement.class);
    boolean _notEquals = (!Objects.equal(trigger, null));
    if (_notEquals) {
      TableDefinition _table = trigger.getTable();
      ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(trigger, _table);
      return Scopes.scopeFor(_findColumnDefs);
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_OldColumn_column(final OldColumn context, final EReference reference) {
    CreateTriggerStatement trigger = ModelUtil.<CreateTriggerStatement>getAncestorOfType(context, CreateTriggerStatement.class);
    boolean _notEquals = (!Objects.equal(trigger, null));
    if (_notEquals) {
      TableDefinition _table = trigger.getTable();
      ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(trigger, _table);
      return Scopes.scopeFor(_findColumnDefs);
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_SingleSourceTable_tableReference(final SingleSourceTable tbl, final EReference reference) {
    DDLStatement stmt = ModelUtil.<DDLStatement>getAncestorOfType(tbl, DDLStatement.class);
    boolean _notEquals = (!Objects.equal(stmt, null));
    if (_notEquals) {
      return this.scopeForTableDefinitionsBeforeStatement(stmt, false);
    }
    DatabaseBlock db = ModelUtil.<DatabaseBlock>getAncestorOfType(tbl, DatabaseBlock.class);
    return this.scopeForTableDefinitionsBeforeStatement(db, stmt, true);
  }
  
  public IScope scope_CreateTriggerStatement_table(final CreateTriggerStatement context, final EReference reference) {
    return this.scopeForTableDefinitionsBeforeStatement(context, false);
  }
  
  public IScope scope_DeleteStatement_table(final DeleteStatement context, final EReference reference) {
    DDLStatement stmt = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    return this.scopeForTableDefinitionsBeforeStatement(stmt, false);
  }
  
  public IScope scope_InsertStatement_table(final InsertStatement context, final EReference reference) {
    DDLStatement stmt = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    return this.scopeForTableDefinitionsBeforeStatement(stmt, false);
  }
  
  public IScope scope_UpdateStatement_table(final UpdateStatement context, final EReference reference) {
    DDLStatement stmt = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    return this.scopeForTableDefinitionsBeforeStatement(stmt, false);
  }
  
  public IScope scope_InsertStatement_columnNames(final InsertStatement context, final EReference reference) {
    DDLStatement stmt = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    TableDefinition _table = context.getTable();
    ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(stmt, _table);
    return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
  }
  
  public IScope scope_AlterTableAddColumnStatement_table(final AlterTableAddColumnStatement context, final EReference reference) {
    return this.scopeForTableDefinitionsBeforeStatement(context, false);
  }
  
  public IScope scope_AlterTableRenameStatement_table(final AlterTableRenameStatement context, final EReference reference) {
    return this.scopeForTableDefinitionsBeforeStatement(context, false);
  }
  
  public IScope scope_DropTableStatement_table(final DropTableStatement context, final EReference reference) {
    return this.scopeForTableDefinitionsBeforeStatement(context, false);
  }
  
  public IScope scope_DropViewStatement_view(final DropViewStatement context, final EReference reference) {
    return this.scopeForViewDefinitionsBeforeStatement(context, false);
  }
  
  public IScope scope_CreateIndexStatement_table(final CreateIndexStatement context, final EReference reference) {
    return this.scopeForTableDefinitionsBeforeStatement(context, false);
  }
  
  public IScope scope_UpdateColumnExpression_columnName(final UpdateColumnExpression context, final EReference reference) {
    UpdateStatement updateStmt = ModelUtil.<UpdateStatement>getAncestorOfType(context, UpdateStatement.class);
    DDLStatement containingStmt = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    TableDefinition _table = updateStmt.getTable();
    ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(containingStmt, _table);
    return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
  }
  
  public IScope scope_UpdateColumnExpression_columnName(final UpdateStatement context, final EReference reference) {
    DDLStatement containingStmt = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    TableDefinition _table = context.getTable();
    ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(containingStmt, _table);
    return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
  }
  
  public IScope scope_ColumnSourceRef_source(final UpdateStatement context, final EReference reference) {
    DDLStatement ddl = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    TableDefinition _table = context.getTable();
    ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(ddl, _table);
    return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
  }
  
  public IScope scope_ColumnSourceRef_source(final DeleteStatement context, final EReference reference) {
    DDLStatement ddl = ModelUtil.<DDLStatement>getAncestorOfType(context, DDLStatement.class);
    TableDefinition _table = context.getTable();
    ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(ddl, _table);
    return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
  }
  
  public IScope scopeForTableDefinitionsBeforeStatement(final DDLStatement stmt, final boolean inclusive) {
    ArrayList<TableDefinition> refs = ModelUtil.<TableDefinition>findPreviousStatementsOfType(stmt, TableDefinition.class, inclusive);
    HashMap<String,EObject> _hashMap = new HashMap<String,EObject>();
    final HashMap<String,EObject> map = _hashMap;
    List<TableDefinition> _reverse = ListExtensions.<TableDefinition>reverse(refs);
    for (final TableDefinition ref : _reverse) {
      {
        String _name = ref.getName();
        boolean _equals = Objects.equal(_name, null);
        if (_equals) {
          return IScope.NULLSCOPE;
        }
        String _name_1 = ref.getName();
        boolean _containsKey = map.containsKey(_name_1);
        boolean _not = (!_containsKey);
        if (_not) {
          String _name_2 = ref.getName();
          map.put(_name_2, ref);
        }
      }
    }
    Collection<EObject> _values = map.values();
    final Function<EObject,QualifiedName> _function = new Function<EObject,QualifiedName>() {
        public QualifiedName apply(final EObject it) {
          QualifiedName _name = NameHelper.getName(((TableDefinition) it));
          return _name;
        }
      };
    return Scopes.<EObject>scopeFor(_values, _function, IScope.NULLSCOPE);
  }
  
  public IScope scopeForViewDefinitionsBeforeStatement(final DDLStatement stmt, final boolean inclusive) {
    ArrayList<CreateViewStatement> refs = ModelUtil.<CreateViewStatement>findPreviousStatementsOfType(stmt, CreateViewStatement.class, inclusive);
    HashMap<String,EObject> _hashMap = new HashMap<String,EObject>();
    final HashMap<String,EObject> map = _hashMap;
    List<CreateViewStatement> _reverse = ListExtensions.<CreateViewStatement>reverse(refs);
    for (final CreateViewStatement ref : _reverse) {
      {
        String _name = ref.getName();
        boolean _equals = Objects.equal(_name, null);
        if (_equals) {
          return IScope.NULLSCOPE;
        }
        String _name_1 = ref.getName();
        boolean _containsKey = map.containsKey(_name_1);
        boolean _not = (!_containsKey);
        if (_not) {
          String _name_2 = ref.getName();
          map.put(_name_2, ref);
        }
      }
    }
    Collection<EObject> _values = map.values();
    final Function<EObject,QualifiedName> _function = new Function<EObject,QualifiedName>() {
        public QualifiedName apply(final EObject it) {
          QualifiedName _name = NameHelper.getName(((TableDefinition) it));
          return _name;
        }
      };
    return Scopes.<EObject>scopeFor(_values, _function, IScope.NULLSCOPE);
  }
  
  public IScope scopeForTableDefinitionsBeforeStatement(final DatabaseBlock db, final DDLStatement stmt, final boolean inclusive) {
    ArrayList<TableDefinition> refs = ModelUtil.<TableDefinition>findPreviousStatementsOfType(db, stmt, TableDefinition.class, inclusive);
    HashMap<String,EObject> _hashMap = new HashMap<String,EObject>();
    final HashMap<String,EObject> map = _hashMap;
    List<TableDefinition> _reverse = ListExtensions.<TableDefinition>reverse(refs);
    for (final TableDefinition ref : _reverse) {
      {
        String _name = ref.getName();
        boolean _equals = Objects.equal(_name, null);
        if (_equals) {
          return IScope.NULLSCOPE;
        }
        String _name_1 = ref.getName();
        boolean _containsKey = map.containsKey(_name_1);
        boolean _not = (!_containsKey);
        if (_not) {
          String _name_2 = ref.getName();
          map.put(_name_2, ref);
        }
      }
    }
    Collection<EObject> _values = map.values();
    final Function<EObject,QualifiedName> _function = new Function<EObject,QualifiedName>() {
        public QualifiedName apply(final EObject it) {
          QualifiedName _name = NameHelper.getName(((TableDefinition) it));
          return _name;
        }
      };
    return Scopes.<EObject>scopeFor(_values, _function, IScope.NULLSCOPE);
  }
  
  public IScope buildScopeForColumnSourceRef_column(final ColumnSourceRef context, final EObject parent) {
    EObject temp = parent;
    EObject _eContainer = temp.eContainer();
    boolean _not = (!(_eContainer instanceof DatabaseBlock));
    boolean _while = _not;
    while (_while) {
      {
        EObject container = temp.eContainer();
        boolean _matched = false;
        if (!_matched) {
          if (container instanceof SelectExpression) {
            final SelectExpression _selectExpression = (SelectExpression)container;
            _matched=true;
            SelectList _ancestorOfType = ModelUtil.<SelectList>getAncestorOfType(context, SelectList.class);
            boolean includeAliases = Objects.equal(_ancestorOfType, null);
            final ArrayList<EObject> items = ModelUtil.getAllReferenceableColumns(_selectExpression, includeAliases);
            IScope _buildScopeForColumnSourceRef_column = this.buildScopeForColumnSourceRef_column(context, _selectExpression);
            return Scopes.scopeFor(items, _buildScopeForColumnSourceRef_column);
          }
        }
        if (!_matched) {
          if (container instanceof ResultColumn) {
            final ResultColumn _resultColumn = (ResultColumn)container;
            _matched=true;
            EObject _eContainer_1 = _resultColumn.eContainer();
            EObject _eContainer_2 = _eContainer_1.eContainer();
            final ArrayList<EObject> items = ModelUtil.getAllReferenceableColumns(((SelectExpression) _eContainer_2), false);
            IScope _buildScopeForColumnSourceRef_column = this.buildScopeForColumnSourceRef_column(context, _resultColumn);
            return Scopes.scopeFor(items, _buildScopeForColumnSourceRef_column);
          }
        }
        if (!_matched) {
          if (container instanceof UpdateStatement) {
            final UpdateStatement _updateStatement = (UpdateStatement)container;
            _matched=true;
            DDLStatement ddl = ModelUtil.<DDLStatement>getAncestorOfType(_updateStatement, DDLStatement.class);
            TableDefinition _table = _updateStatement.getTable();
            ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(ddl, _table);
            return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
          }
        }
        if (!_matched) {
          if (container instanceof InsertStatement) {
            final InsertStatement _insertStatement = (InsertStatement)container;
            _matched=true;
            DDLStatement ddl = ModelUtil.<DDLStatement>getAncestorOfType(_insertStatement, DDLStatement.class);
            TableDefinition _table = _insertStatement.getTable();
            ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(ddl, _table);
            return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
          }
        }
        if (!_matched) {
          if (container instanceof DeleteStatement) {
            final DeleteStatement _deleteStatement = (DeleteStatement)container;
            _matched=true;
            DDLStatement ddl = ModelUtil.<DDLStatement>getAncestorOfType(_deleteStatement, DDLStatement.class);
            TableDefinition _table = _deleteStatement.getTable();
            ArrayList<EObject> _findColumnDefs = ModelUtil.findColumnDefs(ddl, _table);
            return Scopes.scopeFor(_findColumnDefs, IScope.NULLSCOPE);
          }
        }
        if (!_matched) {
          if (container instanceof OrderingTermList) {
            final OrderingTermList _orderingTermList = (OrderingTermList)container;
            _matched=true;
            EObject _eContainer_1 = _orderingTermList.eContainer();
            SelectStatement selectStatement = ((SelectStatement) _eContainer_1);
            SelectCoreExpression _core = selectStatement.getCore();
            SelectCore core = ((SelectCore) _core);
            ArrayList<EObject> _allReferenceableColumns = ModelUtil.getAllReferenceableColumns(core);
            return Scopes.scopeFor(_allReferenceableColumns, IScope.NULLSCOPE);
          }
        }
        if (!_matched) {
          if (container instanceof CreateTableStatement) {
            final CreateTableStatement _createTableStatement = (CreateTableStatement)container;
            _matched=true;
            EList<ColumnSource> _columnDefs = _createTableStatement.getColumnDefs();
            return Scopes.scopeFor(_columnDefs, IScope.NULLSCOPE);
          }
        }
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
      }
      EObject _eContainer_1 = temp.eContainer();
      boolean _not_1 = (!(_eContainer_1 instanceof DatabaseBlock));
      _while = _not_1;
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope buildScopeForColumnSourceRef_source(final ColumnSourceRef context, final EObject parent) {
    EObject temp = parent;
    EObject _eContainer = temp.eContainer();
    boolean _not = (!(_eContainer instanceof DatabaseBlock));
    boolean _while = _not;
    while (_while) {
      {
        EObject container = temp.eContainer();
        boolean _matched = false;
        if (!_matched) {
          if (container instanceof SelectExpression) {
            final SelectExpression _selectExpression = (SelectExpression)container;
            _matched=true;
            final ArrayList<EObject> items = Lists.<EObject>newArrayList();
            ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(_selectExpression);
            items.addAll(_findAllSingleSources);
            final Function<EObject,QualifiedName> _function = new Function<EObject,QualifiedName>() {
                public QualifiedName apply(final EObject it) {
                  QualifiedName _name = NameHelper.getName(((SelectSource) it));
                  return _name;
                }
              };
            IScope _buildScopeForColumnSourceRef_source = this.buildScopeForColumnSourceRef_source(context, _selectExpression);
            return Scopes.<EObject>scopeFor(items, _function, _buildScopeForColumnSourceRef_source);
          }
        }
        if (!_matched) {
          if (container instanceof OrderingTermList) {
            final OrderingTermList _orderingTermList = (OrderingTermList)container;
            _matched=true;
            EObject _eContainer_1 = _orderingTermList.eContainer();
            SelectStatement selectStatement = ((SelectStatement) _eContainer_1);
            SelectCoreExpression _core = selectStatement.getCore();
            SelectCore core = ((SelectCore) _core);
            ArrayList<EObject> _allReferenceableSingleSources = ModelUtil.getAllReferenceableSingleSources(core);
            final Function<EObject,QualifiedName> _function = new Function<EObject,QualifiedName>() {
                public QualifiedName apply(final EObject it) {
                  QualifiedName _name = NameHelper.getName(((SelectSource) it));
                  return _name;
                }
              };
            return Scopes.<EObject>scopeFor(_allReferenceableSingleSources, _function, IScope.NULLSCOPE);
          }
        }
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
      }
      EObject _eContainer_1 = temp.eContainer();
      boolean _not_1 = (!(_eContainer_1 instanceof DatabaseBlock));
      _while = _not_1;
    }
    return IScope.NULLSCOPE;
  }
}
