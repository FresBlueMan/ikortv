package p000a.p001a.p002a.p003a.p005b.p008d;

import p000a.p001a.p002a.p003a.p032l.C0150c;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: HttpClientParams */
/* renamed from: a.a.a.a.b.d.b */
public class C0021b {
    /* renamed from: a */
    public static boolean m79a(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo153a("http.protocol.handle-redirects", true);
    }

    /* renamed from: b */
    public static boolean m80b(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo153a("http.protocol.handle-authentication", true);
    }

    /* renamed from: c */
    public static long m81c(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        Long l = (Long) c0152e.mo1602a("http.conn-manager.timeout");
        if (l != null) {
            return l.longValue();
        }
        return (long) C0150c.m436e(c0152e);
    }
}
