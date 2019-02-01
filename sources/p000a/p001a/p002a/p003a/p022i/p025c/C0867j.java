package p000a.p001a.p002a.p003a.p022i.p025c;

import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.C0080r;
import p000a.p001a.p002a.p003a.p013e.C0081s;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: DefaultSchemePortResolver */
/* renamed from: a.a.a.a.i.c.j */
public class C0867j implements C0080r {
    /* renamed from: a */
    public static final C0867j f1584a = new C0867j();

    /* renamed from: a */
    public int mo76a(C0159n c0159n) {
        C0160a.m478a((Object) c0159n, "HTTP host");
        int b = c0159n.m471b();
        if (b > 0) {
            return b;
        }
        c0159n = c0159n.m472c();
        if (c0159n.equalsIgnoreCase("http")) {
            return 80;
        }
        if (c0159n.equalsIgnoreCase("https")) {
            return 443;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0159n);
        stringBuilder.append(" protocol is not supported");
        throw new C0081s(stringBuilder.toString());
    }
}
