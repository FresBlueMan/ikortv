package p000a.p001a.p002a.p003a.p019f;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p012d.C0044a;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: CookieSpecRegistry */
/* renamed from: a.a.a.a.f.k */
public final class C0829k implements C0044a<C0090j> {
    /* renamed from: a */
    private final ConcurrentHashMap<String, C0089i> f1456a = new ConcurrentHashMap();

    /* renamed from: b */
    public /* synthetic */ Object mo2b(String str) {
        return m1546a(str);
    }

    /* renamed from: a */
    public void m1547a(String str, C0089i c0089i) {
        C0160a.m478a((Object) str, "Name");
        C0160a.m478a((Object) c0089i, "Cookie spec factory");
        this.f1456a.put(str.toLowerCase(Locale.ENGLISH), c0089i);
    }

    /* renamed from: a */
    public C0088h m1545a(String str, C0152e c0152e) {
        C0160a.m478a((Object) str, "Name");
        C0089i c0089i = (C0089i) this.f1456a.get(str.toLowerCase(Locale.ENGLISH));
        if (c0089i != null) {
            return c0089i.mo95a(c0152e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported cookie spec: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public C0090j m1546a(final String str) {
        return new C0090j(this) {
            /* renamed from: b */
            final /* synthetic */ C0829k f1455b;

            /* renamed from: a */
            public C0088h mo26a(C0157e c0157e) {
                return this.f1455b.m1545a(str, ((C0915q) c0157e.mo159a("http.request")).getParams());
            }
        };
    }
}
