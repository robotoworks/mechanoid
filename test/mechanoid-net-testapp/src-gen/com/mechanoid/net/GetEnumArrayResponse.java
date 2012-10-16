package com.mechanoid.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import com.robotoworks.mechanoid.net.TransformerProvider;
import java.io.InputStreamReader;
import com.robotoworks.mechanoid.util.Closeables;
import java.nio.charset.Charset;

public class GetEnumArrayResponse  {
	private List<Day> days;
	public List<Day> getDays(){
		return this.days;
	}
	
	public GetEnumArrayResponse(TransformerProvider provider, InputStream inStream) throws TransformException {
	JsonReader source = null;
	try {
		if(inStream != null) {
			source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
			this.days = new ArrayList<Day>();
			
			if(source.peek() != JsonToken.NULL) {
				
				source.beginArray();
				
				while(source.hasNext()) {
					Day element = Day.fromValue(source.nextString());
					this.days.add(element);
				}
				
				source.endArray();
			}
		}
	} catch(Exception x) {
		throw new TransformException(x);
	} finally {
		Closeables.closeSilently(source);
	}
	}
}
