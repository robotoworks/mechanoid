package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.lang.Exception;
import org.json.JSONObject;

public class ItemOutputTransformer extends Transformer<Item, JSONObject> {
	public JSONObject transform(Item source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(Item source, JSONObject target) throws TransformException {
		try {
			target.putOpt("a", source.getA());
			target.putOpt("b", source.getB());
			target.putOpt("c", source.getC());
			target.putOpt("d", source.getD());
			target.putOpt("e", source.isE());
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
