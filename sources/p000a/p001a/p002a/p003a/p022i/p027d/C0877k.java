package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.List;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1255n;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BestMatchSpec */
/* renamed from: a.a.a.a.i.d.k */
public class C0877k implements C0088h {
    /* renamed from: a */
    private final String[] f1600a;
    /* renamed from: b */
    private final boolean f1601b;
    /* renamed from: c */
    private ae f1602c;
    /* renamed from: d */
    private C1330x f1603d;
    /* renamed from: e */
    private C1327m f1604e;

    public String toString() {
        return "best-match";
    }

    public C0877k(String[] strArr, boolean z) {
        if (strArr == null) {
            strArr = null;
        } else {
            strArr = (String[]) strArr.clone();
        }
        this.f1600a = strArr;
        this.f1601b = z;
    }

    public C0877k() {
        this(null, false);
    }

    /* renamed from: c */
    private ae m1776c() {
        if (this.f1602c == null) {
            this.f1602c = new ae(this.f1600a, this.f1601b);
        }
        return this.f1602c;
    }

    /* renamed from: d */
    private C1330x m1777d() {
        if (this.f1603d == null) {
            this.f1603d = new C1330x(this.f1600a, this.f1601b);
        }
        return this.f1603d;
    }

    /* renamed from: e */
    private C1327m m1778e() {
        if (this.f1604e == null) {
            this.f1604e = new C1327m(this.f1600a);
        }
        return this.f1604e;
    }

    /* renamed from: a */
    public List<C0083b> mo97a(C0082e c0082e, C0086e c0086e) {
        C0163d a;
        C0148u c0148u;
        C0160a.m478a((Object) c0082e, "Header");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        C0091f[] e = c0082e.mo123e();
        Object obj = null;
        Object obj2 = null;
        for (C0091f c0091f : e) {
            if (c0091f.mo125a("version") != null) {
                obj2 = 1;
            }
            if (c0091f.mo125a("expires") != null) {
                obj = 1;
            }
        }
        if (obj == null) {
            if (obj2 != null) {
                if ("Set-Cookie2".equals(c0082e.mo121c()) != null) {
                    return m1776c().mo2028a(e, c0086e);
                }
                return m1777d().mo2028a(e, c0086e);
            }
        }
        C0125t c0125t = C0125t.f255a;
        if (c0082e instanceof C0813d) {
            C0813d c0813d = (C0813d) c0082e;
            a = c0813d.mo1631a();
            c0148u = new C0148u(c0813d.mo1632b(), a.m513c());
        } else {
            String d = c0082e.mo122d();
            if (d != null) {
                a = new C0163d(d.length());
                a.m507a(d);
                c0148u = new C0148u(0, a.m513c());
            } else {
                throw new C1254l("Header value is null");
            }
        }
        return m1778e().mo2028a((C0091f[]) new C0091f[]{c0125t.m363a(a, c0148u)}, c0086e);
    }

    /* renamed from: a */
    public void mo99a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0083b.mo1623j() <= 0) {
            m1778e().mo99a(c0083b, c0086e);
        } else if (c0083b instanceof C1255n) {
            m1776c().mo99a(c0083b, c0086e);
        } else {
            m1777d().mo99a(c0083b, c0086e);
        }
    }

    /* renamed from: b */
    public boolean mo101b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0083b.mo1623j() <= 0) {
            return m1778e().mo101b(c0083b, c0086e);
        }
        if (c0083b instanceof C1255n) {
            return m1776c().mo101b(c0083b, c0086e);
        }
        return m1777d().mo101b(c0083b, c0086e);
    }

    /* renamed from: a */
    public List<C0082e> mo98a(List<C0083b> list) {
        C0160a.m478a((Object) list, "List of cookies");
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        Object obj = 1;
        for (C0083b c0083b : list) {
            if (!(c0083b instanceof C1255n)) {
                obj = null;
            }
            if (c0083b.mo1623j() < i) {
                i = c0083b.mo1623j();
            }
        }
        if (i <= 0) {
            return m1778e().mo98a(list);
        }
        if (obj != null) {
            return m1776c().mo98a(list);
        }
        return m1777d().mo98a(list);
    }

    /* renamed from: a */
    public int mo96a() {
        return m1776c().mo96a();
    }

    /* renamed from: b */
    public C0082e mo100b() {
        return m1776c().mo100b();
    }
}
