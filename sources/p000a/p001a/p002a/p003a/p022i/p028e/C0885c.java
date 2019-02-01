package p000a.p001a.p002a.p003a.p022i.p028e;

import p000a.p001a.p002a.p003a.p020g.C0092d;

/* compiled from: LaxContentLengthStrategy */
/* renamed from: a.a.a.a.i.e.c */
public class C0885c implements C0092d {
    /* renamed from: a */
    public static final C0885c f1614a = new C0885c();
    /* renamed from: b */
    private final int f1615b;

    public C0885c(int i) {
        this.f1615b = i;
    }

    public C0885c() {
        this(-1);
    }

    /* renamed from: a */
    public long mo103a(p000a.p001a.p002a.p003a.C0169p r8) {
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
        r7 = this;
        r0 = "HTTP message";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r8, r0);
        r0 = "Transfer-Encoding";
        r0 = r8.getFirstHeader(r0);
        r1 = -1;
        if (r0 == 0) goto L_0x004f;
    L_0x000f:
        r8 = r0.mo123e();	 Catch:{ aa -> 0x0037 }
        r3 = r8.length;
        r4 = "identity";
        r0 = r0.mo122d();
        r0 = r4.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0021;
    L_0x0020:
        return r1;
    L_0x0021:
        if (r3 <= 0) goto L_0x0036;
    L_0x0023:
        r0 = "chunked";
        r3 = r3 + -1;
        r8 = r8[r3];
        r8 = r8.mo126a();
        r8 = r0.equalsIgnoreCase(r8);
        if (r8 == 0) goto L_0x0036;
    L_0x0033:
        r0 = -2;
        return r0;
    L_0x0036:
        return r1;
    L_0x0037:
        r8 = move-exception;
        r1 = new a.a.a.a.ab;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Invalid Transfer-Encoding header value: ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0, r8);
        throw r1;
    L_0x004f:
        r0 = "Content-Length";
        r0 = r8.getFirstHeader(r0);
        if (r0 == 0) goto L_0x0079;
    L_0x0057:
        r0 = "Content-Length";
        r8 = r8.getHeaders(r0);
        r0 = r8.length;
        r0 = r0 + -1;
    L_0x0060:
        if (r0 < 0) goto L_0x0070;
    L_0x0062:
        r3 = r8[r0];
        r3 = r3.mo122d();	 Catch:{ NumberFormatException -> 0x006d }
        r3 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x006d }
        goto L_0x0071;
    L_0x006d:
        r0 = r0 + -1;
        goto L_0x0060;
    L_0x0070:
        r3 = r1;
    L_0x0071:
        r5 = 0;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 < 0) goto L_0x0078;
    L_0x0077:
        return r3;
    L_0x0078:
        return r1;
    L_0x0079:
        r8 = r7.f1615b;
        r0 = (long) r8;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.e.c.a(a.a.a.a.p):long");
    }
}
