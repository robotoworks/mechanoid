package com.mechanoid.net;


import android.net.Uri;
import com.robotoworks.mechanoid.util.Streams;
import com.robotoworks.mechanoid.net.TransformException;
import java.io.OutputStream;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;

public class PostIntRequest {
	
	private static final String PATH="/echo";
	
	private final int value;
	public int getValue() {
		return value;
	}
	public PostIntRequest(int value){
		this.value = value;
	}
	
	void writeBody(TransformerProvider transformerProvider, OutputStream stream) throws TransformException {
		try {
			if(stream != null) {
				
			Streams.writeText(stream, Integer.toString(value));
				
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(stream);
		}
	}

	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
