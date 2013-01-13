package com.robotoworks.mechanoid.content;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;

import com.robotoworks.mechanoid.sqlite.SQuery;

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
	 * @see ContentProviderOperation#newInsert(Uri)
	 */								
	public ContentProviderOperation.Builder newInsertOperationBuilder() {
		return ContentProviderOperation.newInsert(mContentUri);
	}
	
	/**
	 * @see ContentProviderOperation#newUpdate(Uri)
	 */
	public ContentProviderOperation.Builder newUpdateOperationBuilder() {
		return ContentProviderOperation.newUpdate(mContentUri);
	}
	
	/**
	 * @see ContentProviderOperation#newDelete(Uri)
	 */
	public ContentProviderOperation.Builder newDeleteOperationBuilder() {
		return ContentProviderOperation.newDelete(mContentUri);
	}
	
	/**
	 * @see ContentProviderOperation#newAssertQuery(Uri)
	 */
	public ContentProviderOperation.Builder newAssertQueryOperationBuilder() {
		return ContentProviderOperation.newAssertQuery(mContentUri);
	}
}
