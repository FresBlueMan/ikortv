package com.loopj.android.http;

import android.os.Message;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "DataAsyncHttpRH";
    protected static final int PROGRESS_DATA_MESSAGE = 7;

    public static byte[] copyOfRange(byte[] bArr, int i, int i2) {
        if (i <= i2) {
            int length = bArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            i2 -= i;
            length = Math.min(i2, length - i);
            i2 = new byte[i2];
            System.arraycopy(bArr, i, i2, 0, length);
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public void onProgressData(byte[] bArr) {
        AsyncHttpClient.log.mo1428d(LOG_TAG, "onProgressData(byte[]) was not overriden, but callback was received");
    }

    public final void sendProgressDataMessage(byte[] bArr) {
        sendMessage(obtainMessage(7, new Object[]{bArr}));
    }

    protected void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 7) {
            Object[] objArr = (Object[]) message.obj;
            if (objArr == null || objArr.length < 1) {
                AsyncHttpClient.log.mo1430e(LOG_TAG, "PROGRESS_DATA_MESSAGE didn't got enough params");
                return;
            }
            try {
                onProgressData((byte[]) objArr[0]);
            } catch (Message message2) {
                AsyncHttpClient.log.mo1431e(LOG_TAG, "custom onProgressData contains an error", message2);
            }
        }
    }

    byte[] getResponseData(p000a.p001a.p002a.p003a.C0149k r7) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r6 = this;
        if (r7 == 0) goto L_0x0066;
    L_0x0002:
        r0 = r7.getContent();
        if (r0 == 0) goto L_0x0066;
    L_0x0008:
        r1 = r7.getContentLength();
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r7 > 0) goto L_0x005e;
    L_0x0013:
        r3 = 0;
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r7 >= 0) goto L_0x001b;
    L_0x0019:
        r1 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
    L_0x001b:
        r7 = new a.a.a.a.o.c;	 Catch:{ OutOfMemoryError -> 0x0053 }
        r3 = (int) r1;	 Catch:{ OutOfMemoryError -> 0x0053 }
        r7.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x0053 }
        r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r3 = new byte[r3];	 Catch:{ all -> 0x004e }
    L_0x0025:
        r4 = r0.read(r3);	 Catch:{ all -> 0x004e }
        r5 = -1;	 Catch:{ all -> 0x004e }
        if (r4 == r5) goto L_0x0046;	 Catch:{ all -> 0x004e }
    L_0x002c:
        r5 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x004e }
        r5 = r5.isInterrupted();	 Catch:{ all -> 0x004e }
        if (r5 != 0) goto L_0x0046;	 Catch:{ all -> 0x004e }
    L_0x0036:
        r5 = 0;	 Catch:{ all -> 0x004e }
        r7.m490a(r3, r5, r4);	 Catch:{ all -> 0x004e }
        r4 = copyOfRange(r3, r5, r4);	 Catch:{ all -> 0x004e }
        r6.sendProgressDataMessage(r4);	 Catch:{ all -> 0x004e }
        r4 = (long) r5;	 Catch:{ all -> 0x004e }
        r6.sendProgressMessage(r4, r1);	 Catch:{ all -> 0x004e }
        goto L_0x0025;
    L_0x0046:
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r0);	 Catch:{ OutOfMemoryError -> 0x0053 }
        r7 = r7.m493b();	 Catch:{ OutOfMemoryError -> 0x0053 }
        goto L_0x0067;	 Catch:{ OutOfMemoryError -> 0x0053 }
    L_0x004e:
        r7 = move-exception;	 Catch:{ OutOfMemoryError -> 0x0053 }
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r0);	 Catch:{ OutOfMemoryError -> 0x0053 }
        throw r7;	 Catch:{ OutOfMemoryError -> 0x0053 }
    L_0x0053:
        java.lang.System.gc();
        r7 = new java.io.IOException;
        r0 = "File too large to fit into available memory";
        r7.<init>(r0);
        throw r7;
    L_0x005e:
        r7 = new java.lang.IllegalArgumentException;
        r0 = "HTTP entity too large to be buffered in memory";
        r7.<init>(r0);
        throw r7;
    L_0x0066:
        r7 = 0;
    L_0x0067:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.DataAsyncHttpResponseHandler.getResponseData(a.a.a.a.k):byte[]");
    }
}
