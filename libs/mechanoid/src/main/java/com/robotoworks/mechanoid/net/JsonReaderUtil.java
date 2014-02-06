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
