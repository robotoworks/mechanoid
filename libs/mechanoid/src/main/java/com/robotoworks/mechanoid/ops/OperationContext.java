package com.robotoworks.mechanoid.ops;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class OperationContext {
	
	protected static final int MSG_ABORT = 1;
	
	private Context mApplicationContext;
	private OperationProcessor mProcessor;
	private Intent mIntent;
	private boolean mIsAborted;
	private int mAbortReason;
	
	Handler handler = new Handler() {

		public void handleMessage(Message msg) {
			if(msg.what == MSG_ABORT) {
				int reason = msg.arg1;
				abort(reason);
			}
		}
	};
	

	public void reset() {
		mApplicationContext = null;
		mProcessor = null;
		mIntent = null;
		mIsAborted = false;
		mAbortReason = 0;
	}
	
	/**
	 * <p>Provides a user defined reason to describe why the operation has been aborted.</p>
	 */
	public int getAbortReason() {
		return mAbortReason;
	}
	
	/**
	 * <p>Indicates if the operation has been aborted, operations should periodically check this
	 * value to determine if they should finish early.</p>
	 */
	public boolean isAborted() {
		return mIsAborted;
	}

	/**
	 * <p>Abort this operation, note the operation aborted state is only set but the operation
	 * is not actually terminated, operations should check {@link Operation#isAborted()} to determine
	 * if they should finish early.</p>
	 * @param reason A user defined reason code for aborting
	 */
	public void abort(int reason) {
		mIsAborted = true;
		mAbortReason = reason;
	}
	
	public Context getApplicationContext() {
		return mApplicationContext;
	}
	
	public Intent getIntent() {
		return mIntent;
	}
	
	void setApplicationContext(Context context) {
		mApplicationContext = context.getApplicationContext();
	}
	
	void setIntent(Intent intent) {
		mIntent = intent;
	}
	
	void setOperationProcessor(OperationProcessor processor) {
		this.mProcessor = processor;		
	}
	
	
	public void postProgress(int progress, Bundle data) {
		if(data == null) {
			data = new Bundle();
		}
		
		if(mProcessor != null) {
			mProcessor.notifyProgress(progress, data);
		}
	}
	
	public void postProgress(int progress) {
		postProgress(progress, null);
	}
}
