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

import com.robotoworks.mechanoid.internal.util.JsonWriter;

/**
 * <p>Uses the JsonWriter to write (serialize) the given entity T.</p>
 *
 * @param <T>
 */
public abstract class JsonEntityWriter<T> {
	
	private JsonEntityWriterProvider mProvider;

	/**
	 * <p>A writer provider which provides other writers
	 * that may be needed when writing entities that the entity for this
	 * writer references, for example in object graphs.</p>
	 */
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
	public abstract void writeList(JsonWriter writer, List<T> entities) throws IOException;
}