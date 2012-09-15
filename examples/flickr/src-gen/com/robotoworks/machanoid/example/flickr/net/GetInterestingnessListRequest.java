	package com.robotoworks.machanoid.example.flickr.net;

	
	import com.robotoworks.mechanoid.net.Parser;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.HttpRequestHelper;
import com.robotoworks.mechanoid.net.WebResponse;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.ClientProtocolException;
	import android.net.Uri;
	
	public class GetInterestingnessListRequest {
		
		private static final String PATH="?method=flicker.interesting&format=json";
		
		private String apiKeyParam;
		private int nojsoncallbackParam;
		
		public void setApiKeyParam(String value) {
			this.apiKeyParam = value;
		}
		public void setNojsoncallbackParam(int value) {
			this.nojsoncallbackParam = value;
		}
		
		public GetInterestingnessListRequest(){
		}
		
		public String createUrl(String baseUrl){
			Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			if(apiKeyParam != null){
				uriBuilder.appendQueryParameter("api_key", apiKeyParam.toString());
			}
			if(nojsoncallbackParam != null){
				uriBuilder.appendQueryParameter("nojsoncallback", nojsoncallbackParam.toString());
			}
	
			return uriBuilder.toString();
		}
		
		protected WebResponse<GetInterestingnessListResponse> execute(String baseUrl, HttpRequestHelper requestHelper, TransformerProvider transformerProvider)
			throws ClientProtocolException, IOException {
				
			String url = createUrl(baseUrl);
			
			final TransformerProvider tp = transformerProvider;
			
			Parser<GetInterestingnessListResponse> parser = new Parser<GetInterestingnessListResponse>() {
				public GetInterestingnessListResponse parse(InputStream inStream) throws TransformException {
					return new GetInterestingnessListResponse(tp, inStream);
				}
	
			};
			
			return requestHelper.getJson(url, parser);
		}
	}	
