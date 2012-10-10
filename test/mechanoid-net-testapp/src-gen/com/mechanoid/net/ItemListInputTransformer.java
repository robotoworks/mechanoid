package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import java.util.ArrayList;

public class ItemListInputTransformer extends Transformer<JsonReader, List<Item>> {
	public List<Item> transform(JsonReader source) throws TransformException {
		List<Item> target = new ArrayList<Item>();
	
		transform(source, target);
	
		return target;
	}

	public void transform(JsonReader source, List<Item> target) throws TransformException {
		
		try {
			ItemInputTransformer itemTransformer = provider.get(ItemInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				Item targetItem = itemTransformer.transform(source);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
