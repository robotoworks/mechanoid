package com.robotoworks.example.books.net;


import com.robotoworks.mechanoid.internal.util.JsonReader;
import com.robotoworks.mechanoid.internal.util.JsonToken;
import com.robotoworks.mechanoid.net.JsonEntityReaderProvider;
import com.robotoworks.mechanoid.net.JsonReaderUtil;
import com.robotoworks.mechanoid.net.ServiceResult;
import com.robotoworks.mechanoid.util.Closeables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class DeleteBookResult extends ServiceResult {
    private boolean success;
    private String statusMessage;

    public DeleteBookResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
        JsonReader reader = null;
        try {
            if (inStream != null) {
                reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
                DeleteBookResult subject = this;
                reader.beginObject();

                while (reader.hasNext()) {
                    String name = reader.nextName();

                    if (reader.peek() == JsonToken.NULL) {
                        reader.skipValue();
                        continue;
                    }

                    if (name.equals("status_message")) {
                        subject.setStatusMessage(reader.nextString());
                    } else if (name.equals("success")) {
                        subject.setSuccess(JsonReaderUtil.coerceNextBoolean(reader));
                    } else {
                        reader.skipValue();
                    }
                }

                reader.endObject();
            }
        } finally {
            Closeables.closeSilently(reader);
        }
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean value) {
        this.success = value;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }
}
