package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0098h;
import p000a.p001a.p002a.p003a.C0172u;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p005b.C0033h;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0088h;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: ResponseProcessCookies */
/* renamed from: a.a.a.a.b.e.i */
public class C0811i implements C0172u {
    /* renamed from: a */
    public C0097b f1430a = new C0097b(getClass());

    public void process(C0916s c0916s, C0157e c0157e) {
        C0160a.m478a((Object) c0916s, "HTTP request");
        C0160a.m478a((Object) c0157e, "HTTP context");
        c0157e = C1239a.m2524a(c0157e);
        C0088h c = c0157e.m2529c();
        if (c == null) {
            this.f1430a.m260a("Cookie spec not specified in HTTP context");
            return;
        }
        C0033h b = c0157e.m2528b();
        if (b == null) {
            this.f1430a.m260a("Cookie store not specified in HTTP context");
            return;
        }
        c0157e = c0157e.m2530d();
        if (c0157e == null) {
            this.f1430a.m260a("Cookie origin not specified in HTTP context");
            return;
        }
        m1492a(c0916s.headerIterator("Set-Cookie"), c, c0157e, b);
        if (c.mo96a() > 0) {
            m1492a(c0916s.headerIterator("Set-Cookie2"), c, c0157e, b);
        }
    }

    /* renamed from: a */
    private void m1492a(C0098h c0098h, C0088h c0088h, C0086e c0086e, C0033h c0033h) {
        while (c0098h.hasNext()) {
            C0082e a = c0098h.mo139a();
            try {
                for (C0083b c0083b : c0088h.mo97a(a, c0086e)) {
                    try {
                        c0088h.mo99a(c0083b, c0086e);
                        c0033h.addCookie(c0083b);
                        if (this.f1430a.m262a()) {
                            C0097b c0097b = this.f1430a;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Cookie accepted [");
                            stringBuilder.append(C0811i.m1491a(c0083b));
                            stringBuilder.append("]");
                            c0097b.m260a(stringBuilder.toString());
                        }
                    } catch (C1254l e) {
                        if (this.f1430a.m268c()) {
                            C0097b c0097b2 = this.f1430a;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Cookie rejected [");
                            stringBuilder2.append(C0811i.m1491a(c0083b));
                            stringBuilder2.append("] ");
                            stringBuilder2.append(e.getMessage());
                            c0097b2.m266c(stringBuilder2.toString());
                        }
                    }
                }
            } catch (C1254l e2) {
                if (this.f1430a.m268c()) {
                    C0097b c0097b3 = this.f1430a;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Invalid cookie header: \"");
                    stringBuilder3.append(a);
                    stringBuilder3.append("\". ");
                    stringBuilder3.append(e2.getMessage());
                    c0097b3.m266c(stringBuilder3.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private static String m1491a(C0083b c0083b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0083b.mo1605a());
        stringBuilder.append("=\"");
        String b = c0083b.mo1610b();
        if (b != null) {
            if (b.length() > 100) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(b.substring(0, 100));
                stringBuilder2.append("...");
                b = stringBuilder2.toString();
            }
            stringBuilder.append(b);
        }
        stringBuilder.append("\"");
        stringBuilder.append(", version:");
        stringBuilder.append(Integer.toString(c0083b.mo1623j()));
        stringBuilder.append(", domain:");
        stringBuilder.append(c0083b.mo1619f());
        stringBuilder.append(", path:");
        stringBuilder.append(c0083b.mo1620g());
        stringBuilder.append(", expiry:");
        stringBuilder.append(c0083b.mo1615d());
        return stringBuilder.toString();
    }
}
