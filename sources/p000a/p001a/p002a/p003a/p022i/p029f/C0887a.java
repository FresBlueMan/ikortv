package p000a.p001a.p002a.p003a.p022i.p029f;

import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.C0174x;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p012d.C0046b;
import p000a.p001a.p002a.p003a.p030j.C0137c;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p031k.C0147t;
import p000a.p001a.p002a.p003a.p031k.C0899j;
import p000a.p001a.p002a.p003a.p032l.C0151d;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: AbstractMessageParser */
/* renamed from: a.a.a.a.i.f.a */
public abstract class C0887a<T extends C0169p> implements C0137c<T> {
    /* renamed from: a */
    private final C0140f f1618a;
    /* renamed from: b */
    protected final C0147t f1619b;
    /* renamed from: c */
    private final C0046b f1620c;
    /* renamed from: d */
    private final List<C0163d> f1621d;
    /* renamed from: e */
    private int f1622e;
    /* renamed from: f */
    private T f1623f;

    /* renamed from: b */
    protected abstract T mo1604b(C0140f c0140f);

    @Deprecated
    public C0887a(C0140f c0140f, C0147t c0147t, C0152e c0152e) {
        C0160a.m478a((Object) c0140f, "Session input buffer");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        this.f1618a = c0140f;
        this.f1620c = C0151d.m438a(c0152e);
        if (c0147t == null) {
            c0147t = C0899j.f1669b;
        }
        this.f1619b = c0147t;
        this.f1621d = new ArrayList();
        this.f1622e = null;
    }

    /* renamed from: a */
    public static C0082e[] m1802a(C0140f c0140f, int i, int i2, C0147t c0147t) {
        List arrayList = new ArrayList();
        if (c0147t == null) {
            c0147t = C0899j.f1669b;
        }
        return C0887a.m1803a(c0140f, i, i2, c0147t, arrayList);
    }

    /* renamed from: a */
    public static C0082e[] m1803a(C0140f c0140f, int i, int i2, C0147t c0147t, List<C0163d> list) {
        C0160a.m478a((Object) c0140f, "Session input buffer");
        C0160a.m478a((Object) c0147t, "Line parser");
        C0160a.m478a((Object) list, "Header line list");
        C0163d c0163d = null;
        C0163d c0163d2 = c0163d;
        while (true) {
            if (c0163d == null) {
                c0163d = new C0163d(64);
            } else {
                c0163d.m503a();
            }
            int i3 = 0;
            if (c0140f.mo79a(c0163d) == -1) {
                break;
            } else if (c0163d.m513c() < 1) {
                break;
            } else {
                if ((c0163d.m500a(0) == ' ' || c0163d.m500a(0) == '\t') && c0163d2 != null) {
                    while (i3 < c0163d.m513c()) {
                        char a = c0163d.m500a(i3);
                        if (a != ' ' && a != '\t') {
                            break;
                        }
                        i3++;
                    }
                    if (i2 > 0) {
                        if (((c0163d2.m513c() + 1) + c0163d.m513c()) - i3 > i2) {
                            throw new C0174x("Maximum line length limit exceeded");
                        }
                    }
                    c0163d2.m504a(' ');
                    c0163d2.m506a(c0163d, i3, c0163d.m513c() - i3);
                } else {
                    list.add(c0163d);
                    c0163d2 = c0163d;
                    c0163d = null;
                }
                if (i > 0) {
                    if (list.size() >= i) {
                        throw new C0174x("Maximum header count exceeded");
                    }
                }
            }
        }
        c0140f = new C0082e[list.size()];
        while (i3 < list.size()) {
            try {
                c0140f[i3] = c0147t.mo136a((C0163d) list.get(i3));
                i3++;
            } catch (C0140f c0140f2) {
                throw new ab(c0140f2.getMessage());
            }
        }
        return c0140f2;
    }

    /* renamed from: a */
    public T mo104a() {
        switch (this.f1622e) {
            case 0:
                try {
                    this.f1623f = mo1604b(this.f1618a);
                    this.f1622e = 1;
                    break;
                } catch (Throwable e) {
                    throw new ab(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.f1623f.setHeaders(C0887a.m1803a(this.f1618a, this.f1620c.m145b(), this.f1620c.m144a(), this.f1619b, this.f1621d));
        T t = this.f1623f;
        this.f1623f = null;
        this.f1621d.clear();
        this.f1622e = 0;
        return t;
    }
}
