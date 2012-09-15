package com.robotoworks.machanoid.example.flickr.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.lang.Exception;
import org.json.JSONObject;

public class PhotoOutputTransformer extends Transformer<Photo, JSONObject> {
	public void transform(Photo source, JSONObject target) throws TransformException {
		try {
			target.putOpt("id", source.getId());
			target.putOpt("owner", source.getOwner());
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
