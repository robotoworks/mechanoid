package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;


public class HeaderItemTransformer extends Transformer<HeaderItem, JsonReader, JsonWriter> {			
	public void transformOut(HeaderItem subject, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("key");
			target.value(subject.getKey());
			target.name("value");
			target.value(subject.getValue());
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transformOut(List<HeaderItem> subject, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(HeaderItem item:subject) {
				transformOut(item, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	
	public void transformIn(JsonReader source, HeaderItem subject) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("key")) {
					subject.setKey(source.nextString());
				}
				else if(name.equals("value")) {
					subject.setValue(source.nextString());
				}
				else {
					source.skipValue();
				}
			}
			
			source.endObject();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
	
	public void transformIn(JsonReader source, List<HeaderItem> subject) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				HeaderItem item = new HeaderItem();
				transformIn(source, item);
				subject.add(item);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
