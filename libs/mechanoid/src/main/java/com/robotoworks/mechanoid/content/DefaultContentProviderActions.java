/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.content;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

import com.robotoworks.mechanoid.sqlite.ActiveRecord;
import com.robotoworks.mechanoid.sqlite.ActiveRecordFactory;
import com.robotoworks.mechanoid.sqlite.SQuery;
import com.robotoworks.mechanoid.util.Closeables;

/**
 * <p>Provides default implementation for CRUD content provider actions</p>
 * 
 * <p>Has two operating modes, one with URI's containing ID's, enabled by
 * setting forUrisWithId to true during construction, or URI's without ID's,
 * by setting forUrisWithId to false.
 * </p>
 * 
 * <p>Since content providers delegate all queries to actions, including active record queries,
 * this class requires an ActiveRecordFactory during construction so it knows how
 * to create ActiveRecord instances.</p>
 *
 * @see ContentProviderActions
 */
public class DefaultContentProviderActions extends ContentProviderActions {
	
	private String mSource;
	private ActiveRecordFactory<?> mRecordFactory;
	private boolean mForUrisWithId;

	/**
	 * <p>Create new default actions</p>
	 * @param source The source table or view name
	 * @param forUrisWithId Wether expected URI's have appended id's, if so
	 * then ids will be parsed and used in all CRUD actions
	 */
	public DefaultContentProviderActions(String source, boolean forUrisWithId) {
		this(source, forUrisWithId, null);
	}
	
	/**
	 * <p>Create new default actions</p>
	 * @param source The source table or view name
	 * @param forUrisWithId Wether expected URI's have appended id's, if so
	 * then ids will be parsed and used in all CRUD actions
	 * @param recordFactory A factory for creating ActiveRecord's, factories will be generated for
	 * each generated ActiveRecord
	 */
	public <T extends ActiveRecord> DefaultContentProviderActions(String source, boolean forUrisWithId, ActiveRecordFactory<T> recordFactory) {
		mSource = source;
		mForUrisWithId = forUrisWithId;
		mRecordFactory = recordFactory;
	}
	
	@Override
	public int delete(MechanoidContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		if(mForUrisWithId) {
			long id = ContentUris.parseId(uri);

			int affected = SQuery.newQuery()
					.expr(BaseColumns._ID, SQuery.Op.EQ, id)
					.append(selection, selectionArgs)
					.delete(db, mSource);
			
			return affected;
			
		} else {
			return db.delete(mSource, selection, selectionArgs);
		}
	}
	
	@Override
	public Uri insert(MechanoidContentProvider provider, Uri uri, ContentValues values){
		if(mForUrisWithId) {
			return null; // Not applicable for uris with id
		}
		
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();

		long id = db.insertOrThrow(mSource, null, values);
		
		if(id > -1) {
			return ContentUris.withAppendedId(uri, id);
		}
		
		return null;
	}
	
	@Override
	public int update(MechanoidContentProvider provider, Uri uri, ContentValues values, String selection, String[] selectionArgs){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		if(mForUrisWithId) {
			long id = ContentUris.parseId(uri);
		
			int affected = SQuery.newQuery()
					.expr(BaseColumns._ID, SQuery.Op.EQ, id)
					.append(selection, selectionArgs)
					.update(db, mSource, values);
		
			return affected;
		}
		else {
			return db.update(mSource, values, selection, selectionArgs);
		}
	}

	@Override
	public Cursor query(MechanoidContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		if(mForUrisWithId) {
			long id = ContentUris.parseId(uri);
		
			return SQuery.newQuery()
				.expr(BaseColumns._ID, SQuery.Op.EQ, id)
				.append(selection, selectionArgs)
				.query(db, mSource, projection, sortOrder);
		} else {
			return db.query(mSource, projection, selection, selectionArgs, null, null, sortOrder);
		}
	}
	
	@Override
    public int bulkInsert(MechanoidContentProvider provider, Uri uri, ContentValues[] values) {

    	final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
    	
    	int numValues = values.length;

    	try {
    	
	    	db.beginTransaction();
	    	
	        for (int i = 0; i < numValues; i++) {
	        	db.insertOrThrow(mSource, null, values[i]);
	        }
			
			db.setTransactionSuccessful();

			
    	} finally {
    		db.endTransaction();
    	}
    	
    	return numValues;
    }
    
	@SuppressWarnings("unchecked")
	@Override
	public <T extends ActiveRecord> List<T> selectRecords(MechanoidContentProvider provider, Uri uri, SQuery sQuery, String sortOrder) {
		if(mRecordFactory == null) {
			return null;
		}
		
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		Cursor c = null;
		
		ArrayList<T> items = new ArrayList<T>();
		
		try {
			c = db.query(mSource, mRecordFactory.getProjection(), sQuery.toString(), sQuery.getArgsArray(), null, null, sortOrder);
		    
		    while(c.moveToNext()) {
		        items.add((T)mRecordFactory.create(c));
	        }
	    } finally {
	        Closeables.closeSilently(c);
	    }
	    
	    return items;
	}
}
