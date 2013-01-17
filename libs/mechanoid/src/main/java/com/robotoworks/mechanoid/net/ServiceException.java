package com.robotoworks.mechanoid.net;

public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ServiceException(Throwable cause) {
		initCause(cause);
	}


}
