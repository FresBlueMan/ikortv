package p000a.p001a.p002a.p003a.p031k;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicHeader */
/* renamed from: a.a.a.a.k.b */
public class C0894b implements C0082e, Serializable, Cloneable {
    private static final long serialVersionUID = -5427236326487562174L;
    /* renamed from: a */
    private final String f1653a;
    /* renamed from: b */
    private final String f1654b;

    public C0894b(String str, String str2) {
        this.f1653a = (String) C0160a.m478a((Object) str, "Name");
        this.f1654b = str2;
    }

    /* renamed from: c */
    public String mo121c() {
        return this.f1653a;
    }

    /* renamed from: d */
    public String mo122d() {
        return this.f1654b;
    }

    public String toString() {
        return C0898i.f1667b.mo135a(null, (C0082e) this).toString();
    }

    /* renamed from: e */
    public C0091f[] mo123e() {
        if (this.f1654b != null) {
            return C0897f.m1854a(this.f1654b, null);
        }
        return new C0091f[0];
    }

    public Object clone() {
        return super.clone();
    }
}
