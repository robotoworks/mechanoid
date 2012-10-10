package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonUtil;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class BInputTransformer extends Transformer<JsonReader, B> {
	public B transform(JsonReader source) throws TransformException {
		B target = new B();

		transform(source, target);
		
		return target;
	}
	
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
						A targetMember = provider.get(AInputTransformer.class).transform(source);
						target.setA(targetMember);
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
}
