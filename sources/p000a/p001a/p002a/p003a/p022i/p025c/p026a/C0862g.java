package p000a.p001a.p002a.p003a.p022i.p025c.p026a;

import java.util.concurrent.TimeUnit;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C0073e;
import p000a.p001a.p002a.p003a.p013e.C1319o;
import p000a.p001a.p002a.p003a.p013e.p014a.C0815c;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p013e.p016c.C0058i;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p022i.p025c.C0121p;
import p000a.p001a.p002a.p003a.p022i.p025c.C0865g;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: ThreadSafeClientConnManager */
/* renamed from: a.a.a.a.i.c.a.g */
public class C0862g implements C0055b {
    /* renamed from: a */
    public C0097b f1564a;
    /* renamed from: b */
    protected final C0058i f1565b;
    /* renamed from: c */
    protected final C0113a f1566c;
    /* renamed from: d */
    protected final C0860d f1567d;
    /* renamed from: e */
    protected final C0071d f1568e;
    /* renamed from: f */
    protected final C0815c f1569f;

    public C0862g(C0058i c0058i) {
        this(c0058i, -1, TimeUnit.MILLISECONDS);
    }

    public C0862g() {
        this(C0121p.m353a());
    }

    public C0862g(C0058i c0058i, long j, TimeUnit timeUnit) {
        this(c0058i, j, timeUnit, new C0815c());
    }

    public C0862g(C0058i c0058i, long j, TimeUnit timeUnit, C0815c c0815c) {
        C0160a.m478a((Object) c0058i, "Scheme registry");
        this.f1564a = new C0097b(getClass());
        this.f1565b = c0058i;
        this.f1569f = c0815c;
        this.f1568e = m1700a(c0058i);
        this.f1567d = m1703a(j, timeUnit);
        this.f1566c = this.f1567d;
    }

    @Deprecated
    public C0862g(C0152e c0152e, C0058i c0058i) {
        C0160a.m478a((Object) c0058i, "Scheme registry");
        this.f1564a = new C0097b(getClass());
        this.f1565b = c0058i;
        this.f1569f = new C0815c();
        this.f1568e = m1700a(c0058i);
        this.f1567d = (C0860d) m1702a(c0152e);
        this.f1566c = this.f1567d;
    }

    protected void finalize() {
        try {
            mo71b();
        } finally {
            super.finalize();
        }
    }

    @Deprecated
    /* renamed from: a */
    protected C0113a m1702a(C0152e c0152e) {
        return new C0860d(this.f1568e, c0152e);
    }

    /* renamed from: a */
    protected C0860d m1703a(long j, TimeUnit timeUnit) {
        return new C0860d(this.f1568e, this.f1569f, 20, j, timeUnit);
    }

    /* renamed from: a */
    protected C0071d m1700a(C0058i c0058i) {
        return new C0865g(c0058i);
    }

    /* renamed from: a */
    public C0058i mo68a() {
        return this.f1565b;
    }

    /* renamed from: a */
    public C0073e mo69a(final C0817b c0817b, Object obj) {
        obj = this.f1567d.m1685a(c0817b, obj);
        return new C0073e(this) {
            /* renamed from: c */
            final /* synthetic */ C0862g f1563c;

            /* renamed from: a */
            public void mo67a() {
                obj.mo64a();
            }

            /* renamed from: a */
            public C1319o mo66a(long j, TimeUnit timeUnit) {
                C0160a.m478a(c0817b, "Route");
                if (this.f1563c.f1564a.m262a()) {
                    C0097b c0097b = this.f1563c.f1564a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Get connection: ");
                    stringBuilder.append(c0817b);
                    stringBuilder.append(", timeout = ");
                    stringBuilder.append(j);
                    c0097b.m260a(stringBuilder.toString());
                }
                return new C1363c(this.f1563c, obj.mo63a(j, timeUnit));
            }
        };
    }

    /* renamed from: a */
    public void mo70a(C1319o c1319o, long j, TimeUnit timeUnit) {
        C0160a.m480a(c1319o instanceof C1363c, "Connection class mismatch, connection not obtained from this manager");
        C1363c c1363c = (C1363c) c1319o;
        if (c1363c.mo2129q() != null) {
            C0161b.m485a(c1363c.mo2128n() == this, "Connection not obtained from this manager");
        }
        synchronized (c1363c) {
            boolean p;
            C0858b c0858b = (C0858b) c1363c.mo2129q();
            if (c0858b == null) {
                return;
            }
            C0860d c0860d;
            try {
                if (c1363c.mo1932c() && !c1363c.m2891p()) {
                    c1363c.mo1934e();
                }
                p = c1363c.m2891p();
                if (this.f1564a.m262a()) {
                    if (p) {
                        this.f1564a.m260a("Released connection is reusable.");
                    } else {
                        this.f1564a.m260a("Released connection is not reusable.");
                    }
                }
                c1363c.mo2086l();
                c0860d = this.f1567d;
            } catch (Throwable e) {
                try {
                    if (this.f1564a.m262a()) {
                        this.f1564a.m261a("Exception shutting down released connection.", e);
                    }
                    p = c1363c.m2891p();
                    if (this.f1564a.m262a()) {
                        if (p) {
                            this.f1564a.m260a("Released connection is reusable.");
                        } else {
                            this.f1564a.m260a("Released connection is not reusable.");
                        }
                    }
                    c1363c.mo2086l();
                    c0860d = this.f1567d;
                } catch (Throwable th) {
                    p = c1363c.m2891p();
                    if (this.f1564a.m262a()) {
                        if (p) {
                            this.f1564a.m260a("Released connection is reusable.");
                        } else {
                            this.f1564a.m260a("Released connection is not reusable.");
                        }
                    }
                    c1363c.mo2086l();
                    this.f1567d.m1691a(c0858b, p, j, timeUnit);
                }
            }
            c0860d.m1691a(c0858b, p, j, timeUnit);
        }
    }

    /* renamed from: b */
    public void mo71b() {
        this.f1564a.m260a("Shutting down");
        this.f1567d.mo65a();
    }
}
