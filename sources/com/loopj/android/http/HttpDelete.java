package com.loopj.android.http;

import java.net.URI;
import p000a.p001a.p002a.p003a.p005b.p007c.C1339e;

public final class HttpDelete extends C1339e {
    public static final String METHOD_NAME = "DELETE";

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpDelete(URI uri) {
        setURI(uri);
    }

    public HttpDelete(String str) {
        setURI(URI.create(str));
    }
}
