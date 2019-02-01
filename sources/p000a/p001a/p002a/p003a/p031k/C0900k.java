package p000a.p001a.p002a.p003a.p031k;

import java.util.List;
import java.util.NoSuchElementException;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0098h;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

/* compiled from: BasicListHeaderIterator */
/* renamed from: a.a.a.a.k.k */
public class C0900k implements C0098h {
    /* renamed from: a */
    protected final List<C0082e> f1671a;
    /* renamed from: b */
    protected int f1672b = m1878a(-1);
    /* renamed from: c */
    protected int f1673c = -1;
    /* renamed from: d */
    protected String f1674d;

    public C0900k(List<C0082e> list, String str) {
        this.f1671a = (List) C0160a.m478a((Object) list, "Header list");
        this.f1674d = str;
    }

    /* renamed from: a */
    protected int m1878a(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.f1671a.size() - 1;
        boolean z = false;
        while (!z && i < size) {
            i++;
            z = m1880b(i);
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    /* renamed from: b */
    protected boolean m1880b(int i) {
        if (this.f1674d == null) {
            return true;
        }
        return this.f1674d.equalsIgnoreCase(((C0082e) this.f1671a.get(i)).mo121c());
    }

    public boolean hasNext() {
        return this.f1672b >= 0;
    }

    /* renamed from: a */
    public C0082e mo139a() {
        int i = this.f1672b;
        if (i >= 0) {
            this.f1673c = i;
            this.f1672b = m1878a(i);
            return (C0082e) this.f1671a.get(i);
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final Object next() {
        return mo139a();
    }

    public void remove() {
        C0161b.m485a(this.f1673c >= 0, "No header to remove");
        this.f1671a.remove(this.f1673c);
        this.f1673c = -1;
        this.f1672b--;
    }
}
