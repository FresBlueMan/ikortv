package p000a.p001a.p002a.p003a.p031k;

import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p034n.C0156d;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BasicLineParser */
/* renamed from: a.a.a.a.k.j */
public class C0899j implements C0147t {
    @Deprecated
    /* renamed from: a */
    public static final C0899j f1668a = new C0899j();
    /* renamed from: b */
    public static final C0899j f1669b = new C0899j();
    /* renamed from: c */
    protected final ac f1670c;

    public C0899j(ac acVar) {
        if (acVar == null) {
            acVar = C0917v.f1697c;
        }
        this.f1670c = acVar;
    }

    public C0899j() {
        this(null);
    }

    /* renamed from: a */
    public p000a.p001a.p002a.p003a.ac m1872a(p000a.p001a.p002a.p003a.p035o.C0163d r12, p000a.p001a.p002a.p003a.p031k.C0148u r13) {
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
        r11 = this;
        r0 = "Char array buffer";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r12, r0);
        r0 = "Parser cursor";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r13, r0);
        r0 = r11.f1670c;
        r0 = r0.m26a();
        r1 = r0.length();
        r2 = r13.m426b();
        r3 = r13.m424a();
        r11.m1877d(r12, r13);
        r4 = r13.m426b();
        r5 = r4 + r1;
        r6 = r5 + 4;
        if (r6 > r3) goto L_0x00eb;
    L_0x0029:
        r6 = 0;
        r7 = 1;
        r8 = 1;
        r9 = 0;
    L_0x002d:
        if (r8 == 0) goto L_0x0043;
    L_0x002f:
        if (r9 >= r1) goto L_0x0043;
    L_0x0031:
        r8 = r4 + r9;
        r8 = r12.m500a(r8);
        r10 = r0.charAt(r9);
        if (r8 != r10) goto L_0x003f;
    L_0x003d:
        r8 = 1;
        goto L_0x0040;
    L_0x003f:
        r8 = 0;
    L_0x0040:
        r9 = r9 + 1;
        goto L_0x002d;
    L_0x0043:
        if (r8 == 0) goto L_0x0050;
    L_0x0045:
        r0 = r12.m500a(r5);
        r5 = 47;
        if (r0 != r5) goto L_0x004f;
    L_0x004d:
        r8 = 1;
        goto L_0x0050;
    L_0x004f:
        r8 = 0;
    L_0x0050:
        if (r8 == 0) goto L_0x00d0;
    L_0x0052:
        r1 = r1 + r7;
        r4 = r4 + r1;
        r0 = 46;
        r0 = r12.m501a(r0, r4, r3);
        r1 = -1;
        if (r0 == r1) goto L_0x00b5;
    L_0x005d:
        r4 = r12.m510b(r4, r0);	 Catch:{ NumberFormatException -> 0x009a }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x009a }
        r0 = r0 + r7;
        r5 = 32;
        r5 = r12.m501a(r5, r0, r3);
        if (r5 != r1) goto L_0x006f;
    L_0x006e:
        r5 = r3;
    L_0x006f:
        r0 = r12.m510b(r0, r5);	 Catch:{ NumberFormatException -> 0x007f }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x007f }
        r13.m425a(r5);
        r12 = r11.m1871a(r4, r0);
        return r12;
    L_0x007f:
        r13 = new a.a.a.a.aa;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Invalid protocol minor version number: ";
        r0.append(r1);
        r12 = r12.m502a(r2, r3);
        r0.append(r12);
        r12 = r0.toString();
        r13.<init>(r12);
        throw r13;
    L_0x009a:
        r13 = new a.a.a.a.aa;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Invalid protocol major version number: ";
        r0.append(r1);
        r12 = r12.m502a(r2, r3);
        r0.append(r12);
        r12 = r0.toString();
        r13.<init>(r12);
        throw r13;
    L_0x00b5:
        r13 = new a.a.a.a.aa;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Invalid protocol version number: ";
        r0.append(r1);
        r12 = r12.m502a(r2, r3);
        r0.append(r12);
        r12 = r0.toString();
        r13.<init>(r12);
        throw r13;
    L_0x00d0:
        r13 = new a.a.a.a.aa;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Not a valid protocol version: ";
        r0.append(r1);
        r12 = r12.m502a(r2, r3);
        r0.append(r12);
        r12 = r0.toString();
        r13.<init>(r12);
        throw r13;
    L_0x00eb:
        r13 = new a.a.a.a.aa;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Not a valid protocol version: ";
        r0.append(r1);
        r12 = r12.m502a(r2, r3);
        r0.append(r12);
        r12 = r0.toString();
        r13.<init>(r12);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.k.j.a(a.a.a.a.o.d, a.a.a.a.k.u):a.a.a.a.ac");
    }

    /* renamed from: a */
    protected ac m1871a(int i, int i2) {
        return this.f1670c.mo161a(i, i2);
    }

    /* renamed from: b */
    public boolean mo137b(C0163d c0163d, C0148u c0148u) {
        C0160a.m478a((Object) c0163d, "Char array buffer");
        C0160a.m478a((Object) c0148u, "Parser cursor");
        c0148u = c0148u.m426b();
        String a = this.f1670c.m26a();
        int length = a.length();
        if (c0163d.m513c() < length + 4) {
            return false;
        }
        if (c0148u < null) {
            c0148u = (c0163d.m513c() - 4) - length;
        } else if (c0148u == null) {
            while (c0148u < c0163d.m513c() && C0156d.m460a(c0163d.m500a((int) c0148u))) {
                c0148u++;
            }
        }
        int i = c0148u + length;
        if (i + 4 > c0163d.m513c()) {
            return false;
        }
        boolean z = true;
        int i2 = 0;
        while (z && i2 < length) {
            z = c0163d.m500a(c0148u + i2) == a.charAt(i2);
            i2++;
        }
        if (z) {
            z = c0163d.m500a(i) == 47;
        }
        return z;
    }

    /* renamed from: c */
    public p000a.p001a.p002a.p003a.af mo138c(p000a.p001a.p002a.p003a.p035o.C0163d r7, p000a.p001a.p002a.p003a.p031k.C0148u r8) {
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
        r6 = this;
        r0 = "Char array buffer";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r7, r0);
        r0 = "Parser cursor";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r8, r0);
        r0 = r8.m426b();
        r1 = r8.m424a();
        r2 = r6.m1872a(r7, r8);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r6.m1877d(r7, r8);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r8 = r8.m426b();	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r3 = 32;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r3 = r7.m501a(r3, r8, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        if (r3 >= 0) goto L_0x0026;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0025:
        r3 = r1;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0026:
        r8 = r7.m510b(r8, r3);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r4 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x002b:
        r5 = r8.length();	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        if (r4 >= r5) goto L_0x0059;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0031:
        r5 = r8.charAt(r4);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r5 = java.lang.Character.isDigit(r5);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        if (r5 == 0) goto L_0x003e;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x003b:
        r4 = r4 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        goto L_0x002b;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x003e:
        r8 = new a.a.a.a.aa;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r3 = "Status line contains invalid status code: ";	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r3 = r7.m502a(r0, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2 = r2.toString();	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r8.<init>(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        throw r8;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0059:
        r8 = java.lang.Integer.parseInt(r8);	 Catch:{ NumberFormatException -> 0x006b }
        if (r3 >= r1) goto L_0x0064;
    L_0x005f:
        r3 = r7.m510b(r3, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        goto L_0x0066;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0064:
        r3 = "";	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0066:
        r8 = r6.m1873a(r2, r8, r3);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        return r8;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x006b:
        r8 = new a.a.a.a.aa;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r3 = "Status line contains invalid status code: ";	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r3 = r7.m502a(r0, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r2 = r2.toString();	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        r8.<init>(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
        throw r8;	 Catch:{ IndexOutOfBoundsException -> 0x0086 }
    L_0x0086:
        r8 = new a.a.a.a.aa;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Invalid status line: ";
        r2.append(r3);
        r7 = r7.m502a(r0, r1);
        r2.append(r7);
        r7 = r2.toString();
        r8.<init>(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.k.j.c(a.a.a.a.o.d, a.a.a.a.k.u):a.a.a.a.af");
    }

    /* renamed from: a */
    protected af m1873a(ac acVar, int i, String str) {
        return new C0903n(acVar, i, str);
    }

    /* renamed from: a */
    public C0082e mo136a(C0163d c0163d) {
        return new C1283p(c0163d);
    }

    /* renamed from: d */
    protected void m1877d(C0163d c0163d, C0148u c0148u) {
        int b = c0148u.m426b();
        int a = c0148u.m424a();
        while (b < a && C0156d.m460a(c0163d.m500a(b))) {
            b++;
        }
        c0148u.m425a(b);
    }
}
