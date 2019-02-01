package p000a.p001a.p002a.p003a.p032l;

import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: HttpConnectionParams */
/* renamed from: a.a.a.a.l.c */
public final class C0150c {
    /* renamed from: a */
    public static int m428a(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo151a("http.socket.timeout", 0);
    }

    /* renamed from: a */
    public static void m429a(C0152e c0152e, int i) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo154b("http.socket.timeout", i);
    }

    /* renamed from: b */
    public static boolean m432b(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo153a("http.socket.reuseaddr", false);
    }

    /* renamed from: c */
    public static boolean m434c(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo153a("http.tcp.nodelay", true);
    }

    /* renamed from: a */
    public static void m430a(C0152e c0152e, boolean z) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo156b("http.tcp.nodelay", z);
    }

    /* renamed from: b */
    public static void m431b(C0152e c0152e, int i) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo154b("http.socket.buffer-size", i);
    }

    /* renamed from: d */
    public static int m435d(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo151a("http.socket.linger", -1);
    }

    /* renamed from: e */
    public static int m436e(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo151a("http.connection.timeout", 0);
    }

    /* renamed from: c */
    public static void m433c(C0152e c0152e, int i) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo154b("http.connection.timeout", i);
    }

    /* renamed from: f */
    public static boolean m437f(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo153a("http.connection.stalecheck", true);
    }
}
