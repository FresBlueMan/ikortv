package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Locale;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RFC2109DomainHandler */
/* renamed from: a.a.a.a.i.d.w */
public class C0882w implements C0084c {
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
        } else if (!c0083b.equals(c0086e)) {
            StringBuilder stringBuilder;
            if (c0083b.indexOf(46) == -1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Domain attribute \"");
                stringBuilder.append(c0083b);
                stringBuilder.append("\" does not match the host \"");
                stringBuilder.append(c0086e);
                stringBuilder.append("\"");
                throw new C1320g(stringBuilder.toString());
            } else if (c0083b.startsWith(".")) {
                int indexOf = c0083b.indexOf(46, 1);
                if (indexOf < 0 || indexOf == c0083b.length() - 1) {
                    r0 = new StringBuilder();
                    r0.append("Domain attribute \"");
                    r0.append(c0083b);
                    r0.append("\" violates RFC 2109: domain must contain an embedded dot");
                    throw new C1320g(r0.toString());
                }
                c0086e = c0086e.toLowerCase(Locale.ENGLISH);
                if (!c0086e.endsWith(c0083b)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Illegal domain attribute \"");
                    stringBuilder.append(c0083b);
                    stringBuilder.append("\". Domain of origin: \"");
                    stringBuilder.append(c0086e);
                    stringBuilder.append("\"");
                    throw new C1320g(stringBuilder.toString());
                } else if (c0086e.substring(0, c0086e.length() - c0083b.length()).indexOf(46) != -1) {
                    r0 = new StringBuilder();
                    r0.append("Domain attribute \"");
                    r0.append(c0083b);
                    r0.append("\" violates RFC 2109: host minus domain may not contain any dots");
                    throw new C1320g(r0.toString());
                }
            } else {
                r0 = new StringBuilder();
                r0.append("Domain attribute \"");
                r0.append(c0083b);
                r0.append("\" violates RFC 2109: domain must start with a dot");
                throw new C1320g(r0.toString());
            }
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
        if (c0086e.equals(c0083b) || (c0083b.startsWith(".") && c0086e.endsWith(c0083b) != null)) {
            z = true;
        }
        return z;
    }
}
