package com.robotoworks.mechanoid.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class MechanoidSQLiteOpenHelper extends SQLiteOpenHelper {

	public MechanoidSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		for(int i = (oldVersion + 1); i <= newVersion; i++) {
			createMigration(i).up(db);
		}
	}

	protected abstract SQLiteMigration createMigration(int version);
	
}
