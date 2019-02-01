package com.iptv2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.graphics.drawable.PathInterpolatorCompat;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import br.iptv2.C0433a;
import br.iptv2.C0433a.C0432a;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.Activity;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.C0730c;
import com.iptv2.core.C0730c.C0729a;
import com.iptv2.core.DataEntity.RandomAccountInfo;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1349a;
import com.iptv2.p042a.C1349a.C0497a;
import com.iptv2.p042a.C1353e;
import com.iptv2.p042a.C1353e.C0528a;
import com.iptv2.p042a.C1354f;
import com.iptv2.p042a.C1354f.C0537a;
import com.iptv2.p042a.C1356h;
import com.iptv2.p042a.C1356h.C0549a;
import com.iptv2.p042a.C1356h.C0550b;
import com.iptv2.p043b.C0590b;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0590b.C0589c;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.loopj.android.http.AsyncHttpClient;
import com.socks.library.KLog;
import com.victor.loading.rotate.RotateLoading;
import java.io.File;

public class WelcomeActivity extends Activity {
    /* renamed from: a */
    private C0584a f2549a = C0584a.None;
    /* renamed from: b */
    private View f2550b;
    /* renamed from: h */
    private View f2551h;
    /* renamed from: i */
    private RotateLoading f2552i;
    /* renamed from: j */
    private TextView f2553j;
    /* renamed from: k */
    private TextView f2554k;
    /* renamed from: l */
    private AsyncHttpClient f2555l;
    /* renamed from: m */
    private int f2556m = 0;
    /* renamed from: n */
    private int f2557n;
    /* renamed from: o */
    private boolean f2558o = false;
    /* renamed from: p */
    private boolean f2559p = false;
    /* renamed from: q */
    private String[] f2560q = new String[0];

    /* renamed from: com.iptv2.activity.WelcomeActivity$1 */
    class C05811 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f629a;

        C05811(WelcomeActivity welcomeActivity) {
            this.f629a = welcomeActivity;
        }

        public void run() {
            if (this.f629a.f2549a == C0584a.None) {
                this.f629a.m3311a(C0584a.Anim);
            }
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$2 */
    class C05822 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f630a;

        C05822(WelcomeActivity welcomeActivity) {
            this.f630a = welcomeActivity;
        }

        public void run() {
            this.f630a.m3336k();
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$a */
    enum C0584a {
        None,
        Anim,
        TestApi,
        Login,
        Upgrade,
        Finish
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$3 */
    class C10943 implements Stop {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f1919a;

        C10943(WelcomeActivity welcomeActivity) {
            this.f1919a = welcomeActivity;
        }

        public void onStop() {
            this.f1919a.m3311a(C0584a.TestApi);
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$5 */
    class C10965 implements C0550b {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f1922a;

        C10965(WelcomeActivity welcomeActivity) {
            this.f1922a = welcomeActivity;
        }

        /* renamed from: a */
        public void mo1347a(C0549a c0549a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onDialogResult ");
            stringBuilder.append(c0549a);
            C0591c.m791a("WelcomeActivity", stringBuilder.toString());
            if (c0549a == C0549a.Cancel) {
                this.f1922a.c.m1262d();
            }
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$6 */
    class C10976 extends C0497a {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f1923a;

        /* renamed from: a */
        public boolean mo1348a() {
            return true;
        }

        C10976(WelcomeActivity welcomeActivity) {
            this.f1923a = welcomeActivity;
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$7 */
    class C10987 extends C0537a {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f1924a;

        /* renamed from: b */
        public boolean mo1351b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo1352c() {
            return true;
        }

        C10987(WelcomeActivity welcomeActivity) {
            this.f1924a = welcomeActivity;
        }

        /* renamed from: a */
        public void mo1309a(String str, String str2) {
            this.f1924a.c.f1248C.m1319g(str);
            this.f1924a.c.f1248C.m1320h(str2);
            this.f1924a.m3319a(str, str2, false);
        }

        /* renamed from: a */
        public void mo1349a() {
            this.f1924a.m3336k();
        }

        /* renamed from: a */
        public void mo1350a(boolean z) {
            if (!z) {
                this.f1924a.c.m1262d();
            }
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$8 */
    class C10998 extends C0528a {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f1925a;

        /* renamed from: b */
        public boolean mo1355b() {
            return true;
        }

        /* renamed from: e */
        public boolean mo1358e() {
            return true;
        }

        C10998(WelcomeActivity welcomeActivity) {
            this.f1925a = welcomeActivity;
        }

        /* renamed from: a */
        public void mo1308a(String str, String str2, C0708c c0708c) {
            this.f1925a.c.f1248C.m1319g(str);
            this.f1925a.c.f1248C.m1320h(str2);
            this.f1925a.m3317a(c0708c);
        }

        /* renamed from: a */
        public void mo1353a() {
            this.f1925a.m3334j();
        }

        /* renamed from: a */
        public void mo1354a(boolean z) {
            if (!z) {
                this.f1925a.c.m1262d();
            }
        }

        /* renamed from: c */
        public String mo1356c() {
            return this.f1925a.c.f1248C.m1308c();
        }

        /* renamed from: d */
        public String mo1357d() {
            return this.f1925a.c.f1248C.m1311d();
        }
    }

    /* renamed from: com.iptv2.activity.WelcomeActivity$9 */
    class C11009 implements C0724a<C0708c> {
        /* renamed from: a */
        final /* synthetic */ WelcomeActivity f1926a;

        C11009(WelcomeActivity welcomeActivity) {
            this.f1926a = welcomeActivity;
        }

        /* renamed from: a */
        public void mo1314a(boolean z, C1184e<C0708c> c1184e, C0587a c0587a, Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("doLogin success:");
            stringBuilder.append(z);
            stringBuilder.append(",errorType:");
            stringBuilder.append(c0587a);
            stringBuilder.append(",ex:");
            stringBuilder.append(th);
            C0591c.m790a(stringBuilder.toString());
            this.f1926a.m3320a((boolean) null);
            if (z) {
                this.f1926a.m3317a((C0708c) c1184e.f2086c);
            } else if (c1184e == null || c1184e.b) {
                this.f1926a.m3318a(this.f1926a.c.f1251F.m1350e("connectError"));
            } else if ("tv".equals("bind-device")) {
                this.f1926a.m3318a(c1184e.a.f1227b);
            } else {
                if (!c1184e.a.f1226a) {
                    if (!c1184e.a.f1226a) {
                        if (c1184e.a.f1226a) {
                            this.f1926a.m3336k();
                            this.f1926a.m3332i();
                            this.f1926a.c.m1260a(c1184e.a.f1227b, 1);
                        } else {
                            this.f1926a.m3318a(c1184e.a.f1227b);
                        }
                    }
                }
                this.f1926a.m3336k();
                this.f1926a.c.m1260a(c1184e.a.f1227b, 1);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = new String(Base64.decode(new String(Base64.decode("YUhSMGNEb3ZMMnR5TG05MGRHRndhUzV1WlhRNk9Ua3dNaXhvZEhSd09pOHZhV3R2Y2k1MGFIa3ViWGc2T1Rrd01peG9kSFJ3T2k4dgpZWEJwTG1scmIzSXVkSFk2T1Rrd01peG9kSFJ3T2k4dmEzSXViM1IwZFhObExtTnZiVG81T1RBeUxHaDBkSEE2THk5cmNpNXZkSFJoCmNHa3VibVYwT2pFNU9UQXlMR2gwZEhBNkx5OXBhMjl5TG5Sb2VTNXRlRG94T1Rrd01peG9kSFJ3T2k4dllYQnBMbWxyYjNJdWRIWTYKTVRrNU1ESXNhSFIwY0RvdkwydHlMbTkwZEhWelpTNWpiMjA2TVRrNU1EST0K", 0)), 0));
        bundle = new StringBuilder();
        bundle.append("decode2:");
        bundle.append(str);
        C0591c.m790a(bundle.toString());
        this.f2560q = str.split(",");
        C0730c.f1240d = this.c.f1248C.m1321h();
        if (C0433a.f355b == C0432a.Long) {
            C0730c.f1239c = 1;
        } else {
            C0730c.f1239c = 0;
        }
        setContentView(R.layout.activity_welcome);
        this.f2550b = findViewById(R.id.image_applogo);
        this.f2551h = findViewById(R.id.image_appname);
        this.f2552i = (RotateLoading) findViewById(R.id.loading);
        this.f2552i.start();
        this.f2553j = (TextView) findViewById(R.id.version);
        this.f2554k = (TextView) findViewById(R.id.message);
        bundle = this.f2553j;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("V");
        stringBuilder.append(this.c.f1275w.versionName);
        bundle.setText(stringBuilder.toString());
        this.f2555l = new AsyncHttpClient();
        this.f2555l.setTimeout(PathInterpolatorCompat.MAX_NUM_POINTS);
        this.f2557n = (this.f2560q.length * 3) - 1;
    }

    protected void onResume() {
        super.onResume();
        this.c.f1263k.postDelayed(new C05811(this), 1000);
    }

    /* renamed from: a */
    private void m3311a(C0584a c0584a) {
        C0584a c0584a2 = this.f2549a;
        if (c0584a2 != c0584a) {
            this.f2549a = c0584a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("changeViewState [");
            stringBuilder.append(c0584a2.name());
            stringBuilder.append("] to [");
            stringBuilder.append(c0584a);
            stringBuilder.append("]");
            C0591c.m790a(stringBuilder.toString());
            if (c0584a == C0584a.Anim) {
                m3322b();
            } else if (c0584a == C0584a.TestApi) {
                m3328g();
            } else if (c0584a == C0584a.Login) {
                m3337l();
            } else if (c0584a == C0584a.Upgrade) {
                m3330h();
            } else if (c0584a == C0584a.Finish) {
                m3340m();
            }
        }
    }

    /* renamed from: a */
    private void m3318a(String str) {
        boolean equals = str.equals("") ^ true;
        if (equals) {
            this.f2554k.setText(str);
        }
        if (this.f2558o != equals) {
            this.f2558o = equals;
            if (equals) {
                ViewAnimator.animate(this.f2554k).alpha(1.0f).duration(600).start();
            } else {
                ViewAnimator.animate(this.f2554k).alpha(0.0f).duration(600).start();
            }
        }
    }

    /* renamed from: a */
    private void m3320a(boolean z) {
        if (this.f2559p != z) {
            this.f2559p = z;
            if (z) {
                ViewAnimator.animate(new View[]{this.f2552i}).alpha(1.0f).duration(300).start();
            } else {
                ViewAnimator.animate(new View[]{this.f2552i}).alpha(0.0f).duration(300).start();
            }
        }
    }

    /* renamed from: b */
    private void m3322b() {
        ViewAnimator.animate(this.f2550b).translationY((float) (-this.f2550b.getHeight()), 0.0f).alpha(0.0f, 1.0f).interpolator(new OvershootInterpolator()).duration(2000).thenAnimate(this.f2551h, this.f2553j).alpha(0.0f, 1.0f).duration(600).onStop(new C10943(this)).start();
    }

    /* renamed from: g */
    private void m3328g() {
        KLog.m1448d("doState_TestApi............");
        if (this.c.f1248C.f1282a != null) {
            m3311a(C0584a.Login);
            return;
        }
        m3320a(true);
        final String str = this.f2560q[(this.f2556m / 3) % this.f2560q.length];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test apiServer url:");
        stringBuilder.append(str);
        KLog.m1448d(stringBuilder.toString());
        C0590b.m787a(this, this.f2555l, str, new C0589c(this) {
            /* renamed from: b */
            final /* synthetic */ WelcomeActivity f1921b;

            /* renamed from: com.iptv2.activity.WelcomeActivity$4$1 */
            class C05831 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C10954 f631a;

                C05831(C10954 c10954) {
                    this.f631a = c10954;
                }

                public void run() {
                    this.f631a.f1921b.m3328g();
                }
            }

            /* renamed from: a */
            public void mo1346a(boolean z, String str, C0587a c0587a, Throwable th) {
                if (z) {
                    this.f1921b.m3320a(false);
                    this.f1921b.c.f1248C.f1282a = str;
                    this.f1921b.m3311a(C0584a.Login);
                    return;
                }
                this.f1921b.f2556m = this.f1921b.f2556m + 1;
                if (this.f1921b.f2556m <= this.f1921b.f2557n) {
                    z = (this.f1921b.f2556m % 3) * 2;
                    str = new StringBuilder();
                    str.append("doState_TestApi after ");
                    str.append(z);
                    str.append("(s)");
                    KLog.m1448d(str.toString());
                    this.f1921b.c.f1263k.postDelayed(new C05831(this), (long) (z * 1000));
                    return;
                }
                this.f1921b.m3320a(false);
                this.f1921b.m3318a(this.f1921b.c.f1251F.m1350e("connectError"));
            }
        });
    }

    /* renamed from: h */
    private void m3330h() {
        C1356h c1356h = new C1356h();
        c1356h.m3119a(new C10965(this));
        c1356h.m2846a(this);
    }

    /* renamed from: i */
    private void m3332i() {
        C1349a c1349a = new C1349a();
        c1349a.m2966a(new C10976(this));
        c1349a.m2846a(this);
    }

    /* renamed from: j */
    private void m3334j() {
        C1354f c1354f = new C1354f();
        c1354f.m3073a(new C10987(this));
        c1354f.m2846a(this);
    }

    /* renamed from: k */
    private void m3336k() {
        C1353e c1353e = new C1353e();
        c1353e.m3054a(new C10998(this));
        c1353e.m2846a(this);
    }

    /* renamed from: a */
    private void m3319a(String str, String str2, boolean z) {
        m3320a(true);
        this.c.f1249D.m1249a(str, str2, z, new C11009(this));
    }

    /* renamed from: a */
    private void m3317a(C0708c c0708c) {
        if (c0708c.f1146e != null) {
            this.c.f1248C.f1286e = c0708c.f1146e;
            m3311a(C0584a.Upgrade);
            return;
        }
        this.c.f1248C.m1297a(c0708c);
        if (c0708c.f1154m.equals("live")) {
            this.c.f1261b = C0729a.Live;
        } else if (c0708c.f1154m.equals("vod") != null) {
            this.c.f1261b = C0729a.Vod;
        } else {
            this.c.f1261b = C0729a.All;
        }
        m3311a(C0584a.Finish);
    }

    /* renamed from: l */
    private void m3337l() {
        if (!"tv".equals("bind-device") && this.c.f1247B) {
            this.c.f1247B = false;
            m3336k();
        } else if (this.c.f1248C.f1284c != null) {
            m3317a(this.c.f1248C.f1284c);
        } else {
            String c = this.c.f1248C.m1308c();
            String d = this.c.f1248C.m1311d();
            if ("tv".equals("bind-device")) {
                m3319a(c, d, false);
            } else {
                if (!c.isEmpty()) {
                    if (!d.isEmpty()) {
                        m3319a(c, d, false);
                    }
                }
                m3336k();
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 2001) {
            return;
        }
        if (iArr[0] == null && iArr[1] == null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ikor");
            stringBuilder.append(File.separator);
            stringBuilder.append("random_account_info.dat");
            File file = new File(externalStorageDirectory, stringBuilder.toString());
            RandomAccountInfo randomAccountInfo = (RandomAccountInfo) C0595e.m803a(RandomAccountInfo.class, file, this.c.f1260a.f1067f);
            if (randomAccountInfo == null) {
                randomAccountInfo = new RandomAccountInfo();
                stringBuilder = new StringBuilder();
                stringBuilder.append(C0595e.m806a(String.valueOf(System.currentTimeMillis())));
                stringBuilder.append("@");
                stringBuilder.append("ikor.tv");
                randomAccountInfo.userName = stringBuilder.toString();
                randomAccountInfo.password = this.c.f1248C.m1304b(randomAccountInfo.userName);
                C0595e.m812a((Object) randomAccountInfo, file, this.c.f1260a.f1066e);
            }
            this.c.f1248C.m1299a(randomAccountInfo.userName, false);
            this.c.f1248C.m1305b(randomAccountInfo.password, false);
            m3319a(randomAccountInfo.userName, randomAccountInfo.password, true);
            return;
        }
        this.c.f1263k.post(new C05822(this));
    }

    /* renamed from: m */
    private void m3340m() {
        finish();
        if (this.c.f1261b == C0729a.Live) {
            startActivity(new Intent(this, LiveActivity.class));
        } else {
            startActivity(new Intent(this, LaunchActivity.class));
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.c.m1262d();
        System.exit(0);
        return true;
    }
}
