package p000a.p001a.p002a.p003a;

import java.io.Serializable;

/* compiled from: HttpVersion */
/* renamed from: a.a.a.a.v */
public final class C0917v extends ac implements Serializable {
    /* renamed from: a */
    public static final C0917v f1695a = new C0917v(0, 9);
    /* renamed from: b */
    public static final C0917v f1696b = new C0917v(1, 0);
    /* renamed from: c */
    public static final C0917v f1697c = new C0917v(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public C0917v(int i, int i2) {
        super("HTTP", i, i2);
    }

    /* renamed from: a */
    public ac mo161a(int i, int i2) {
        if (i == this.e && i2 == this.f) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return f1696b;
            }
            if (i2 == 1) {
                return f1697c;
            }
        }
        if (i == 0 && i2 == 9) {
            return f1695a;
        }
        return new C0917v(i, i2);
    }
}
