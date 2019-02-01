package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: CookieSpecBase */
/* renamed from: a.a.a.a.i.d.p */
public abstract class C1274p extends C0874b {
    /* renamed from: a */
    protected static String m2667a(C0086e c0086e) {
        c0086e = c0086e.m230b();
        int lastIndexOf = c0086e.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return c0086e;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return c0086e.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    protected static String m2668b(C0086e c0086e) {
        return c0086e.m229a();
    }

    /* renamed from: a */
    protected List<C0083b> mo2028a(C0091f[] c0091fArr, C0086e c0086e) {
        List<C0083b> arrayList = new ArrayList(c0091fArr.length);
        for (C0091f c0091f : c0091fArr) {
            String a = c0091f.mo126a();
            String b = c0091f.mo127b();
            if (a == null || a.length() == 0) {
                throw new C1254l("Cookie name may not be empty");
            }
            C0830m c1267c = new C1267c(a, b);
            c1267c.mo1617e(C1274p.m2667a(c0086e));
            c1267c.mo1616d(C1274p.m2668b(c0086e));
            C0175y[] c = c0091f.mo128c();
            for (int length = c.length - 1; length >= 0; length--) {
                C0175y c0175y = c[length];
                String toLowerCase = c0175y.mo141a().toLowerCase(Locale.ENGLISH);
                c1267c.m2643a(toLowerCase, c0175y.mo142b());
                C0084c a2 = m1767a(toLowerCase);
                if (a2 != null) {
                    a2.mo94a(c1267c, c0175y.mo142b());
                }
            }
            arrayList.add(c1267c);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo99a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        for (C0084c a : m1769c()) {
            a.mo92a(c0083b, c0086e);
        }
    }

    /* renamed from: b */
    public boolean mo101b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        for (C0084c b : m1769c()) {
            if (!b.mo93b(c0083b, c0086e)) {
                return null;
            }
        }
        return true;
    }
}
