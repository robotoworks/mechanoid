package com.robotoworks.mechanoid.ops;

import android.content.Intent;

public class Ops {
	private static OperationServiceBridge mBridge;

	static void init() {
		
		if(mBridge != null) {
			return;
		}
		
		mBridge = new OperationServiceBridge();
	}
	
	/**
	 * <p>Execute an operation described by the given intent</p>
	 * @param intent
	 * @return
	 */
	public static int execute(Intent intent) {
		return mBridge.execute(intent);
	}
	
	public static void bindListener(OperationServiceListener listener){
		mBridge.bindListener(listener);
	}
	
	public static void unbindListener(OperationServiceListener listener) {
		mBridge.unbindListener(listener);
	}
	
	public static boolean isOperationPending(int id) {
		return mBridge.isOperationPending(id);
	}
	
	public static OperationLog getLog() {
		return mBridge.getLog();
	}
	
	public static void abort(int id, int reason) {
		mBridge.abort(id, reason);
	}
}
