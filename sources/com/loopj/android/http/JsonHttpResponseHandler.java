package com.loopj.android.http;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p000a.p001a.p002a.p003a.C0082e;

public class JsonHttpResponseHandler extends TextHttpResponseHandler {
    private static final String LOG_TAG = "JsonHttpRH";
    private boolean useRFC5179CompatibilityMode = true;

    public JsonHttpResponseHandler() {
        super(AsyncHttpResponseHandler.DEFAULT_CHARSET);
    }

    public JsonHttpResponseHandler(String str) {
        super(str);
    }

    public JsonHttpResponseHandler(boolean z) {
        super(AsyncHttpResponseHandler.DEFAULT_CHARSET);
        this.useRFC5179CompatibilityMode = z;
    }

    public JsonHttpResponseHandler(String str, boolean z) {
        super(str);
        this.useRFC5179CompatibilityMode = z;
    }

    public void onSuccess(int i, C0082e[] c0082eArr, JSONObject jSONObject) {
        AsyncHttpClient.log.mo1441w(LOG_TAG, "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
    }

    public void onSuccess(int i, C0082e[] c0082eArr, JSONArray jSONArray) {
        AsyncHttpClient.log.mo1441w(LOG_TAG, "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
    }

    public void onFailure(int i, C0082e[] c0082eArr, Throwable th, JSONObject jSONObject) {
        AsyncHttpClient.log.mo1442w(LOG_TAG, "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", th);
    }

    public void onFailure(int i, C0082e[] c0082eArr, Throwable th, JSONArray jSONArray) {
        AsyncHttpClient.log.mo1442w(LOG_TAG, "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", th);
    }

    public void onFailure(int i, C0082e[] c0082eArr, String str, Throwable th) {
        AsyncHttpClient.log.mo1442w(LOG_TAG, "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", th);
    }

    public void onSuccess(int i, C0082e[] c0082eArr, String str) {
        AsyncHttpClient.log.mo1441w(LOG_TAG, "onSuccess(int, Header[], String) was not overriden, but callback was received");
    }

    public final void onSuccess(final int i, final C0082e[] c0082eArr, final byte[] bArr) {
        if (i != 204) {
            Runnable c07571 = new Runnable() {
                public void run() {
                    try {
                        final Object parseResponse = JsonHttpResponseHandler.this.parseResponse(bArr);
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                if (!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && parseResponse == null) {
                                    JsonHttpResponseHandler.this.onSuccess(i, c0082eArr, (String) null);
                                } else if (parseResponse instanceof JSONObject) {
                                    JsonHttpResponseHandler.this.onSuccess(i, c0082eArr, (JSONObject) parseResponse);
                                } else if (parseResponse instanceof JSONArray) {
                                    JsonHttpResponseHandler.this.onSuccess(i, c0082eArr, (JSONArray) parseResponse);
                                } else if (!(parseResponse instanceof String)) {
                                    JsonHttpResponseHandler jsonHttpResponseHandler = JsonHttpResponseHandler.this;
                                    int i = i;
                                    C0082e[] c0082eArr = c0082eArr;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unexpected response type ");
                                    stringBuilder.append(parseResponse.getClass().getName());
                                    jsonHttpResponseHandler.onFailure(i, c0082eArr, new JSONException(stringBuilder.toString()), (JSONObject) null);
                                } else if (JsonHttpResponseHandler.this.useRFC5179CompatibilityMode) {
                                    JsonHttpResponseHandler.this.onFailure(i, c0082eArr, (String) parseResponse, new JSONException("Response cannot be parsed as JSON data"));
                                } else {
                                    JsonHttpResponseHandler.this.onSuccess(i, c0082eArr, (String) parseResponse);
                                }
                            }
                        });
                    } catch (final JSONException e) {
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                JsonHttpResponseHandler.this.onFailure(i, c0082eArr, e, (JSONObject) null);
                            }
                        });
                    }
                }
            };
            if (getUseSynchronousMode() == 0 && getUsePoolThread() == 0) {
                new Thread(c07571).start();
                return;
            } else {
                c07571.run();
                return;
            }
        }
        onSuccess(i, c0082eArr, new JSONObject());
    }

    public final void onFailure(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th) {
        if (bArr != null) {
            final byte[] bArr2 = bArr;
            final int i2 = i;
            final C0082e[] c0082eArr2 = c0082eArr;
            final Throwable th2 = th;
            Runnable c07602 = new Runnable() {
                public void run() {
                    try {
                        final Object parseResponse = JsonHttpResponseHandler.this.parseResponse(bArr2);
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                if (!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && parseResponse == null) {
                                    JsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, (String) null, th2);
                                } else if (parseResponse instanceof JSONObject) {
                                    JsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, th2, (JSONObject) parseResponse);
                                } else if (parseResponse instanceof JSONArray) {
                                    JsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, th2, (JSONArray) parseResponse);
                                } else if (parseResponse instanceof String) {
                                    JsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, (String) parseResponse, th2);
                                } else {
                                    JsonHttpResponseHandler jsonHttpResponseHandler = JsonHttpResponseHandler.this;
                                    int i = i2;
                                    C0082e[] c0082eArr = c0082eArr2;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unexpected response type ");
                                    stringBuilder.append(parseResponse.getClass().getName());
                                    jsonHttpResponseHandler.onFailure(i, c0082eArr, new JSONException(stringBuilder.toString()), (JSONObject) null);
                                }
                            }
                        });
                    } catch (final JSONException e) {
                        JsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                JsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, e, (JSONObject) null);
                            }
                        });
                    }
                }
            };
            if (getUseSynchronousMode() == 0 && getUsePoolThread() == 0) {
                new Thread(c07602).start();
                return;
            } else {
                c07602.run();
                return;
            }
        }
        AsyncHttpClient.log.mo1439v(LOG_TAG, "response body is null, calling onFailure(Throwable, JSONObject)");
        onFailure(i, c0082eArr, th, (JSONObject) null);
    }

    protected Object parseResponse(byte[] bArr) {
        Object obj = null;
        if (bArr == null) {
            return null;
        }
        bArr = TextHttpResponseHandler.getResponseString(bArr, getCharset());
        if (bArr != null) {
            bArr = bArr.trim();
            if (this.useRFC5179CompatibilityMode) {
                if (bArr.startsWith("{") || bArr.startsWith("[")) {
                    obj = new JSONTokener(bArr).nextValue();
                }
            } else if ((bArr.startsWith("{") && bArr.endsWith("}")) || (bArr.startsWith("[") && bArr.endsWith("]"))) {
                obj = new JSONTokener(bArr).nextValue();
            } else if (bArr.startsWith("\"") && bArr.endsWith("\"")) {
                obj = bArr.substring(1, bArr.length() - 1);
            }
        }
        if (obj != null) {
            bArr = obj;
        }
        return bArr;
    }

    public boolean isUseRFC5179CompatibilityMode() {
        return this.useRFC5179CompatibilityMode;
    }

    public void setUseRFC5179CompatibilityMode(boolean z) {
        this.useRFC5179CompatibilityMode = z;
    }
}
