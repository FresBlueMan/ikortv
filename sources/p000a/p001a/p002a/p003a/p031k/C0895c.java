package p000a.p001a.p002a.p003a.p031k;

import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: BasicHeaderElement */
/* renamed from: a.a.a.a.k.c */
public class C0895c implements C0091f, Cloneable {
    /* renamed from: a */
    private final String f1655a;
    /* renamed from: b */
    private final String f1656b;
    /* renamed from: c */
    private final C0175y[] f1657c;

    public C0895c(String str, String str2, C0175y[] c0175yArr) {
        this.f1655a = (String) C0160a.m478a((Object) str, "Name");
        this.f1656b = str2;
        if (c0175yArr != null) {
            this.f1657c = c0175yArr;
        } else {
            this.f1657c = new C0175y[null];
        }
    }

    public C0895c(String str, String str2) {
        this(str, str2, null);
    }

    /* renamed from: a */
    public String mo126a() {
        return this.f1655a;
    }

    /* renamed from: b */
    public String mo127b() {
        return this.f1656b;
    }

    /* renamed from: c */
    public C0175y[] mo128c() {
        return (C0175y[]) this.f1657c.clone();
    }

    /* renamed from: d */
    public int mo129d() {
        return this.f1657c.length;
    }

    /* renamed from: a */
    public C0175y mo124a(int i) {
        return this.f1657c[i];
    }

    /* renamed from: a */
    public C0175y mo125a(String str) {
        C0160a.m478a((Object) str, "Name");
        for (C0175y c0175y : this.f1657c) {
            if (c0175y.mo141a().equalsIgnoreCase(str)) {
                return c0175y;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0091f)) {
            return false;
        }
        C0895c c0895c = (C0895c) obj;
        if (!this.f1655a.equals(c0895c.f1655a) || !C0166g.m525a(this.f1656b, c0895c.f1656b) || C0166g.m526a(this.f1657c, c0895c.f1657c) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int a = C0166g.m523a(C0166g.m523a(17, this.f1655a), this.f1656b);
        for (Object a2 : this.f1657c) {
            a = C0166g.m523a(a, a2);
        }
        return a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f1655a);
        if (this.f1656b != null) {
            stringBuilder.append("=");
            stringBuilder.append(this.f1656b);
        }
        for (Object obj : this.f1657c) {
            stringBuilder.append("; ");
            stringBuilder.append(obj);
        }
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}
