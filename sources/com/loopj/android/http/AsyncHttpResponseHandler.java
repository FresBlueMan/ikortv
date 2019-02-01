package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.net.URI;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p005b.C0812l;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public abstract class AsyncHttpResponseHandler implements ResponseHandlerInterface {
    protected static final int BUFFER_SIZE = 4096;
    protected static final int CANCEL_MESSAGE = 6;
    public static final String DEFAULT_CHARSET = "UTF-8";
    protected static final int FAILURE_MESSAGE = 1;
    protected static final int FINISH_MESSAGE = 3;
    private static final String LOG_TAG = "AsyncHttpRH";
    protected static final int PROGRESS_MESSAGE = 4;
    protected static final int RETRY_MESSAGE = 5;
    protected static final int START_MESSAGE = 2;
    protected static final int SUCCESS_MESSAGE = 0;
    public static final String UTF8_BOM = "﻿";
    private WeakReference<Object> TAG;
    private Handler handler;
    private Looper looper;
    private C0082e[] requestHeaders;
    private URI requestURI;
    private String responseCharset;
    private boolean usePoolThread;
    private boolean useSynchronousMode;

    private static class ResponderHandler extends Handler {
        private final AsyncHttpResponseHandler mResponder;

        ResponderHandler(AsyncHttpResponseHandler asyncHttpResponseHandler, Looper looper) {
            super(looper);
            this.mResponder = asyncHttpResponseHandler;
        }

        public void handleMessage(Message message) {
            this.mResponder.handleMessage(message);
        }
    }

    public abstract void onFailure(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th);

    public void onFinish() {
    }

    public void onPostProcessResponse(ResponseHandlerInterface responseHandlerInterface, C0916s c0916s) {
    }

    public void onPreProcessResponse(ResponseHandlerInterface responseHandlerInterface, C0916s c0916s) {
    }

    public void onStart() {
    }

    public abstract void onSuccess(int i, C0082e[] c0082eArr, byte[] bArr);

    public AsyncHttpResponseHandler() {
        this(null);
    }

    public AsyncHttpResponseHandler(Looper looper) {
        this.responseCharset = DEFAULT_CHARSET;
        this.requestURI = null;
        this.requestHeaders = null;
        this.looper = null;
        this.TAG = new WeakReference(null);
        if (looper == null) {
            looper = Looper.myLooper();
        }
        this.looper = looper;
        setUseSynchronousMode(false);
        setUsePoolThread(false);
    }

    public AsyncHttpResponseHandler(boolean z) {
        this.responseCharset = DEFAULT_CHARSET;
        this.requestURI = null;
        this.requestHeaders = null;
        this.looper = null;
        this.TAG = new WeakReference(null);
        setUsePoolThread(z);
        if (!getUsePoolThread()) {
            this.looper = Looper.myLooper();
            setUseSynchronousMode(false);
        }
    }

    public Object getTag() {
        return this.TAG.get();
    }

    public void setTag(Object obj) {
        this.TAG = new WeakReference(obj);
    }

    public URI getRequestURI() {
        return this.requestURI;
    }

    public void setRequestURI(URI uri) {
        this.requestURI = uri;
    }

    public C0082e[] getRequestHeaders() {
        return this.requestHeaders;
    }

    public void setRequestHeaders(C0082e[] c0082eArr) {
        this.requestHeaders = c0082eArr;
    }

    public boolean getUseSynchronousMode() {
        return this.useSynchronousMode;
    }

    public void setUseSynchronousMode(boolean z) {
        if (!z && this.looper == null) {
            z = true;
            AsyncHttpClient.log.mo1441w(LOG_TAG, "Current thread has not called Looper.prepare(). Forcing synchronous mode.");
        }
        if (!z && this.handler == null) {
            this.handler = new ResponderHandler(this, this.looper);
        } else if (z && this.handler != null) {
            this.handler = null;
        }
        this.useSynchronousMode = z;
    }

    public boolean getUsePoolThread() {
        return this.usePoolThread;
    }

    public void setUsePoolThread(boolean z) {
        if (z) {
            this.looper = null;
            this.handler = null;
        }
        this.usePoolThread = z;
    }

    public String getCharset() {
        return this.responseCharset == null ? DEFAULT_CHARSET : this.responseCharset;
    }

    public void setCharset(String str) {
        this.responseCharset = str;
    }

    public void onProgress(long j, long j2) {
        LogInterface logInterface = AsyncHttpClient.log;
        String str = LOG_TAG;
        String str2 = "Progress %d from %d (%2.0f%%)";
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Long.valueOf(j2);
        if (j2 > 0) {
            j = (double) j;
            Double.isNaN(j);
            j *= 4607182418800017408L;
            j2 = (double) j2;
            Double.isNaN(j2);
            j = (j / j2) * 4636737291354636288L;
        } else {
            j = -4616189618054758400L;
        }
        objArr[2] = Double.valueOf(j);
        logInterface.mo1439v(str, String.format(str2, objArr));
    }

    public void onRetry(int i) {
        AsyncHttpClient.log.mo1428d(LOG_TAG, String.format("Request retry no. %d", new Object[]{Integer.valueOf(i)}));
    }

    public void onCancel() {
        AsyncHttpClient.log.mo1428d(LOG_TAG, "Request got cancelled");
    }

    public void onUserException(Throwable th) {
        AsyncHttpClient.log.mo1431e(LOG_TAG, "User-space exception detected!", th);
        throw new RuntimeException(th);
    }

    public final void sendProgressMessage(long j, long j2) {
        sendMessage(obtainMessage(4, new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
    }

    public final void sendSuccessMessage(int i, C0082e[] c0082eArr, byte[] bArr) {
        sendMessage(obtainMessage(0, new Object[]{Integer.valueOf(i), c0082eArr, bArr}));
    }

    public final void sendFailureMessage(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th) {
        sendMessage(obtainMessage(1, new Object[]{Integer.valueOf(i), c0082eArr, bArr, th}));
    }

    public final void sendStartMessage() {
        sendMessage(obtainMessage(2, null));
    }

    public final void sendFinishMessage() {
        sendMessage(obtainMessage(3, null));
    }

    public final void sendRetryMessage(int i) {
        sendMessage(obtainMessage(5, new Object[]{Integer.valueOf(i)}));
    }

    public final void sendCancelMessage() {
        sendMessage(obtainMessage(6, null));
    }

    protected void handleMessage(Message message) {
        try {
            Object[] objArr;
            switch (message.what) {
                case 0:
                    objArr = (Object[]) message.obj;
                    if (objArr == null || objArr.length < 3) {
                        AsyncHttpClient.log.mo1430e(LOG_TAG, "SUCCESS_MESSAGE didn't got enough params");
                        return;
                    } else {
                        onSuccess(((Integer) objArr[0]).intValue(), (C0082e[]) objArr[1], (byte[]) objArr[2]);
                        return;
                    }
                case 1:
                    objArr = (Object[]) message.obj;
                    if (objArr == null || objArr.length < 4) {
                        AsyncHttpClient.log.mo1430e(LOG_TAG, "FAILURE_MESSAGE didn't got enough params");
                        return;
                    } else {
                        onFailure(((Integer) objArr[0]).intValue(), (C0082e[]) objArr[1], (byte[]) objArr[2], (Throwable) objArr[3]);
                        return;
                    }
                case 2:
                    onStart();
                    return;
                case 3:
                    onFinish();
                    return;
                case 4:
                    objArr = (Object[]) message.obj;
                    if (objArr == null || objArr.length < 2) {
                        AsyncHttpClient.log.mo1430e(LOG_TAG, "PROGRESS_MESSAGE didn't got enough params");
                        return;
                    } else {
                        onProgress(((Long) objArr[0]).longValue(), ((Long) objArr[1]).longValue());
                        return;
                    }
                case 5:
                    objArr = (Object[]) message.obj;
                    if (objArr == null || objArr.length != 1) {
                        AsyncHttpClient.log.mo1430e(LOG_TAG, "RETRY_MESSAGE didn't get enough params");
                        return;
                    } else {
                        onRetry(((Integer) objArr[0]).intValue());
                        return;
                    }
                case 6:
                    onCancel();
                    return;
                default:
                    return;
            }
        } catch (Message message2) {
            onUserException(message2);
        }
        onUserException(message2);
    }

    protected void sendMessage(Message message) {
        if (!getUseSynchronousMode()) {
            if (this.handler != null) {
                if (!Thread.currentThread().isInterrupted()) {
                    Utils.asserts(this.handler != null, "handler should not be null!");
                    this.handler.sendMessage(message);
                    return;
                }
                return;
            }
        }
        handleMessage(message);
    }

    protected void postRunnable(Runnable runnable) {
        if (runnable != null) {
            if (!getUseSynchronousMode()) {
                if (this.handler != null) {
                    this.handler.post(runnable);
                    return;
                }
            }
            runnable.run();
        }
    }

    protected Message obtainMessage(int i, Object obj) {
        return Message.obtain(this.handler, i, obj);
    }

    public void sendResponseMessage(C0916s c0916s) {
        if (!Thread.currentThread().isInterrupted()) {
            af a = c0916s.mo1628a();
            byte[] responseData = getResponseData(c0916s.mo1630b());
            if (!Thread.currentThread().isInterrupted()) {
                if (a.mo147b() >= IjkMediaCodecInfo.RANK_SECURE) {
                    sendFailureMessage(a.mo147b(), c0916s.getAllHeaders(), responseData, new C0812l(a.mo147b(), a.mo148c()));
                } else {
                    sendSuccessMessage(a.mo147b(), c0916s.getAllHeaders(), responseData);
                }
            }
        }
    }

    byte[] getResponseData(p000a.p001a.p002a.p003a.C0149k r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r12 = this;
        if (r13 == 0) goto L_0x0070;
    L_0x0002:
        r0 = r13.getContent();
        if (r0 == 0) goto L_0x0070;
    L_0x0008:
        r1 = r13.getContentLength();
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0068;
    L_0x0013:
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r5 > 0) goto L_0x001e;
    L_0x001b:
        r5 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        goto L_0x001f;
    L_0x001e:
        r5 = (int) r1;
    L_0x001f:
        r7 = new a.a.a.a.o.c;	 Catch:{ OutOfMemoryError -> 0x005d }
        r7.<init>(r5);	 Catch:{ OutOfMemoryError -> 0x005d }
        r5 = new byte[r6];	 Catch:{ all -> 0x0055 }
        r8 = r3;	 Catch:{ all -> 0x0055 }
    L_0x0027:
        r6 = r0.read(r5);	 Catch:{ all -> 0x0055 }
        r10 = -1;	 Catch:{ all -> 0x0055 }
        if (r6 == r10) goto L_0x004a;	 Catch:{ all -> 0x0055 }
    L_0x002e:
        r10 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0055 }
        r10 = r10.isInterrupted();	 Catch:{ all -> 0x0055 }
        if (r10 != 0) goto L_0x004a;	 Catch:{ all -> 0x0055 }
    L_0x0038:
        r10 = (long) r6;	 Catch:{ all -> 0x0055 }
        r8 = r8 + r10;	 Catch:{ all -> 0x0055 }
        r10 = 0;	 Catch:{ all -> 0x0055 }
        r7.m490a(r5, r10, r6);	 Catch:{ all -> 0x0055 }
        r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x0055 }
        if (r6 > 0) goto L_0x0045;	 Catch:{ all -> 0x0055 }
    L_0x0042:
        r10 = 1;	 Catch:{ all -> 0x0055 }
        goto L_0x0046;	 Catch:{ all -> 0x0055 }
    L_0x0045:
        r10 = r1;	 Catch:{ all -> 0x0055 }
    L_0x0046:
        r12.sendProgressMessage(r8, r10);	 Catch:{ all -> 0x0055 }
        goto L_0x0027;
    L_0x004a:
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r0);	 Catch:{ OutOfMemoryError -> 0x005d }
        com.loopj.android.http.AsyncHttpClient.endEntityViaReflection(r13);	 Catch:{ OutOfMemoryError -> 0x005d }
        r13 = r7.m493b();	 Catch:{ OutOfMemoryError -> 0x005d }
        goto L_0x0071;	 Catch:{ OutOfMemoryError -> 0x005d }
    L_0x0055:
        r1 = move-exception;	 Catch:{ OutOfMemoryError -> 0x005d }
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r0);	 Catch:{ OutOfMemoryError -> 0x005d }
        com.loopj.android.http.AsyncHttpClient.endEntityViaReflection(r13);	 Catch:{ OutOfMemoryError -> 0x005d }
        throw r1;	 Catch:{ OutOfMemoryError -> 0x005d }
    L_0x005d:
        java.lang.System.gc();
        r13 = new java.io.IOException;
        r0 = "File too large to fit into available memory";
        r13.<init>(r0);
        throw r13;
    L_0x0068:
        r13 = new java.lang.IllegalArgumentException;
        r0 = "HTTP entity too large to be buffered in memory";
        r13.<init>(r0);
        throw r13;
    L_0x0070:
        r13 = 0;
    L_0x0071:
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.AsyncHttpResponseHandler.getResponseData(a.a.a.a.k):byte[]");
    }
}
