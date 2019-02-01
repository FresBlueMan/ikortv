package p000a.p001a.p002a.p003a.p034n;

import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestExpectContinue */
/* renamed from: a.a.a.a.n.k */
public class C0911k implements C0170r {
    /* renamed from: a */
    private final boolean f1693a;

    @Deprecated
    public C0911k() {
        this(false);
    }

    public C0911k(boolean z) {
        this.f1693a = z;
    }

    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        if (c0915q.containsHeader("Expect") == null && (c0915q instanceof C1285l) != null) {
            c0157e = c0915q.getRequestLine().mo144b();
            C0149k entity = ((C1285l) c0915q).getEntity();
            if (entity != null && entity.getContentLength() != 0 && c0157e.m31c(C0917v.f1696b) == null && c0915q.getParams().mo153a("http.protocol.expect-continue", this.f1693a) != null) {
                c0915q.addHeader("Expect", "100-continue");
            }
        }
    }
}
