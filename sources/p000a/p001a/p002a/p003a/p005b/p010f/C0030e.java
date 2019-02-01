package p000a.p001a.p002a.p003a.p005b.p010f;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p031k.C0148u;
import p000a.p001a.p002a.p003a.p031k.C0897f;
import p000a.p001a.p002a.p003a.p031k.C0901l;
import p000a.p001a.p002a.p003a.p035o.C0163d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* compiled from: URLEncodedUtils */
/* renamed from: a.a.a.a.b.f.e */
public class C0030e {
    /* renamed from: a */
    private static final char[] f88a = new char[]{'&', ';'};
    /* renamed from: b */
    private static final String f89b;
    /* renamed from: c */
    private static final BitSet f90c = new BitSet(256);
    /* renamed from: d */
    private static final BitSet f91d = new BitSet(256);
    /* renamed from: e */
    private static final BitSet f92e = new BitSet(256);
    /* renamed from: f */
    private static final BitSet f93f = new BitSet(256);
    /* renamed from: g */
    private static final BitSet f94g = new BitSet(256);
    /* renamed from: h */
    private static final BitSet f95h = new BitSet(256);
    /* renamed from: i */
    private static final BitSet f96i = new BitSet(256);

    static {
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(new String(f88a));
        stringBuilder.append("]");
        f89b = stringBuilder.toString();
        for (i = 97; i <= IjkMediaMeta.FF_PROFILE_H264_HIGH_422; i++) {
            f90c.set(i);
        }
        for (i = 65; i <= 90; i++) {
            f90c.set(i);
        }
        for (i = 48; i <= 57; i++) {
            f90c.set(i);
        }
        f90c.set(95);
        f90c.set(45);
        f90c.set(46);
        f90c.set(42);
        f96i.or(f90c);
        f90c.set(33);
        f90c.set(126);
        f90c.set(39);
        f90c.set(40);
        f90c.set(41);
        f91d.set(44);
        f91d.set(59);
        f91d.set(58);
        f91d.set(36);
        f91d.set(38);
        f91d.set(43);
        f91d.set(61);
        f92e.or(f90c);
        f92e.or(f91d);
        f93f.or(f90c);
        f93f.set(47);
        f93f.set(59);
        f93f.set(58);
        f93f.set(64);
        f93f.set(38);
        f93f.set(61);
        f93f.set(43);
        f93f.set(36);
        f93f.set(44);
        f95h.set(59);
        f95h.set(47);
        f95h.set(63);
        f95h.set(58);
        f95h.set(64);
        f95h.set(38);
        f95h.set(61);
        f95h.set(43);
        f95h.set(36);
        f95h.set(44);
        f95h.set(91);
        f95h.set(93);
        f94g.or(f95h);
        f94g.or(f90c);
    }

    /* renamed from: a */
    public static List<C0175y> m121a(String str, Charset charset) {
        return C0030e.m122a(str, charset, f88a);
    }

    /* renamed from: a */
    public static List<C0175y> m122a(String str, Charset charset, char... cArr) {
        if (str == null) {
            return Collections.emptyList();
        }
        C0897f c0897f = C0897f.f1664b;
        C0163d c0163d = new C0163d(str.length());
        c0163d.m507a(str);
        C0148u c0148u = new C0148u(0, c0163d.m513c());
        List<C0175y> arrayList = new ArrayList();
        while (!c0148u.m427c()) {
            C0175y a = c0897f.m1856a(c0163d, c0148u, cArr);
            if (a.mo141a().length() > 0) {
                arrayList.add(new C0901l(C0030e.m126e(a.mo141a(), charset), C0030e.m126e(a.mo142b(), charset)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m120a(List<? extends C0175y> list, String str) {
        return C0030e.m119a((List) list, '&', str);
    }

    /* renamed from: a */
    public static String m119a(List<? extends C0175y> list, char c, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (C0175y c0175y : list) {
            String a = C0030e.m116a(c0175y.mo141a(), str);
            String a2 = C0030e.m116a(c0175y.mo142b(), str);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c);
            }
            stringBuilder.append(a);
            if (a2 != null) {
                stringBuilder.append("=");
                stringBuilder.append(a2);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m115a(Iterable<? extends C0175y> iterable, Charset charset) {
        return C0030e.m114a((Iterable) iterable, '&', charset);
    }

    /* renamed from: a */
    public static String m114a(Iterable<? extends C0175y> iterable, char c, Charset charset) {
        StringBuilder stringBuilder = new StringBuilder();
        for (C0175y c0175y : iterable) {
            String f = C0030e.m127f(c0175y.mo141a(), charset);
            String f2 = C0030e.m127f(c0175y.mo142b(), charset);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c);
            }
            stringBuilder.append(f);
            if (f2 != null) {
                stringBuilder.append("=");
                stringBuilder.append(f2);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m117a(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        str = charset.encode(str);
        while (str.hasRemaining() != null) {
            charset = str.get() & 255;
            if (bitSet.get(charset)) {
                stringBuilder.append((char) charset);
            } else if (z && charset == 32) {
                stringBuilder.append('+');
            } else {
                stringBuilder.append("%");
                char toUpperCase = Character.toUpperCase(Character.forDigit((charset >> 4) & 15, 16));
                charset = Character.toUpperCase(Character.forDigit(charset & 15, 16));
                stringBuilder.append(toUpperCase);
                stringBuilder.append(charset);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m118a(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        str = CharBuffer.wrap(str);
        while (str.hasRemaining()) {
            char c = str.get();
            if (c == '%' && str.remaining() >= 2) {
                c = str.get();
                char c2 = str.get();
                int digit = Character.digit(c, 16);
                int digit2 = Character.digit(c2, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c);
                    allocate.put((byte) c2);
                } else {
                    allocate.put((byte) ((digit << 4) + digit2));
                }
            } else if (z && c == '+') {
                allocate.put((byte) 32);
            } else {
                allocate.put((byte) c);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    /* renamed from: e */
    private static String m126e(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C0043c.f97a;
        }
        return C0030e.m118a(str, charset, true);
    }

    /* renamed from: a */
    private static String m116a(String str, String str2) {
        if (str == null) {
            return null;
        }
        return C0030e.m117a(str, str2 != null ? Charset.forName(str2) : C0043c.f97a, f96i, true);
    }

    /* renamed from: f */
    private static String m127f(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C0043c.f97a;
        }
        return C0030e.m117a(str, charset, f96i, true);
    }

    /* renamed from: b */
    static String m123b(String str, Charset charset) {
        return C0030e.m117a(str, charset, f92e, false);
    }

    /* renamed from: c */
    static String m124c(String str, Charset charset) {
        return C0030e.m117a(str, charset, f94g, false);
    }

    /* renamed from: d */
    static String m125d(String str, Charset charset) {
        return C0030e.m117a(str, charset, f93f, false);
    }
}
