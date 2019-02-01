package p000a.p001a.p002a.p003a.p022i.p024b;

import java.io.Closeable;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p005b.C0031f;
import p000a.p001a.p002a.p003a.p005b.C0035j;
import p000a.p001a.p002a.p003a.p005b.p007c.C1237c;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p005b.p010f.C0029d;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: CloseableHttpClient */
/* renamed from: a.a.a.a.i.b.h */
public abstract class C0847h implements C0035j, Closeable {
    /* renamed from: b */
    public C0097b f1503b = new C0097b(getClass());

    /* renamed from: a */
    protected abstract C1237c mo1600a(C0159n c0159n, C0915q c0915q, C0157e c0157e);

    /* renamed from: a */
    public C1237c m1640a(C1238l c1238l, C0157e c0157e) {
        C0160a.m478a((Object) c1238l, "HTTP request");
        return mo1600a(C0847h.m1639a(c1238l), c1238l, c0157e);
    }

    /* renamed from: a */
    private static C0159n m1639a(C1238l c1238l) {
        c1238l = c1238l.getURI();
        if (!c1238l.isAbsolute()) {
            return null;
        }
        C0159n b = C0029d.m111b(c1238l);
        if (b != null) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("URI does not specify a valid host name: ");
        stringBuilder.append(c1238l);
        throw new C0031f(stringBuilder.toString());
    }
}
