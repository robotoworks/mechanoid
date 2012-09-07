package com.robotoworks.mechanoid.util;

import java.io.Closeable;
import java.io.IOException;

public final class Closeables {
	private Closeables(){}
	
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
