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

import com.robotoworks.mechanoid.ops.OperationServiceBridge;

public interface OperationManagerCallbacks<T extends OperationServiceBridge> {
    public int createOperation(T bridge, int code);

    /**
     * <p>Called when an operation is pending, can be invoked when invoking {@link OperationManagerBase#runOperation(int, boolean),
     * or after a configuration change when the activity is recreated.</p>
     * @param bridge The bridge associated to the OperationManager the callbacks are registered with
     * @param code A user-defined code for this operation
     */
    public void onOperationPending(T bridge, int code);
    
    /**
     * <p>A callback that will be invoked by{@link OperationManager} or {@link SupportOperationManager}
     * on completion of an operation.</p>
     * 
     * <p>Will be invoked for each call to {@link OperationManagerBase#runOperation(int, boolean),
     * the first time it will be invoked is after the operation completes, subsequent times it
     * will be invoked and the fromCache argument will be true.</p>
     * 
     * @param bridge The bridge associated to the OperationManager the callbacks are registered with
     * @param code A user-defined code for this operation
     * @param result The result Bundle of the completed operation
     * @param fromCache Wether the operation result was from cache
     */
    public abstract void onOperationComplete(T bridge, int code, Bundle result, boolean fromCache);
}