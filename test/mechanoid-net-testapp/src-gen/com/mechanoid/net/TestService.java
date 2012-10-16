package com.mechanoid.net;

import com.robotoworks.mechanoid.net.Parser;
import com.robotoworks.mechanoid.net.TransformException;
import com.robotoworks.mechanoid.net.TransformerProvider;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestService {
	
	private static final String DEFAULT_BASE_URL = "http://10.0.2.2:8080/mechanoid-net-service/test";
	
	private final TransformerProvider transformerProvider;
	private final String baseUrl;
	
	
	public TestService(){
		this(DEFAULT_BASE_URL, new TransformerProvider());
	}

	public TestService(TransformerProvider transformerProvider){
		this(DEFAULT_BASE_URL, transformerProvider);
	}
	
	public TestService(String baseUrl){
		this(baseUrl, new TransformerProvider());
	}

	public TestService(String baseUrl, TransformerProvider transformerProvider){
		this.baseUrl = baseUrl;
		this.transformerProvider = transformerProvider;
	}
	
	public Response<GetStringArrayResponse> getStringArray()
	  throws ServiceException {
	  	return getStringArray(new GetStringArrayRequest());
	}
	
	public Response<GetStringArrayResponse> getStringArray(GetStringArrayRequest request)
	  throws ServiceException {
		
		Parser<GetStringArrayResponse> parser = new Parser<GetStringArrayResponse>() {
			public GetStringArrayResponse parse(InputStream inStream) throws TransformException {
				return new GetStringArrayResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetStringArrayResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetIntArrayResponse> getIntArray()
	  throws ServiceException {
	  	return getIntArray(new GetIntArrayRequest());
	}
	
	public Response<GetIntArrayResponse> getIntArray(GetIntArrayRequest request)
	  throws ServiceException {
		
		Parser<GetIntArrayResponse> parser = new Parser<GetIntArrayResponse>() {
			public GetIntArrayResponse parse(InputStream inStream) throws TransformException {
				return new GetIntArrayResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetIntArrayResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetLongArrayResponse> getLongArray()
	  throws ServiceException {
	  	return getLongArray(new GetLongArrayRequest());
	}
	
	public Response<GetLongArrayResponse> getLongArray(GetLongArrayRequest request)
	  throws ServiceException {
		
		Parser<GetLongArrayResponse> parser = new Parser<GetLongArrayResponse>() {
			public GetLongArrayResponse parse(InputStream inStream) throws TransformException {
				return new GetLongArrayResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetLongArrayResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetDoubleArrayResponse> getDoubleArray()
	  throws ServiceException {
	  	return getDoubleArray(new GetDoubleArrayRequest());
	}
	
	public Response<GetDoubleArrayResponse> getDoubleArray(GetDoubleArrayRequest request)
	  throws ServiceException {
		
		Parser<GetDoubleArrayResponse> parser = new Parser<GetDoubleArrayResponse>() {
			public GetDoubleArrayResponse parse(InputStream inStream) throws TransformException {
				return new GetDoubleArrayResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetDoubleArrayResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetBooleanArrayResponse> getBooleanArray()
	  throws ServiceException {
	  	return getBooleanArray(new GetBooleanArrayRequest());
	}
	
	public Response<GetBooleanArrayResponse> getBooleanArray(GetBooleanArrayRequest request)
	  throws ServiceException {
		
		Parser<GetBooleanArrayResponse> parser = new Parser<GetBooleanArrayResponse>() {
			public GetBooleanArrayResponse parse(InputStream inStream) throws TransformException {
				return new GetBooleanArrayResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetBooleanArrayResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetEnumArrayResponse> getEnumArray()
	  throws ServiceException {
	  	return getEnumArray(new GetEnumArrayRequest());
	}
	
	public Response<GetEnumArrayResponse> getEnumArray(GetEnumArrayRequest request)
	  throws ServiceException {
		
		Parser<GetEnumArrayResponse> parser = new Parser<GetEnumArrayResponse>() {
			public GetEnumArrayResponse parse(InputStream inStream) throws TransformException {
				return new GetEnumArrayResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetEnumArrayResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetItemResponse> getItem()
	  throws ServiceException {
	  	return getItem(new GetItemRequest());
	}
	
	public Response<GetItemResponse> getItem(GetItemRequest request)
	  throws ServiceException {
		
		Parser<GetItemResponse> parser = new Parser<GetItemResponse>() {
			public GetItemResponse parse(InputStream inStream) throws TransformException {
				return new GetItemResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetItemResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetNodesResponse> getNodes()
	  throws ServiceException {
	  	return getNodes(new GetNodesRequest());
	}
	
	public Response<GetNodesResponse> getNodes(GetNodesRequest request)
	  throws ServiceException {
		
		Parser<GetNodesResponse> parser = new Parser<GetNodesResponse>() {
			public GetNodesResponse parse(InputStream inStream) throws TransformException {
				return new GetNodesResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetNodesResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<EchoParamsResponse> echoParams()
	  throws ServiceException {
	  	return echoParams(new EchoParamsRequest());
	}
	
	public Response<EchoParamsResponse> echoParams(EchoParamsRequest request)
	  throws ServiceException {
		
		Parser<EchoParamsResponse> parser = new Parser<EchoParamsResponse>() {
			public EchoParamsResponse parse(InputStream inStream) throws TransformException {
				return new EchoParamsResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<EchoParamsResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<SkippingResponse> skipping()
	  throws ServiceException {
	  	return skipping(new SkippingRequest());
	}
	
	public Response<SkippingResponse> skipping(SkippingRequest request)
	  throws ServiceException {
		
		Parser<SkippingResponse> parser = new Parser<SkippingResponse>() {
			public SkippingResponse parse(InputStream inStream) throws TransformException {
				return new SkippingResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<SkippingResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<SkippingWithItemResponse> skippingWithItem()
	  throws ServiceException {
	  	return skippingWithItem(new SkippingWithItemRequest());
	}
	
	public Response<SkippingWithItemResponse> skippingWithItem(SkippingWithItemRequest request)
	  throws ServiceException {
		
		Parser<SkippingWithItemResponse> parser = new Parser<SkippingWithItemResponse>() {
			public SkippingWithItemResponse parse(InputStream inStream) throws TransformException {
				return new SkippingWithItemResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<SkippingWithItemResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<GetABResponse> getAB()
	  throws ServiceException {
	  	return getAB(new GetABRequest());
	}
	
	public Response<GetABResponse> getAB(GetABRequest request)
	  throws ServiceException {
		
		Parser<GetABResponse> parser = new Parser<GetABResponse>() {
			public GetABResponse parse(InputStream inStream) throws TransformException {
				return new GetABResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			return new Response<GetABResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public Response<SkippingPostResponse> skippingPost(SkippingPostRequest request)
	  throws ServiceException {
		
		Parser<SkippingPostResponse> parser = new Parser<SkippingPostResponse>() {
			public SkippingPostResponse parse(InputStream inStream) throws TransformException {
				return new SkippingPostResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			return new Response<SkippingPostResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	}
	
	public Response<PostIntResponse> postInt(PostIntRequest request)
	  throws ServiceException {
		
		Parser<PostIntResponse> parser = new Parser<PostIntResponse>() {
			public PostIntResponse parse(InputStream inStream) throws TransformException {
				return new PostIntResponse(transformerProvider, inStream);
			}
		};
		
		try {
			URL url = new URL(request.createUrl(baseUrl));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			conn.connect();
			
			request.writeBody(transformerProvider, conn.getOutputStream());
			
			return new Response<PostIntResponse>(conn, parser);
		
		} 
		catch(Exception e) {
			throw new ServiceException(e);
		}	
	}
	
}
