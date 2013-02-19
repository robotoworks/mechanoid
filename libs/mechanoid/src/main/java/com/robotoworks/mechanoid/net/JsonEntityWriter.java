/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
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
	public abstract void write(JsonWriter writer, List<T> entities) throws IOException;
}