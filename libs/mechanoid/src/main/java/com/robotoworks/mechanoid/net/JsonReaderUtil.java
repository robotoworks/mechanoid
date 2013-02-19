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

import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class JsonReaderUtil {
	
	private JsonReaderUtil(){}
	
	/**
	 * <p>Helper for reading a value as boolean using a JsonReader where the boolean may
	 * have been serialized using quotes (as a String), or as a number</p>
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	public static boolean coerceNextBoolean(JsonReader reader) throws IOException {
		JsonToken nextToken = reader.peek();
		if(nextToken == JsonToken.STRING) {
			return Boolean.valueOf(reader.nextString());
		} else if(nextToken == JsonToken.NUMBER) {
			return reader.nextInt() > 0;
		} else {
			return reader.nextBoolean();
		}
	}
}
