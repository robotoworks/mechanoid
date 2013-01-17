/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.ops;

import java.util.Set;
import java.util.WeakHashMap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;

import com.robotoworks.mechanoid.Mechanoid;

public abstract class OperationServiceBridge {	
	public static final int MSG_OPERATION_STARTING = 1;
	public static final int MSG_OPERATION_COMPLETE = 2;
	public static final int MSG_OPERATION_PROGRESS = 3;
	public static final int MSG_OPERATION_ABORTED = 4;
	
	private int mRequestIdCounter = 1;
	
	protected final String mLogTag;
	protected final boolean mEnableLogging;
	
	private SparseArray<Intent> mPendingRequests = new SparseArray<Intent>();
			
	private Set<OperationServiceListener> mListeners = com.robotoworks.mechanoid.internal.util.Collections.newSetFromMap(new WeakHashMap<OperationServiceListener, Boolean>());

	private OperationLog mLog = new OperationLog(20);
	
	public OperationLog getLog() {
		return mLog;
	}
	
	private Messenger messenger = new Messenger(new Handler() {

		@Override
		public void handleMessage(Message msg) {
			switch(msg.what) {
				case MSG_OPERATION_STARTING: {
					
					int id = msg.arg1;
					Bundle data = msg.getData();
					
					onOperationStarting(id, data);
					break;
				}
				case MSG_OPERATION_COMPLETE: {
					int id = msg.arg1;
					Bundle data = msg.getData();
					
					onOperationComplete(id, data);
					break;
				}
				case MSG_OPERATION_PROGRESS: {
					int id = msg.arg1;
					int progress = msg.arg2;
					Bundle data = msg.getData();
					
					onOperationProgress(id, progress, data);
					break;
				}
				case MSG_OPERATION_ABORTED: {
					int id = msg.arg1;
					int reason = msg.arg2;
					Bundle data = msg.getData();
					onOperationAborted(id, reason, data);
					break;
				}
			}
		}
	});
	
	public OperationServiceBridge(boolean enableLogging) {
		mLogTag = this.getClass().getSimpleName();
		mEnableLogging = enableLogging;
	}

	protected abstract Class<?> getServiceClass();
	
	private int createRequestId() {
		return mRequestIdCounter++;
	}
		
	/**
	 * Extends an operation intent with extra info for a service request
	 * @param context
	 * @param intent
	 * @return request id
	 */
	protected int createServiceRequest(Intent intent) {
		Context context = Mechanoid.getApplicationContext();
		int id = createRequestId();
		intent.setClass(context, getServiceClass());
		intent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);
		intent.putExtra(OperationService.EXTRA_REQUEST_ID, id);
		intent.putExtra(OperationService.EXTRA_REQUEST_ID, id);
		
		addPendingRequest(id, intent);
		
		return id;
	}
	
	private void addPendingRequest(int requestId, Intent intent) {
		if(mEnableLogging) {
			Log.d(mLogTag, "[Added Request] " + intent.toString());
		}
		
		mPendingRequests.put(requestId, intent);
	}
	
	/**
	 * Find a pending request with the given action
	 * @param action The action
	 * @return An intent that represents the found request, or null if no matching
	 * request was found
	 */
	public Intent findPendingRequestByAction(String action) {
		for (int i = 0; i < mPendingRequests.size(); i++) {
			Intent request = mPendingRequests.valueAt(i);
			if(request.getAction().equals(action)) {
				return request;
			}
		}
		
		return null;
	}
	
	/**
	 * Find a pending request matching the given action and extras
	 * @param action The action
	 * @param extras The extras
	 * @return An intent that represents the matching request with extras or null
	 * if no matching request was found
	 */
	public Intent findPendingRequestByActionWithExtras(String action, Bundle extras) {
		for (int i = 0; i < mPendingRequests.size(); i++) {
			Intent request = mPendingRequests.valueAt(i);
			if(request.getAction().equals(action) && intentContainsExtras(request, extras)) {
				return request;
			}
		}
		
		return null;
	}
	
	private Intent removePendingRequestById(int requestId) {
		Intent intent = mPendingRequests.get(requestId);
		mPendingRequests.delete(requestId);
		return intent;
	}
	

	protected int extractRequestId(Intent intent) {
		return intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
	}
	
	/**
	 * Check if a request with the given id is pending
	 * 
	 * @param requestId
	 * @return true if the request is pending, false if the request was not found
	 */
	public boolean isRequestPending(int requestId) {
		if(requestId <= 0) return false;
		
		return (mPendingRequests.get(requestId) != null);
	}
	
	/**
	 * Abort an operation
	 * 
	 * @param context
	 * @param requestId The id of the operation to abort
	 * @param reason A code used to identify a reason for aborting
	 */
	public void abort(int requestId, int reason) {
		Context context = Mechanoid.getApplicationContext();
		Intent intent = new Intent(OperationService.ACTION_ABORT);
		intent.setClass(context, getServiceClass());
		intent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);
		intent.putExtra(OperationService.EXTRA_REQUEST_ID, requestId);		
		intent.putExtra(OperationService.EXTRA_ABORT_REASON, reason);	
		
		context.startService(intent);
	}
	
	/**
	 * Execute an arbitrary request, this is for advanced use only, useful if
	 * you need to reissue a request with the same request id, its assumed that
	 * the intent used when invoking this method will provide a request id.
	 * 
	 * @param context
	 * @param intent
	 * @return the request id
	 */
	public int execute(Intent intent) {
		
		Context context = Mechanoid.getApplicationContext();
		
		intent.setClass(context, getServiceClass());
		intent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);

		int requestId = intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
		
		addPendingRequest(requestId, intent);
		
		context.startService(intent);
		
		return requestId;
	}
	
	/**
	 * Register a listener with this service bridge
	 * 
	 * @param listener The listener to register
	 */
	public void bindListener(OperationServiceListener listener) {
		this.mListeners.add(listener);
	}
	
	/**
	 * Unregister a previously registered listener
	 * 
	 * @param listener The listener to unregister
	 */
	public void unbindListener(OperationServiceListener listener) {
		this.mListeners.remove(listener);
	}
	
	protected void onOperationStarting(int requestId, Bundle data) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Starting] id:%s, data:%s", requestId, data));
		}
		
		Intent intent = mPendingRequests.get(requestId);
		
		if(intent != null) {
			if(data == null) {
				data = new Bundle();
			}
 			data.putParcelable(Operation.KEY_RESULT_REQUEST, intent);
			notifyOperationStarting(requestId, data);
		}
	}

	protected void onOperationComplete(int requestId, Bundle data) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Complete] id:%s, data:%s", requestId, data));
		}
		
		Intent intent = removePendingRequestById(requestId);

		if(intent != null) {

			if(data == null) {
				data = new Bundle();
			}

			data.putParcelable(Operation.KEY_RESULT_REQUEST, intent);

			mLog.put(requestId, data);
			
			notifyOperationComplete(requestId, data);
		}
	}
	
	protected void onOperationProgress(int requestId, int progress, Bundle data) {
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Progress] id:%s, progress:%s, data:%s", requestId, progress, data));
		}
		
		Intent intent = mPendingRequests.get(requestId);
		
		if(intent != null) {

			if(data == null) {
				data = new Bundle();
			}

 			data.putParcelable(Operation.KEY_RESULT_REQUEST, intent);

			notifyOperationProgress(requestId, progress, data);
		}
	}
	
	protected void onOperationAborted(int requestId, int reason, Bundle data) {
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Aborted] id:%s, reason:%s, data:%s", requestId, reason, data));
		}
		
		Intent intent = removePendingRequestById(requestId);
		
		if(intent != null) {

			if(data == null) {
				data = new Bundle();
			}

			data.putParcelable(Operation.KEY_RESULT_REQUEST, intent);

			notifyOperationAborted(requestId, reason, data);
		}
	}

	private void notifyOperationStarting(int requestId, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationStarting(this, requestId, data);
			}
		}
	}

	private void notifyOperationComplete(int requestId, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationComplete(this, requestId, data);
			}
		}
	}

	private void notifyOperationProgress(int requestId, int progress, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationProgress(this, requestId, progress, data);
			}
		}
	}
	
	private void notifyOperationAborted(int requestId, int reason, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationAborted(this, requestId, reason, data);
			}
		}
	}

	protected boolean intentContainsExtras(Intent intent, Bundle extras) {
		Bundle intentExtras = intent.getExtras();
		
		for(String key : extras.keySet()) {
			Object a = extras.get(key);
			Object b = intentExtras.get(key);
			
			if(b == null) {
				return false;
			}
			
			if(!b.equals(a)) {
				return false;
			}			
		}
		
		return true;
	}
}