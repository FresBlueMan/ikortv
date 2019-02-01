package p000a.p001a.p002a.p003a.p022i.p027d;

import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0827a;
import p000a.p001a.p002a.p003a.p019f.C1255n;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RFC2965VersionAttributeHandler */
/* renamed from: a.a.a.a.i.d.ag */
public class ag implements C0084c {
    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        return true;
    }

    /* renamed from: a */
    public void mo94a(p000a.p001a.p002a.p003a.p019f.C0830m r2, java.lang.String r3) {
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
        r1 = this;
        r0 = "Cookie";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r2, r0);
        if (r3 == 0) goto L_0x001b;
    L_0x0007:
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x000c }
        goto L_0x000d;
    L_0x000c:
        r3 = -1;
    L_0x000d:
        if (r3 < 0) goto L_0x0013;
    L_0x000f:
        r2.mo1607a(r3);
        return;
    L_0x0013:
        r2 = new a.a.a.a.f.l;
        r3 = "Invalid cookie version.";
        r2.<init>(r3);
        throw r2;
    L_0x001b:
        r2 = new a.a.a.a.f.l;
        r3 = "Missing value for version attribute";
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.d.ag.a(a.a.a.a.f.m, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        if ((c0083b instanceof C1255n) != null && (c0083b instanceof C0827a) != null) {
            if (((C0827a) c0083b).mo1612b("version") == null) {
                throw new C1320g("Violates RFC 2965. Version attribute is required.");
            }
        }
    }
}
