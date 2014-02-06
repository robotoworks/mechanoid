/*
 * Copyright 2013 Robotoworks Limited
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robotoworks.mechanoid.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/**
 * <p>Base for all Mechanoid DB open helpers.</p>
 *
 */
public abstract class MechanoidSQLiteOpenHelper extends SQLiteOpenHelper {

	public MechanoidSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	@Override
    	public void onConfigure(SQLiteDatabase db) {
        	// Enable foreign key constraints
        	if (db.isReadOnly() || !shouldEnableForeignKeyConstraints())
        		return;
		
    		if (Build.VERSION.SDK_INT >= 16)
    			db.setForeignKeyConstraintsEnabled(true);
    		else if (Build.VERSION.SDK_INT >= 8)
    			db.execSQL("PRAGMA foreign_keys=ON;");
    	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		applyMigrations(db, oldVersion, newVersion);
	}

	protected void applyMigrations(SQLiteDatabase db, int from, int to) {
		for(int i = from; i < to; i++) {
			SQLiteMigration migration = createMigration(i);
			migration.onBeforeUp(db);
			migration.up(db);
			migration.onAfterUp(db);
		}
	}

	protected abstract SQLiteMigration createMigration(int version);
	
	/**
	 * <p>Enables SQLite foreign key constraint checking on Android 2.2+ (API level 8+).
	 * This is required for cascading delete or update triggers.</p>
	 * @return {@code true} indicates to enable foreign key constraints, but only on Android 2.2+
	 */ 
	protected boolean shouldEnableForeignKeyConstraints() {
		return false;
	}
}
