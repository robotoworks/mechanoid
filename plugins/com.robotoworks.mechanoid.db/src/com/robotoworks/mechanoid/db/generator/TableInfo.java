package com.robotoworks.mechanoid.db.generator;

import com.robotoworks.mechanoid.db.sqliteModel.CreateTableStatement;

import java.util.LinkedHashMap;

public class TableInfo {
    public LinkedHashMap<String, ColumnInfo> columns = new LinkedHashMap<String, ColumnInfo>();

    public String name;

    public boolean hasAndroidPrimaryKey;

    public CreateTableStatement obj;

}
