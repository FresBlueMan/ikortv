package p000a.p001a.p002a.p003a.p031k;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: BasicNameValuePair */
/* renamed from: a.a.a.a.k.l */
public class C0901l implements C0175y, Serializable, Cloneable {
    private static final long serialVersionUID = -6437800749411518984L;
    /* renamed from: a */
    private final String f1675a;
    /* renamed from: b */
    private final String f1676b;

    public C0901l(String str, String str2) {
        this.f1675a = (String) C0160a.m478a((Object) str, "Name");
        this.f1676b = str2;
    }

    /* renamed from: a */
    public String mo141a() {
        return this.f1675a;
    }

    /* renamed from: b */
    public String mo142b() {
        return this.f1676b;
    }

    public String toString() {
        if (this.f1676b == null) {
            return this.f1675a;
        }
        StringBuilder stringBuilder = new StringBuilder((this.f1675a.length() + 1) + this.f1676b.length());
        stringBuilder.append(this.f1675a);
        stringBuilder.append("=");
        stringBuilder.append(this.f1676b);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0175y)) {
            return false;
        }
        C0901l c0901l = (C0901l) obj;
        if (!this.f1675a.equals(c0901l.f1675a) || C0166g.m525a(this.f1676b, c0901l.f1676b) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0166g.m523a(C0166g.m523a(17, this.f1675a), this.f1676b);
    }

    public Object clone() {
        return super.clone();
    }
}
