package p000a.p001a.p002a.p003a.p022i.p029f;

import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.p030j.C0138d;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p031k.C0146s;
import p000a.p001a.p002a.p003a.p031k.C0898i;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: AbstractMessageWriter */
/* renamed from: a.a.a.a.i.f.b */
public abstract class C0888b<T extends C0169p> implements C0138d<T> {
    /* renamed from: a */
    protected final C0141g f1624a;
    /* renamed from: b */
    protected final C0163d f1625b = new C0163d(128);
    /* renamed from: c */
    protected final C0146s f1626c;

    /* renamed from: a */
    protected abstract void mo1624a(T t);

    @Deprecated
    public C0888b(C0141g c0141g, C0146s c0146s, C0152e c0152e) {
        C0160a.m478a((Object) c0141g, "Session input buffer");
        this.f1624a = c0141g;
        if (c0146s == null) {
            c0146s = C0898i.f1667b;
        }
        this.f1626c = c0146s;
    }

    /* renamed from: b */
    public void mo105b(T t) {
        C0160a.m478a((Object) t, "HTTP message");
        mo1624a(t);
        t = t.headerIterator();
        while (t.hasNext()) {
            this.f1624a.mo86a(this.f1626c.mo135a(this.f1625b, t.mo139a()));
        }
        this.f1625b.m503a();
        this.f1624a.mo86a(this.f1625b);
    }
}
