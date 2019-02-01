package p000a.p001a.p002a.p003a.p034n;

import p000a.p001a.p002a.p003a.C0142j;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: HttpCoreContext */
/* renamed from: a.a.a.a.n.f */
public class C0908f implements C0157e {
    /* renamed from: a */
    private final C0157e f1691a;

    /* renamed from: b */
    public static C0908f m1911b(C0157e c0157e) {
        C0160a.m478a((Object) c0157e, "HTTP context");
        if (c0157e instanceof C0908f) {
            return (C0908f) c0157e;
        }
        return new C0908f(c0157e);
    }

    public C0908f(C0157e c0157e) {
        this.f1691a = c0157e;
    }

    public C0908f() {
        this.f1691a = new C0906a();
    }

    /* renamed from: a */
    public Object mo159a(String str) {
        return this.f1691a.mo159a(str);
    }

    /* renamed from: a */
    public void mo160a(String str, Object obj) {
        this.f1691a.mo160a(str, obj);
    }

    /* renamed from: a */
    public <T> T m1913a(String str, Class<T> cls) {
        C0160a.m478a((Object) cls, "Attribute class");
        str = mo159a(str);
        if (str == null) {
            return null;
        }
        return cls.cast(str);
    }

    /* renamed from: l */
    public C0142j m1915l() {
        return (C0142j) m1913a("http.connection", C0142j.class);
    }

    /* renamed from: m */
    public C0915q m1916m() {
        return (C0915q) m1913a("http.request", C0915q.class);
    }

    /* renamed from: n */
    public boolean m1917n() {
        Boolean bool = (Boolean) m1913a("http.request_sent", Boolean.class);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: o */
    public C0159n m1918o() {
        return (C0159n) m1913a("http.target_host", C0159n.class);
    }
}
