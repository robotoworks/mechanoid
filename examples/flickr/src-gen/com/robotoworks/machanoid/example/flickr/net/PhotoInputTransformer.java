package com.robotoworks.machanoid.example.flickr.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import org.json.JSONObject;
import org.json.JSONException;

public class PhotoInputTransformer extends Transformer<JSONObject, Photo> {
	public void transform(JSONObject source, Photo target) throws TransformException {
		try {
			if(source.has("id") && !source.isNull("id")) {
				target.setId(source.getInt("id"));
			}
			if(source.has("owner") && !source.isNull("owner")) {
				target.setOwner(source.getInt("owner"));
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
	}
}
