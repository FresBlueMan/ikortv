package p000a.p001a.p002a.p003a.p032l;

import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.p034n.C0156d;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: HttpProtocolParams */
/* renamed from: a.a.a.a.l.f */
public final class C0153f {
    /* renamed from: a */
    public static String m449a(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        String str = (String) c0152e.mo1602a("http.protocol.element-charset");
        return str == null ? C0156d.f302b.name() : str;
    }

    /* renamed from: a */
    public static void m451a(C0152e c0152e, String str) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo1601a("http.protocol.content-charset", (Object) str);
    }

    /* renamed from: b */
    public static ac m452b(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e = c0152e.mo1602a("http.protocol.version");
        if (c0152e == null) {
            return C0917v.f1697c;
        }
        return (ac) c0152e;
    }

    /* renamed from: a */
    public static void m450a(C0152e c0152e, ac acVar) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo1601a("http.protocol.version", (Object) acVar);
    }

    /* renamed from: b */
    public static void m453b(C0152e c0152e, String str) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo1601a("http.useragent", (Object) str);
    }
}
