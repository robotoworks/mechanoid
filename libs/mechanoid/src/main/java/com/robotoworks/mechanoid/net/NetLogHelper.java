/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.net;

import java.util.List;
import java.util.Map;

import android.util.Log;

public class NetLogHelper {
	private NetLogHelper(){}
	public static void logProperties(String tag, Map<String, List<String>> properties) {
		for(String key : properties.keySet()) {
			Log.d(tag, key + " " + properties.get(key).toString());
		}
	}
}
