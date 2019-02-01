package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.p004a.C0004e;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p005b.C0014a;
import p000a.p001a.p002a.p003a.p005b.C0033h;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p005b.p006a.C0013a;
import p000a.p001a.p002a.p003a.p012d.C0044a;
import p000a.p001a.p002a.p003a.p013e.p015b.C0054e;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C0090j;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p034n.C0908f;

/* compiled from: HttpClientContext */
/* renamed from: a.a.a.a.b.e.a */
public class C1239a extends C0908f {
    /* renamed from: a */
    public static C1239a m2524a(C0157e c0157e) {
        if (c0157e instanceof C1239a) {
            return (C1239a) c0157e;
        }
        return new C1239a(c0157e);
    }

    public C1239a(C0157e c0157e) {
        super(c0157e);
    }

    /* renamed from: a */
    public C0054e m2526a() {
        return (C0054e) m1913a("http.route", C0817b.class);
    }

    /* renamed from: b */
    public C0033h m2528b() {
        return (C0033h) m1913a("http.cookie-store", C0033h.class);
    }

    /* renamed from: c */
    public C0088h m2529c() {
        return (C0088h) m1913a("http.cookie-spec", C0088h.class);
    }

    /* renamed from: d */
    public C0086e m2530d() {
        return (C0086e) m1913a("http.cookie-origin", C0086e.class);
    }

    /* renamed from: b */
    private <T> C0044a<T> m2525b(String str, Class<T> cls) {
        return (C0044a) m1913a(str, C0044a.class);
    }

    /* renamed from: e */
    public C0044a<C0090j> m2531e() {
        return m2525b("http.cookiespec-registry", C0090j.class);
    }

    /* renamed from: f */
    public C0044a<C0004e> m2532f() {
        return m2525b("http.authscheme-registry", C0004e.class);
    }

    /* renamed from: g */
    public C0034i m2533g() {
        return (C0034i) m1913a("http.auth.credentials-provider", C0034i.class);
    }

    /* renamed from: h */
    public C0014a m2534h() {
        return (C0014a) m1913a("http.auth.auth-cache", C0014a.class);
    }

    /* renamed from: a */
    public void m2527a(C0014a c0014a) {
        mo160a("http.auth.auth-cache", (Object) c0014a);
    }

    /* renamed from: i */
    public C0006h m2535i() {
        return (C0006h) m1913a("http.auth.target-scope", C0006h.class);
    }

    /* renamed from: j */
    public C0006h m2536j() {
        return (C0006h) m1913a("http.auth.proxy-scope", C0006h.class);
    }

    /* renamed from: k */
    public C0013a m2537k() {
        C0013a c0013a = (C0013a) m1913a("http.request-config", C0013a.class);
        return c0013a != null ? c0013a : C0013a.f46a;
    }
}
