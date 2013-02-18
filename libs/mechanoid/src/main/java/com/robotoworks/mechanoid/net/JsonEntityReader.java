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
	public abstract void read(JsonReader reader, List<T> entities) throws IOException;
}
