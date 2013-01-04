package com.robotoworks.mechanoid.ops;

import android.os.Bundle;

import com.robotoworks.mechanoid.ops.OperationServiceBridge;

public abstract class OperationManagerCallbacks<T extends OperationServiceBridge> {
    public abstract int createOperation(T bridge, int id);

    public void onOperationPending(T bridge, int id) {
        
    }
    
    public abstract void onOperationComplete(T bridge, int id, Bundle data);
}