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

public interface OperationServiceListener {
	public void onServiceOperationStarting(OperationServiceBridge bridge, int requestId, Bundle data);
	public void onServiceOperationComplete(OperationServiceBridge bridge, int requestId, Bundle data);
	public void onServiceOperationProgress(OperationServiceBridge bridge, int requestId, int progress, Bundle data);
	public void onServiceOperationAborted(OperationServiceBridge bridge, int requestId, int reason, Bundle data);
}