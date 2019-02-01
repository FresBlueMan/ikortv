package p000a.p001a.p002a.p003a.p019f;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: CookiePathComparator */
/* renamed from: a.a.a.a.f.f */
public class C0087f implements Serializable, Comparator<C0083b> {
    private static final long serialVersionUID = 7523645369616405818L;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m234a((C0083b) obj, (C0083b) obj2);
    }

    /* renamed from: a */
    private String m233a(C0083b c0083b) {
        c0083b = c0083b.mo1620g();
        if (c0083b == null) {
            c0083b = "/";
        }
        if (c0083b.endsWith("/")) {
            return c0083b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0083b);
        stringBuilder.append('/');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public int m234a(C0083b c0083b, C0083b c0083b2) {
        c0083b = m233a(c0083b);
        c0083b2 = m233a(c0083b2);
        if (c0083b.equals(c0083b2)) {
            return 0;
        }
        if (c0083b.startsWith(c0083b2)) {
            return -1;
        }
        if (c0083b2.startsWith(c0083b) != null) {
            return 1;
        }
        return 0;
    }
}
