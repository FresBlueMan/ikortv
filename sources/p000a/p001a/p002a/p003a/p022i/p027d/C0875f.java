package p000a.p001a.p002a.p003a.p022i.p027d;

import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicDomainHandler */
/* renamed from: a.a.a.a.i.d.f */
public class C0875f implements C0084c {
    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        if (str == null) {
            throw new C1254l("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            c0830m.mo1616d(str);
        } else {
            throw new C1254l("Blank value for domain attribute");
        }
    }

    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        c0086e = c0086e.m229a();
        c0083b = c0083b.mo1619f();
        if (c0083b == null) {
            throw new C1320g("Cookie domain may not be null");
        } else if (c0086e.contains(".")) {
            if (!c0086e.endsWith(c0083b)) {
                if (c0083b.startsWith(".")) {
                    c0083b = c0083b.substring(1, c0083b.length());
                }
                if (!c0086e.equals(c0083b)) {
                    r1 = new StringBuilder();
                    r1.append("Illegal domain attribute \"");
                    r1.append(c0083b);
                    r1.append("\". Domain of origin: \"");
                    r1.append(c0086e);
                    r1.append("\"");
                    throw new C1320g(r1.toString());
                }
            }
        } else if (!c0086e.equals(c0083b)) {
            r1 = new StringBuilder();
            r1.append("Illegal domain attribute \"");
            r1.append(c0083b);
            r1.append("\". Domain of origin: \"");
            r1.append(c0086e);
            r1.append("\"");
            throw new C1320g(r1.toString());
        }
    }

    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        c0086e = c0086e.m229a();
        c0083b = c0083b.mo1619f();
        boolean z = false;
        if (c0083b == null) {
            return false;
        }
        if (c0086e.equals(c0083b)) {
            return true;
        }
        if (!c0083b.startsWith(".")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('.');
            stringBuilder.append(c0083b);
            c0083b = stringBuilder.toString();
        }
        if (c0086e.endsWith(c0083b) || c0086e.equals(c0083b.substring(1)) != null) {
            z = true;
        }
        return z;
    }
}
