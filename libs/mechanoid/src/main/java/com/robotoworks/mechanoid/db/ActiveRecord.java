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

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.util.Closeables;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;


/**
 * <p>Base for all generated Mechanoid DB ActiveRecord implementations</p>
 *
 */
public abstract class ActiveRecord {
	
	protected final Uri mContentUri;
	
	private long mId;
	
	public long getId() {
		return mId;
	}
	
	public void setId(long id) {
		if(mId != id) {
			makeDirty(true);
		}
		mId = id;
	}

	protected ActiveRecord(Uri contentUri) {
		mContentUri = contentUri;
	}
	
	protected abstract String[] _getProjection();
	
    protected abstract AbstractValuesBuilder createBuilder();
    
	public ContentValues toValues() {
		return createBuilder().getValues();
	}
	
    public abstract void makeDirty(boolean b);

    protected abstract void setPropertiesFromCursor(Cursor c);

    /**
     * <p>Save this record to the database, this is a convenience method, use
     * {@link #insert()} or {@link #update()} if you want to explicitly perform
     * an INSERT or UPDATE.</p>
     * 
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
		return save(true);
	}
	
	/**
	 * <p>Same as {@link #save()} but with the option to notify content observers that the record
	 * has changed, by default, content observers are always notified, set to false to disable.</p>
	 * @param notifyChange Whether to notify observers, default is true
     * @return the <b>id</b> of the record, the id property of this active record
     * will also be set
	 */
	public long save(boolean notifyChange){
		mId = mId > 0 ? update(notifyChange) : insert(notifyChange);
		
		return mId;
	}
	
	public boolean delete(){
		return delete(true);
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

	/**
	 * <p>Insert this record into the database</p>
     * @return the new <b>id</b> of the record, the id property of this active record
     * will also be updated
	 */
	public long insert() {
		return insert(true);
	}
	
	/**
	 * <p>Like {@link #insert()} with the option to enable/disable change notification.</p>
	 * @param notifyChange Whether to notify observers, default is true
     * @return the <b>id</b> of the record, the id property of this active record
     * will also be updated
	 */
	public long insert(boolean notifyChange) {
		AbstractValuesBuilder builder = createBuilder();
		
		Uri uri = builder.insert(notifyChange);
	    mId = ContentUris.parseId(uri);
	    
	    makeDirty(false);
	    
	    return mId;
	}

	/**
	 * <p>Updates this record into the database</p>
     * @return the <b>id</b> of the record, the id property of this active record
     * will also be updated
	 */
	public long update() {
		return update(true);
	}
	
	/**
	 * <p>Like {@link #update()} with the option to enable/disable change notification.</p>
	 * @param notifyChange Whether to notify observers, default is true
     * @return the <b>id</b> of the record, the id property of this active record
     * will also be updated
	 */
	public long update(boolean notifyChange) {
    	AbstractValuesBuilder builder = createBuilder();
    	
    	builder.update(mId, notifyChange);
    	
    	makeDirty(false);
		
    	return mId;
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

	public void reload(SQuery query){
		if(mId == 0) {
			return;
		}
	    
	    Cursor c = null;
	    
	    try {
	    	c = query.selectFirst(mContentUri, _getProjection());
	        
	        if(c.moveToFirst()) {
	        	setPropertiesFromCursor(c);
	        	makeDirty(false);
	        }
	    } finally {
	        Closeables.closeSilently(c);
	    }
	}
}
