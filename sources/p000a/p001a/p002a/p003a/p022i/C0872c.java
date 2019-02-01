package p000a.p001a.p002a.p003a.p022i;

import java.util.Locale;
import p000a.p001a.p002a.p003a.C0171t;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.ad;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p031k.C1282h;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: DefaultHttpResponseFactory */
/* renamed from: a.a.a.a.i.c */
public class C0872c implements C0171t {
    /* renamed from: a */
    public static final C0872c f1595a = new C0872c();
    /* renamed from: b */
    protected final ad f1596b;

    public C0872c(ad adVar) {
        this.f1596b = (ad) C0160a.m478a((Object) adVar, "Reason phrase catalog");
    }

    public C0872c() {
        this(C0884d.f1612a);
    }

    /* renamed from: a */
    public C0916s mo91a(af afVar, C0157e c0157e) {
        C0160a.m478a((Object) afVar, "Status line");
        return new C1282h(afVar, this.f1596b, m1744a(c0157e));
    }

    /* renamed from: a */
    protected Locale m1744a(C0157e c0157e) {
        return Locale.getDefault();
    }
}
