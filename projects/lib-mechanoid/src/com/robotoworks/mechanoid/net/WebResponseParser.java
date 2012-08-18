package com.robotoworks.mechanoid.net;

public interface WebResponseParser<T> {
	T parse(WebResponse<T> response) throws TransformException;
}
