package p000a.p001a.p002a.p003a.p019f;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: CookieIdentityComparator */
/* renamed from: a.a.a.a.f.d */
public class C0085d implements Serializable, Comparator<C0083b> {
    private static final long serialVersionUID = 4466565437490631532L;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m228a((C0083b) obj, (C0083b) obj2);
    }

    /* renamed from: a */
    public int m228a(C0083b c0083b, C0083b c0083b2) {
        int compareTo = c0083b.mo1605a().compareTo(c0083b2.mo1605a());
        if (compareTo == 0) {
            String f = c0083b.mo1619f();
            if (f == null) {
                f = "";
            } else if (f.indexOf(46) == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f);
                stringBuilder.append(".local");
                f = stringBuilder.toString();
            }
            String f2 = c0083b2.mo1619f();
            if (f2 == null) {
                f2 = "";
            } else if (f2.indexOf(46) == -1) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f2);
                stringBuilder2.append(".local");
                f2 = stringBuilder2.toString();
            }
            compareTo = f.compareToIgnoreCase(f2);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        c0083b = c0083b.mo1620g();
        if (c0083b == null) {
            c0083b = "/";
        }
        c0083b2 = c0083b2.mo1620g();
        if (c0083b2 == null) {
            c0083b2 = "/";
        }
        return c0083b.compareTo(c0083b2);
    }
}
