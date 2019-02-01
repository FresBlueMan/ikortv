package p000a.p001a.p002a.p003a.p022i.p024b;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p004a.C0000a;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0005g;
import p000a.p001a.p002a.p003a.p005b.C0014a;
import p000a.p001a.p002a.p003a.p005b.C0015b;
import p000a.p001a.p002a.p003a.p005b.C0019c;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: AuthenticationStrategyAdaptor */
/* renamed from: a.a.a.a.i.b.b */
class C0842b implements C0019c {
    /* renamed from: a */
    public C0097b f1493a;
    /* renamed from: b */
    private final C0015b f1494b;

    /* renamed from: a */
    public boolean mo42a(C0159n c0159n, C0916s c0916s, C0157e c0157e) {
        return this.f1494b.m67a(c0916s, c0157e);
    }

    /* renamed from: b */
    public Map<String, C0082e> mo43b(C0159n c0159n, C0916s c0916s, C0157e c0157e) {
        return this.f1494b.m68b(c0916s, c0157e);
    }

    /* renamed from: a */
    public Queue<C0000a> mo40a(Map<String, C0082e> map, C0159n c0159n, C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) map, "Map of auth challenges");
        C0160a.m478a((Object) c0159n, "Host");
        C0160a.m478a((Object) c0916s, "HTTP response");
        C0160a.m478a((Object) c0157e, "HTTP context");
        Queue<C0000a> linkedList = new LinkedList();
        C0034i c0034i = (C0034i) c0157e.mo159a("http.auth.credentials-provider");
        if (c0034i == null) {
            this.f1493a.m260a("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            c0916s = this.f1494b.m66a(map, c0916s, c0157e);
            c0916s.mo1592a((C0082e) map.get(c0916s.mo1918a().toLowerCase(Locale.ENGLISH)));
            map = c0034i.mo50a(new C0005g(c0159n.m470a(), c0159n.m471b(), c0916s.mo1920b(), c0916s.mo1918a()));
            if (map != null) {
                linkedList.add(new C0000a(c0916s, map));
            }
            return linkedList;
        } catch (Map<String, C0082e> map2) {
            if (this.f1493a.m268c() != null) {
                this.f1493a.m267c(map2.getMessage(), map2);
            }
            return linkedList;
        }
    }

    /* renamed from: a */
    public void mo41a(C0159n c0159n, C0002c c0002c, C0157e c0157e) {
        C0014a c0014a = (C0014a) c0157e.mo159a("http.auth.auth-cache");
        if (m1617a(c0002c)) {
            if (c0014a == null) {
                c0014a = new C0844d();
                c0157e.mo160a("http.auth.auth-cache", c0014a);
            }
            if (this.f1493a.m262a() != null) {
                c0157e = this.f1493a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Caching '");
                stringBuilder.append(c0002c.mo1918a());
                stringBuilder.append("' auth scheme for ");
                stringBuilder.append(c0159n);
                c0157e.m260a(stringBuilder.toString());
            }
            c0014a.mo46a(c0159n, c0002c);
        }
    }

    /* renamed from: b */
    public void mo44b(C0159n c0159n, C0002c c0002c, C0157e c0157e) {
        C0014a c0014a = (C0014a) c0157e.mo159a("http.auth.auth-cache");
        if (c0014a != null) {
            if (this.f1493a.m262a()) {
                C0097b c0097b = this.f1493a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Removing from cache '");
                stringBuilder.append(c0002c.mo1918a());
                stringBuilder.append("' auth scheme for ");
                stringBuilder.append(c0159n);
                c0097b.m260a(stringBuilder.toString());
            }
            c0014a.mo47b(c0159n);
        }
    }

    /* renamed from: a */
    private boolean m1617a(C0002c c0002c) {
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

    /* renamed from: a */
    public C0015b m1618a() {
        return this.f1494b;
    }
}
