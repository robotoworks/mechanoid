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
