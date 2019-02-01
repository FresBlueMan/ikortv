package com.iptv2.p044c.p045a;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.PointerIconCompat;
import android.widget.Toast;
import com.iptv2.activity.LiveActivity;
import com.iptv2.control.ToastGroupView;
import com.iptv2.core.Application;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.core.C0712a.C0710e;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.C0730c;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0695d;
import com.iptv2.core.DataEntity.C0699i;
import com.iptv2.core.DataEntity.C0700k;
import com.iptv2.core.DataEntity.C1174j;
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
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: LiveContext */
/* renamed from: com.iptv2.c.a.b */
public final class C0626b {
    /* renamed from: A */
    private C0625g f750A = C0625g.Normal;
    /* renamed from: B */
    private Runnable f751B = new C06201(this);
    /* renamed from: C */
    private Runnable f752C = new C06214(this);
    /* renamed from: a */
    public C0730c f753a;
    /* renamed from: b */
    public LiveActivity f754b;
    /* renamed from: c */
    public C0648g f755c;
    /* renamed from: d */
    public C0639e f756d;
    /* renamed from: e */
    public C0631c f757e;
    /* renamed from: f */
    public C0677g f758f;
    /* renamed from: g */
    public C0649a f759g;
    /* renamed from: h */
    public ToastGroupView f760h;
    /* renamed from: i */
    public C1134f f761i;
    /* renamed from: j */
    public C0693b f762j;
    /* renamed from: k */
    public C0695d f763k;
    /* renamed from: l */
    public C1174j f764l;
    /* renamed from: m */
    public C0700k f765m;
    /* renamed from: n */
    public C0623b f766n = C0623b.None;
    /* renamed from: o */
    public boolean f767o = false;
    /* renamed from: p */
    public ArrayList<C0699i> f768p;
    /* renamed from: q */
    public ArrayList<C0693b> f769q;
    /* renamed from: r */
    public HashMap<String, C0693b> f770r;
    /* renamed from: s */
    public HashMap<Integer, C0693b> f771s;
    /* renamed from: t */
    private ArrayList<C0622a> f772t = new ArrayList();
    /* renamed from: u */
    private C1351c f773u;
    /* renamed from: v */
    private boolean f774v = false;
    /* renamed from: w */
    private boolean f775w = false;
    /* renamed from: x */
    private int f776x = 0;
    /* renamed from: y */
    private long f777y = 0;
    /* renamed from: z */
    private C0624c f778z;

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$1 */
    class C06201 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0626b f740a;

        C06201(C0626b c0626b) {
            this.f740a = c0626b;
        }

        public void run() {
            if (!this.f740a.f754b.m3164d()) {
                this.f740a.f753a.f1263k.removeCallbacks(this.f740a.f752C);
                this.f740a.f776x = 0;
                this.f740a.f777y = C0730c.m1256b().getTime();
                this.f740a.f760h.m2465a();
                C0624c b = this.f740a.f778z;
                this.f740a.f778z = null;
                if (b instanceof C1116d) {
                    final C1116d c1116d = (C1116d) b;
                    if (c1116d.f1948a.f1077h.f1082a) {
                        this.f740a.f758f.m1152d();
                        if (!this.f740a.f753a.f1248C.m1321h()) {
                            this.f740a.f760h.m2466a(c1116d.f1948a.f1077h.f1084c);
                        } else if (this.f740a.f774v) {
                            this.f740a.f774v = false;
                        } else {
                            C0507a c0507a = new C0507a();
                            c0507a.f528b = c1116d.f1948a.f1077h.f1084c;
                            c0507a.f529c = this.f740a.f753a.f1251F.m1347b("buttonOk");
                            this.f740a.f773u = C1351c.m2970a(this.f740a.f754b, c0507a, new C0510d(this) {
                                /* renamed from: b */
                                final /* synthetic */ C06201 f1940b;

                                /* renamed from: a */
                                public void mo1306a(C1351c c1351c, C0509c c0509c) {
                                    if (!(this.f1940b.f740a.f773u != c1351c || c1116d.f1948a.f1077h.f1085d.equals("link") == null || this.f1940b.f740a.m892a(c1116d.f1948a.f1077h.f1086e) == null)) {
                                        this.f1940b.f740a.f774v = true;
                                    }
                                }
                            });
                        }
                    } else if (this.f740a.f762j.f1078i.size() == 0) {
                        this.f740a.f758f.m1152d();
                    } else {
                        this.f740a.f753a.f1248C.m1322i(c1116d.f1948a.f1070a);
                        this.f740a.f758f.m1143a(c1116d.f1948a, c1116d.f1949b);
                    }
                } else if (b instanceof C1118f) {
                    C1118f c1118f = (C1118f) b;
                    this.f740a.f753a.f1248C.m1322i(c1118f.f1953a.f1070a);
                    this.f740a.f758f.m1144a(c1118f.f1953a, c1118f.f1954b, c1118f.f1955c);
                } else if (b instanceof C1117e) {
                    C1117e c1117e = (C1117e) b;
                    this.f740a.f753a.f1248C.m1322i(c1117e.f1950a.f1070a);
                    this.f740a.f758f.m1145a(c1117e.f1950a, c1117e.f1951b, c1117e.f1952c);
                }
            }
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$4 */
    class C06214 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0626b f741a;

        C06214(C0626b c0626b) {
            this.f741a = c0626b;
        }

        public void run() {
            if (!this.f741a.f754b.m3164d()) {
                this.f741a.m887a(this.f741a.f750A);
            }
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$a */
    public static abstract class C0622a {
        /* renamed from: a */
        public void mo1360a(C0624c c0624c) {
        }

        /* renamed from: a */
        public void mo1361a(C0693b c0693b, boolean z) {
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$b */
    public enum C0623b {
        None,
        Live,
        TimeShift,
        Record
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$c */
    public static class C0624c {
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$g */
    public enum C0625g {
        Normal,
        PlayerFrozen
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$5 */
    class C11135 extends C0537a {
        /* renamed from: a */
        final /* synthetic */ C0626b f1945a;

        /* renamed from: b */
        public boolean mo1351b() {
            return true;
        }

        C11135(C0626b c0626b) {
            this.f1945a = c0626b;
        }

        /* renamed from: a */
        public void mo1309a(String str, String str2) {
            this.f1945a.f753a.f1248C.f1284c = null;
            this.f1945a.f753a.f1248C.f1285d = null;
            this.f1945a.f753a.f1248C.m1319g(str);
            this.f1945a.f753a.f1248C.m1320h(str2);
            this.f1945a.f753a.m1259a(this.f1945a.f754b);
        }

        /* renamed from: a */
        public void mo1349a() {
            this.f1945a.m903f();
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$6 */
    class C11146 extends C0528a {
        /* renamed from: a */
        final /* synthetic */ C0626b f1946a;

        /* renamed from: b */
        public boolean mo1355b() {
            return true;
        }

        C11146(C0626b c0626b) {
            this.f1946a = c0626b;
        }

        /* renamed from: a */
        public void mo1308a(String str, String str2, C0708c c0708c) {
            this.f1946a.f753a.f1248C.f1285d = null;
            this.f1946a.f753a.f1248C.m1297a(c0708c);
            this.f1946a.f753a.f1248C.m1319g(str);
            this.f1946a.f753a.f1248C.m1320h(str2);
            this.f1946a.f753a.m1259a(this.f1946a.f754b);
        }

        /* renamed from: a */
        public void mo1353a() {
            this.f1946a.m901e();
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$7 */
    class C11157 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ C0626b f1947a;

        C11157(C0626b c0626b) {
            this.f1947a = c0626b;
        }

        /* renamed from: e */
        public void mo1343e() {
            this.f1947a.f767o = true;
            this.f1947a.m894b(C0625g.Normal);
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$d */
    public static class C1116d extends C0624c {
        /* renamed from: a */
        public C0693b f1948a;
        /* renamed from: b */
        public C0695d f1949b;

        public C1116d(C0693b c0693b, C0695d c0695d) {
            this.f1948a = c0693b;
            this.f1949b = c0695d;
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$e */
    public static class C1117e extends C0624c {
        /* renamed from: a */
        public C0693b f1950a;
        /* renamed from: b */
        public C1174j f1951b;
        /* renamed from: c */
        public C0700k f1952c;

        public C1117e(C0693b c0693b, C1174j c1174j, C0700k c0700k) {
            this.f1950a = c0693b;
            this.f1951b = c1174j;
            this.f1952c = c0700k;
        }
    }

    /* compiled from: LiveContext */
    /* renamed from: com.iptv2.c.a.b$f */
    public static class C1118f extends C0624c {
        /* renamed from: a */
        public C0693b f1953a;
        /* renamed from: b */
        public C0695d f1954b;
        /* renamed from: c */
        public long f1955c;

        public C1118f(C0693b c0693b, C0695d c0695d, long j) {
            this.f1953a = c0693b;
            this.f1954b = c0695d;
            this.f1955c = j;
        }
    }

    /* renamed from: a */
    public void m910a(C0622a c0622a) {
        this.f772t.add(c0622a);
    }

    /* renamed from: a */
    private void m887a(final C0625g c0625g) {
        C0724a c11112 = new C0724a<C0710e>(this) {
            /* renamed from: b */
            final /* synthetic */ C0626b f1942b;

            /* renamed from: a */
            public void mo1314a(boolean z, C1184e<C0710e> c1184e, C0587a c0587a, Throwable th) {
                this.f1942b.f753a.f1263k.removeCallbacks(this.f1942b.f752C);
                if (!this.f1942b.f754b.m3164d()) {
                    Object[] objArr = new Object[1];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("status success:");
                    stringBuilder.append(z);
                    stringBuilder.append(",errorType:");
                    stringBuilder.append(c0587a);
                    stringBuilder.append(",ex:");
                    stringBuilder.append(th);
                    objArr[0] = stringBuilder.toString();
                    KLog.m1449d("LiveContext", objArr);
                    c0587a = this.f1942b.f753a.f1248C.f1284c.f1156o;
                    if (z) {
                        if (c0625g == C0625g.PlayerFrozen && this.f1942b.f766n == C0623b.Live) {
                            this.f1942b.f758f.m1143a(this.f1942b.f762j, this.f1942b.f763k);
                            if (Application.f1062a) {
                                z = this.f1942b.f753a.f1260a;
                                c0587a = new StringBuilder();
                                c0587a.append("switch channel:");
                                c0587a.append(this.f1942b.f762j.f1071b);
                                Toast.makeText(z, c0587a.toString(), 0).show();
                            }
                        }
                        this.f1942b.f776x = 0;
                        this.f1942b.f777y = C0730c.m1256b().getTime();
                        z = ((C0710e) c1184e.f2086c).f1164a;
                        if (z <= false) {
                            c1184e = new StringBuilder();
                            c1184e.append("status success, next delay ");
                            c1184e.append(z);
                            c1184e.append("s");
                            KLog.m1448d(c1184e.toString());
                            this.f1942b.f750A = C0625g.Normal;
                            this.f1942b.f753a.f1263k.postDelayed(this.f1942b.f752C, (long) (z * 1000));
                        } else {
                            KLog.m1448d("status success, next cancel");
                        }
                    } else if (c1184e != null && !c1184e.b) {
                        this.f1942b.m889a((C1184e) c1184e);
                    } else if (c0587a != true) {
                        if (!this.f1942b.f776x) {
                            this.f1942b.f777y = C0730c.m1256b().getTime();
                            KLog.m1448d("mStatusRetryCount = 0,init time");
                        }
                        if (C0730c.m1256b().getTime() - this.f1942b.f777y > ((long) (c0587a * 1000))) {
                            KLog.m1448d("status timeout");
                            this.f1942b.f758f.m1152d();
                            this.f1942b.f760h.m2466a(this.f1942b.f753a.f1251F.m1350e("connectError"));
                            this.f1942b.f776x = 0;
                            this.f1942b.f777y = C0730c.m1256b().getTime();
                        } else {
                            this.f1942b.f776x = this.f1942b.f776x + 1;
                            z = Math.min(true, ((int) Math.pow(0, (double) (this.f1942b.f776x - 1))) * Math.max(true, c0587a / 20));
                            c1184e = new StringBuilder();
                            c1184e.append("status retry delay ");
                            c1184e.append(z);
                            c1184e.append("s");
                            KLog.m1448d(c1184e.toString());
                            if (Application.f1062a != null) {
                                c1184e = this.f1942b.f753a.f1260a;
                                c0587a = new StringBuilder();
                                c0587a.append("status api Failed,retry delay ");
                                c0587a.append(z);
                                c0587a.append("s");
                                Toast.makeText(c1184e, c0587a.toString(), 0).show();
                            }
                            this.f1942b.f750A = c0625g;
                            this.f1942b.f753a.f1263k.postDelayed(this.f1942b.f752C, (long) (z * 1000));
                        }
                    }
                }
            }
        };
        if (this.f766n == C0623b.Live) {
            this.f753a.f1249D.m1239a(this.f762j, this.f763k, c11112);
        } else if (this.f766n == C0623b.TimeShift) {
            this.f753a.f1249D.m1250b(this.f762j, this.f763k, c11112);
        } else if (this.f766n == C0623b.Record) {
            this.f753a.f1249D.m1241a(this.f762j, this.f764l, this.f765m, c11112);
        }
    }

    /* renamed from: a */
    private void m889a(final C1184e<C0710e> c1184e) {
        this.f753a.f1263k.removeCallbacks(this.f752C);
        this.f758f.m1152d();
        if (c1184e.a.f1226a == PointerIconCompat.TYPE_HAND) {
            C0591c.m791a("LiveContext", "status UserMutiDeviceLogin");
            if (!"tv".equals("bind-device")) {
                this.f753a.f1247B = true;
                this.f753a.f1248C.f1284c = null;
                this.f753a.f1248C.f1285d = null;
                this.f753a.m1259a(this.f754b);
            }
            this.f753a.m1260a(c1184e.a.f1227b, 1);
        } else if (this.f753a.f1248C.m1321h()) {
            C0507a c0507a = new C0507a();
            c0507a.f528b = c1184e.a.f1227b;
            c0507a.f529c = this.f753a.f1251F.m1347b("buttonOk");
            this.f773u = C1351c.m2970a(this.f754b, c0507a, new C0510d(this) {
                /* renamed from: b */
                final /* synthetic */ C0626b f1944b;

                /* renamed from: a */
                public void mo1306a(C1351c c1351c, C0509c c0509c) {
                    if (this.f1944b.f773u == c1351c) {
                        if (c1184e.a.f1226a == 1007) {
                            this.f1944b.m901e();
                        } else if (!(c1184e.a.f1228c.equals("link") == null || this.f1944b.m892a(c1184e.a.f1229d) == null)) {
                            this.f1944b.f775w = true;
                        }
                    }
                }
            });
        } else {
            this.f760h.m2466a(c1184e.a.f1227b);
            if (c1184e.a.f1226a == 1007) {
                m901e();
            }
        }
    }

    /* renamed from: e */
    private void m901e() {
        C1354f c1354f = new C1354f();
        c1354f.m3073a(new C11135(this));
        c1354f.m2846a(this.f754b);
    }

    /* renamed from: f */
    private void m903f() {
        C1353e c1353e = new C1353e();
        c1353e.m3054a(new C11146(this));
        c1353e.m2846a(this.f754b);
    }

    /* renamed from: a */
    private boolean m892a(String str) {
        if (str != null) {
            if (!str.equals("")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str.contains("?") != null ? "&" : "?");
                stringBuilder.append("username=");
                stringBuilder.append(this.f753a.f1248C.m1308c());
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
                intent.addFlags(268435456);
                this.f754b.startActivity(intent);
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m909a() {
        this.f753a.f1250E.m1335a();
        if (this.f775w) {
            this.f775w = false;
        } else {
            m915b(m905g(), false);
        }
    }

    /* renamed from: b */
    public void m914b() {
        this.f753a.f1263k.removeCallbacks(this.f751B);
        this.f753a.f1263k.removeCallbacks(this.f752C);
        this.f758f.m1152d();
        this.f753a.f1250E.m1342b();
    }

    /* renamed from: g */
    private C0693b m905g() {
        C0693b c0693b = this.f762j;
        if (c0693b == null) {
            String m = this.f753a.f1248C.m1327m();
            Iterator it = this.f769q.iterator();
            while (it.hasNext()) {
                C0693b c0693b2 = (C0693b) it.next();
                if (c0693b2.f1070a.equals(m)) {
                    c0693b = c0693b2;
                    break;
                }
            }
        }
        return c0693b == null ? (C0693b) this.f769q.get(0) : c0693b;
    }

    /* renamed from: c */
    public void m916c() {
        this.f768p = new ArrayList(this.f753a.f1248C.f1284c.f1142a);
        this.f769q = new ArrayList(this.f753a.f1248C.f1284c.f1143b);
        this.f770r = new HashMap();
        this.f771s = new HashMap();
        Iterator it = this.f769q.iterator();
        while (it.hasNext()) {
            C0693b c0693b = (C0693b) it.next();
            this.f770r.put(c0693b.f1070a, c0693b);
            this.f771s.put(Integer.valueOf(c0693b.f1072c), c0693b);
        }
        this.f758f.m1142a(new C11157(this));
        this.f755c.m1021a();
    }

    /* renamed from: d */
    public void m917d() {
        m894b(C0625g.PlayerFrozen);
    }

    /* renamed from: b */
    private void m894b(C0625g c0625g) {
        this.f753a.f1263k.removeCallbacks(this.f752C);
        int i = this.f753a.f1248C.f1284c.f1155n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("status delay ");
        stringBuilder.append(i);
        stringBuilder.append("s");
        KLog.m1448d(stringBuilder.toString());
        if (i == -1) {
            KLog.m1448d("status cancel");
            return;
        }
        this.f750A = c0625g;
        if (this.f750A == C0625g.Normal) {
            this.f753a.f1263k.postDelayed(this.f752C, (long) (Math.max(10, i) * 1000));
        } else if (this.f750A == C0625g.PlayerFrozen) {
            this.f753a.f1263k.postDelayed(this.f752C, 2000);
        }
    }

    /* renamed from: a */
    public void m913a(C0693b c0693b, boolean z) {
        if (this.f753a.f1248C.m1301a(c0693b) != z) {
            this.f753a.f1248C.m1294a(c0693b, z);
            C0730c c0730c = this.f753a;
            int i = 0;
            c0730c.m1260a(this.f753a.f1251F.m1350e(z ? "favoriteSuccess" : "cancelFavoriteSuccess"), 0);
            int size = this.f772t.size();
            while (i < size) {
                ((C0622a) this.f772t.get(i)).mo1361a(c0693b, z);
                i++;
            }
        }
    }

    /* renamed from: b */
    public void m915b(C0693b c0693b, boolean z) {
        this.f753a.f1263k.removeCallbacks(this.f751B);
        this.f753a.f1263k.removeCallbacks(this.f752C);
        this.f762j = c0693b;
        int i = 0;
        this.f763k = c0693b.f1078i.size() > 0 ? (C0695d) c0693b.f1078i.get(0) : null;
        this.f764l = null;
        this.f765m = null;
        this.f766n = C0623b.Live;
        this.f767o = false;
        this.f778z = new C1116d(c0693b, this.f763k);
        this.f753a.f1263k.postDelayed(this.f751B, z ? 500 : 100);
        c0693b = this.f772t.size();
        while (i < c0693b) {
            ((C0622a) this.f772t.get(i)).mo1360a(this.f778z);
            i++;
        }
    }

    /* renamed from: a */
    public void m911a(C0693b c0693b, long j) {
        this.f753a.f1263k.removeCallbacks(this.f751B);
        this.f753a.f1263k.removeCallbacks(this.f752C);
        this.f762j = c0693b;
        int i = 0;
        this.f763k = c0693b.f1078i.size() > 0 ? (C0695d) c0693b.f1078i.get(0) : null;
        this.f764l = null;
        this.f765m = null;
        this.f766n = C0623b.TimeShift;
        this.f767o = false;
        this.f778z = new C1118f(c0693b, this.f763k, j);
        this.f753a.f1263k.postDelayed(this.f751B, 100);
        c0693b = this.f772t.size();
        while (i < c0693b) {
            ((C0622a) this.f772t.get(i)).mo1360a(this.f778z);
            i++;
        }
    }

    /* renamed from: a */
    public void m912a(C0693b c0693b, C1174j c1174j, boolean z) {
        this.f753a.f1263k.removeCallbacks(this.f751B);
        this.f753a.f1263k.removeCallbacks(this.f752C);
        this.f762j = c0693b;
        this.f763k = null;
        this.f764l = c1174j;
        int i = 0;
        this.f765m = (C0700k) c1174j.f2061b.get(0);
        this.f766n = C0623b.Record;
        this.f767o = false;
        this.f778z = new C1117e(c0693b, c1174j, this.f765m);
        this.f753a.f1263k.postDelayed(this.f751B, z ? 500 : 100);
        c0693b = this.f772t.size();
        while (i < c0693b) {
            ((C0622a) this.f772t.get(i)).mo1360a(this.f778z);
            i++;
        }
    }
}
