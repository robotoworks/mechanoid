package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.List;


public class ATransformer extends Transformer<A, JsonReader, JsonWriter> {			
	public void transformOut(A subject, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("name");
			target.value(subject.getName());
			if(subject.getB() != null) {
				target.name("b");
				provider.get(BTransformer.class).transformOut(subject.getB(), target);
			}
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transformOut(List<A> subject, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(A item:subject) {
				transformOut(item, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	
	public void transformIn(JsonReader source, A subject) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(source.peek() == JsonToken.NULL) {
					source.skipValue();
					continue;
				}
				
				if(name.equals("name")) {
					subject.setName(source.nextString());
				}
				else if(name.equals("b")) {
					B subjectMember = new B();
					provider.get(BTransformer.class).transformIn(source, subjectMember);
					subject.setB(subjectMember);
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
	
	public void transformIn(JsonReader source, List<A> subject) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				A item = new A();
				transformIn(source, item);
				subject.add(item);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
