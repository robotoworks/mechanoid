package com.robotoworks.mechanoid.net;

import java.io.IOException;
import java.io.InputStream;

public interface Parser<T> {
	T parse(InputStream stream) throws IOException;
}
