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
