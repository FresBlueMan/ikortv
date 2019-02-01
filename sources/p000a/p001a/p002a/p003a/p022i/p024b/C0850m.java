package p000a.p001a.p002a.p003a.p022i.p024b;

import com.loopj.android.http.HttpGet;
import java.net.URI;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p005b.C0037o;
import p000a.p001a.p002a.p003a.p005b.C1318e;
import p000a.p001a.p002a.p003a.p005b.p010f.C0029d;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: DefaultRedirectHandler */
/* renamed from: a.a.a.a.i.b.m */
public class C0850m implements C0037o {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public C0097b log = new C0097b(getClass());

    public boolean isRedirectRequested(C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0916s, "HTTP response");
        c0916s = c0916s.mo1628a().mo147b();
        boolean z = true;
        if (c0916s != 307) {
            switch (c0916s) {
                case 301:
                case 302:
                    break;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        c0916s = ((C0915q) c0157e.mo159a("http.request")).getRequestLine().mo143a();
        if (c0916s.equalsIgnoreCase(HttpGet.METHOD_NAME) == null) {
            if (c0916s.equalsIgnoreCase("HEAD") == null) {
                z = false;
            }
        }
        return z;
    }

    public URI getLocationURI(C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0916s, "HTTP response");
        C0082e firstHeader = c0916s.getFirstHeader("location");
        if (firstHeader != null) {
            String d = firstHeader.mo122d();
            if (this.log.m262a()) {
                C0097b c0097b = this.log;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Redirect requested to location '");
                stringBuilder.append(d);
                stringBuilder.append("'");
                c0097b.m260a(stringBuilder.toString());
            }
            try {
                URI uri = new URI(d);
                c0916s = c0916s.getParams();
                if (!uri.isAbsolute()) {
                    if (c0916s.mo157b("http.protocol.reject-relative-redirect")) {
                        c0157e = new StringBuilder();
                        c0157e.append("Relative redirect location '");
                        c0157e.append(uri);
                        c0157e.append("' not allowed");
                        throw new ab(c0157e.toString());
                    }
                    Object obj = (C0159n) c0157e.mo159a("http.target_host");
                    C0161b.m484a(obj, "Target host");
                    try {
                        uri = C0029d.m110a(C0029d.m109a(new URI(((C0915q) c0157e.mo159a("http.request")).getRequestLine().mo145c()), obj, true), uri);
                    } catch (C0916s c0916s2) {
                        throw new ab(c0916s2.getMessage(), c0916s2);
                    }
                }
                if (c0916s2.mo158c("http.protocol.allow-circular-redirects") != null) {
                    URI a;
                    c0916s2 = (C0111v) c0157e.mo159a(REDIRECT_LOCATIONS);
                    if (c0916s2 == null) {
                        c0916s2 = new C0111v();
                        c0157e.mo160a(REDIRECT_LOCATIONS, c0916s2);
                    }
                    if (uri.getFragment() != null) {
                        try {
                            a = C0029d.m109a(uri, new C0159n(uri.getHost(), uri.getPort(), uri.getScheme()), true);
                        } catch (C0916s c0916s22) {
                            throw new ab(c0916s22.getMessage(), c0916s22);
                        }
                    }
                    a = uri;
                    if (c0916s22.m318a(a)) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Circular redirect to '");
                        stringBuilder2.append(a);
                        stringBuilder2.append("'");
                        throw new C1318e(stringBuilder2.toString());
                    }
                    c0916s22.m320b(a);
                }
                return uri;
            } catch (C0916s c0916s222) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Invalid redirect URI: ");
                stringBuilder3.append(d);
                throw new ab(stringBuilder3.toString(), c0916s222);
            }
        }
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Received redirect response ");
        stringBuilder2.append(c0916s222.mo1628a());
        stringBuilder2.append(" but no location header");
        throw new ab(stringBuilder2.toString());
    }
}
