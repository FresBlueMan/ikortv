package p000a.p001a.p002a.p003a.p022i.p023a;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p004a.C1234i;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p034n.C0906a;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: DigestScheme */
/* renamed from: a.a.a.a.i.a.d */
public class C1344d extends C1323m {
    /* renamed from: a */
    private static final char[] f2326a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: b */
    private boolean f2327b;
    /* renamed from: c */
    private String f2328c;
    /* renamed from: d */
    private long f2329d;
    /* renamed from: e */
    private String f2330e;
    /* renamed from: f */
    private String f2331f;
    /* renamed from: g */
    private String f2332g;

    /* renamed from: a */
    public String mo1918a() {
        return "digest";
    }

    /* renamed from: c */
    public boolean mo1921c() {
        return false;
    }

    public C1344d(Charset charset) {
        super(charset);
        this.f2327b = null;
    }

    public C1344d() {
        this(C0043c.f98b);
    }

    /* renamed from: a */
    public void mo1592a(C0082e c0082e) {
        super.mo1592a(c0082e);
        this.f2327b = true;
    }

    /* renamed from: d */
    public boolean mo1922d() {
        if ("true".equalsIgnoreCase(m2790a("stale"))) {
            return false;
        }
        return this.f2327b;
    }

    @Deprecated
    /* renamed from: a */
    public C0082e mo1917a(C0009m c0009m, C0915q c0915q) {
        return mo1591a(c0009m, c0915q, new C0906a());
    }

    /* renamed from: a */
    public C0082e mo1591a(C0009m c0009m, C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0009m, "Credentials");
        C0160a.m478a((Object) c0915q, "HTTP request");
        if (m2790a("realm") == null) {
            throw new C1234i("missing realm in challenge");
        } else if (m2790a("nonce") != null) {
            m2794h().put("methodname", c0915q.getRequestLine().mo143a());
            m2794h().put("uri", c0915q.getRequestLine().mo145c());
            if (m2790a("charset") == null) {
                m2794h().put("charset", m2789a(c0915q));
            }
            return m2857b(c0009m, c0915q);
        } else {
            throw new C1234i("missing nonce in challenge");
        }
    }

    /* renamed from: b */
    private static java.security.MessageDigest m2858b(java.lang.String r3) {
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
        r0 = java.security.MessageDigest.getInstance(r3);	 Catch:{ Exception -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new a.a.a.a.i.a.n;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unsupported algorithm in HTTP Digest authentication: ";
        r1.append(r2);
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.d.b(java.lang.String):java.security.MessageDigest");
    }

    /* renamed from: b */
    private p000a.p001a.p002a.p003a.C0082e m2857b(p000a.p001a.p002a.p003a.p004a.C0009m r21, p000a.p001a.p002a.p003a.C0915q r22) {
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
        r20 = this;
        r1 = r20;
        r0 = r22;
        r2 = "uri";
        r2 = r1.m2790a(r2);
        r3 = "realm";
        r3 = r1.m2790a(r3);
        r4 = "nonce";
        r4 = r1.m2790a(r4);
        r5 = "opaque";
        r5 = r1.m2790a(r5);
        r6 = "methodname";
        r6 = r1.m2790a(r6);
        r7 = "algorithm";
        r7 = r1.m2790a(r7);
        if (r7 != 0) goto L_0x002c;
    L_0x002a:
        r7 = "MD5";
    L_0x002c:
        r8 = new java.util.HashSet;
        r9 = 8;
        r8.<init>(r9);
        r9 = "qop";
        r9 = r1.m2790a(r9);
        r10 = -1;
        if (r9 == 0) goto L_0x0075;
    L_0x003c:
        r14 = new java.util.StringTokenizer;
        r15 = ",";
        r14.<init>(r9, r15);
    L_0x0043:
        r15 = r14.hasMoreTokens();
        if (r15 == 0) goto L_0x005b;
    L_0x0049:
        r15 = r14.nextToken();
        r15 = r15.trim();
        r11 = java.util.Locale.ENGLISH;
        r11 = r15.toLowerCase(r11);
        r8.add(r11);
        goto L_0x0043;
    L_0x005b:
        r11 = r0 instanceof p000a.p001a.p002a.p003a.C1285l;
        if (r11 == 0) goto L_0x0069;
    L_0x005f:
        r11 = "auth-int";
        r11 = r8.contains(r11);
        if (r11 == 0) goto L_0x0069;
    L_0x0067:
        r11 = 1;
        goto L_0x0076;
    L_0x0069:
        r11 = "auth";
        r11 = r8.contains(r11);
        if (r11 == 0) goto L_0x0073;
    L_0x0071:
        r11 = 2;
        goto L_0x0076;
    L_0x0073:
        r11 = -1;
        goto L_0x0076;
    L_0x0075:
        r11 = 0;
    L_0x0076:
        if (r11 == r10) goto L_0x036b;
    L_0x0078:
        r9 = "charset";
        r9 = r1.m2790a(r9);
        if (r9 != 0) goto L_0x0082;
    L_0x0080:
        r9 = "ISO-8859-1";
    L_0x0082:
        r10 = "MD5-sess";
        r10 = r7.equalsIgnoreCase(r10);
        if (r10 == 0) goto L_0x008d;
    L_0x008a:
        r10 = "MD5";
        goto L_0x008e;
    L_0x008d:
        r10 = r7;
    L_0x008e:
        r14 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2858b(r10);	 Catch:{ n -> 0x0354 }
        r10 = r21.mo3a();
        r10 = r10.getName();
        r15 = r21.mo4b();
        r13 = r1.f2328c;
        r13 = r4.equals(r13);
        r16 = r5;
        r17 = r6;
        r5 = 1;
        if (r13 == 0) goto L_0x00b2;
    L_0x00ac:
        r12 = r1.f2329d;
        r12 = r12 + r5;
        r1.f2329d = r12;
        goto L_0x00b9;
    L_0x00b2:
        r1.f2329d = r5;
        r5 = 0;
        r1.f2330e = r5;
        r1.f2328c = r4;
    L_0x00b9:
        r5 = new java.lang.StringBuilder;
        r6 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r5.<init>(r6);
        r6 = new java.util.Formatter;
        r12 = java.util.Locale.US;
        r6.<init>(r5, r12);
        r12 = "%08x";
        r18 = r8;
        r13 = 1;
        r8 = new java.lang.Object[r13];
        r19 = r14;
        r13 = r1.f2329d;
        r13 = java.lang.Long.valueOf(r13);
        r14 = 0;
        r8[r14] = r13;
        r6.format(r12, r8);
        r6.close();
        r6 = r5.toString();
        r8 = r1.f2330e;
        if (r8 != 0) goto L_0x00ed;
    L_0x00e7:
        r8 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2859f();
        r1.f2330e = r8;
    L_0x00ed:
        r8 = 0;
        r1.f2331f = r8;
        r1.f2332g = r8;
        r12 = "MD5-sess";
        r12 = r7.equalsIgnoreCase(r12);
        r13 = 58;
        if (r12 == 0) goto L_0x013d;
    L_0x00fc:
        r12 = 0;
        r5.setLength(r12);
        r5.append(r10);
        r5.append(r13);
        r5.append(r3);
        r5.append(r13);
        r5.append(r15);
        r14 = r5.toString();
        r14 = p000a.p001a.p002a.p003a.p035o.C0164e.m519a(r14, r9);
        r15 = r19;
        r14 = r15.digest(r14);
        r14 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2856a(r14);
        r5.setLength(r12);
        r5.append(r14);
        r5.append(r13);
        r5.append(r4);
        r5.append(r13);
        r14 = r1.f2330e;
        r5.append(r14);
        r14 = r5.toString();
        r1.f2331f = r14;
        r14 = r15;
        goto L_0x0158;
    L_0x013d:
        r14 = r19;
        r12 = 0;
        r5.setLength(r12);
        r5.append(r10);
        r5.append(r13);
        r5.append(r3);
        r5.append(r13);
        r5.append(r15);
        r12 = r5.toString();
        r1.f2331f = r12;
    L_0x0158:
        r12 = r1.f2331f;
        r12 = p000a.p001a.p002a.p003a.p035o.C0164e.m519a(r12, r9);
        r12 = r14.digest(r12);
        r12 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2856a(r12);
        r15 = 2;
        if (r11 != r15) goto L_0x0181;
    L_0x0169:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8 = r17;
        r0.append(r8);
        r0.append(r13);
        r0.append(r2);
        r0 = r0.toString();
        r1.f2332g = r0;
        goto L_0x0211;
    L_0x0181:
        r8 = r17;
        r15 = 1;
        if (r11 != r15) goto L_0x01fd;
    L_0x0186:
        r15 = r0 instanceof p000a.p001a.p002a.p003a.C1285l;
        if (r15 == 0) goto L_0x0191;
    L_0x018a:
        r0 = (p000a.p001a.p002a.p003a.C1285l) r0;
        r0 = r0.getEntity();
        goto L_0x0192;
    L_0x0191:
        r0 = 0;
    L_0x0192:
        if (r0 == 0) goto L_0x01c2;
    L_0x0194:
        r15 = r0.isRepeatable();
        if (r15 != 0) goto L_0x01c2;
    L_0x019a:
        r0 = "auth";
        r11 = r18;
        r0 = r11.contains(r0);
        if (r0 == 0) goto L_0x01ba;
    L_0x01a4:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r8);
        r0.append(r13);
        r0.append(r2);
        r0 = r0.toString();
        r1.f2332g = r0;
        r11 = 2;
        goto L_0x0211;
    L_0x01ba:
        r0 = new a.a.a.a.a.i;
        r2 = "Qop auth-int cannot be used with a non-repeatable entity";
        r0.<init>(r2);
        throw r0;
    L_0x01c2:
        r15 = new a.a.a.a.i.a.g;
        r15.<init>(r14);
        if (r0 == 0) goto L_0x01cf;
    L_0x01c9:
        r0.writeTo(r15);	 Catch:{ IOException -> 0x01cd }
        goto L_0x01cf;	 Catch:{ IOException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;	 Catch:{ IOException -> 0x01cd }
        goto L_0x01f5;	 Catch:{ IOException -> 0x01cd }
    L_0x01cf:
        r15.close();	 Catch:{ IOException -> 0x01cd }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r8);
        r0.append(r13);
        r0.append(r2);
        r0.append(r13);
        r8 = r15.m274a();
        r8 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2856a(r8);
        r0.append(r8);
        r0 = r0.toString();
        r1.f2332g = r0;
        goto L_0x0211;
    L_0x01f5:
        r2 = new a.a.a.a.a.i;
        r3 = "I/O error reading entity content";
        r2.<init>(r3, r0);
        throw r2;
    L_0x01fd:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r8);
        r0.append(r13);
        r0.append(r2);
        r0 = r0.toString();
        r1.f2332g = r0;
    L_0x0211:
        r0 = r1.f2332g;
        r0 = p000a.p001a.p002a.p003a.p035o.C0164e.m519a(r0, r9);
        r0 = r14.digest(r0);
        r0 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2856a(r0);
        if (r11 != 0) goto L_0x0239;
    L_0x0221:
        r8 = 0;
        r5.setLength(r8);
        r5.append(r12);
        r5.append(r13);
        r5.append(r4);
        r5.append(r13);
        r5.append(r0);
        r0 = r5.toString();
        goto L_0x026c;
    L_0x0239:
        r8 = 0;
        r5.setLength(r8);
        r5.append(r12);
        r5.append(r13);
        r5.append(r4);
        r5.append(r13);
        r5.append(r6);
        r5.append(r13);
        r9 = r1.f2330e;
        r5.append(r9);
        r5.append(r13);
        r9 = 1;
        if (r11 != r9) goto L_0x025d;
    L_0x025a:
        r9 = "auth-int";
        goto L_0x025f;
    L_0x025d:
        r9 = "auth";
    L_0x025f:
        r5.append(r9);
        r5.append(r13);
        r5.append(r0);
        r0 = r5.toString();
    L_0x026c:
        r0 = p000a.p001a.p002a.p003a.p035o.C0164e.m518a(r0);
        r0 = r14.digest(r0);
        r0 = p000a.p001a.p002a.p003a.p022i.p023a.C1344d.m2856a(r0);
        r5 = new a.a.a.a.o.d;
        r9 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5.<init>(r9);
        r9 = r20.m2562e();
        if (r9 == 0) goto L_0x028b;
    L_0x0285:
        r9 = "Proxy-Authorization";
        r5.m507a(r9);
        goto L_0x0290;
    L_0x028b:
        r9 = "Authorization";
        r5.m507a(r9);
    L_0x0290:
        r9 = ": Digest ";
        r5.m507a(r9);
        r9 = new java.util.ArrayList;
        r12 = 20;
        r9.<init>(r12);
        r12 = new a.a.a.a.k.l;
        r13 = "username";
        r12.<init>(r13, r10);
        r9.add(r12);
        r10 = new a.a.a.a.k.l;
        r12 = "realm";
        r10.<init>(r12, r3);
        r9.add(r10);
        r3 = new a.a.a.a.k.l;
        r10 = "nonce";
        r3.<init>(r10, r4);
        r9.add(r3);
        r3 = new a.a.a.a.k.l;
        r4 = "uri";
        r3.<init>(r4, r2);
        r9.add(r3);
        r2 = new a.a.a.a.k.l;
        r3 = "response";
        r2.<init>(r3, r0);
        r9.add(r2);
        if (r11 == 0) goto L_0x02f8;
    L_0x02d0:
        r0 = new a.a.a.a.k.l;
        r2 = "qop";
        r3 = 1;
        if (r11 != r3) goto L_0x02da;
    L_0x02d7:
        r3 = "auth-int";
        goto L_0x02dc;
    L_0x02da:
        r3 = "auth";
    L_0x02dc:
        r0.<init>(r2, r3);
        r9.add(r0);
        r0 = new a.a.a.a.k.l;
        r2 = "nc";
        r0.<init>(r2, r6);
        r9.add(r0);
        r0 = new a.a.a.a.k.l;
        r2 = "cnonce";
        r3 = r1.f2330e;
        r0.<init>(r2, r3);
        r9.add(r0);
    L_0x02f8:
        r0 = new a.a.a.a.k.l;
        r2 = "algorithm";
        r0.<init>(r2, r7);
        r9.add(r0);
        if (r16 == 0) goto L_0x0310;
    L_0x0304:
        r0 = new a.a.a.a.k.l;
        r2 = "opaque";
        r3 = r16;
        r0.<init>(r2, r3);
        r9.add(r0);
    L_0x0310:
        r0 = 0;
    L_0x0311:
        r2 = r9.size();
        if (r0 >= r2) goto L_0x034e;
    L_0x0317:
        r2 = r9.get(r0);
        r2 = (p000a.p001a.p002a.p003a.p031k.C0901l) r2;
        if (r0 <= 0) goto L_0x0324;
    L_0x031f:
        r3 = ", ";
        r5.m507a(r3);
    L_0x0324:
        r3 = r2.mo141a();
        r4 = "nc";
        r4 = r4.equals(r3);
        if (r4 != 0) goto L_0x0343;
    L_0x0330:
        r4 = "qop";
        r4 = r4.equals(r3);
        if (r4 != 0) goto L_0x0343;
    L_0x0338:
        r4 = "algorithm";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x0341;
    L_0x0340:
        goto L_0x0343;
    L_0x0341:
        r3 = 0;
        goto L_0x0344;
    L_0x0343:
        r3 = 1;
    L_0x0344:
        r4 = p000a.p001a.p002a.p003a.p031k.C0143e.f288b;
        r6 = 1;
        r3 = r3 ^ r6;
        r4.m400a(r5, r2, r3);
        r0 = r0 + 1;
        goto L_0x0311;
    L_0x034e:
        r0 = new a.a.a.a.k.p;
        r0.<init>(r5);
        return r0;
    L_0x0354:
        r0 = new a.a.a.a.a.i;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unsuppported digest algorithm: ";
        r2.append(r3);
        r2.append(r10);
        r2 = r2.toString();
        r0.<init>(r2);
        throw r0;
    L_0x036b:
        r0 = new a.a.a.a.a.i;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "None of the qop methods is supported: ";
        r2.append(r3);
        r2.append(r9);
        r2 = r2.toString();
        r0.<init>(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.d.b(a.a.a.a.a.m, a.a.a.a.q):a.a.a.a.e");
    }

    /* renamed from: a */
    static String m2856a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & 15;
            int i3 = i * 2;
            cArr[i3] = f2326a[(bArr[i] & 240) >> 4];
            cArr[i3 + 1] = f2326a[i2];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static String m2859f() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return C1344d.m2856a(bArr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DIGEST [complete=");
        stringBuilder.append(this.f2327b);
        stringBuilder.append(", nonce=");
        stringBuilder.append(this.f2328c);
        stringBuilder.append(", nc=");
        stringBuilder.append(this.f2329d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
