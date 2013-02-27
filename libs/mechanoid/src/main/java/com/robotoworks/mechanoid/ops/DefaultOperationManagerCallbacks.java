package com.robotoworks.mechanoid.ops;

import android.os.Bundle;

public abstract class DefaultOperationManagerCallbacks<T extends OperationServiceBridge> implements
		OperationManagerCallbacks<T> {

	@Override
	public abstract int createOperation(T bridge, int id);

	@Override
	public void onOperationPending(T bridge, int id) {}

	@Override
	public abstract void onOperationComplete(T bridge, int id, Bundle result, boolean fromCache);
}
