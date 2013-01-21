package com.robotoworks.mechanoid.content;

import java.util.List;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import com.robotoworks.mechanoid.sqlite.ActiveRecord;
import com.robotoworks.mechanoid.sqlite.MechanoidSQLiteOpenHelper;
import com.robotoworks.mechanoid.sqlite.SQuery;

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
