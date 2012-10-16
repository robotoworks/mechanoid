package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;

public class ItemListOutputTransformer extends Transformer<List<Item>, JsonWriter> {			
	public void transform(List<Item> source, JsonWriter target) throws TransformException {
		
		ItemOutputTransformer itemTransformer = provider.get(ItemOutputTransformer.class);
		
		try {
			target.beginArray();
			
			for(Item sourceItem:source) {
				itemTransformer.transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
