package com.robotoworks.machanoid.example.flickr.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class PhotoListInputTransformer extends Transformer<JSONArray, List<Photo>> {
	public void transform(JSONArray source, List<Photo> target) throws TransformException {
		try {
			PhotoInputTransformer itemTransformer = provider.get(PhotoInputTransformer.class);
			for(int i=0; i < source.length(); i++) {
				Photo targetItem = new Photo();
				target.add(targetItem);
				itemTransformer.transform(source.getJSONObject(i), targetItem);
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
	}
}
