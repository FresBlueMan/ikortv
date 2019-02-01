package p000a.p001a.p002a.p003a.p013e.p017d;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: PrivateKeyDetails */
/* renamed from: a.a.a.a.e.d.d */
public final class C0062d {
    /* renamed from: a */
    private final String f120a;
    /* renamed from: b */
    private final X509Certificate[] f121b;

    public C0062d(String str, X509Certificate[] x509CertificateArr) {
        this.f120a = (String) C0160a.m478a((Object) str, "Private key type");
        this.f121b = x509CertificateArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f120a);
        stringBuilder.append(':');
        stringBuilder.append(Arrays.toString(this.f121b));
        return stringBuilder.toString();
    }
}
