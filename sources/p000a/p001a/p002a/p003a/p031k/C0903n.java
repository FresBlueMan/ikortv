package p000a.p001a.p002a.p003a.p031k;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicStatusLine */
/* renamed from: a.a.a.a.k.n */
public class C0903n implements af, Serializable, Cloneable {
    private static final long serialVersionUID = -2443303766890459269L;
    /* renamed from: a */
    private final ac f1680a;
    /* renamed from: b */
    private final int f1681b;
    /* renamed from: c */
    private final String f1682c;

    public C0903n(ac acVar, int i, String str) {
        this.f1680a = (ac) C0160a.m478a((Object) acVar, "Version");
        this.f1681b = C0160a.m482b(i, "Status code");
        this.f1682c = str;
    }

    /* renamed from: b */
    public int mo147b() {
        return this.f1681b;
    }

    /* renamed from: a */
    public ac mo146a() {
        return this.f1680a;
    }

    /* renamed from: c */
    public String mo148c() {
        return this.f1682c;
    }

    public String toString() {
        return C0898i.f1667b.m1866a(null, (af) this).toString();
    }

    public Object clone() {
        return super.clone();
    }
}
