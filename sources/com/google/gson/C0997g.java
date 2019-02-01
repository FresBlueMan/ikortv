package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray */
/* renamed from: com.google.gson.g */
public final class C0997g extends C0482j implements Iterable<C0482j> {
    /* renamed from: a */
    private final List<C0482j> f1725a = new ArrayList();

    /* renamed from: a */
    public void m1976a(C0482j c0482j) {
        if (c0482j == null) {
            c0482j = C1040l.f1849a;
        }
        this.f1725a.add(c0482j);
    }

    public Iterator<C0482j> iterator() {
        return this.f1725a.iterator();
    }

    /* renamed from: a */
    public Number mo1261a() {
        if (this.f1725a.size() == 1) {
            return ((C0482j) this.f1725a.get(0)).mo1261a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public String mo1262b() {
        if (this.f1725a.size() == 1) {
            return ((C0482j) this.f1725a.get(0)).mo1262b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public double mo1263c() {
        if (this.f1725a.size() == 1) {
            return ((C0482j) this.f1725a.get(0)).mo1263c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public long mo1264d() {
        if (this.f1725a.size() == 1) {
            return ((C0482j) this.f1725a.get(0)).mo1264d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public int mo1265e() {
        if (this.f1725a.size() == 1) {
            return ((C0482j) this.f1725a.get(0)).mo1265e();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public boolean mo1266f() {
        if (this.f1725a.size() == 1) {
            return ((C0482j) this.f1725a.get(0)).mo1266f();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C0997g) || ((C0997g) obj).f1725a.equals(this.f1725a) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f1725a.hashCode();
    }
}
