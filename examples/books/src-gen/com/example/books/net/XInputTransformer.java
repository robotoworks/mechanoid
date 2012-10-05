package com.example.books.net;

import com.robotoworks.mechanoid.net.Transformer;
import com.robotoworks.mechanoid.net.TransformException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class XInputTransformer extends Transformer<JSONObject, X> {
	public X transform(JSONObject source) throws TransformException {
		X target = new X();

		transform(source, target);
		
		return target;
	}
	public void transform(JSONObject source, X target) throws TransformException {
		try {
			if(source.has("a") && !source.isNull("a")) {
				target.setA(source.getString("a"));
			}
			if(source.has("b") && !source.isNull("b")) {
				JSONArray sourceMember = source.getJSONArray("b");
				List<String> targetMember = new ArrayList<String>(sourceMember.length());
				
				for(int i=0; i < sourceMember.length(); i++) {
					targetMember.add(sourceMember.getString(i));
				}
				
				target.setB(targetMember);
			}
			if(source.has("c") && !source.isNull("c")) {
				target.setC(source.getInt("c"));
			}
			if(source.has("d") && !source.isNull("d")) {
				JSONArray sourceMember = source.getJSONArray("d");
				List<Integer> targetMember = new ArrayList<Integer>(sourceMember.length());
				
				for(int i=0; i < sourceMember.length(); i++) {
					targetMember.add(sourceMember.getInt(i));
				}
				
				target.setD(targetMember);
			}
			if(source.has("e") && !source.isNull("e")) {
				target.setE(source.getBoolean("e"));
			}
			if(source.has("f") && !source.isNull("f")) {
				JSONArray sourceMember = source.getJSONArray("f");
				List<Boolean> targetMember = new ArrayList<Boolean>(sourceMember.length());
				
				for(int i=0; i < sourceMember.length(); i++) {
					targetMember.add(sourceMember.getBoolean(i));
				}
				
				target.setF(targetMember);
			}
			if(source.has("g") && !source.isNull("g")) {
				target.setG(source.getLong("g"));
			}
			if(source.has("h") && !source.isNull("h")) {
				JSONArray sourceMember = source.getJSONArray("h");
				List<Long> targetMember = new ArrayList<Long>(sourceMember.length());
				
				for(int i=0; i < sourceMember.length(); i++) {
					targetMember.add(sourceMember.getLong(i));
				}
				
				target.setH(targetMember);
			}
			if(source.has("i") && !source.isNull("i")) {
				Y targetMember = provider.get(YInputTransformer.class).transform(source.getJSONObject("i"));
				target.setI(targetMember);
			}
			if(source.has("j") && !source.isNull("j")) {
				JSONArray sourceMember = source.getJSONArray("j");
				List<Y> targetMember = provider.get(YListInputTransformer.class).transform(sourceMember);
				target.setJ(targetMember);
			}
		} catch (JSONException x) {
			throw new TransformException(x);
		}
		
	}
}
