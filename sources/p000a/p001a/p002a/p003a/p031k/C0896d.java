package p000a.p001a.p002a.p003a.p031k;

import java.util.NoSuchElementException;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0094g;
import p000a.p001a.p002a.p003a.C0098h;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BasicHeaderElementIterator */
/* renamed from: a.a.a.a.k.d */
public class C0896d implements C0094g {
    /* renamed from: a */
    private final C0098h f1658a;
    /* renamed from: b */
    private final C0145r f1659b;
    /* renamed from: c */
    private C0091f f1660c;
    /* renamed from: d */
    private C0163d f1661d;
    /* renamed from: e */
    private C0148u f1662e;

    public C0896d(C0098h c0098h, C0145r c0145r) {
        this.f1660c = null;
        this.f1661d = null;
        this.f1662e = null;
        this.f1658a = (C0098h) C0160a.m478a((Object) c0098h, "Header iterator");
        this.f1659b = (C0145r) C0160a.m478a((Object) c0145r, "Parser");
    }

    public C0896d(C0098h c0098h) {
        this(c0098h, C0897f.f1664b);
    }

    /* renamed from: b */
    private void m1850b() {
        this.f1662e = null;
        this.f1661d = null;
        while (this.f1658a.hasNext()) {
            C0082e a = this.f1658a.mo139a();
            if (a instanceof C0813d) {
                C0813d c0813d = (C0813d) a;
                this.f1661d = c0813d.mo1631a();
                this.f1662e = new C0148u(0, this.f1661d.m513c());
                this.f1662e.m425a(c0813d.mo1632b());
                return;
            }
            String d = a.mo122d();
            if (d != null) {
                this.f1661d = new C0163d(d.length());
                this.f1661d.m507a(d);
                this.f1662e = new C0148u(0, this.f1661d.m513c());
                return;
            }
        }
    }

    /* renamed from: c */
    private void m1851c() {
        C0091f b;
        loop0:
        while (true) {
            if (!this.f1658a.hasNext()) {
                if (this.f1662e == null) {
                    return;
                }
            }
            if (this.f1662e == null || this.f1662e.m427c()) {
                m1850b();
            }
            if (this.f1662e != null) {
                while (!this.f1662e.m427c()) {
                    b = this.f1659b.mo133b(this.f1661d, this.f1662e);
                    if (b.mo126a().length() == 0) {
                        if (b.mo127b() != null) {
                            break loop0;
                        }
                    }
                    break loop0;
                }
                if (this.f1662e.m427c()) {
                    this.f1662e = null;
                    this.f1661d = null;
                }
            }
        }
        this.f1660c = b;
    }

    public boolean hasNext() {
        if (this.f1660c == null) {
            m1851c();
        }
        return this.f1660c != null;
    }

    /* renamed from: a */
    public C0091f mo130a() {
        if (this.f1660c == null) {
            m1851c();
        }
        if (this.f1660c != null) {
            C0091f c0091f = this.f1660c;
            this.f1660c = null;
            return c0091f;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    public final Object next() {
        return mo130a();
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
