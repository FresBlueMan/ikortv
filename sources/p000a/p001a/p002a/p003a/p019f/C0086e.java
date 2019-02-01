package p000a.p001a.p002a.p003a.p019f;

import java.util.Locale;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: CookieOrigin */
/* renamed from: a.a.a.a.f.e */
public final class C0086e {
    /* renamed from: a */
    private final String f136a;
    /* renamed from: b */
    private final int f137b;
    /* renamed from: c */
    private final String f138c;
    /* renamed from: d */
    private final boolean f139d;

    public C0086e(String str, int i, String str2, boolean z) {
        C0160a.m483b((CharSequence) str, "Host");
        C0160a.m482b(i, "Port");
        C0160a.m478a((Object) str2, "Path");
        this.f136a = str.toLowerCase(Locale.ENGLISH);
        this.f137b = i;
        if (str2.trim().length() != null) {
            this.f138c = str2;
        } else {
            this.f138c = "/";
        }
        this.f139d = z;
    }

    /* renamed from: a */
    public String m229a() {
        return this.f136a;
    }

    /* renamed from: b */
    public String m230b() {
        return this.f138c;
    }

    /* renamed from: c */
    public int m231c() {
        return this.f137b;
    }

    /* renamed from: d */
    public boolean m232d() {
        return this.f139d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        if (this.f139d) {
            stringBuilder.append("(secure)");
        }
        stringBuilder.append(this.f136a);
        stringBuilder.append(':');
        stringBuilder.append(Integer.toString(this.f137b));
        stringBuilder.append(this.f138c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
