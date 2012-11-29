package com.robotoworks.mechanoid.content;

import com.robotoworks.mechanoid.util.Closeables;

import android.database.Cursor;

public abstract class CursorWalker {
	protected abstract Cursor createCursor();
	protected abstract void step(Cursor cursor);
	public void walk() {
		Cursor cursor = null;
		
		try {
			cursor = createCursor();
			
			for(int i=0; i < cursor.getCount(); i++) {
				cursor.moveToNext();	
				step(cursor);
			}
		} finally {
			Closeables.closeSilently(cursor);
		}
	}
}
