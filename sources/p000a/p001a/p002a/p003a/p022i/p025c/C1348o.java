package p000a.p001a.p002a.p003a.p022i.p025c;

import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.C1319o;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: ManagedClientConnectionImpl */
/* renamed from: a.a.a.a.i.c.o */
class C1348o implements C1319o {
    /* renamed from: a */
    private final C0055b f2348a;
    /* renamed from: b */
    private final C0071d f2349b;
    /* renamed from: c */
    private volatile C0868k f2350c;
    /* renamed from: d */
    private volatile boolean f2351d = null;
    /* renamed from: e */
    private volatile long f2352e = -1;

    C1348o(C0055b c0055b, C0071d c0071d, C0868k c0868k) {
        C0160a.m478a((Object) c0055b, "Connection manager");
        C0160a.m478a((Object) c0071d, "Connection operator");
        C0160a.m478a((Object) c0868k, "HTTP pool entry");
        this.f2348a = c0055b;
        this.f2349b = c0071d;
        this.f2350c = c0868k;
    }

    /* renamed from: l */
    C0868k m2931l() {
        return this.f2350c;
    }

    /* renamed from: m */
    C0868k m2932m() {
        C0868k c0868k = this.f2350c;
        this.f2350c = null;
        return c0868k;
    }

    /* renamed from: n */
    public C0055b m2933n() {
        return this.f2348a;
    }

    /* renamed from: p */
    private C1253q m2906p() {
        C0868k c0868k = this.f2350c;
        if (c0868k == null) {
            return null;
        }
        return (C1253q) c0868k.m458g();
    }

    /* renamed from: q */
    private C1253q m2907q() {
        C0868k c0868k = this.f2350c;
        if (c0868k != null) {
            return (C1253q) c0868k.m458g();
        }
        throw new C0119e();
    }

    /* renamed from: r */
    private C0868k m2908r() {
        C0868k c0868k = this.f2350c;
        if (c0868k != null) {
            return c0868k;
        }
        throw new C0119e();
    }

    public void close() {
        C0868k c0868k = this.f2350c;
        if (c0868k != null) {
            C1253q c1253q = (C1253q) c0868k.m458g();
            c0868k.m1724a().m1523h();
            c1253q.close();
        }
    }

    /* renamed from: e */
    public void mo1934e() {
        C0868k c0868k = this.f2350c;
        if (c0868k != null) {
            C1253q c1253q = (C1253q) c0868k.m458g();
            c0868k.m1724a().m1523h();
            c1253q.mo1934e();
        }
    }

    /* renamed from: c */
    public boolean mo1932c() {
        C1253q p = m2906p();
        return p != null ? p.mo1932c() : false;
    }

    /* renamed from: d */
    public boolean mo1599d() {
        C1253q p = m2906p();
        return p != null ? p.mo1599d() : true;
    }

    /* renamed from: b */
    public void mo1931b(int i) {
        m2907q().mo1931b(i);
    }

    public void a_() {
        m2907q().a_();
    }

    /* renamed from: a */
    public boolean mo1597a(int i) {
        return m2907q().mo1597a(i);
    }

    /* renamed from: a */
    public void mo1596a(C0916s c0916s) {
        m2907q().mo1596a(c0916s);
    }

    /* renamed from: a */
    public C0916s mo1593a() {
        return m2907q().mo1593a();
    }

    /* renamed from: a */
    public void mo1594a(C1285l c1285l) {
        m2907q().mo1594a(c1285l);
    }

    /* renamed from: a */
    public void mo1595a(C0915q c0915q) {
        m2907q().mo1595a(c0915q);
    }

    /* renamed from: f */
    public InetAddress mo1935f() {
        return m2907q().mo1935f();
    }

    /* renamed from: g */
    public int mo1936g() {
        return m2907q().mo1936g();
    }

    /* renamed from: k */
    public SSLSession mo2014k() {
        Socket i = m2907q().mo2022i();
        return i instanceof SSLSocket ? ((SSLSocket) i).getSession() : null;
    }

    /* renamed from: h */
    public C0817b mo1916h() {
        return m2908r().m1727c();
    }

    /* renamed from: a */
    public void mo2023a(C0817b c0817b, C0157e c0157e, C0152e c0152e) {
        C1253q c1253q;
        C0159n c0159n;
        C0160a.m478a((Object) c0817b, "Route");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        synchronized (this) {
            if (this.f2350c != null) {
                Object a = this.f2350c.m1724a();
                C0161b.m484a(a, "Route tracker");
                C0161b.m485a(a.m1524i() ^ 1, "Connection already open");
                c1253q = (C1253q) this.f2350c.m458g();
            } else {
                throw new C0119e();
            }
        }
        C0159n d = c0817b.mo14d();
        C0071d c0071d = this.f2349b;
        if (d != null) {
            c0159n = d;
        } else {
            c0159n = c0817b.mo10a();
        }
        c0071d.mo74a(c1253q, c0159n, c0817b.mo12b(), c0157e, c0152e);
        synchronized (this) {
            if (this.f2350c != null) {
                c0817b = this.f2350c.m1724a();
                if (d == null) {
                    c0817b.m1513a(c1253q.mo2021h());
                } else {
                    c0817b.m1512a(d, c1253q.mo2021h());
                }
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    /* renamed from: a */
    public void mo2027a(boolean z, C0152e c0152e) {
        C0159n a;
        C1253q c1253q;
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        synchronized (this) {
            if (this.f2350c != null) {
                Object a2 = this.f2350c.m1724a();
                C0161b.m484a(a2, "Route tracker");
                C0161b.m485a(a2.m1524i(), "Connection not open");
                C0161b.m485a(a2.mo15e() ^ 1, "Connection is already tunnelled");
                a = a2.mo10a();
                c1253q = (C1253q) this.f2350c.m458g();
            } else {
                throw new C0119e();
            }
        }
        c1253q.mo2018a(null, a, z, c0152e);
        synchronized (this) {
            if (this.f2350c != null) {
                this.f2350c.m1724a().m1516b(z);
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    /* renamed from: a */
    public void mo2025a(C0159n c0159n, boolean z, C0152e c0152e) {
        C1253q c1253q;
        C0160a.m478a((Object) c0159n, "Next proxy");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        synchronized (this) {
            if (this.f2350c != null) {
                Object a = this.f2350c.m1724a();
                C0161b.m484a(a, "Route tracker");
                C0161b.m485a(a.m1524i(), "Connection not open");
                c1253q = (C1253q) this.f2350c.m458g();
            } else {
                throw new C0119e();
            }
        }
        c1253q.mo2018a(null, c0159n, z, c0152e);
        synchronized (this) {
            if (this.f2350c != null) {
                this.f2350c.m1724a().m1515b(c0159n, z);
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    /* renamed from: a */
    public void mo2024a(C0157e c0157e, C0152e c0152e) {
        C0159n a;
        C1253q c1253q;
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        synchronized (this) {
            if (this.f2350c != null) {
                Object a2 = this.f2350c.m1724a();
                C0161b.m484a(a2, "Route tracker");
                C0161b.m485a(a2.m1524i(), "Connection not open");
                C0161b.m485a(a2.mo15e(), "Protocol layering without a tunnel not supported");
                C0161b.m485a(a2.mo16f() ^ 1, "Multiple protocol layering not supported");
                a = a2.mo10a();
                c1253q = (C1253q) this.f2350c.m458g();
            } else {
                throw new C0119e();
            }
        }
        this.f2349b.mo73a(c1253q, a, c0157e, c0152e);
        synchronized (this) {
            if (this.f2350c != null) {
                this.f2350c.m1724a().m1518c(c1253q.mo2021h());
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    /* renamed from: a */
    public void mo2026a(Object obj) {
        m2908r().m455a(obj);
    }

    /* renamed from: i */
    public void mo2012i() {
        this.f2351d = true;
    }

    /* renamed from: j */
    public void mo2013j() {
        this.f2351d = false;
    }

    /* renamed from: o */
    public boolean m2934o() {
        return this.f2351d;
    }

    /* renamed from: a */
    public void mo2011a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f2352e = timeUnit.toMillis(j);
        } else {
            this.f2352e = -1;
        }
    }

    public void b_() {
        synchronized (this) {
            if (this.f2350c == null) {
                return;
            }
            this.f2348a.mo70a(this, this.f2352e, TimeUnit.MILLISECONDS);
            this.f2350c = null;
        }
    }

    /* renamed from: b */
    public void mo24b() {
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
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f2350c;	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0007;	 Catch:{ all -> 0x0023 }
    L_0x0005:
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        return;	 Catch:{ all -> 0x0023 }
    L_0x0007:
        r0 = 0;	 Catch:{ all -> 0x0023 }
        r4.f2351d = r0;	 Catch:{ all -> 0x0023 }
        r0 = r4.f2350c;	 Catch:{ all -> 0x0023 }
        r0 = r0.m458g();	 Catch:{ all -> 0x0023 }
        r0 = (p000a.p001a.p002a.p003a.p013e.C1253q) r0;	 Catch:{ all -> 0x0023 }
        r0.mo1934e();	 Catch:{ IOException -> 0x0015 }
    L_0x0015:
        r0 = r4.f2348a;	 Catch:{ all -> 0x0023 }
        r1 = r4.f2352e;	 Catch:{ all -> 0x0023 }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0023 }
        r0.mo70a(r4, r1, r3);	 Catch:{ all -> 0x0023 }
        r0 = 0;	 Catch:{ all -> 0x0023 }
        r4.f2350c = r0;	 Catch:{ all -> 0x0023 }
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        return;	 Catch:{ all -> 0x0023 }
    L_0x0023:
        r0 = move-exception;	 Catch:{ all -> 0x0023 }
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.c.o.b():void");
    }
}
