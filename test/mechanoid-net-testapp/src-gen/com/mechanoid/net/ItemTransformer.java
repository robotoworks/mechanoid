package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;


public class ItemTransformer extends Transformer<Item, JsonReader, JsonWriter> {			
	public void transformOut(Item subject, JsonWriter target) throws TransformException {
		try {

			target.beginObject();
			
			target.name("a");
			target.value(subject.getA());
			target.name("b");
			target.value(subject.getB());
			target.name("c");
			target.value(subject.getC());
			target.name("d");
			target.value(subject.getD());
			target.name("e");
			target.value(subject.isE());
			
			target.endObject();

		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	public void transformOut(List<Item> subject, JsonWriter target) throws TransformException {
		try {
			target.beginArray();
			
			for(Item item:subject) {
				transformOut(item, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
	
	public void transformIn(JsonReader source, Item subject) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("a")) {
					subject.setA(source.nextString());
				}
				else if(name.equals("b")) {
					subject.setB(source.nextInt());
				}
				else if(name.equals("c")) {
					subject.setC(source.nextLong());
				}
				else if(name.equals("d")) {
					subject.setD(source.nextDouble());
				}
				else if(name.equals("e")) {
					subject.setE(source.nextBoolean());
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
	
	public void transformIn(JsonReader source, List<Item> subject) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				Item item = new Item();
				transformIn(source, item);
				subject.add(item);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
