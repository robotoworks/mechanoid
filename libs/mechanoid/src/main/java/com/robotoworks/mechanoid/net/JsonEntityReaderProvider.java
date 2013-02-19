/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.net;

/**
 * <p>Provides {@link JsonEntityReader} instances mapped to entity types.</p>
 *
 */
public interface JsonEntityReaderProvider {
	/**
	 * <p>Get a {@link JsonEntityReader} mapped to the given entity type</p>
	 * @param entityType The entity type to look up the reader for
	 * @return A reader mapped to the given entity type
	 */
	<T, R extends JsonEntityReader<T>> R get(Class<T> entityType);
}