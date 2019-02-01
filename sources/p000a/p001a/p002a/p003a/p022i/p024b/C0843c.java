package p000a.p001a.p002a.p003a.p022i.p024b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0813d;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p004a.C0000a;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0004e;
import p000a.p001a.p002a.p003a.p004a.C0005g;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p004a.C1235o;
import p000a.p001a.p002a.p003a.p005b.C0014a;
import p000a.p001a.p002a.p003a.p005b.C0019c;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p005b.p006a.C0013a;
import p000a.p001a.p002a.p003a.p005b.p009e.C1239a;
import p000a.p001a.p002a.p003a.p012d.C0044a;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0156d;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: AuthenticationStrategyImpl */
/* renamed from: a.a.a.a.i.b.c */
abstract class C0843c implements C0019c {
    /* renamed from: b */
    private static final List<String> f1495b = Collections.unmodifiableList(Arrays.asList(new String[]{"negotiate", "Kerberos", "NTLM", "Digest", "Basic"}));
    /* renamed from: a */
    public C0097b f1496a = new C0097b(getClass());
    /* renamed from: c */
    private final int f1497c;
    /* renamed from: d */
    private final String f1498d;

    /* renamed from: a */
    abstract Collection<String> mo1603a(C0013a c0013a);

    C0843c(int i, String str) {
        this.f1497c = i;
        this.f1498d = str;
    }

    /* renamed from: a */
    public boolean mo42a(C0159n c0159n, C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0916s, "HTTP response");
        return c0916s.mo1628a().mo147b() == this.f1497c ? true : null;
    }

    /* renamed from: b */
    public Map<String, C0082e> mo43b(C0159n c0159n, C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0916s, "HTTP response");
        c0159n = c0916s.getHeaders(this.f1498d);
        c0916s = new HashMap(c0159n.length);
        for (C0082e c0082e : c0159n) {
            C0163d a;
            int b;
            if (c0082e instanceof C0813d) {
                C0813d c0813d = (C0813d) c0082e;
                a = c0813d.mo1631a();
                b = c0813d.mo1632b();
            } else {
                String d = c0082e.mo122d();
                if (d != null) {
                    a = new C0163d(d.length());
                    a.m507a(d);
                    b = 0;
                } else {
                    throw new C1235o("Header value is null");
                }
            }
            while (b < a.m513c() && C0156d.m460a(a.m500a(b))) {
                b++;
            }
            int i = b;
            while (i < a.m513c() && !C0156d.m460a(a.m500a(i))) {
                i++;
            }
            c0916s.put(a.m502a(b, i).toLowerCase(Locale.ENGLISH), c0082e);
        }
        return c0916s;
    }

    /* renamed from: a */
    public Queue<C0000a> mo40a(Map<String, C0082e> map, C0159n c0159n, C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) map, "Map of auth challenges");
        C0160a.m478a((Object) c0159n, "Host");
        C0160a.m478a((Object) c0916s, "HTTP response");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0916s = C1239a.m2524a(c0157e);
        Queue<C0000a> linkedList = new LinkedList();
        C0044a f = c0916s.m2532f();
        if (f == null) {
            this.f1496a.m260a("Auth scheme registry not set in the context");
            return linkedList;
        }
        C0034i g = c0916s.m2533g();
        if (g == null) {
            this.f1496a.m260a("Credentials provider not set in the context");
            return linkedList;
        }
        c0916s = mo1603a(c0916s.m2537k());
        if (c0916s == null) {
            c0916s = f1495b;
        }
        if (this.f1496a.m262a()) {
            C0097b c0097b = this.f1496a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Authentication schemes in the order of preference: ");
            stringBuilder.append(r12);
            c0097b.m260a(stringBuilder.toString());
        }
        for (String str : r12) {
            C0082e c0082e = (C0082e) map.get(str.toLowerCase(Locale.ENGLISH));
            C0097b c0097b2;
            StringBuilder stringBuilder2;
            if (c0082e != null) {
                C0004e c0004e = (C0004e) f.mo2b(str);
                if (c0004e != null) {
                    C0002c a = c0004e.mo1a(c0157e);
                    a.mo1592a(c0082e);
                    C0009m a2 = g.mo50a(new C0005g(c0159n.m470a(), c0159n.m471b(), a.mo1920b(), a.mo1918a()));
                    if (a2 != null) {
                        linkedList.add(new C0000a(a, a2));
                    }
                } else if (this.f1496a.m268c()) {
                    c0097b2 = this.f1496a;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Authentication scheme ");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" not supported");
                    c0097b2.m266c(stringBuilder2.toString());
                }
            } else if (this.f1496a.m262a()) {
                c0097b2 = this.f1496a;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Challenge for ");
                stringBuilder2.append(str);
                stringBuilder2.append(" authentication scheme not available");
                c0097b2.m260a(stringBuilder2.toString());
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public void mo41a(C0159n c0159n, C0002c c0002c, C0157e c0157e) {
        C0160a.m478a((Object) c0159n, "Host");
        C0160a.m478a((Object) c0002c, "Auth scheme");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0157e = C1239a.m2524a(c0157e);
        if (m1627a(c0002c)) {
            C0014a h = c0157e.m2534h();
            if (h == null) {
                h = new C0844d();
                c0157e.m2527a(h);
            }
            if (this.f1496a.m262a() != null) {
                c0157e = this.f1496a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Caching '");
                stringBuilder.append(c0002c.mo1918a());
                stringBuilder.append("' auth scheme for ");
                stringBuilder.append(c0159n);
                c0157e.m260a(stringBuilder.toString());
            }
            h.mo46a(c0159n, c0002c);
        }
    }

    /* renamed from: a */
    protected boolean m1627a(C0002c c0002c) {
        boolean z = false;
        if (c0002c != null) {
            if (c0002c.mo1922d()) {
                c0002c = c0002c.mo1918a();
                if (c0002c.equalsIgnoreCase("Basic") || c0002c.equalsIgnoreCase("Digest") != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo44b(C0159n c0159n, C0002c c0002c, C0157e c0157e) {
        C0160a.m478a((Object) c0159n, "Host");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0002c = C1239a.m2524a(c0157e).m2534h();
        if (c0002c != null) {
            if (this.f1496a.m262a() != null) {
                c0157e = this.f1496a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Clearing cached auth scheme for ");
                stringBuilder.append(c0159n);
                c0157e.m260a(stringBuilder.toString());
            }
            c0002c.mo47b(c0159n);
        }
    }
}
