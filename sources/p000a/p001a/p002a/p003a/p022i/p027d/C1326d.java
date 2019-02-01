package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.Date;
import p000a.p001a.p002a.p003a.p019f.C1255n;

/* compiled from: BasicClientCookie2 */
/* renamed from: a.a.a.a.i.d.d */
public class C1326d extends C1267c implements C1255n {
    private static final long serialVersionUID = -7744598295706617057L;
    /* renamed from: a */
    private String f2289a;
    /* renamed from: b */
    private int[] f2290b;
    /* renamed from: c */
    private boolean f2291c;

    public C1326d(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: h */
    public int[] mo1621h() {
        return this.f2290b;
    }

    /* renamed from: a */
    public void mo1927a(int[] iArr) {
        this.f2290b = iArr;
    }

    public void a_(String str) {
        this.f2289a = str;
    }

    /* renamed from: b */
    public void mo1929b(boolean z) {
        this.f2291c = z;
    }

    /* renamed from: e */
    public boolean mo1618e() {
        return !this.f2291c && super.mo1618e();
    }

    /* renamed from: a */
    public boolean mo1609a(Date date) {
        if (!this.f2291c) {
            if (super.mo1609a(date) == null) {
                return null;
            }
        }
        return true;
    }

    public Object clone() {
        C1326d c1326d = (C1326d) super.clone();
        if (this.f2290b != null) {
            c1326d.f2290b = (int[]) this.f2290b.clone();
        }
        return c1326d;
    }
}
