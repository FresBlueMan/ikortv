package p000a.p001a.p002a.p003a.p031k;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.aa;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BufferedHeader */
/* renamed from: a.a.a.a.k.p */
public class C1283p implements C0813d, Serializable, Cloneable {
    private static final long serialVersionUID = -2768352615787625448L;
    /* renamed from: a */
    private final String f2200a;
    /* renamed from: b */
    private final C0163d f2201b;
    /* renamed from: c */
    private final int f2202c;

    public C1283p(C0163d c0163d) {
        C0160a.m478a((Object) c0163d, "Char array buffer");
        int c = c0163d.m514c(58);
        if (c != -1) {
            String b = c0163d.m510b(0, c);
            if (b.length() != 0) {
                this.f2201b = c0163d;
                this.f2200a = b;
                this.f2202c = c + 1;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid header: ");
            stringBuilder.append(c0163d.toString());
            throw new aa(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid header: ");
        stringBuilder.append(c0163d.toString());
        throw new aa(stringBuilder.toString());
    }

    /* renamed from: c */
    public String mo121c() {
        return this.f2200a;
    }

    /* renamed from: d */
    public String mo122d() {
        return this.f2201b.m510b(this.f2202c, this.f2201b.m513c());
    }

    /* renamed from: e */
    public C0091f[] mo123e() {
        C0148u c0148u = new C0148u(0, this.f2201b.m513c());
        c0148u.m425a(this.f2202c);
        return C0897f.f1664b.mo132a(this.f2201b, c0148u);
    }

    /* renamed from: b */
    public int mo1632b() {
        return this.f2202c;
    }

    /* renamed from: a */
    public C0163d mo1631a() {
        return this.f2201b;
    }

    public String toString() {
        return this.f2201b.toString();
    }

    public Object clone() {
        return super.clone();
    }
}
