package p000a.p001a.p002a.p003a.p013e.p015b;

import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicRouteDirector */
/* renamed from: a.a.a.a.e.b.a */
public class C0816a implements C0050c {
    /* renamed from: a */
    public int mo9a(C0054e c0054e, C0054e c0054e2) {
        C0160a.m478a((Object) c0054e, "Planned route");
        if (c0054e2 != null) {
            if (c0054e2.mo13c() >= 1) {
                if (c0054e.mo13c() > 1) {
                    return m1501c(c0054e, c0054e2);
                }
                return m1500b(c0054e, c0054e2);
            }
        }
        return m1498a(c0054e);
    }

    /* renamed from: a */
    protected int m1498a(C0054e c0054e) {
        return c0054e.mo13c() > 1 ? 2 : 1;
    }

    /* renamed from: b */
    protected int m1500b(C0054e c0054e, C0054e c0054e2) {
        if (c0054e2.mo13c() > 1 || !c0054e.mo10a().equals(c0054e2.mo10a()) || c0054e.mo17g() != c0054e2.mo17g()) {
            return -1;
        }
        if (c0054e.mo12b() == null || c0054e.mo12b().equals(c0054e2.mo12b()) != null) {
            return null;
        }
        return -1;
    }

    /* renamed from: c */
    protected int m1501c(C0054e c0054e, C0054e c0054e2) {
        if (c0054e2.mo13c() <= 1 || !c0054e.mo10a().equals(c0054e2.mo10a())) {
            return -1;
        }
        int c = c0054e.mo13c();
        int c2 = c0054e2.mo13c();
        if (c < c2) {
            return -1;
        }
        for (int i = 0; i < c2 - 1; i++) {
            if (!c0054e.mo11a(i).equals(c0054e2.mo11a(i))) {
                return -1;
            }
        }
        if (c > c2) {
            return 4;
        }
        if ((c0054e2.mo15e() && !c0054e.mo15e()) || (c0054e2.mo16f() && !c0054e.mo16f())) {
            return -1;
        }
        if (c0054e.mo15e() && !c0054e2.mo15e()) {
            return 3;
        }
        if (c0054e.mo16f() && !c0054e2.mo16f()) {
            return 5;
        }
        if (c0054e.mo17g() != c0054e2.mo17g()) {
            return -1;
        }
        return 0;
    }
}
