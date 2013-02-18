package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.io.OutputStream;

public abstract class EntityEnclosedServiceRequest extends ServiceRequest {
	public abstract void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException;
}
