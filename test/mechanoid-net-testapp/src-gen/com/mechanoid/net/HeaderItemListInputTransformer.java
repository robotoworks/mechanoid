package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;

public class HeaderItemListInputTransformer extends Transformer<JsonReader, List<HeaderItem>> {
	public void transform(JsonReader source, List<HeaderItem> target) throws TransformException {
		
		try {
			HeaderItemInputTransformer itemTransformer = provider.get(HeaderItemInputTransformer.class);
			
			source.beginArray();
			
			while(source.hasNext()) {
				HeaderItem targetItem = new HeaderItem();
				itemTransformer.transform(source, targetItem);
				target.add(targetItem);
				
			}
			
			source.endArray();
			
		} catch (Exception x) {
			throw new TransformException(x);
		}
		
	}
}
