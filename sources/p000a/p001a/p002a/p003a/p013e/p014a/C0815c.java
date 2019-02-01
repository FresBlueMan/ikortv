package p000a.p001a.p002a.p003a.p013e.p014a;

import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: ConnPerRouteBean */
/* renamed from: a.a.a.a.e.a.c */
public final class C0815c implements C0048b {
    /* renamed from: a */
    private final ConcurrentHashMap<C0817b, Integer> f1432a;
    /* renamed from: b */
    private volatile int f1433b;

    public C0815c(int i) {
        this.f1432a = new ConcurrentHashMap();
        m1497a(i);
    }

    public C0815c() {
        this(2);
    }

    /* renamed from: a */
    public void m1497a(int i) {
        C0160a.m475a(i, "Defautl max per route");
        this.f1433b = i;
    }

    /* renamed from: a */
    public int mo8a(C0817b c0817b) {
        C0160a.m478a((Object) c0817b, "HTTP route");
        Integer num = (Integer) this.f1432a.get(c0817b);
        if (num != null) {
            return num.intValue();
        }
        return this.f1433b;
    }

    public String toString() {
        return this.f1432a.toString();
    }
}
