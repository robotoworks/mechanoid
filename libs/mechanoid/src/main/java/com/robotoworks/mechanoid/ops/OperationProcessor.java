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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
	
	private OperationContext mContext;
		
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
					mService.onOperationStarting(mCurrentRequest, msg.getData());
					break;
				}
				case MSG_OPERATION_COMPLETE: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Complete] intent:%s", mCurrentRequest));
					}
					mCurrentOperation = null;
					mService.onOperationComplete(mCurrentRequest, msg.getData());
					
					executePendingOperations();
					break;
				}
				case MSG_OPERATION_ABORTED: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Aborted] intent:%s", mCurrentRequest));
					}
					mCurrentOperation = null;
					mService.onOperationAborted(mCurrentRequest, msg.arg1, msg.getData());
					
					executePendingOperations();
					break;					
				}
				case MSG_OPERATION_PROGRESS: {
					if(mEnableLogging) {
						Log.d(mLogTag, String.format("[Handle Operation Progress] intent:%s", mCurrentRequest));
					}
					mService.onOperationProgress(mCurrentRequest, msg.arg1, msg.getData());
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
		
		mContext = new OperationContext();
		
		mWorker = new Worker(handler);
		mWorker.start();
	}

	public void execute(Intent intent) {

		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Execute (Queue)] intent:%s", intent));
		}
		
		String action = intent.getAction();
		
		if(action.equals(OperationService.ACTION_ABORT)) {
			int abortRequestId = intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
			int abortReason = intent.getIntExtra(OperationService.EXTRA_ABORT_REASON, 0);
			
			abortOperation(abortRequestId, abortReason);
			
			return;
		}
		
		// queue this one up
		requestQueue.offer(intent);
		
		executePendingOperations();
	}

	private void abortOperation(int abortRequestId, int abortReason) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Aborting] id:%s, reason:%s", abortRequestId, abortReason));
		}
		
		// Try to abort if its the current operation
		if(mCurrentOperation != null) {
			int currentRequestId = OperationServiceBridge.getOperationRequestId(mCurrentRequest);
			
			if(currentRequestId == abortRequestId) {
				Message m = mContext.handler.obtainMessage(OperationContext.MSG_ABORT, abortReason, 0);
				mContext.handler.sendMessage(m);
				return;
			}			
		}
		
		// If its not the current operation then try to find the operation
		// and flag it as aborted
		tryFlagQueuedOperationAsAborted(abortRequestId, abortReason);
	}

	private void tryFlagQueuedOperationAsAborted(int abortRequestId, int abortReason) {
		for(int i=0; i < requestQueue.size(); i++) {
			Intent queuedRequest = requestQueue.get(i);
			
			if(OperationServiceBridge.getOperationRequestId(queuedRequest) == abortRequestId) {
				queuedRequest.putExtra(OperationService.EXTRA_IS_ABORTED, true);
				queuedRequest.putExtra(OperationService.EXTRA_ABORT_REASON, abortReason);
				break;
			}
		}
	}
	
	private void executePendingOperations() {
		if(!mWorkerReady) {
			Log.d(mLogTag, "[Waiting on Worker]");
			return;
		}
		
		if(mCurrentOperation != null) {
			return;
		}
		
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
			OperationResult result = OperationResult.error(new OperationServiceStoppedException());
			mService.onOperationComplete(request, result.toBundle());
		}
		
		mWorker.quit();
	}
	
	private void executeOperation(final Intent request) {
		if(mEnableLogging) {
			Log.d(mLogTag, String.format("[Execute Operation] intent:%s", request));
		}
		
		//
		// Do not execute this operation if its been marked as aborted
		//
		if(request.getBooleanExtra(OperationService.EXTRA_IS_ABORTED, false)) {
			int abortReason = request.getIntExtra(OperationService.EXTRA_ABORT_REASON, 0);
			mService.onOperationAborted(request, abortReason, new Bundle());
			executePendingOperations();
			return;
		}
		
		mCurrentRequest = request;
		
		if(request.getAction().equals(OperationService.ACTION_BATCH)) {
			mCurrentOperation = new BatchOperation(createOperationsFromBatch(request));			
		} else {
			mCurrentOperation = createOperation(request.getAction());			
		}
		
		if(mCurrentOperation == null) {
			throw new RuntimeException(request.getAction() + " Not Implemented");
		}

		mContext.reset();
		mContext.setApplicationContext(mService.getApplicationContext());
		mContext.setIntent(request);
		mContext.setOperationProcessor(this);
		mContext.setEnableLogging(mEnableLogging);
		mContext.setLogTag(mLogTag);
		
		mWorker.post(new OperationRunnable(handler, mContext, mCurrentOperation, mEnableLogging, mLogTag));
	}

	private List<Operation> createOperationsFromBatch(Intent request) {
		ArrayList<Operation> operations = new ArrayList<Operation>();
		ArrayList<Intent> requests = request.getParcelableArrayListExtra(OperationService.EXTRA_BATCH);
		
		for(Intent innerRequest : requests) {
			operations.add(createOperation(innerRequest.getAction()));
		}
		
		return operations;
	}

	protected abstract Operation createOperation(String action);

	static class OperationRunnable implements Runnable {
		
		private Operation mOperation;
		private Handler mCallbackHandler;
		private boolean mEnableLogging;
		private String mLogTag;
		private OperationContext mOperationContext;

		public OperationRunnable(Handler callbackHandler, OperationContext operationContext, Operation operation, boolean enableLogging, String logTag) {
			mCallbackHandler = callbackHandler;
			mOperation = operation;
			mEnableLogging = enableLogging;
			mOperationContext = operationContext;
			mLogTag = logTag;
		}
		
		@Override
		public void run() {
			Message messageStarting = mCallbackHandler.obtainMessage(MSG_OPERATION_STARTING);
			mCallbackHandler.sendMessage(messageStarting);

			Bundle result = null;

			try {
				OperationResult opResult = mOperation.execute(mOperationContext);
				
				if(opResult == null) {
					throw new NullPointerException("OperationResult should not be null");
				}
				
				result = opResult.toBundle();
				
			} catch(Exception x) {
				
				result = OperationResult.error(x).toBundle();
				
				if(mEnableLogging) {
					Log.e(mLogTag, String.format("[Operation Error] %s", Log.getStackTraceString(x)));
				}
			}
			
			Message m = null;
			
			if(mOperationContext.isAborted()) {
				m = mCallbackHandler.obtainMessage(MSG_OPERATION_ABORTED);
				m.arg1 = mOperationContext.getAbortReason();
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