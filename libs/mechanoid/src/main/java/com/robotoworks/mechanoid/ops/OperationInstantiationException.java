package com.robotoworks.mechanoid.ops;

public class OperationInstantiationException extends RuntimeException {

	private static final long serialVersionUID = 5994943040895507032L;
	
	public OperationInstantiationException(Throwable cause) {
		initCause(cause);
	}
}
