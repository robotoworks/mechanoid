package com.robotoworks.mechanoid.ops;

import android.content.Intent;

public abstract class OperationConfiguration {
	public abstract Operation createOperation();
	public abstract Intent findMatchOnConstraint(OperationServiceBridge bridge, Intent intent);
}
