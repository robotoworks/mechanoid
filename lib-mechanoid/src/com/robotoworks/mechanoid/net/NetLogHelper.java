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
