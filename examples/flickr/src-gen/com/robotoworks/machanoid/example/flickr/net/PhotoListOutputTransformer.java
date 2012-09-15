package com.robotoworks.machanoid.example.flickr.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class PhotoListOutputTransformer extends Transformer<List<Photo>, JSONArray> {
	public void transform(List<Photo> source, JSONArray target) throws TransformException {
		PhotoOutputTransformer itemTransformer = provider.get(PhotoOutputTransformer.class);
		for(Photo sourceItem:source) {
			JSONObject targetItem = new JSONObject();
			itemTransformer.transform(sourceItem, targetItem);
			target.put(targetItem); 
		}
	}
}
