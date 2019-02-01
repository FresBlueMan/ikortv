package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.OutputStream;
import java.net.Socket;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: SocketOutputBuffer */
/* renamed from: a.a.a.a.i.f.o */
public class C1280o extends C0890d {
    public C1280o(Socket socket, int i, C0152e c0152e) {
        C0160a.m478a((Object) socket, "Socket");
        if (i < 0) {
            i = socket.getSendBufferSize();
        }
        if (i < 1024) {
            i = 1024;
        }
        m1827a((OutputStream) socket.getOutputStream(), i, c0152e);
    }
}
