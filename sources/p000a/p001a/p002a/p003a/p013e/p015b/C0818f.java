package p000a.p001a.p002a.p003a.p013e.p015b;

import java.net.InetAddress;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.p015b.C0054e.C0052a;
import p000a.p001a.p002a.p003a.p013e.p015b.C0054e.C0053b;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: RouteTracker */
/* renamed from: a.a.a.a.e.b.f */
public final class C0818f implements C0054e, Cloneable {
    /* renamed from: a */
    private final C0159n f1440a;
    /* renamed from: b */
    private final InetAddress f1441b;
    /* renamed from: c */
    private boolean f1442c;
    /* renamed from: d */
    private C0159n[] f1443d;
    /* renamed from: e */
    private C0053b f1444e;
    /* renamed from: f */
    private C0052a f1445f;
    /* renamed from: g */
    private boolean f1446g;

    public C0818f(C0159n c0159n, InetAddress inetAddress) {
        C0160a.m478a((Object) c0159n, "Target host");
        this.f1440a = c0159n;
        this.f1441b = inetAddress;
        this.f1444e = C0053b.PLAIN;
        this.f1445f = C0052a.PLAIN;
    }

    /* renamed from: h */
    public void m1523h() {
        this.f1442c = false;
        this.f1443d = null;
        this.f1444e = C0053b.PLAIN;
        this.f1445f = C0052a.PLAIN;
        this.f1446g = false;
    }

    public C0818f(C0817b c0817b) {
        this(c0817b.mo10a(), c0817b.mo12b());
    }

    /* renamed from: a */
    public final void m1513a(boolean z) {
        C0161b.m485a(this.f1442c ^ true, "Already connected");
        this.f1442c = true;
        this.f1446g = z;
    }

    /* renamed from: a */
    public final void m1512a(C0159n c0159n, boolean z) {
        C0160a.m478a((Object) c0159n, "Proxy host");
        C0161b.m485a(this.f1442c ^ true, "Already connected");
        this.f1442c = true;
        this.f1443d = new C0159n[]{c0159n};
        this.f1446g = z;
    }

    /* renamed from: b */
    public final void m1516b(boolean z) {
        C0161b.m485a(this.f1442c, "No tunnel unless connected");
        C0161b.m484a(this.f1443d, "No tunnel without proxy");
        this.f1444e = C0053b.TUNNELLED;
        this.f1446g = z;
    }

    /* renamed from: b */
    public final void m1515b(C0159n c0159n, boolean z) {
        C0160a.m478a((Object) c0159n, "Proxy host");
        C0161b.m485a(this.f1442c, "No tunnel unless connected");
        C0161b.m484a(this.f1443d, "No tunnel without proxy");
        Object obj = new C0159n[(this.f1443d.length + 1)];
        System.arraycopy(this.f1443d, 0, obj, 0, this.f1443d.length);
        obj[obj.length - 1] = c0159n;
        this.f1443d = obj;
        this.f1446g = z;
    }

    /* renamed from: c */
    public final void m1518c(boolean z) {
        C0161b.m485a(this.f1442c, "No layered protocol unless connected");
        this.f1445f = C0052a.LAYERED;
        this.f1446g = z;
    }

    /* renamed from: a */
    public final C0159n mo10a() {
        return this.f1440a;
    }

    /* renamed from: b */
    public final InetAddress mo12b() {
        return this.f1441b;
    }

    /* renamed from: c */
    public final int mo13c() {
        if (!this.f1442c) {
            return 0;
        }
        if (this.f1443d == null) {
            return 1;
        }
        return 1 + this.f1443d.length;
    }

    /* renamed from: a */
    public final C0159n mo11a(int i) {
        C0160a.m482b(i, "Hop index");
        int c = mo13c();
        C0160a.m480a(i < c, "Hop index exceeds tracked route length");
        if (i < c - 1) {
            return this.f1443d[i];
        }
        return this.f1440a;
    }

    /* renamed from: d */
    public final C0159n mo14d() {
        return this.f1443d == null ? null : this.f1443d[0];
    }

    /* renamed from: i */
    public final boolean m1524i() {
        return this.f1442c;
    }

    /* renamed from: e */
    public final boolean mo15e() {
        return this.f1444e == C0053b.TUNNELLED;
    }

    /* renamed from: f */
    public final boolean mo16f() {
        return this.f1445f == C0052a.LAYERED;
    }

    /* renamed from: g */
    public final boolean mo17g() {
        return this.f1446g;
    }

    /* renamed from: j */
    public final C0817b m1525j() {
        return !this.f1442c ? null : new C0817b(this.f1440a, this.f1441b, this.f1443d, this.f1446g, this.f1444e, this.f1445f);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0818f)) {
            return false;
        }
        C0818f c0818f = (C0818f) obj;
        if (this.f1442c != c0818f.f1442c || this.f1446g != c0818f.f1446g || this.f1444e != c0818f.f1444e || this.f1445f != c0818f.f1445f || !C0166g.m525a(this.f1440a, c0818f.f1440a) || !C0166g.m525a(this.f1441b, c0818f.f1441b) || C0166g.m526a(this.f1443d, c0818f.f1443d) == null) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int a = C0166g.m523a(C0166g.m523a(17, this.f1440a), this.f1441b);
        if (this.f1443d != null) {
            for (Object a2 : this.f1443d) {
                a = C0166g.m523a(a, a2);
            }
        }
        return C0166g.m523a(C0166g.m523a(C0166g.m524a(C0166g.m524a(a, this.f1442c), this.f1446g), this.f1444e), this.f1445f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder((mo13c() * 30) + 50);
        stringBuilder.append("RouteTracker[");
        if (this.f1441b != null) {
            stringBuilder.append(this.f1441b);
            stringBuilder.append("->");
        }
        stringBuilder.append('{');
        if (this.f1442c) {
            stringBuilder.append('c');
        }
        if (this.f1444e == C0053b.TUNNELLED) {
            stringBuilder.append('t');
        }
        if (this.f1445f == C0052a.LAYERED) {
            stringBuilder.append('l');
        }
        if (this.f1446g) {
            stringBuilder.append('s');
        }
        stringBuilder.append("}->");
        if (this.f1443d != null) {
            for (Object append : this.f1443d) {
                stringBuilder.append(append);
                stringBuilder.append("->");
            }
        }
        stringBuilder.append(this.f1440a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}
