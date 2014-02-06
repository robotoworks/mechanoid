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
