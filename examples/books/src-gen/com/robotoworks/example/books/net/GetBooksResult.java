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
import java.util.ArrayList;
import java.util.List;

public class GetBooksResult extends ServiceResult {
    private List<Book> books;

    public GetBooksResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
        JsonReader reader = null;
        try {
            if (inStream != null) {
                reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
                this.books = new ArrayList<Book>();
                provider.get(Book.class).readList(reader, this.books);
            }
        } finally {
            Closeables.closeSilently(reader);
        }
    }

    public List<Book> getBooks() {
        return this.books;
    }
}
