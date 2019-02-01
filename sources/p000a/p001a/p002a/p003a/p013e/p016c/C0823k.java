package p000a.p001a.p002a.p003a.p013e.p016c;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import p000a.p001a.p002a.p003a.p032l.C0152e;

@Deprecated
/* compiled from: SchemeSocketFactoryAdaptor */
/* renamed from: a.a.a.a.e.c.k */
class C0823k implements C0059j {
    /* renamed from: a */
    private final C0060l f1448a;

    C0823k(C0060l c0060l) {
        this.f1448a = c0060l;
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C0152e c0152e) {
        InetAddress address;
        int port;
        String hostName = inetSocketAddress.getHostName();
        int port2 = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            address = inetSocketAddress2.getAddress();
            port = inetSocketAddress2.getPort();
        } else {
            address = null;
            port = 0;
        }
        return this.f1448a.connectSocket(socket, hostName, port2, address, port, c0152e);
    }

    public Socket createSocket(C0152e c0152e) {
        return this.f1448a.createSocket();
    }

    public boolean isSecure(Socket socket) {
        return this.f1448a.isSecure(socket);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0823k) {
            return this.f1448a.equals(((C0823k) obj).f1448a);
        }
        return this.f1448a.equals(obj);
    }

    public int hashCode() {
        return this.f1448a.hashCode();
    }
}
