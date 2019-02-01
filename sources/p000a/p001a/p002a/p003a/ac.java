package p000a.p001a.p002a.p003a;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: ProtocolVersion */
/* renamed from: a.a.a.a.ac */
public class ac implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    /* renamed from: d */
    protected final String f28d;
    /* renamed from: e */
    protected final int f29e;
    /* renamed from: f */
    protected final int f30f;

    public ac(String str, int i, int i2) {
        this.f28d = (String) C0160a.m478a((Object) str, "Protocol name");
        this.f29e = C0160a.m482b(i, "Protocol minor version");
        this.f30f = C0160a.m482b(i2, "Protocol minor version");
    }

    /* renamed from: a */
    public final String m26a() {
        return this.f28d;
    }

    /* renamed from: b */
    public final int m28b() {
        return this.f29e;
    }

    /* renamed from: c */
    public final int m30c() {
        return this.f30f;
    }

    /* renamed from: a */
    public ac mo161a(int i, int i2) {
        if (i == this.f29e && i2 == this.f30f) {
            return this;
        }
        return new ac(this.f28d, i, i2);
    }

    public final int hashCode() {
        return (this.f28d.hashCode() ^ (this.f29e * 100000)) ^ this.f30f;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (!this.f28d.equals(acVar.f28d) || this.f29e != acVar.f29e || this.f30f != acVar.f30f) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m27a(ac acVar) {
        return (acVar == null || this.f28d.equals(acVar.f28d) == null) ? null : true;
    }

    /* renamed from: b */
    public int m29b(ac acVar) {
        C0160a.m478a((Object) acVar, "Protocol version");
        C0160a.m481a(this.f28d.equals(acVar.f28d), "Versions for different protocols cannot be compared: %s %s", this, acVar);
        int b = m28b() - acVar.m28b();
        return b == 0 ? m30c() - acVar.m30c() : b;
    }

    /* renamed from: c */
    public final boolean m31c(ac acVar) {
        return (!m27a(acVar) || m29b(acVar) > null) ? null : true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f28d);
        stringBuilder.append('/');
        stringBuilder.append(Integer.toString(this.f29e));
        stringBuilder.append('.');
        stringBuilder.append(Integer.toString(this.f30f));
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}
