package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;
import com.robotoworks.mechanoid.net.TransformException;
import java.io.PrintStream;
import java.io.OutputStream;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;

public class PostStringRequest {
	
	private static final String PATH="/echo";
	
	private LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
	
	public void setHeader(String field, String value) {
		headers.put(field, value);
	}
	
	public Set<String> getHeaderKeys() {
		return headers.keySet();
	}
	
	public String getHeaderValue(String key) {
		return headers.get(key);
	}

	private final String value;
	public String getValue() {
		return value;
	}
	public PostStringRequest(String value){
		this.value = value;
	}
	
	void writeBody(TransformerProvider transformerProvider, OutputStream stream) throws TransformException {
		try {
			if(stream != null) {
				
			PrintStream ps = new PrintStream(stream);
			ps.print(value);
				
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
