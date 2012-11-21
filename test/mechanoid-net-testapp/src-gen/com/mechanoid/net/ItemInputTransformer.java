package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class ItemInputTransformer extends Transformer<JsonReader, Item> {			
	public void transform(JsonReader source, Item target) throws TransformException {
		try {
			source.beginObject();
			
			while(source.hasNext()) {
				String name = source.nextName();
				
				if(name.equals("a")) {
					target.setA(source.nextString());
				}
				else if(name.equals("b")) {
					target.setB(source.nextInt());
				}
				else if(name.equals("c")) {
					target.setC(source.nextLong());
				}
				else if(name.equals("d")) {
					target.setD(source.nextDouble());
				}
				else if(name.equals("e")) {
					target.setE(source.nextBoolean());
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
	
	public void transform(JsonReader source, List<Item> target) throws TransformException {
		
		try {
			source.beginArray();
			
			while(source.hasNext()) {
				Item targetItem = new Item();
				transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}

