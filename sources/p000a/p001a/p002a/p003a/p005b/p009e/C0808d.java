package p000a.p001a.p002a.p003a.p005b.p009e;

import java.util.Queue;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0000a;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p004a.C0801l;
import p000a.p001a.p002a.p003a.p004a.C1234i;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: RequestAuthenticationBase */
/* renamed from: a.a.a.a.b.e.d */
abstract class C0808d implements C0170r {
    /* renamed from: a */
    final C0097b f1427a = new C0097b(getClass());

    /* renamed from: a */
    void m1490a(C0006h c0006h, C0915q c0915q, C0157e c0157e) {
        C0002c c = c0006h.m18c();
        C0009m d = c0006h.m19d();
        switch (c0006h.m17b()) {
            case FAILURE:
                return;
            case SUCCESS:
                m1489a(c);
                if (c.mo1921c() != null) {
                    return;
                }
                break;
            case CHALLENGED:
                Queue e = c0006h.m20e();
                if (e == null) {
                    m1489a(c);
                    break;
                }
                while (!e.isEmpty()) {
                    C0097b c0097b;
                    StringBuilder stringBuilder;
                    C0000a c0000a = (C0000a) e.remove();
                    C0002c a = c0000a.m0a();
                    C0009m b = c0000a.m1b();
                    c0006h.m14a(a, b);
                    if (this.f1427a.m262a()) {
                        c0097b = this.f1427a;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Generating response to an authentication challenge using ");
                        stringBuilder.append(a.mo1918a());
                        stringBuilder.append(" scheme");
                        c0097b.m260a(stringBuilder.toString());
                    }
                    try {
                        c0915q.addHeader(m1488a(a, b, c0915q, c0157e));
                        return;
                    } catch (C1234i e2) {
                        if (this.f1427a.m268c()) {
                            c0097b = this.f1427a;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(a);
                            stringBuilder.append(" authentication error: ");
                            stringBuilder.append(e2.getMessage());
                            c0097b.m266c(stringBuilder.toString());
                        }
                    }
                }
                return;
            default:
                break;
        }
        if (c != null) {
            try {
                c0915q.addHeader(m1488a(c, d, c0915q, c0157e));
            } catch (C0006h c0006h2) {
                if (this.f1427a.m265b() != null) {
                    c0915q = this.f1427a;
                    c0157e = new StringBuilder();
                    c0157e.append(c);
                    c0157e.append(" authentication error: ");
                    c0157e.append(c0006h2.getMessage());
                    c0915q.m263b(c0157e.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m1489a(C0002c c0002c) {
        C0161b.m484a((Object) c0002c, "Auth scheme");
    }

    /* renamed from: a */
    private C0082e m1488a(C0002c c0002c, C0009m c0009m, C0915q c0915q, C0157e c0157e) {
        C0161b.m484a((Object) c0002c, "Auth scheme");
        if (c0002c instanceof C0801l) {
            return ((C0801l) c0002c).mo1591a(c0009m, c0915q, c0157e);
        }
        return c0002c.mo1917a(c0009m, c0915q);
    }
}
