package p000a.p001a.p002a.p003a.p013e.p017d;

import java.net.InetAddress;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p000a.p001a.p002a.p003a.p013e.p018e.C0072a;
import p000a.p001a.p002a.p003a.p021h.C0097b;

/* compiled from: AbstractVerifier */
/* renamed from: a.a.a.a.e.d.a */
public abstract class C0824a implements C0070l {
    /* renamed from: b */
    private static final String[] f1449b = new String[]{"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
    /* renamed from: a */
    public C0097b f1450a = new C0097b(getClass());

    static {
        Arrays.sort(f1449b);
    }

    /* renamed from: a */
    public final void mo23a(String str, SSLSocket sSLSocket) {
        if (str != null) {
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.getInputStream().available();
                session = sSLSocket.getSession();
                if (session == null) {
                    sSLSocket.startHandshake();
                    session = sSLSocket.getSession();
                }
            }
            m1533a(str, (X509Certificate) session.getPeerCertificates()[0]);
            return;
        }
        throw new NullPointerException("host to verify is null");
    }

    public final boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
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
        r0 = 0;
        r3 = r3.getPeerCertificates();	 Catch:{ SSLException -> 0x000e }
        r3 = r3[r0];	 Catch:{ SSLException -> 0x000e }
        r3 = (java.security.cert.X509Certificate) r3;	 Catch:{ SSLException -> 0x000e }
        r1.m1533a(r2, r3);	 Catch:{ SSLException -> 0x000e }
        r2 = 1;
        return r2;
    L_0x000e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.e.d.a.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }

    /* renamed from: a */
    public final void m1533a(String str, X509Certificate x509Certificate) {
        mo1587a(str, C0824a.m1527a(x509Certificate), C0824a.m1528a(x509Certificate, str));
    }

    /* renamed from: a */
    public final void m1535a(String str, String[] strArr, String[] strArr2, boolean z) {
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (Object obj : strArr2) {
                if (obj != null) {
                    linkedList.add(obj);
                }
            }
        }
        if (linkedList.isEmpty() == null) {
            strArr = new StringBuilder();
            strArr2 = m1532e(str.trim().toLowerCase(Locale.ENGLISH));
            Iterator it = linkedList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String toLowerCase = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                strArr.append(" <");
                strArr.append(toLowerCase);
                strArr.append('>');
                if (it.hasNext()) {
                    strArr.append(" OR");
                }
                String[] split = toLowerCase.split("\\.");
                Object obj2 = (split.length < 3 || !split[0].endsWith("*") || !mo1588a(toLowerCase) || C0824a.m1531d(str)) ? null : 1;
                if (obj2 != null) {
                    boolean z3;
                    String str2 = split[0];
                    if (str2.length() > 1) {
                        String substring = str2.substring(0, str2.length() - 1);
                        z3 = strArr2.startsWith(substring) && strArr2.substring(substring.length()).endsWith(toLowerCase.substring(str2.length()));
                    } else {
                        z3 = strArr2.endsWith(toLowerCase.substring(1));
                    }
                    if (z3 && z) {
                        z3 = C0824a.m1530c(strArr2) == C0824a.m1530c(toLowerCase);
                    }
                    z2 = z3;
                    continue;
                } else {
                    z2 = strArr2.equals(m1532e(toLowerCase));
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                z = new StringBuilder();
                z.append("hostname in certificate didn't match: <");
                z.append(str);
                z.append("> !=");
                z.append(strArr);
                throw new SSLException(z.toString());
            }
            return;
        }
        strArr = new StringBuilder();
        strArr.append("Certificate for <");
        strArr.append(str);
        strArr.append("> doesn't contain CN or DNS subjectAlt");
        throw new SSLException(strArr.toString());
    }

    /* renamed from: a */
    boolean mo1588a(String str) {
        str = str.split("\\.");
        boolean z = true;
        if (str.length == 3) {
            if (str[2].length() == 2) {
                if (Arrays.binarySearch(f1449b, str[1]) >= null) {
                    z = false;
                }
                return z;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static java.lang.String[] m1527a(java.security.cert.X509Certificate r0) {
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
        r0 = r0.getSubjectX500Principal();
        r0 = r0.toString();
        r0 = p000a.p001a.p002a.p003a.p013e.p017d.C0824a.m1529b(r0);	 Catch:{ SSLException -> 0x000d }
        return r0;
    L_0x000d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.e.d.a.a(java.security.cert.X509Certificate):java.lang.String[]");
    }

    /* renamed from: b */
    static String[] m1529b(String str) {
        if (str == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens() != null) {
            str = stringTokenizer.nextToken();
            int indexOf = str.indexOf("CN=");
            if (indexOf >= 0) {
                linkedList.add(str.substring(indexOf + 3));
            }
        }
        if (linkedList.isEmpty() != null) {
            return null;
        }
        str = new String[linkedList.size()];
        linkedList.toArray(str);
        return str;
    }

    /* renamed from: a */
    private static java.lang.String[] m1528a(java.security.cert.X509Certificate r4, java.lang.String r5) {
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
        r5 = p000a.p001a.p002a.p003a.p013e.p017d.C0824a.m1531d(r5);
        if (r5 == 0) goto L_0x0008;
    L_0x0006:
        r5 = 7;
        goto L_0x0009;
    L_0x0008:
        r5 = 2;
    L_0x0009:
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1 = 0;
        r4 = r4.getSubjectAlternativeNames();	 Catch:{ CertificateParsingException -> 0x0014 }
        goto L_0x0015;
    L_0x0014:
        r4 = r1;
    L_0x0015:
        if (r4 == 0) goto L_0x003f;
    L_0x0017:
        r4 = r4.iterator();
    L_0x001b:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x003f;
    L_0x0021:
        r2 = r4.next();
        r2 = (java.util.List) r2;
        r3 = 0;
        r3 = r2.get(r3);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        if (r3 != r5) goto L_0x001b;
    L_0x0034:
        r3 = 1;
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        r0.add(r2);
        goto L_0x001b;
    L_0x003f:
        r4 = r0.isEmpty();
        if (r4 != 0) goto L_0x004f;
    L_0x0045:
        r4 = r0.size();
        r4 = new java.lang.String[r4];
        r0.toArray(r4);
        return r4;
    L_0x004f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.e.d.a.a(java.security.cert.X509Certificate, java.lang.String):java.lang.String[]");
    }

    /* renamed from: c */
    public static int m1530c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static boolean m1531d(String str) {
        return (str == null || (!C0072a.m197a(str) && C0072a.m200d(str) == null)) ? null : true;
    }

    /* renamed from: e */
    private String m1532e(String str) {
        if (str != null) {
            if (C0072a.m200d(str)) {
                try {
                    return InetAddress.getByName(str).getHostAddress();
                } catch (Throwable e) {
                    C0097b c0097b = this.f1450a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected error converting ");
                    stringBuilder.append(str);
                    c0097b.m264b(stringBuilder.toString(), e);
                    return str;
                }
            }
        }
        return str;
    }
}
