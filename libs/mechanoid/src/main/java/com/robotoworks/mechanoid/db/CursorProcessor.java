package com.robotoworks.mechanoid.db;

import android.database.Cursor;

public interface CursorProcessor {
	public Cursor process(Cursor cursor);
}
