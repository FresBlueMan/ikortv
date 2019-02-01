package p000a.p001a.p002a.p003a.p031k;

import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p034n.C0156d;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: BasicHeaderValueParser */
/* renamed from: a.a.a.a.k.f */
public class C0897f implements C0145r {
    @Deprecated
    /* renamed from: a */
    public static final C0897f f1663a = new C0897f();
    /* renamed from: b */
    public static final C0897f f1664b = new C0897f();
    /* renamed from: c */
    private static final char[] f1665c = new char[]{';', ','};

    /* renamed from: a */
    public static C0091f[] m1854a(String str, C0145r c0145r) {
        C0160a.m478a((Object) str, "Value");
        C0163d c0163d = new C0163d(str.length());
        c0163d.m507a(str);
        C0148u c0148u = new C0148u(0, str.length());
        if (c0145r == null) {
            c0145r = f1664b;
        }
        return c0145r.mo132a(c0163d, c0148u);
    }

    /* renamed from: a */
    public C0091f[] mo132a(C0163d c0163d, C0148u c0148u) {
        C0160a.m478a((Object) c0163d, "Char array buffer");
        C0160a.m478a((Object) c0148u, "Parser cursor");
        List arrayList = new ArrayList();
        while (!c0148u.m427c()) {
            C0091f b = mo133b(c0163d, c0148u);
            if (b.mo126a().length() != 0 || b.mo127b() != null) {
                arrayList.add(b);
            }
        }
        return (C0091f[]) arrayList.toArray(new C0091f[arrayList.size()]);
    }

    /* renamed from: b */
    public C0091f mo133b(C0163d c0163d, C0148u c0148u) {
        C0160a.m478a((Object) c0163d, "Char array buffer");
        C0160a.m478a((Object) c0148u, "Parser cursor");
        C0175y d = m1861d(c0163d, c0148u);
        C0175y[] c = (c0148u.m427c() || c0163d.m500a(c0148u.m426b() - 1) == ',') ? null : m1860c(c0163d, c0148u);
        return m1855a(d.mo141a(), d.mo142b(), c);
    }

    /* renamed from: a */
    protected C0091f m1855a(String str, String str2, C0175y[] c0175yArr) {
        return new C0895c(str, str2, c0175yArr);
    }

    /* renamed from: c */
    public C0175y[] m1860c(C0163d c0163d, C0148u c0148u) {
        C0160a.m478a((Object) c0163d, "Char array buffer");
        C0160a.m478a((Object) c0148u, "Parser cursor");
        int b = c0148u.m426b();
        int a = c0148u.m424a();
        while (b < a && C0156d.m460a(c0163d.m500a(b))) {
            b++;
        }
        c0148u.m425a(b);
        if (c0148u.m427c()) {
            return new C0175y[null];
        }
        List arrayList = new ArrayList();
        while (!c0148u.m427c()) {
            arrayList.add(m1861d(c0163d, c0148u));
            if (c0163d.m500a(c0148u.m426b() - 1) == ',') {
                break;
            }
        }
        return (C0175y[]) arrayList.toArray(new C0175y[arrayList.size()]);
    }

    /* renamed from: d */
    public C0175y m1861d(C0163d c0163d, C0148u c0148u) {
        return m1856a(c0163d, c0148u, f1665c);
    }

    /* renamed from: a */
    private static boolean m1853a(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000a.p001a.p002a.p003a.C0175y m1856a(p000a.p001a.p002a.p003a.p035o.C0163d r13, p000a.p001a.p002a.p003a.p031k.C0148u r14, char[] r15) {
        /*
        r12 = this;
        r0 = "Char array buffer";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r13, r0);
        r0 = "Parser cursor";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r14, r0);
        r0 = r14.m426b();
        r1 = r14.m426b();
        r2 = r14.m424a();
    L_0x0016:
        r3 = 0;
        r4 = 1;
        if (r0 >= r2) goto L_0x002e;
    L_0x001a:
        r5 = r13.m500a(r0);
        r6 = 61;
        if (r5 != r6) goto L_0x0023;
    L_0x0022:
        goto L_0x002e;
    L_0x0023:
        r5 = p000a.p001a.p002a.p003a.p031k.C0897f.m1853a(r5, r15);
        if (r5 == 0) goto L_0x002b;
    L_0x0029:
        r5 = 1;
        goto L_0x002f;
    L_0x002b:
        r0 = r0 + 1;
        goto L_0x0016;
    L_0x002e:
        r5 = 0;
    L_0x002f:
        if (r0 != r2) goto L_0x0037;
    L_0x0031:
        r1 = r13.m510b(r1, r2);
        r5 = 1;
        goto L_0x003d;
    L_0x0037:
        r1 = r13.m510b(r1, r0);
        r0 = r0 + 1;
    L_0x003d:
        if (r5 == 0) goto L_0x0048;
    L_0x003f:
        r14.m425a(r0);
        r13 = 0;
        r13 = r12.m1857a(r1, r13);
        return r13;
    L_0x0048:
        r6 = r0;
        r7 = 0;
        r8 = 0;
    L_0x004b:
        r9 = 34;
        if (r6 >= r2) goto L_0x0072;
    L_0x004f:
        r10 = r13.m500a(r6);
        if (r10 != r9) goto L_0x0059;
    L_0x0055:
        if (r7 != 0) goto L_0x0059;
    L_0x0057:
        r8 = r8 ^ 1;
    L_0x0059:
        if (r8 != 0) goto L_0x0064;
    L_0x005b:
        if (r7 != 0) goto L_0x0064;
    L_0x005d:
        r11 = p000a.p001a.p002a.p003a.p031k.C0897f.m1853a(r10, r15);
        if (r11 == 0) goto L_0x0064;
    L_0x0063:
        goto L_0x0073;
    L_0x0064:
        if (r7 == 0) goto L_0x0068;
    L_0x0066:
        r7 = 0;
        goto L_0x006f;
    L_0x0068:
        if (r8 == 0) goto L_0x0066;
    L_0x006a:
        r7 = 92;
        if (r10 != r7) goto L_0x0066;
    L_0x006e:
        r7 = 1;
    L_0x006f:
        r6 = r6 + 1;
        goto L_0x004b;
    L_0x0072:
        r4 = r5;
    L_0x0073:
        if (r0 >= r6) goto L_0x0082;
    L_0x0075:
        r15 = r13.m500a(r0);
        r15 = p000a.p001a.p002a.p003a.p034n.C0156d.m460a(r15);
        if (r15 == 0) goto L_0x0082;
    L_0x007f:
        r0 = r0 + 1;
        goto L_0x0073;
    L_0x0082:
        r15 = r6;
    L_0x0083:
        if (r15 <= r0) goto L_0x0094;
    L_0x0085:
        r2 = r15 + -1;
        r2 = r13.m500a(r2);
        r2 = p000a.p001a.p002a.p003a.p034n.C0156d.m460a(r2);
        if (r2 == 0) goto L_0x0094;
    L_0x0091:
        r15 = r15 + -1;
        goto L_0x0083;
    L_0x0094:
        r2 = r15 - r0;
        r3 = 2;
        if (r2 < r3) goto L_0x00ab;
    L_0x0099:
        r2 = r13.m500a(r0);
        if (r2 != r9) goto L_0x00ab;
    L_0x009f:
        r2 = r15 + -1;
        r2 = r13.m500a(r2);
        if (r2 != r9) goto L_0x00ab;
    L_0x00a7:
        r0 = r0 + 1;
        r15 = r15 + -1;
    L_0x00ab:
        r13 = r13.m502a(r0, r15);
        if (r4 == 0) goto L_0x00b3;
    L_0x00b1:
        r6 = r6 + 1;
    L_0x00b3:
        r14.m425a(r6);
        r13 = r12.m1857a(r1, r13);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.k.f.a(a.a.a.a.o.d, a.a.a.a.k.u, char[]):a.a.a.a.y");
    }

    /* renamed from: a */
    protected C0175y m1857a(String str, String str2) {
        return new C0901l(str, str2);
    }
}
