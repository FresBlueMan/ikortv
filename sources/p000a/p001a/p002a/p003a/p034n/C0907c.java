package p000a.p001a.p002a.p003a.p034n;

import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: DefaultedHttpContext */
/* renamed from: a.a.a.a.n.c */
public final class C0907c implements C0157e {
    /* renamed from: a */
    private final C0157e f1689a;
    /* renamed from: b */
    private final C0157e f1690b;

    public C0907c(C0157e c0157e, C0157e c0157e2) {
        this.f1689a = (C0157e) C0160a.m478a((Object) c0157e, "HTTP context");
        this.f1690b = c0157e2;
    }

    /* renamed from: a */
    public Object mo159a(String str) {
        Object a = this.f1689a.mo159a(str);
        return a == null ? this.f1690b.mo159a(str) : a;
    }

    /* renamed from: a */
    public void mo160a(String str, Object obj) {
        this.f1689a.mo160a(str, obj);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[local: ");
        stringBuilder.append(this.f1689a);
        stringBuilder.append("defaults: ");
        stringBuilder.append(this.f1690b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
