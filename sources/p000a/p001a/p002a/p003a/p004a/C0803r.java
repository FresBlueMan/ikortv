package p000a.p001a.p002a.p003a.p004a;

import java.io.Serializable;
import java.security.Principal;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: UsernamePasswordCredentials */
/* renamed from: a.a.a.a.a.r */
public class C0803r implements C0009m, Serializable {
    private static final long serialVersionUID = 243343858802739403L;
    /* renamed from: a */
    private final C0007j f1419a;
    /* renamed from: b */
    private final String f1420b;

    public C0803r(String str) {
        C0160a.m478a((Object) str, "Username:password string");
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.f1419a = new C0007j(str.substring(0, indexOf));
            this.f1420b = str.substring(indexOf + 1);
            return;
        }
        this.f1419a = new C0007j(str);
        this.f1420b = null;
    }

    public C0803r(String str, String str2) {
        C0160a.m478a((Object) str, "Username");
        this.f1419a = new C0007j(str);
        this.f1420b = str2;
    }

    /* renamed from: a */
    public Principal mo3a() {
        return this.f1419a;
    }

    /* renamed from: b */
    public String mo4b() {
        return this.f1420b;
    }

    public int hashCode() {
        return this.f1419a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0803r) {
            if (C0166g.m525a(this.f1419a, ((C0803r) obj).f1419a) != null) {
                return true;
            }
        }
        return null;
    }

    public String toString() {
        return this.f1419a.toString();
    }
}
