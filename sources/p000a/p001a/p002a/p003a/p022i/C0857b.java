package p000a.p001a.p002a.p003a.p022i;

import p000a.p001a.p002a.p003a.C0041b;
import p000a.p001a.p002a.p003a.C0098h;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.ag;
import p000a.p001a.p002a.p003a.p031k.C0904o;

/* compiled from: DefaultConnectionReuseStrategy */
/* renamed from: a.a.a.a.i.b */
public class C0857b implements C0041b {
    /* renamed from: a */
    public static final C0857b f1539a = new C0857b();

    /* renamed from: a */
    public boolean mo61a(p000a.p001a.p002a.p003a.C0916s r6, p000a.p001a.p002a.p003a.p034n.C0157e r7) {
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
        r0 = "HTTP response";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r6, r0);
        r0 = "HTTP context";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r7, r0);
        r7 = r6.mo1628a();
        r7 = r7.mo146a();
        r0 = "Transfer-Encoding";
        r0 = r6.getFirstHeader(r0);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0029;
    L_0x001c:
        r3 = "chunked";
        r0 = r0.mo122d();
        r0 = r3.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0047;
    L_0x0028:
        return r2;
    L_0x0029:
        r0 = r5.m1670a(r6);
        if (r0 == 0) goto L_0x0047;
    L_0x002f:
        r0 = "Content-Length";
        r0 = r6.getHeaders(r0);
        r3 = r0.length;
        if (r3 != r1) goto L_0x0046;
    L_0x0038:
        r0 = r0[r2];
        r0 = r0.mo122d();	 Catch:{ NumberFormatException -> 0x0045 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0045 }
        if (r0 >= 0) goto L_0x0047;
    L_0x0044:
        return r2;
    L_0x0045:
        return r2;
    L_0x0046:
        return r2;
    L_0x0047:
        r0 = "Connection";
        r0 = r6.headerIterator(r0);
        r3 = r0.hasNext();
        if (r3 != 0) goto L_0x0059;
    L_0x0053:
        r0 = "Proxy-Connection";
        r0 = r6.headerIterator(r0);
    L_0x0059:
        r6 = r0.hasNext();
        if (r6 == 0) goto L_0x0085;
    L_0x005f:
        r6 = r5.m1671a(r0);	 Catch:{ aa -> 0x0084 }
        r0 = 0;	 Catch:{ aa -> 0x0084 }
    L_0x0064:
        r3 = r6.hasNext();	 Catch:{ aa -> 0x0084 }
        if (r3 == 0) goto L_0x0081;	 Catch:{ aa -> 0x0084 }
    L_0x006a:
        r3 = r6.mo149a();	 Catch:{ aa -> 0x0084 }
        r4 = "Close";	 Catch:{ aa -> 0x0084 }
        r4 = r4.equalsIgnoreCase(r3);	 Catch:{ aa -> 0x0084 }
        if (r4 == 0) goto L_0x0077;	 Catch:{ aa -> 0x0084 }
    L_0x0076:
        return r2;	 Catch:{ aa -> 0x0084 }
    L_0x0077:
        r4 = "Keep-Alive";	 Catch:{ aa -> 0x0084 }
        r3 = r4.equalsIgnoreCase(r3);	 Catch:{ aa -> 0x0084 }
        if (r3 == 0) goto L_0x0064;
    L_0x007f:
        r0 = 1;
        goto L_0x0064;
    L_0x0081:
        if (r0 == 0) goto L_0x0085;
    L_0x0083:
        return r1;
    L_0x0084:
        return r2;
    L_0x0085:
        r6 = p000a.p001a.p002a.p003a.C0917v.f1696b;
        r6 = r7.m31c(r6);
        r6 = r6 ^ r1;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.b.a(a.a.a.a.s, a.a.a.a.n.e):boolean");
    }

    /* renamed from: a */
    protected ag m1671a(C0098h c0098h) {
        return new C0904o(c0098h);
    }

    /* renamed from: a */
    private boolean m1670a(C0916s c0916s) {
        c0916s = c0916s.mo1628a().mo147b();
        return (c0916s < 200 || c0916s == 204 || c0916s == 304 || c0916s == 205) ? null : true;
    }
}
