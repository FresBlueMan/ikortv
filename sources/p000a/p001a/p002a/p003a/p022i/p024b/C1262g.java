package p000a.p001a.p002a.p003a.p022i.p024b;

import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p032l.C0905a;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: ClientParamsStack */
/* renamed from: a.a.a.a.i.b.g */
public class C1262g extends C0905a {
    /* renamed from: a */
    protected final C0152e f2165a;
    /* renamed from: b */
    protected final C0152e f2166b;
    /* renamed from: c */
    protected final C0152e f2167c;
    /* renamed from: d */
    protected final C0152e f2168d;

    public C1262g(C0152e c0152e, C0152e c0152e2, C0152e c0152e3, C0152e c0152e4) {
        this.f2165a = c0152e;
        this.f2166b = c0152e2;
        this.f2167c = c0152e3;
        this.f2168d = c0152e4;
    }

    /* renamed from: a */
    public Object mo1602a(String str) {
        C0160a.m478a((Object) str, "Parameter name");
        Object a = this.f2168d != null ? this.f2168d.mo1602a(str) : null;
        if (a == null && this.f2167c != null) {
            a = this.f2167c.mo1602a(str);
        }
        if (a == null && this.f2166b != null) {
            a = this.f2166b.mo1602a(str);
        }
        return (a != null || this.f2165a == null) ? a : this.f2165a.mo1602a(str);
    }

    /* renamed from: a */
    public C0152e mo1601a(String str, Object obj) {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
