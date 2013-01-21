package com.robotoworks.mechanoid.content;

import java.util.List;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

import com.robotoworks.mechanoid.sqlite.ActiveRecord;
import com.robotoworks.mechanoid.sqlite.SQuery;

public class DefaultContentProviderActions extends ContentProviderActions {
	
	private String mSource;

	public DefaultContentProviderActions(String source) {
		mSource = source;
	}
	
	@Override
	public int delete(MechanoidContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		long id = ContentUris.parseId(uri);
		
		if(id == -1) {
			return db.delete(mSource, selection, selectionArgs);
		}
		
		int affected = SQuery.newQuery()
				.expr(BaseColumns._ID, SQuery.Op.EQ, id)
				.append(selection, selectionArgs)
				.delete(db, mSource);
		
		return affected;
	}
	
	@Override
	public Uri insert(MechanoidContentProvider provider, Uri uri, ContentValues values){
		if(ContentUris.parseId(uri) == -1) {
			return null; // Cannot insert on _id
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
		
		long id = ContentUris.parseId(uri);
		
		SQuery query = SQuery.newQuery();
		
		if(id > -1) {
			query.expr(BaseColumns._ID, SQuery.Op.EQ, id);
		}
		
		int affected = query.append(selection, selectionArgs).update(db, mSource, values);
		
		return affected;
	}

	@Override
	public Cursor query(MechanoidContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){
		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
		
		long id = ContentUris.parseId(uri);
		
		SQuery query = SQuery.newQuery();
		
		if(id > -1) {
			query.expr(BaseColumns._ID, SQuery.Op.EQ, id);
		}
		
		return query.append(selection, selectionArgs)
				.query(db, mSource, projection, sortOrder);
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
//		final SQLiteDatabase db = provider.getOpenHelper().getWritableDatabase();
//		
//		Cursor c = null;
//		
//		ArrayList<T> items = new ArrayList<T>();
//		
//		try {
//			c = db.query(mSource, BasketItemAccessoriesRecord.PROJECTION, sQuery.toString(), sQuery.getArgsArray(), null, null, sortOrder);
//		    
//		    while(c.moveToNext()) {
//		        items.add((T)BasketItemAccessoriesRecord.fromCursor(c));
//	        }
//	    } finally {
//	        Closeables.closeSilently(c);
//	    }
//	    
//	    return items;
		
		return null;
	}
}
