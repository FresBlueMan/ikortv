package p000a.p001a.p002a.p003a.p022i;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import p000a.p001a.p002a.p003a.C0914o;
import p000a.p001a.p002a.p003a.p022i.p029f.C1279n;
import p000a.p001a.p002a.p003a.p022i.p029f.C1280o;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: SocketHttpClientConnection */
/* renamed from: a.a.a.a.i.f */
public class C1331f extends C1260a implements C0914o {
    /* renamed from: a */
    private volatile boolean f2299a;
    /* renamed from: b */
    private volatile Socket f2300b = null;

    /* renamed from: q */
    protected void m2842q() {
        C0161b.m485a(this.f2299a ^ 1, "Connection is already open");
    }

    /* renamed from: j */
    protected void mo1937j() {
        C0161b.m485a(this.f2299a, "Connection is not open");
    }

    /* renamed from: a */
    protected C0140f mo2016a(Socket socket, int i, C0152e c0152e) {
        return new C1279n(socket, i, c0152e);
    }

    /* renamed from: b */
    protected C0141g mo2020b(Socket socket, int i, C0152e c0152e) {
        return new C1280o(socket, i, c0152e);
    }

    /* renamed from: a */
    protected void m2833a(Socket socket, C0152e c0152e) {
        C0160a.m478a((Object) socket, "Socket");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        this.f2300b = socket;
        int a = c0152e.mo151a("http.socket.buffer-size", -1);
        m2567a(mo2016a(socket, a, c0152e), (C0141g) mo2020b(socket, a, c0152e), c0152e);
        this.f2299a = true;
    }

    /* renamed from: c */
    public boolean mo1932c() {
        return this.f2299a;
    }

    /* renamed from: i */
    protected Socket mo2022i() {
        return this.f2300b;
    }

    /* renamed from: f */
    public InetAddress mo1935f() {
        return this.f2300b != null ? this.f2300b.getInetAddress() : null;
    }

    /* renamed from: g */
    public int mo1936g() {
        return this.f2300b != null ? this.f2300b.getPort() : -1;
    }

    /* renamed from: b */
    public void mo1931b(int r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r1 = this;
        r1.mo1937j();
        r0 = r1.f2300b;
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = r1.f2300b;	 Catch:{ SocketException -> 0x000c }
        r0.setSoTimeout(r2);	 Catch:{ SocketException -> 0x000c }
    L_0x000c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.f.b(int):void");
    }

    /* renamed from: e */
    public void mo1934e() {
        this.f2299a = false;
        Socket socket = this.f2300b;
        if (socket != null) {
            socket.close();
        }
    }

    public void close() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f2299a;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = 0;
        r2.f2299a = r0;
        r0 = r2.f2300b;
        r2.m2577o();	 Catch:{ all -> 0x0017 }
        r0.shutdownOutput();	 Catch:{ IOException -> 0x0010 }
    L_0x0010:
        r0.shutdownInput();	 Catch:{ UnsupportedOperationException -> 0x0013, UnsupportedOperationException -> 0x0013 }
    L_0x0013:
        r0.close();
        return;
    L_0x0017:
        r1 = move-exception;
        r0.close();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.f.close():void");
    }

    /* renamed from: a */
    private static void m2831a(StringBuilder stringBuilder, SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            Object hostAddress;
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            if (inetSocketAddress.getAddress() != null) {
                hostAddress = inetSocketAddress.getAddress().getHostAddress();
            } else {
                hostAddress = inetSocketAddress.getAddress();
            }
            stringBuilder.append(hostAddress);
            stringBuilder.append(':');
            stringBuilder.append(inetSocketAddress.getPort());
            return;
        }
        stringBuilder.append(socketAddress);
    }

    public String toString() {
        if (this.f2300b == null) {
            return super.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        SocketAddress remoteSocketAddress = this.f2300b.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.f2300b.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            C1331f.m2831a(stringBuilder, localSocketAddress);
            stringBuilder.append("<->");
            C1331f.m2831a(stringBuilder, remoteSocketAddress);
        }
        return stringBuilder.toString();
    }
}
