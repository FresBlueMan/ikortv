package p000a.p001a.p002a.p003a.p022i.p023a;

import java.util.Locale;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0008k;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p004a.C0801l;
import p000a.p001a.p002a.p003a.p004a.C1235o;
import p000a.p001a.p002a.p003a.p034n.C0156d;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: AuthSchemeBase */
/* renamed from: a.a.a.a.i.a.a */
public abstract class C1259a implements C0801l {
    /* renamed from: a */
    private C0008k f2136a;

    /* renamed from: a */
    protected abstract void mo1919a(C0163d c0163d, int i, int i2);

    /* renamed from: a */
    public void mo1592a(C0082e c0082e) {
        C0163d a;
        int b;
        C0160a.m478a((Object) c0082e, "Header");
        String c = c0082e.mo121c();
        if (c.equalsIgnoreCase("WWW-Authenticate")) {
            this.f2136a = C0008k.TARGET;
        } else if (c.equalsIgnoreCase("Proxy-Authenticate")) {
            this.f2136a = C0008k.PROXY;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected header name: ");
            stringBuilder.append(c);
            throw new C1235o(stringBuilder.toString());
        }
        if (c0082e instanceof C0813d) {
            C0813d c0813d = (C0813d) c0082e;
            a = c0813d.mo1631a();
            b = c0813d.mo1632b();
        } else {
            String d = c0082e.mo122d();
            if (d != null) {
                a = new C0163d(d.length());
                a.m507a(d);
                b = null;
            } else {
                throw new C1235o("Header value is null");
            }
        }
        while (b < a.m513c() && C0156d.m460a(a.m500a(b))) {
            b++;
        }
        int i = b;
        while (i < a.m513c() && !C0156d.m460a(a.m500a(i))) {
            i++;
        }
        c0082e = a.m502a(b, i);
        if (c0082e.equalsIgnoreCase(mo1918a())) {
            mo1919a(a, i, a.m513c());
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid scheme identifier: ");
        stringBuilder.append(c0082e);
        throw new C1235o(stringBuilder.toString());
    }

    /* renamed from: a */
    public C0082e mo1591a(C0009m c0009m, C0915q c0915q, C0157e c0157e) {
        return mo1917a(c0009m, c0915q);
    }

    /* renamed from: e */
    public boolean m2562e() {
        return this.f2136a != null && this.f2136a == C0008k.PROXY;
    }

    public String toString() {
        String a = mo1918a();
        if (a != null) {
            return a.toUpperCase(Locale.ENGLISH);
        }
        return super.toString();
    }
}
