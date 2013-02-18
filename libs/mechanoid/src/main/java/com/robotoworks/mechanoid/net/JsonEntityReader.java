package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.util.List;

import com.robotoworks.mechanoid.internal.util.JsonReader;

public abstract class JsonEntityReader<T> {
	
	private JsonEntityReaderProvider mProvider;
	
	public JsonEntityReaderProvider getProvider() {
		return mProvider;
	}

	public JsonEntityReader(JsonEntityReaderProvider provider) {
		mProvider = provider;
	}
	
	/**
	 * <p>Reads from the reader into the entity</p>
	 * @param reader The reader to read from
	 * @param entity The entity to write to
	 */
	public abstract void read(JsonReader reader, T entity) throws IOException;
	
	/**
	 * <p>Reads from the reader into the list of entities, each
	 * entity the reader encounters will add an entity to the list</p>
	 * 
	 * @param reader The reader to read from
	 * @param entities The entities to write to
	 */
	public abstract void read(JsonReader reader, List<T> entities) throws IOException;
}
