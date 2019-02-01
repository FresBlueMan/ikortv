package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Collection;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C0089i;
import p000a.p001a.p002a.p003a.p019f.C0090j;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;

/* compiled from: RFC2965SpecFactory */
/* renamed from: a.a.a.a.i.d.af */
public class af implements C0089i, C0090j {
    /* renamed from: a */
    private final String[] f1597a;
    /* renamed from: b */
    private final boolean f1598b;

    public af(String[] strArr, boolean z) {
        this.f1597a = strArr;
        this.f1598b = z;
    }

    public af() {
        this(null, false);
    }

    /* renamed from: a */
    public C0088h mo95a(C0152e c0152e) {
        if (c0152e == null) {
            return new ae();
        }
        String[] strArr = null;
        Collection collection = (Collection) c0152e.mo1602a("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new ae(strArr, c0152e.mo153a("http.protocol.single-cookie-header", false));
    }

    /* renamed from: a */
    public C0088h mo26a(C0157e c0157e) {
        return new ae(this.f1597a, this.f1598b);
    }
}
