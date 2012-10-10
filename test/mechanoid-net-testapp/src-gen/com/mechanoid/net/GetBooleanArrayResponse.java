package com.mechanoid.net;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.io.InputStream;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.internal.util.JsonReader;
import java.util.List;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.internal.util.JsonUtil;
import com.robotoworks.mechanoid.util.Closeables;
import java.io.IOException;

public class GetBooleanArrayResponse  {
	private List<Boolean> values;
	public List<Boolean> getValues(){
		return this.values;
	}
	
	public GetBooleanArrayResponse(TransformerProvider provider, InputStream inStream) throws TransformException {
	JsonReader source = null;
	try {
		if(inStream != null) {
			source = new JsonReader(new InputStreamReader(inStream, Charset.defaultCharset()));
			this.values = JsonUtil.readBooleanList(source);
		}
	} catch(Exception x) {
		throw new TransformException(x);
	} finally {
		Closeables.closeSilently(source);
	}
	}
}
