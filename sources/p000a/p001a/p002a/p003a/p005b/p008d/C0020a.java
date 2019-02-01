package p000a.p001a.p002a.p003a.p005b.p008d;

import java.net.InetAddress;
import java.util.Collection;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p005b.p006a.C0013a;
import p000a.p001a.p002a.p003a.p032l.C0152e;

@Deprecated
/* compiled from: HttpClientParamConfig */
/* renamed from: a.a.a.a.b.d.a */
public final class C0020a {
    /* renamed from: a */
    public static C0013a m78a(C0152e c0152e) {
        return C0013a.m56g().m52d(c0152e.mo151a("http.socket.timeout", 0)).m49b(c0152e.mo153a("http.connection.stalecheck", true)).m50c(c0152e.mo151a("http.connection.timeout", 0)).m45a(c0152e.mo153a("http.protocol.expect-continue", false)).m41a((C0159n) c0152e.mo1602a("http.route.default-proxy")).m43a((InetAddress) c0152e.mo1602a("http.route.local-address")).m48b((Collection) c0152e.mo1602a("http.auth.proxy-scheme-pref")).m44a((Collection) c0152e.mo1602a("http.auth.target-scheme-pref")).m55f(c0152e.mo153a("http.protocol.handle-authentication", true)).m54e(c0152e.mo153a("http.protocol.allow-circular-redirects", false)).m47b((int) c0152e.mo152a("http.conn-manager.timeout", 0)).m42a((String) c0152e.mo1602a("http.protocol.cookie-policy")).m40a(c0152e.mo151a("http.protocol.max-redirects", 50)).m51c(c0152e.mo153a("http.protocol.handle-redirects", true)).m53d(c0152e.mo153a("http.protocol.reject-relative-redirect", false) ^ 1).m46a();
    }
}
