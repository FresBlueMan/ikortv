package p000a.p001a.p002a.p003a.p013e.p016c;

import android.support.v4.internal.view.SupportMenu;
import java.util.Locale;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0166g;

@Deprecated
/* compiled from: Scheme */
/* renamed from: a.a.a.a.e.c.e */
public final class C0057e {
    /* renamed from: a */
    private final String f114a;
    /* renamed from: b */
    private final C0059j f115b;
    /* renamed from: c */
    private final int f116c;
    /* renamed from: d */
    private final boolean f117d;
    /* renamed from: e */
    private String f118e;

    public C0057e(String str, int i, C0059j c0059j) {
        C0160a.m478a((Object) str, "Scheme name");
        boolean z = i > 0 && i <= SupportMenu.USER_MASK;
        C0160a.m480a(z, "Port is invalid");
        C0160a.m478a((Object) c0059j, "Socket factory");
        this.f114a = str.toLowerCase(Locale.ENGLISH);
        this.f116c = i;
        if ((c0059j instanceof C0822f) != null) {
            this.f117d = true;
            this.f115b = c0059j;
        } else if ((c0059j instanceof C0819b) != null) {
            this.f117d = true;
            this.f115b = new C1246h((C0819b) c0059j);
        } else {
            this.f117d = false;
            this.f115b = c0059j;
        }
    }

    @Deprecated
    public C0057e(String str, C0060l c0060l, int i) {
        C0160a.m478a((Object) str, "Scheme name");
        C0160a.m478a((Object) c0060l, "Socket factory");
        boolean z = i > 0 && i <= SupportMenu.USER_MASK;
        C0160a.m480a(z, "Port is invalid");
        this.f114a = str.toLowerCase(Locale.ENGLISH);
        if ((c0060l instanceof C0820c) != null) {
            this.f115b = new C1245g((C0820c) c0060l);
            this.f117d = true;
        } else {
            this.f115b = new C0823k(c0060l);
            this.f117d = false;
        }
        this.f116c = i;
    }

    /* renamed from: a */
    public final int m171a() {
        return this.f116c;
    }

    /* renamed from: b */
    public final C0059j m173b() {
        return this.f115b;
    }

    /* renamed from: c */
    public final String m174c() {
        return this.f114a;
    }

    /* renamed from: d */
    public final boolean m175d() {
        return this.f117d;
    }

    /* renamed from: a */
    public final int m172a(int i) {
        return i <= 0 ? this.f116c : i;
    }

    public final String toString() {
        if (this.f118e == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f114a);
            stringBuilder.append(':');
            stringBuilder.append(Integer.toString(this.f116c));
            this.f118e = stringBuilder.toString();
        }
        return this.f118e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0057e)) {
            return false;
        }
        C0057e c0057e = (C0057e) obj;
        if (!this.f114a.equals(c0057e.f114a) || this.f116c != c0057e.f116c || this.f117d != c0057e.f117d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0166g.m524a(C0166g.m523a(C0166g.m522a(17, this.f116c), this.f114a), this.f117d);
    }
}
