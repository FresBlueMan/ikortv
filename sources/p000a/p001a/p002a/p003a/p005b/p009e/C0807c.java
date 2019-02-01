package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0001b;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0005g;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p013e.p015b.C0054e;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestAuthCache */
/* renamed from: a.a.a.a.b.e.c */
public class C0807c implements C0170r {
    /* renamed from: a */
    public C0097b f1426a = new C0097b(getClass());

    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0915q = C1239a.m2524a(c0157e);
        c0157e = c0915q.m2534h();
        if (c0157e == null) {
            this.f1426a.m260a("Auth cache not set in the context");
            return;
        }
        C0034i g = c0915q.m2533g();
        if (g == null) {
            this.f1426a.m260a("Credentials provider not set in the context");
            return;
        }
        C0054e a = c0915q.m2526a();
        if (a == null) {
            this.f1426a.m260a("Route info not set in the context");
            return;
        }
        C0159n o = c0915q.m1918o();
        if (o == null) {
            this.f1426a.m260a("Target host not set in the context");
            return;
        }
        if (o.m471b() < 0) {
            o = new C0159n(o.m470a(), a.mo10a().m471b(), o.m472c());
        }
        C0006h i = c0915q.m2535i();
        if (i != null && i.m17b() == C0001b.UNCHALLENGED) {
            C0002c a2 = c0157e.mo45a(o);
            if (a2 != null) {
                m1487a(o, a2, i, g);
            }
        }
        C0159n d = a.mo14d();
        c0915q = c0915q.m2536j();
        if (!(d == null || c0915q == null || c0915q.m17b() != C0001b.UNCHALLENGED)) {
            c0157e = c0157e.mo45a(d);
            if (c0157e != null) {
                m1487a(d, c0157e, c0915q, g);
            }
        }
    }

    /* renamed from: a */
    private void m1487a(C0159n c0159n, C0002c c0002c, C0006h c0006h, C0034i c0034i) {
        String a = c0002c.mo1918a();
        if (this.f1426a.m262a()) {
            C0097b c0097b = this.f1426a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Re-using cached '");
            stringBuilder.append(a);
            stringBuilder.append("' auth scheme for ");
            stringBuilder.append(c0159n);
            c0097b.m260a(stringBuilder.toString());
        }
        c0159n = c0034i.mo50a(new C0005g(c0159n, C0005g.f9b, a));
        if (c0159n != null) {
            if ("BASIC".equalsIgnoreCase(c0002c.mo1918a()) != null) {
                c0006h.m12a(C0001b.CHALLENGED);
            } else {
                c0006h.m12a(C0001b.SUCCESS);
            }
            c0006h.m14a(c0002c, c0159n);
            return;
        }
        this.f1426a.m260a("No credentials for preemptive authentication");
    }
}
