package p000a.p001a.p002a.p003a.p013e.p016c;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import p000a.p001a.p002a.p003a.p032l.C0152e;

@Deprecated
/* compiled from: PlainSocketFactory */
/* renamed from: a.a.a.a.e.c.d */
public class C0821d implements C0059j, C0060l {
    /* renamed from: a */
    private final C0056a f1447a = null;

    public final boolean isSecure(Socket socket) {
        return false;
    }

    /* renamed from: a */
    public static C0821d m1526a() {
        return new C0821d();
    }

    public Socket createSocket(C0152e c0152e) {
        return new Socket();
    }

    public Socket createSocket() {
        return new Socket();
    }

    public java.net.Socket connectSocket(java.net.Socket r2, java.net.InetSocketAddress r3, java.net.InetSocketAddress r4, p000a.p001a.p002a.p003a.p032l.C0152e r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = "Remote address";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r3, r0);
        r0 = "HTTP parameters";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r5, r0);
        if (r2 != 0) goto L_0x0010;
    L_0x000c:
        r2 = r1.createSocket();
    L_0x0010:
        if (r4 == 0) goto L_0x001c;
    L_0x0012:
        r0 = p000a.p001a.p002a.p003a.p032l.C0150c.m432b(r5);
        r2.setReuseAddress(r0);
        r2.bind(r4);
    L_0x001c:
        r4 = p000a.p001a.p002a.p003a.p032l.C0150c.m436e(r5);
        r5 = p000a.p001a.p002a.p003a.p032l.C0150c.m428a(r5);
        r2.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x002b }
        r2.connect(r3, r4);	 Catch:{ SocketTimeoutException -> 0x002b }
        return r2;
    L_0x002b:
        r2 = new a.a.a.a.e.f;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Connect to ";
        r4.append(r5);
        r4.append(r3);
        r3 = " timed out";
        r4.append(r3);
        r3 = r4.toString();
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.e.c.d.connectSocket(java.net.Socket, java.net.InetSocketAddress, java.net.InetSocketAddress, a.a.a.a.l.e):java.net.Socket");
    }

    @Deprecated
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, C0152e c0152e) {
        if (inetAddress == null) {
            if (i2 <= 0) {
                inetAddress = null;
                if (this.f1447a == 0) {
                    str = this.f1447a.m170a(str);
                } else {
                    str = InetAddress.getByName(str);
                }
                return connectSocket(socket, new InetSocketAddress(str, i), inetAddress, c0152e);
            }
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        inetAddress = new InetSocketAddress(inetAddress, i2);
        if (this.f1447a == 0) {
            str = InetAddress.getByName(str);
        } else {
            str = this.f1447a.m170a(str);
        }
        return connectSocket(socket, new InetSocketAddress(str, i), inetAddress, c0152e);
    }
}
