package p000a.p001a.p002a.p003a.p004a;

import java.io.Serializable;
import java.security.Principal;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: NTUserPrincipal */
/* renamed from: a.a.a.a.a.q */
public class C0010q implements Serializable, Principal {
    private static final long serialVersionUID = -6870169797924406894L;
    /* renamed from: a */
    private final String f25a;
    /* renamed from: b */
    private final String f26b;
    /* renamed from: c */
    private final String f27c;

    public String getName() {
        return this.f27c;
    }

    /* renamed from: a */
    public String m23a() {
        return this.f26b;
    }

    /* renamed from: b */
    public String m24b() {
        return this.f25a;
    }

    public int hashCode() {
        return C0166g.m523a(C0166g.m523a(17, this.f25a), this.f26b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0010q) {
            C0010q c0010q = (C0010q) obj;
            if (C0166g.m525a(this.f25a, c0010q.f25a) && C0166g.m525a(this.f26b, c0010q.f26b) != null) {
                return true;
            }
        }
        return null;
    }

    public String toString() {
        return this.f27c;
    }
}
