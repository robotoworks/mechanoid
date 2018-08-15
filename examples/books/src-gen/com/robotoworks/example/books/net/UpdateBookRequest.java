package com.robotoworks.example.books.net;


import android.net.Uri;

import com.robotoworks.mechanoid.internal.util.JsonWriter;
import com.robotoworks.mechanoid.net.EntityEnclosedServiceRequest;
import com.robotoworks.mechanoid.net.JsonEntityWriterProvider;
import com.robotoworks.mechanoid.util.Closeables;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class UpdateBookRequest extends EntityEnclosedServiceRequest {

    private static final String PATH = "/books";
    private final Book book;
    private String apiTokenParam;
    private boolean apiTokenParamSet;

    public UpdateBookRequest(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public UpdateBookRequest setApiTokenParam(String value) {
        this.apiTokenParam = value;
        this.apiTokenParamSet = true;
        return this;
    }

    public boolean isApiTokenParamSet() {
        return apiTokenParamSet;
    }

    @Override
    public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {
        JsonWriter writer = null;
        try {
            if (stream != null) {
                writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));

                provider.get(Book.class).write(writer, book);

            }
        } finally {
            Closeables.closeSilently(writer);
        }
    }

    @Override
    public String createUrl(String baseUrl) {
        Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();

        if (apiTokenParamSet) {
            uriBuilder.appendQueryParameter("api_token", apiTokenParam);
        }

        return uriBuilder.toString();
    }
}
