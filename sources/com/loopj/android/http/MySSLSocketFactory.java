package com.loopj.android.http;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p000a.p001a.p002a.p003a.p013e.p017d.C1249i;

public class MySSLSocketFactory extends C1249i {
    final SSLContext sslContext = SSLContext.getInstance(C1249i.TLS);

    /* renamed from: com.loopj.android.http.MySSLSocketFactory$1 */
    class C07611 implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        C07611() {
        }
    }

    public MySSLSocketFactory(KeyStore keyStore) {
        super(keyStore);
        keyStore = new C07611();
        this.sslContext.init(null, new TrustManager[]{keyStore}, null);
    }

    public static KeyStore getKeystoreOfCA(InputStream inputStream) {
        KeyStore instance;
        InputStream inputStream2 = null;
        InputStream bufferedInputStream;
        try {
            CertificateFactory instance2 = CertificateFactory.getInstance("X.509");
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStream = instance2.generateCertificate(bufferedInputStream);
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (CertificateException e2) {
                inputStream = e2;
                try {
                    inputStream.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (InputStream inputStream3) {
                            inputStream3.printStackTrace();
                        }
                    }
                    inputStream3 = null;
                    instance = KeyStore.getInstance(KeyStore.getDefaultType());
                    try {
                        instance.load(null, null);
                        instance.setCertificateEntry("ca", inputStream3);
                    } catch (Exception e3) {
                        inputStream3 = e3;
                        inputStream3.printStackTrace();
                        return instance;
                    }
                    return instance;
                } catch (Throwable th) {
                    inputStream3 = th;
                    inputStream2 = bufferedInputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw inputStream3;
                }
            }
        } catch (CertificateException e5) {
            inputStream3 = e5;
            bufferedInputStream = null;
            inputStream3.printStackTrace();
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            inputStream3 = null;
            instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load(null, null);
            instance.setCertificateEntry("ca", inputStream3);
            return instance;
        } catch (Throwable th2) {
            inputStream3 = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw inputStream3;
        }
        try {
            instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load(null, null);
            instance.setCertificateEntry("ca", inputStream3);
        } catch (Exception e6) {
            inputStream3 = e6;
            instance = null;
            inputStream3.printStackTrace();
            return instance;
        }
        return instance;
    }

    public static KeyStore getKeystore() {
        Throwable th;
        KeyStore keyStore = null;
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                instance.load(null, null);
                return instance;
            } catch (Throwable th2) {
                KeyStore keyStore2 = instance;
                th = th2;
                keyStore = keyStore2;
                th.printStackTrace();
                return keyStore;
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return keyStore;
        }
    }

    public static C1249i getFixedSocketFactory() {
        try {
            C1249i mySSLSocketFactory = new MySSLSocketFactory(getKeystore());
            mySSLSocketFactory.setHostnameVerifier(C1249i.ALLOW_ALL_HOSTNAME_VERIFIER);
            return mySSLSocketFactory;
        } catch (Throwable th) {
            th.printStackTrace();
            return C1249i.getSocketFactory();
        }
    }

    public static p000a.p001a.p002a.p003a.p022i.p024b.C1324k getNewHttpClient(java.security.KeyStore r5) {
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
        r0 = new com.loopj.android.http.MySSLSocketFactory;	 Catch:{ Exception -> 0x0040 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0040 }
        r5 = new a.a.a.a.e.c.i;	 Catch:{ Exception -> 0x0040 }
        r5.<init>();	 Catch:{ Exception -> 0x0040 }
        r1 = new a.a.a.a.e.c.e;	 Catch:{ Exception -> 0x0040 }
        r2 = "http";	 Catch:{ Exception -> 0x0040 }
        r3 = p000a.p001a.p002a.p003a.p013e.p016c.C0821d.m1526a();	 Catch:{ Exception -> 0x0040 }
        r4 = 80;	 Catch:{ Exception -> 0x0040 }
        r1.<init>(r2, r3, r4);	 Catch:{ Exception -> 0x0040 }
        r5.m176a(r1);	 Catch:{ Exception -> 0x0040 }
        r1 = new a.a.a.a.e.c.e;	 Catch:{ Exception -> 0x0040 }
        r2 = "https";	 Catch:{ Exception -> 0x0040 }
        r3 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;	 Catch:{ Exception -> 0x0040 }
        r1.<init>(r2, r0, r3);	 Catch:{ Exception -> 0x0040 }
        r5.m176a(r1);	 Catch:{ Exception -> 0x0040 }
        r0 = new a.a.a.a.l.b;	 Catch:{ Exception -> 0x0040 }
        r0.<init>();	 Catch:{ Exception -> 0x0040 }
        r1 = p000a.p001a.p002a.p003a.C0917v.f1697c;	 Catch:{ Exception -> 0x0040 }
        p000a.p001a.p002a.p003a.p032l.C0153f.m450a(r0, r1);	 Catch:{ Exception -> 0x0040 }
        r1 = "UTF-8";	 Catch:{ Exception -> 0x0040 }
        p000a.p001a.p002a.p003a.p032l.C0153f.m451a(r0, r1);	 Catch:{ Exception -> 0x0040 }
        r1 = new a.a.a.a.i.c.a.g;	 Catch:{ Exception -> 0x0040 }
        r1.<init>(r0, r5);	 Catch:{ Exception -> 0x0040 }
        r5 = new a.a.a.a.i.b.k;	 Catch:{ Exception -> 0x0040 }
        r5.<init>(r1, r0);	 Catch:{ Exception -> 0x0040 }
        return r5;
    L_0x0040:
        r5 = new a.a.a.a.i.b.k;
        r5.<init>();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.MySSLSocketFactory.getNewHttpClient(java.security.KeyStore):a.a.a.a.i.b.k");
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.sslContext.getSocketFactory().createSocket(socket, str, i, z);
    }

    public Socket createSocket() {
        return this.sslContext.getSocketFactory().createSocket();
    }

    public void fixHttpsURLConnection() {
        HttpsURLConnection.setDefaultSSLSocketFactory(this.sslContext.getSocketFactory());
    }
}
