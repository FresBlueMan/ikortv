package p000a.p001a.p002a.p003a.p013e.p016c;

import java.net.InetAddress;
import java.net.Socket;
import p000a.p001a.p002a.p003a.p032l.C0152e;

@Deprecated
/* compiled from: SocketFactory */
/* renamed from: a.a.a.a.e.c.l */
public interface C0060l {
    Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, C0152e c0152e);

    Socket createSocket();

    boolean isSecure(Socket socket);
}
