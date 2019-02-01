package p000a.p001a.p002a.p003a.p013e.p017d;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.C0079m;
import p000a.p001a.p002a.p003a.p013e.p016c.C0056a;
import p000a.p001a.p002a.p003a.p013e.p016c.C0819b;
import p000a.p001a.p002a.p003a.p013e.p016c.C0820c;
import p000a.p001a.p002a.p003a.p013e.p016c.C0822f;
import p000a.p001a.p002a.p003a.p032l.C0150c;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;
import p000a.p001a.p002a.p003a.p035o.C0167h;

@Deprecated
/* compiled from: SSLSocketFactory */
/* renamed from: a.a.a.a.e.d.i */
public class C1249i implements C0819b, C0820c, C0822f {
    public static final C0070l ALLOW_ALL_HOSTNAME_VERIFIER = new C1247b();
    public static final C0070l BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new C1248c();
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final C0070l STRICT_HOSTNAME_VERIFIER = new C1250j();
    public static final String TLS = "TLS";
    private volatile C0070l hostnameVerifier;
    private final C0056a nameResolver;
    private final SSLSocketFactory socketfactory;
    private final String[] supportedCipherSuites;
    private final String[] supportedProtocols;

    protected void prepareSocket(SSLSocket sSLSocket) {
    }

    public static C1249i getSocketFactory() {
        return new C1249i(C0067g.m189a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private static String[] split(String str) {
        if (C0167h.m528b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public static C1249i getSystemSocketFactory() {
        return new C1249i((SSLSocketFactory) SSLSocketFactory.getDefault(), C1249i.split(System.getProperty("https.protocols")), C1249i.split(System.getProperty("https.cipherSuites")), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public C1249i(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, C0056a c0056a) {
        this(C0067g.m190b().m182a(str).m187a(secureRandom).m185a(keyStore, str2 != null ? str2.toCharArray() : null).m183a(keyStore2).m188a(), c0056a);
    }

    public C1249i(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, C0069k c0069k, C0070l c0070l) {
        this(C0067g.m190b().m182a(str).m187a(secureRandom).m185a(keyStore, str2 != null ? str2.toCharArray() : null).m184a(keyStore2, c0069k).m188a(), c0070l);
    }

    public C1249i(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, C0070l c0070l) {
        this(C0067g.m190b().m182a(str).m187a(secureRandom).m185a(keyStore, str2 != null ? str2.toCharArray() : null).m183a(keyStore2).m188a(), c0070l);
    }

    public C1249i(KeyStore keyStore, String str, KeyStore keyStore2) {
        this(C0067g.m190b().m185a(keyStore, str != null ? str.toCharArray() : null).m183a(keyStore2).m188a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public C1249i(KeyStore keyStore, String str) {
        this(C0067g.m190b().m185a(keyStore, str != null ? str.toCharArray() : null).m188a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public C1249i(KeyStore keyStore) {
        this(C0067g.m190b().m183a(keyStore).m188a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public C1249i(C0069k c0069k, C0070l c0070l) {
        this(C0067g.m190b().m184a(null, c0069k).m188a(), c0070l);
    }

    public C1249i(C0069k c0069k) {
        this(C0067g.m190b().m184a(null, c0069k).m188a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public C1249i(SSLContext sSLContext) {
        this(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public C1249i(SSLContext sSLContext, C0056a c0056a) {
        this.socketfactory = sSLContext.getSocketFactory();
        this.hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        this.nameResolver = c0056a;
        this.supportedProtocols = null;
        this.supportedCipherSuites = null;
    }

    public C1249i(SSLContext sSLContext, C0070l c0070l) {
        this(((SSLContext) C0160a.m478a((Object) sSLContext, "SSL context")).getSocketFactory(), null, null, c0070l);
    }

    public C1249i(SSLContext sSLContext, String[] strArr, String[] strArr2, C0070l c0070l) {
        this(((SSLContext) C0160a.m478a((Object) sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, c0070l);
    }

    public C1249i(SSLSocketFactory sSLSocketFactory, C0070l c0070l) {
        this(sSLSocketFactory, null, null, c0070l);
    }

    public C1249i(SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, C0070l c0070l) {
        this.socketfactory = (SSLSocketFactory) C0160a.m478a((Object) sSLSocketFactory, "SSL socket factory");
        this.supportedProtocols = strArr;
        this.supportedCipherSuites = strArr2;
        if (c0070l == null) {
            c0070l = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        }
        this.hostnameVerifier = c0070l;
        this.nameResolver = null;
    }

    public Socket createSocket(C0152e c0152e) {
        return createSocket((C0157e) null);
    }

    public Socket createSocket() {
        return createSocket((C0157e) null);
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C0152e c0152e) {
        C0159n a;
        C0160a.m478a((Object) inetSocketAddress, "Remote address");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        if (inetSocketAddress instanceof C0079m) {
            a = ((C0079m) inetSocketAddress).m209a();
        } else {
            a = new C0159n(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        }
        C0159n c0159n = a;
        int a2 = C0150c.m428a(c0152e);
        int e = C0150c.m436e(c0152e);
        socket.setSoTimeout(a2);
        return connectSocket(e, socket, c0159n, inetSocketAddress, inetSocketAddress2, null);
    }

    public boolean isSecure(Socket socket) {
        C0160a.m478a((Object) socket, "Socket");
        C0161b.m485a(socket instanceof SSLSocket, "Socket not created by this factory");
        C0161b.m485a(socket.isClosed() ^ 1, "Socket is closed");
        return true;
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, C0152e c0152e) {
        return createLayeredSocket(socket, str, i, (C0157e) null);
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, boolean z) {
        return createLayeredSocket(socket, str, i, (C0157e) false);
    }

    public void setHostnameVerifier(C0070l c0070l) {
        C0160a.m478a((Object) c0070l, "Hostname verifier");
        this.hostnameVerifier = c0070l;
    }

    public C0070l getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, C0152e c0152e) {
        InetAddress a;
        if (this.nameResolver != null) {
            a = this.nameResolver.m170a(str);
        } else {
            a = InetAddress.getByName(str);
        }
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        }
        return connectSocket(socket, new C0079m(new C0159n(str, i), a, i), inetSocketAddress, c0152e);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return createLayeredSocket(socket, str, i, z);
    }

    private void internalPrepareSocket(SSLSocket sSLSocket) {
        if (this.supportedProtocols != null) {
            sSLSocket.setEnabledProtocols(this.supportedProtocols);
        }
        if (this.supportedCipherSuites != null) {
            sSLSocket.setEnabledCipherSuites(this.supportedCipherSuites);
        }
        prepareSocket(sSLSocket);
    }

    public Socket createSocket(C0157e c0157e) {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket();
        internalPrepareSocket(sSLSocket);
        return sSLSocket;
    }

    public java.net.Socket connectSocket(int r2, java.net.Socket r3, p000a.p001a.p002a.p003a.C0159n r4, java.net.InetSocketAddress r5, java.net.InetSocketAddress r6, p000a.p001a.p002a.p003a.p034n.C0157e r7) {
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
        r0 = "HTTP host";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r4, r0);
        r0 = "Remote address";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r5, r0);
        if (r3 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0011;
    L_0x000d:
        r3 = r1.createSocket(r7);
    L_0x0011:
        if (r6 == 0) goto L_0x0016;
    L_0x0013:
        r3.bind(r6);
    L_0x0016:
        r3.connect(r5, r2);	 Catch:{ IOException -> 0x0038 }
        r2 = r3 instanceof javax.net.ssl.SSLSocket;
        if (r2 == 0) goto L_0x002b;
    L_0x001d:
        r2 = r3;
        r2 = (javax.net.ssl.SSLSocket) r2;
        r2.startHandshake();
        r4 = r4.m470a();
        r1.verifyHostname(r2, r4);
        return r3;
    L_0x002b:
        r2 = r4.m470a();
        r4 = r5.getPort();
        r2 = r1.createLayeredSocket(r3, r2, r4, r7);
        return r2;
    L_0x0038:
        r2 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x003c }
    L_0x003c:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.e.d.i.connectSocket(int, java.net.Socket, a.a.a.a.n, java.net.InetSocketAddress, java.net.InetSocketAddress, a.a.a.a.n.e):java.net.Socket");
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, C0157e c0157e) {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i, true);
        internalPrepareSocket(sSLSocket);
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, str);
        return sSLSocket;
    }

    private void verifyHostname(javax.net.ssl.SSLSocket r2, java.lang.String r3) {
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
        r0 = r1.hostnameVerifier;	 Catch:{ IOException -> 0x0006 }
        r0.mo23a(r3, r2);	 Catch:{ IOException -> 0x0006 }
        return;
    L_0x0006:
        r3 = move-exception;
        r2.close();	 Catch:{ Exception -> 0x000a }
    L_0x000a:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.e.d.i.verifyHostname(javax.net.ssl.SSLSocket, java.lang.String):void");
    }
}
