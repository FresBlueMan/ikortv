package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.InputStream;
import java.net.Socket;
import p000a.p001a.p002a.p003a.p030j.C0136b;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: SocketInputBuffer */
/* renamed from: a.a.a.a.i.f.n */
public class C1279n extends C0889c implements C0136b {
    /* renamed from: a */
    private final Socket f2188a;
    /* renamed from: b */
    private boolean f2189b = false;

    public C1279n(Socket socket, int i, C0152e c0152e) {
        C0160a.m478a((Object) socket, "Socket");
        this.f2188a = socket;
        if (i < 0) {
            i = socket.getReceiveBufferSize();
        }
        if (i < 1024) {
            i = 1024;
        }
        m1816a((InputStream) socket.getInputStream(), i, c0152e);
    }

    /* renamed from: f */
    protected int mo1625f() {
        int f = super.mo1625f();
        this.f2189b = f == -1;
        return f;
    }

    /* renamed from: a */
    public boolean mo81a(int i) {
        boolean g = m1821g();
        if (g) {
            return g;
        }
        int soTimeout = this.f2188a.getSoTimeout();
        try {
            this.f2188a.setSoTimeout(i);
            mo1625f();
            i = m1821g();
            return i;
        } finally {
            this.f2188a.setSoTimeout(soTimeout);
        }
    }

    /* renamed from: c */
    public boolean mo83c() {
        return this.f2189b;
    }
}
