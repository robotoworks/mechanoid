package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.List;
import java.lang.Exception;
import org.json.JSONObject;
import org.json.JSONArray;

public class XOutputTransformer extends Transformer<X, JSONObject> {
	public JSONObject transform(X source) throws TransformException {
		JSONObject target = new JSONObject();

		transform(source, target);
		
		return target;
	}
	
	public void transform(X source, JSONObject target) throws TransformException {
		try {
			target.putOpt("a", source.getA());
			if(source.getB() != null) {
				JSONArray targetMember = new JSONArray(source.getB());
				target.put("b", targetMember);	
			}
			target.putOpt("c", source.getC());
			if(source.getD() != null) {
				JSONArray targetMember = new JSONArray(source.getD());
				target.put("d", targetMember);	
			}
			target.putOpt("e", source.isE());
			if(source.getF() != null) {
				JSONArray targetMember = new JSONArray(source.getF());
				target.put("f", targetMember);	
			}
			target.putOpt("g", source.getG());
			if(source.getH() != null) {
				JSONArray targetMember = new JSONArray(source.getH());
				target.put("h", targetMember);	
			}
			if(source.getI() != null) {
				JSONObject targetMember = provider.get(YOutputTransformer.class).transform(source.getI());
				target.put("i", targetMember);
			}
			if(source.getJ() != null) {
				JSONArray targetMember = provider.get(YListOutputTransformer.class).transform(source.getJ());
				target.put("j", targetMember);
			}
		} catch (Exception x) {
			throw new TransformException(x);
		}
	}
}
