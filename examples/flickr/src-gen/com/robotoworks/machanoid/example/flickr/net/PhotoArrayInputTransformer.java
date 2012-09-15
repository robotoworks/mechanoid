package com.robotoworks.machanoid.example.flickr.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;	
import org.json.JSONArray;
import org.json.JSONException;

public class PhotoArrayInputTransformer extends Transformer<JSONArray, Photo[]> {
	public void transform(JSONArray source, Photo[] target) throws TransformException {
		try {
			PhotoInputTransformer itemTransformer = provider.get(PhotoInputTransformer.class);
			for(int i=0; i < source.length(); i++) {
				target[i] = new Photo();
				itemTransformer.transform(source.getJSONObject(i), target[i]);
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
	}
}
