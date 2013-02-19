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
import java.io.InputStream;

/**
 * <p>A delegate for parsing the type T from an input stream.</p>
 *
 * @param <T> The type to parse
 */
public interface Parser<T> {
	/**
	 * <p>Parse from the given input stream</p>
	 * @param stream The stream to parse from
	 * @return An object resulting from the parse
	 * @throws IOException
	 */
	T parse(InputStream stream) throws IOException;
}
