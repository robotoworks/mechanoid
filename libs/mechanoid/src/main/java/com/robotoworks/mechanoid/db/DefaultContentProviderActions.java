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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;

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
		String groupBy = uri.getQueryParameter(MechanoidContentProvider.PARAM_GROUP_BY);
		String limit = uri.getQueryParameter(MechanoidContentProvider.PARAM_LIMIT);
		String offset = uri.getQueryParameter(MechanoidContentProvider.PARAM_OFFSET);
		
		String sortAndLimitClause = buildSortAndClause(sortOrder, limit, offset);
		
		if(mForUrisWithId) {
			long id = ContentUris.parseId(uri);
		
			return SQuery.newQuery()
				.expr(BaseColumns._ID, SQuery.Op.EQ, id)
				.append(selection, selectionArgs)
				.query(db, mSource, projection, sortOrder, TextUtils.isEmpty(groupBy) ? null : groupBy);
		} else {
			return db.query(mSource, projection, selection, selectionArgs, TextUtils.isEmpty(groupBy) ? null : groupBy, null, sortAndLimitClause);
		}
	}
	
	private String buildSortAndClause(String sortOrder, String limit, String offset) {
		
		String limitClause = null;
		
		if(!TextUtils.isEmpty(limit)) {
			limitClause = " LIMIT " + limit;
		}
			
		if(!TextUtils.isEmpty(offset)) {
			limitClause = limitClause + " OFFSET " + offset;
		}
		
		if(limitClause != null) {
			return (sortOrder == null ? " 1" + limitClause : sortOrder + limitClause);
		} else {
			return sortOrder;
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
		
		String groupBy = uri.getQueryParameter(MechanoidContentProvider.PARAM_GROUP_BY);
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		Cursor c = null;
		
		ArrayList<T> items = new ArrayList<T>();
		
		try {
			c = db.query(mSource, mRecordFactory.getProjection(), sQuery.toString(), sQuery.getArgsArray(), TextUtils.isEmpty(groupBy) ? null : groupBy, null, sortOrder);
		    
		    while(c.moveToNext()) {
		        items.add((T)mRecordFactory.create(c));
	        }
	    } finally {
	        Closeables.closeSilently(c);
	    }
	    
	    return items;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends ActiveRecord> Map<String, T> selectRecordMap(
			MechanoidContentProvider provider, Uri uri, SQuery sQuery,
			String keyColumnName) {
		if(mRecordFactory == null) {
			return null;
		}
		String groupBy = uri.getQueryParameter(MechanoidContentProvider.PARAM_GROUP_BY);
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		Cursor c = null;
		
		HashMap<String, T> items = new HashMap<String, T>();
		
		try {
			c = db.query(mSource, mRecordFactory.getProjection(), sQuery.toString(), sQuery.getArgsArray(), TextUtils.isEmpty(groupBy) ? null : groupBy, null, null);
		    int keyColumnIndex = c.getColumnIndexOrThrow(keyColumnName);
		    
		    while(c.moveToNext()) {
		        items.put(c.getString(keyColumnIndex), (T)mRecordFactory.create(c));
	        }
	    } finally {
	        Closeables.closeSilently(c);
	    }
	    
	    return items;
	}
}
