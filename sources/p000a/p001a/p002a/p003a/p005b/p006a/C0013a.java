package p000a.p001a.p002a.p003a.p005b.p006a;

import java.net.InetAddress;
import java.util.Collection;
import p000a.p001a.p002a.p003a.C0159n;

/* compiled from: RequestConfig */
/* renamed from: a.a.a.a.b.a.a */
public class C0013a implements Cloneable {
    /* renamed from: a */
    public static final C0013a f46a = new C0012a().m46a();
    /* renamed from: b */
    private final boolean f47b;
    /* renamed from: c */
    private final C0159n f48c;
    /* renamed from: d */
    private final InetAddress f49d;
    /* renamed from: e */
    private final boolean f50e;
    /* renamed from: f */
    private final String f51f;
    /* renamed from: g */
    private final boolean f52g;
    /* renamed from: h */
    private final boolean f53h;
    /* renamed from: i */
    private final boolean f54i;
    /* renamed from: j */
    private final int f55j;
    /* renamed from: k */
    private final boolean f56k;
    /* renamed from: l */
    private final Collection<String> f57l;
    /* renamed from: m */
    private final Collection<String> f58m;
    /* renamed from: n */
    private final int f59n;
    /* renamed from: o */
    private final int f60o;
    /* renamed from: p */
    private final int f61p;

    /* compiled from: RequestConfig */
    /* renamed from: a.a.a.a.b.a.a$a */
    public static class C0012a {
        /* renamed from: a */
        private boolean f31a;
        /* renamed from: b */
        private C0159n f32b;
        /* renamed from: c */
        private InetAddress f33c;
        /* renamed from: d */
        private boolean f34d = true;
        /* renamed from: e */
        private String f35e;
        /* renamed from: f */
        private boolean f36f = true;
        /* renamed from: g */
        private boolean f37g = true;
        /* renamed from: h */
        private boolean f38h;
        /* renamed from: i */
        private int f39i = 50;
        /* renamed from: j */
        private boolean f40j = true;
        /* renamed from: k */
        private Collection<String> f41k;
        /* renamed from: l */
        private Collection<String> f42l;
        /* renamed from: m */
        private int f43m = -1;
        /* renamed from: n */
        private int f44n = -1;
        /* renamed from: o */
        private int f45o = -1;

        C0012a() {
        }

        /* renamed from: a */
        public C0012a m45a(boolean z) {
            this.f31a = z;
            return this;
        }

        /* renamed from: a */
        public C0012a m41a(C0159n c0159n) {
            this.f32b = c0159n;
            return this;
        }

        /* renamed from: a */
        public C0012a m43a(InetAddress inetAddress) {
            this.f33c = inetAddress;
            return this;
        }

        /* renamed from: b */
        public C0012a m49b(boolean z) {
            this.f34d = z;
            return this;
        }

        /* renamed from: a */
        public C0012a m42a(String str) {
            this.f35e = str;
            return this;
        }

        /* renamed from: c */
        public C0012a m51c(boolean z) {
            this.f36f = z;
            return this;
        }

        /* renamed from: d */
        public C0012a m53d(boolean z) {
            this.f37g = z;
            return this;
        }

        /* renamed from: e */
        public C0012a m54e(boolean z) {
            this.f38h = z;
            return this;
        }

        /* renamed from: a */
        public C0012a m40a(int i) {
            this.f39i = i;
            return this;
        }

        /* renamed from: f */
        public C0012a m55f(boolean z) {
            this.f40j = z;
            return this;
        }

        /* renamed from: a */
        public C0012a m44a(Collection<String> collection) {
            this.f41k = collection;
            return this;
        }

        /* renamed from: b */
        public C0012a m48b(Collection<String> collection) {
            this.f42l = collection;
            return this;
        }

        /* renamed from: b */
        public C0012a m47b(int i) {
            this.f43m = i;
            return this;
        }

        /* renamed from: c */
        public C0012a m50c(int i) {
            this.f44n = i;
            return this;
        }

        /* renamed from: d */
        public C0012a m52d(int i) {
            this.f45o = i;
            return this;
        }

        /* renamed from: a */
        public C0013a m46a() {
            return new C0013a(this.f31a, this.f32b, this.f33c, this.f34d, this.f35e, this.f36f, this.f37g, this.f38h, this.f39i, this.f40j, this.f41k, this.f42l, this.f43m, this.f44n, this.f45o);
        }
    }

    protected /* synthetic */ Object clone() {
        return m62f();
    }

    C0013a(boolean z, C0159n c0159n, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection<String> collection, Collection<String> collection2, int i2, int i3, int i4) {
        this.f47b = z;
        this.f48c = c0159n;
        this.f49d = inetAddress;
        this.f50e = z2;
        this.f51f = str;
        this.f52g = z3;
        this.f53h = z4;
        this.f54i = z5;
        this.f55j = i;
        this.f56k = z6;
        this.f57l = collection;
        this.f58m = collection2;
        this.f59n = i2;
        this.f60o = i3;
        this.f61p = i4;
    }

    /* renamed from: a */
    public String m57a() {
        return this.f51f;
    }

    /* renamed from: b */
    public boolean m58b() {
        return this.f53h;
    }

    /* renamed from: c */
    public boolean m59c() {
        return this.f54i;
    }

    /* renamed from: d */
    public Collection<String> m60d() {
        return this.f57l;
    }

    /* renamed from: e */
    public Collection<String> m61e() {
        return this.f58m;
    }

    /* renamed from: f */
    protected C0013a m62f() {
        return (C0013a) super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", expectContinueEnabled=");
        stringBuilder.append(this.f47b);
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.f48c);
        stringBuilder.append(", localAddress=");
        stringBuilder.append(this.f49d);
        stringBuilder.append(", staleConnectionCheckEnabled=");
        stringBuilder.append(this.f50e);
        stringBuilder.append(", cookieSpec=");
        stringBuilder.append(this.f51f);
        stringBuilder.append(", redirectsEnabled=");
        stringBuilder.append(this.f52g);
        stringBuilder.append(", relativeRedirectsAllowed=");
        stringBuilder.append(this.f53h);
        stringBuilder.append(", maxRedirects=");
        stringBuilder.append(this.f55j);
        stringBuilder.append(", circularRedirectsAllowed=");
        stringBuilder.append(this.f54i);
        stringBuilder.append(", authenticationEnabled=");
        stringBuilder.append(this.f56k);
        stringBuilder.append(", targetPreferredAuthSchemes=");
        stringBuilder.append(this.f57l);
        stringBuilder.append(", proxyPreferredAuthSchemes=");
        stringBuilder.append(this.f58m);
        stringBuilder.append(", connectionRequestTimeout=");
        stringBuilder.append(this.f59n);
        stringBuilder.append(", connectTimeout=");
        stringBuilder.append(this.f60o);
        stringBuilder.append(", socketTimeout=");
        stringBuilder.append(this.f61p);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: g */
    public static C0012a m56g() {
        return new C0012a();
    }
}
