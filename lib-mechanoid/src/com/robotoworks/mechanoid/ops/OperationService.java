/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.ops;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public abstract class OperationService extends Service {
	protected static final String ACTION_ABORT = "com.robotoworks.mechanoid.op.actions.ABORT";
	
	public static final String EXTRA_START_ID = "com.robotoworks.mechanoid.op.extras.START_ID";
	
	public static final String EXTRA_REQUEST_ID = "com.robotoworks.mechanoid.op.extras.REQUEST_ID";
	public static final String EXTRA_ABORT_REASON = "com.robotoworks.mechanoid.op.extras.ABORT_REASON";
	public static final String EXTRA_BRIDGE_MESSENGER = "com.robotoworks.mechanoid.op.extras.BRIDGE_MESSENGER";

	protected final String mLogTag;
	protected final boolean mEnableLogging;
	
	class LocalBinder extends Binder {
		OperationService getService() {
			return OperationService.this;
		}
	}
	
	private IBinder binder = new LocalBinder();
	
	private OperationProcessor processor;

	private boolean mStopped;
	
	public boolean isStopped() {
		return mStopped;
	}

	public OperationService(boolean enableLogging) {
		processor = createProcessor();
		mLogTag = this.getClass().getSimpleName();
		mEnableLogging = enableLogging;
	}
	
	protected abstract OperationProcessor createProcessor();

	@Override
	public IBinder onBind(Intent intent) {
		return binder;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Start Command] startId:%s, intent:%s", startId, intent));
		}
		
		if(intent != null) {
			intent.putExtra(EXTRA_START_ID, startId);
			handleIntent(intent);
		}
		
		return START_STICKY;
	}
		
	private void handleIntent(Intent intent) {
		processor.execute(intent);
	}
	
	private void tryStopSelf(Intent request) {
		if(shouldStopOnAllOperationsComplete() && !processor.hasPendingOperations()) {
			
			int startId = request.getIntExtra(EXTRA_START_ID, 0);
			
			if(stopSelfResult(startId)) {
				if(mEnableLogging) {
					Log.d(mLogTag, String.format("[Stopping] startId:%s, intent: %s", startId, request));
				}
				mStopped = true;				
			}
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		if(mEnableLogging) {
			Log.d(mLogTag, "[Destroying]");
		}
		
		processor.quit();				
	}

	protected boolean shouldStopOnAllOperationsComplete() {
		return true;
	}

	public void onDataProcessorOperationStarting(Intent request, Bundle data) {	
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Starting] request:%s, data:%s", request, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_STARTING;
		m.arg1 = request.getIntExtra(EXTRA_REQUEST_ID, 0);
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	public void onDataProcessorOperationComplete(Intent request, Bundle data) {	
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Complete] request:%s, data:%s", request, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_COMPLETE;
		m.arg1 = request.getIntExtra(EXTRA_REQUEST_ID, 0);
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			throw new RuntimeException(e);
		}
		
		tryStopSelf(request);
	}
	
	public void onDataProcessorOperationAborted(Intent request, int reason, Bundle data) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Aborted] request:%s, reason%s, data:%s", request, reason, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_ABORTED;
		m.arg1 = request.getIntExtra(EXTRA_REQUEST_ID, 0);
		m.arg2 = reason;
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			throw new RuntimeException(e);
		}
		
		tryStopSelf(request);
	}

	public void onDataProcessorOperationProgress(Intent request, int progress, Bundle data) {	
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Progress] request:%s, progress:%s, data:%s", request, progress, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_PROGRESS;
		m.arg1 = request.getIntExtra(EXTRA_REQUEST_ID, 0);
		m.arg2 = progress;
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}
}
