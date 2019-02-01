package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: AbstractCookieSpec */
/* renamed from: a.a.a.a.i.d.b */
public abstract class C0874b implements C0088h {
    /* renamed from: a */
    private final Map<String, C0084c> f1599a = new HashMap(10);

    /* renamed from: a */
    public void m1768a(String str, C0084c c0084c) {
        C0160a.m478a((Object) str, "Attribute name");
        C0160a.m478a((Object) c0084c, "Attribute handler");
        this.f1599a.put(str, c0084c);
    }

    /* renamed from: a */
    protected C0084c m1767a(String str) {
        return (C0084c) this.f1599a.get(str);
    }

    /* renamed from: c */
    protected Collection<C0084c> m1769c() {
        return this.f1599a.values();
    }
}
