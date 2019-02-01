package p000a.p001a.p002a.p003a.p004a;

import java.util.Collection;
import java.util.Queue;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: AuthState */
/* renamed from: a.a.a.a.a.h */
public class C0006h {
    /* renamed from: a */
    private C0001b f16a = C0001b.UNCHALLENGED;
    /* renamed from: b */
    private C0002c f17b;
    /* renamed from: c */
    private C0005g f18c;
    /* renamed from: d */
    private C0009m f19d;
    /* renamed from: e */
    private Queue<C0000a> f20e;

    /* renamed from: a */
    public void m11a() {
        this.f16a = C0001b.UNCHALLENGED;
        this.f20e = null;
        this.f17b = null;
        this.f18c = null;
        this.f19d = null;
    }

    /* renamed from: b */
    public C0001b m17b() {
        return this.f16a;
    }

    /* renamed from: a */
    public void m12a(C0001b c0001b) {
        if (c0001b == null) {
            c0001b = C0001b.UNCHALLENGED;
        }
        this.f16a = c0001b;
    }

    /* renamed from: c */
    public C0002c m18c() {
        return this.f17b;
    }

    /* renamed from: d */
    public C0009m m19d() {
        return this.f19d;
    }

    /* renamed from: a */
    public void m14a(C0002c c0002c, C0009m c0009m) {
        C0160a.m478a((Object) c0002c, "Auth scheme");
        C0160a.m478a((Object) c0009m, "Credentials");
        this.f17b = c0002c;
        this.f19d = c0009m;
        this.f20e = null;
    }

    /* renamed from: e */
    public Queue<C0000a> m20e() {
        return this.f20e;
    }

    /* renamed from: a */
    public void m16a(Queue<C0000a> queue) {
        C0160a.m479a((Collection) queue, "Queue of auth options");
        this.f20e = queue;
        this.f17b = null;
        this.f19d = null;
    }

    @Deprecated
    /* renamed from: a */
    public void m13a(C0002c c0002c) {
        if (c0002c == null) {
            m11a();
        } else {
            this.f17b = c0002c;
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m15a(C0009m c0009m) {
        this.f19d = c0009m;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state:");
        stringBuilder.append(this.f16a);
        stringBuilder.append(";");
        if (this.f17b != null) {
            stringBuilder.append("auth scheme:");
            stringBuilder.append(this.f17b.mo1918a());
            stringBuilder.append(";");
        }
        if (this.f19d != null) {
            stringBuilder.append("credentials present");
        }
        return stringBuilder.toString();
    }
}
