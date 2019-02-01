package p000a.p001a.p002a.p003a.p034n;

import java.net.InetAddress;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0914o;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestTargetHost */
/* renamed from: a.a.a.a.n.l */
public class C0912l implements C0170r {
    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        c0157e = C0908f.m1911b(c0157e);
        ac b = c0915q.getRequestLine().mo144b();
        if (!((c0915q.getRequestLine().mo143a().equalsIgnoreCase("CONNECT") && b.m31c(C0917v.f1696b)) || c0915q.containsHeader("Host"))) {
            C0159n o = c0157e.m1918o();
            if (o == null) {
                c0157e = c0157e.m1915l();
                if (c0157e instanceof C0914o) {
                    C0914o c0914o = (C0914o) c0157e;
                    InetAddress f = c0914o.mo1935f();
                    c0157e = c0914o.mo1936g();
                    if (f != null) {
                        o = new C0159n(f.getHostName(), c0157e);
                    }
                }
                if (o == null) {
                    if (b.m31c(C0917v.f1696b) == null) {
                        throw new ab("Target host missing");
                    }
                    return;
                }
            }
            c0915q.addHeader("Host", o.m474e());
        }
    }
}
