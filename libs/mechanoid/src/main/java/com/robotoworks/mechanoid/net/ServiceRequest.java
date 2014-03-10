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

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * <p>Base for all Mechanoid Net service client requests</p>
 *
 */
public abstract class ServiceRequest {
	
	private LinkedHashMap<String, String> mHeaders = new LinkedHashMap<String, String>();
	
	private int mReadTimeout = -1;
	private int mConnectTimeout = -1;

	public void setHeader(String field, String value) {
		mHeaders.put(field, value);
	}
	
	public Set<String> getHeaderKeys() {
		return mHeaders.keySet();
	}
	
	public String getHeaderValue(String key) {
		return mHeaders.get(key);
	}
	
	public void setReadTimeout(int readTimeout) {
		mReadTimeout = readTimeout;
	}
	
	public int getReadTimeout() {
		return mReadTimeout;
	}
	
	public void setConnectTimeout(int connectTimeout) {
		mConnectTimeout = connectTimeout;
	}
	
	public int getConnectTimeout() {
		return mConnectTimeout;
	}
	
	public abstract String createUrl(String baseUrl);
	
}
