package com.loopj.android.http;

import p000a.p001a.p002a.p003a.C0082e;

public abstract class TextHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "TextHttpRH";

    public abstract void onFailure(int i, C0082e[] c0082eArr, String str, Throwable th);

    public abstract void onSuccess(int i, C0082e[] c0082eArr, String str);

    public TextHttpResponseHandler() {
        this(AsyncHttpResponseHandler.DEFAULT_CHARSET);
    }

    public TextHttpResponseHandler(String str) {
        setCharset(str);
    }

    public static String getResponseString(byte[] bArr, String str) {
        String str2;
        if (bArr == null) {
            str2 = null;
        } else {
            try {
                str2 = new String(bArr, str);
            } catch (byte[] bArr2) {
                AsyncHttpClient.log.mo1431e(LOG_TAG, "Encoding response into string failed", bArr2);
                return null;
            }
        }
        return (str2 == null || str2.startsWith(AsyncHttpResponseHandler.UTF8_BOM) == null) ? str2 : str2.substring(1);
    }

    public void onSuccess(int i, C0082e[] c0082eArr, byte[] bArr) {
        onSuccess(i, c0082eArr, getResponseString(bArr, getCharset()));
    }

    public void onFailure(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th) {
        onFailure(i, c0082eArr, getResponseString(bArr, getCharset()), th);
    }
}
