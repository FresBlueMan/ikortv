package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestClientConnControl */
/* renamed from: a.a.a.a.b.e.e */
public class C0809e implements C0170r {
    /* renamed from: a */
    public C0097b f1428a = new C0097b(getClass());

    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        if (c0915q.getRequestLine().mo143a().equalsIgnoreCase("CONNECT")) {
            c0915q.setHeader("Proxy-Connection", "Keep-Alive");
            return;
        }
        c0157e = C1239a.m2524a(c0157e).m2526a();
        if (c0157e == null) {
            this.f1428a.m260a("Connection route not set in the context");
            return;
        }
        if ((c0157e.mo13c() == 1 || c0157e.mo15e()) && !c0915q.containsHeader("Connection")) {
            c0915q.addHeader("Connection", "Keep-Alive");
        }
        if (c0157e.mo13c() == 2 && c0157e.mo15e() == null && c0915q.containsHeader("Proxy-Connection") == null) {
            c0915q.addHeader("Proxy-Connection", "Keep-Alive");
        }
    }
}
