package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.StringTokenizer;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0084c;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0827a;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1255n;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

/* compiled from: RFC2965PortAttributeHandler */
/* renamed from: a.a.a.a.i.d.ad */
public class ad implements C0084c {
    /* renamed from: a */
    private static int[] m1758a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        str = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                str[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (str[i] >= null) {
                    i++;
                } else {
                    throw new C1254l("Invalid Port attribute.");
                }
            } catch (String str2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid Port attribute: ");
                stringBuilder.append(str2.getMessage());
                throw new C1254l(stringBuilder.toString());
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static boolean m1757a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo94a(C0830m c0830m, String str) {
        C0160a.m478a((Object) c0830m, "Cookie");
        if (c0830m instanceof C1255n) {
            C1255n c1255n = (C1255n) c0830m;
            if (str != null && str.trim().length() > 0) {
                c1255n.mo1927a(ad.m1758a(str));
            }
        }
    }

    /* renamed from: a */
    public void mo92a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        int c = c0086e.m231c();
        if (!(c0083b instanceof C0827a) || !((C0827a) c0083b).mo1612b(OnNativeInvokeListener.ARG_PORT)) {
            return;
        }
        if (ad.m1757a(c, c0083b.mo1621h()) == null) {
            throw new C1320g("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    /* renamed from: b */
    public boolean mo93b(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        int c = c0086e.m231c();
        if ((c0083b instanceof C0827a) && ((C0827a) c0083b).mo1612b(OnNativeInvokeListener.ARG_PORT) && (c0083b.mo1621h() == null || ad.m1757a(c, c0083b.mo1621h()) == null)) {
            return false;
        }
        return true;
    }
}
