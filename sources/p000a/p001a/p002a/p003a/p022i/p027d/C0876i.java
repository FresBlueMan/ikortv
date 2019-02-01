package p000a.p001a.p002a.p003a.p022i.p027d;

import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0167h;

/* compiled from: BasicPathHandler */
/* renamed from: a.a.a.a.i.d.i */
public class C0876i implements C0084c {
    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        if (C0167h.m528b(str)) {
            str = "/";
        }
        c0830m.mo1617e(str);
    }

    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        if (!mo93b(c0083b, c0086e)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal path attribute \"");
            stringBuilder.append(c0083b.mo1620g());
            stringBuilder.append("\". Path of origin: \"");
            stringBuilder.append(c0086e.m230b());
            stringBuilder.append("\"");
            throw new C1320g(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        c0086e = c0086e.m230b();
        c0083b = c0083b.mo1620g();
        if (c0083b == null) {
            c0083b = "/";
        }
        if (c0083b.length() > 1 && c0083b.endsWith("/")) {
            c0083b = c0083b.substring(0, c0083b.length() - 1);
        }
        boolean startsWith = c0086e.startsWith(c0083b);
        if (!startsWith || c0086e.length() == c0083b.length() || c0083b.endsWith("/")) {
            return startsWith;
        }
        return c0086e.charAt(c0083b.length()) == 47;
    }
}
