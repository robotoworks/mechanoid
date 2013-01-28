package com.robotoworks.mechanoid.sqlite.scoping

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
import com.robotoworks.mechanoid.sqlite.sqliteModel.IndexedColumn
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
	
	def IScope scope_IndexedColumn_columnReference(IndexedColumn context, EReference reference) {
		
		var inScope = context.eContainer.eContainer.eAllContents.filter(typeof(ColumnDef))
		return Scopes::scopeFor(inScope.toIterable)
	}
	
//	def IScope scope_ResultColumn_table(ResultColumn context, EReference reference) {
//		
//		var IScope scope = IScope::NULLSCOPE
//		
//		var SelectCore container = context.eContainer as SelectCore
//		var tableSources = container.eAllContents.filter(typeof(TableSource))	
//		
//		scope = Scopes::scopeFor(tableSources.toIterable)		
//		
//		return scope
//	}
//	
//	def IScope scope_ResultColumn_column(ResultColumn context,
//			EReference reference) {
//				
//				var IScope scope = IScope::NULLSCOPE
//
//				if(context.table == null) {
//					var SelectCore container = context.eContainer as SelectCore
//					
//					var tableSources = container.eAllContents.filter(typeof(TableSource))
//					
//					var ArrayList<ColumnDef> cols = Lists::newArrayList()
//					
//					for(s : tableSources.toIterable) {
//						cols.addAll(s.table.columnDefs)
//					}
//					
//					scope = Scopes::scopeFor(cols)
//					
//				}
//				
//				return scope
//	}

}