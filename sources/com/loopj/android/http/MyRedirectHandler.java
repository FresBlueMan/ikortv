package com.loopj.android.http;

import java.net.URI;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p005b.C1318e;
import p000a.p001a.p002a.p003a.p005b.p010f.C0029d;
import p000a.p001a.p002a.p003a.p022i.p024b.C0111v;
import p000a.p001a.p002a.p003a.p022i.p024b.C0850m;
import p000a.p001a.p002a.p003a.p034n.C0157e;

class MyRedirectHandler extends C0850m {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private final boolean enableRedirects;

    public MyRedirectHandler(boolean z) {
        this.enableRedirects = z;
    }

    public boolean isRedirectRequested(C0916s c0916s, C0157e c0157e) {
        if (this.enableRedirects == null) {
            return false;
        }
        if (c0916s != null) {
            c0916s = c0916s.mo1628a().mo147b();
            if (c0916s != 307) {
                switch (c0916s) {
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    public URI getLocationURI(C0916s c0916s, C0157e c0157e) {
        if (c0916s != null) {
            C0082e firstHeader = c0916s.getFirstHeader("location");
            StringBuilder stringBuilder;
            if (firstHeader != null) {
                String replaceAll = firstHeader.mo122d().replaceAll(" ", "%20");
                try {
                    URI uri = new URI(replaceAll);
                    c0916s = c0916s.getParams();
                    if (!uri.isAbsolute()) {
                        if (c0916s.mo157b("http.protocol.reject-relative-redirect")) {
                            c0157e = new StringBuilder();
                            c0157e.append("Relative redirect location '");
                            c0157e.append(uri);
                            c0157e.append("' not allowed");
                            throw new ab(c0157e.toString());
                        }
                        C0159n c0159n = (C0159n) c0157e.mo159a("http.target_host");
                        if (c0159n != null) {
                            try {
                                uri = C0029d.m110a(C0029d.m109a(new URI(((C0915q) c0157e.mo159a("http.request")).getRequestLine().mo145c()), c0159n, true), uri);
                            } catch (C0916s c0916s2) {
                                throw new ab(c0916s2.getMessage(), c0916s2);
                            }
                        }
                        throw new IllegalStateException("Target host not available in the HTTP context");
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
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Circular redirect to '");
                            stringBuilder.append(a);
                            stringBuilder.append("'");
                            throw new C1318e(stringBuilder.toString());
                        }
                        c0916s22.m320b(a);
                    }
                    return uri;
                } catch (C0916s c0916s222) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Invalid redirect URI: ");
                    stringBuilder2.append(replaceAll);
                    throw new ab(stringBuilder2.toString(), c0916s222);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Received redirect response ");
            stringBuilder.append(c0916s222.mo1628a());
            stringBuilder.append(" but no location header");
            throw new ab(stringBuilder.toString());
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
