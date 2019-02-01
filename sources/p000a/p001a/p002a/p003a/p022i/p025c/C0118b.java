package p000a.p001a.p002a.p003a.p022i.p025c;

import java.io.InterruptedIOException;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p013e.p015b.C0818f;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: AbstractPoolEntry */
/* renamed from: a.a.a.a.i.c.b */
public abstract class C0118b {
    /* renamed from: a */
    protected final C0071d f242a;
    /* renamed from: b */
    protected final C1253q f243b;
    /* renamed from: c */
    protected volatile C0817b f244c;
    /* renamed from: d */
    protected volatile Object f245d;
    /* renamed from: e */
    protected volatile C0818f f246e = null;

    protected C0118b(C0071d c0071d, C0817b c0817b) {
        C0160a.m478a((Object) c0071d, "Connection operator");
        this.f242a = c0071d;
        this.f243b = c0071d.mo72a();
        this.f244c = c0817b;
    }

    /* renamed from: a */
    public Object m345a() {
        return this.f245d;
    }

    /* renamed from: a */
    public void m349a(Object obj) {
        this.f245d = obj;
    }

    /* renamed from: a */
    public void m346a(C0817b c0817b, C0157e c0157e, C0152e c0152e) {
        C0159n c0159n;
        C0160a.m478a((Object) c0817b, "Route");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        if (this.f246e != null) {
            C0161b.m485a(this.f246e.m1524i() ^ 1, "Connection already open");
        }
        this.f246e = new C0818f(c0817b);
        C0159n d = c0817b.mo14d();
        C0071d c0071d = this.f242a;
        C1253q c1253q = this.f243b;
        if (d != null) {
            c0159n = d;
        } else {
            c0159n = c0817b.mo10a();
        }
        c0071d.mo74a(c1253q, c0159n, c0817b.mo12b(), c0157e, c0152e);
        c0817b = this.f246e;
        if (c0817b == null) {
            throw new InterruptedIOException("Request aborted");
        } else if (d == null) {
            c0817b.m1513a(this.f243b.mo2021h());
        } else {
            c0817b.m1512a(d, this.f243b.mo2021h());
        }
    }

    /* renamed from: a */
    public void m350a(boolean z, C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        C0161b.m484a(this.f246e, "Route tracker");
        C0161b.m485a(this.f246e.m1524i(), "Connection not open");
        C0161b.m485a(this.f246e.mo15e() ^ 1, "Connection is already tunnelled");
        this.f243b.mo2018a(null, this.f246e.mo10a(), z, c0152e);
        this.f246e.m1516b(z);
    }

    /* renamed from: a */
    public void m348a(C0159n c0159n, boolean z, C0152e c0152e) {
        C0160a.m478a((Object) c0159n, "Next proxy");
        C0160a.m478a((Object) c0152e, "Parameters");
        C0161b.m484a(this.f246e, "Route tracker");
        C0161b.m485a(this.f246e.m1524i(), "Connection not open");
        this.f243b.mo2018a(null, c0159n, z, c0152e);
        this.f246e.m1515b(c0159n, z);
    }

    /* renamed from: a */
    public void m347a(C0157e c0157e, C0152e c0152e) {
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        C0161b.m484a(this.f246e, "Route tracker");
        C0161b.m485a(this.f246e.m1524i(), "Connection not open");
        C0161b.m485a(this.f246e.mo15e(), "Protocol layering without a tunnel not supported");
        C0161b.m485a(this.f246e.mo16f() ^ 1, "Multiple protocol layering not supported");
        this.f242a.mo73a(this.f243b, this.f246e.mo10a(), c0157e, c0152e);
        this.f246e.m1518c(this.f243b.mo2021h());
    }

    /* renamed from: b */
    protected void mo62b() {
        this.f246e = null;
        this.f245d = null;
    }
}
