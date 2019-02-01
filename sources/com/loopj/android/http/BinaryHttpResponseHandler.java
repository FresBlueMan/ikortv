package com.loopj.android.http;

import android.os.Looper;
import java.util.regex.Pattern;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p005b.C0812l;

public abstract class BinaryHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "BinaryHttpRH";
    private String[] mAllowedContentTypes;

    public abstract void onFailure(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th);

    public abstract void onSuccess(int i, C0082e[] c0082eArr, byte[] bArr);

    public BinaryHttpResponseHandler() {
        this.mAllowedContentTypes = new String[]{RequestParams.APPLICATION_OCTET_STREAM, "image/jpeg", "image/png", "image/gif"};
    }

    public BinaryHttpResponseHandler(String[] strArr) {
        this.mAllowedContentTypes = new String[]{RequestParams.APPLICATION_OCTET_STREAM, "image/jpeg", "image/png", "image/gif"};
        if (strArr != null) {
            this.mAllowedContentTypes = strArr;
        } else {
            AsyncHttpClient.log.mo1430e(LOG_TAG, "Constructor passed allowedContentTypes was null !");
        }
    }

    public BinaryHttpResponseHandler(String[] strArr, Looper looper) {
        super(looper);
        this.mAllowedContentTypes = new String[]{RequestParams.APPLICATION_OCTET_STREAM, "image/jpeg", "image/png", "image/gif"};
        if (strArr != null) {
            this.mAllowedContentTypes = strArr;
        } else {
            AsyncHttpClient.log.mo1430e(LOG_TAG, "Constructor passed allowedContentTypes was null !");
        }
    }

    public String[] getAllowedContentTypes() {
        return this.mAllowedContentTypes;
    }

    public final void sendResponseMessage(C0916s c0916s) {
        af a = c0916s.mo1628a();
        C0082e[] headers = c0916s.getHeaders(AsyncHttpClient.HEADER_CONTENT_TYPE);
        if (headers.length != 1) {
            sendFailureMessage(a.mo147b(), c0916s.getAllHeaders(), null, new C0812l(a.mo147b(), "None, or more than one, Content-Type Header found!"));
            return;
        }
        int i = 0;
        C0082e c0082e = headers[0];
        String[] allowedContentTypes = getAllowedContentTypes();
        int length = allowedContentTypes.length;
        Object obj = null;
        while (i < length) {
            String str = allowedContentTypes[i];
            try {
                if (Pattern.matches(str, c0082e.mo122d())) {
                    obj = 1;
                }
            } catch (Throwable e) {
                LogInterface logInterface = AsyncHttpClient.log;
                String str2 = LOG_TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Given pattern is not valid: ");
                stringBuilder.append(str);
                logInterface.mo1431e(str2, stringBuilder.toString(), e);
            }
            i++;
        }
        if (obj == null) {
            i = a.mo147b();
            c0916s = c0916s.getAllHeaders();
            int b = a.mo147b();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Content-Type (");
            stringBuilder2.append(c0082e.mo122d());
            stringBuilder2.append(") not allowed!");
            sendFailureMessage(i, c0916s, null, new C0812l(b, stringBuilder2.toString()));
            return;
        }
        super.sendResponseMessage(c0916s);
    }
}
