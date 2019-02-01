package com.loopj.android.http;

import android.content.Context;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p013e.p016c.C0058i;
import p000a.p001a.p002a.p003a.p022i.p024b.C1324k;
import p000a.p001a.p002a.p003a.p034n.C0157e;

public class SyncHttpClient extends AsyncHttpClient {
    public SyncHttpClient() {
        super(false, 80, 443);
    }

    public SyncHttpClient(int i) {
        super(false, i, 443);
    }

    public SyncHttpClient(int i, int i2) {
        super(false, i, i2);
    }

    public SyncHttpClient(boolean z, int i, int i2) {
        super(z, i, i2);
    }

    public SyncHttpClient(C0058i c0058i) {
        super(c0058i);
    }

    protected RequestHandle sendRequest(C1324k c1324k, C0157e c0157e, C1238l c1238l, String str, ResponseHandlerInterface responseHandlerInterface, Context context) {
        if (str != null) {
            c1238l.addHeader(AsyncHttpClient.HEADER_CONTENT_TYPE, str);
        }
        responseHandlerInterface.setUseSynchronousMode(true);
        newAsyncHttpRequest(c1324k, c0157e, c1238l, str, responseHandlerInterface, context).run();
        return new RequestHandle(null);
    }
}
