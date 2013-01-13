package com.robotoworks.mechanoid.sqlite;

import android.database.sqlite.SQLiteDatabase;

public abstract class SQLiteMigration {

	public abstract void up(SQLiteDatabase db);
}
