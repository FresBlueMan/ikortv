package p000a.p001a.p002a.p003a.p022i;

import p000a.p001a.p002a.p003a.C0171t;
import p000a.p001a.p002a.p003a.C0892i;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p022i.p028e.C0126a;
import p000a.p001a.p002a.p003a.p022i.p028e.C0127b;
import p000a.p001a.p002a.p003a.p022i.p028e.C0885c;
import p000a.p001a.p002a.p003a.p022i.p028e.C0886d;
import p000a.p001a.p002a.p003a.p022i.p029f.C1277i;
import p000a.p001a.p002a.p003a.p022i.p029f.C1278j;
import p000a.p001a.p002a.p003a.p030j.C0136b;
import p000a.p001a.p002a.p003a.p030j.C0137c;
import p000a.p001a.p002a.p003a.p030j.C0138d;
import p000a.p001a.p002a.p003a.p030j.C0139e;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: AbstractHttpClientConnection */
/* renamed from: a.a.a.a.i.a */
public abstract class C1260a implements C0892i {
    /* renamed from: a */
    private final C0127b f2137a = m2575m();
    /* renamed from: b */
    private final C0126a f2138b = m2574l();
    /* renamed from: c */
    private C0140f f2139c = null;
    /* renamed from: d */
    private C0141g f2140d = null;
    /* renamed from: e */
    private C0136b f2141e = null;
    /* renamed from: f */
    private C0137c<C0916s> f2142f = null;
    /* renamed from: g */
    private C0138d<C0915q> f2143g = null;
    /* renamed from: h */
    private C0128e f2144h = null;

    /* renamed from: j */
    protected abstract void mo1937j();

    /* renamed from: l */
    protected C0126a m2574l() {
        return new C0126a(new C0885c());
    }

    /* renamed from: m */
    protected C0127b m2575m() {
        return new C0127b(new C0886d());
    }

    /* renamed from: n */
    protected C0171t m2576n() {
        return C0872c.f1595a;
    }

    /* renamed from: a */
    protected C0137c<C0916s> mo2015a(C0140f c0140f, C0171t c0171t, C0152e c0152e) {
        return new C1277i(c0140f, null, c0171t, c0152e);
    }

    /* renamed from: a */
    protected C0138d<C0915q> m2565a(C0141g c0141g, C0152e c0152e) {
        return new C1278j(c0141g, null, c0152e);
    }

    /* renamed from: a */
    protected C0128e m2563a(C0139e c0139e, C0139e c0139e2) {
        return new C0128e(c0139e, c0139e2);
    }

    /* renamed from: a */
    protected void m2567a(C0140f c0140f, C0141g c0141g, C0152e c0152e) {
        this.f2139c = (C0140f) C0160a.m478a((Object) c0140f, "Input session buffer");
        this.f2140d = (C0141g) C0160a.m478a((Object) c0141g, "Output session buffer");
        if (c0140f instanceof C0136b) {
            this.f2141e = (C0136b) c0140f;
        }
        this.f2142f = mo2015a(c0140f, m2576n(), c0152e);
        this.f2143g = m2565a(c0141g, c0152e);
        this.f2144h = m2563a(c0140f.mo82b(), c0141g.mo89b());
    }

    /* renamed from: a */
    public boolean mo1597a(int r2) {
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
        r1.mo1937j();
        r0 = r1.f2139c;	 Catch:{ SocketTimeoutException -> 0x000a }
        r2 = r0.mo81a(r2);	 Catch:{ SocketTimeoutException -> 0x000a }
        return r2;
    L_0x000a:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.a(int):boolean");
    }

    /* renamed from: a */
    public void mo1595a(C0915q c0915q) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        mo1937j();
        this.f2143g.mo105b(c0915q);
        this.f2144h.m368a();
    }

    /* renamed from: a */
    public void mo1594a(C1285l c1285l) {
        C0160a.m478a((Object) c1285l, "HTTP request");
        mo1937j();
        if (c1285l.getEntity() != null) {
            this.f2137a.m367a(this.f2140d, c1285l, c1285l.getEntity());
        }
    }

    /* renamed from: o */
    protected void m2577o() {
        this.f2140d.mo84a();
    }

    public void a_() {
        mo1937j();
        m2577o();
    }

    /* renamed from: a */
    public C0916s mo1593a() {
        mo1937j();
        C0916s c0916s = (C0916s) this.f2142f.mo104a();
        if (c0916s.mo1628a().mo147b() >= 200) {
            this.f2144h.m369b();
        }
        return c0916s;
    }

    /* renamed from: a */
    public void mo1596a(C0916s c0916s) {
        C0160a.m478a((Object) c0916s, "HTTP response");
        mo1937j();
        c0916s.mo1629a(this.f2138b.m365b(this.f2139c, c0916s));
    }

    /* renamed from: p */
    protected boolean m2578p() {
        return this.f2141e != null && this.f2141e.mo83c();
    }

    /* renamed from: d */
    public boolean mo1599d() {
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
        r2 = this;
        r0 = r2.mo1932c();
        r1 = 1;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r2.m2578p();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return r1;
    L_0x000f:
        r0 = r2.f2139c;	 Catch:{ SocketTimeoutException -> 0x001a, IOException -> 0x0019 }
        r0.mo81a(r1);	 Catch:{ SocketTimeoutException -> 0x001a, IOException -> 0x0019 }
        r0 = r2.m2578p();	 Catch:{ SocketTimeoutException -> 0x001a, IOException -> 0x0019 }
        return r0;
    L_0x0019:
        return r1;
    L_0x001a:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.d():boolean");
    }
}
