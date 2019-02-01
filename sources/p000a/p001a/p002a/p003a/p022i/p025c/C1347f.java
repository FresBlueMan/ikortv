package p000a.p001a.p002a.p003a.p022i.p025c;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0171t;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p013e.C1252p;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p022i.C1331f;
import p000a.p001a.p002a.p003a.p030j.C0137c;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p032l.C0153f;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: DefaultClientConnection */
/* renamed from: a.a.a.a.i.c.f */
public class C1347f extends C1331f implements C1252p, C1253q, C0157e {
    /* renamed from: a */
    public C0097b f2340a = new C0097b(getClass());
    /* renamed from: b */
    public C0097b f2341b = new C0097b("cz.msebera.android.httpclient.headers");
    /* renamed from: c */
    public C0097b f2342c = new C0097b("cz.msebera.android.httpclient.wire");
    /* renamed from: d */
    private volatile Socket f2343d;
    /* renamed from: e */
    private C0159n f2344e;
    /* renamed from: f */
    private boolean f2345f;
    /* renamed from: g */
    private volatile boolean f2346g;
    /* renamed from: h */
    private final Map<String, Object> f2347h = new HashMap();

    /* renamed from: h */
    public final boolean mo2021h() {
        return this.f2345f;
    }

    /* renamed from: i */
    public final Socket mo2022i() {
        return this.f2343d;
    }

    /* renamed from: k */
    public SSLSession mo2014k() {
        return this.f2343d instanceof SSLSocket ? ((SSLSocket) this.f2343d).getSession() : null;
    }

    /* renamed from: a */
    public void mo2017a(Socket socket, C0159n c0159n) {
        m2842q();
        this.f2343d = socket;
        this.f2344e = c0159n;
        if (this.f2346g != null) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    /* renamed from: a */
    public void mo2019a(boolean z, C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "Parameters");
        m2842q();
        this.f2345f = z;
        m2833a((Socket) this.f2343d, c0152e);
    }

    /* renamed from: e */
    public void mo1934e() {
        this.f2346g = true;
        try {
            super.mo1934e();
            if (this.f2340a.m262a()) {
                C0097b c0097b = this.f2340a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Connection ");
                stringBuilder.append(this);
                stringBuilder.append(" shut down");
                c0097b.m260a(stringBuilder.toString());
            }
            Socket socket = this.f2343d;
            if (socket != null) {
                socket.close();
            }
        } catch (Throwable e) {
            this.f2340a.m261a("I/O error shutting down connection", e);
        }
    }

    public void close() {
        try {
            super.close();
            if (this.f2340a.m262a()) {
                C0097b c0097b = this.f2340a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Connection ");
                stringBuilder.append(this);
                stringBuilder.append(" closed");
                c0097b.m260a(stringBuilder.toString());
            }
        } catch (Throwable e) {
            this.f2340a.m261a("I/O error closing connection", e);
        }
    }

    /* renamed from: a */
    protected C0140f mo2016a(Socket socket, int i, C0152e c0152e) {
        if (i <= 0) {
            i = 8192;
        }
        socket = super.mo2016a(socket, i, c0152e);
        return this.f2342c.m262a() != 0 ? new C0869m(socket, new C0122r(this.f2342c), C0153f.m449a(c0152e)) : socket;
    }

    /* renamed from: b */
    protected C0141g mo2020b(Socket socket, int i, C0152e c0152e) {
        if (i <= 0) {
            i = 8192;
        }
        socket = super.mo2020b(socket, i, c0152e);
        return this.f2342c.m262a() != 0 ? new C0870n(socket, new C0122r(this.f2342c), C0153f.m449a(c0152e)) : socket;
    }

    /* renamed from: a */
    protected C0137c<C0916s> mo2015a(C0140f c0140f, C0171t c0171t, C0152e c0152e) {
        return new C1266h(c0140f, null, c0171t, c0152e);
    }

    /* renamed from: a */
    public void mo2018a(Socket socket, C0159n c0159n, boolean z, C0152e c0152e) {
        mo1937j();
        C0160a.m478a((Object) c0159n, "Target host");
        C0160a.m478a((Object) c0152e, "Parameters");
        if (socket != null) {
            this.f2343d = socket;
            m2833a(socket, c0152e);
        }
        this.f2344e = c0159n;
        this.f2345f = z;
    }

    /* renamed from: a */
    public C0916s mo1593a() {
        C0916s a = super.mo1593a();
        if (this.f2340a.m262a()) {
            C0097b c0097b = this.f2340a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Receiving response: ");
            stringBuilder.append(a.mo1628a());
            c0097b.m260a(stringBuilder.toString());
        }
        if (this.f2341b.m262a()) {
            c0097b = this.f2341b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("<< ");
            stringBuilder.append(a.mo1628a().toString());
            c0097b.m260a(stringBuilder.toString());
            for (Object obj : a.getAllHeaders()) {
                C0097b c0097b2 = this.f2341b;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("<< ");
                stringBuilder2.append(obj.toString());
                c0097b2.m260a(stringBuilder2.toString());
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo1595a(C0915q c0915q) {
        if (this.f2340a.m262a()) {
            C0097b c0097b = this.f2340a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sending request: ");
            stringBuilder.append(c0915q.getRequestLine());
            c0097b.m260a(stringBuilder.toString());
        }
        super.mo1595a(c0915q);
        if (this.f2341b.m262a()) {
            c0097b = this.f2341b;
            stringBuilder = new StringBuilder();
            stringBuilder.append(">> ");
            stringBuilder.append(c0915q.getRequestLine().toString());
            c0097b.m260a(stringBuilder.toString());
            for (Object obj : c0915q.getAllHeaders()) {
                C0097b c0097b2 = this.f2341b;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(">> ");
                stringBuilder2.append(obj.toString());
                c0097b2.m260a(stringBuilder2.toString());
            }
        }
    }

    /* renamed from: a */
    public Object mo159a(String str) {
        return this.f2347h.get(str);
    }

    /* renamed from: a */
    public void mo160a(String str, Object obj) {
        this.f2347h.put(str, obj);
    }
}
