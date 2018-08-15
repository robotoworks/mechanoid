package com.robotoworks.example.books.net;


import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import com.robotoworks.mechanoid.net.ServiceResult;
import com.robotoworks.mechanoid.util.Closeables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class GetBookResult extends ServiceResult {
    private Book book;

    public GetBookResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
        JsonReader reader = null;
        try {
            if (inStream != null) {
                reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
                this.book = new Book();
                provider.get(Book.class).read(reader, this.book);
            }
        } finally {
            Closeables.closeSilently(reader);
        }
    }

    public Book getBook() {
        return this.book;
    }
}
