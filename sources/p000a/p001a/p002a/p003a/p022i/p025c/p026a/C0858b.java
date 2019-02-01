package p000a.p001a.p002a.p003a.p022i.p025c.p026a;

import java.util.concurrent.TimeUnit;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p022i.p025c.C0118b;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: BasicPoolEntry */
/* renamed from: a.a.a.a.i.c.a.b */
public class C0858b extends C0118b {
    /* renamed from: f */
    private final long f1540f = System.currentTimeMillis();
    /* renamed from: g */
    private long f1541g;
    /* renamed from: h */
    private final long f1542h;
    /* renamed from: i */
    private long f1543i;

    public C0858b(C0071d c0071d, C0817b c0817b, long j, TimeUnit timeUnit) {
        super(c0071d, c0817b);
        C0160a.m478a((Object) c0817b, "HTTP route");
        if (j > null) {
            this.f1542h = this.f1540f + timeUnit.toMillis(j);
        } else {
            this.f1542h = -1;
        }
        this.f1543i = this.f1542h;
    }

    /* renamed from: c */
    protected final C1253q m1676c() {
        return this.f243b;
    }

    /* renamed from: d */
    protected final C0817b m1677d() {
        return this.f244c;
    }

    /* renamed from: b */
    protected void mo62b() {
        super.mo62b();
    }

    /* renamed from: a */
    public void m1673a(long j, TimeUnit timeUnit) {
        this.f1541g = System.currentTimeMillis();
        this.f1543i = Math.min(this.f1542h, j > 0 ? this.f1541g + timeUnit.toMillis(j) : Long.MAX_VALUE);
    }

    /* renamed from: a */
    public boolean m1674a(long j) {
        return j >= this.f1543i ? 1 : 0;
    }
}
