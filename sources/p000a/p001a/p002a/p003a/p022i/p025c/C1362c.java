package p000a.p001a.p002a.p003a.p022i.p025c;

import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;

@Deprecated
/* compiled from: AbstractPooledConnAdapter */
/* renamed from: a.a.a.a.i.c.c */
public abstract class C1362c extends C1346a {
    /* renamed from: a */
    protected volatile C0118b f2468a;

    protected C1362c(C0055b c0055b, C0118b c0118b) {
        super(c0055b, c0118b.f243b);
        this.f2468a = c0118b;
    }

    @Deprecated
    /* renamed from: q */
    protected C0118b mo2129q() {
        return this.f2468a;
    }

    /* renamed from: a */
    protected void m3152a(C0118b c0118b) {
        if (m2890o() || c0118b == null) {
            throw new C0119e();
        }
    }

    /* renamed from: l */
    protected synchronized void mo2086l() {
        this.f2468a = null;
        super.mo2086l();
    }

    /* renamed from: h */
    public C0817b mo1916h() {
        C0118b q = mo2129q();
        m3152a(q);
        return q.f246e == null ? null : q.f246e.m1525j();
    }

    /* renamed from: a */
    public void mo2023a(C0817b c0817b, C0157e c0157e, C0152e c0152e) {
        C0118b q = mo2129q();
        m3152a(q);
        q.m346a(c0817b, c0157e, c0152e);
    }

    /* renamed from: a */
    public void mo2027a(boolean z, C0152e c0152e) {
        C0118b q = mo2129q();
        m3152a(q);
        q.m350a(z, c0152e);
    }

    /* renamed from: a */
    public void mo2025a(C0159n c0159n, boolean z, C0152e c0152e) {
        C0118b q = mo2129q();
        m3152a(q);
        q.m348a(c0159n, z, c0152e);
    }

    /* renamed from: a */
    public void mo2024a(C0157e c0157e, C0152e c0152e) {
        C0118b q = mo2129q();
        m3152a(q);
        q.m347a(c0157e, c0152e);
    }

    public void close() {
        C0118b q = mo2129q();
        if (q != null) {
            q.mo62b();
        }
        C1253q m = m2888m();
        if (m != null) {
            m.close();
        }
    }

    /* renamed from: e */
    public void mo1934e() {
        C0118b q = mo2129q();
        if (q != null) {
            q.mo62b();
        }
        C1253q m = m2888m();
        if (m != null) {
            m.mo1934e();
        }
    }

    /* renamed from: a */
    public void mo2026a(Object obj) {
        C0118b q = mo2129q();
        m3152a(q);
        q.m349a(obj);
    }
}
