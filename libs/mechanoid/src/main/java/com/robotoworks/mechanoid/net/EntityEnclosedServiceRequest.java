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
import java.io.OutputStream;

/**
 * <p>A Base for all Mechanoid Net post and put methods.</p>
 */
public abstract class EntityEnclosedServiceRequest extends ServiceRequest {
	/**
	 * <p>Writes content to the output stream using the given writer provider for writing
	 * specific entities.</p>
	 * @param provider The writer provider - provides entity to writer mappings
	 * @param stream The stream to write content to
	 * @throws IOException Occurs if there is an error writing to the stream
	 */
	public abstract void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException;
}
