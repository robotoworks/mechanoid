package com.robotoworks.mechanoid.net;

public interface JsonEntityWriterProvider {
	<T, R extends JsonEntityWriter<T>> R get(Class<T> entityType);
}
