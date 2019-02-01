package p000a.p001a.p002a.p003a.p013e.p017d;

import java.net.Socket;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: SSLContextBuilder */
/* renamed from: a.a.a.a.e.d.f */
public class C0066f {
    /* renamed from: a */
    private String f126a;
    /* renamed from: b */
    private Set<KeyManager> f127b = new HashSet();
    /* renamed from: c */
    private Set<TrustManager> f128c = new HashSet();
    /* renamed from: d */
    private SecureRandom f129d;

    /* compiled from: SSLContextBuilder */
    /* renamed from: a.a.a.a.e.d.f$a */
    static class C0064a implements X509KeyManager {
        /* renamed from: a */
        private final X509KeyManager f122a;
        /* renamed from: b */
        private final C0063e f123b;

        C0064a(X509KeyManager x509KeyManager, C0063e c0063e) {
            this.f122a = x509KeyManager;
            this.f123b = c0063e;
        }

        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.f122a.getClientAliases(str, principalArr);
        }

        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            Map hashMap = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.f122a.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        hashMap.put(str2, new C0062d(str, this.f122a.getCertificateChain(str2)));
                    }
                }
            }
            return this.f123b.m181a(hashMap, socket);
        }

        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.f122a.getServerAliases(str, principalArr);
        }

        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            Map hashMap = new HashMap();
            principalArr = this.f122a.getServerAliases(str, principalArr);
            if (principalArr != null) {
                for (String str2 : principalArr) {
                    hashMap.put(str2, new C0062d(str, this.f122a.getCertificateChain(str2)));
                }
            }
            return this.f123b.m181a(hashMap, socket);
        }

        public X509Certificate[] getCertificateChain(String str) {
            return this.f122a.getCertificateChain(str);
        }

        public PrivateKey getPrivateKey(String str) {
            return this.f122a.getPrivateKey(str);
        }
    }

    /* compiled from: SSLContextBuilder */
    /* renamed from: a.a.a.a.e.d.f$b */
    static class C0065b implements X509TrustManager {
        /* renamed from: a */
        private final X509TrustManager f124a;
        /* renamed from: b */
        private final C0069k f125b;

        C0065b(X509TrustManager x509TrustManager, C0069k c0069k) {
            this.f124a = x509TrustManager;
            this.f125b = c0069k;
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.f124a.checkClientTrusted(x509CertificateArr, str);
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (!this.f125b.m191a(x509CertificateArr, str)) {
                this.f124a.checkServerTrusted(x509CertificateArr, str);
            }
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.f124a.getAcceptedIssuers();
        }
    }

    /* renamed from: a */
    public C0066f m182a(String str) {
        this.f126a = str;
        return this;
    }

    /* renamed from: a */
    public C0066f m187a(SecureRandom secureRandom) {
        this.f129d = secureRandom;
        return this;
    }

    /* renamed from: a */
    public C0066f m184a(KeyStore keyStore, C0069k c0069k) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        keyStore = instance.getTrustManagers();
        if (keyStore != null) {
            if (c0069k != null) {
                for (int i = 0; i < keyStore.length; i++) {
                    Object obj = keyStore[i];
                    if (obj instanceof X509TrustManager) {
                        keyStore[i] = new C0065b((X509TrustManager) obj, c0069k);
                    }
                }
            }
            for (Object add : keyStore) {
                this.f128c.add(add);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0066f m183a(KeyStore keyStore) {
        return m184a(keyStore, null);
    }

    /* renamed from: a */
    public C0066f m185a(KeyStore keyStore, char[] cArr) {
        m186a(keyStore, cArr, null);
        return this;
    }

    /* renamed from: a */
    public C0066f m186a(KeyStore keyStore, char[] cArr, C0063e c0063e) {
        KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore, cArr);
        keyStore = instance.getKeyManagers();
        if (keyStore != null) {
            if (c0063e != null) {
                for (int i = 0; i < keyStore.length; i++) {
                    Object obj = keyStore[i];
                    if (obj instanceof X509KeyManager) {
                        keyStore[i] = new C0064a((X509KeyManager) obj, c0063e);
                    }
                }
            }
            for (Object add : keyStore) {
                this.f127b.add(add);
            }
        }
        return this;
    }

    /* renamed from: a */
    public SSLContext m188a() {
        SSLContext instance = SSLContext.getInstance(this.f126a != null ? this.f126a : C1249i.TLS);
        TrustManager[] trustManagerArr = null;
        KeyManager[] keyManagerArr = !this.f127b.isEmpty() ? (KeyManager[]) this.f127b.toArray(new KeyManager[this.f127b.size()]) : null;
        if (!this.f128c.isEmpty()) {
            trustManagerArr = (TrustManager[]) this.f128c.toArray(new TrustManager[this.f128c.size()]);
        }
        instance.init(keyManagerArr, trustManagerArr, this.f129d);
        return instance;
    }
}
