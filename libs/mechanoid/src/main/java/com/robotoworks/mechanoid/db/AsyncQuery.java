package com.robotoworks.mechanoid.db;

import com.robotoworks.mechanoid.db.SQuery.Async;
import com.robotoworks.mechanoid.db.SQuery.AsyncQueryCallback;

public class AsyncQuery {
	final AsyncQueryCallback callback;
	final int token;
	private Async async;
	
	public AsyncQuery(Async async, int token, AsyncQueryCallback callback) {
		this.token = token;
		this.callback = callback;
		this.async = async;
	}
	
	public void cancel() {
		async.cancelOperation(token);
	}
}