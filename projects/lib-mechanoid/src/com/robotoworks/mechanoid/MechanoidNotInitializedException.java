package com.robotoworks.mechanoid;

public class MechanoidNotInitializedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MechanoidNotInitializedException() {
		super("Mechanoid.init(Context) must be called before mechanoid can be used");
	}
}
