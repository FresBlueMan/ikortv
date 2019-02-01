package com.loopj.android.http;

import org.xml.sax.helpers.DefaultHandler;
import p000a.p001a.p002a.p003a.C0082e;

public abstract class SaxAsyncHttpResponseHandler<T extends DefaultHandler> extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "SaxAsyncHttpRH";
    private T handler = null;

    public abstract void onFailure(int i, C0082e[] c0082eArr, T t);

    public abstract void onSuccess(int i, C0082e[] c0082eArr, T t);

    public SaxAsyncHttpResponseHandler(T t) {
        if (t != null) {
            this.handler = t;
            return;
        }
        throw new Error("null instance of <T extends DefaultHandler> passed to constructor");
    }

    protected byte[] getResponseData(p000a.p001a.p002a.p003a.C0149k r7) {
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
        r0 = 0;
        if (r7 == 0) goto L_0x0066;
    L_0x0003:
        r7 = r7.getContent();
        if (r7 == 0) goto L_0x0066;
    L_0x0009:
        r1 = javax.xml.parsers.SAXParserFactory.newInstance();	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r1 = r1.newSAXParser();	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r1 = r1.getXMLReader();	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r2 = r6.handler;	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r1.setContentHandler(r2);	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r2 = new java.io.InputStreamReader;	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r3 = r6.getCharset();	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r2.<init>(r7, r3);	 Catch:{ SAXException -> 0x004b, ParserConfigurationException -> 0x003a, all -> 0x0036 }
        r3 = new org.xml.sax.InputSource;	 Catch:{ SAXException -> 0x0034, ParserConfigurationException -> 0x0032 }
        r3.<init>(r2);	 Catch:{ SAXException -> 0x0034, ParserConfigurationException -> 0x0032 }
        r1.parse(r3);	 Catch:{ SAXException -> 0x0034, ParserConfigurationException -> 0x0032 }
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r7);
    L_0x002e:
        r2.close();	 Catch:{ IOException -> 0x0066 }
        goto L_0x0066;
    L_0x0032:
        r1 = move-exception;
        goto L_0x003c;
    L_0x0034:
        r1 = move-exception;
        goto L_0x004d;
    L_0x0036:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x005d;
    L_0x003a:
        r1 = move-exception;
        r2 = r0;
    L_0x003c:
        r3 = com.loopj.android.http.AsyncHttpClient.log;	 Catch:{ all -> 0x005c }
        r4 = "SaxAsyncHttpRH";	 Catch:{ all -> 0x005c }
        r5 = "getResponseData exception";	 Catch:{ all -> 0x005c }
        r3.mo1431e(r4, r5, r1);	 Catch:{ all -> 0x005c }
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r7);
        if (r2 == 0) goto L_0x0066;
    L_0x004a:
        goto L_0x002e;
    L_0x004b:
        r1 = move-exception;
        r2 = r0;
    L_0x004d:
        r3 = com.loopj.android.http.AsyncHttpClient.log;	 Catch:{ all -> 0x005c }
        r4 = "SaxAsyncHttpRH";	 Catch:{ all -> 0x005c }
        r5 = "getResponseData exception";	 Catch:{ all -> 0x005c }
        r3.mo1431e(r4, r5, r1);	 Catch:{ all -> 0x005c }
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r7);
        if (r2 == 0) goto L_0x0066;
    L_0x005b:
        goto L_0x002e;
    L_0x005c:
        r0 = move-exception;
    L_0x005d:
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r7);
        if (r2 == 0) goto L_0x0065;
    L_0x0062:
        r2.close();	 Catch:{ IOException -> 0x0065 }
    L_0x0065:
        throw r0;
    L_0x0066:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.SaxAsyncHttpResponseHandler.getResponseData(a.a.a.a.k):byte[]");
    }

    public void onSuccess(int i, C0082e[] c0082eArr, byte[] bArr) {
        onSuccess(i, c0082eArr, this.handler);
    }

    public void onFailure(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th) {
        onFailure(i, c0082eArr, this.handler);
    }
}
