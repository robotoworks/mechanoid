package com.robotoworks.mechanoid.net;

public class TransformException extends Exception {

	private static final long serialVersionUID = 8657261233339956621L;
	
	public TransformException(Throwable cause) {
		initCause(cause);
	}
}
