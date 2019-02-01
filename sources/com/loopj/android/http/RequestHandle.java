package com.loopj.android.http;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class RequestHandle {
    private final WeakReference<AsyncHttpRequest> request;

    public RequestHandle(AsyncHttpRequest asyncHttpRequest) {
        this.request = new WeakReference(asyncHttpRequest);
    }

    public boolean cancel(final boolean z) {
        final AsyncHttpRequest asyncHttpRequest = (AsyncHttpRequest) this.request.get();
        if (asyncHttpRequest == null) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return asyncHttpRequest.cancel(z);
        }
        new Thread(new Runnable() {
            public void run() {
                asyncHttpRequest.cancel(z);
            }
        }).start();
        return true;
    }

    public boolean isFinished() {
        AsyncHttpRequest asyncHttpRequest = (AsyncHttpRequest) this.request.get();
        if (asyncHttpRequest != null) {
            if (!asyncHttpRequest.isDone()) {
                return false;
            }
        }
        return true;
    }

    public boolean isCancelled() {
        AsyncHttpRequest asyncHttpRequest = (AsyncHttpRequest) this.request.get();
        if (asyncHttpRequest != null) {
            if (!asyncHttpRequest.isCancelled()) {
                return false;
            }
        }
        return true;
    }

    public boolean shouldBeGarbageCollected() {
        boolean z;
        if (!isCancelled()) {
            if (!isFinished()) {
                z = false;
                if (z) {
                    this.request.clear();
                }
                return z;
            }
        }
        z = true;
        if (z) {
            this.request.clear();
        }
        return z;
    }

    public Object getTag() {
        AsyncHttpRequest asyncHttpRequest = (AsyncHttpRequest) this.request.get();
        if (asyncHttpRequest == null) {
            return null;
        }
        return asyncHttpRequest.getTag();
    }

    public RequestHandle setTag(Object obj) {
        AsyncHttpRequest asyncHttpRequest = (AsyncHttpRequest) this.request.get();
        if (asyncHttpRequest != null) {
            asyncHttpRequest.setRequestTag(obj);
        }
        return this;
    }
}
