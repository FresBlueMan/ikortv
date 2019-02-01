package p000a.p001a.p002a.p003a.p022i.p023a;

import java.nio.charset.Charset;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p021h.C0096a;
import p000a.p001a.p002a.p003a.p031k.C1283p;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p034n.C0906a;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;
import p000a.p001a.p002a.p003a.p035o.C0164e;

/* compiled from: BasicScheme */
/* renamed from: a.a.a.a.i.a.b */
public class C1343b extends C1323m {
    /* renamed from: a */
    private boolean f2325a;

    /* renamed from: a */
    public String mo1918a() {
        return "basic";
    }

    /* renamed from: c */
    public boolean mo1921c() {
        return false;
    }

    public C1343b(Charset charset) {
        super(charset);
        this.f2325a = null;
    }

    public C1343b() {
        this(C0043c.f98b);
    }

    /* renamed from: a */
    public void mo1592a(C0082e c0082e) {
        super.mo1592a(c0082e);
        this.f2325a = true;
    }

    /* renamed from: d */
    public boolean mo1922d() {
        return this.f2325a;
    }

    @Deprecated
    /* renamed from: a */
    public C0082e mo1917a(C0009m c0009m, C0915q c0915q) {
        return mo1591a(c0009m, c0915q, new C0906a());
    }

    /* renamed from: a */
    public C0082e mo1591a(C0009m c0009m, C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0009m, "Credentials");
        C0160a.m478a((Object) c0915q, "HTTP request");
        c0157e = new StringBuilder();
        c0157e.append(c0009m.mo3a().getName());
        c0157e.append(":");
        c0157e.append(c0009m.mo4b() == null ? "null" : c0009m.mo4b());
        byte[] b = C0096a.m258b(C0164e.m519a(c0157e.toString(), m2789a(c0915q)), 2);
        c0915q = new C0163d(32);
        if (m2562e() != null) {
            c0915q.m507a("Proxy-Authorization");
        } else {
            c0915q.m507a("Authorization");
        }
        c0915q.m507a(": Basic ");
        c0915q.m508a(b, (int) null, b.length);
        return new C1283p(c0915q);
    }
}
