package p000a.p001a.p002a.p003a.p004a;

import java.io.Serializable;
import java.security.Principal;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: BasicUserPrincipal */
/* renamed from: a.a.a.a.a.j */
public final class C0007j implements Serializable, Principal {
    private static final long serialVersionUID = -2266305184969850467L;
    /* renamed from: a */
    private final String f21a;

    public C0007j(String str) {
        C0160a.m478a((Object) str, "User name");
        this.f21a = str;
    }

    public String getName() {
        return this.f21a;
    }

    public int hashCode() {
        return C0166g.m523a(17, this.f21a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0007j) {
            if (C0166g.m525a(this.f21a, ((C0007j) obj).f21a) != null) {
                return true;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[principal: ");
        stringBuilder.append(this.f21a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
