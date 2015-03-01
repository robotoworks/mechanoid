package com.robotoworks.mechanoid.db;

import android.database.Cursor;

import com.robotoworks.mechanoid.db.SQuery.Async;
import com.robotoworks.mechanoid.db.SQuery.AsyncQueryCallback;

public class AsyncQuery {
	final AsyncQueryCallback callback;
	final int token;
	private Async async;
	private boolean mComplete;
	private Cursor mResult;
	
	public AsyncQuery(Async async, int token, AsyncQueryCallback callback) {
		this.token = token;
		this.callback = callback;
		this.async = async;
	}
	
	public void cancel() {
		async.cancelOperation(token);
	}
	
	public boolean isComplete() {
		return mComplete;
	}
	
	public Cursor getResult() {
		return mResult;
	}
	
	void completeQuery(Cursor cursor) {
		mComplete = true;
		mResult = cursor;
		callback.onQueryComplete(cursor);
	}
}