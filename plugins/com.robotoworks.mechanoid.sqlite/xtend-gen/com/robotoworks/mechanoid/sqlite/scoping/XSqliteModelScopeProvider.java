package com.robotoworks.mechanoid.sqlite.scoping;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.robotoworks.mechanoid.sqlite.naming.NameHelper;
import com.robotoworks.mechanoid.sqlite.scoping.SqliteModelScopeProvider;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTriggerStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DeleteStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.InsertStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.NewColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OldColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.OrderingTermList;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectList;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import com.robotoworks.mechanoid.sqlite.sqliteModel.UpdateStatement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  public IScope scope_IndexedColumn_columnReference(final CreateTableStatement context, final EReference reference) {
    TreeIterator<EObject> _eAllContents = context.eAllContents();
    Iterator<ColumnDef> inScope = Iterators.<ColumnDef>filter(_eAllContents, ColumnDef.class);
    Iterable<ColumnDef> _iterable = IteratorExtensions.<ColumnDef>toIterable(inScope);
    return Scopes.<EObject>scopeFor(_iterable, this.nameProvider, IScope.NULLSCOPE);
  }
  
  public IScope scope_ColumnSourceRef_column(final ColumnSourceRef context, final EReference reference) {
    SelectSource _source = context.getSource();
    boolean _equals = Objects.equal(_source, null);
    if (_equals) {
      IScope scope = this.buildScopeForColumnSourceRef(context, context);
      return scope;
    } else {
      SelectSource _source_1 = context.getSource();
      if ((_source_1 instanceof SingleSourceTable)) {
        SelectSource _source_2 = context.getSource();
        SingleSourceTable tableSource = ((SingleSourceTable) _source_2);
        CreateTableStatement _tableReference = tableSource.getTableReference();
        EList<ColumnSource> _columnDefs = _tableReference.getColumnDefs();
        return Scopes.scopeFor(_columnDefs);
      }
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ColumnSourceRef_source(final ColumnSourceRef context, final EReference reference) {
    IScope scope = this.buildScopeForColumnSourceRef_source(context, context);
    return scope;
  }
  
  public IScope scope_NewColumn_column(final NewColumn context, final EReference reference) {
    CreateTriggerStatement trigger = this.<CreateTriggerStatement>findOuter(context, CreateTriggerStatement.class);
    boolean _notEquals = (!Objects.equal(trigger, null));
    if (_notEquals) {
      CreateTableStatement _table = trigger.getTable();
      EList<ColumnSource> _columnDefs = _table.getColumnDefs();
      return Scopes.scopeFor(_columnDefs);
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_OldColumn_column(final OldColumn context, final EReference reference) {
    CreateTriggerStatement trigger = this.<CreateTriggerStatement>findOuter(context, CreateTriggerStatement.class);
    boolean _notEquals = (!Objects.equal(trigger, null));
    if (_notEquals) {
      CreateTableStatement _table = trigger.getTable();
      EList<ColumnSource> _columnDefs = _table.getColumnDefs();
      return Scopes.scopeFor(_columnDefs);
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope buildScopeForColumnSourceRef(final ColumnSourceRef context, final EObject parent) {
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
            final ArrayList<EObject> items = this.getAllReferenceableColumns(_selectExpression);
            IScope _buildScopeForColumnSourceRef = this.buildScopeForColumnSourceRef(context, _selectExpression);
            return Scopes.scopeFor(items, _buildScopeForColumnSourceRef);
          }
        }
        if (!_matched) {
          if (container instanceof UpdateStatement) {
            final UpdateStatement _updateStatement = (UpdateStatement)container;
            _matched=true;
            CreateTableStatement _table = _updateStatement.getTable();
            EList<ColumnSource> _columnDefs = _table.getColumnDefs();
            return Scopes.scopeFor(_columnDefs, IScope.NULLSCOPE);
          }
        }
        if (!_matched) {
          if (container instanceof InsertStatement) {
            final InsertStatement _insertStatement = (InsertStatement)container;
            _matched=true;
            CreateTableStatement _table = _insertStatement.getTable();
            EList<ColumnSource> _columnDefs = _table.getColumnDefs();
            return Scopes.scopeFor(_columnDefs, IScope.NULLSCOPE);
          }
        }
        if (!_matched) {
          if (container instanceof DeleteStatement) {
            final DeleteStatement _deleteStatement = (DeleteStatement)container;
            _matched=true;
            CreateTableStatement _table = _deleteStatement.getTable();
            EList<ColumnSource> _columnDefs = _table.getColumnDefs();
            return Scopes.scopeFor(_columnDefs, IScope.NULLSCOPE);
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
            ArrayList<EObject> _allReferenceableColumns = this.getAllReferenceableColumns(core);
            return Scopes.scopeFor(_allReferenceableColumns, IScope.NULLSCOPE);
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
            ArrayList<SingleSource> _findAllSingleSources = this.findAllSingleSources(_selectExpression);
            items.addAll(_findAllSingleSources);
            final Function1<EObject,QualifiedName> _function = new Function1<EObject,QualifiedName>() {
                public QualifiedName apply(final EObject it) {
                  QualifiedName _name = NameHelper.getName(((SelectSource) it));
                  return _name;
                }
              };
            IScope _buildScopeForColumnSourceRef_source = this.buildScopeForColumnSourceRef_source(context, _selectExpression);
            return Scopes.<EObject>scopeFor(items, new Function<EObject,QualifiedName>() {
                public QualifiedName apply(EObject input) {
                  return _function.apply(input);
                }
            }, _buildScopeForColumnSourceRef_source);
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
            ArrayList<EObject> _allReferenceableSingleSources = this.getAllReferenceableSingleSources(core);
            final Function1<EObject,QualifiedName> _function = new Function1<EObject,QualifiedName>() {
                public QualifiedName apply(final EObject it) {
                  QualifiedName _name = NameHelper.getName(((SelectSource) it));
                  return _name;
                }
              };
            return Scopes.<EObject>scopeFor(_allReferenceableSingleSources, new Function<EObject,QualifiedName>() {
                public QualifiedName apply(EObject input) {
                  return _function.apply(input);
                }
            }, IScope.NULLSCOPE);
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
  
  public ArrayList<SingleSource> findAllSingleSources(final SelectExpression expr) {
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
  
  public <T extends EObject> T findOuter(final EObject obj, final Class<T> ancestor) {
    EObject temp = ((EObject) obj);
    EObject _eContainer = temp.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
        Class<? extends Object> _class = temp.getClass();
        boolean _isAssignableFrom = ancestor.isAssignableFrom(_class);
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
  
  public ArrayList<EObject> getAllReferenceableColumns(final SelectCoreExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    if ((expr instanceof SelectCore)) {
      SelectCoreExpression _left = ((SelectCore) expr).getLeft();
      ArrayList<EObject> _allReferenceableColumns = this.getAllReferenceableColumns(_left);
      items.addAll(_allReferenceableColumns);
      SelectCoreExpression _right = ((SelectCore) expr).getRight();
      ArrayList<EObject> _allReferenceableColumns_1 = this.getAllReferenceableColumns(_right);
      items.addAll(_allReferenceableColumns_1);
    } else {
      if ((expr instanceof SelectExpression)) {
        ArrayList<EObject> _allReferenceableColumns_2 = this.getAllReferenceableColumns(((SelectExpression) expr));
        items.addAll(_allReferenceableColumns_2);
      }
    }
    return items;
  }
  
  public ArrayList<EObject> getAllReferenceableSingleSources(final SelectCoreExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    if ((expr instanceof SelectCore)) {
      SelectCoreExpression _left = ((SelectCore) expr).getLeft();
      ArrayList<EObject> _allReferenceableSingleSources = this.getAllReferenceableSingleSources(_left);
      items.addAll(_allReferenceableSingleSources);
      SelectCoreExpression _right = ((SelectCore) expr).getRight();
      ArrayList<EObject> _allReferenceableSingleSources_1 = this.getAllReferenceableSingleSources(_right);
      items.addAll(_allReferenceableSingleSources_1);
    } else {
      if ((expr instanceof SelectExpression)) {
        ArrayList<SingleSource> _findAllSingleSources = this.findAllSingleSources(((SelectExpression) expr));
        items.addAll(_findAllSingleSources);
      }
    }
    return items;
  }
  
  public ArrayList<EObject> getAllReferenceableColumns(final SelectExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    SelectList _selectList = expr.getSelectList();
    boolean _notEquals = (!Objects.equal(_selectList, null));
    if (_notEquals) {
      SelectList _selectList_1 = expr.getSelectList();
      EList<ColumnSource> _resultColumns = _selectList_1.getResultColumns();
      items.addAll(_resultColumns);
    }
    ArrayList<SingleSource> _findAllSingleSources = this.findAllSingleSources(expr);
    final Function1<SingleSource,Boolean> _function = new Function1<SingleSource,Boolean>() {
        public Boolean apply(final SingleSource item) {
          if ((item instanceof SingleSourceTable)) {
            String _name = ((SingleSourceTable) item).getName();
            return Boolean.valueOf(Objects.equal(_name, null));
          }
          return Boolean.valueOf(false);
        }
      };
    Iterable<SingleSource> _filter = IterableExtensions.<SingleSource>filter(_findAllSingleSources, _function);
    final Procedure1<SingleSource> _function_1 = new Procedure1<SingleSource>() {
        public void apply(final SingleSource item) {
          SingleSourceTable source = ((SingleSourceTable) item);
          CreateTableStatement _tableReference = source.getTableReference();
          EList<ColumnSource> _columnDefs = _tableReference.getColumnDefs();
          items.addAll(_columnDefs);
        }
      };
    IterableExtensions.<SingleSource>forEach(_filter, _function_1);
    return items;
  }
}
