package p000a.p001a.p002a.p003a.p022i.p025c;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p013e.p015b.C0818f;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p033m.C0154a;

@Deprecated
/* compiled from: HttpPoolEntry */
/* renamed from: a.a.a.a.i.c.k */
class C0868k extends C0154a<C0817b, C1253q> {
    /* renamed from: a */
    public C0097b f1585a;
    /* renamed from: b */
    private final C0818f f1586b;

    public C0868k(C0097b c0097b, String str, C0817b c0817b, C1253q c1253q, long j, TimeUnit timeUnit) {
        super(str, c0817b, c1253q, j, timeUnit);
        this.f1585a = c0097b;
        this.f1586b = new C0818f(c0817b);
    }

    /* renamed from: a */
    public boolean mo77a(long j) {
        j = super.mo77a(j);
        if (j != null && this.f1585a.m262a()) {
            C0097b c0097b = this.f1585a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Connection ");
            stringBuilder.append(this);
            stringBuilder.append(" expired @ ");
            stringBuilder.append(new Date(m459h()));
            c0097b.m260a(stringBuilder.toString());
        }
        return j;
    }

    /* renamed from: a */
    C0818f m1724a() {
        return this.f1586b;
    }

    /* renamed from: b */
    C0817b m1726b() {
        return (C0817b) m457f();
    }

    /* renamed from: c */
    C0817b m1727c() {
        return this.f1586b.m1525j();
    }

    /* renamed from: d */
    public boolean m1728d() {
        return ((C1253q) m458g()).mo1932c() ^ 1;
    }

    /* renamed from: e */
    public void m1729e() {
        try {
            ((C1253q) m458g()).close();
        } catch (Throwable e) {
            this.f1585a.m261a("I/O error closing connection", e);
        }
    }
}
