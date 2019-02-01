package p000a.p001a.p002a.p003a.p022i.p028e;

import com.loopj.android.http.AsyncHttpClient;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.p020g.C0092d;
import p000a.p001a.p002a.p003a.p020g.C1256b;
import p000a.p001a.p002a.p003a.p022i.p029f.C0129e;
import p000a.p001a.p002a.p003a.p022i.p029f.C0131g;
import p000a.p001a.p002a.p003a.p022i.p029f.C0133l;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: EntityDeserializer */
/* renamed from: a.a.a.a.i.e.a */
public class C0126a {
    /* renamed from: a */
    private final C0092d f256a;

    public C0126a(C0092d c0092d) {
        this.f256a = (C0092d) C0160a.m478a((Object) c0092d, "Content length strategy");
    }

    /* renamed from: a */
    protected C1256b m364a(C0140f c0140f, C0169p c0169p) {
        C1256b c1256b = new C1256b();
        long a = this.f256a.mo103a(c0169p);
        if (a == -2) {
            c1256b.m1557a(true);
            c1256b.m2557a(-1);
            c1256b.m2558a(new C0129e(c0140f));
        } else if (a == -1) {
            c1256b.m1557a(false);
            c1256b.m2557a(-1);
            c1256b.m2558a(new C0133l(c0140f));
        } else {
            c1256b.m1557a(false);
            c1256b.m2557a(a);
            c1256b.m2558a(new C0131g(c0140f, a));
        }
        c0140f = c0169p.getFirstHeader(AsyncHttpClient.HEADER_CONTENT_TYPE);
        if (c0140f != null) {
            c1256b.m1555a((C0082e) c0140f);
        }
        c0140f = c0169p.getFirstHeader(AsyncHttpClient.HEADER_CONTENT_ENCODING);
        if (c0140f != null) {
            c1256b.m1558b(c0140f);
        }
        return c1256b;
    }

    /* renamed from: b */
    public C0149k m365b(C0140f c0140f, C0169p c0169p) {
        C0160a.m478a((Object) c0140f, "Session input buffer");
        C0160a.m478a((Object) c0169p, "HTTP message");
        return m364a(c0140f, c0169p);
    }
}
