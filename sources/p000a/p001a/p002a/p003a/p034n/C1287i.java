package p000a.p001a.p002a.p003a.p034n;

import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0172u;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;

/* compiled from: ImmutableHttpProcessor */
/* renamed from: a.a.a.a.n.i */
public final class C1287i implements C0909g {
    /* renamed from: a */
    private final C0170r[] f2206a;
    /* renamed from: b */
    private final C0172u[] f2207b;

    public C1287i(C0170r[] c0170rArr, C0172u[] c0172uArr) {
        if (c0170rArr != null) {
            int length = c0170rArr.length;
            this.f2206a = new C0170r[length];
            System.arraycopy(c0170rArr, 0, this.f2206a, 0, length);
        } else {
            this.f2206a = new C0170r[0];
        }
        if (c0172uArr != null) {
            c0170rArr = c0172uArr.length;
            this.f2207b = new C0172u[c0170rArr];
            System.arraycopy(c0172uArr, 0, this.f2207b, 0, c0170rArr);
            return;
        }
        this.f2207b = new C0172u[0];
    }

    public void process(C0915q c0915q, C0157e c0157e) {
        for (C0170r process : this.f2206a) {
            process.process(c0915q, c0157e);
        }
    }

    public void process(C0916s c0916s, C0157e c0157e) {
        for (C0172u process : this.f2207b) {
            process.process(c0916s, c0157e);
        }
    }
}
