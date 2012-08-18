package com.robotoworks.mechanoid.sqlite.generator;

import org.eclipse.emf.common.util.EList;

import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumn;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ResultColumnExpression;


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
		}
		
		return "!!ERROR!!";
	}
	
	public static boolean hasAndroidPrimaryKey(CreateViewStatement stmt) {
		EList<ResultColumn> resultColumns = stmt.getSelectStatement().getCore().getResultColumns();
		for(ResultColumn col : resultColumns) {
			if(col instanceof ResultColumnExpression) {
				ResultColumnExpression expr = (ResultColumnExpression) col;
				if(expr.getName() != null && !expr.getName().equals("") && expr.getName().equals("_id")) {
					return true;
				}
			}
		}
		
		return false;
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
