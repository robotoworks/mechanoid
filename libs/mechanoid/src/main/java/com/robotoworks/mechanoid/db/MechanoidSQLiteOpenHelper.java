/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

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
		
    		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
    			db.setForeignKeyConstraintsEnabled(true);
    		else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO)
    			db.execSQL("PRAGMA foreign_keys=ON;");
    	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		for(int i = (oldVersion + 1); i <= newVersion; i++) {
			createMigration(i).up(db);
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
