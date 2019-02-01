package p000a.p001a.p002a.p003a.p033m;

import java.util.concurrent.TimeUnit;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: PoolEntry */
/* renamed from: a.a.a.a.m.a */
public abstract class C0154a<T, C> {
    /* renamed from: a */
    private final String f293a;
    /* renamed from: b */
    private final T f294b;
    /* renamed from: c */
    private final C f295c;
    /* renamed from: d */
    private final long f296d = System.currentTimeMillis();
    /* renamed from: e */
    private final long f297e;
    /* renamed from: f */
    private long f298f;
    /* renamed from: g */
    private long f299g;
    /* renamed from: h */
    private volatile Object f300h;

    public C0154a(String str, T t, C c, long j, TimeUnit timeUnit) {
        C0160a.m478a((Object) t, "Route");
        C0160a.m478a((Object) c, "Connection");
        C0160a.m478a((Object) timeUnit, "Time unit");
        this.f293a = str;
        this.f294b = t;
        this.f295c = c;
        if (j > null) {
            this.f297e = this.f296d + timeUnit.toMillis(j);
        } else {
            this.f297e = -1;
        }
        this.f299g = this.f297e;
    }

    /* renamed from: f */
    public T m457f() {
        return this.f294b;
    }

    /* renamed from: g */
    public C m458g() {
        return this.f295c;
    }

    /* renamed from: a */
    public void m455a(Object obj) {
        this.f300h = obj;
    }

    /* renamed from: h */
    public synchronized long m459h() {
        return this.f299g;
    }

    /* renamed from: a */
    public synchronized void m454a(long j, TimeUnit timeUnit) {
        C0160a.m478a((Object) timeUnit, "Time unit");
        this.f298f = System.currentTimeMillis();
        this.f299g = Math.min(j > 0 ? this.f298f + timeUnit.toMillis(j) : Long.MAX_VALUE, this.f297e);
    }

    /* renamed from: a */
    public synchronized boolean mo77a(long j) {
        return j >= this.f299g ? 1 : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id:");
        stringBuilder.append(this.f293a);
        stringBuilder.append("][route:");
        stringBuilder.append(this.f294b);
        stringBuilder.append("][state:");
        stringBuilder.append(this.f300h);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
