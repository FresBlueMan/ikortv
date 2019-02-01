package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Date;
import p000a.p001a.p002a.p003a.p005b.p010f.C0027b;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicExpiresHandler */
/* renamed from: a.a.a.a.i.d.g */
public class C1269g extends C0873a {
    /* renamed from: a */
    private final String[] f2184a;

    public C1269g(String[] strArr) {
        C0160a.m478a((Object) strArr, "Array of date patterns");
        this.f2184a = strArr;
    }

    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        if (str != null) {
            Date a = C0027b.m87a(str, this.f2184a);
            if (a != null) {
                c0830m.mo1611b(a);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to parse expires attribute: ");
            stringBuilder.append(str);
            throw new C1254l(stringBuilder.toString());
        }
        throw new C1254l("Missing value for expires attribute");
    }
}
