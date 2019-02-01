package p000a.p001a.p002a.p003a.p013e.p014a;

import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: ConnManagerParams */
/* renamed from: a.a.a.a.e.a.a */
public final class C0047a {
    /* renamed from: a */
    private static final C0048b f105a = new C08141();

    /* compiled from: ConnManagerParams */
    /* renamed from: a.a.a.a.e.a.a$1 */
    static class C08141 implements C0048b {
        /* renamed from: a */
        public int mo8a(C0817b c0817b) {
            return 2;
        }

        C08141() {
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m149a(C0152e c0152e, long j) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo155b("http.conn-manager.timeout", j);
    }

    /* renamed from: a */
    public static void m150a(C0152e c0152e, C0048b c0048b) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo1601a("http.conn-manager.max-per-route", (Object) c0048b);
    }

    /* renamed from: a */
    public static C0048b m147a(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        C0048b c0048b = (C0048b) c0152e.mo1602a("http.conn-manager.max-per-route");
        return c0048b == null ? f105a : c0048b;
    }

    /* renamed from: a */
    public static void m148a(C0152e c0152e, int i) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        c0152e.mo154b("http.conn-manager.max-total", i);
    }

    /* renamed from: b */
    public static int m151b(C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        return c0152e.mo151a("http.conn-manager.max-total", 20);
    }
}
