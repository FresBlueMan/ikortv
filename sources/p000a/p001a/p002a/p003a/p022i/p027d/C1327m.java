package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p022i.p027d.C0879n.C0124a;
import p000a.p001a.p002a.p003a.p031k.C0143e;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p031k.C0895c;
import p000a.p001a.p002a.p003a.p031k.C1283p;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;
import p000a.p001a.p002a.p003a.p035o.C0167h;

/* compiled from: BrowserCompatSpec */
/* renamed from: a.a.a.a.i.d.m */
public class C1327m extends C1274p {
    /* renamed from: a */
    private static final String[] f2292a = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    /* renamed from: b */
    private final String[] f2293b;

    /* compiled from: BrowserCompatSpec */
    /* renamed from: a.a.a.a.i.d.m$1 */
    class C12721 extends C0876i {
        /* renamed from: a */
        final /* synthetic */ C1327m f2185a;

        /* renamed from: a */
        public void mo92a(C0083b c0083b, C0086e c0086e) {
        }

        C12721(C1327m c1327m) {
            this.f2185a = c1327m;
        }
    }

    /* renamed from: a */
    public int mo96a() {
        return 0;
    }

    /* renamed from: b */
    public C0082e mo100b() {
        return null;
    }

    public String toString() {
        return "compatibility";
    }

    public C1327m(String[] strArr, C0124a c0124a) {
        if (strArr != null) {
            this.f2293b = (String[]) strArr.clone();
        } else {
            this.f2293b = f2292a;
        }
        switch (c0124a) {
            case SECURITYLEVEL_DEFAULT:
                m1768a("path", new C0876i());
                break;
            case SECURITYLEVEL_IE_MEDIUM:
                m1768a("path", new C12721(this));
                break;
            default:
                throw new RuntimeException("Unknown security level");
        }
        m1768a("domain", new C0875f());
        m1768a("max-age", new C1270h());
        m1768a("secure", new C1271j());
        m1768a("comment", new C1268e());
        m1768a("expires", new C1269g(this.f2293b));
        m1768a("version", new C1273o());
    }

    public C1327m(String[] strArr) {
        this(strArr, C0124a.SECURITYLEVEL_DEFAULT);
    }

    public C1327m() {
        this(null, C0124a.SECURITYLEVEL_DEFAULT);
    }

    /* renamed from: a */
    public List<C0083b> mo97a(C0082e c0082e, C0086e c0086e) {
        C0160a.m478a((Object) c0082e, "Header");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0082e.mo121c().equalsIgnoreCase("Set-Cookie")) {
            C0163d a;
            C0148u c0148u;
            C0091f[] e = c0082e.mo123e();
            Object obj = null;
            Object obj2 = null;
            for (C0091f c0091f : e) {
                if (c0091f.mo125a("version") != null) {
                    obj2 = 1;
                }
                if (c0091f.mo125a("expires") != null) {
                    obj = 1;
                }
            }
            if (obj == null) {
                if (obj2 != null) {
                    return mo2028a(e, c0086e);
                }
            }
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
            c0082e = c0125t.m363a(a, c0148u);
            Object a2 = c0082e.mo126a();
            String b = c0082e.mo127b();
            if (a2 == null || C0167h.m528b(a2)) {
                throw new C1254l("Cookie name may not be empty");
            }
            C0830m c1267c = new C1267c(a2, b);
            c1267c.mo1617e(C1274p.m2667a(c0086e));
            c1267c.mo1616d(C1274p.m2668b(c0086e));
            c0082e = c0082e.mo128c();
            for (c0086e = c0082e.length - 1; c0086e >= null; c0086e--) {
                C0175y c0175y = c0082e[c0086e];
                b = c0175y.mo141a().toLowerCase(Locale.ENGLISH);
                c1267c.m2643a(b, c0175y.mo142b());
                C0084c a3 = m1767a(b);
                if (a3 != null) {
                    a3.mo94a(c1267c, c0175y.mo142b());
                }
            }
            if (obj != null) {
                c1267c.mo1607a(0);
            }
            return Collections.singletonList(c1267c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized cookie header '");
        stringBuilder.append(c0082e.toString());
        stringBuilder.append("'");
        throw new C1254l(stringBuilder.toString());
    }

    /* renamed from: b */
    private static boolean m2809b(String str) {
        return (str == null || !str.startsWith("\"") || str.endsWith("\"") == null) ? null : true;
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
            String a = c0083b.mo1605a();
            String b = c0083b.mo1610b();
            if (c0083b.mo1623j() <= 0 || C1327m.m2809b(b)) {
                c0163d.m507a(a);
                c0163d.m507a("=");
                if (b != null) {
                    c0163d.m507a(b);
                }
            } else {
                C0143e.f288b.m399a(c0163d, new C0895c(a, b), false);
            }
        }
        list = new ArrayList(1);
        list.add(new C1283p(c0163d));
        return list;
    }
}
