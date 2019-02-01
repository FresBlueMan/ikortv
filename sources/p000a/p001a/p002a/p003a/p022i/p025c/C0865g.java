package p000a.p001a.p002a.p003a.p022i.p025c;

import java.net.InetAddress;
import java.net.Socket;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C0077j;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.p016c.C0057e;
import p000a.p001a.p002a.p003a.p013e.p016c.C0058i;
import p000a.p001a.p002a.p003a.p013e.p016c.C0822f;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p032l.C0150c;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: DefaultClientConnectionOperator */
/* renamed from: a.a.a.a.i.c.g */
public class C0865g implements C0071d {
    /* renamed from: a */
    public C0097b f1580a = new C0097b(getClass());
    /* renamed from: b */
    protected final C0058i f1581b;
    /* renamed from: c */
    protected final C0077j f1582c;

    public C0865g(C0058i c0058i) {
        C0160a.m478a((Object) c0058i, "Scheme registry");
        this.f1581b = c0058i;
        this.f1582c = new C0871q();
    }

    /* renamed from: a */
    public C1253q mo72a() {
        return new C1347f();
    }

    /* renamed from: a */
    private C0058i m1716a(C0157e c0157e) {
        C0058i c0058i = (C0058i) c0157e.mo159a("http.scheme-registry");
        return c0058i == null ? this.f1581b : c0058i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo74a(p000a.p001a.p002a.p003a.p013e.C1253q r17, p000a.p001a.p002a.p003a.C0159n r18, java.net.InetAddress r19, p000a.p001a.p002a.p003a.p034n.C0157e r20, p000a.p001a.p002a.p003a.p032l.C0152e r21) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r21;
        r0 = "Connection";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r2, r0);
        r0 = "Target host";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r3, r0);
        r0 = "HTTP parameters";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r6, r0);
        r0 = r17.mo1932c();
        r7 = 1;
        r0 = r0 ^ r7;
        r8 = "Connection must not be open";
        p000a.p001a.p002a.p003a.p035o.C0161b.m485a(r0, r8);
        r0 = r1.m1716a(r5);
        r8 = r18.m472c();
        r0 = r0.m178a(r8);
        r8 = r0.m173b();
        r9 = r18.m470a();
        r9 = r1.m1721a(r9);
        r10 = r18.m471b();
        r10 = r0.m172a(r10);
        r11 = 0;
        r12 = 0;
    L_0x0048:
        r0 = r9.length;
        if (r12 >= r0) goto L_0x00d4;
    L_0x004b:
        r0 = r9[r12];
        r13 = r9.length;
        r13 = r13 - r7;
        if (r12 != r13) goto L_0x0053;
    L_0x0051:
        r13 = 1;
        goto L_0x0054;
    L_0x0053:
        r13 = 0;
    L_0x0054:
        r14 = r8.createSocket(r6);
        r2.mo2017a(r14, r3);
        r15 = new a.a.a.a.e.m;
        r15.<init>(r3, r0, r10);
        r0 = 0;
        if (r4 == 0) goto L_0x0068;
    L_0x0063:
        r0 = new java.net.InetSocketAddress;
        r0.<init>(r4, r11);
    L_0x0068:
        r7 = r1.f1580a;
        r7 = r7.m262a();
        if (r7 == 0) goto L_0x0086;
    L_0x0070:
        r7 = r1.f1580a;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r4 = "Connecting to ";
        r11.append(r4);
        r11.append(r15);
        r4 = r11.toString();
        r7.m260a(r4);
    L_0x0086:
        r0 = r8.connectSocket(r14, r15, r0, r6);	 Catch:{ ConnectException -> 0x00a0, f -> 0x009b }
        if (r14 == r0) goto L_0x0090;
    L_0x008c:
        r2.mo2017a(r0, r3);	 Catch:{ ConnectException -> 0x00a0, f -> 0x009b }
        r14 = r0;
    L_0x0090:
        r1.m1720a(r14, r5, r6);	 Catch:{ ConnectException -> 0x00a0, f -> 0x009b }
        r0 = r8.isSecure(r14);	 Catch:{ ConnectException -> 0x00a0, f -> 0x009b }
        r2.mo2019a(r0, r6);	 Catch:{ ConnectException -> 0x00a0, f -> 0x009b }
        return;
    L_0x009b:
        r0 = move-exception;
        if (r13 != 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00a3;
    L_0x009f:
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        if (r13 != 0) goto L_0x00d3;
    L_0x00a3:
        r0 = r1.f1580a;
        r0 = r0.m262a();
        if (r0 == 0) goto L_0x00cb;
    L_0x00ab:
        r0 = r1.f1580a;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r7 = "Connect to ";
        r4.append(r7);
        r4.append(r15);
        r7 = " timed out. ";
        r4.append(r7);
        r7 = "Connection will be retried using another IP address";
        r4.append(r7);
        r4 = r4.toString();
        r0.m260a(r4);
    L_0x00cb:
        r12 = r12 + 1;
        r4 = r19;
        r7 = 1;
        r11 = 0;
        goto L_0x0048;
    L_0x00d3:
        throw r0;
    L_0x00d4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.c.g.a(a.a.a.a.e.q, a.a.a.a.n, java.net.InetAddress, a.a.a.a.n.e, a.a.a.a.l.e):void");
    }

    /* renamed from: a */
    public void mo73a(C1253q c1253q, C0159n c0159n, C0157e c0157e, C0152e c0152e) {
        C0160a.m478a((Object) c1253q, "Connection");
        C0160a.m478a((Object) c0159n, "Target host");
        C0160a.m478a((Object) c0152e, "Parameters");
        C0161b.m485a(c1253q.mo1932c(), "Connection must be open");
        C0057e a = m1716a(c0157e).m178a(c0159n.m472c());
        C0161b.m485a(a.m173b() instanceof C0822f, "Socket factory must implement SchemeLayeredSocketFactory");
        C0822f c0822f = (C0822f) a.m173b();
        Socket createLayeredSocket = c0822f.createLayeredSocket(c1253q.mo2022i(), c0159n.m470a(), a.m172a(c0159n.m471b()), c0152e);
        m1720a(createLayeredSocket, c0157e, c0152e);
        c1253q.mo2018a(createLayeredSocket, c0159n, c0822f.isSecure(createLayeredSocket), c0152e);
    }

    /* renamed from: a */
    protected void m1720a(Socket socket, C0157e c0157e, C0152e c0152e) {
        socket.setTcpNoDelay(C0150c.m434c(c0152e));
        socket.setSoTimeout(C0150c.m428a(c0152e));
        c0157e = C0150c.m435d(c0152e);
        if (c0157e >= null) {
            socket.setSoLinger(c0157e > null ? true : null, c0157e);
        }
    }

    /* renamed from: a */
    protected InetAddress[] m1721a(String str) {
        return this.f1582c.mo90a(str);
    }
}
