package com.robotoworks.mechanoid.sqlite.scoping;

import com.google.common.collect.Iterators;
import com.robotoworks.mechanoid.sqlite.scoping.SqliteModelScopeProvider;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
  public IScope scope_IndexedColumn_columnReference(final CreateTableStatement context, final EReference reference) {
    TreeIterator<EObject> _eAllContents = context.eAllContents();
    Iterator<ColumnDef> inScope = Iterators.<ColumnDef>filter(_eAllContents, ColumnDef.class);
    Iterable<ColumnDef> _iterable = IteratorExtensions.<ColumnDef>toIterable(inScope);
    return Scopes.scopeFor(_iterable);
  }
}
