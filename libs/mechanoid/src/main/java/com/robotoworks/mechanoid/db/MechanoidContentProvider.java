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

import java.util.List;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;


/**
 * <p>Base for all generated Mechanoid content providers</p>
 *
 */
public abstract class MechanoidContentProvider extends ContentProvider {
	
	public static final String PARAM_NOTIFY = "mechdb_notify";
	
    private MechanoidSQLiteOpenHelper mOpenHelper;
    
    public MechanoidSQLiteOpenHelper getOpenHelper() {
		return mOpenHelper;
	}
    
	@Override
	public boolean onCreate() {
        final Context context = getContext();
        mOpenHelper = createOpenHelper(context);
		return true;
	}
	
	protected abstract ContentProviderActions createActions(int id);

	protected abstract MechanoidSQLiteOpenHelper createOpenHelper(Context context);

	public <T extends ActiveRecord> List<T> selectRecords(Uri uri, SQuery sQuery, String sortOrder) {
		return null;
	}
	
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
}
