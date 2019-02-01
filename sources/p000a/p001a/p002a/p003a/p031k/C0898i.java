package p000a.p001a.p002a.p003a.p031k;

import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.ae;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BasicLineFormatter */
/* renamed from: a.a.a.a.k.i */
public class C0898i implements C0146s {
    @Deprecated
    /* renamed from: a */
    public static final C0898i f1666a = new C0898i();
    /* renamed from: b */
    public static final C0898i f1667b = new C0898i();

    /* renamed from: a */
    protected C0163d m1863a(C0163d c0163d) {
        if (c0163d == null) {
            return new C0163d(64);
        }
        c0163d.m503a();
        return c0163d;
    }

    /* renamed from: a */
    public C0163d m1864a(C0163d c0163d, ac acVar) {
        C0160a.m478a((Object) acVar, "Protocol version");
        int a = m1862a(acVar);
        if (c0163d == null) {
            c0163d = new C0163d(a);
        } else {
            c0163d.m511b(a);
        }
        c0163d.m507a(acVar.m26a());
        c0163d.m504a('/');
        c0163d.m507a(Integer.toString(acVar.m28b()));
        c0163d.m504a('.');
        c0163d.m507a(Integer.toString(acVar.m30c()));
        return c0163d;
    }

    /* renamed from: a */
    protected int m1862a(ac acVar) {
        return acVar.m26a().length() + 4;
    }

    /* renamed from: a */
    public C0163d mo134a(C0163d c0163d, ae aeVar) {
        C0160a.m478a((Object) aeVar, "Request line");
        c0163d = m1863a(c0163d);
        m1868b(c0163d, aeVar);
        return c0163d;
    }

    /* renamed from: b */
    protected void m1868b(C0163d c0163d, ae aeVar) {
        String a = aeVar.mo143a();
        String c = aeVar.mo145c();
        c0163d.m511b((((a.length() + 1) + c.length()) + 1) + m1862a(aeVar.mo144b()));
        c0163d.m507a(a);
        c0163d.m504a(' ');
        c0163d.m507a(c);
        c0163d.m504a(' ');
        m1864a(c0163d, aeVar.mo144b());
    }

    /* renamed from: a */
    public C0163d m1866a(C0163d c0163d, af afVar) {
        C0160a.m478a((Object) afVar, "Status line");
        c0163d = m1863a(c0163d);
        m1869b(c0163d, afVar);
        return c0163d;
    }

    /* renamed from: b */
    protected void m1869b(C0163d c0163d, af afVar) {
        int a = ((m1862a(afVar.mo146a()) + 1) + 3) + 1;
        String c = afVar.mo148c();
        if (c != null) {
            a += c.length();
        }
        c0163d.m511b(a);
        m1864a(c0163d, afVar.mo146a());
        c0163d.m504a(' ');
        c0163d.m507a(Integer.toString(afVar.mo147b()));
        c0163d.m504a(' ');
        if (c != null) {
            c0163d.m507a(c);
        }
    }

    /* renamed from: a */
    public C0163d mo135a(C0163d c0163d, C0082e c0082e) {
        C0160a.m478a((Object) c0082e, "Header");
        if (c0082e instanceof C0813d) {
            return ((C0813d) c0082e).mo1631a();
        }
        c0163d = m1863a(c0163d);
        m1870b(c0163d, c0082e);
        return c0163d;
    }

    /* renamed from: b */
    protected void m1870b(C0163d c0163d, C0082e c0082e) {
        String c = c0082e.mo121c();
        String d = c0082e.mo122d();
        int length = c.length() + 2;
        if (d != null) {
            length += d.length();
        }
        c0163d.m511b(length);
        c0163d.m507a(c);
        c0163d.m507a(": ");
        if (d != null) {
            c0163d.m507a(d);
        }
    }
}
