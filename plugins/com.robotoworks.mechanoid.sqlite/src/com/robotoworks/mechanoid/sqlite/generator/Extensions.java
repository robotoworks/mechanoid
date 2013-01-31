package com.robotoworks.mechanoid.sqlite.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.util.Strings;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnSource;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCore;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectCoreExpression;
import com.robotoworks.mechanoid.sqlite.sqliteModel.SelectExpression;


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
		EList<ColumnSource> resultColumns = getViewResultColumns(stmt);
		for(ColumnSource col : resultColumns) {
			if(!Strings.isEmpty(col.getName()) && col.getName().equals("_id")) {
				return true;
			}
		}
		
		return false;
	}
	
	public static EList<ColumnSource> getViewResultColumns(CreateViewStatement stmt) {
		SelectCoreExpression coreExpr = stmt.getSelectStatement().getCore();
		if(coreExpr instanceof SelectCore) {
			SelectCore core = (SelectCore) coreExpr;
			return ((SelectExpression)core.getRight()).getSelectList().getResultColumns();
		} else {
			return ((SelectExpression)coreExpr).getSelectList().getResultColumns();
		}
	}
	
	public static boolean hasAndroidPrimaryKey(CreateTableStatement stmt) {
		EList<ColumnSource> columns = stmt.getColumnDefs();
		for(ColumnSource col : columns) {
			if(col.getName().equals("_id")) {
				return true;
			}
		}
		
		return false;
	}
}
