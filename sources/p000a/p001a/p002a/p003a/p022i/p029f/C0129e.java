package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.IOException;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0173w;
import p000a.p001a.p002a.p003a.ah;
import p000a.p001a.p002a.p003a.p030j.C0135a;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: ChunkedInputStream */
/* renamed from: a.a.a.a.i.f.e */
public class C0129e extends InputStream {
    /* renamed from: a */
    private final C0140f f262a;
    /* renamed from: b */
    private final C0163d f263b;
    /* renamed from: c */
    private int f264c;
    /* renamed from: d */
    private int f265d;
    /* renamed from: e */
    private int f266e;
    /* renamed from: f */
    private boolean f267f = false;
    /* renamed from: g */
    private boolean f268g = false;
    /* renamed from: h */
    private C0082e[] f269h = new C0082e[0];

    public C0129e(C0140f c0140f) {
        this.f262a = (C0140f) C0160a.m478a((Object) c0140f, "Session input buffer");
        this.f266e = 0;
        this.f263b = new C0163d(16);
        this.f264c = 1;
    }

    public int available() {
        return this.f262a instanceof C0135a ? Math.min(((C0135a) this.f262a).mo106e(), this.f265d - this.f266e) : 0;
    }

    public int read() {
        if (this.f268g) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f267f) {
            return -1;
        } else {
            if (this.f264c != 2) {
                m370a();
                if (this.f267f) {
                    return -1;
                }
            }
            int a = this.f262a.mo78a();
            if (a != -1) {
                this.f266e++;
                if (this.f266e >= this.f265d) {
                    this.f264c = 3;
                }
            }
            return a;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f268g) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f267f) {
            return -1;
        } else {
            if (this.f264c != 2) {
                m370a();
                if (this.f267f) {
                    return -1;
                }
            }
            bArr = this.f262a.mo80a(bArr, i, Math.min(i2, this.f265d - this.f266e));
            if (bArr != -1) {
                this.f266e += bArr;
                if (this.f266e >= this.f265d) {
                    this.f264c = 3;
                }
                return bArr;
            }
            this.f267f = 1;
            i = new StringBuilder();
            i.append("Truncated chunk ( expected size: ");
            i.append(this.f265d);
            i.append("; actual size: ");
            i.append(this.f266e);
            i.append(")");
            throw new ah(i.toString());
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private void m370a() {
        this.f265d = m371b();
        if (this.f265d >= 0) {
            this.f264c = 2;
            this.f266e = 0;
            if (this.f265d == 0) {
                this.f267f = true;
                m372c();
                return;
            }
            return;
        }
        throw new C0173w("Negative chunk size");
    }

    /* renamed from: b */
    private int m371b() {
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
        r5 = this;
        r0 = r5.f264c;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        if (r0 == r2) goto L_0x0035;
    L_0x0007:
        r4 = 3;
        if (r0 != r4) goto L_0x002d;
    L_0x000a:
        r0 = r5.f263b;
        r0.m503a();
        r0 = r5.f262a;
        r4 = r5.f263b;
        r0 = r0.mo79a(r4);
        if (r0 != r1) goto L_0x001a;
    L_0x0019:
        return r3;
    L_0x001a:
        r0 = r5.f263b;
        r0 = r0.m515d();
        if (r0 == 0) goto L_0x0025;
    L_0x0022:
        r5.f264c = r2;
        goto L_0x0035;
    L_0x0025:
        r0 = new a.a.a.a.w;
        r1 = "Unexpected content at the end of chunk";
        r0.<init>(r1);
        throw r0;
    L_0x002d:
        r0 = new java.lang.IllegalStateException;
        r1 = "Inconsistent codec state";
        r0.<init>(r1);
        throw r0;
    L_0x0035:
        r0 = r5.f263b;
        r0.m503a();
        r0 = r5.f262a;
        r2 = r5.f263b;
        r0 = r0.mo79a(r2);
        if (r0 != r1) goto L_0x0045;
    L_0x0044:
        return r3;
    L_0x0045:
        r0 = r5.f263b;
        r1 = 59;
        r0 = r0.m514c(r1);
        if (r0 >= 0) goto L_0x0055;
    L_0x004f:
        r0 = r5.f263b;
        r0 = r0.m513c();
    L_0x0055:
        r1 = r5.f263b;	 Catch:{ NumberFormatException -> 0x0062 }
        r0 = r1.m510b(r3, r0);	 Catch:{ NumberFormatException -> 0x0062 }
        r1 = 16;	 Catch:{ NumberFormatException -> 0x0062 }
        r0 = java.lang.Integer.parseInt(r0, r1);	 Catch:{ NumberFormatException -> 0x0062 }
        return r0;
    L_0x0062:
        r0 = new a.a.a.a.w;
        r1 = "Bad chunk header";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.f.e.b():int");
    }

    /* renamed from: c */
    private void m372c() {
        try {
            this.f269h = C0887a.m1802a(this.f262a, -1, -1, null);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid footer: ");
            stringBuilder.append(e.getMessage());
            IOException c0173w = new C0173w(stringBuilder.toString());
            c0173w.initCause(e);
            throw c0173w;
        }
    }

    public void close() {
        if (!this.f268g) {
            try {
                if (!this.f267f) {
                    while (read(new byte[2048]) >= 0) {
                    }
                }
                this.f267f = true;
                this.f268g = true;
            } catch (Throwable th) {
                this.f267f = true;
                this.f268g = true;
            }
        }
    }
}
