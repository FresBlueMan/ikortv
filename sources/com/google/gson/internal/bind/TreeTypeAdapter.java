package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0453h;
import com.google.gson.C0454i;
import com.google.gson.C0484p;
import com.google.gson.C0485q;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.internal.C0480i;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0448c;

public final class TreeTypeAdapter<T> extends C0487t<T> {
    /* renamed from: a */
    final C0451e f1768a;
    /* renamed from: b */
    private final C0485q<T> f1769b;
    /* renamed from: c */
    private final C0454i<T> f1770c;
    /* renamed from: d */
    private final C0444a<T> f1771d;
    /* renamed from: e */
    private final C0488u f1772e;
    /* renamed from: f */
    private final C1003a f1773f = new C1003a();
    /* renamed from: g */
    private C0487t<T> f1774g;

    private static final class SingleTypeFactory implements C0488u {
        /* renamed from: a */
        private final C0444a<?> f1762a;
        /* renamed from: b */
        private final boolean f1763b;
        /* renamed from: c */
        private final Class<?> f1764c;
        /* renamed from: d */
        private final C0485q<?> f1765d;
        /* renamed from: e */
        private final C0454i<?> f1766e;

        /* renamed from: a */
        public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
            boolean z;
            if (this.f1762a != null) {
                if (!this.f1762a.equals(c0444a)) {
                    if (!this.f1763b || this.f1762a.m573b() != c0444a.m572a()) {
                        z = false;
                    }
                }
                z = true;
            } else {
                z = this.f1764c.isAssignableFrom(c0444a.m572a());
            }
            return z ? new TreeTypeAdapter(this.f1765d, this.f1766e, c0451e, c0444a, this) : null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    private final class C1003a implements C0453h, C0484p {
        /* renamed from: a */
        final /* synthetic */ TreeTypeAdapter f1767a;

        private C1003a(TreeTypeAdapter treeTypeAdapter) {
            this.f1767a = treeTypeAdapter;
        }
    }

    public TreeTypeAdapter(C0485q<T> c0485q, C0454i<T> c0454i, C0451e c0451e, C0444a<T> c0444a, C0488u c0488u) {
        this.f1769b = c0485q;
        this.f1770c = c0454i;
        this.f1768a = c0451e;
        this.f1771d = c0444a;
        this.f1772e = c0488u;
    }

    /* renamed from: b */
    public T mo1260b(C0446a c0446a) {
        if (this.f1770c == null) {
            return m2026b().mo1260b(c0446a);
        }
        c0446a = C0480i.m720a(c0446a);
        if (c0446a.m735j()) {
            return null;
        }
        return this.f1770c.m662a(c0446a, this.f1771d.m573b(), this.f1773f);
    }

    /* renamed from: a */
    public void mo1259a(C0448c c0448c, T t) {
        if (this.f1769b == null) {
            m2026b().mo1259a(c0448c, t);
        } else if (t == null) {
            c0448c.mo1301f();
        } else {
            C0480i.m722a(this.f1769b.m740a(t, this.f1771d.m573b(), this.f1773f), c0448c);
        }
    }

    /* renamed from: b */
    private C0487t<T> m2026b() {
        C0487t<T> c0487t = this.f1774g;
        if (c0487t != null) {
            return c0487t;
        }
        c0487t = this.f1768a.m648a(this.f1772e, this.f1771d);
        this.f1774g = c0487t;
        return c0487t;
    }
}
