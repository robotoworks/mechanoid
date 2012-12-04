package com.robotoworks.mechanoid.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Streams {
	public static String readAllText(InputStream in) throws IOException {
		StringBuffer stream = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
		stream.append(new String(b, 0, n));
		}
		return stream.toString();
	}	
	
	public static byte[] readAllBytes(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		byte[] b = new byte[4096];
		int read = 0;
		
		while((read = in.read(b)) > -1) {
			out.write(b, 0, read);
		}
		
		return out.toByteArray();
	}	
}
