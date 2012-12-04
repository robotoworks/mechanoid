package com.robotoworks.mechanoid.util;

import java.io.Closeable;
import java.io.IOException;

import android.database.Cursor;

public final class Closeables {
	private Closeables(){}
	
	public static void closeSilently(Cursor closeable) {
		if(closeable == null) {
			return;
		}
		
		closeable.close();
	}
	
	public static void closeSilently(Closeable closeable) {
		if(closeable == null) {
			return;
		}
		
		try {
			closeable.close();
		} catch (IOException x) {
			// Quash
			x.printStackTrace();
		}
	}
}
