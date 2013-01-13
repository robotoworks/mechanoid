/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.ops;

import android.os.Bundle;

/**
 * <p>A listener that can be registered/unregistered with an implementation of {@link OperationServiceBridge}
 * that will listen to the status of scheduled and/or currently running operations.</p>
 *
 */
public abstract class OperationServiceListener {
	/**
	 * <p>Callback when an operation is about to start.<p>
	 * @param bridge the operation bridge responsible for this operation
	 * @param requestId The unique id of the operation
	 * @param data currently unused
	 */
	public void onOperationStarting(OperationServiceBridge bridge, int requestId, Bundle data) {
		
	}
	/**
	 * <p>Callback when an operation has completed</p>
	 * @param bridge the operation bridge responsible for this operation 
	 * @param requestId The unique id of the operation
	 * @param result Arbitrary data describing the result of the operation, this should ussually
	 * be created with one of the operation result helpers 
	 * such as {@link Operation#createOkResult()} or {@link Operation#createErrorResult(Throwable)}
	 */
	public abstract void onOperationComplete(OperationServiceBridge bridge, int requestId, Bundle result);
	
	/**
	 * <p>Callback when an operation invokes {@link Operation#postProgress(int, Bundle)}, useful
	 * in scenarios where long running operations need to report progress.</p>
	 * @param bridge the bridge responsible for this operation
	 * @param requestId The unique id of the operation
	 * @param progress an integer to describe the progress of the operation, ie :- 0 to 100%
	 * @param data arbitrary data
	 */
	public void onOperationProgress(OperationServiceBridge bridge, int requestId, int progress, Bundle data) {
		
	}
	
	/**
	 * <p>Callback when an operation invokes {@link Operation#abort(int)} or if {@link OperationServiceBridge#abort(int, int)}
	 * is invoked.</p>
	 * <p>Note: Aborted operations will not call {@link OperationServiceListener#onOperationComplete(OperationServiceBridge, int, Bundle)}
	 *  if an operation is aborted.</p>
	 * @param bridge the bridge responsible for this operation
	 * @param requestId The unique id of the aborted operation
	 * @param reason A user defined reason for the aborting of the operation
	 * @param result arbitrary data for the aborting operation
	 */
	public void onOperationAborted(OperationServiceBridge bridge, int requestId, int reason, Bundle result) {
		
	}
}