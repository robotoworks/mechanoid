/*
 * Copyright 2013 Robotoworks Limited
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.util.List;

import com.robotoworks.mechanoid.internal.util.JsonReader;

/**
 * <p>Uses the JsonReader to ader (deserialize) the given entity T.</p>
 *
 * @param <T>
 */
public abstract class JsonEntityReader<T> {
	
	private JsonEntityReaderProvider mProvider;

	/**
	 * <p>A reader provider which provides other readers
	 * that may be needed when reading entities that the entity for this
	 * reader references, for example in object graphs.</p>
	 */
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
	public abstract void readList(JsonReader reader, List<T> entities) throws IOException;
}
