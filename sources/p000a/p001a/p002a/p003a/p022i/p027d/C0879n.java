package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Collection;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C0089i;
import p000a.p001a.p002a.p003a.p019f.C0090j;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;

/* compiled from: BrowserCompatSpecFactory */
/* renamed from: a.a.a.a.i.d.n */
public class C0879n implements C0089i, C0090j {
    /* renamed from: a */
    private final String[] f1607a;
    /* renamed from: b */
    private final C0124a f1608b;

    /* compiled from: BrowserCompatSpecFactory */
    /* renamed from: a.a.a.a.i.d.n$a */
    public enum C0124a {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public C0879n(String[] strArr, C0124a c0124a) {
        this.f1607a = strArr;
        this.f1608b = c0124a;
    }

    public C0879n() {
        this(null, C0124a.SECURITYLEVEL_DEFAULT);
    }

    /* renamed from: a */
    public C0088h mo95a(C0152e c0152e) {
        String[] strArr = null;
        if (c0152e == null) {
            return new C1327m(null, this.f1608b);
        }
        Collection collection = (Collection) c0152e.mo1602a("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C1327m(strArr, this.f1608b);
    }

    /* renamed from: a */
    public C0088h mo26a(C0157e c0157e) {
        return new C1327m(this.f1607a);
    }
}
