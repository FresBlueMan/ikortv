package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Locale;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0827a;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RFC2965DomainAttributeHandler */
/* renamed from: a.a.a.a.i.d.ac */
public class ac implements C0084c {
    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        if (str == null) {
            throw new C1254l("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            String toLowerCase = str.toLowerCase(Locale.ENGLISH);
            if (str.startsWith(".") == null) {
                str = new StringBuilder();
                str.append('.');
                str.append(toLowerCase);
                toLowerCase = str.toString();
            }
            c0830m.mo1616d(toLowerCase);
        } else {
            throw new C1254l("Blank value for domain attribute");
        }
    }

    /* renamed from: a */
    public boolean m1755a(String str, String str2) {
        if (!str.equals(str2)) {
            if (!str2.startsWith(".") || str.endsWith(str2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        String toLowerCase = c0086e.m229a().toLowerCase(Locale.ENGLISH);
        if (c0083b.mo1619f() != null) {
            String toLowerCase2 = c0083b.mo1619f().toLowerCase(Locale.ENGLISH);
            if ((c0083b instanceof C0827a) && ((C0827a) c0083b).mo1612b("domain")) {
                StringBuilder stringBuilder;
                if (toLowerCase2.startsWith(".")) {
                    int indexOf = toLowerCase2.indexOf(46, 1);
                    if ((indexOf < 0 || indexOf == toLowerCase2.length() - 1) && !toLowerCase2.equals(".local")) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Domain attribute \"");
                        stringBuilder.append(c0083b.mo1619f());
                        stringBuilder.append("\" violates RFC 2965: the value contains no embedded dots ");
                        stringBuilder.append("and the value is not .local");
                        throw new C1320g(stringBuilder.toString());
                    } else if (!m1755a(toLowerCase, toLowerCase2)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Domain attribute \"");
                        stringBuilder.append(c0083b.mo1619f());
                        stringBuilder.append("\" violates RFC 2965: effective host name does not ");
                        stringBuilder.append("domain-match domain attribute.");
                        throw new C1320g(stringBuilder.toString());
                    } else if (toLowerCase.substring(0, toLowerCase.length() - toLowerCase2.length()).indexOf(46) != -1) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Domain attribute \"");
                        stringBuilder.append(c0083b.mo1619f());
                        stringBuilder.append("\" violates RFC 2965: ");
                        stringBuilder.append("effective host minus domain may not contain any dots");
                        throw new C1320g(stringBuilder.toString());
                    } else {
                        return;
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Domain attribute \"");
                stringBuilder.append(c0083b.mo1619f());
                stringBuilder.append("\" violates RFC 2109: domain must start with a dot");
                throw new C1320g(stringBuilder.toString());
            } else if (!c0083b.mo1619f().equals(toLowerCase)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Illegal domain attribute: \"");
                stringBuilder2.append(c0083b.mo1619f());
                stringBuilder2.append("\".");
                stringBuilder2.append("Domain of origin: \"");
                stringBuilder2.append(toLowerCase);
                stringBuilder2.append("\"");
                throw new C1320g(stringBuilder2.toString());
            } else {
                return;
            }
        }
        throw new C1320g("Invalid cookie state: domain not specified");
    }

    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        String toLowerCase = c0086e.m229a().toLowerCase(Locale.ENGLISH);
        String f = c0083b.mo1619f();
        boolean z = false;
        if (!m1755a(toLowerCase, f)) {
            return false;
        }
        if (toLowerCase.substring(0, toLowerCase.length() - f.length()).indexOf(46) == -1) {
            z = true;
        }
        return z;
    }
}
