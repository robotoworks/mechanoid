package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class HeaderItemInputTransformer extends Transformer<JsonReader, HeaderItem> {			
	public void transform(JsonReader source, HeaderItem target) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("key")) {
					target.setKey(source.nextString());
				}
				else if(name.equals("value")) {
					target.setValue(source.nextString());
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
	
	public void transform(JsonReader source, List<HeaderItem> target) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				HeaderItem targetItem = new HeaderItem();
				transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}

