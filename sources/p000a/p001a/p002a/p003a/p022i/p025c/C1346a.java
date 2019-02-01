package p000a.p001a.p002a.p003a.p022i.p025c;

import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.C1319o;
import p000a.p001a.p002a.p003a.p034n.C0157e;

@Deprecated
/* compiled from: AbstractClientConnAdapter */
/* renamed from: a.a.a.a.i.c.a */
public abstract class C1346a implements C1319o, C0157e {
    /* renamed from: a */
    private final C0055b f2335a;
    /* renamed from: b */
    private volatile C1253q f2336b;
    /* renamed from: c */
    private volatile boolean f2337c = false;
    /* renamed from: d */
    private volatile boolean f2338d = false;
    /* renamed from: e */
    private volatile long f2339e = -1;

    protected C1346a(C0055b c0055b, C1253q c1253q) {
        this.f2335a = c0055b;
        this.f2336b = c1253q;
    }

    /* renamed from: l */
    protected synchronized void mo2086l() {
        this.f2336b = null;
        this.f2339e = Long.MAX_VALUE;
    }

    /* renamed from: m */
    protected C1253q m2888m() {
        return this.f2336b;
    }

    /* renamed from: n */
    protected C0055b mo2128n() {
        return this.f2335a;
    }

    /* renamed from: o */
    protected boolean m2890o() {
        return this.f2338d;
    }

    /* renamed from: a */
    protected final void m2872a(C1253q c1253q) {
        if (m2890o() || c1253q == null) {
            throw new C0119e();
        }
    }

    /* renamed from: c */
    public boolean mo1932c() {
        C1253q m = m2888m();
        if (m == null) {
            return false;
        }
        return m.mo1932c();
    }

    /* renamed from: d */
    public boolean mo1599d() {
        if (m2890o()) {
            return true;
        }
        C1253q m = m2888m();
        if (m == null) {
            return true;
        }
        return m.mo1599d();
    }

    /* renamed from: b */
    public void mo1931b(int i) {
        C1253q m = m2888m();
        m2872a(m);
        m.mo1931b(i);
    }

    public void a_() {
        C1253q m = m2888m();
        m2872a(m);
        m.a_();
    }

    /* renamed from: a */
    public boolean mo1597a(int i) {
        C1253q m = m2888m();
        m2872a(m);
        return m.mo1597a(i);
    }

    /* renamed from: a */
    public void mo1596a(C0916s c0916s) {
        C1253q m = m2888m();
        m2872a(m);
        mo2013j();
        m.mo1596a(c0916s);
    }

    /* renamed from: a */
    public C0916s mo1593a() {
        C1253q m = m2888m();
        m2872a(m);
        mo2013j();
        return m.mo1593a();
    }

    /* renamed from: a */
    public void mo1594a(C1285l c1285l) {
        C1253q m = m2888m();
        m2872a(m);
        mo2013j();
        m.mo1594a(c1285l);
    }

    /* renamed from: a */
    public void mo1595a(C0915q c0915q) {
        C1253q m = m2888m();
        m2872a(m);
        mo2013j();
        m.mo1595a(c0915q);
    }

    /* renamed from: f */
    public InetAddress mo1935f() {
        C1253q m = m2888m();
        m2872a(m);
        return m.mo1935f();
    }

    /* renamed from: g */
    public int mo1936g() {
        C1253q m = m2888m();
        m2872a(m);
        return m.mo1936g();
    }

    /* renamed from: k */
    public SSLSession mo2014k() {
        C1253q m = m2888m();
        m2872a(m);
        SSLSession sSLSession = null;
        if (!mo1932c()) {
            return null;
        }
        Socket i = m.mo2022i();
        if (i instanceof SSLSocket) {
            sSLSession = ((SSLSocket) i).getSession();
        }
        return sSLSession;
    }

    /* renamed from: i */
    public void mo2012i() {
        this.f2337c = true;
    }

    /* renamed from: j */
    public void mo2013j() {
        this.f2337c = false;
    }

    /* renamed from: p */
    public boolean m2891p() {
        return this.f2337c;
    }

    /* renamed from: a */
    public void mo2011a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f2339e = timeUnit.toMillis(j);
        } else {
            this.f2339e = -1;
        }
    }

    public synchronized void b_() {
        if (!this.f2338d) {
            this.f2338d = true;
            this.f2335a.mo70a(this, this.f2339e, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public synchronized void mo24b() {
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
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f2338d;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);
        return;
    L_0x0007:
        r0 = 1;
        r4.f2338d = r0;	 Catch:{ all -> 0x001b }
        r4.mo2013j();	 Catch:{ all -> 0x001b }
        r4.mo1934e();	 Catch:{ IOException -> 0x0010 }
    L_0x0010:
        r0 = r4.f2335a;	 Catch:{ all -> 0x001b }
        r1 = r4.f2339e;	 Catch:{ all -> 0x001b }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x001b }
        r0.mo70a(r4, r1, r3);	 Catch:{ all -> 0x001b }
        monitor-exit(r4);
        return;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.c.a.b():void");
    }

    /* renamed from: a */
    public Object mo159a(String str) {
        C1253q m = m2888m();
        m2872a(m);
        return m instanceof C0157e ? ((C0157e) m).mo159a(str) : null;
    }

    /* renamed from: a */
    public void mo160a(String str, Object obj) {
        C1253q m = m2888m();
        m2872a(m);
        if (m instanceof C0157e) {
            ((C0157e) m).mo160a(str, obj);
        }
    }
}
