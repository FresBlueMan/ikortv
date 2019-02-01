package p000a.p001a.p002a.p003a.p022i.p027d;

import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RFC2109VersionHandler */
/* renamed from: a.a.a.a.i.d.z */
public class C1276z extends C0873a {
    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        if (str == null) {
            throw new C1254l("Missing value for version attribute");
        } else if (str.trim().length() != 0) {
            try {
                c0830m.mo1607a(Integer.parseInt(str));
            } catch (C0830m c0830m2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid version: ");
                stringBuilder.append(c0830m2.getMessage());
                throw new C1254l(stringBuilder.toString());
            }
        } else {
            throw new C1254l("Blank value for version attribute");
        }
    }

    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        if (c0083b.mo1623j() < null) {
            throw new C1320g("Cookie version may not be negative");
        }
    }
}
