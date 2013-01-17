package com.robotoworks.mechanoid.content;

import com.robotoworks.mechanoid.util.Closeables;

import android.database.Cursor;

public abstract class CursorWalker {
	protected abstract Cursor createCursor();
	protected abstract void step(Cursor cursor);
	/**
	 * @return number of records in the query
	 */
	public int walk() {
		Cursor cursor = null;
		
		try {
			cursor = createCursor();
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();	
				step(cursor);
			}
			
			return cursor.getCount();
			
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
}
