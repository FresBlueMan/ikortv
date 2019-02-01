package p000a.p001a.p002a.p003a.p004a;

import java.io.Serializable;
import java.security.Principal;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: NTCredentials */
/* renamed from: a.a.a.a.a.p */
public class C0802p implements C0009m, Serializable {
    private static final long serialVersionUID = -7385699315228907265L;
    /* renamed from: a */
    private final C0010q f1416a;
    /* renamed from: b */
    private final String f1417b;
    /* renamed from: c */
    private final String f1418c;

    /* renamed from: a */
    public Principal mo3a() {
        return this.f1416a;
    }

    /* renamed from: c */
    public String m1480c() {
        return this.f1416a.m24b();
    }

    /* renamed from: b */
    public String mo4b() {
        return this.f1417b;
    }

    /* renamed from: d */
    public String m1481d() {
        return this.f1416a.m23a();
    }

    /* renamed from: e */
    public String m1482e() {
        return this.f1418c;
    }

    public int hashCode() {
        return C0166g.m523a(C0166g.m523a(17, this.f1416a), this.f1418c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0802p) {
            C0802p c0802p = (C0802p) obj;
            if (C0166g.m525a(this.f1416a, c0802p.f1416a) && C0166g.m525a(this.f1418c, c0802p.f1418c) != null) {
                return true;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[principal: ");
        stringBuilder.append(this.f1416a);
        stringBuilder.append("][workstation: ");
        stringBuilder.append(this.f1418c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
