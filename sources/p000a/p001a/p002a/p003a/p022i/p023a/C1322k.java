package p000a.p001a.p002a.p003a.p022i.p023a;

import p000a.p001a.p002a.p003a.p004a.C1235o;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: NTLMScheme */
/* renamed from: a.a.a.a.i.a.k */
public class C1322k extends C1259a {
    /* renamed from: a */
    private final C0102h f2279a;
    /* renamed from: b */
    private C0107a f2280b;
    /* renamed from: c */
    private String f2281c;

    /* compiled from: NTLMScheme */
    /* renamed from: a.a.a.a.i.a.k$a */
    enum C0107a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    /* renamed from: a */
    public String mo1918a() {
        return "ntlm";
    }

    /* renamed from: b */
    public String mo1920b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo1921c() {
        return true;
    }

    public C1322k(C0102h c0102h) {
        C0160a.m478a((Object) c0102h, "NTLM engine");
        this.f2279a = c0102h;
        this.f2280b = C0107a.UNINITIATED;
        this.f2281c = null;
    }

    public C1322k() {
        this(new C0840j());
    }

    /* renamed from: a */
    protected void mo1919a(C0163d c0163d, int i, int i2) {
        this.f2281c = c0163d.m510b(i, i2);
        if (this.f2281c.length() == null) {
            if (this.f2280b == C0107a.UNINITIATED) {
                this.f2280b = C0107a.CHALLENGE_RECEIVED;
            } else {
                this.f2280b = C0107a.FAILED;
            }
        } else if (this.f2280b.compareTo(C0107a.MSG_TYPE1_GENERATED) < null) {
            this.f2280b = C0107a.FAILED;
            throw new C1235o("Out of sequence NTLM response message");
        } else if (this.f2280b == C0107a.MSG_TYPE1_GENERATED) {
            this.f2280b = C0107a.MSG_TYPE2_RECEVIED;
        }
    }

    /* renamed from: a */
    public p000a.p001a.p002a.p003a.C0082e mo1917a(p000a.p001a.p002a.p003a.p004a.C0009m r8, p000a.p001a.p002a.p003a.C0915q r9) {
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
        r7 = this;
        r9 = r8;	 Catch:{ ClassCastException -> 0x008b }
        r9 = (p000a.p001a.p002a.p003a.p004a.C0802p) r9;	 Catch:{ ClassCastException -> 0x008b }
        r8 = r7.f2280b;
        r0 = p000a.p001a.p002a.p003a.p022i.p023a.C1322k.C0107a.FAILED;
        if (r8 == r0) goto L_0x0083;
    L_0x0009:
        r8 = r7.f2280b;
        r0 = p000a.p001a.p002a.p003a.p022i.p023a.C1322k.C0107a.CHALLENGE_RECEIVED;
        if (r8 != r0) goto L_0x0022;
    L_0x000f:
        r8 = r7.f2279a;
        r0 = r9.m1481d();
        r9 = r9.m1482e();
        r8 = r8.mo38a(r0, r9);
        r9 = p000a.p001a.p002a.p003a.p022i.p023a.C1322k.C0107a.MSG_TYPE1_GENERATED;
        r7.f2280b = r9;
        goto L_0x0044;
    L_0x0022:
        r8 = r7.f2280b;
        r0 = p000a.p001a.p002a.p003a.p022i.p023a.C1322k.C0107a.MSG_TYPE2_RECEVIED;
        if (r8 != r0) goto L_0x006a;
    L_0x0028:
        r1 = r7.f2279a;
        r2 = r9.m1480c();
        r3 = r9.mo4b();
        r4 = r9.m1481d();
        r5 = r9.m1482e();
        r6 = r7.f2281c;
        r8 = r1.mo39a(r2, r3, r4, r5, r6);
        r9 = p000a.p001a.p002a.p003a.p022i.p023a.C1322k.C0107a.MSG_TYPE3_GENERATED;
        r7.f2280b = r9;
    L_0x0044:
        r9 = new a.a.a.a.o.d;
        r0 = 32;
        r9.<init>(r0);
        r0 = r7.m2562e();
        if (r0 == 0) goto L_0x0057;
    L_0x0051:
        r0 = "Proxy-Authorization";
        r9.m507a(r0);
        goto L_0x005c;
    L_0x0057:
        r0 = "Authorization";
        r9.m507a(r0);
    L_0x005c:
        r0 = ": NTLM ";
        r9.m507a(r0);
        r9.m507a(r8);
        r8 = new a.a.a.a.k.p;
        r8.<init>(r9);
        return r8;
    L_0x006a:
        r8 = new a.a.a.a.a.i;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Unexpected state: ";
        r9.append(r0);
        r0 = r7.f2280b;
        r9.append(r0);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0083:
        r8 = new a.a.a.a.a.i;
        r9 = "NTLM authentication failed";
        r8.<init>(r9);
        throw r8;
    L_0x008b:
        r9 = new a.a.a.a.a.n;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Credentials cannot be used for NTLM authentication: ";
        r0.append(r1);
        r8 = r8.getClass();
        r8 = r8.getName();
        r0.append(r8);
        r8 = r0.toString();
        r9.<init>(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.k.a(a.a.a.a.a.m, a.a.a.a.q):a.a.a.a.e");
    }

    /* renamed from: d */
    public boolean mo1922d() {
        if (this.f2280b != C0107a.MSG_TYPE3_GENERATED) {
            if (this.f2280b != C0107a.FAILED) {
                return false;
            }
        }
        return true;
    }
}
