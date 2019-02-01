package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: RequestTargetAuthentication */
/* renamed from: a.a.a.a.b.e.h */
public class C1241h extends C0808d {
    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0157e, "HTTP context");
        if (!c0915q.getRequestLine().mo143a().equalsIgnoreCase("CONNECT") && !c0915q.containsHeader("Authorization")) {
            C0006h c0006h = (C0006h) c0157e.mo159a("http.auth.target-scope");
            if (c0006h == null) {
                this.a.m260a("Target auth state not set in the context");
                return;
            }
            if (this.a.m262a()) {
                C0097b c0097b = this.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Target auth state: ");
                stringBuilder.append(c0006h.m17b());
                c0097b.m260a(stringBuilder.toString());
            }
            m1490a(c0006h, c0915q, c0157e);
        }
    }
}
