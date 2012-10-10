package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonUtil;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import com.robotoworks.mechanoid.internal.util.JsonToken;

public class AInputTransformer extends Transformer<JsonReader, A> {
	public A transform(JsonReader source) throws TransformException {
		A target = new A();

		transform(source, target);
		
		return target;
	}
	
	public void transform(JsonReader source, A target) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("name")) {
					target.setName(source.nextString());
				}
				else if(name.equals("b")) {
					if(source.peek() != JsonToken.NULL) {
						B targetMember = provider.get(BInputTransformer.class).transform(source);
						target.setB(targetMember);
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
