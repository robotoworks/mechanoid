package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class ItemListInputTransformer extends Transformer<JsonReader, List<Item>> {
	public void transform(JsonReader source, List<Item> target) throws TransformException {
		
		try {
			ItemInputTransformer itemTransformer = provider.get(ItemInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				Item targetItem = new Item();
				itemTransformer.transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
