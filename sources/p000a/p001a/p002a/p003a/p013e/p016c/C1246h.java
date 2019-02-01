package p000a.p001a.p002a.p003a.p013e.p016c;

import java.net.InetSocketAddress;
import java.net.Socket;
import p000a.p001a.p002a.p003a.p032l.C0152e;

@Deprecated
/* compiled from: SchemeLayeredSocketFactoryAdaptor2 */
/* renamed from: a.a.a.a.e.c.h */
class C1246h implements C0822f {
    /* renamed from: a */
    private final C0819b f2131a;

    C1246h(C0819b c0819b) {
        this.f2131a = c0819b;
    }

    public Socket createSocket(C0152e c0152e) {
        return this.f2131a.createSocket(c0152e);
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C0152e c0152e) {
        return this.f2131a.connectSocket(socket, inetSocketAddress, inetSocketAddress2, c0152e);
    }

    public boolean isSecure(Socket socket) {
        return this.f2131a.isSecure(socket);
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, C0152e c0152e) {
        return this.f2131a.createLayeredSocket(socket, str, i, true);
    }
}
