package com.example.books.net;


import com.robotoworks.mechanoid.net.Parser;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.Response;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.ClientProtocolException;
import android.net.Uri;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public class ARequest {
	
	private static final String PATH="/a";
	
	private String aParam;
	private boolean aParamSet;
	private String bParam;
	private boolean bParamSet;
	private int cParam;
	private boolean cParamSet;
		
	private final X a;
	private final List<Y> b;
	
	public void setAParam(String value) {
		this.aParam = value;
		this.aParamSet = true;
	}
	
	public boolean isAParamSet() {
		return aParamSet;
	}
	public void setBParam(String value) {
		this.bParam = value;
		this.bParamSet = true;
	}
	
	public boolean isBParamSet() {
		return bParamSet;
	}
	public void setCParam(int value) {
		this.cParam = value;
		this.cParamSet = true;
	}
	
	public boolean isCParamSet() {
		return cParamSet;
	}
		
	public ARequest(X a,
	List<Y> b){
		this.a = a;
		this.b = b;
	}
	
	public String createBody(TransformerProvider transformerProvider) throws TransformException {
		try {
			JSONObject target = new JSONObject();
			JSONObject meh = new JSONObject();
			target.putOpt("meh", meh);
			if(this.a != null) {
				JSONObject targetMember = transformerProvider.get(XOutputTransformer.class).transform(this.a);
				meh.put("a", targetMember);
			}
			if(this.b != null) {
				JSONArray targetMember = transformerProvider.get(YListOutputTransformer.class).transform(this.b);
				meh.put("b", targetMember);
			}
			return target.toString();
		} catch(Exception e) {
			throw new TransformException(e);
		}
	}
	
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		if(aParamSet){
			uriBuilder.appendQueryParameter("a", aParam);
		}
		if(bParamSet){
			uriBuilder.appendQueryParameter("b", bParam);
		}
		if(cParamSet){
			uriBuilder.appendQueryParameter("c", String.valueOf(cParam));
		}
		
		return uriBuilder.toString();			
	}
	
	protected Response<AResponse> execute(String baseUrl, ServiceClient client, TransformerProvider transformerProvider)
		throws ClientProtocolException, IOException, TransformException {
			
		String url = createUrl(baseUrl);
		
		final TransformerProvider tp = transformerProvider;
		
		Parser<AResponse> parser = new Parser<AResponse>() {
			public AResponse parse(InputStream inStream) throws TransformException {
				return new AResponse(tp, inStream);
			}

		};
		
		String body = createBody(transformerProvider);
		return new Response<AResponse>(client.postJson(url, body), parser);
	}
}	
