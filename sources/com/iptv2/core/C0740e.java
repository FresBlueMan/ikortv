package com.iptv2.core;

import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0695d;
import com.iptv2.core.DataEntity.C0700k;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.p043b.C0590b;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0590b.C0589c;
import com.iptv2.p043b.C0591c;
import com.loopj.android.http.AsyncHttpClient;
import org.json.JSONObject;
import org.livestreamer.DnsServersDetector;
import org.livestreamer.LiveStreamer;

/* compiled from: P2pServer */
/* renamed from: com.iptv2.core.e */
public final class C0740e {
    /* renamed from: a */
    public static boolean f1315a = false;
    /* renamed from: b */
    private C0730c f1316b;
    /* renamed from: c */
    private AsyncHttpClient f1317c;
    /* renamed from: d */
    private LiveStreamer f1318d;
    /* renamed from: e */
    private int f1319e = 0;

    /* compiled from: P2pServer */
    /* renamed from: com.iptv2.core.e$a */
    public interface C0735a {
        /* renamed from: a */
        void mo1367a(boolean z, C0738d c0738d);
    }

    /* compiled from: P2pServer */
    /* renamed from: com.iptv2.core.e$b */
    public interface C0736b {
        /* renamed from: a */
        void mo1364a(boolean z, C0739e c0739e);
    }

    /* compiled from: P2pServer */
    /* renamed from: com.iptv2.core.e$c */
    public interface C0737c {
        /* renamed from: a */
        void mo1382a(String str);
    }

    /* compiled from: P2pServer */
    /* renamed from: com.iptv2.core.e$d */
    public static class C0738d {
        /* renamed from: a */
        public long f1306a;
        /* renamed from: b */
        public long f1307b;
        /* renamed from: c */
        public long f1308c;
    }

    /* compiled from: P2pServer */
    /* renamed from: com.iptv2.core.e$e */
    public static class C0739e {
        /* renamed from: a */
        public long f1309a;
        /* renamed from: b */
        public long f1310b;
        /* renamed from: c */
        public long f1311c;
        /* renamed from: d */
        public int f1312d;
        /* renamed from: e */
        public int f1313e;
        /* renamed from: f */
        public int f1314f;
    }

    public C0740e(C0730c c0730c) {
        this.f1316b = c0730c;
        this.f1318d = LiveStreamer.getInstance();
        this.f1317c = new AsyncHttpClient();
        this.f1317c.setMaxRetriesAndTimeout(0, 0);
        this.f1317c.setLoggingLevel(6);
        if (C0591c.f644a != null && f1315a != null) {
            this.f1318d.enableLogConsole();
        }
    }

    /* renamed from: a */
    public void m1335a() {
        C0591c.m790a("livestream start");
        this.f1318d.start(this.f1316b.f1248C.f1284c.f1158q, "127.0.0.1", "127.0.0.1", this.f1316b.f1248C.f1284c.f1148g, this.f1316b.f1248C.f1284c.f1149h, new DnsServersDetector(this.f1316b.f1260a).getBestIpv4DnsServer(), false);
    }

    /* renamed from: b */
    public void m1342b() {
        C0591c.m791a("test", "livestream stop");
        this.f1317c.cancelAllRequests(true);
        this.f1318d.stop();
    }

    /* renamed from: d */
    private int m1334d() {
        this.f1319e++;
        if (this.f1319e < 0) {
            this.f1319e = 0;
        }
        return this.f1319e;
    }

    /* renamed from: c */
    public void m1343c() {
        C0591c.m791a("P2pServer", "stopPlay");
        C0590b.m787a(this.f1316b.f1260a, this.f1317c, "http://127.0.0.1:18021/ctrl/stop", null);
    }

    /* renamed from: a */
    public void m1337a(C0693b c0693b, C0695d c0695d, final C0737c c0737c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("playLive ");
        stringBuilder.append(c0693b.f1071b);
        C0591c.m791a("P2pServer", stringBuilder.toString());
        c0693b = m1334d();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("http://127.0.0.1:18021/ctrl/play?streamid=");
        stringBuilder2.append(c0695d.f1087a);
        stringBuilder2.append("&tracker=");
        stringBuilder2.append(this.f1316b.f1248C.f1284c.f1157p);
        stringBuilder2.append("&playidx=");
        stringBuilder2.append(c0693b);
        C0590b.m787a(this.f1316b.f1260a, this.f1317c, stringBuilder2.toString(), new C0589c(this) {
            /* renamed from: c */
            final /* synthetic */ C0740e f2090c;

            /* renamed from: a */
            public void mo1346a(boolean z, String str, C0587a c0587a, Throwable th) {
                z = c0737c;
                str = new StringBuilder();
                str.append("http://127.0.0.1:18021/?playidx=");
                str.append(c0693b);
                z.mo1382a(str.toString());
            }
        });
    }

    /* renamed from: a */
    public void m1336a(C0693b c0693b, C0695d c0695d, long j, final C0737c c0737c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("playTimeShift ");
        stringBuilder.append(c0693b.f1071b);
        stringBuilder.append(" ");
        stringBuilder.append(j);
        C0591c.m791a("P2pServer", stringBuilder.toString());
        c0693b = m1334d();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("http://127.0.0.1:18021/ctrl/play?streamid=");
        stringBuilder2.append(c0695d.f1087a);
        stringBuilder2.append("&tracker=");
        stringBuilder2.append(this.f1316b.f1248C.f1284c.f1157p);
        stringBuilder2.append("&playidx=");
        stringBuilder2.append(c0693b);
        stringBuilder2.append("&shiftpts=");
        stringBuilder2.append(j);
        C0590b.m787a(this.f1316b.f1260a, this.f1317c, stringBuilder2.toString(), new C0589c(this) {
            /* renamed from: c */
            final /* synthetic */ C0740e f2093c;

            /* renamed from: a */
            public void mo1346a(boolean z, String str, C0587a c0587a, Throwable th) {
                z = c0737c;
                str = new StringBuilder();
                str.append("http://127.0.0.1:18021/?playidx=");
                str.append(c0693b);
                z.mo1382a(str.toString());
            }
        });
    }

    /* renamed from: a */
    public void m1338a(C0693b c0693b, C1174j c1174j, C0700k c0700k, C0737c c0737c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("playRecord ");
        stringBuilder.append(c0693b.f1071b);
        stringBuilder.append(" ");
        stringBuilder.append(c1174j.e);
        C0591c.m791a("P2pServer", stringBuilder.toString());
        c0693b = m1334d();
        c1174j = new StringBuilder();
        c1174j.append("http://127.0.0.1:18021/ctrl/file?fileid=");
        c1174j.append(c0700k.f1106b);
        c1174j.append("&tracker=");
        c1174j.append(this.f1316b.f1248C.f1284c.f1161t);
        c1174j.append("&playidx=");
        c1174j.append(c0693b);
        c0737c.mo1382a(c1174j.toString());
    }

    /* renamed from: a */
    public void m1339a(C0702m c0702m, C0703n c0703n, C0737c c0737c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("playVod ");
        stringBuilder.append(c0702m.f1113c);
        stringBuilder.append(" ");
        stringBuilder.append(c0703n.f1128a);
        C0591c.m791a("P2pServer", stringBuilder.toString());
        c0702m = m1334d();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("http://127.0.0.1:18021/ctrl/file?fileid=");
        stringBuilder2.append(c0703n.f1129b);
        stringBuilder2.append("&tracker=");
        stringBuilder2.append(this.f1316b.f1248C.f1284c.f1162u);
        stringBuilder2.append("&playidx=");
        stringBuilder2.append(c0702m);
        c0737c.mo1382a(stringBuilder2.toString());
    }

    /* renamed from: a */
    public void m1341a(final C0736b c0736b) {
        C0590b.m787a(this.f1316b.f1260a, this.f1317c, "http://127.0.0.1:18021/ctrl/stat", new C0589c(this) {
            /* renamed from: b */
            final /* synthetic */ C0740e f2095b;

            /* renamed from: a */
            public void mo1346a(boolean z, String str, C0587a c0587a, Throwable th) {
                c0587a = null;
                if (z) {
                    try {
                        th = new JSONObject(str);
                        str = new C0739e();
                        str.f1309a = th.getLong("speedin");
                        str.f1310b = th.getLong("speedout");
                        str.f1311c = th.getLong("cachebyte");
                        str.f1312d = th.getInt("t");
                        str.f1313e = th.getInt("s");
                        str.f1314f = th.getInt("r");
                        c0587a = str;
                    } catch (boolean z2) {
                        C0591c.m792a("P2pServer", "getStat", z2);
                        z2 = false;
                    }
                }
                c0736b.mo1364a(z2, c0587a);
            }
        });
    }

    /* renamed from: a */
    public void m1340a(final C0735a c0735a) {
        C0590b.m787a(this.f1316b.f1260a, this.f1317c, "http://127.0.0.1:18021/ctrl/pts", new C0589c(this) {
            /* renamed from: b */
            final /* synthetic */ C0740e f2097b;

            /* renamed from: a */
            public void mo1346a(boolean z, String str, C0587a c0587a, Throwable th) {
                c0587a = null;
                th = null;
                if (z) {
                    try {
                        z = new JSONObject(str);
                        str = new C0738d();
                        str.f1307b = z.getLong("currentpts");
                        str.f1306a = z.getLong("startpts");
                        str.f1308c = z.getLong("endpts");
                        c0587a = str.f1308c > str.f1306a;
                        th = str;
                    } catch (boolean z2) {
                        C0591c.m792a("P2pServer", "getPts", z2);
                    }
                } else {
                    c0587a = z2;
                }
                c0735a.mo1367a(c0587a, th);
            }
        });
    }
}
