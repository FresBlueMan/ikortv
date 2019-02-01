package p000a.p001a.p002a.p003a.p022i.p024b;

import com.loopj.android.http.HttpGet;
import java.net.URI;
import java.util.Locale;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p005b.C0038p;
import p000a.p001a.p002a.p003a.p005b.C1318e;
import p000a.p001a.p002a.p003a.p005b.p006a.C0013a;
import p000a.p001a.p002a.p003a.p005b.p007c.C0018m;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p005b.p007c.C1340f;
import p000a.p001a.p002a.p003a.p005b.p007c.C1341g;
import p000a.p001a.p002a.p003a.p005b.p009e.C1239a;
import p000a.p001a.p002a.p003a.p005b.p010f.C0028c;
import p000a.p001a.p002a.p003a.p005b.p010f.C0029d;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;
import p000a.p001a.p002a.p003a.p035o.C0167h;

/* compiled from: DefaultRedirectStrategy */
/* renamed from: a.a.a.a.i.b.n */
public class C0851n implements C0038p {
    /* renamed from: b */
    public static final C0851n f1509b = new C0851n();
    /* renamed from: c */
    private static final String[] f1510c = new String[]{HttpGet.METHOD_NAME, "HEAD"};
    /* renamed from: a */
    public C0097b f1511a = new C0097b(getClass());

    /* renamed from: a */
    public boolean mo57a(C0915q c0915q, C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0916s, "HTTP response");
        c0157e = c0916s.mo1628a().mo147b();
        c0915q = c0915q.getRequestLine().mo143a();
        c0916s = c0916s.getFirstHeader("location");
        if (c0157e != 307) {
            boolean z = true;
            switch (c0157e) {
                case 301:
                    break;
                case 302:
                    if (m1648b(c0915q) == null || c0916s == null) {
                        z = false;
                    }
                    return z;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return m1648b(c0915q);
    }

    /* renamed from: c */
    public URI m1649c(C0915q c0915q, C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        C0160a.m478a((Object) c0916s, "HTTP response");
        C0160a.m478a((Object) c0157e, "HTTP context");
        C1239a a = C1239a.m2524a(c0157e);
        C0082e firstHeader = c0916s.getFirstHeader("location");
        if (firstHeader != null) {
            c0916s = firstHeader.mo122d();
            if (this.f1511a.m262a()) {
                C0097b c0097b = this.f1511a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Redirect requested to location '");
                stringBuilder.append(c0916s);
                stringBuilder.append("'");
                c0097b.m260a(stringBuilder.toString());
            }
            C0013a k = a.m2537k();
            URI a2 = m1645a(c0916s);
            try {
                if (!a2.isAbsolute()) {
                    if (k.m58b()) {
                        Object o = a.m1918o();
                        C0161b.m484a(o, "Target host");
                        a2 = C0029d.m110a(C0029d.m109a(new URI(c0915q.getRequestLine().mo145c()), o, null), a2);
                    } else {
                        c0157e = new StringBuilder();
                        c0157e.append("Relative redirect location '");
                        c0157e.append(a2);
                        c0157e.append("' not allowed");
                        throw new ab(c0157e.toString());
                    }
                }
                c0915q = (C0111v) a.mo159a("http.protocol.redirect-locations");
                if (c0915q == null) {
                    c0915q = new C0111v();
                    c0157e.mo160a("http.protocol.redirect-locations", c0915q);
                }
                if (k.m59c() == null) {
                    if (c0915q.m318a(a2) != null) {
                        c0157e = new StringBuilder();
                        c0157e.append("Circular redirect to '");
                        c0157e.append(a2);
                        c0157e.append("'");
                        throw new C1318e(c0157e.toString());
                    }
                }
                c0915q.m320b(a2);
                return a2;
            } catch (C0915q c0915q2) {
                throw new ab(c0915q2.getMessage(), c0915q2);
            }
        }
        c0157e = new StringBuilder();
        c0157e.append("Received redirect response ");
        c0157e.append(c0916s.mo1628a());
        c0157e.append(" but no location header");
        throw new ab(c0157e.toString());
    }

    /* renamed from: a */
    protected URI m1645a(String str) {
        try {
            C0028c c0028c = new C0028c(new URI(str).normalize());
            String c = c0028c.m104c();
            if (c != null) {
                c0028c.m103c(c.toLowerCase(Locale.ENGLISH));
            }
            if (C0167h.m527a(c0028c.m106d())) {
                c0028c.m105d("/");
            }
            return c0028c.m100a();
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid redirect URI: ");
            stringBuilder.append(str);
            throw new ab(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    protected boolean m1648b(String str) {
        for (String equalsIgnoreCase : f1510c) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C1238l mo58b(C0915q c0915q, C0916s c0916s, C0157e c0157e) {
        URI c = m1649c(c0915q, c0916s, c0157e);
        String a = c0915q.getRequestLine().mo143a();
        if (a.equalsIgnoreCase("HEAD")) {
            return new C1341g(c);
        }
        if (a.equalsIgnoreCase(HttpGet.METHOD_NAME)) {
            return new C1340f(c);
        }
        if (c0916s.mo1628a().mo147b() == 307) {
            return C0018m.m69a(c0915q).m72a(c).m71a();
        }
        return new C1340f(c);
    }
}
