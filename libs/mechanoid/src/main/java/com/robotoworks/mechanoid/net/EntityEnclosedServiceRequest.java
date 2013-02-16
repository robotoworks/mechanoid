package com.robotoworks.mechanoid.net;

import java.io.OutputStream;

public abstract class EntityEnclosedServiceRequest extends ServiceRequest {
	public abstract void writeBody(TransformerProvider provider, OutputStream stream) throws TransformException;
}
