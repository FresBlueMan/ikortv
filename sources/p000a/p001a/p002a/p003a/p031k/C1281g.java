package p000a.p001a.p002a.p003a.p031k;

import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.ae;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicHttpRequest */
/* renamed from: a.a.a.a.k.g */
public class C1281g extends C0893a implements C0915q {
    /* renamed from: a */
    private final String f2190a;
    /* renamed from: b */
    private final String f2191b;
    /* renamed from: c */
    private ae f2192c;

    public C1281g(String str, String str2, ac acVar) {
        this(new C0902m(str, str2, acVar));
    }

    public C1281g(ae aeVar) {
        this.f2192c = (ae) C0160a.m478a((Object) aeVar, "Request line");
        this.f2190a = aeVar.mo143a();
        this.f2191b = aeVar.mo145c();
    }

    public ac getProtocolVersion() {
        return getRequestLine().mo144b();
    }

    public ae getRequestLine() {
        if (this.f2192c == null) {
            this.f2192c = new C0902m(this.f2190a, this.f2191b, C0917v.f1697c);
        }
        return this.f2192c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2190a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f2191b);
        stringBuilder.append(' ');
        stringBuilder.append(this.headergroup);
        return stringBuilder.toString();
    }
}
