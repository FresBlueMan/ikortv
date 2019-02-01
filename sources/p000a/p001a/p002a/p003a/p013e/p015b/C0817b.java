package p000a.p001a.p002a.p003a.p013e.p015b;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.p015b.C0054e.C0052a;
import p000a.p001a.p002a.p003a.p013e.p015b.C0054e.C0053b;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

/* compiled from: HttpRoute */
/* renamed from: a.a.a.a.e.b.b */
public final class C0817b implements C0054e, Cloneable {
    /* renamed from: a */
    private final C0159n f1434a;
    /* renamed from: b */
    private final InetAddress f1435b;
    /* renamed from: c */
    private final List<C0159n> f1436c;
    /* renamed from: d */
    private final C0053b f1437d;
    /* renamed from: e */
    private final C0052a f1438e;
    /* renamed from: f */
    private final boolean f1439f;

    private C0817b(C0159n c0159n, InetAddress inetAddress, List<C0159n> list, boolean z, C0053b c0053b, C0052a c0052a) {
        C0160a.m478a((Object) c0159n, "Target host");
        this.f1434a = c0159n;
        this.f1435b = inetAddress;
        if (list == null || list.isEmpty() != null) {
            this.f1436c = null;
        } else {
            this.f1436c = new ArrayList(list);
        }
        if (c0053b == C0053b.TUNNELLED) {
            C0160a.m480a(this.f1436c != null ? true : null, "Proxy required if tunnelled");
        }
        this.f1439f = z;
        if (c0053b == null) {
            c0053b = C0053b.PLAIN;
        }
        this.f1437d = c0053b;
        if (c0052a == null) {
            c0052a = C0052a.PLAIN;
        }
        this.f1438e = c0052a;
    }

    public C0817b(C0159n c0159n, InetAddress inetAddress, C0159n[] c0159nArr, boolean z, C0053b c0053b, C0052a c0052a) {
        this(c0159n, inetAddress, (List) c0159nArr != null ? Arrays.asList(c0159nArr) : null, z, c0053b, c0052a);
    }

    public C0817b(C0159n c0159n, InetAddress inetAddress, boolean z) {
        this(c0159n, inetAddress, Collections.emptyList(), z, C0053b.PLAIN, C0052a.PLAIN);
    }

    public C0817b(C0159n c0159n) {
        this(c0159n, null, Collections.emptyList(), false, C0053b.PLAIN, C0052a.PLAIN);
    }

    public C0817b(C0159n c0159n, InetAddress inetAddress, C0159n c0159n2, boolean z) {
        this(c0159n, inetAddress, Collections.singletonList(C0160a.m478a((Object) c0159n2, "Proxy host")), z, z ? C0053b.TUNNELLED : C0053b.PLAIN, (C0052a) z ? C0052a.LAYERED : C0052a.PLAIN);
    }

    /* renamed from: a */
    public final C0159n mo10a() {
        return this.f1434a;
    }

    /* renamed from: b */
    public final InetAddress mo12b() {
        return this.f1435b;
    }

    /* renamed from: c */
    public final int mo13c() {
        return this.f1436c != null ? 1 + this.f1436c.size() : 1;
    }

    /* renamed from: a */
    public final C0159n mo11a(int i) {
        C0160a.m482b(i, "Hop index");
        int c = mo13c();
        C0160a.m480a(i < c, "Hop index exceeds tracked route length");
        if (i < c - 1) {
            return (C0159n) this.f1436c.get(i);
        }
        return this.f1434a;
    }

    /* renamed from: d */
    public final C0159n mo14d() {
        return (this.f1436c == null || this.f1436c.isEmpty()) ? null : (C0159n) this.f1436c.get(0);
    }

    /* renamed from: e */
    public final boolean mo15e() {
        return this.f1437d == C0053b.TUNNELLED;
    }

    /* renamed from: f */
    public final boolean mo16f() {
        return this.f1438e == C0052a.LAYERED;
    }

    /* renamed from: g */
    public final boolean mo17g() {
        return this.f1439f;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0817b)) {
            return false;
        }
        C0817b c0817b = (C0817b) obj;
        if (this.f1439f != c0817b.f1439f || this.f1437d != c0817b.f1437d || this.f1438e != c0817b.f1438e || !C0166g.m525a(this.f1434a, c0817b.f1434a) || !C0166g.m525a(this.f1435b, c0817b.f1435b) || C0166g.m525a(this.f1436c, c0817b.f1436c) == null) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        int a = C0166g.m523a(C0166g.m523a(17, this.f1434a), this.f1435b);
        if (this.f1436c != null) {
            for (Object a2 : this.f1436c) {
                a = C0166g.m523a(a, a2);
            }
        }
        return C0166g.m523a(C0166g.m523a(C0166g.m524a(a, this.f1439f), this.f1437d), this.f1438e);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder((mo13c() * 30) + 50);
        if (this.f1435b != null) {
            stringBuilder.append(this.f1435b);
            stringBuilder.append("->");
        }
        stringBuilder.append('{');
        if (this.f1437d == C0053b.TUNNELLED) {
            stringBuilder.append('t');
        }
        if (this.f1438e == C0052a.LAYERED) {
            stringBuilder.append('l');
        }
        if (this.f1439f) {
            stringBuilder.append('s');
        }
        stringBuilder.append("}->");
        if (this.f1436c != null) {
            for (C0159n append : this.f1436c) {
                stringBuilder.append(append);
                stringBuilder.append("->");
            }
        }
        stringBuilder.append(this.f1434a);
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}
