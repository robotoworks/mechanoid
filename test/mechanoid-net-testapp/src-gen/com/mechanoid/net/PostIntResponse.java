package com.mechanoid.net;

import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.util.Streams;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.util.Closeables;

public class PostIntResponse  {
	private int value;	
	public int getValue(){
		return this.value;
	}
	
	public PostIntResponse(TransformerProvider provider, InputStream inStream) throws TransformException {
	try {
		if(inStream != null) {
			String source = Streams.readAllText(inStream);
			
			this.value = Integer.valueOf(source);
		}
	} catch(Exception x) {
		throw new TransformException(x);
	} finally {
		Closeables.closeSilently(inStream);
	}
	}
}
