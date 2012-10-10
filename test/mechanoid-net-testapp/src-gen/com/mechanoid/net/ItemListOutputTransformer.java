package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class ItemListOutputTransformer extends Transformer<List<Item>, JSONArray> {
	public JSONArray transform(List<Item> source) throws TransformException {
		JSONArray target = new JSONArray();
		
		transform(source, target);
		
		return target;
	}
	
	public void transform(List<Item> source, JSONArray target) throws TransformException {
		
		ItemOutputTransformer itemTransformer = provider.get(ItemOutputTransformer.class);
		for(Item sourceItem:source) {
			JSONObject targetItem = itemTransformer.transform(sourceItem);
			target.put(targetItem); 
		}
	}
}
