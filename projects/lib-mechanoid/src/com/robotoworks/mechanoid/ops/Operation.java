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

/**
 * <p>An abstract operation, with useful helper methods for dealing with operations.</p>
 *
 */
public abstract class Operation {	
	protected static final int MSG_ABORT = 1;
	
	/**
	 * The key for the result code in a result Bundle, should not normally need this to extract
	 * the result code
	 * @see Operation#createErrorResult(Throwable)
	 * @see Operation#createOkResult()
	 * @see Operation#isResultOk(Bundle)
	 * @see Operation#getResultError(Bundle)
	 */
	public static final String KEY_RESULT_CODE = "com.robotoworks.mechanoid.ops.KEY_RESULT_CODE";
	
	/**
	 * <p>The value of an error in a result Bundle, if {@link Operation#createErrorResult(Throwable)} 
	 * was used to create the result Bundle then the error should be of type {@link Throwable}.</p>
	 * 
	 * <p>Use one of the helpers {@link Operation#createErrorResult(Throwable)} and 
	 * {@link Operation#getResultError(Bundle)} to create and retrieve a result error in a Bundle.</p>
	 * 
	 */
	public static final String KEY_RESULT_ERROR = "com.robotoworks.mechanoid.ops.KEY_RESULT_ERROR";
	
	/**
	 * <p>Represents the operation request in a result Bundle, use {@link Operation#getRequestFromResult(Bundle)} to
	 * extract the request.</p>
	 */
	public static final String KEY_RESULT_REQUEST = "com.robotoworks.mechanoid.ops.KEY_RESULT_REQUEST";

	/**
	 * Represents a code indicating the operation completely successfully a result Bundle.
	 */
	public static final int RESULT_OK = 0;
	
	/**
	 * Represents a code indicating the operation completed with an error.
	 */
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
	 * <p>Create a operaiton result Bundle</p>
	 * @param code Usually {@link #RESULT_OK} or {@link #RESULT_ERROR} but can
	 * be any user defined value
	 * @param error The error that occurred during the operation if any
	 * @return A Bundle that represents the result of an operation
	 */
	public static Bundle createResult(int code, Throwable error) {
		Bundle b = new Bundle();
		b.putInt(KEY_RESULT_CODE, code);
		b.putSerializable(KEY_RESULT_ERROR, error);
		return b;
	}
	
	/**
	 * <p>Create an operation result Bundle as an error result, the result code
	 * will be set to {@link #RESULT_ERROR}.</p>
	 * @param error The error that occurred during the operation
	 * @return A Bundle that represents an error result of an operation
	 */
	public static Bundle createErrorResult(Throwable error) {
		Bundle b = new Bundle();
		b.putInt(KEY_RESULT_CODE, RESULT_ERROR);
		b.putSerializable(KEY_RESULT_ERROR, error);
		return b;
	}

	/**
	 * <p>Create an operation result Bundle as an OK result, which should indicate
	 * that the operation was a success, the result code will be set to {@link #RESULT_OK}.</p>
	 * @return A bundle that represents an operation result that completed successfully
	 */
	public static Bundle createOkResult() {
		Bundle b = new Bundle();
		b.putInt(KEY_RESULT_CODE, RESULT_OK);
		return b;
	}

	/**
	 * <p>Create an operation result Bundle as an OK result, which should indicate
	 * that the operation was a success, the result code will be set to {@link #RESULT_OK}.</p>
	 * @param bundle The bundle that should be used as the result bundle, this gives an opportunity
	 * to add arbitrary data to the result, must not be null
	 * @return A bundle that represents an operation result that completed successfully
	 */
	public static Bundle createOkResult(Bundle bundle) {
		if(bundle == null) {
			throw new RuntimeException("bundle cannot be null");
		}
		
		bundle.putInt(KEY_RESULT_CODE, RESULT_OK);
		return bundle;
	}
	
	/**
	 * <p>Check to see if the result is an OK result, an ok result is one which has a result code
	 * of {@link #RESULT_OK}.</p>
	 * @param bundle
	 * @return
	 */
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