package com.robotoworks.mechanoid.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public abstract class ContentProviderActions {
	public int delete(MechanoidContentProvider provider, Uri uri, String selection, String[] selectionArgs){
		return -1;
	}
	
	public Uri insert(MechanoidContentProvider provider, Uri uri, ContentValues values){
		return null;
	}
	
	public Cursor query(MechanoidContentProvider provider, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder){
		return null;
	}
	
	public int update(MechanoidContentProvider provider, Uri uri, ContentValues values, String selection, String[] selectionArgs){
		return -1;
	}
}
