package p000a.p001a.p002a.p003a.p022i.p027d;

import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicSecureHandler */
/* renamed from: a.a.a.a.i.d.j */
public class C1271j extends C0873a {
    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        c0830m.mo1608a(true);
    }

    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0083b.mo1622i() != null) {
            if (c0086e.m232d() == null) {
                return null;
            }
        }
        return true;
    }
}
