package p000a.p001a.p002a.p003a.p022i.p025c;

import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.p030j.C0139e;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p035o.C0163d;

@Deprecated
/* compiled from: LoggingSessionOutputBuffer */
/* renamed from: a.a.a.a.i.c.n */
public class C0870n implements C0141g {
    /* renamed from: a */
    private final C0141g f1591a;
    /* renamed from: b */
    private final C0122r f1592b;
    /* renamed from: c */
    private final String f1593c;

    public C0870n(C0141g c0141g, C0122r c0122r, String str) {
        this.f1591a = c0141g;
        this.f1592b = c0122r;
        if (str == null) {
            str = C0043c.f98b.name();
        }
        this.f1593c = str;
    }

    /* renamed from: a */
    public void mo88a(byte[] bArr, int i, int i2) {
        this.f1591a.mo88a(bArr, i, i2);
        if (this.f1592b.m358a()) {
            this.f1592b.m357a(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public void mo85a(int i) {
        this.f1591a.mo85a(i);
        if (this.f1592b.m358a()) {
            this.f1592b.m355a(i);
        }
    }

    /* renamed from: a */
    public void mo84a() {
        this.f1591a.mo84a();
    }

    /* renamed from: a */
    public void mo86a(C0163d c0163d) {
        this.f1591a.mo86a(c0163d);
        if (this.f1592b.m358a()) {
            String str = new String(c0163d.m512b(), 0, c0163d.m513c());
            c0163d = new StringBuilder();
            c0163d.append(str);
            c0163d.append("\r\n");
            this.f1592b.m356a(c0163d.toString().getBytes(this.f1593c));
        }
    }

    /* renamed from: a */
    public void mo87a(String str) {
        this.f1591a.mo87a(str);
        if (this.f1592b.m358a()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\r\n");
            this.f1592b.m356a(stringBuilder.toString().getBytes(this.f1593c));
        }
    }

    /* renamed from: b */
    public C0139e mo89b() {
        return this.f1591a.mo89b();
    }
}
