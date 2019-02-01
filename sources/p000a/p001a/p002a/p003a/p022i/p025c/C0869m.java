package p000a.p001a.p002a.p003a.p022i.p025c;

import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.p030j.C0136b;
import p000a.p001a.p002a.p003a.p030j.C0139e;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p035o.C0163d;

@Deprecated
/* compiled from: LoggingSessionInputBuffer */
/* renamed from: a.a.a.a.i.c.m */
public class C0869m implements C0136b, C0140f {
    /* renamed from: a */
    private final C0140f f1587a;
    /* renamed from: b */
    private final C0136b f1588b;
    /* renamed from: c */
    private final C0122r f1589c;
    /* renamed from: d */
    private final String f1590d;

    public C0869m(C0140f c0140f, C0122r c0122r, String str) {
        this.f1587a = c0140f;
        this.f1588b = c0140f instanceof C0136b ? (C0136b) c0140f : null;
        this.f1589c = c0122r;
        if (str == null) {
            str = C0043c.f98b.name();
        }
        this.f1590d = str;
    }

    /* renamed from: a */
    public boolean mo81a(int i) {
        return this.f1587a.mo81a(i);
    }

    /* renamed from: a */
    public int mo80a(byte[] bArr, int i, int i2) {
        i2 = this.f1587a.mo80a(bArr, i, i2);
        if (this.f1589c.m358a() && i2 > 0) {
            this.f1589c.m361b(bArr, i, i2);
        }
        return i2;
    }

    /* renamed from: a */
    public int mo78a() {
        int a = this.f1587a.mo78a();
        if (this.f1589c.m358a() && a != -1) {
            this.f1589c.m359b(a);
        }
        return a;
    }

    /* renamed from: a */
    public int mo79a(C0163d c0163d) {
        int a = this.f1587a.mo79a(c0163d);
        if (this.f1589c.m358a() && a >= 0) {
            String str = new String(c0163d.m512b(), c0163d.m513c() - a, a);
            c0163d = new StringBuilder();
            c0163d.append(str);
            c0163d.append("\r\n");
            this.f1589c.m360b(c0163d.toString().getBytes(this.f1590d));
        }
        return a;
    }

    /* renamed from: b */
    public C0139e mo82b() {
        return this.f1587a.mo82b();
    }

    /* renamed from: c */
    public boolean mo83c() {
        return this.f1588b != null ? this.f1588b.mo83c() : false;
    }
}
