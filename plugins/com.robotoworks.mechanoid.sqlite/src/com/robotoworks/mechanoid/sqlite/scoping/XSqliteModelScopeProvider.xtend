package com.robotoworks.mechanoid.sqlite.scoping

import com.google.common.collect.Lists
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSourceRef
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSourceTable
import com.robotoworks.mechanoid.sqlite.sqliteModel.JoinStatement
import com.robotoworks.mechanoid.sqlite.sqliteModel.SingleSource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectList
import org.eclipse.emf.ecore.EClass

public class XSqliteModelScopeProvider extends SqliteModelScopeProvider {
	
	def IScope scope_IndexedColumn_columnReference(CreateTableStatement context, EReference reference) {
		
		var inScope = context.eAllContents.filter(typeof(ColumnDef))
		return Scopes::scopeFor(inScope.toIterable)
	}
	
	def IScope scope_ColumnSourceRef_column(ColumnSourceRef context, EReference reference) {
		
		if(context.source == null) {
			var expr = findOuterSelectExpression(context)
			if(expr != null) {
				val ArrayList<EObject> items = Lists::newArrayList()

				expr.findAllSingleSources.filter([item|
					if(item instanceof SingleSourceTable) {
						return (item as SingleSourceTable).name == null
					}
					return false
				]).forEach([item|
					var source = item as SingleSourceTable
					
					items.addAll(source.tableReference.columnDefs)
				])
				
				return Scopes::scopeFor(items)
				
			}
		} else {
			if(context.source instanceof SingleSourceTable) {
				var tableSource = context.source as SingleSourceTable
				
				return Scopes::scopeFor(tableSource.tableReference.columnDefs)
			}
		}
		
		return IScope::NULLSCOPE;
	}
	
	def IScope scope_ColumnSourceRef_source(ColumnSourceRef context, EReference reference) {
		val expr = findOuterSelectExpression(context)
		
		return Scopes::scopeFor(expr.findAllSingleSources)
	}
	
	def ArrayList<SingleSource> findAllSingleSources(SelectExpression expr) {
		val ArrayList<SingleSource> items = Lists::newArrayList()
		
		items.add(expr.source.source)
		
		for(join : expr.source.joinStatements) {
			items.add(join.singleSource)
		}
		
		return items
	}
	
	def SelectExpression findOuterSelectExpression(EObject obj) {
		var temp = obj as EObject;
		while(temp.eContainer != null) {
			temp = temp.eContainer
			
			if(temp instanceof SelectExpression) {
				return temp as SelectExpression
			}
		}
		
		return null
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