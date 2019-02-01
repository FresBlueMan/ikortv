package p000a.p001a.p002a.p003a.p031k;

import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BasicHeaderValueFormatter */
/* renamed from: a.a.a.a.k.e */
public class C0143e {
    @Deprecated
    /* renamed from: a */
    public static final C0143e f287a = new C0143e();
    /* renamed from: b */
    public static final C0143e f288b = new C0143e();

    /* renamed from: a */
    public C0163d m399a(C0163d c0163d, C0091f c0091f, boolean z) {
        C0160a.m478a((Object) c0091f, "Header element");
        int a = m396a(c0091f);
        if (c0163d == null) {
            c0163d = new C0163d(a);
        } else {
            c0163d.m511b(a);
        }
        c0163d.m507a(c0091f.mo126a());
        String b = c0091f.mo127b();
        if (b != null) {
            c0163d.m504a('=');
            m402a(c0163d, b, z);
        }
        a = c0091f.mo129d();
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                c0163d.m507a("; ");
                m400a(c0163d, c0091f.mo124a(i), z);
            }
        }
        return c0163d;
    }

    /* renamed from: a */
    protected int m396a(C0091f c0091f) {
        int i = 0;
        if (c0091f == null) {
            return 0;
        }
        int length = c0091f.mo126a().length();
        String b = c0091f.mo127b();
        if (b != null) {
            length += b.length() + 3;
        }
        int d = c0091f.mo129d();
        if (d > 0) {
            while (i < d) {
                length += m397a(c0091f.mo124a(i)) + 2;
                i++;
            }
        }
        return length;
    }

    /* renamed from: a */
    public C0163d m401a(C0163d c0163d, C0175y[] c0175yArr, boolean z) {
        C0160a.m478a((Object) c0175yArr, "Header parameter array");
        int a = m398a(c0175yArr);
        if (c0163d == null) {
            c0163d = new C0163d(a);
        } else {
            c0163d.m511b(a);
        }
        for (a = 0; a < c0175yArr.length; a++) {
            if (a > 0) {
                c0163d.m507a("; ");
            }
            m400a(c0163d, c0175yArr[a], z);
        }
        return c0163d;
    }

    /* renamed from: a */
    protected int m398a(C0175y[] c0175yArr) {
        int i = 0;
        if (c0175yArr != null) {
            if (c0175yArr.length >= 1) {
                int length = (c0175yArr.length - 1) * 2;
                while (i < c0175yArr.length) {
                    length += m397a(c0175yArr[i]);
                    i++;
                }
                return length;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public C0163d m400a(C0163d c0163d, C0175y c0175y, boolean z) {
        C0160a.m478a((Object) c0175y, "Name / value pair");
        int a = m397a(c0175y);
        if (c0163d == null) {
            c0163d = new C0163d(a);
        } else {
            c0163d.m511b(a);
        }
        c0163d.m507a(c0175y.mo141a());
        String b = c0175y.mo142b();
        if (b != null) {
            c0163d.m504a('=');
            m402a(c0163d, b, z);
        }
        return c0163d;
    }

    /* renamed from: a */
    protected int m397a(C0175y c0175y) {
        if (c0175y == null) {
            return null;
        }
        int length = c0175y.mo141a().length();
        c0175y = c0175y.mo142b();
        if (c0175y != null) {
            length += c0175y.length() + 3;
        }
        return length;
    }

    /* renamed from: a */
    protected void m402a(C0163d c0163d, String str, boolean z) {
        int i = 0;
        if (!z) {
            boolean z2 = z;
            for (z = false; z < str.length() && !z2; z++) {
                z2 = m403a(str.charAt(z));
            }
            z = z2;
        }
        if (z) {
            c0163d.m504a('\"');
        }
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (m404b(charAt)) {
                c0163d.m504a('\\');
            }
            c0163d.m504a(charAt);
            i++;
        }
        if (z) {
            c0163d.m504a('\"');
        }
    }

    /* renamed from: a */
    protected boolean m403a(char c) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= '\u0000';
    }

    /* renamed from: b */
    protected boolean m404b(char c) {
        return "\"\\".indexOf(c) >= '\u0000';
    }
}
