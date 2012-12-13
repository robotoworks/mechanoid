package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import java.util.List;


public class BTransformer extends Transformer<B, JsonReader, JsonWriter> {			
	public void transformOut(B subject, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("name");
			target.value(subject.getName());
			if(subject.getA() != null) {
				target.name("a");
				provider.get(ATransformer.class).transformOut(subject.getA(), target);
			}
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transformOut(List<B> subject, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(B item:subject) {
				transformOut(item, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	
	public void transformIn(JsonReader source, B subject) throws TransformException {
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
				else if(name.equals("a")) {
					A subjectMember = new A();
					provider.get(ATransformer.class).transformIn(source, subjectMember);
					subject.setA(subjectMember);
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
	
	public void transformIn(JsonReader source, List<B> subject) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				B item = new B();
				transformIn(source, item);
				subject.add(item);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
