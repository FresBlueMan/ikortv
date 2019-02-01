package p000a.p001a.p002a.p003a.p005b.p010f;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p013e.p018e.C0072a;

/* compiled from: URIBuilder */
/* renamed from: a.a.a.a.b.f.c */
public class C0028c {
    /* renamed from: a */
    private String f74a;
    /* renamed from: b */
    private String f75b;
    /* renamed from: c */
    private String f76c;
    /* renamed from: d */
    private String f77d;
    /* renamed from: e */
    private String f78e;
    /* renamed from: f */
    private String f79f;
    /* renamed from: g */
    private int f80g;
    /* renamed from: h */
    private String f81h;
    /* renamed from: i */
    private String f82i;
    /* renamed from: j */
    private String f83j;
    /* renamed from: k */
    private List<C0175y> f84k;
    /* renamed from: l */
    private String f85l;
    /* renamed from: m */
    private String f86m;
    /* renamed from: n */
    private String f87n;

    public C0028c() {
        this.f80g = -1;
    }

    public C0028c(URI uri) {
        m90a(uri);
    }

    /* renamed from: a */
    private List<C0175y> m89a(String str, Charset charset) {
        return (str == null || str.length() <= 0) ? null : C0030e.m121a(str, charset);
    }

    /* renamed from: a */
    public URI m100a() {
        return new URI(m92e());
    }

    /* renamed from: e */
    private String m92e() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f74a != null) {
            stringBuilder.append(this.f74a);
            stringBuilder.append(':');
        }
        if (this.f75b != null) {
            stringBuilder.append(this.f75b);
        } else {
            if (this.f76c != null) {
                stringBuilder.append("//");
                stringBuilder.append(this.f76c);
            } else if (this.f79f != null) {
                stringBuilder.append("//");
                if (this.f78e != null) {
                    stringBuilder.append(this.f78e);
                    stringBuilder.append("@");
                } else if (this.f77d != null) {
                    stringBuilder.append(m93f(this.f77d));
                    stringBuilder.append("@");
                }
                if (C0072a.m200d(this.f79f)) {
                    stringBuilder.append("[");
                    stringBuilder.append(this.f79f);
                    stringBuilder.append("]");
                } else {
                    stringBuilder.append(this.f79f);
                }
                if (this.f80g >= 0) {
                    stringBuilder.append(":");
                    stringBuilder.append(this.f80g);
                }
            }
            if (this.f82i != null) {
                stringBuilder.append(C0028c.m96i(this.f82i));
            } else if (this.f81h != null) {
                stringBuilder.append(m94g(C0028c.m96i(this.f81h)));
            }
            if (this.f83j != null) {
                stringBuilder.append("?");
                stringBuilder.append(this.f83j);
            } else if (this.f84k != null) {
                stringBuilder.append("?");
                stringBuilder.append(m91b(this.f84k));
            } else if (this.f85l != null) {
                stringBuilder.append("?");
                stringBuilder.append(m95h(this.f85l));
            }
        }
        if (this.f87n != null) {
            stringBuilder.append("#");
            stringBuilder.append(this.f87n);
        } else if (this.f86m != null) {
            stringBuilder.append("#");
            stringBuilder.append(m95h(this.f86m));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m90a(URI uri) {
        this.f74a = uri.getScheme();
        this.f75b = uri.getRawSchemeSpecificPart();
        this.f76c = uri.getRawAuthority();
        this.f79f = uri.getHost();
        this.f80g = uri.getPort();
        this.f78e = uri.getRawUserInfo();
        this.f77d = uri.getUserInfo();
        this.f82i = uri.getRawPath();
        this.f81h = uri.getPath();
        this.f83j = uri.getRawQuery();
        this.f84k = m89a(uri.getRawQuery(), C0043c.f97a);
        this.f87n = uri.getRawFragment();
        this.f86m = uri.getFragment();
    }

    /* renamed from: f */
    private String m93f(String str) {
        return C0030e.m123b(str, C0043c.f97a);
    }

    /* renamed from: g */
    private String m94g(String str) {
        return C0030e.m125d(str, C0043c.f97a);
    }

    /* renamed from: b */
    private String m91b(List<C0175y> list) {
        return C0030e.m115a((Iterable) list, C0043c.f97a);
    }

    /* renamed from: h */
    private String m95h(String str) {
        return C0030e.m124c(str, C0043c.f97a);
    }

    /* renamed from: a */
    public C0028c m98a(String str) {
        this.f74a = str;
        return this;
    }

    /* renamed from: b */
    public C0028c m101b(String str) {
        this.f77d = str;
        this.f75b = null;
        this.f76c = null;
        this.f78e = null;
        return this;
    }

    /* renamed from: c */
    public C0028c m103c(String str) {
        this.f79f = str;
        this.f75b = null;
        this.f76c = null;
        return this;
    }

    /* renamed from: a */
    public C0028c m97a(int i) {
        if (i < 0) {
            i = -1;
        }
        this.f80g = i;
        this.f75b = null;
        this.f76c = null;
        return this;
    }

    /* renamed from: d */
    public C0028c m105d(String str) {
        this.f81h = str;
        this.f75b = null;
        this.f82i = null;
        return this;
    }

    /* renamed from: a */
    public C0028c m99a(List<C0175y> list) {
        if (this.f84k == null) {
            this.f84k = new ArrayList();
        }
        this.f84k.addAll(list);
        this.f83j = null;
        this.f75b = null;
        this.f85l = null;
        return this;
    }

    /* renamed from: e */
    public C0028c m107e(String str) {
        this.f86m = str;
        this.f87n = null;
        return this;
    }

    /* renamed from: b */
    public String m102b() {
        return this.f77d;
    }

    /* renamed from: c */
    public String m104c() {
        return this.f79f;
    }

    /* renamed from: d */
    public String m106d() {
        return this.f81h;
    }

    public String toString() {
        return m92e();
    }

    /* renamed from: i */
    private static String m96i(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != '/') {
                break;
            }
            i++;
        }
        if (i > 1) {
            str = str.substring(i - 1);
        }
        return str;
    }
}
