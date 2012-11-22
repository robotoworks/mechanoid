package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.io.OutputStream;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.nio.charset.Charset;
import java.io.OutputStreamWriter;

public class SkippingPostRequest {
	
	private static final String PATH="/echoJson";
	
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

	private final String a;
	private final int b;
	private final long c;
	public String getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public long getC() {
		return c;
	}
	public SkippingPostRequest(String a,
	int b,
	long c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void writeBody(TransformerProvider transformerProvider, OutputStream stream) throws TransformException {
		JsonWriter target = null;
		try {
			if(stream != null) {
				target = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				
		
			SkippingPostRequest subject = this;
		
			target.beginObject();
			
			
				target.name("outer");
				
				target.beginObject();
				
				
					target.name("inner");
					
					target.beginObject();
					
					target.name("a");
					target.value(subject.getA());
					target.name("b");
					target.value(subject.getB());
					target.name("c");
					target.value(subject.getC());
					
					target.endObject();
				
				target.endObject();
			
			target.endObject();
		
				
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(target);
		}
	}

	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		return uriBuilder.toString();			
	}
}
