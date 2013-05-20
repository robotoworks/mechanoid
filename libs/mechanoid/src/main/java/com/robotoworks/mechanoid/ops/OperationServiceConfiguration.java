package com.robotoworks.mechanoid.ops;

import android.content.Intent;

public abstract class OperationServiceConfiguration {
	public abstract Class<?> getServiceClass();
	public abstract Operation createOperation(Intent intent);
	
	public abstract Intent findPendingRequestForUniqueConstraint(OperationServiceBridge mBridge, Intent intent);
}
