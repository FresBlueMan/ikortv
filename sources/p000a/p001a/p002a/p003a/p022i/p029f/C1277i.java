package p000a.p001a.p002a.p003a.p022i.p029f;

import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.C0171t;
import p000a.p001a.p002a.p003a.C0176z;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p031k.C0147t;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: DefaultHttpResponseParser */
/* renamed from: a.a.a.a.i.f.i */
public class C1277i extends C0887a<C0916s> {
    /* renamed from: a */
    private final C0171t f2186a;
    /* renamed from: c */
    private final C0163d f2187c = new C0163d(128);

    /* renamed from: b */
    protected /* synthetic */ C0169p mo1604b(C0140f c0140f) {
        return m2677a(c0140f);
    }

    @Deprecated
    public C1277i(C0140f c0140f, C0147t c0147t, C0171t c0171t, C0152e c0152e) {
        super(c0140f, c0147t, c0152e);
        this.f2186a = (C0171t) C0160a.m478a((Object) c0171t, "Response factory");
    }

    /* renamed from: a */
    protected C0916s m2677a(C0140f c0140f) {
        this.f2187c.m503a();
        if (c0140f.mo79a(this.f2187c) != -1) {
            return this.f2186a.mo91a(this.b.mo138c(this.f2187c, new C0148u(0, this.f2187c.m513c())), null);
        }
        throw new C0176z("The target server failed to respond");
    }
}
