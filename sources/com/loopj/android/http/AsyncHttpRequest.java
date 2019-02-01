package com.loopj.android.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p005b.C0036k;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p022i.p024b.C1261a;
import p000a.p001a.p002a.p003a.p034n.C0157e;

public class AsyncHttpRequest implements Runnable {
    private boolean cancelIsNotified;
    private final C1261a client;
    private final C0157e context;
    private int executionCount;
    private final AtomicBoolean isCancelled = new AtomicBoolean();
    private volatile boolean isFinished;
    private boolean isRequestPreProcessed;
    private final C1238l request;
    private final ResponseHandlerInterface responseHandler;

    public void onPostProcessRequest(AsyncHttpRequest asyncHttpRequest) {
    }

    public void onPreProcessRequest(AsyncHttpRequest asyncHttpRequest) {
    }

    public AsyncHttpRequest(C1261a c1261a, C0157e c0157e, C1238l c1238l, ResponseHandlerInterface responseHandlerInterface) {
        this.client = (C1261a) Utils.notNull(c1261a, "client");
        this.context = (C0157e) Utils.notNull(c0157e, "context");
        this.request = (C1238l) Utils.notNull(c1238l, "request");
        this.responseHandler = (ResponseHandlerInterface) Utils.notNull(responseHandlerInterface, "responseHandler");
    }

    public void run() {
        if (!isCancelled()) {
            if (!this.isRequestPreProcessed) {
                this.isRequestPreProcessed = true;
                onPreProcessRequest(this);
            }
            if (!isCancelled()) {
                this.responseHandler.sendStartMessage();
                if (!isCancelled()) {
                    try {
                        makeRequestWithRetries();
                    } catch (Throwable e) {
                        if (isCancelled()) {
                            AsyncHttpClient.log.mo1431e("AsyncHttpRequest", "makeRequestWithRetries returned error", e);
                        } else {
                            this.responseHandler.sendFailureMessage(0, null, null, e);
                        }
                    }
                    if (!isCancelled()) {
                        this.responseHandler.sendFinishMessage();
                        if (!isCancelled()) {
                            onPostProcessRequest(this);
                            this.isFinished = true;
                        }
                    }
                }
            }
        }
    }

    private void makeRequest() {
        if (!isCancelled()) {
            if (this.request.getURI().getScheme() != null) {
                if (this.responseHandler instanceof RangeFileAsyncHttpResponseHandler) {
                    ((RangeFileAsyncHttpResponseHandler) this.responseHandler).updateRequestHeaders(this.request);
                }
                C0916s a = this.client.m1640a(this.request, this.context);
                if (!isCancelled()) {
                    this.responseHandler.onPreProcessResponse(this.responseHandler, a);
                    if (!isCancelled()) {
                        this.responseHandler.sendResponseMessage(a);
                        if (!isCancelled()) {
                            this.responseHandler.onPostProcessResponse(this.responseHandler, a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new MalformedURLException("No valid URI scheme was provided");
        }
    }

    private void makeRequestWithRetries() {
        StringBuilder stringBuilder;
        C0036k z = this.client.m2622z();
        IOException iOException = null;
        boolean z2 = true;
        while (z2) {
            try {
                makeRequest();
                return;
            } catch (IOException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("UnknownHostException exception: ");
                stringBuilder.append(e.getMessage());
                iOException = new IOException(stringBuilder.toString());
                if (this.executionCount > 0) {
                    int i = this.executionCount + 1;
                    this.executionCount = i;
                    if (z.retryRequest(e, i, this.context)) {
                        z2 = true;
                    }
                }
                z2 = false;
            } catch (NullPointerException e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("NPE in HttpClient: ");
                stringBuilder.append(e2.getMessage());
                iOException = new IOException(stringBuilder.toString());
                int i2 = this.executionCount + 1;
                this.executionCount = i2;
                z2 = z.retryRequest(iOException, i2, this.context);
            } catch (IOException e3) {
                try {
                    if (!isCancelled()) {
                        int i3 = this.executionCount + 1;
                        this.executionCount = i3;
                        boolean retryRequest = z.retryRequest(e3, i3, this.context);
                        iOException = e3;
                        z2 = retryRequest;
                    } else {
                        return;
                    }
                } catch (Throwable e4) {
                    AsyncHttpClient.log.mo1431e("AsyncHttpRequest", "Unhandled exception origin cause", e4);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Unhandled exception: ");
                    stringBuilder2.append(e4.getMessage());
                    iOException = new IOException(stringBuilder2.toString());
                }
            }
        }
        throw iOException;
        if (z2) {
            this.responseHandler.sendRetryMessage(this.executionCount);
        }
    }

    public boolean isCancelled() {
        boolean z = this.isCancelled.get();
        if (z) {
            sendCancelNotification();
        }
        return z;
    }

    private synchronized void sendCancelNotification() {
        if (!(this.isFinished || !this.isCancelled.get() || this.cancelIsNotified)) {
            this.cancelIsNotified = true;
            this.responseHandler.sendCancelMessage();
        }
    }

    public boolean isDone() {
        if (!isCancelled()) {
            if (!this.isFinished) {
                return false;
            }
        }
        return true;
    }

    public boolean cancel(boolean z) {
        this.isCancelled.set(true);
        this.request.abort();
        return isCancelled();
    }

    public AsyncHttpRequest setRequestTag(Object obj) {
        this.responseHandler.setTag(obj);
        return this;
    }

    public Object getTag() {
        return this.responseHandler.getTag();
    }
}
