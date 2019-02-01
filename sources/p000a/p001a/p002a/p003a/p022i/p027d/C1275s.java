package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Locale;
import java.util.StringTokenizer;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: NetscapeDomainHandler */
/* renamed from: a.a.a.a.i.d.s */
public class C1275s extends C0875f {
    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        super.mo92a(c0083b, c0086e);
        c0086e = c0086e.m229a();
        c0083b = c0083b.mo1619f();
        if (c0086e.contains(".") != null) {
            c0086e = new StringTokenizer(c0083b, ".").countTokens();
            StringBuilder stringBuilder;
            if (C1275s.m2672a(c0083b)) {
                if (c0086e < 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Domain attribute \"");
                    stringBuilder.append(c0083b);
                    stringBuilder.append("\" violates the Netscape cookie specification for ");
                    stringBuilder.append("special domains");
                    throw new C1320g(stringBuilder.toString());
                }
            } else if (c0086e < 3) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Domain attribute \"");
                stringBuilder.append(c0083b);
                stringBuilder.append("\" violates the Netscape cookie specification");
                throw new C1320g(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private static boolean m2672a(String str) {
        str = str.toUpperCase(Locale.ENGLISH);
        if (!(str.endsWith(".COM") || str.endsWith(".EDU") || str.endsWith(".NET") || str.endsWith(".GOV") || str.endsWith(".MIL") || str.endsWith(".ORG"))) {
            if (str.endsWith(".INT") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        c0086e = c0086e.m229a();
        c0083b = c0083b.mo1619f();
        if (c0083b == null) {
            return null;
        }
        return c0086e.endsWith(c0083b);
    }
}
