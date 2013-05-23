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
package com.robotoworks.mechanoid.ops;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * <p>An abstract operation</p>
 *
 */
public abstract class Operation {	
	protected static final int MSG_ABORT = 1;
	
	private Context mContext;
	private OperationProcessor mProcessor;
	private Intent mIntent;
	private boolean mIsAborted;
	private int mAbortReason;
	
	protected Handler handler = new Handler() {

		public void handleMessage(Message msg) {
			if(msg.what == MSG_ABORT) {
				int reason = msg.arg1;
				abort(reason);
			}
		}
	};

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
	
	public Context getContext() {
		return mContext;
	}
	
	public Intent getIntent() {
		return mIntent;
	}
	
	/**
	 * <p>Helper method to extract an operation id from an operation intent</p>
	 * 
	 * @param intent The intent to extract the id from
	 * @return An operation id
	 */
	public static int getOperationRequestId(Intent intent) {
		return intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, -1);
	}
	
	public void setContext(Context context) {
		mContext = context;
	}
	
	public void setIntent(Intent intent) {
		mIntent = intent;
	}
	
	public void setOperationProcessor(OperationProcessor processor) {
		this.mProcessor = processor;		
	}
	
	public abstract OperationResult execute();
	
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