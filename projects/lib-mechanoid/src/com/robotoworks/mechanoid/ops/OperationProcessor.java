/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/

package com.robotoworks.mechanoid.ops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

public abstract class OperationProcessor {
	
	protected static final int MSG_OPERATION_STARTING = 1;
	protected static final int MSG_OPERATION_COMPLETE = 2;
	protected static final int MSG_OPERATION_PROGRESS = 3;
	protected static final int MSG_OPERATION_ABORTED = 4;

	private LinkedList<Intent> requestQueue = new LinkedList<Intent>();
	
	private Worker worker = new Worker();

	private final OperationService service;

	private Operation currentOperation;
	private Intent currentRequest;
		
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch(msg.what) {
				case MSG_OPERATION_STARTING: {
					service.onDataProcessorOperationStarting(currentRequest, msg.getData());
					break;
				}
				case MSG_OPERATION_COMPLETE: {
					currentOperation = null;
					service.onDataProcessorOperationComplete(currentRequest, msg.getData());
					
					executePendingOperations();
					break;
				}
				case MSG_OPERATION_ABORTED: {
					currentOperation = null;
					service.onDataProcessorOperationAborted(currentRequest, msg.arg1, msg.getData());
					
					executePendingOperations();
					break;					
				}
				case MSG_OPERATION_PROGRESS: {
					service.onDataProcessorOperationProgress(currentRequest, msg.arg1, msg.getData());
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
	
	public OperationProcessor(OperationService service) {
		this.service = service;
		
		worker.start();
	}

	public void execute(Intent intent) {

		if(intent.getAction().equals(OperationService.ACTION_ABORT)) {
			
			abortOperation(intent);
			
			return;
		}
		
		// queue this one up
		requestQueue.offer(intent);
		
		// make sure we are running ops
		if(currentOperation == null) {
			executePendingOperations();
		}
	}

	private void abortOperation(Intent intent) {
		int abortRequestId = intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
		int abortReason = intent.getIntExtra(OperationService.EXTRA_ABORT_REASON, 0);
		
		// Try to abort if its the current operation
		if(currentOperation != null) {
			int currentRequestId = intent.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
			
			if(currentRequestId == abortRequestId) {
				Message m = currentOperation.handler.obtainMessage(Operation.MSG_ABORT, abortReason, 0);
				currentOperation.handler.sendMessage(m);
				return;
			}			
		}
		
		// If its not the currrent operation then try to find the operation
		for(int i=0; i < requestQueue.size(); i++) {
			Intent r = requestQueue.get(i);
			
			if(r.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0) == abortRequestId) {
				requestQueue.remove(i);
				
				service.onDataProcessorOperationAborted(currentRequest, 0, null);
				
				break;
			}
		}
	}
	
	private void executePendingOperations() {
		// pop a request
		Intent request = requestQueue.poll();
				
		if(request != null) {
			executeOperation(request);
		}
	}

	public void quit() {
		Intent request = null;
		
		while((request = requestQueue.poll()) != null) {
			Bundle result = Operation.createErrorResult(new OperationServiceStoppedException());
			service.onDataProcessorOperationComplete(request, result);
		}
		
		worker.quit();
	}
	
	private void executeOperation(final Intent request) {
		
		currentRequest = request;
		currentOperation = createOperation(request.getAction());
		currentOperation.setContext(service.getApplicationContext());
		currentOperation.setIntent(request);
		currentOperation.setOperationProcessor(this);
				
		if(currentOperation == null) {
			throw new RuntimeException(request.getAction() + " Not Implemented");
		}
		
		worker.post(new OperationRunnable(handler, currentOperation));
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
		public Handler handler;
		
		private List<Runnable> pendingRunnables = new ArrayList<Runnable>();
		
		public Worker() {
			super("worker");
		}
		
		public void post(Runnable runnable) {
			if(handler == null) {
				pendingRunnables.add(runnable);
			} else {
				handler.post(runnable);
			}
		}
		
		private void onHandlerPrepared() {
			for(Runnable runnable : pendingRunnables) {
				handler.post(runnable);
			}
		}
		
		@Override
		protected void onLooperPrepared() {
			super.onLooperPrepared();
			this.handler = new Handler();
			onHandlerPrepared();
		}
	}
}