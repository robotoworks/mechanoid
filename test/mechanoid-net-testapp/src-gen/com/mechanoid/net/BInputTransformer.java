package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.List;

public class BInputTransformer extends Transformer<JsonReader, B> {			
	public void transform(JsonReader source, B target) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("name")) {
					target.setName(source.nextString());
				}
				else if(name.equals("a")) {
					if(source.peek() != JsonToken.NULL) {
						A targetMember = new A();
						provider.get(AInputTransformer.class).transform(source, targetMember);
						target.setA(targetMember);
					} else {
						source.skipValue();
					}
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
	
	public void transform(JsonReader source, List<B> target) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				B targetItem = new B();
				transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}

