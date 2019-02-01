package p000a.p001a.p002a.p003a.p013e.p016c;

import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: SchemeRegistry */
/* renamed from: a.a.a.a.e.c.i */
public final class C0058i {
    /* renamed from: a */
    private final ConcurrentHashMap<String, C0057e> f119a = new ConcurrentHashMap();

    /* renamed from: a */
    public final C0057e m178a(String str) {
        C0057e b = m179b(str);
        if (b != null) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scheme '");
        stringBuilder.append(str);
        stringBuilder.append("' not registered.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final C0057e m177a(C0159n c0159n) {
        C0160a.m478a((Object) c0159n, "Host");
        return m178a(c0159n.m472c());
    }

    /* renamed from: b */
    public final C0057e m179b(String str) {
        C0160a.m478a((Object) str, "Scheme name");
        return (C0057e) this.f119a.get(str);
    }

    /* renamed from: a */
    public final C0057e m176a(C0057e c0057e) {
        C0160a.m478a((Object) c0057e, "Scheme");
        return (C0057e) this.f119a.put(c0057e.m174c(), c0057e);
    }
}
