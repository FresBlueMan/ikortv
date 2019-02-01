package p000a.p001a.p002a.p003a.p022i.p024b;

import java.util.HashMap;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p005b.C0014a;
import p000a.p001a.p002a.p003a.p013e.C0080r;
import p000a.p001a.p002a.p003a.p022i.p025c.C0867j;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicAuthCache */
/* renamed from: a.a.a.a.i.b.d */
public class C0844d implements C0014a {
    /* renamed from: a */
    private final HashMap<C0159n, C0002c> f1499a;
    /* renamed from: b */
    private final C0080r f1500b;

    public C0844d(C0080r c0080r) {
        this.f1499a = new HashMap();
        if (c0080r == null) {
            c0080r = C0867j.f1584a;
        }
        this.f1500b = c0080r;
    }

    public C0844d() {
        this(null);
    }

    /* renamed from: c */
    protected p000a.p001a.p002a.p003a.C0159n m1634c(p000a.p001a.p002a.p003a.C0159n r4) {
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
        r3 = this;
        r0 = r4.m471b();
        if (r0 > 0) goto L_0x001b;
    L_0x0006:
        r0 = r3.f1500b;	 Catch:{ s -> 0x001a }
        r0 = r0.mo76a(r4);	 Catch:{ s -> 0x001a }
        r1 = new a.a.a.a.n;
        r2 = r4.m470a();
        r4 = r4.m472c();
        r1.<init>(r2, r0, r4);
        return r1;
    L_0x001a:
        return r4;
    L_0x001b:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.b.d.c(a.a.a.a.n):a.a.a.a.n");
    }

    /* renamed from: a */
    public void mo46a(C0159n c0159n, C0002c c0002c) {
        C0160a.m478a((Object) c0159n, "HTTP host");
        this.f1499a.put(m1634c(c0159n), c0002c);
    }

    /* renamed from: a */
    public C0002c mo45a(C0159n c0159n) {
        C0160a.m478a((Object) c0159n, "HTTP host");
        return (C0002c) this.f1499a.get(m1634c(c0159n));
    }

    /* renamed from: b */
    public void mo47b(C0159n c0159n) {
        C0160a.m478a((Object) c0159n, "HTTP host");
        this.f1499a.remove(m1634c(c0159n));
    }

    public String toString() {
        return this.f1499a.toString();
    }
}
