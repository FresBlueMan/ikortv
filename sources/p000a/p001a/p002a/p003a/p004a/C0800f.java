package p000a.p001a.p002a.p003a.p004a;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p012d.C0044a;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: AuthSchemeRegistry */
/* renamed from: a.a.a.a.a.f */
public final class C0800f implements C0044a<C0004e> {
    /* renamed from: a */
    private final ConcurrentHashMap<String, C0003d> f1415a = new ConcurrentHashMap();

    /* renamed from: b */
    public /* synthetic */ Object mo2b(String str) {
        return m1474a(str);
    }

    /* renamed from: a */
    public void m1475a(String str, C0003d c0003d) {
        C0160a.m478a((Object) str, "Name");
        C0160a.m478a((Object) c0003d, "Authentication scheme factory");
        this.f1415a.put(str.toLowerCase(Locale.ENGLISH), c0003d);
    }

    /* renamed from: a */
    public C0002c m1473a(String str, C0152e c0152e) {
        C0160a.m478a((Object) str, "Name");
        C0003d c0003d = (C0003d) this.f1415a.get(str.toLowerCase(Locale.ENGLISH));
        if (c0003d != null) {
            return c0003d.mo36a(c0152e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported authentication scheme: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public C0004e m1474a(final String str) {
        return new C0004e(this) {
            /* renamed from: b */
            final /* synthetic */ C0800f f1414b;

            /* renamed from: a */
            public C0002c mo1a(C0157e c0157e) {
                return this.f1414b.m1473a(str, ((C0915q) c0157e.mo159a("http.request")).getParams());
            }
        };
    }
}
