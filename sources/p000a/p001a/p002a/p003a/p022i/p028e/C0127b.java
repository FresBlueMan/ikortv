package p000a.p001a.p002a.p003a.p022i.p028e;

import java.io.OutputStream;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.p020g.C0092d;
import p000a.p001a.p002a.p003a.p022i.p029f.C0130f;
import p000a.p001a.p002a.p003a.p022i.p029f.C0132h;
import p000a.p001a.p002a.p003a.p022i.p029f.C0134m;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: EntitySerializer */
/* renamed from: a.a.a.a.i.e.b */
public class C0127b {
    /* renamed from: a */
    private final C0092d f257a;

    public C0127b(C0092d c0092d) {
        this.f257a = (C0092d) C0160a.m478a((Object) c0092d, "Content length strategy");
    }

    /* renamed from: a */
    protected OutputStream m366a(C0141g c0141g, C0169p c0169p) {
        long a = this.f257a.mo103a(c0169p);
        if (a == -2) {
            return new C0130f(c0141g);
        }
        if (a == -1) {
            return new C0134m(c0141g);
        }
        return new C0132h(c0141g, a);
    }

    /* renamed from: a */
    public void m367a(C0141g c0141g, C0169p c0169p, C0149k c0149k) {
        C0160a.m478a((Object) c0141g, "Session output buffer");
        C0160a.m478a((Object) c0169p, "HTTP message");
        C0160a.m478a((Object) c0149k, "HTTP entity");
        c0141g = m366a(c0141g, c0169p);
        c0149k.writeTo(c0141g);
        c0141g.close();
    }
}
