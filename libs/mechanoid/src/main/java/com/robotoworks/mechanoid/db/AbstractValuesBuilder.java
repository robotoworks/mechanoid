/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
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
				.newDelete(mContentUri)
				.withValues(mValues);
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
