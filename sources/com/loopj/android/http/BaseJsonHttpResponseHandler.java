package com.loopj.android.http;

import p000a.p001a.p002a.p003a.C0082e;

public abstract class BaseJsonHttpResponseHandler<JSON_TYPE> extends TextHttpResponseHandler {
    private static final String LOG_TAG = "BaseJsonHttpRH";

    public abstract void onFailure(int i, C0082e[] c0082eArr, Throwable th, String str, JSON_TYPE json_type);

    public abstract void onSuccess(int i, C0082e[] c0082eArr, String str, JSON_TYPE json_type);

    protected abstract JSON_TYPE parseResponse(String str, boolean z);

    public BaseJsonHttpResponseHandler() {
        this(AsyncHttpResponseHandler.DEFAULT_CHARSET);
    }

    public BaseJsonHttpResponseHandler(String str) {
        super(str);
    }

    public final void onSuccess(final int i, final C0082e[] c0082eArr, final String str) {
        if (i != 204) {
            Runnable c07511 = new Runnable() {
                public void run() {
                    try {
                        final Object parseResponse = BaseJsonHttpResponseHandler.this.parseResponse(str, false);
                        BaseJsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onSuccess(i, c0082eArr, str, parseResponse);
                            }
                        });
                    } catch (final Throwable th) {
                        AsyncHttpClient.log.mo1429d(BaseJsonHttpResponseHandler.LOG_TAG, "parseResponse thrown an problem", th);
                        BaseJsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onFailure(i, c0082eArr, th, str, null);
                            }
                        });
                    }
                }
            };
            if (getUseSynchronousMode() == 0 && getUsePoolThread() == 0) {
                new Thread(c07511).start();
                return;
            } else {
                c07511.run();
                return;
            }
        }
        onSuccess(i, c0082eArr, null, null);
    }

    public final void onFailure(int i, C0082e[] c0082eArr, String str, Throwable th) {
        if (str != null) {
            final String str2 = str;
            final int i2 = i;
            final C0082e[] c0082eArr2 = c0082eArr;
            final Throwable th2 = th;
            Runnable c07542 = new Runnable() {

                /* renamed from: com.loopj.android.http.BaseJsonHttpResponseHandler$2$2 */
                class C07532 implements Runnable {
                    C07532() {
                    }

                    public void run() {
                        BaseJsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, th2, str2, null);
                    }
                }

                public void run() {
                    try {
                        final Object parseResponse = BaseJsonHttpResponseHandler.this.parseResponse(str2, true);
                        BaseJsonHttpResponseHandler.this.postRunnable(new Runnable() {
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onFailure(i2, c0082eArr2, th2, str2, parseResponse);
                            }
                        });
                    } catch (Throwable th) {
                        AsyncHttpClient.log.mo1429d(BaseJsonHttpResponseHandler.LOG_TAG, "parseResponse thrown an problem", th);
                        BaseJsonHttpResponseHandler.this.postRunnable(new C07532());
                    }
                }
            };
            if (getUseSynchronousMode() == 0 && getUsePoolThread() == 0) {
                new Thread(c07542).start();
                return;
            } else {
                c07542.run();
                return;
            }
        }
        onFailure(i, c0082eArr, th, null, null);
    }
}
