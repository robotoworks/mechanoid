/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.ops;

public class OperationInstantiationException extends RuntimeException {

	private static final long serialVersionUID = 5994943040895507032L;
	
	public OperationInstantiationException(Throwable cause) {
		initCause(cause);
	}
}
