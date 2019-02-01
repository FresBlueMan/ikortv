package p000a.p001a.p002a.p003a.p022i.p025c;

import p000a.p001a.p002a.p003a.C0155m;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p013e.p014a.C0049d;
import p000a.p001a.p002a.p003a.p013e.p015b.C0051d;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p013e.p016c.C0058i;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: DefaultHttpRoutePlanner */
/* renamed from: a.a.a.a.i.c.i */
public class C0866i implements C0051d {
    /* renamed from: a */
    protected final C0058i f1583a;

    public C0866i(C0058i c0058i) {
        C0160a.m478a((Object) c0058i, "Scheme registry");
        this.f1583a = c0058i;
    }

    /* renamed from: a */
    public C0817b mo75a(C0159n c0159n, C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        c0157e = C0049d.m154b(c0915q.getParams());
        if (c0157e != null) {
            return c0157e;
        }
        C0161b.m484a((Object) c0159n, "Target host");
        c0157e = C0049d.m155c(c0915q.getParams());
        c0915q = C0049d.m153a(c0915q.getParams());
        try {
            boolean d = this.f1583a.m178a(c0159n.m472c()).m175d();
            if (c0915q == null) {
                c0915q = new C0817b(c0159n, c0157e, d);
            } else {
                c0915q = new C0817b(c0159n, c0157e, c0915q, d);
            }
            return c0915q;
        } catch (C0159n c0159n2) {
            throw new C0155m(c0159n2.getMessage());
        }
    }
}
