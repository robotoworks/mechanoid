package com.robotoworks.mechanoid.sqlite;

import android.database.Cursor;


public abstract class ActiveRecordFactory<T extends ActiveRecord> {
	public abstract T create(Cursor c);
	public abstract String[] getProjection();
}
