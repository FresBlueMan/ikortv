package com.iptv2.p044c.p046b;

import android.content.Intent;
import android.net.Uri;
import com.iptv2.activity.VodPlayerActivity;
import com.iptv2.control.ToastGroupView;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.core.C0712a.C0710e;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.C0730c;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.p042a.C1351c;
import com.iptv2.p042a.C1351c.C0507a;
import com.iptv2.p042a.C1351c.C0509c;
import com.iptv2.p042a.C1351c.C0510d;
import com.iptv2.p042a.C1353e;
import com.iptv2.p042a.C1353e.C0528a;
import com.iptv2.p042a.C1354f;
import com.iptv2.p042a.C1354f.C0537a;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p044c.C0649a;
import com.iptv2.p044c.C0677g;
import com.iptv2.p044c.C0677g.C0676a;
import com.socks.library.KLog;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* compiled from: VodContext */
/* renamed from: com.iptv2.c.b.a */
public final class C0653a {
    /* renamed from: a */
    public C0730c f909a;
    /* renamed from: b */
    public VodPlayerActivity f910b;
    /* renamed from: c */
    public C0677g f911c;
    /* renamed from: d */
    public C0649a f912d;
    /* renamed from: e */
    public ToastGroupView f913e;
    /* renamed from: f */
    public C0658b f914f;
    /* renamed from: g */
    public C1153c f915g;
    /* renamed from: h */
    public C0702m f916h;
    /* renamed from: i */
    public C0703n f917i;
    /* renamed from: j */
    public boolean f918j = false;
    /* renamed from: k */
    private ArrayList<C0652a> f919k = new ArrayList();
    /* renamed from: l */
    private C1351c f920l;
    /* renamed from: m */
    private boolean f921m = false;
    /* renamed from: n */
    private boolean f922n = false;
    /* renamed from: o */
    private int f923o = 0;
    /* renamed from: p */
    private long f924p = 0;
    /* renamed from: q */
    private Runnable f925q = new C06501(this);
    /* renamed from: r */
    private Runnable f926r = new C06512(this);

    /* compiled from: VodContext */
    /* renamed from: com.iptv2.c.b.a$1 */
    class C06501 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0653a f907a;

        /* compiled from: VodContext */
        /* renamed from: com.iptv2.c.b.a$1$1 */
        class C11391 extends C0510d {
            /* renamed from: a */
            final /* synthetic */ C06501 f2001a;

            C11391(C06501 c06501) {
                this.f2001a = c06501;
            }

            /* renamed from: a */
            public void mo1306a(C1351c c1351c, C0509c c0509c) {
                if (this.f2001a.f907a.f920l == c1351c) {
                    if (!(this.f2001a.f907a.f916h.f1127q.f1135c.equals("link") == null || this.f2001a.f907a.m1056a(this.f2001a.f907a.f916h.f1127q.f1136d) == null)) {
                        this.f2001a.f907a.f922n = true;
                    }
                    this.f2001a.f907a.f910b.finish();
                }
            }
        }

        C06501(C0653a c0653a) {
            this.f907a = c0653a;
        }

        public void run() {
            if (!this.f907a.f910b.m3164d()) {
                this.f907a.f909a.f1263k.removeCallbacks(this.f907a.f926r);
                this.f907a.f923o = 0;
                this.f907a.f924p = C0730c.m1256b().getTime();
                this.f907a.f913e.m2465a();
                if (this.f907a.f916h.f1127q.f1133a) {
                    if (!this.f907a.f909a.f1248C.m1321h()) {
                        this.f907a.f913e.m2466a(this.f907a.f916h.f1127q.f1134b);
                    } else if (this.f907a.f922n) {
                        this.f907a.f922n = false;
                        return;
                    } else {
                        C0507a c0507a = new C0507a();
                        c0507a.f528b = this.f907a.f916h.f1127q.f1134b;
                        c0507a.f529c = this.f907a.f909a.f1251F.m1347b("buttonOk");
                        this.f907a.f920l = C1351c.m2970a(this.f907a.f910b, c0507a, new C11391(this));
                    }
                    return;
                }
                this.f907a.f909a.f1248C.m1290a(this.f907a.f916h, this.f907a.f917i);
                this.f907a.f911c.m1146a(this.f907a.f916h, this.f907a.f917i);
            }
        }
    }

    /* compiled from: VodContext */
    /* renamed from: com.iptv2.c.b.a$2 */
    class C06512 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0653a f908a;

        /* compiled from: VodContext */
        /* renamed from: com.iptv2.c.b.a$2$1 */
        class C11411 implements C0724a<C0710e> {
            /* renamed from: a */
            final /* synthetic */ C06512 f2004a;

            C11411(C06512 c06512) {
                this.f2004a = c06512;
            }

            /* renamed from: a */
            public void mo1314a(boolean z, final C1184e<C0710e> c1184e, C0587a c0587a, Throwable th) {
                this.f2004a.f908a.f909a.f1263k.removeCallbacks(this.f2004a.f908a.f926r);
                if (!this.f2004a.f908a.f910b.m3164d()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("status success:");
                    stringBuilder.append(z);
                    stringBuilder.append(",errorType:");
                    stringBuilder.append(c0587a);
                    stringBuilder.append(",ex:");
                    stringBuilder.append(th);
                    C0591c.m791a("VodContext", stringBuilder.toString());
                    c0587a = this.f2004a.f908a.f909a.f1248C.f1284c.f1156o;
                    if (z) {
                        this.f2004a.f908a.f923o = 0;
                        this.f2004a.f908a.f924p = C0730c.m1256b().getTime();
                        z = ((C0710e) c1184e.f2086c).f1164a;
                        if (z <= false) {
                            c0587a = new StringBuilder();
                            c0587a.append("status success, next delay ");
                            c0587a.append(z);
                            c0587a.append("s");
                            C0591c.m791a("VodContext", c0587a.toString());
                            this.f2004a.f908a.f909a.f1263k.postDelayed(this.f2004a.f908a.f926r, (long) (z * 1000));
                        } else {
                            C0591c.m791a("VodContext", "status success, next cancel");
                        }
                    } else if (c1184e != null && !c1184e.b) {
                        this.f2004a.f908a.f911c.m1152d();
                        if (c1184e.a.f1226a == 1002) {
                            C0591c.m791a("VodContext", "status UserMutiDeviceLogin");
                            if ("tv".equals("bind-device") == null) {
                                this.f2004a.f908a.f909a.f1247B = true;
                                this.f2004a.f908a.f909a.f1248C.f1284c = null;
                                this.f2004a.f908a.f909a.f1248C.f1285d = null;
                                this.f2004a.f908a.f909a.m1259a(this.f2004a.f908a.f910b);
                            }
                            this.f2004a.f908a.f909a.m1260a(c1184e.a.f1227b, 1);
                        } else if (this.f2004a.f908a.f909a.f1248C.m1321h()) {
                            z = new C0507a();
                            z.f528b = c1184e.a.f1227b;
                            z.f529c = this.f2004a.f908a.f909a.f1251F.m1347b("buttonOk");
                            this.f2004a.f908a.f920l = C1351c.m2970a(this.f2004a.f908a.f910b, z, new C0510d(this) {
                                /* renamed from: b */
                                final /* synthetic */ C11411 f2003b;

                                /* renamed from: a */
                                public void mo1306a(C1351c c1351c, C0509c c0509c) {
                                    if (this.f2003b.f2004a.f908a.f920l == c1351c) {
                                        if (c1184e.a.f1226a == 1007) {
                                            this.f2003b.f2004a.f908a.m1060d();
                                        } else if (!(c1184e.a.f1228c.equals("link") == null || this.f2003b.f2004a.f908a.m1056a(c1184e.a.f1229d) == null)) {
                                            this.f2003b.f2004a.f908a.f921m = true;
                                        }
                                    }
                                }
                            });
                        } else {
                            this.f2004a.f908a.f913e.m2466a(c1184e.a.f1227b);
                            if (c1184e.a.f1226a) {
                                this.f2004a.f908a.m1060d();
                            }
                        }
                    } else if (c0587a != -1) {
                        if (this.f2004a.f908a.f923o == null) {
                            this.f2004a.f908a.f924p = C0730c.m1256b().getTime();
                            KLog.m1448d("mStatusRetryCount = 0,init time");
                        }
                        if (C0730c.m1256b().getTime() - this.f2004a.f908a.f924p > ((long) (c0587a * 1000))) {
                            KLog.m1448d("status timeout");
                            this.f2004a.f908a.f911c.m1152d();
                            this.f2004a.f908a.f913e.m2466a(this.f2004a.f908a.f909a.f1251F.m1350e("connectError"));
                            this.f2004a.f908a.f923o = 0;
                            this.f2004a.f908a.f924p = C0730c.m1256b().getTime();
                        } else {
                            this.f2004a.f908a.f923o = this.f2004a.f908a.f923o + 1;
                            z = Math.min(IjkMediaCodecInfo.RANK_LAST_CHANCE, ((int) Math.pow(0, (double) (this.f2004a.f908a.f923o - 1))) * Math.max(30, c0587a / 20));
                            c1184e = new StringBuilder();
                            c1184e.append("status retry delay ");
                            c1184e.append(z);
                            c1184e.append("s");
                            KLog.m1448d(c1184e.toString());
                            this.f2004a.f908a.f909a.f1263k.postDelayed(this.f2004a.f908a.f926r, (long) (z * 1000));
                        }
                    }
                }
            }
        }

        C06512(C0653a c0653a) {
            this.f908a = c0653a;
        }

        public void run() {
            if (!this.f908a.f910b.m3164d()) {
                this.f908a.f909a.f1249D.m1244a(this.f908a.f916h, this.f908a.f917i, new C11411(this));
            }
        }
    }

    /* compiled from: VodContext */
    /* renamed from: com.iptv2.c.b.a$a */
    public static abstract class C0652a {
        /* renamed from: a */
        public void mo1344a() {
        }

        /* renamed from: a */
        public void mo1374a(C0702m c0702m, boolean z) {
        }
    }

    /* compiled from: VodContext */
    /* renamed from: com.iptv2.c.b.a$3 */
    class C11423 extends C0537a {
        /* renamed from: a */
        final /* synthetic */ C0653a f2005a;

        /* renamed from: b */
        public boolean mo1351b() {
            return true;
        }

        C11423(C0653a c0653a) {
            this.f2005a = c0653a;
        }

        /* renamed from: a */
        public void mo1309a(String str, String str2) {
            this.f2005a.f909a.f1248C.f1284c = null;
            this.f2005a.f909a.f1248C.f1285d = null;
            this.f2005a.f909a.f1248C.m1319g(str);
            this.f2005a.f909a.f1248C.m1320h(str2);
            this.f2005a.f909a.m1259a(this.f2005a.f910b);
        }

        /* renamed from: a */
        public void mo1349a() {
            this.f2005a.m1063e();
        }
    }

    /* compiled from: VodContext */
    /* renamed from: com.iptv2.c.b.a$4 */
    class C11434 extends C0528a {
        /* renamed from: a */
        final /* synthetic */ C0653a f2006a;

        /* renamed from: b */
        public boolean mo1355b() {
            return true;
        }

        C11434(C0653a c0653a) {
            this.f2006a = c0653a;
        }

        /* renamed from: a */
        public void mo1308a(String str, String str2, C0708c c0708c) {
            this.f2006a.f909a.f1248C.f1285d = null;
            this.f2006a.f909a.f1248C.m1297a(c0708c);
            this.f2006a.f909a.f1248C.m1319g(str);
            this.f2006a.f909a.f1248C.m1320h(str2);
            this.f2006a.f909a.m1259a(this.f2006a.f910b);
        }

        /* renamed from: a */
        public void mo1353a() {
            this.f2006a.m1060d();
        }
    }

    /* compiled from: VodContext */
    /* renamed from: com.iptv2.c.b.a$5 */
    class C11445 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ C0653a f2007a;

        C11445(C0653a c0653a) {
            this.f2007a = c0653a;
        }

        /* renamed from: e */
        public void mo1343e() {
            this.f2007a.f918j = true;
            this.f2007a.f909a.f1263k.removeCallbacks(this.f2007a.f926r);
            int i = this.f2007a.f909a.f1248C.f1284c.f1155n;
            if (i == -1) {
                C0591c.m791a("VodContext", "status cancel");
                return;
            }
            i = Math.max(10, i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("status delay ");
            stringBuilder.append(i);
            stringBuilder.append("s");
            C0591c.m791a("VodContext", stringBuilder.toString());
            this.f2007a.f909a.f1263k.postDelayed(this.f2007a.f926r, (long) (i * 1000));
        }
    }

    /* renamed from: a */
    public void m1068a(C0652a c0652a) {
        this.f919k.add(c0652a);
    }

    /* renamed from: a */
    public void m1067a() {
        this.f909a.f1250E.m1335a();
        if (this.f921m) {
            this.f921m = false;
        } else {
            m1070a(this.f917i, true);
        }
    }

    /* renamed from: b */
    public void m1071b() {
        this.f909a.f1263k.removeCallbacks(this.f926r);
        this.f911c.m1152d();
        this.f909a.f1250E.m1342b();
    }

    /* renamed from: a */
    public void m1070a(C0703n c0703n, boolean z) {
        this.f909a.f1263k.removeCallbacks(this.f926r);
        this.f909a.f1263k.removeCallbacks(this.f925q);
        int i = 0;
        this.f918j = false;
        this.f917i = c0703n;
        this.f909a.f1263k.postDelayed(this.f925q, z ? 500 : 100);
        c0703n = this.f919k.size();
        while (i < c0703n) {
            ((C0652a) this.f919k.get(i)).mo1344a();
            i++;
        }
    }

    /* renamed from: d */
    private void m1060d() {
        C1354f c1354f = new C1354f();
        c1354f.m3073a(new C11423(this));
        c1354f.m2846a(this.f910b);
    }

    /* renamed from: e */
    private void m1063e() {
        C1353e c1353e = new C1353e();
        c1353e.m3054a(new C11434(this));
        c1353e.m2846a(this.f910b);
    }

    /* renamed from: c */
    public void m1072c() {
        if (this.f915g != null) {
            this.f915g.m2436d();
        }
        this.f914f.m1091b();
        this.f911c.m1142a(new C11445(this));
    }

    /* renamed from: a */
    private boolean m1056a(String str) {
        if (str != null) {
            if (!str.equals("")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str.contains("?") != null ? "&" : "?");
                stringBuilder.append("username=");
                stringBuilder.append(this.f909a.f1248C.m1308c());
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
                intent.addFlags(268435456);
                this.f910b.startActivity(intent);
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m1069a(C0702m c0702m, boolean z) {
        if (this.f909a.f1248C.m1307b(c0702m) != z) {
            this.f909a.f1248C.m1295a(c0702m, z);
            C0730c c0730c = this.f909a;
            int i = 0;
            c0730c.m1260a(this.f909a.f1251F.m1350e(z ? "favoriteSuccess" : "cancelFavoriteSuccess"), 0);
            int size = this.f919k.size();
            while (i < size) {
                ((C0652a) this.f919k.get(i)).mo1374a(c0702m, z);
                i++;
            }
        }
    }
}
