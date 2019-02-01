package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Collection;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C0089i;
import p000a.p001a.p002a.p003a.p019f.C0090j;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p034n.C0157e;

/* compiled from: NetscapeDraftSpecFactory */
/* renamed from: a.a.a.a.i.d.v */
public class C0881v implements C0089i, C0090j {
    /* renamed from: a */
    private final String[] f1609a;

    public C0881v(String[] strArr) {
        this.f1609a = strArr;
    }

    public C0881v() {
        this(null);
    }

    /* renamed from: a */
    public C0088h mo95a(C0152e c0152e) {
        if (c0152e == null) {
            return new C1329u();
        }
        String[] strArr = null;
        Collection collection = (Collection) c0152e.mo1602a("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C1329u(strArr);
    }

    /* renamed from: a */
    public C0088h mo26a(C0157e c0157e) {
        return new C1329u(this.f1609a);
    }
}
