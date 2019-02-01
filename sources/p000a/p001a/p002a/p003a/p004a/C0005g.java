package p000a.p001a.p002a.p003a.p004a;

import java.util.Locale;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: AuthScope */
/* renamed from: a.a.a.a.a.g */
public class C0005g {
    /* renamed from: a */
    public static final String f8a = null;
    /* renamed from: b */
    public static final String f9b = null;
    /* renamed from: c */
    public static final String f10c = null;
    /* renamed from: d */
    public static final C0005g f11d = new C0005g(f8a, -1, f9b, f10c);
    /* renamed from: e */
    private final String f12e;
    /* renamed from: f */
    private final String f13f;
    /* renamed from: g */
    private final String f14g;
    /* renamed from: h */
    private final int f15h;

    public C0005g(String str, int i, String str2, String str3) {
        this.f14g = str == null ? f8a : str.toLowerCase(Locale.ENGLISH);
        if (i < 0) {
            i = -1;
        }
        this.f15h = i;
        if (str2 == null) {
            str2 = f9b;
        }
        this.f13f = str2;
        this.f12e = str3 == null ? f10c : str3.toUpperCase(Locale.ENGLISH);
    }

    public C0005g(C0159n c0159n, String str, String str2) {
        this(c0159n.m470a(), c0159n.m471b(), str, str2);
    }

    public C0005g(String str, int i) {
        this(str, i, f9b, f10c);
    }

    /* renamed from: a */
    public int m10a(C0005g c0005g) {
        int i;
        if (C0166g.m525a(this.f12e, c0005g.f12e)) {
            i = 1;
        } else if (this.f12e != f10c && c0005g.f12e != f10c) {
            return -1;
        } else {
            i = 0;
        }
        if (C0166g.m525a(this.f13f, c0005g.f13f)) {
            i += 2;
        } else if (!(this.f13f == f9b || c0005g.f13f == f9b)) {
            return -1;
        }
        if (this.f15h == c0005g.f15h) {
            i += 4;
        } else if (!(this.f15h == -1 || c0005g.f15h == -1)) {
            return -1;
        }
        if (C0166g.m525a(this.f14g, c0005g.f14g)) {
            i += 8;
        } else if (this.f14g == f8a || c0005g.f14g == f8a) {
            return i;
        } else {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0005g)) {
            return super.equals(obj);
        }
        C0005g c0005g = (C0005g) obj;
        if (C0166g.m525a(this.f14g, c0005g.f14g) && this.f15h == c0005g.f15h && C0166g.m525a(this.f13f, c0005g.f13f) && C0166g.m525a(this.f12e, c0005g.f12e) != null) {
            z = true;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f12e != null) {
            stringBuilder.append(this.f12e.toUpperCase(Locale.ENGLISH));
            stringBuilder.append(' ');
        }
        if (this.f13f != null) {
            stringBuilder.append('\'');
            stringBuilder.append(this.f13f);
            stringBuilder.append('\'');
        } else {
            stringBuilder.append("<any realm>");
        }
        if (this.f14g != null) {
            stringBuilder.append('@');
            stringBuilder.append(this.f14g);
            if (this.f15h >= 0) {
                stringBuilder.append(':');
                stringBuilder.append(this.f15h);
            }
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        return C0166g.m523a(C0166g.m523a(C0166g.m522a(C0166g.m523a(17, this.f14g), this.f15h), this.f13f), this.f12e);
    }
}
