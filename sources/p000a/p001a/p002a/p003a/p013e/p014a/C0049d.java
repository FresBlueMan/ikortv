package p000a.p001a.p002a.p003a.p013e.p014a;

import java.net.InetAddress;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: ConnRouteParams */
/* renamed from: a.a.a.a.e.a.d */
public class C0049d {
    /* renamed from: a */
    public static final C0159n f106a = new C0159n("127.0.0.255", 0, "no-host");
    /* renamed from: b */
    public static final C0817b f107b = new C0817b(f106a);

    /* renamed from: a */
    public static C0159n m153a(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "Parameters");
        C0159n c0159n = (C0159n) c0152e.mo1602a("http.route.default-proxy");
        return (c0159n == null || !f106a.equals(c0159n)) ? c0159n : null;
    }

    /* renamed from: b */
    public static C0817b m154b(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "Parameters");
        C0817b c0817b = (C0817b) c0152e.mo1602a("http.route.forced-route");
        return (c0817b == null || !f107b.equals(c0817b)) ? c0817b : null;
    }

    /* renamed from: c */
    public static InetAddress m155c(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "Parameters");
        return (InetAddress) c0152e.mo1602a("http.route.local-address");
    }
}
