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

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/*
 * Intent intent = GetApplicationVersionOperation.create();
 * int id = Ops.execute(intent);
 * 
 * Ops.registerListener(mListener);
 * 
 * Ops.unregisterListener(mListener);
 * 
 * OperationManager manager = OperationManager.create(getFragmentManager(), mCallbacks);
 * 
 * Ops.execute(manager, OP_GET_VERSION, true, intent);
 */
public abstract class OperationService extends Service {
	protected static final String ACTION_ABORT = "com.robotoworks.mechanoid.op.actions.ABORT";
	public static final String ACTION_BATCH = "com.robotoworks.mechanoid.op.actions.BATCH";
	
	public static final String EXTRA_START_ID = "com.robotoworks.mechanoid.op.extras.START_ID";
	
	public static final String EXTRA_REQUEST_ID = "com.robotoworks.mechanoid.op.extras.REQUEST_ID";
	public static final String EXTRA_ABORT_REASON = "com.robotoworks.mechanoid.op.extras.ABORT_REASON";
	public static final String EXTRA_BRIDGE_MESSENGER = "com.robotoworks.mechanoid.op.extras.BRIDGE_MESSENGER";
	public static final String EXTRA_IS_ABORTED = "com.robotoworks.mechanoid.op.extras.IS_ABORTED";
	public static final String EXTRA_BATCH = "com.robotoworks.mechanoid.op.extras.BATCH";

	private static final int MSG_STOP = 1;



	protected final String mLogTag;
	protected final boolean mEnableLogging;
	
	class LocalBinder extends Binder {
		OperationService getService() {
			return OperationService.this;
		}
	}
	
	private Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			if(msg.what == MSG_STOP) {
				stop(msg.arg1);
			}
		};
	};
	
	private IBinder mBinder = new LocalBinder();
	
	private OperationProcessor mProcessor;

	private boolean mStopped;
	
	public boolean isStopped() {
		return mStopped;
	}

	public OperationService(boolean enableLogging) {
		mProcessor = createProcessor();
		mLogTag = this.getClass().getSimpleName();
		mEnableLogging = enableLogging;
	}
	
	protected abstract OperationProcessor createProcessor();

	@Override
	public IBinder onBind(Intent intent) {
		return mBinder;
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
		mProcessor.execute(intent);
	}
	
	private void sendStopMessage(Intent request) {
		mHandler.removeMessages(MSG_STOP);
		int startId = request.getIntExtra(EXTRA_START_ID, 0);
		mHandler.sendMessageDelayed(mHandler.obtainMessage(MSG_STOP, startId, 0), getIdleStopTime());
	}

	protected long getIdleStopTime() {
		return 10000; // 10 seconds
	}

	private void stop(int startId) {
		if(shouldStopOnAllOperationsComplete() && stopSelfResult(startId)) {
			if(mEnableLogging) {
				Log.d(mLogTag, String.format("[Stopping] startId:%s", startId));
			}
			
			mStopped = true;				
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		if(mEnableLogging) {
			Log.d(mLogTag, "[Destroying]");
		}
		
		mProcessor.quit();				
	}

	protected boolean shouldStopOnAllOperationsComplete() {
		return true;
	}

	public void onOperationStarting(Intent request, Bundle data) {	
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Starting] request:%s, data:%s", request, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_STARTING;
		m.arg1 = OperationServiceBridge.getOperationRequestId(request);
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			if(mEnableLogging) {
				Log.e(mLogTag, String.format("[Operation Exception] %s", Log.getStackTraceString(e)));
			}
		}
	}

	public void onOperationComplete(Intent request, Bundle data) {	
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Complete] request:%s, data:%s", request, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_COMPLETE;
		m.arg1 = OperationServiceBridge.getOperationRequestId(request);
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (Exception e) {
			if(mEnableLogging) {
				Log.w(mLogTag, String.format("[Operation Exception] %s", Log.getStackTraceString(e)));
			}
		}
		
		sendStopMessage(request);
	}
	
	public void onOperationAborted(Intent request, int reason, Bundle data) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Aborted] request:%s, reason%s, data:%s", request, reason, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_ABORTED;
		m.arg1 = OperationServiceBridge.getOperationRequestId(request);
		m.arg2 = reason;
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			if(mEnableLogging) {
				Log.e(mLogTag, String.format("[Operation Exception] %s", Log.getStackTraceString(e)));
			}
		}
		
		sendStopMessage(request);
	}

	public void onOperationProgress(Intent request, int progress, Bundle data) {	
		
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Operation Progress] request:%s, progress:%s, data:%s", request, progress, data));
		}
		
		Messenger messenger = request.getParcelableExtra(EXTRA_BRIDGE_MESSENGER);
		Message m = new Message();
		m.what = OperationServiceBridge.MSG_OPERATION_PROGRESS;
		m.arg1 = OperationServiceBridge.getOperationRequestId(request);
		m.arg2 = progress;
		m.setData(data);
		try {	
			messenger.send(m);
		}
	    catch (RemoteException e) {
			if(mEnableLogging) {
				Log.e(mLogTag, String.format("[Operation Exception] %s", Log.getStackTraceString(e)));
			}
		}
	}
}
