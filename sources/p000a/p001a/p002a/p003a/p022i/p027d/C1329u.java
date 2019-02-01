package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p031k.C1283p;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: NetscapeDraftSpec */
/* renamed from: a.a.a.a.i.d.u */
public class C1329u extends C1274p {
    /* renamed from: a */
    private final String[] f2294a;

    /* renamed from: a */
    public int mo96a() {
        return 0;
    }

    /* renamed from: b */
    public C0082e mo100b() {
        return null;
    }

    public String toString() {
        return "netscape";
    }

    public C1329u(String[] strArr) {
        if (strArr != null) {
            this.f2294a = (String[]) strArr.clone();
        } else {
            this.f2294a = new String[]{"EEE, dd-MMM-yy HH:mm:ss z"};
        }
        m1768a("path", new C0876i());
        m1768a("domain", new C1275s());
        m1768a("secure", new C1271j());
        m1768a("comment", new C1268e());
        m1768a("expires", new C1269g(this.f2294a));
    }

    public C1329u() {
        this(null);
    }

    /* renamed from: a */
    public List<C0083b> mo97a(C0082e c0082e, C0086e c0086e) {
        C0160a.m478a((Object) c0082e, "Header");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0082e.mo121c().equalsIgnoreCase("Set-Cookie")) {
            C0163d a;
            C0148u c0148u;
            C0125t c0125t = C0125t.f255a;
            if (c0082e instanceof C0813d) {
                C0813d c0813d = (C0813d) c0082e;
                a = c0813d.mo1631a();
                c0148u = new C0148u(c0813d.mo1632b(), a.m513c());
            } else {
                String d = c0082e.mo122d();
                if (d != null) {
                    a = new C0163d(d.length());
                    a.m507a(d);
                    c0148u = new C0148u(0, a.m513c());
                } else {
                    throw new C1254l("Header value is null");
                }
            }
            return mo2028a((C0091f[]) new C0091f[]{c0125t.m363a(a, c0148u)}, c0086e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized cookie header '");
        stringBuilder.append(c0082e.toString());
        stringBuilder.append("'");
        throw new C1254l(stringBuilder.toString());
    }

    /* renamed from: a */
    public List<C0082e> mo98a(List<C0083b> list) {
        C0160a.m479a((Collection) list, "List of cookies");
        C0163d c0163d = new C0163d(list.size() * 20);
        c0163d.m507a("Cookie");
        c0163d.m507a(": ");
        for (int i = 0; i < list.size(); i++) {
            C0083b c0083b = (C0083b) list.get(i);
            if (i > 0) {
                c0163d.m507a("; ");
            }
            c0163d.m507a(c0083b.mo1605a());
            String b = c0083b.mo1610b();
            if (b != null) {
                c0163d.m507a("=");
                c0163d.m507a(b);
            }
        }
        list = new ArrayList(1);
        list.add(new C1283p(c0163d));
        return list;
    }
}
