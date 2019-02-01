package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p013e.C1251n;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: RequestProxyAuthentication */
/* renamed from: a.a.a.a.b.e.g */
public class C1240g extends C0808d {
    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0157e, "HTTP context");
        if (!c0915q.containsHeader("Proxy-Authorization")) {
            C1251n c1251n = (C1251n) c0157e.mo159a("http.connection");
            if (c1251n == null) {
                this.a.m260a("HTTP connection not set in the context");
            } else if (!c1251n.mo1916h().mo15e()) {
                C0006h c0006h = (C0006h) c0157e.mo159a("http.auth.proxy-scope");
                if (c0006h == null) {
                    this.a.m260a("Proxy auth state not set in the context");
                    return;
                }
                if (this.a.m262a()) {
                    C0097b c0097b = this.a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Proxy auth state: ");
                    stringBuilder.append(c0006h.m17b());
                    c0097b.m260a(stringBuilder.toString());
                }
                m1490a(c0006h, c0915q, c0157e);
            }
        }
    }
}
