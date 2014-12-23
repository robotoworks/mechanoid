package com.robotoworks.mechanoid.db;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class CursorLoader extends android.support.v4.content.CursorLoader {

	private CursorProcessor mCursorProcessor;

	public CursorLoader(CursorProcessor processor, Context context, Uri uri, String[] projection,
			String selection, String[] selectionArgs, String sortOrder) {
		super(context, uri, projection, selection, selectionArgs, sortOrder);
		mCursorProcessor = processor;
	}
	
	@Override
	public Cursor loadInBackground() {
		Cursor cursor = super.loadInBackground();
		
		if(cursor != null && mCursorProcessor !=null) {
			cursor = mCursorProcessor.process(cursor);
		}
		
		return cursor;
	}
}
