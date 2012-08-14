package com.robotoworks.mechanoid.sqlite.generator;

import java.util.LinkedHashMap;

import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateViewStatement;

public class DatabaseImage {
	public LinkedHashMap<String, CreateTableStatement> tables = new LinkedHashMap<String, CreateTableStatement>();

	public String packageName;

	public LinkedHashMap<String, CreateViewStatement> views = new LinkedHashMap<String, CreateViewStatement>();
}
