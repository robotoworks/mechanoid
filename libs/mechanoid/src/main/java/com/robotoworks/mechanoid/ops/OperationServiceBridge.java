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

import java.lang.reflect.Field;
import java.util.Hashtable;
import java.util.Set;
import java.util.WeakHashMap;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.SparseArray;

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.ReflectUtil;

public class OperationServiceBridge {	
	public static final int MSG_OPERATION_STARTING = 1;
	public static final int MSG_OPERATION_COMPLETE = 2;
	public static final int MSG_OPERATION_PROGRESS = 3;
	public static final int MSG_OPERATION_ABORTED = 4;
	
	private int mRequestIdCounter = 1;
	
	private Hashtable<String, OperationServiceConfiguration> mConfigurations = new Hashtable<String, OperationServiceConfiguration>();
	
	private SparseArray<Intent> mPendingRequests = new SparseArray<Intent>();
			
	private Set<OperationServiceListener> mListeners = com.robotoworks.mechanoid.internal.util.Collections.newSetFromMap(new WeakHashMap<OperationServiceListener, Boolean>());

	private OperationLog mLog = new OperationLog(60);
	
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
	
	public OperationServiceBridge() {
		initConfigurations();
	}

	protected void initConfigurations() {
		String packageName = Mechanoid.getApplicationContext().getPackageName();
		PackageManager pm = Mechanoid.getApplicationContext().getPackageManager();
		
		try {
			PackageInfo info = pm.getPackageInfo(packageName, PackageManager.GET_SERVICES);
			
			ServiceInfo[] services = info.services;
			
			if(services == null) {
				return;
			}
			
			for(ServiceInfo si : services) {
				String serviceName = si.name;
				
				Class<?> clz = ReflectUtil.loadClassSilently(Ops.class.getClassLoader(), serviceName);

				if(Service.class.isAssignableFrom(clz)) {
					Field field = ReflectUtil.getFieldSilently(clz, "CONFIG");
					if(field != null) {
						OperationServiceConfiguration factory = (OperationServiceConfiguration) ReflectUtil.getFieldValueSilently(field);
						mConfigurations.put(clz.getName(), factory);
					}
				}
			}
			
		} catch (NameNotFoundException e) {
		}
	}
	
	private int createRequestId() {
		return mRequestIdCounter++;
	}
		
	private void addPendingRequest(int requestId, Intent intent) {
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
	
	/**
	 * Check if an operation with the given id is pending
	 * 
	 * @param id
	 * @return true if the operation is pending, false if the operation intent was not found
	 */
	public boolean isOperationPending(int id) {
		if(id <= 0) return false;
		
		return (mPendingRequests.get(id) != null);
	}
	
	/**
	 * Abort an operation
	 * 
	 * @param context
	 * @param id The id of the operation to abort
	 * @param reason A code used to identify a reason for aborting
	 */
	public void abort(int id, int reason) {
		Intent opIntent = mPendingRequests.get(id);
		
		if(opIntent != null) {
			Context context = Mechanoid.getApplicationContext();
			Intent intent = new Intent(OperationService.ACTION_ABORT);
			intent.setClassName(context, opIntent.getComponent().getClassName());
			intent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);
			intent.putExtra(OperationService.EXTRA_REQUEST_ID, id);		
			intent.putExtra(OperationService.EXTRA_ABORT_REASON, reason);	
			
			context.startService(intent);
		}
	}
	
	/**
	 * Execute an operation represented by the intent
	 * 
	 * @param context
	 * @param intent
	 * @return the request id
	 */
	public int execute(Intent intent) {		
		OperationServiceConfiguration serviceConfig = mConfigurations.get(intent.getComponent().getClassName());
		
		OperationConfiguration opConfig = serviceConfig.getOperationConfigurationRegistry().getOperationConfiguration(intent.getAction());
		
		Intent pending = opConfig.findMatchOnConstraint(this, intent);
		
		if(pending != null) {
			return Operation.getOperationRequestId(pending);
		}
		
		Intent clonedIntent = (Intent) intent.clone();
		
		int id = createRequestId();
		
		clonedIntent.putExtra(OperationService.EXTRA_BRIDGE_MESSENGER, messenger);
		clonedIntent.putExtra(OperationService.EXTRA_REQUEST_ID, id);
		
		addPendingRequest(id, clonedIntent);
		
		Mechanoid.startService(clonedIntent);
		
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
		Intent intent = mPendingRequests.get(id);
		
		if(intent != null) {
			if(data == null) {
				data = new Bundle();
			}
			notifyOperationStarting(id, intent, data);
		}
	}

	protected void onOperationComplete(int id, Bundle bundledResult) {
		Intent intent = removePendingRequestById(id);

		OperationResult result = OperationResult.fromBundle(bundledResult);
		
		if(intent != null) {
			
			result.setRequest(intent);
			
			mLog.put(id, result);
			
			notifyOperationComplete(id, result);
		}
	}
	
	protected void onOperationProgress(int id, int progress, Bundle data) {
		
		Intent intent = mPendingRequests.get(id);
		
		if(intent != null) {
			notifyOperationProgress(id, intent, progress, data);
		}
	}
	
	protected void onOperationAborted(int id, int reason, Bundle data) {
		
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