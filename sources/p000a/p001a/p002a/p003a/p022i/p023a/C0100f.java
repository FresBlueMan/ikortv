package p000a.p001a.p002a.p003a.p022i.p023a;

import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p004a.C0001b;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p005b.C0019c;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;

/* compiled from: HttpAuthenticator */
/* renamed from: a.a.a.a.i.a.f */
public class C0100f {
    /* renamed from: a */
    public C0097b f167a;

    public C0100f(C0097b c0097b) {
        if (c0097b == null) {
            c0097b = new C0097b(getClass());
        }
        this.f167a = c0097b;
    }

    public C0100f() {
        this(null);
    }

    /* renamed from: a */
    public boolean m272a(C0159n c0159n, C0916s c0916s, C0019c c0019c, C0006h c0006h, C0157e c0157e) {
        if (c0019c.mo42a(c0159n, c0916s, c0157e) != null) {
            this.f167a.m260a("Authentication required");
            if (c0006h.m17b() == C0001b.SUCCESS) {
                c0019c.mo44b(c0159n, c0006h.m18c(), c0157e);
            }
            return true;
        }
        switch (c0006h.m17b()) {
            case CHALLENGED:
            case HANDSHAKE:
                this.f167a.m260a("Authentication succeeded");
                c0006h.m12a(C0001b.SUCCESS);
                c0019c.mo41a(c0159n, c0006h.m18c(), c0157e);
                break;
            case SUCCESS:
                break;
            default:
                c0006h.m12a(C0001b.UNCHALLENGED);
                break;
        }
        return null;
    }

    /* renamed from: b */
    public boolean m273b(C0159n c0159n, C0916s c0916s, C0019c c0019c, C0006h c0006h, C0157e c0157e) {
        try {
            if (this.f167a.m262a()) {
                C0097b c0097b = this.f167a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c0159n.m474e());
                stringBuilder.append(" requested authentication");
                c0097b.m260a(stringBuilder.toString());
            }
            Map b = c0019c.mo43b(c0159n, c0916s, c0157e);
            if (b.isEmpty()) {
                this.f167a.m260a("Response contains no authentication challenges");
                return false;
            }
            C0002c c = c0006h.m18c();
            switch (c0006h.m17b()) {
                case CHALLENGED:
                case HANDSHAKE:
                    if (c == null) {
                        this.f167a.m260a("Auth scheme is null");
                        c0019c.mo44b(c0159n, (C0002c) null, c0157e);
                        c0006h.m11a();
                        c0006h.m12a(C0001b.FAILURE);
                        return false;
                    }
                    break;
                case SUCCESS:
                    c0006h.m11a();
                    break;
                case FAILURE:
                    return false;
                case UNCHALLENGED:
                    break;
                default:
                    break;
            }
            if (c != null) {
                C0082e c0082e = (C0082e) b.get(c.mo1918a().toLowerCase(Locale.ENGLISH));
                if (c0082e != null) {
                    this.f167a.m260a("Authorization challenge processed");
                    c.mo1592a(c0082e);
                    if (c.mo1922d() != null) {
                        this.f167a.m260a("Authentication failed");
                        c0019c.mo44b(c0159n, c0006h.m18c(), c0157e);
                        c0006h.m11a();
                        c0006h.m12a(C0001b.FAILURE);
                        return false;
                    }
                    c0006h.m12a(C0001b.HANDSHAKE);
                    return true;
                }
                c0006h.m11a();
            }
            Queue a = c0019c.mo40a(b, c0159n, c0916s, c0157e);
            if (a == null || a.isEmpty() != null) {
                return false;
            }
            if (this.f167a.m262a() != null) {
                c0916s = this.f167a;
                c0019c = new StringBuilder();
                c0019c.append("Selected authentication options: ");
                c0019c.append(a);
                c0916s.m260a(c0019c.toString());
            }
            c0006h.m12a(C0001b.CHALLENGED);
            c0006h.m16a(a);
            return true;
        } catch (C0159n c0159n2) {
            if (this.f167a.m268c() != null) {
                c0916s = this.f167a;
                c0019c = new StringBuilder();
                c0019c.append("Malformed challenge: ");
                c0019c.append(c0159n2.getMessage());
                c0916s.m266c(c0019c.toString());
            }
            c0006h.m11a();
            return false;
        }
    }
}
