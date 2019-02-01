package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Collection;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C0089i;
import p000a.p001a.p002a.p003a.p019f.C0090j;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;

/* compiled from: RFC2109SpecFactory */
/* renamed from: a.a.a.a.i.d.y */
public class C0883y implements C0089i, C0090j {
    /* renamed from: a */
    private final String[] f1610a;
    /* renamed from: b */
    private final boolean f1611b;

    public C0883y(String[] strArr, boolean z) {
        this.f1610a = strArr;
        this.f1611b = z;
    }

    public C0883y() {
        this(null, false);
    }

    /* renamed from: a */
    public C0088h mo95a(C0152e c0152e) {
        if (c0152e == null) {
            return new C1330x();
        }
        String[] strArr = null;
        Collection collection = (Collection) c0152e.mo1602a("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C1330x(strArr, c0152e.mo153a("http.protocol.single-cookie-header", false));
    }

    /* renamed from: a */
    public C0088h mo26a(C0157e c0157e) {
        return new C1330x(this.f1610a, this.f1611b);
    }
}
