package p000a.p001a.p002a.p003a;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: HttpHost */
/* renamed from: a.a.a.a.n */
public final class C0159n implements Serializable, Cloneable {
    private static final long serialVersionUID = -7529410654042457626L;
    /* renamed from: a */
    protected final String f304a;
    /* renamed from: b */
    protected final String f305b;
    /* renamed from: c */
    protected final int f306c;
    /* renamed from: d */
    protected final String f307d;
    /* renamed from: e */
    protected final InetAddress f308e;

    public C0159n(String str, int i, String str2) {
        this.f304a = (String) C0160a.m483b((CharSequence) str, "Host name");
        this.f305b = str.toLowerCase(Locale.ENGLISH);
        if (str2 != null) {
            this.f307d = str2.toLowerCase(Locale.ENGLISH);
        } else {
            this.f307d = "http";
        }
        this.f306c = i;
        this.f308e = null;
    }

    public C0159n(String str, int i) {
        this(str, i, null);
    }

    /* renamed from: a */
    public String m470a() {
        return this.f304a;
    }

    /* renamed from: b */
    public int m471b() {
        return this.f306c;
    }

    /* renamed from: c */
    public String m472c() {
        return this.f307d;
    }

    /* renamed from: d */
    public String m473d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f307d);
        stringBuilder.append("://");
        stringBuilder.append(this.f304a);
        if (this.f306c != -1) {
            stringBuilder.append(':');
            stringBuilder.append(Integer.toString(this.f306c));
        }
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public String m474e() {
        if (this.f306c == -1) {
            return this.f304a;
        }
        StringBuilder stringBuilder = new StringBuilder(this.f304a.length() + 6);
        stringBuilder.append(this.f304a);
        stringBuilder.append(":");
        stringBuilder.append(Integer.toString(this.f306c));
        return stringBuilder.toString();
    }

    public String toString() {
        return m473d();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0159n)) {
            return false;
        }
        C0159n c0159n = (C0159n) obj;
        if (!this.f305b.equals(c0159n.f305b) || this.f306c != c0159n.f306c || this.f307d.equals(c0159n.f307d) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0166g.m523a(C0166g.m522a(C0166g.m523a(17, this.f305b), this.f306c), this.f307d);
    }

    public Object clone() {
        return super.clone();
    }
}
