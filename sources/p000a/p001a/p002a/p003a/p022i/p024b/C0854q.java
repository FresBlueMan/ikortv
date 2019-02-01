package p000a.p001a.p002a.p003a.p022i.p024b;

import java.security.Principal;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p005b.C0040r;
import p000a.p001a.p002a.p003a.p005b.p009e.C1239a;
import p000a.p001a.p002a.p003a.p013e.C1252p;
import p000a.p001a.p002a.p003a.p034n.C0157e;

/* compiled from: DefaultUserTokenHandler */
/* renamed from: a.a.a.a.i.b.q */
public class C0854q implements C0040r {
    /* renamed from: a */
    public static final C0854q f1537a = new C0854q();

    /* renamed from: a */
    public Object mo60a(C0157e c0157e) {
        Object a;
        c0157e = C1239a.m2524a(c0157e);
        C0006h i = c0157e.m2535i();
        if (i != null) {
            a = C0854q.m1666a(i);
            if (a == null) {
                a = C0854q.m1666a(c0157e.m2536j());
            }
        } else {
            a = null;
        }
        if (a != null) {
            return a;
        }
        c0157e = c0157e.m1915l();
        if (!c0157e.mo1932c() || !(c0157e instanceof C1252p)) {
            return a;
        }
        c0157e = ((C1252p) c0157e).mo2014k();
        return c0157e != null ? c0157e.getLocalPrincipal() : a;
    }

    /* renamed from: a */
    private static Principal m1666a(C0006h c0006h) {
        C0002c c = c0006h.m18c();
        if (c != null && c.mo1922d() && c.mo1921c()) {
            c0006h = c0006h.m19d();
            if (c0006h != null) {
                return c0006h.mo3a();
            }
        }
        return null;
    }
}
