package p000a.p001a.p002a.p003a.p034n;

import android.support.graphics.drawable.PathInterpolatorCompat;
import p000a.p001a.p002a.p003a.C0892i;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: HttpRequestExecutor */
/* renamed from: a.a.a.a.n.h */
public class C0158h {
    /* renamed from: a */
    private final int f303a;

    public C0158h(int i) {
        this.f303a = C0160a.m475a(i, "Wait for continue time");
    }

    public C0158h() {
        this(PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    /* renamed from: a */
    protected boolean m467a(C0915q c0915q, C0916s c0916s) {
        boolean z = false;
        if ("HEAD".equalsIgnoreCase(c0915q.getRequestLine().mo143a()) != null) {
            return false;
        }
        c0915q = c0916s.mo1628a().mo147b();
        if (!(c0915q < 200 || c0915q == 204 || c0915q == 304 || c0915q == 205)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public C0916s m464a(C0915q c0915q, C0892i c0892i, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0892i, "Client connection");
        C0160a.m478a((Object) c0157e, "HTTP context");
        try {
            C0916s b = m468b(c0915q, c0892i, c0157e);
            return b == null ? m469c(c0915q, c0892i, c0157e) : b;
        } catch (C0915q c0915q2) {
            C0158h.m463a(c0892i);
            throw c0915q2;
        } catch (C0915q c0915q22) {
            C0158h.m463a(c0892i);
            throw c0915q22;
        } catch (C0915q c0915q222) {
            C0158h.m463a(c0892i);
            throw c0915q222;
        }
    }

    /* renamed from: a */
    private static void m463a(p000a.p001a.p002a.p003a.C0892i r0) {
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
        r0.close();	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.n.h.a(a.a.a.a.i):void");
    }

    /* renamed from: a */
    public void m465a(C0915q c0915q, C0909g c0909g, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0909g, "HTTP processor");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0157e.mo160a("http.request", c0915q);
        c0909g.process(c0915q, c0157e);
    }

    /* renamed from: b */
    protected C0916s m468b(C0915q c0915q, C0892i c0892i, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0892i, "Client connection");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0157e.mo160a("http.connection", c0892i);
        c0157e.mo160a("http.request_sent", Boolean.FALSE);
        c0892i.mo1595a(c0915q);
        C0916s c0916s = null;
        if (c0915q instanceof C1285l) {
            Object obj = 1;
            ac b = c0915q.getRequestLine().mo144b();
            C1285l c1285l = (C1285l) c0915q;
            if (c1285l.expectContinue() && !b.m31c(C0917v.f1696b)) {
                c0892i.a_();
                if (c0892i.mo1597a(this.f303a)) {
                    C0916s a = c0892i.mo1593a();
                    if (m467a(c0915q, a) != null) {
                        c0892i.mo1596a(a);
                    }
                    c0915q = a.mo1628a().mo147b();
                    if (c0915q >= 200) {
                        obj = null;
                        c0916s = a;
                    } else if (c0915q != 100) {
                        c0892i = new StringBuilder();
                        c0892i.append("Unexpected response: ");
                        c0892i.append(a.mo1628a());
                        throw new ab(c0892i.toString());
                    }
                }
            }
            if (obj != null) {
                c0892i.mo1594a(c1285l);
            }
        }
        c0892i.a_();
        c0157e.mo160a("http.request_sent", Boolean.TRUE);
        return c0916s;
    }

    /* renamed from: c */
    protected C0916s m469c(C0915q c0915q, C0892i c0892i, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0892i, "Client connection");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0157e = null;
        int i = 0;
        while (true) {
            if (c0157e != null) {
                if (i >= 200) {
                    return c0157e;
                }
            }
            C0916s a = c0892i.mo1593a();
            if (m467a(c0915q, a)) {
                c0892i.mo1596a(a);
            }
            i = a.mo1628a().mo147b();
        }
    }

    /* renamed from: a */
    public void m466a(C0916s c0916s, C0909g c0909g, C0157e c0157e) {
        C0160a.m478a((Object) c0916s, "HTTP response");
        C0160a.m478a((Object) c0909g, "HTTP processor");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0157e.mo160a("http.response", c0916s);
        c0909g.process(c0916s, c0157e);
    }
}
