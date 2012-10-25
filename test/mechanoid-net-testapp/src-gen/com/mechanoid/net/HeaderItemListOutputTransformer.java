package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonWriter;
import java.util.List;

public class HeaderItemListOutputTransformer extends Transformer<List<HeaderItem>, JsonWriter> {			
	public void transform(List<HeaderItem> source, JsonWriter target) throws TransformException {
		
		HeaderItemOutputTransformer itemTransformer = provider.get(HeaderItemOutputTransformer.class);
		
		try {
			target.beginArray();
			
			for(HeaderItem sourceItem:source) {
				itemTransformer.transform(sourceItem, target);
			}
			
			target.endArray();
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
