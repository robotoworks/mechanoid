/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.net;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * <p>Base for all Mechanoid Net service client requests</p>
 *
 */
public abstract class ServiceRequest {
	
	private LinkedHashMap<String, String> mHeaders = new LinkedHashMap<String, String>();
	
	public void setHeader(String field, String value) {
		mHeaders.put(field, value);
	}
	
	public Set<String> getHeaderKeys() {
		return mHeaders.keySet();
	}
	
	public String getHeaderValue(String key) {
		return mHeaders.get(key);
	}
	
	public abstract String createUrl(String baseUrl);
}
