/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.content;

import com.robotoworks.mechanoid.util.Closeables;

import android.database.Cursor;

/**
 * <p>A convenience class to iterate over all the rows in a cursor calling {@link #step(Cursor)} 
 * for each row and finally closing the cursor when no rows are left to walk.</p>
 * <p><b>Example:</b></p>
 * 
 * <code><pre>
 * new CursorWalker() {
 *     &#64Override
 *     protected Cursor createCursor() {
 *         return SQuery.newQuery().select(Books.CONTENT_URI);
 *     }
 *     
 *     &#64Override
 *     protected void step(Cursor cursor) {
 *         // TODO do something with each row
 *     } 
 * }.walk();
 * </pre></code>
 *
 */
public abstract class CursorWalker {
	/**
	 * <p>Create the cursor to walk</p>
	 * 
	 * @return A cursor
	 */
	protected abstract Cursor createCursor();
	
	/**
	 * <p>Called for each row of the cursor, each time it is called the cursor
	 * is moved to the next position until no more rows are left.</p>
	 * 
	 * @param cursor The cursor
	 */
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
