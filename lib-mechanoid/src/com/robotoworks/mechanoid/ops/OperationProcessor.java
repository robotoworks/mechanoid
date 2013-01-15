/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/

package com.robotoworks.mechanoid.ops;

import java.util.LinkedList;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;

public abstract class OperationProcessor {
	
	protected static final int MSG_OPERATION_STARTING = 1;
	protected static final int MSG_OPERATION_COMPLETE = 2;
	protected static final int MSG_OPERATION_PROGRESS = 3;
	protected static final int MSG_OPERATION_ABORTED = 4;
	protected static final int MSG_WORKER_READY = 5;
	
	private LinkedList<Intent> requestQueue = new LinkedList<Intent>();
	
	private Worker mWorker;
	private boolean mWorkerReady;
	private final OperationService mService;
	private Operation mCurrentOperation;
	private Intent mCurrentRequest;
	
	protected final String mLogTag;
	protected final boolean mEnableLogging;
		
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch(msg.what) {
				case MSG_WORKER_READY:
					mWorkerReady = true;
					executePendingOperations();
					break;
				case MSG_OPERATION_STARTING: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Starting] intent:%s", mCurrentRequest));
					}
					mService.onDataProcessorOperationStarting(mCurrentRequest, msg.getData());
					break;
				}
				case MSG_OPERATION_COMPLETE: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Complete] intent:%s", mCurrentRequest));
					}
					mCurrentOperation = null;
					mService.onDataProcessorOperationComplete(mCurrentRequest, msg.getData());
					
					executePendingOperations();
					break;
				}
				case MSG_OPERATION_ABORTED: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Aborted] intent:%s", mCurrentRequest));
					}
					mCurrentOperation = null;
					mService.onDataProcessorOperationAborted(mCurrentRequest, msg.arg1, msg.getData());
					
					executePendingOperations();
					break;					
				}
				case MSG_OPERATION_PROGRESS: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Progress] intent:%s", mCurrentRequest));
					}
					mService.onDataProcessorOperationProgress(mCurrentRequest, msg.arg1, msg.getData());
					break;
				}
			}
		};
	};
	
	protected void notifyProgress(int progress, Bundle data) {
		Message m = handler.obtainMessage(OperationProcessor.MSG_OPERATION_PROGRESS);
		m.arg1 = progress;
		m.setData(data);

		handler.sendMessage(m);
	}
	
	public boolean hasPendingOperations() {
		return requestQueue.size() > 0;
	}
	
	public OperationProcessor(OperationService service, boolean enableLogging) {
		this.mService = service;
		mLogTag = this.getClass().getSimpleName();
		mEnableLogging = enableLogging;
		mWorker = new Worker(handler);
		mWorker.start();
	}

	public void execute(Intent intent) {

		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Execute (Queue)] intent:%s", intent));
		}
		
		if(intent.getAction().equals(OperationService.ACTION_ABORT)) {
			
			abortOperation(intent);
			
			return;
		}
		
		// queue this one up
		requestQueue.offer(intent);
		
		// make sure we are running ops if the worker is ready
		if(mWorkerReady && mCurrentOperation == null) {
			executePendingOperations();
		}
	}

	private void abortOperation(Intent intent) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Abort] intent:%s", intent));
		}
		
		int abortRequestId = intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
		int abortReason = intent.getIntExtra(OperationService.EXTRA_ABORT_REASON, 0);
		
		// Try to abort if its the current operation
		if(mCurrentOperation != null) {
			int currentRequestId = intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
			
			if(currentRequestId == abortRequestId) {
				Message m = mCurrentOperation.handler.obtainMessage(Operation.MSG_ABORT, abortReason, 0);
				mCurrentOperation.handler.sendMessage(m);
				return;
			}			
		}
		
		// If its not the currrent operation then try to find the operation
		for(int i=0; i < requestQueue.size(); i++) {
			Intent r = requestQueue.get(i);
			
			if(r.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0) == abortRequestId) {
				requestQueue.remove(i);
				
				mService.onDataProcessorOperationAborted(mCurrentRequest, 0, null);
				
				break;
			}
		}
	}
	
	private void executePendingOperations() {
		if(mEnableLogging) {
			Log.d(mLogTag, "[Executing Pending]");
		}
		
		// pop a request
		Intent request = requestQueue.poll();
				
		if(request != null) {
			executeOperation(request);
		}
	}

	public void quit() {
		
		if(mEnableLogging) {
			Log.d(mLogTag, "[Quit]");
		}
		
		Intent request = null;
		
		while((request = requestQueue.poll()) != null) {
			Bundle result = Operation.createErrorResult(new OperationServiceStoppedException());
			mService.onDataProcessorOperationComplete(request, result);
		}
		
		mWorker.quit();
	}
	
	private void executeOperation(final Intent request) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Execute Operation] intent:%s", request));
		}
		
		mCurrentRequest = request;
		mCurrentOperation = createOperation(request.getAction());
		
		if(mCurrentOperation == null) {
			throw new RuntimeException(request.getAction() + " Not Implemented");
		}

		mCurrentOperation.setContext(mService.getApplicationContext());
		mCurrentOperation.setIntent(request);
		mCurrentOperation.setOperationProcessor(this);
				
		
		mWorker.post(new OperationRunnable(handler, mCurrentOperation));
	}

	protected abstract Operation createOperation(String action);

	static class OperationRunnable implements Runnable {
		
		private Operation mOperation;
		private Handler mCallbackHandler;

		public OperationRunnable(Handler callbackHandler, Operation operation) {
			mCallbackHandler = callbackHandler;
			mOperation = operation;
			
		}
		
		@Override
		public void run() {
			Message messageStarting = mCallbackHandler.obtainMessage(MSG_OPERATION_STARTING);
			mCallbackHandler.sendMessage(messageStarting);

			Bundle result = null;

			try {
				result = mOperation.execute();
			} catch(Exception x) {
				result = Operation.createErrorResult(x);
			}
			
			Message m = null;
			
			if(mOperation.isAborted()) {
				m = mCallbackHandler.obtainMessage(MSG_OPERATION_ABORTED);
				m.arg1 = mOperation.getAbortReason();
			} else {			
				m = mCallbackHandler.obtainMessage(MSG_OPERATION_COMPLETE);
			}
			
			m.setData(result);
			mCallbackHandler.sendMessage(m);
		}
		
	}
	
	static class Worker extends HandlerThread {
		private Handler mWorkerHandler;
		private Handler mProcessorHandler;
		
		public Worker(Handler processorHandler) {
			super("worker", Process.THREAD_PRIORITY_BACKGROUND);
			mProcessorHandler = processorHandler;
		}
		
		public void post(Runnable runnable) {
			mWorkerHandler.post(runnable);
		}
		
		@Override
		protected void onLooperPrepared() {
			super.onLooperPrepared();
			this.mWorkerHandler = new Handler();
			mProcessorHandler.sendEmptyMessage(MSG_WORKER_READY);
		}
	}
}