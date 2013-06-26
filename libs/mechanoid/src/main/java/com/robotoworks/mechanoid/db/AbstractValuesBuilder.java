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

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;


/**
 * <p>Abstract base class for generated Mechanoid DB builders.</p>
 */
public abstract class AbstractValuesBuilder {
	protected ContentValues mValues = new ContentValues();
	private Uri mContentUri;
	private ContentResolver mContentResolver;
	
	/**
	 * @param context
	 * @param contentUri The content Uri this builder operates on
	 */
	protected AbstractValuesBuilder(Context context, Uri contentUri) {
		mContentResolver = context.getContentResolver();
		mContentUri = contentUri;
		
	}
	
	/**
	 * <p>Insert a record with the values set on this builder.</p>
	 */								
	public Uri insert() {
		return mContentResolver.insert(mContentUri, mValues);
	}
	
	/**
	 * <p>Insert a record with the values set on this builder.</p>
	 */								
	public Uri insert(boolean notifyChange) {
		
		Uri uri = mContentUri.buildUpon()
			.appendQueryParameter(
				MechanoidContentProvider.PARAM_NOTIFY, 
				String.valueOf(notifyChange)).build();
		
		return mContentResolver.insert(uri, mValues);
	}
	
	/**
	 * <p>Update a record with the given query</p>
	 */						
	public int update(SQuery query) {
		return mContentResolver.update(mContentUri, mValues, query.toString(), query.getArgsArray());
	}
	
	/**
	 * <p>Update with the given query</p>
	 */						
	public int update(SQuery query, boolean notifyChange) {
		
		Uri uri = mContentUri.buildUpon()
			.appendQueryParameter(
				MechanoidContentProvider.PARAM_NOTIFY, 
				String.valueOf(notifyChange)).build();

		return mContentResolver.update(uri, mValues, query.toString(), query.getArgsArray());
	}
	
	/**
	 * <p>Update with the given id</p>
	 */
	public int update(long id) {
		return mContentResolver.update(mContentUri.buildUpon().appendPath(String.valueOf(id)).build(), mValues, null, null);
	}
	
	/**
	 * <p>Update with the given id</p>
	 */
	public int update(long id, boolean notifyChange) {
		Uri uri = mContentUri.buildUpon()
			.appendPath(String.valueOf(id))
			.appendQueryParameter(
				MechanoidContentProvider.PARAM_NOTIFY, 
				String.valueOf(notifyChange)).build();
				
		return mContentResolver.update(uri, mValues, null, null);
	}
	
	/**
	 * <p>Get the underlying ContentValues built so far by this builder.</p>
	 */						
	public ContentValues getValues() {
		return mValues;
	}

	/**
	 * <p>Takes the values in this builder and creates a new 
	 * {@link ContentProviderOperation} as an insert operation.</p>
	 * 
	 * @see ContentProviderOperation#newInsert(Uri)
	 */								
	public ContentProviderOperation.Builder toInsertOperationBuilder() {
		return ContentProviderOperation
				.newInsert(mContentUri)
				.withValues(mValues);
	}
	
	/**
	 * <p>Takes the values in this builder and creates a new 
	 * {@link ContentProviderOperation} as an update operation.</p>
	 * 
	 * @see ContentProviderOperation#newUpdate(Uri)
	 */
	public ContentProviderOperation.Builder toUpdateOperationBuilder() {
		return ContentProviderOperation
				.newUpdate(mContentUri)
				.withValues(mValues);
	}
	
	/**
	 * <p>Takes the values in this builder and creates a new 
	 * {@link ContentProviderOperation} as an delete operation.</p>
	 * 
	 * @see ContentProviderOperation#newDelete(Uri)
	 */
	public ContentProviderOperation.Builder toDeleteOperationBuilder() {
		return ContentProviderOperation
				.newDelete(mContentUri);
	}
	
	/**
	 * <p>Takes the values in this builder and creates a new 
	 * {@link ContentProviderOperation} as an assert query operation.</p>
	 * 
	 * @see ContentProviderOperation#newAssertQuery(Uri)
	 */
	public ContentProviderOperation.Builder toAssertQueryOperationBuilder() {
		return ContentProviderOperation
				.newAssertQuery(mContentUri)
				.withValues(mValues);
	}
}
