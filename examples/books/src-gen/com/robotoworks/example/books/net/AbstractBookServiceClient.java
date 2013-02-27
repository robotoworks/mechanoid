package com.robotoworks.example.books.net;


import com.robotoworks.mechanoid.net.Parser;
import java.io.IOException;
import com.robotoworks.mechanoid.net.Response;
import com.robotoworks.mechanoid.net.ServiceException;
import java.io.InputStream;
import com.robotoworks.mechanoid.net.ServiceClient;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;

public abstract class AbstractBookServiceClient extends ServiceClient {
	private static final String LOG_TAG = "BookServiceClient";
	
	protected static final String DEFAULT_BASE_URL = "http://books.example.com";
	
	private String apiTokenParam;
	private boolean apiTokenParamSet;
	
	public void setApiTokenParam(String value) {
		this.apiTokenParam = value;
		this.apiTokenParamSet = true;
	}
	
	@Override
	protected String getLogTag() {
		return LOG_TAG;
	}
	
	@Override
	protected JsonEntityWriterProvider createWriterProvider() {
		return new DefaultBookServiceClientWriterProvider();
	}
	
	@Override
	protected JsonEntityReaderProvider createReaderProvider() {
		return new DefaultBookServiceClientReaderProvider();
	}
	
	public AbstractBookServiceClient(String baseUrl, boolean debug){
		super(baseUrl, debug);
		
	}
	
	public Response<GetBooksResult> getBooks()
	  throws ServiceException {
	  	return getBooks(new GetBooksRequest());
	}
	
	public Response<GetBooksResult> getBooks(GetBooksRequest request)
	  throws ServiceException {
		if(this.apiTokenParamSet && !request.isApiTokenParamSet()){
			request.setApiTokenParam(this.apiTokenParam);
		}
		
		
		Parser<GetBooksResult> parser = new Parser<GetBooksResult>() {
			public GetBooksResult parse(InputStream inStream) throws IOException {
				return new GetBooksResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
	public Response<GetBookResult> getBook(GetBookRequest request)
	  throws ServiceException {
		if(this.apiTokenParamSet && !request.isApiTokenParamSet()){
			request.setApiTokenParam(this.apiTokenParam);
		}
		
		
		Parser<GetBookResult> parser = new Parser<GetBookResult>() {
			public GetBookResult parse(InputStream inStream) throws IOException {
				return new GetBookResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
	public Response<UpdateBookResult> updateBook(UpdateBookRequest request)
	  throws ServiceException {
		if(this.apiTokenParamSet && !request.isApiTokenParamSet()){
			request.setApiTokenParam(this.apiTokenParam);
		}
		
		
		Parser<UpdateBookResult> parser = new Parser<UpdateBookResult>() {
			public UpdateBookResult parse(InputStream inStream) throws IOException {
				return new UpdateBookResult(getReaderProvider(), inStream);
			}
		};
		
		return put(request, parser);
	}
	
	public Response<CreateBookResult> createBook(CreateBookRequest request)
	  throws ServiceException {
		if(this.apiTokenParamSet && !request.isApiTokenParamSet()){
			request.setApiTokenParam(this.apiTokenParam);
		}
		
		
		Parser<CreateBookResult> parser = new Parser<CreateBookResult>() {
			public CreateBookResult parse(InputStream inStream) throws IOException {
				return new CreateBookResult(getReaderProvider(), inStream);
			}
		};
		
		return post(request, parser);
	}
	
	public Response<DeleteBookResult> deleteBook(DeleteBookRequest request)
	  throws ServiceException {
		if(this.apiTokenParamSet && !request.isApiTokenParamSet()){
			request.setApiTokenParam(this.apiTokenParam);
		}
		
		
		Parser<DeleteBookResult> parser = new Parser<DeleteBookResult>() {
			public DeleteBookResult parse(InputStream inStream) throws IOException {
				return new DeleteBookResult(getReaderProvider(), inStream);
			}
		};
		
		return delete(request, parser);
	}
	
}
