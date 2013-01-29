package com.robotoworks.mechanoid.sqlite.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.robotoworks.mechanoid.sqlite.scoping.SqliteModelScopeProvider;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSourceRef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
  public IScope scope_IndexedColumn_columnReference(final CreateTableStatement context, final EReference reference) {
    TreeIterator<EObject> _eAllContents = context.eAllContents();
    Iterator<ColumnDef> inScope = Iterators.<ColumnDef>filter(_eAllContents, ColumnDef.class);
    Iterable<ColumnDef> _iterable = IteratorExtensions.<ColumnDef>toIterable(inScope);
    return Scopes.scopeFor(_iterable);
  }
  
  public IScope scope_ColumnSourceRef_column(final ColumnSourceRef context, final EReference reference) {
    SelectSource _source = context.getSource();
    boolean _equals = Objects.equal(_source, null);
    if (_equals) {
      SelectExpression expr = this.findOuterSelectExpression(context);
      boolean _notEquals = (!Objects.equal(expr, null));
      if (_notEquals) {
        final ArrayList<EObject> items = Lists.<EObject>newArrayList();
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
        return Scopes.scopeFor(items);
      }
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
    final SelectExpression expr = this.findOuterSelectExpression(context);
    ArrayList<SingleSource> _findAllSingleSources = this.findAllSingleSources(expr);
    return Scopes.scopeFor(_findAllSingleSources);
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
  
  public SelectExpression findOuterSelectExpression(final EObject obj) {
    EObject temp = ((EObject) obj);
    EObject _eContainer = temp.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
        if ((temp instanceof SelectExpression)) {
          return ((SelectExpression) temp);
        }
      }
      EObject _eContainer_1 = temp.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
      _while = _notEquals_1;
    }
    return null;
  }
}
