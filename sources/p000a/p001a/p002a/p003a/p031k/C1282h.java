package p000a.p001a.p002a.p003a.p031k;

import java.util.Locale;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.ad;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicHttpResponse */
/* renamed from: a.a.a.a.k.h */
public class C1282h extends C0893a implements C0916s {
    /* renamed from: a */
    private af f2193a;
    /* renamed from: b */
    private ac f2194b;
    /* renamed from: c */
    private int f2195c;
    /* renamed from: d */
    private String f2196d;
    /* renamed from: e */
    private C0149k f2197e;
    /* renamed from: f */
    private final ad f2198f;
    /* renamed from: g */
    private Locale f2199g;

    public C1282h(af afVar, ad adVar, Locale locale) {
        this.f2193a = (af) C0160a.m478a((Object) afVar, "Status line");
        this.f2194b = afVar.mo146a();
        this.f2195c = afVar.mo147b();
        this.f2196d = afVar.mo148c();
        this.f2198f = adVar;
        this.f2199g = locale;
    }

    public ac getProtocolVersion() {
        return this.f2194b;
    }

    /* renamed from: a */
    public af mo1628a() {
        if (this.f2193a == null) {
            String str;
            ac acVar = this.f2194b != null ? this.f2194b : C0917v.f1697c;
            int i = this.f2195c;
            if (this.f2196d != null) {
                str = this.f2196d;
            } else {
                str = m2685a(this.f2195c);
            }
            this.f2193a = new C0903n(acVar, i, str);
        }
        return this.f2193a;
    }

    /* renamed from: b */
    public C0149k mo1630b() {
        return this.f2197e;
    }

    /* renamed from: a */
    public void mo1629a(C0149k c0149k) {
        this.f2197e = c0149k;
    }

    /* renamed from: a */
    protected String m2685a(int i) {
        if (this.f2198f == null) {
            return 0;
        }
        Locale locale;
        ad adVar = this.f2198f;
        if (this.f2199g != null) {
            locale = this.f2199g;
        } else {
            locale = Locale.getDefault();
        }
        return adVar.mo102a(i, locale);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mo1628a());
        stringBuilder.append(' ');
        stringBuilder.append(this.headergroup);
        if (this.f2197e != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.f2197e);
        }
        return stringBuilder.toString();
    }
}
