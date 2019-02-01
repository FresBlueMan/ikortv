package p000a.p001a.p002a.p003a.p034n;

import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestUserAgent */
/* renamed from: a.a.a.a.n.m */
public class C0913m implements C0170r {
    /* renamed from: a */
    private final String f1694a;

    public C0913m(String str) {
        this.f1694a = str;
    }

    public C0913m() {
        this(null);
    }

    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        if (c0915q.containsHeader("User-Agent") == null) {
            c0157e = null;
            C0152e params = c0915q.getParams();
            if (params != null) {
                c0157e = (String) params.mo1602a("http.useragent");
            }
            if (c0157e == null) {
                c0157e = this.f1694a;
            }
            if (c0157e != null) {
                c0915q.addHeader("User-Agent", c0157e);
            }
        }
    }
}
