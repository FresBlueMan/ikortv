package p000a.p001a.p002a.p003a.p022i.p024b;

import java.net.URI;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p005b.C0037o;
import p000a.p001a.p002a.p003a.p005b.C0038p;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p005b.p007c.C1340f;
import p000a.p001a.p002a.p003a.p005b.p007c.C1341g;
import p000a.p001a.p002a.p003a.p034n.C0157e;

@Deprecated
/* compiled from: DefaultRedirectStrategyAdaptor */
/* renamed from: a.a.a.a.i.b.o */
class C0852o implements C0038p {
    /* renamed from: a */
    private final C0037o f1512a;

    public C0852o(C0037o c0037o) {
        this.f1512a = c0037o;
    }

    /* renamed from: a */
    public boolean mo57a(C0915q c0915q, C0916s c0916s, C0157e c0157e) {
        return this.f1512a.isRedirectRequested(c0916s, c0157e);
    }

    /* renamed from: b */
    public C1238l mo58b(C0915q c0915q, C0916s c0916s, C0157e c0157e) {
        URI locationURI = this.f1512a.getLocationURI(c0916s, c0157e);
        if (c0915q.getRequestLine().mo143a().equalsIgnoreCase("HEAD") != null) {
            return new C1341g(locationURI);
        }
        return new C1340f(locationURI);
    }

    /* renamed from: a */
    public C0037o m1650a() {
        return this.f1512a;
    }
}
