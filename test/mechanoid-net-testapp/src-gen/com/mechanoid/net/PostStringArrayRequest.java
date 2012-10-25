package com.mechanoid.net;


import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.internal.util.JsonUtil;
import java.io.OutputStream;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.nio.charset.Charset;
import java.io.OutputStreamWriter;

public class PostStringArrayRequest {
	
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

	private final List<String> values;
	public List<String> getValues() {
		return values;
	}
	public PostStringArrayRequest(List<String> values){
		this.values = values;
	}
	
	void writeBody(TransformerProvider transformerProvider, OutputStream stream) throws TransformException {
		JsonWriter target = null;
		try {
			if(stream != null) {
				target = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				
			JsonUtil.writeStringList(target, values);
				
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
