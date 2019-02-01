package p000a.p001a.p002a.p003a.p020g;

import com.loopj.android.http.RequestParams;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p031k.C0143e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;
import p000a.p001a.p002a.p003a.p035o.C0167h;

/* compiled from: ContentType */
/* renamed from: a.a.a.a.g.e */
public final class C0093e implements Serializable {
    /* renamed from: a */
    public static final C0093e f140a = C0093e.m251a("application/atom+xml", C0043c.f99c);
    /* renamed from: b */
    public static final C0093e f141b = C0093e.m251a("application/x-www-form-urlencoded", C0043c.f99c);
    /* renamed from: c */
    public static final C0093e f142c = C0093e.m251a(RequestParams.APPLICATION_JSON, C0043c.f97a);
    /* renamed from: d */
    public static final C0093e f143d;
    /* renamed from: e */
    public static final C0093e f144e = C0093e.m251a("application/svg+xml", C0043c.f99c);
    /* renamed from: f */
    public static final C0093e f145f = C0093e.m251a("application/xhtml+xml", C0043c.f99c);
    /* renamed from: g */
    public static final C0093e f146g = C0093e.m251a("application/xml", C0043c.f99c);
    /* renamed from: h */
    public static final C0093e f147h = C0093e.m251a("multipart/form-data", C0043c.f99c);
    /* renamed from: i */
    public static final C0093e f148i = C0093e.m251a("text/html", C0043c.f99c);
    /* renamed from: j */
    public static final C0093e f149j = C0093e.m251a("text/plain", C0043c.f99c);
    /* renamed from: k */
    public static final C0093e f150k = C0093e.m251a("text/xml", C0043c.f99c);
    /* renamed from: l */
    public static final C0093e f151l;
    /* renamed from: m */
    public static final C0093e f152m = f149j;
    /* renamed from: n */
    public static final C0093e f153n = f143d;
    private static final long serialVersionUID = -7768694718232371896L;
    /* renamed from: o */
    private final String f154o;
    /* renamed from: p */
    private final Charset f155p;
    /* renamed from: q */
    private final C0175y[] f156q = null;

    static {
        Charset charset = (Charset) null;
        f143d = C0093e.m251a(RequestParams.APPLICATION_OCTET_STREAM, charset);
        f151l = C0093e.m251a("*/*", charset);
    }

    C0093e(String str, Charset charset) {
        this.f154o = str;
        this.f155p = charset;
    }

    /* renamed from: a */
    public String m253a() {
        return this.f154o;
    }

    /* renamed from: b */
    public Charset m254b() {
        return this.f155p;
    }

    public String toString() {
        C0163d c0163d = new C0163d(64);
        c0163d.m507a(this.f154o);
        if (this.f156q != null) {
            c0163d.m507a("; ");
            C0143e.f288b.m401a(c0163d, this.f156q, false);
        } else if (this.f155p != null) {
            c0163d.m507a("; charset=");
            c0163d.m507a(this.f155p.name());
        }
        return c0163d.toString();
    }

    /* renamed from: a */
    private static boolean m252a(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (!(charAt == '\"' || charAt == ',')) {
                if (charAt != ';') {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0093e m251a(String str, Charset charset) {
        str = ((String) C0160a.m483b((CharSequence) str, "MIME type")).toLowerCase(Locale.ENGLISH);
        C0160a.m480a(C0093e.m252a(str), "MIME type may not contain reserved characters");
        return new C0093e(str, charset);
    }

    /* renamed from: a */
    public static C0093e m250a(String str, String str2) {
        return C0093e.m251a(str, !C0167h.m528b(str2) ? Charset.forName(str2) : null);
    }
}
