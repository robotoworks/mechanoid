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
package com.robotoworks.mechanoid;

/**
 * <p>Thrown when the application has not been initialized for use with Mechanoid,
 * see {@link Mechanoid#init(android.content.Context)} for more details.</p>
 *
 */
public class MechanoidNotInitializedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MechanoidNotInitializedException() {
		super("Mechanoid.init(Context) must be called before mechanoid can be used");
	}
}
