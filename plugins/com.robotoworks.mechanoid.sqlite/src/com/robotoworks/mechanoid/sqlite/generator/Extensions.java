package com.robotoworks.mechanoid.sqlite.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.util.Strings;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;


public class Extensions {	
	public static String toJavaTypeName(ColumnType type) {
		switch(type) {
		case TEXT:
			return "String";
		case INTEGER:
			return "long";
		case REAL:
			return "double";
		case BLOB:
			return "byte[]";
		case BOOLEAN:
			return "boolean";
		}
		
		return "!!ERROR!!";
	}
	
	public static boolean hasAndroidPrimaryKey(CreateViewStatement stmt) {
		EList<ResultColumn> resultColumns = getViewResultColumns(stmt);
		for(ResultColumn col : resultColumns) {
			if(col instanceof ResultColumnExpression) {
				ResultColumnExpression expr = (ResultColumnExpression) col;
				if(!Strings.isEmpty(expr.getName()) && expr.getName().equals("_id")) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static EList<ResultColumn> getViewResultColumns(CreateViewStatement stmt) {
		SelectCoreExpression coreExpr = stmt.getSelectStatement().getCore();
		if(coreExpr instanceof SelectCore) {
			SelectCore core = (SelectCore) coreExpr;
			return core.getRight().getResultColumns();
		} else {
			return coreExpr.getResultColumns();
		}
	}
	
	public static boolean hasAndroidPrimaryKey(CreateTableStatement stmt) {
		EList<ColumnDef> columns = stmt.getColumnDefs();
		for(ColumnDef col : columns) {
			if(col.getName().equals("_id")) {
				return true;
			}
		}
		
		return false;
	}
}
