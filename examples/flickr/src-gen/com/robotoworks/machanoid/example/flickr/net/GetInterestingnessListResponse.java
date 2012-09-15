package com.robotoworks.machanoid.example.flickr.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.util.Streams;
import org.json.JSONObject;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class GetInterestingnessListResponse  {
	private int page;
	public int getPage(){
		return this.page;
	}
	
	public GetInterestingnessListResponse(TransformerProvider transformerProvider, InputStream inStream) throws TransformException {
		
		try {
			if(inStream != null){
				String content = Streams.readAllText(inStream);
				JSONObject source = new JSONObject(content);
				if(source.has("photos") && !source.isNull("photos")) {
					JSONObject photos = source.getJSONObject("photos");
					if(photos.has("page") && !photos.isNull("page")) {
						this.page = photos.getInt("page");
					}
				}
			}
		} catch(Exception x) {
			throw new TransformException(x);
		} finally {
			Closeables.closeSilently(inStream);
		}
	}
}
