package p000a.p001a.p002a.p003a.p005b.p048b;

import java.nio.charset.Charset;
import java.util.List;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p005b.p010f.C0030e;
import p000a.p001a.p002a.p003a.p020g.C0093e;
import p000a.p001a.p002a.p003a.p020g.C1258g;
import p000a.p001a.p002a.p003a.p034n.C0156d;

/* compiled from: UrlEncodedFormEntity */
/* renamed from: a.a.a.a.b.b.a */
public class C1316a extends C1258g {
    public C1316a(List<? extends C0175y> list, String str) {
        String str2;
        if (str != null) {
            str2 = str;
        } else {
            str2 = C0156d.f301a.name();
        }
        super(C0030e.m120a((List) list, str2), C0093e.m250a("application/x-www-form-urlencoded", str));
    }

    public C1316a(Iterable<? extends C0175y> iterable, Charset charset) {
        super(C0030e.m115a((Iterable) iterable, charset != null ? charset : C0156d.f301a), C0093e.m251a("application/x-www-form-urlencoded", charset));
    }
}
