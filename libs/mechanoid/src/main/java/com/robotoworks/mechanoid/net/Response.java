package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Response<T> {
	
	public static final int HTTP_INVALID = -1;
	/**
	 * Standard response for successful HTTP requests. The actual response will depend on 
	 * the request method used. In a GET request, the response will contain an entity 
	 * corresponding to the requested resource. In a POST request the response 
	 * will contain an entity describing or containing the result of the action
	 */
	public static final int HTTP_OK = 200;
	/**
	 * The request has been fulfilled and resulted in a new resource being created.
	 */
	public static final int HTTP_CREATED = 201;
	
	/**
	 * The request has been accepted for processing, but the processing has 
	 * not been completed. The request might or might not eventually be acted upon, 
	 * as it might be disallowed when processing actually takes place
	 */
	public static final int HTTP_ACCEPTED = 202;
	/**
	 * The server successfully processed the request, but is returning information 
	 * that may be from another source
	 */
	public static final int HTTP_NOT_AUTHORITATIVE = 203;
	public static final int HTTP_NO_CONTENT = 204;
	public static final int HTTP_PARTIAL = 206;
    public static final int HTTP_BAD_GATEWAY = 502;
    public static final int HTTP_BAD_METHOD = 405;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_CLIENT_TIMEOUT = 408;
    public static final int HTTP_CONFLICT = 409;
    public static final int HTTP_ENTITY_TOO_LARGE = 413;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_GATEWAY_TIMEOUT = 504;
    public static final int HTTP_GONE = 410;
    public static final int HTTP_INTERNAL_ERROR = 500;
    public static final int HTTP_LENGTH_REQUIRED = 411;
    public static final int HTTP_MOVED_PERM = 301;
    public static final int HTTP_MOVED_TEMP = 302;
    public static final int HTTP_MULT_CHOICE = 300;
    public static final int HTTP_NOT_ACCEPTABLE = 406;
    public static final int HTTP_NOT_FOUND = 404;
    public static final int HTTP_NOT_IMPLEMENTED = 501;
    public static final int HTTP_NOT_MODIFIED = 304;
    public static final int HTTP_PAYMENT_REQUIRED = 402;
    public static final int HTTP_PRECON_FAILED = 412;
    public static final int HTTP_PROXY_AUTH = 407;
    public static final int HTTP_REQ_TOO_LONG = 414;
    public static final int HTTP_RESET = 205;
    public static final int HTTP_SEE_OTHER = 303;
    public static final int HTTP_USE_PROXY = 305;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final int HTTP_UNSUPPORTED_TYPE = 415;
    public static final int HTTP_UNAVAILABLE = 503;
    public static final int HTTP_VERSION = 505;
    
	/**
	 * @return The HTTP Response Code, i.e.:- 200
	 */
	public abstract int getResponseCode();

	/**
	 * <p>Checks to see if the response code is HTTP_OK and if not, throws
	 * a {@link UnexpectedHttpStatusException}.</p>
	 * 
	 * <p>In some circumstances it is useful to call this to enforce a post condition
	 * on the response code to ensure its HTTP_OK before continuing</p>
	 */
	public abstract void checkResponseCodeOk()
			throws UnexpectedHttpStatusException;

	/**
	 * <p>Checks to see if the response code is the given response code and if not, throws
	 * a {@link UnexpectedHttpStatusException}.</p>
	 * 
	 * <p>In some circumstances it is useful to call this to enforce a post condition
	 * on the response code to ensure its of a certain code before continuing</p>
	 */
	public abstract void checkResponseCode(int responseCode)
			throws UnexpectedHttpStatusException;

	/**
	 * @return A Map of header fields
	 */
	public abstract Map<String, List<String>> getHeaders();

	/**
	 * Parses the response stream into <T>
	 * @return The parsed response <T>
	 * @throws ServiceException
	 */
	public abstract T parse() throws ServiceException;

	/**
	 * Reads the stream as text, the underlying stream will first be copied
	 * into a byte buffer before being returned as a string. this will make sure
	 * that calls to parse() will still succeed, this is useful for debugging
	 * purposes but should be avoided if the intention is just to parse
	 * 
	 * @return
	 * @throws IOException
	 */
	public abstract String readAsText() throws IOException;

}