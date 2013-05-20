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

public class OperationServiceBridge {	
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
	
	private int createRequestId() {
		return mRequestIdCounter++;
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
	public boolean isRequestPending(int id) {
		if(id <= 0) return false;
		
		return (mPendingRequests.get(id) != null);
	}
	
	/**
	 * Abort an operation
	 * 
	 * @param context
	 * @param requestId The id of the operation to abort
	 * @param reason A code used to identify a reason for aborting
	 */
	public void abort(Class<?> serviceClass, int requestId, int reason) {
		Context context = Mechanoid.getApplicationContext();
		Intent intent = new Intent(OperationService.ACTION_ABORT);
		intent.setClass(context, serviceClass);
		intent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);
		intent.putExtra(OperationService.EXTRA_REQUEST_ID, requestId);		
		intent.putExtra(OperationService.EXTRA_ABORT_REASON, reason);	
		
		context.startService(intent);
	}
	
	/**
	 * Execute an operation represented by the intent
	 * 
	 * @param context
	 * @param intent
	 * @return the request id
	 */
	public int execute(Intent intent) {		
		
		Intent clonedIntent = (Intent) intent.clone();
		
		int id = createRequestId();
		
		clonedIntent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);
		clonedIntent.putExtra(OperationService.EXTRA_REQUEST_ID, id);
		
		addPendingRequest(id, clonedIntent);
		
		Mechanoid.startService(intent);
		
		return id;
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
	
	protected void onOperationStarting(int id, Bundle data) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Starting] id:%s, data:%s", id, data));
		}
		
		Intent intent = mPendingRequests.get(id);
		
		if(intent != null) {
			if(data == null) {
				data = new Bundle();
			}
			notifyOperationStarting(id, intent, data);
		}
	}

	protected void onOperationComplete(int id, Bundle bundledResult) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Complete] id:%s, result:%s", id, bundledResult));
		}
		
		Intent intent = removePendingRequestById(id);

		OperationResult result = OperationResult.fromBundle(bundledResult);
		
		if(intent != null) {
			
			result.setRequest(intent);
			
			mLog.put(id, result);
			
			notifyOperationComplete(id, result);
		}
	}
	
	protected void onOperationProgress(int id, int progress, Bundle data) {
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Progress] id:%s, progress:%s, data:%s", id, progress, data));
		}
		
		Intent intent = mPendingRequests.get(id);
		
		if(intent != null) {
			notifyOperationProgress(id, intent, progress, data);
		}
	}
	
	protected void onOperationAborted(int id, int reason, Bundle data) {
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Aborted] id:%s, reason:%s, data:%s", id, reason, data));
		}
		
		Intent intent = removePendingRequestById(id);
		
		if(intent != null) {
			notifyOperationAborted(id, intent, reason, data);
		}
	}

	private void notifyOperationStarting(int id, Intent intent, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationStarting(id, intent, data);
			}
		}
	}

	private void notifyOperationComplete(int id, OperationResult result) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationComplete(id, result);
			}
		}
	}

	private void notifyOperationProgress(int id, Intent intent, int progress, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationProgress(id, intent, progress, data);
			}
		}
	}
	
	private void notifyOperationAborted(int id, Intent intent, int reason, Bundle data) {
		for(OperationServiceListener listener : mListeners) {
			if(listener != null) {
				listener.onOperationAborted(id, intent, reason, data);
			}
		}
	}

	public boolean intentContainsExtras(Intent intent, Bundle extras) {
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