/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.sqlite;

import android.database.sqlite.SQLiteDatabase;

/**
 * <p>Base for all generated Mechanoid DB migrations</p>
 *
 */
public abstract class SQLiteMigration {

	public abstract void up(SQLiteDatabase db);
}
