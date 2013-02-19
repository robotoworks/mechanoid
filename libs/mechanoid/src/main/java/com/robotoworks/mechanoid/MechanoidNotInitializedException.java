/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
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
