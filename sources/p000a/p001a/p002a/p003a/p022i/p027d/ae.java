package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0827a;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p031k.C1283p;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

/* compiled from: RFC2965Spec */
/* renamed from: a.a.a.a.i.d.ae */
public class ae extends C1330x {
    /* renamed from: a */
    public int mo96a() {
        return 1;
    }

    public String toString() {
        return "rfc2965";
    }

    public ae() {
        this(null, false);
    }

    public ae(String[] strArr, boolean z) {
        super(strArr, z);
        m1768a("domain", new ac());
        m1768a(OnNativeInvokeListener.ARG_PORT, new ad());
        m1768a("commenturl", new aa());
        m1768a("discard", new ab());
        m1768a("version", new ag());
    }

    /* renamed from: a */
    public List<C0083b> mo97a(C0082e c0082e, C0086e c0086e) {
        C0160a.m478a((Object) c0082e, "Header");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0082e.mo121c().equalsIgnoreCase("Set-Cookie2")) {
            return m2935b(c0082e.mo123e(), ae.m2936c(c0086e));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized cookie header '");
        stringBuilder.append(c0082e.toString());
        stringBuilder.append("'");
        throw new C1254l(stringBuilder.toString());
    }

    /* renamed from: a */
    protected List<C0083b> mo2028a(C0091f[] c0091fArr, C0086e c0086e) {
        return m2935b(c0091fArr, ae.m2936c(c0086e));
    }

    /* renamed from: b */
    private List<C0083b> m2935b(C0091f[] c0091fArr, C0086e c0086e) {
        List<C0083b> arrayList = new ArrayList(c0091fArr.length);
        for (C0091f c0091f : c0091fArr) {
            String a = c0091f.mo126a();
            String b = c0091f.mo127b();
            if (a == null || a.length() == 0) {
                throw new C1254l("Cookie name may not be empty");
            }
            C0830m c1326d = new C1326d(a, b);
            c1326d.mo1617e(C1274p.m2667a(c0086e));
            c1326d.mo1616d(C1274p.m2668b(c0086e));
            c1326d.mo1927a(new int[]{c0086e.m231c()});
            C0175y[] c = c0091f.mo128c();
            Map hashMap = new HashMap(c.length);
            for (int length = c.length - 1; length >= 0; length--) {
                C0175y c0175y = c[length];
                hashMap.put(c0175y.mo141a().toLowerCase(Locale.ENGLISH), c0175y);
            }
            for (Entry value : hashMap.entrySet()) {
                c0175y = (C0175y) value.getValue();
                b = c0175y.mo141a().toLowerCase(Locale.ENGLISH);
                c1326d.m2643a(b, c0175y.mo142b());
                C0084c a2 = m1767a(b);
                if (a2 != null) {
                    a2.mo94a(c1326d, c0175y.mo142b());
                }
            }
            arrayList.add(c1326d);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo99a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        super.mo99a(c0083b, ae.m2936c(c0086e));
    }

    /* renamed from: b */
    public boolean mo101b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        return super.mo101b(c0083b, ae.m2936c(c0086e));
    }

    /* renamed from: a */
    protected void mo2029a(C0163d c0163d, C0083b c0083b, int i) {
        super.mo2029a(c0163d, c0083b, i);
        if ((c0083b instanceof C0827a) != 0) {
            i = ((C0827a) c0083b).mo1606a(OnNativeInvokeListener.ARG_PORT);
            if (i != 0) {
                c0163d.m507a("; $Port");
                c0163d.m507a("=\"");
                if (i.trim().length() > 0) {
                    c0083b = c0083b.mo1621h();
                    if (c0083b != null) {
                        i = c0083b.length;
                        for (int i2 = 0; i2 < i; i2++) {
                            if (i2 > 0) {
                                c0163d.m507a(",");
                            }
                            c0163d.m507a(Integer.toString(c0083b[i2]));
                        }
                    }
                }
                c0163d.m507a("\"");
            }
        }
    }

    /* renamed from: c */
    private static C0086e m2936c(C0086e c0086e) {
        String a = c0086e.m229a();
        Object obj = null;
        int i = 0;
        while (i < a.length()) {
            char charAt = a.charAt(i);
            if (charAt == '.') {
                break;
            } else if (charAt == ':') {
                break;
            } else {
                i++;
            }
        }
        obj = 1;
        if (obj == null) {
            return c0086e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(".local");
        return new C0086e(stringBuilder.toString(), c0086e.m231c(), c0086e.m230b(), c0086e.m232d());
    }

    /* renamed from: b */
    public C0082e mo100b() {
        C0163d c0163d = new C0163d(40);
        c0163d.m507a("Cookie2");
        c0163d.m507a(": ");
        c0163d.m507a("$Version=");
        c0163d.m507a(Integer.toString(mo96a()));
        return new C1283p(c0163d);
    }
}
