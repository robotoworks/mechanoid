/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.ops;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public abstract class Operation {	
	protected static final int MSG_ABORT = 1;
	
	public static final String KEY_RESULT_CODE = "com.robotoworks.mechanoid.ops.KEY_RESULT_CODE";
	public static final String KEY_RESULT_ERROR = "com.robotoworks.mechanoid.ops.KEY_RESULT_ERROR";
	public static final String KEY_RESULT_REQUEST = "com.robotoworks.mechanoid.ops.KEY_RESULT_REQUEST";

	public static final int RESULT_OK = 0;
	public static final int RESULT_ERROR = 1;
	
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

	public int getAbortReason() {
		return mAbortReason;
	}
	
	public boolean isAborted() {
		return mIsAborted;
	}

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
	
	public static Bundle createResult(int code, Throwable error) {
		Bundle b = new Bundle();
		b.putInt(KEY_RESULT_CODE, code);
		b.putSerializable(KEY_RESULT_ERROR, error);
		return b;
	}
	
	public static Bundle createErrorResult(Throwable error) {
		Bundle b = new Bundle();
		b.putInt(KEY_RESULT_CODE, RESULT_ERROR);
		b.putSerializable(KEY_RESULT_ERROR, error);
		return b;
	}

	public static Bundle createOkResult() {
		Bundle b = new Bundle();
		b.putInt(KEY_RESULT_CODE, RESULT_OK);
		return b;
	}

	public static Bundle createOkResult(Bundle bundle) {
		bundle.putInt(KEY_RESULT_CODE, RESULT_OK);
		return bundle;
	}
	
	public static boolean isResultOk(Bundle bundle) {
		int code = bundle.getInt(KEY_RESULT_CODE, 0);
		if(code == RESULT_OK) {
			return true;
		}
		
		return false;
	}

	public static Intent getRequestFromResult(Bundle bundle) {
		Intent request = bundle.getParcelable(KEY_RESULT_REQUEST);
		
		return request;
	}
	
	public static Throwable getResultError(Bundle bundle) {
		Throwable t = (Throwable) bundle.getSerializable(KEY_RESULT_ERROR);
		return t;
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
	
	public abstract Bundle execute();
	
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