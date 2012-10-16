package com.robotoworks.mechanoid.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Streams {
	public static String readAllText(InputStream in) throws IOException {
		StringBuffer stream = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
		stream.append(new String(b, 0, n));
		}
		return stream.toString();
	}
	
	public static void writeText(OutputStream stream, String text) throws IOException {
		OutputStreamWriter write = new OutputStreamWriter(stream, Charset.defaultCharset());
		write.write(text);
	}
}
