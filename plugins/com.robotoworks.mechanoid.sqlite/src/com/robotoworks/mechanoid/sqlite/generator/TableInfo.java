package com.robotoworks.mechanoid.sqlite.generator;

import java.util.LinkedHashMap;

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;

public class TableInfo {
	public LinkedHashMap<String, ColumnInfo> columns = new LinkedHashMap<String, ColumnInfo>();
	
	public String name;

	public boolean hasAndroidPrimaryKey;

	public CreateTableStatement obj;

}
