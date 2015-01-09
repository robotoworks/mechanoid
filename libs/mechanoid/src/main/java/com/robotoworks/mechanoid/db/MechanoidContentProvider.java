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
import java.util.List;
import java.util.Map;
import java.util.Set;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;


/**
 * <p>Base for all generated Mechanoid content providers</p>
 *
 */
public abstract class MechanoidContentProvider extends ContentProvider {
	
	public static final String PARAM_NOTIFY = "mechdb_notify";
	public static final String PARAM_GROUP_BY = "mechdb_group_by";
	public static final String PARAM_LIMIT = "mechdb_limit";
	public static final String PARAM_OFFSET = "mechdb_offset";
	
    private MechanoidSQLiteOpenHelper mOpenHelper;

	private UriMatcher mUriMatcher;
    private String[] mContentTypes;
    
    public MechanoidSQLiteOpenHelper getOpenHelper() {
		return mOpenHelper;
	}
    
	protected int matchUri(Uri uri) {
		return mUriMatcher.match(uri);
	}
    
	@Override
	public boolean onCreate() {
        final Context context = getContext();
        mUriMatcher = createUriMatcher();
        mContentTypes = createContentTypes();
        mOpenHelper = createOpenHelper(context);
		return true;
	}
	
	protected abstract UriMatcher createUriMatcher();
	
	protected abstract String[] createContentTypes();
	
	protected abstract ContentProviderActions createActions(int id);

	protected abstract MechanoidSQLiteOpenHelper createOpenHelper(Context context);
	
	protected abstract Set<Uri> getRelatedUris(Uri uri);

    /**
     * Notifies a change (invokes {@link ContentResolver#notifyChange(Uri, android.database.ContentObserver) 
     * if {@link PARAM_NOTIFY} parameter is not present in the given Uri, or, if it
     * is present and set to a value other than the string <em>true</em>.
     * @param uri The uri to notify on.
     */
    protected void tryNotifyChange(Uri uri) {
        boolean notify = true;
		
		String paramNotify = uri.getQueryParameter(PARAM_NOTIFY);
		
		if(paramNotify != null) {
		    notify = Boolean.valueOf(paramNotify);
		}
		
		if(notify) {
		    getContext().getContentResolver().notifyChange(uri, null);
		    
		    if(uri.getPathSegments().size() > 0) {
			    Uri key = new Uri.Builder()
			    	.scheme(uri.getScheme())
			    	.authority(uri.getAuthority())
			    	.appendPath(uri.getPathSegments().get(0))
			    	.build();
			    
			    Set<Uri> relatedUris = getRelatedUris(key);
			    
			    if(relatedUris != null) {
				    for(Uri relatedUri : relatedUris) {
				    	getContext().getContentResolver().notifyChange(relatedUri, null);
				    }
			    }
		    }
		}
    }
    
    /**
     * Sets the Uri as the notification Uri on the given Cursor if the Uri is not null, and
     * the {@link PARAM_NOTIFY} parameter is not present in the given Uri, or, if it is present
     * and set to a value other than the string <em>true</em>
     * @param cursor
     * @param uri
     */
    protected void trySetNotificationUri(Cursor cursor, Uri uri) {
    	if(cursor == null) {
    		return;
    	}
    	
    	boolean notify = true;
    	
    	String paramNotify = uri.getQueryParameter(PARAM_NOTIFY);
    	
    	if(paramNotify != null) {
    		notify = Boolean.valueOf(paramNotify);
    	}
    	
    	if(notify) {
    		cursor.setNotificationUri(getContext().getContentResolver(), uri);
    	}
    }
    
    @Override
    public String getType(Uri uri) {
        final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		return mContentTypes[match];
    }
    
	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		int affected = createActions(match).delete(this, uri, selection, selectionArgs);
		
		if(affected > 0) {
			tryNotifyChange(uri);
		}
		
		return affected;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {

		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		Uri newUri = createActions(match).insert(this, uri, values);
		
		if(newUri != null) {
			tryNotifyChange(uri);
		}
		
		return newUri;
	}
	
	@Override
    public int bulkInsert(Uri uri, ContentValues[] values) {
    	
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		int affected = createActions(match).bulkInsert(this, uri, values);
		
		if(affected > 0) {
			tryNotifyChange(uri);
		}
		
		return affected;
    }
	
	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		Cursor cursor = createActions(match).query(this, uri, projection, selection, selectionArgs, sortOrder);

		trySetNotificationUri(cursor, uri);
		
		return cursor;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
		final int match = matchUri(uri);

		if(match == UriMatcher.NO_MATCH) {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		
		int affected = createActions(match).update(this, uri, values, selection, selectionArgs);

		if(affected > 0) {
			tryNotifyChange(uri);
		}

		return affected;
	}

    public <T extends ActiveRecord> List<T> selectRecords(Uri uri, SQuery sQuery, String sortOrder) {
        final int match = matchUri(uri);

        if(match == UriMatcher.NO_MATCH) {
            throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
        
        return createActions(match).selectRecords(this, uri, sQuery, sortOrder);
    }
    
    public <T extends ActiveRecord> Map<String, T> selectRecordMap(Uri uri, SQuery sQuery, String keyColumnName) {
    	final int match = matchUri(uri);
    	
    	if(match == UriMatcher.NO_MATCH) {
    		throw new UnsupportedOperationException("Unknown uri: " + uri);
    	}
    	
    	return createActions(match).selectRecordMap(this, uri, sQuery, keyColumnName);
    }
    
    @Override
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations)
            throws OperationApplicationException {
        final SQLiteDatabase db = getOpenHelper().getWritableDatabase();
        db.beginTransaction();
        try {
            final int numOperations = operations.size();
            final ContentProviderResult[] results = new ContentProviderResult[numOperations];
            for (int i = 0; i < numOperations; i++) {
                results[i] = operations.get(i).apply(this, results, i);
            }
            db.setTransactionSuccessful();
            return results;
        } finally {
            db.endTransaction();
        }
    }
}
