package com.loopj.android.http;

import java.net.URI;
import p000a.p001a.p002a.p003a.p005b.p007c.C1339e;

public final class HttpGet extends C1339e {
    public static final String METHOD_NAME = "GET";

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpGet(URI uri) {
        setURI(uri);
    }

    public HttpGet(String str) {
        setURI(URI.create(str));
    }
}
