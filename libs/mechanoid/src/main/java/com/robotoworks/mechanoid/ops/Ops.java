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
	
	/**
	 * <p>Execute an operation described by the given intent</p>
	 * @param intent
	 * @return
	 */
	public static int executeBatch(Intent... intents) {
		return mBridge.executeBatch(intents);
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
	
	/**
	 * <p>Pause processing of operations, useful for testing scenarios
	 * to guarantee processing time</p>
	 * <p>Operations issued after a pause will not be processed until {@link #unpause()}</p>
	 * 
	 * @param pause true to pause, false to resume
	 */
	public static void pause(boolean pause) {
		mBridge.pause(pause);
	}
}
