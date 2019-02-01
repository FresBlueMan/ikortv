package p000a.p001a.p002a.p003a.p034n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0172u;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;

@Deprecated
/* compiled from: BasicHttpProcessor */
/* renamed from: a.a.a.a.n.b */
public final class C1286b implements C0909g, Cloneable {
    /* renamed from: a */
    protected final List<C0170r> f2204a = new ArrayList();
    /* renamed from: b */
    protected final List<C0172u> f2205b = new ArrayList();

    /* renamed from: a */
    public void m2699a(C0170r c0170r) {
        if (c0170r != null) {
            this.f2204a.add(c0170r);
        }
    }

    /* renamed from: a */
    public void m2700a(C0170r c0170r, int i) {
        if (c0170r != null) {
            this.f2204a.add(i, c0170r);
        }
    }

    /* renamed from: a */
    public void m2702a(Class<? extends C0170r> cls) {
        Iterator it = this.f2204a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final void m2705b(C0170r c0170r) {
        m2699a(c0170r);
    }

    /* renamed from: b */
    public final void m2706b(C0170r c0170r, int i) {
        m2700a(c0170r, i);
    }

    /* renamed from: a */
    public int m2696a() {
        return this.f2204a.size();
    }

    /* renamed from: a */
    public C0170r m2697a(int i) {
        if (i >= 0) {
            if (i < this.f2204a.size()) {
                return (C0170r) this.f2204a.get(i);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void m2701a(C0172u c0172u) {
        if (c0172u != null) {
            this.f2205b.add(c0172u);
        }
    }

    /* renamed from: b */
    public final void m2707b(C0172u c0172u) {
        m2701a(c0172u);
    }

    /* renamed from: b */
    public int m2703b() {
        return this.f2205b.size();
    }

    /* renamed from: b */
    public C0172u m2704b(int i) {
        if (i >= 0) {
            if (i < this.f2205b.size()) {
                return (C0172u) this.f2205b.get(i);
            }
        }
        return 0;
    }

    public void process(C0915q c0915q, C0157e c0157e) {
        for (C0170r process : this.f2204a) {
            process.process(c0915q, c0157e);
        }
    }

    public void process(C0916s c0916s, C0157e c0157e) {
        for (C0172u process : this.f2205b) {
            process.process(c0916s, c0157e);
        }
    }

    /* renamed from: a */
    protected void m2698a(C1286b c1286b) {
        c1286b.f2204a.clear();
        c1286b.f2204a.addAll(this.f2204a);
        c1286b.f2205b.clear();
        c1286b.f2205b.addAll(this.f2205b);
    }

    public Object clone() {
        C1286b c1286b = (C1286b) super.clone();
        m2698a(c1286b);
        return c1286b;
    }
}
