package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.util.List;

import com.robotoworks.mechanoid.internal.util.JsonWriter;

public abstract class JsonEntityWriter<T> {
	
	private JsonEntityWriterProvider mProvider;

	public JsonEntityWriterProvider getProvider() {
		return mProvider;
	}
	
	public JsonEntityWriter(JsonEntityWriterProvider provider) {
		mProvider = provider;
	}
	
	/**
	 * <p>Writes the given entity to the writer</p>
	 * @param writer The writer to write the entity to
	 * @param entity The entity to write to the writer
	 */
	public abstract void write(JsonWriter writer, T entity) throws IOException;
	
	/**
	 * <p>Writes the given list of entities to the writer</p>
	 * @param writer The writer to write the entities to
	 * @param entities The entities to write to the writer
	 */
	public abstract void write(JsonWriter writer, List<T> entities) throws IOException;
}