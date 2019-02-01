package p000a.p001a.p002a.p003a.p013e.p016c;

import java.net.Socket;
import p000a.p001a.p002a.p003a.p032l.C0152e;

@Deprecated
/* compiled from: SchemeLayeredSocketFactoryAdaptor */
/* renamed from: a.a.a.a.e.c.g */
class C1245g extends C0823k implements C0822f {
    /* renamed from: a */
    private final C0820c f2130a;

    C1245g(C0820c c0820c) {
        super(c0820c);
        this.f2130a = c0820c;
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, C0152e c0152e) {
        return this.f2130a.createSocket(socket, str, i, true);
    }
}
