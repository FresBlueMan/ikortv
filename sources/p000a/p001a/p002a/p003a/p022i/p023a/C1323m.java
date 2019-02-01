package p000a.p001a.p002a.p003a.p022i.p023a;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C1235o;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p031k.C0897f;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: RFC2617Scheme */
/* renamed from: a.a.a.a.i.a.m */
public abstract class C1323m extends C1259a {
    /* renamed from: a */
    private final Map<String, String> f2282a = new HashMap();
    /* renamed from: b */
    private final Charset f2283b;

    public C1323m(Charset charset) {
        if (charset == null) {
            charset = C0043c.f98b;
        }
        this.f2283b = charset;
    }

    /* renamed from: g */
    public Charset m2793g() {
        return this.f2283b;
    }

    /* renamed from: a */
    String m2789a(C0915q c0915q) {
        String str = (String) c0915q.getParams().mo1602a("http.auth.credential-charset");
        return str == null ? m2793g().name() : str;
    }

    /* renamed from: a */
    protected void mo1919a(C0163d c0163d, int i, int i2) {
        c0163d = C0897f.f1664b.mo132a(c0163d, new C0148u(i, c0163d.m513c()));
        if (c0163d.length != 0) {
            this.f2282a.clear();
            for (C0091f c0091f : c0163d) {
                this.f2282a.put(c0091f.mo126a().toLowerCase(Locale.ENGLISH), c0091f.mo127b());
            }
            return;
        }
        throw new C1235o("Authentication challenge is empty");
    }

    /* renamed from: h */
    protected Map<String, String> m2794h() {
        return this.f2282a;
    }

    /* renamed from: a */
    public String m2790a(String str) {
        return str == null ? null : (String) this.f2282a.get(str.toLowerCase(Locale.ENGLISH));
    }

    /* renamed from: b */
    public String mo1920b() {
        return m2790a("realm");
    }
}
