package com.robotoworks.mechanoid.sqlite;

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.content.AbstractValuesBuilder;
import com.robotoworks.mechanoid.content.MechanoidContentProvider;
import com.robotoworks.mechanoid.util.Closeables;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;


public abstract class ActiveRecord {
	
	protected final Uri mContentUri;
	
	private long mId;
	
	public long getId() {
		return mId;
	}
	
	public void setId(long id) {
		mId = id;
	}

	protected ActiveRecord(Uri contentUri) {
		mContentUri = contentUri;
	}
	
	protected abstract String[] _getProjection();
	
    protected abstract AbstractValuesBuilder createBuilder();
    
    public abstract void makeDirty(boolean b);

    protected abstract void setPropertiesFromCursor(Cursor c);

    /**
     * <p>If the <b>id</b> column for this record is zero, then saving will cause
     * an insert, after saving the <b>id</b> will be set with the new id of the inserted record,
     * If the id column is not zero, then saving will cause an update to the record with the <b>id</b>.
     * </p>
     * 
     * @param resolver the resolver
     * @return the new <b>id</b> of the record, the id property of this active record
     * will also be updated
     */
	public long save(){
		AbstractValuesBuilder builder = createBuilder();
		
		if(mId > 0) {
		    builder.update(mId);
		} else {
		    Uri uri = builder.insert();
		    mId = ContentUris.parseId(uri);
		}
		
		makeDirty(false);
		
		return mId;
	}
	
	/**
	 * <p>Same as {@link #save()} but with the option to notify content observers that the record
	 * has changed, by default, content observers are always notified, set to false to disable.</p>
	 * @param notifyChange Wether to notify observers, default is true
     * @return the new <b>id</b> of the record, the id property of this active record
     * will also be updated
	 */
	public long save(boolean notifyChange){
		AbstractValuesBuilder builder = createBuilder();
		
		if(mId > 0) {
		    builder.update(mId, notifyChange);
		} else {
		    Uri uri = builder.insert(notifyChange);
		    mId = ContentUris.parseId(uri);
		}
		
		makeDirty(false);
		
		return mId;
	}
	
	public int update(SQuery query){
		AbstractValuesBuilder builder = createBuilder();
		
		int affected = builder.update(query);
		
		makeDirty(false);
		
		return affected;
	}
	
	public int update(SQuery query, boolean notifyChange){
		AbstractValuesBuilder builder = createBuilder();
		
		int affected = builder.update(query, notifyChange);
		
		makeDirty(false);
		
		return affected;
	}
	
	public boolean delete(){
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		boolean result = resolver.delete(
				mContentUri.buildUpon()
			.appendPath(String.valueOf(mId)).build(), null, null) > 0;
			
		makeDirty(false);
		
		return result;
	}
	
	public boolean delete(boolean notifyChange){
		ContentResolver resolver = Mechanoid.getContentResolver();
		
		Uri uri = mContentUri.buildUpon()
			.appendPath(String.valueOf(mId))
			.appendQueryParameter(
				MechanoidContentProvider.PARAM_NOTIFY, 
				String.valueOf(notifyChange)).build();

		boolean result = resolver.delete(uri, null, null) > 0;
			
		makeDirty(false);
		
		return result;
	}
	
	public void reload(){
		if(mId == 0) {
			return;
		}
	    
	    Cursor c = null;
	    
	    ContentResolver resolver = Mechanoid.getContentResolver();
	    
	    try {
	        c = resolver.query(mContentUri.buildUpon()
			.appendPath(String.valueOf(mId)).build(), _getProjection(), null, null, null);
	        
	        if(c.moveToFirst()) {
	        	setPropertiesFromCursor(c);
	        	makeDirty(false);
	        }
	    } finally {
	        Closeables.closeSilently(c);
	    }
	}

}
