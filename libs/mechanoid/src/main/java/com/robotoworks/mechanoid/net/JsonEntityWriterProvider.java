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
 * <p>Provides {@link JsonEntityWriter} instances mapped to entity types.</p>
 *
 */
public interface JsonEntityWriterProvider {
	/**
	 * <p>Get a {@link JsonEntityWriter} mapped to the given entity type</p>
	 * @param entityType The entity type to look up the writer for
	 * @return A writer mapped to the given entity type
	 */
	<T, R extends JsonEntityWriter<T>> R get(Class<T> entityType);
}
