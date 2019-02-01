package p000a.p001a.p002a.p003a.p022i.p028e;

import p000a.p001a.p002a.p003a.p020g.C0092d;

/* compiled from: StrictContentLengthStrategy */
/* renamed from: a.a.a.a.i.e.d */
public class C0886d implements C0092d {
    /* renamed from: a */
    public static final C0886d f1616a = new C0886d();
    /* renamed from: b */
    private final int f1617b;

    public C0886d(int i) {
        this.f1617b = i;
    }

    public C0886d() {
        this(-1);
    }

    /* renamed from: a */
    public long mo103a(p000a.p001a.p002a.p003a.C0169p r6) {
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
        r5 = this;
        r0 = "HTTP message";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r6, r0);
        r0 = "Transfer-Encoding";
        r0 = r6.getFirstHeader(r0);
        if (r0 == 0) goto L_0x0065;
    L_0x000d:
        r0 = r0.mo122d();
        r1 = "chunked";
        r1 = r1.equalsIgnoreCase(r0);
        if (r1 == 0) goto L_0x0043;
    L_0x0019:
        r0 = r6.getProtocolVersion();
        r1 = p000a.p001a.p002a.p003a.C0917v.f1696b;
        r0 = r0.m31c(r1);
        if (r0 != 0) goto L_0x0028;
    L_0x0025:
        r0 = -2;
        return r0;
    L_0x0028:
        r0 = new a.a.a.a.ab;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Chunked transfer encoding not allowed for ";
        r1.append(r2);
        r6 = r6.getProtocolVersion();
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
    L_0x0043:
        r6 = "identity";
        r6 = r6.equalsIgnoreCase(r0);
        if (r6 == 0) goto L_0x004e;
    L_0x004b:
        r0 = -1;
        return r0;
    L_0x004e:
        r6 = new a.a.a.a.ab;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unsupported transfer encoding: ";
        r1.append(r2);
        r1.append(r0);
        r0 = r1.toString();
        r6.<init>(r0);
        throw r6;
    L_0x0065:
        r0 = "Content-Length";
        r6 = r6.getFirstHeader(r0);
        if (r6 == 0) goto L_0x00aa;
    L_0x006d:
        r6 = r6.mo122d();
        r0 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x0093 }
        r2 = 0;	 Catch:{ NumberFormatException -> 0x0093 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0093 }
        if (r4 < 0) goto L_0x007c;	 Catch:{ NumberFormatException -> 0x0093 }
    L_0x007b:
        return r0;	 Catch:{ NumberFormatException -> 0x0093 }
    L_0x007c:
        r0 = new a.a.a.a.ab;	 Catch:{ NumberFormatException -> 0x0093 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0093 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0093 }
        r2 = "Negative content length: ";	 Catch:{ NumberFormatException -> 0x0093 }
        r1.append(r2);	 Catch:{ NumberFormatException -> 0x0093 }
        r1.append(r6);	 Catch:{ NumberFormatException -> 0x0093 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0093 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0093 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0093 }
    L_0x0093:
        r0 = new a.a.a.a.ab;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid content length: ";
        r1.append(r2);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
    L_0x00aa:
        r6 = r5.f1617b;
        r0 = (long) r6;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.e.d.a(a.a.a.a.p):long");
    }
}
