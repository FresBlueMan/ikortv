package p000a.p001a.p002a.p003a.p022i.p025c;

import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.C0171t;
import p000a.p001a.p002a.p003a.C0176z;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p022i.p029f.C0887a;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p031k.C0147t;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: DefaultHttpResponseParser */
/* renamed from: a.a.a.a.i.c.h */
public class C1266h extends C0887a<C0916s> {
    /* renamed from: a */
    public C0097b f2172a = new C0097b(getClass());
    /* renamed from: c */
    private final C0171t f2173c;
    /* renamed from: d */
    private final C0163d f2174d;

    /* renamed from: a */
    protected boolean m2638a(C0163d c0163d, int i) {
        return false;
    }

    /* renamed from: b */
    protected /* synthetic */ C0169p mo1604b(C0140f c0140f) {
        return m2637a(c0140f);
    }

    @Deprecated
    public C1266h(C0140f c0140f, C0147t c0147t, C0171t c0171t, C0152e c0152e) {
        super(c0140f, c0147t, c0152e);
        C0160a.m478a((Object) c0171t, "Response factory");
        this.f2173c = c0171t;
        this.f2174d = new C0163d(128);
    }

    /* renamed from: a */
    protected C0916s m2637a(C0140f c0140f) {
        int i = 0;
        while (true) {
            this.f2174d.m503a();
            int a = c0140f.mo79a(this.f2174d);
            if (a == -1) {
                if (i == 0) {
                    throw new C0176z("The target server failed to respond");
                }
            }
            C0148u c0148u = new C0148u(0, this.f2174d.m513c());
            if (this.b.mo137b(this.f2174d, c0148u)) {
                return this.f2173c.mo91a(this.b.mo138c(this.f2174d, c0148u), null);
            } else if (a != -1 && !m2638a(this.f2174d, i)) {
                if (this.f2172a.m262a()) {
                    C0097b c0097b = this.f2172a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Garbage in response: ");
                    stringBuilder.append(this.f2174d.toString());
                    c0097b.m260a(stringBuilder.toString());
                }
                i++;
            }
        }
        throw new ab("The server failed to respond with a valid HTTP response");
    }
}
