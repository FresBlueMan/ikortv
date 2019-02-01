package p000a.p001a.p002a.p003a.p031k;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0098h;

/* compiled from: HeaderGroup */
/* renamed from: a.a.a.a.k.q */
public class C0144q implements Serializable, Cloneable {
    private static final long serialVersionUID = 2608834160639271617L;
    /* renamed from: a */
    private final List<C0082e> f289a = new ArrayList(16);

    /* renamed from: a */
    public void m405a() {
        this.f289a.clear();
    }

    /* renamed from: a */
    public void m406a(C0082e c0082e) {
        if (c0082e != null) {
            this.f289a.add(c0082e);
        }
    }

    /* renamed from: b */
    public void m410b(C0082e c0082e) {
        if (c0082e != null) {
            this.f289a.remove(c0082e);
        }
    }

    /* renamed from: c */
    public void m414c(C0082e c0082e) {
        if (c0082e != null) {
            for (int i = 0; i < this.f289a.size(); i++) {
                if (((C0082e) this.f289a.get(i)).mo121c().equalsIgnoreCase(c0082e.mo121c())) {
                    this.f289a.set(i, c0082e);
                    return;
                }
            }
            this.f289a.add(c0082e);
        }
    }

    /* renamed from: a */
    public void m407a(C0082e[] c0082eArr) {
        m405a();
        if (c0082eArr != null) {
            Collections.addAll(this.f289a, c0082eArr);
        }
    }

    /* renamed from: a */
    public C0082e[] m408a(String str) {
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f289a.size(); i++) {
            C0082e c0082e = (C0082e) this.f289a.get(i);
            if (c0082e.mo121c().equalsIgnoreCase(str)) {
                arrayList.add(c0082e);
            }
        }
        return (C0082e[]) arrayList.toArray(new C0082e[arrayList.size()]);
    }

    /* renamed from: b */
    public C0082e m409b(String str) {
        for (int i = 0; i < this.f289a.size(); i++) {
            C0082e c0082e = (C0082e) this.f289a.get(i);
            if (c0082e.mo121c().equalsIgnoreCase(str)) {
                return c0082e;
            }
        }
        return null;
    }

    /* renamed from: c */
    public C0082e m412c(String str) {
        for (int size = this.f289a.size() - 1; size >= 0; size--) {
            C0082e c0082e = (C0082e) this.f289a.get(size);
            if (c0082e.mo121c().equalsIgnoreCase(str)) {
                return c0082e;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0082e[] m411b() {
        return (C0082e[]) this.f289a.toArray(new C0082e[this.f289a.size()]);
    }

    /* renamed from: d */
    public boolean m415d(String str) {
        for (int i = 0; i < this.f289a.size(); i++) {
            if (((C0082e) this.f289a.get(i)).mo121c().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C0098h m413c() {
        return new C0900k(this.f289a, null);
    }

    /* renamed from: e */
    public C0098h m416e(String str) {
        return new C0900k(this.f289a, str);
    }

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        return this.f289a.toString();
    }
}
