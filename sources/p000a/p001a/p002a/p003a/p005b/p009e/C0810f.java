package p000a.p001a.p002a.p003a.p005b.p009e;

import java.util.Collection;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestDefaultHeaders */
/* renamed from: a.a.a.a.b.e.f */
public class C0810f implements C0170r {
    /* renamed from: a */
    private final Collection<? extends C0082e> f1429a;

    public C0810f(Collection<? extends C0082e> collection) {
        this.f1429a = collection;
    }

    public C0810f() {
        this(null);
    }

    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        if (c0915q.getRequestLine().mo143a().equalsIgnoreCase("CONNECT") == null) {
            c0157e = (Collection) c0915q.getParams().mo1602a("http.default-headers");
            if (c0157e == null) {
                c0157e = this.f1429a;
            }
            if (r3 != null) {
                for (C0082e addHeader : r3) {
                    c0915q.addHeader(addHeader);
                }
            }
        }
    }
}
