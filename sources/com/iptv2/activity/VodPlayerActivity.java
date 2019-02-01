package com.iptv2.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewGroup;
import com.iptv2.base.Activity;
import com.iptv2.control.ToastGroupView;
import com.iptv2.core.C0728b.C0725b;
import com.iptv2.core.C0728b.C0726c;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1352d;
import com.iptv2.p042a.C1352d.C0518a;
import com.iptv2.p042a.C1357i;
import com.iptv2.p042a.C1357i.C0554b;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p044c.C0649a;
import com.iptv2.p044c.C0649a.C0610a;
import com.iptv2.p044c.C0667c.C0666a;
import com.iptv2.p044c.C0675f.C0673a;
import com.iptv2.p044c.C0675f.C0674b;
import com.iptv2.p044c.C0677g;
import com.iptv2.p044c.C0677g.C0676a;
import com.iptv2.p044c.p046b.C0653a;
import com.iptv2.p044c.p046b.C0653a.C0652a;
import com.iptv2.p044c.p046b.C0658b;
import com.iptv2.p044c.p046b.C0658b.C0657a;
import com.iptv2.p044c.p046b.C1153c;
import java.util.List;

public class VodPlayerActivity extends Activity {
    /* renamed from: a */
    public static C0702m f2543a;
    /* renamed from: b */
    public static C0703n f2544b;
    /* renamed from: h */
    private C0653a f2545h;
    /* renamed from: i */
    private View f2546i;
    /* renamed from: j */
    private C0673a f2547j = new C10851(this);
    /* renamed from: k */
    private Runnable f2548k = new Runnable(this) {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f623a;

        {
            this.f623a = r1;
        }

        public void run() {
            if (!this.f623a.f2545h.f914f.m1089a()) {
                if (!this.f623a.f2545h.f915g.m1103b()) {
                    this.f623a.m3166f();
                }
            }
        }
    };

    /* renamed from: com.iptv2.activity.VodPlayerActivity$9 */
    class C05809 implements OnSystemUiVisibilityChangeListener {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f628a;

        C05809(VodPlayerActivity vodPlayerActivity) {
            this.f628a = vodPlayerActivity;
        }

        public void onSystemUiVisibilityChange(final int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onSystemUiVisibilityChange ");
            stringBuilder.append(i);
            C0591c.m791a("VodPlayerActivity", stringBuilder.toString());
            this.f628a.c.f1263k.removeCallbacks(this.f628a.f2548k);
            this.f628a.c.f1263k.postDelayed(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C05809 f627b;

                public void run() {
                    if (this.f627b.f628a.hasWindowFocus() && i == 0) {
                        if (this.f627b.f628a.f2545h.f915g.m1101a()) {
                            this.f627b.f628a.f2545h.f915g.m1102b(true);
                        } else {
                            this.f627b.f628a.f2545h.f914f.m1088a(true);
                        }
                        this.f627b.f628a.m3299g();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$1 */
    class C10851 implements C0673a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1910a;

        /* renamed from: a */
        public void mo1326a(List<C0674b> list) {
        }

        C10851(VodPlayerActivity vodPlayerActivity) {
            this.f1910a = vodPlayerActivity;
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$2 */
    class C10862 implements C0554b {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1911a;

        C10862(VodPlayerActivity vodPlayerActivity) {
            this.f1911a = vodPlayerActivity;
        }

        /* renamed from: a */
        public void mo1337a(C0703n c0703n) {
            if (c0703n != null) {
                if (c0703n != this.f1911a.f2545h.f917i) {
                    this.f1911a.m3301h();
                    this.f1911a.f2545h.m1070a(c0703n, true);
                    this.f1911a.f2545h.f914f.m1088a(false);
                }
            }
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$3 */
    class C10883 extends C0518a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1913a;

        /* renamed from: com.iptv2.activity.VodPlayerActivity$3$1 */
        class C10871 implements C0725b {
            /* renamed from: a */
            final /* synthetic */ C10883 f1912a;

            C10871(C10883 c10883) {
                this.f1912a = c10883;
            }

            /* renamed from: a */
            public void mo1307a(boolean z, C0726c c0726c, C0587a c0587a, Throwable th) {
                this.f1912a.f1913a.c.m1260a(this.f1912a.f1913a.c.f1251F.m1350e("reportErrorSuccess"), null);
            }
        }

        C10883(VodPlayerActivity vodPlayerActivity) {
            this.f1913a = vodPlayerActivity;
        }

        /* renamed from: a */
        public boolean mo1329a() {
            return this.f1913a.c.f1248C.m1307b(this.f1913a.f2545h.f916h);
        }

        /* renamed from: b */
        public String mo1330b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f1913a.f2545h.f916h.f1113c);
            stringBuilder.append(" ");
            stringBuilder.append(this.f1913a.f2545h.f916h.f1112b);
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public void mo1328a(boolean z) {
            this.f1913a.f2545h.m1069a(this.f1913a.f2545h.f916h, z);
        }

        /* renamed from: a */
        public void mo1327a(int i) {
            this.f1913a.f2545h.f911c.m1140a(i);
        }

        /* renamed from: b */
        public void mo1331b(int i) {
            this.f1913a.m3301h();
            this.f1913a.f2545h.f911c.m1152d();
            this.f1913a.f2545h.m1070a(this.f1913a.f2545h.f917i, true);
        }

        /* renamed from: c */
        public void mo1332c() {
            this.f1913a.c.f1249D.m1243a(this.f1913a.f2545h.f916h, this.f1913a.f2545h.f917i, this.f1913a.f2545h.f911c.m1155g(), new C10871(this));
            this.f1913a.c.m1260a(this.f1913a.c.f1251F.m1350e("reportErrorSending"), 1);
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$4 */
    class C10894 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1914a;

        C10894(VodPlayerActivity vodPlayerActivity) {
            this.f1914a = vodPlayerActivity;
        }

        /* renamed from: a */
        public void mo1333a() {
            C0703n c0703n = this.f1914a.f2545h.f917i.f1132e;
            if (c0703n != null) {
                this.f1914a.f2545h.m1070a(c0703n, true);
            } else {
                this.f1914a.finish();
            }
        }

        /* renamed from: a */
        public void mo1339a(int i) {
            this.f1914a.f2545h.f914f.m1088a(false);
        }

        /* renamed from: b */
        public void mo1340b() {
            if (this.f1914a.f2545h.f914f.m1089a()) {
                this.f1914a.f2545h.f914f.m1088a(true);
            }
        }

        /* renamed from: c */
        public void mo1341c() {
            this.f1914a.f2545h.f914f.m1088a(false);
        }

        /* renamed from: d */
        public void mo1342d() {
            if (this.f1914a.f2545h.f914f.m1089a()) {
                this.f1914a.f2545h.f914f.m1088a(true);
            }
        }

        /* renamed from: e */
        public void mo1343e() {
            float a = this.f1914a.c.f1248C.m1286a(this.f1914a.f2545h.f917i);
            int f = this.f1914a.f2545h.f911c.m1154f();
            if (a > 0.0f && a < 1.0f && f > 0) {
                final int i = (int) (a * ((float) f));
                this.f1914a.c.f1263k.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C10894 f625b;

                    public void run() {
                        this.f625b.f1914a.f2545h.f911c.m1150c(i);
                    }
                });
            } else if (this.f1914a.f2545h.f914f.m1089a()) {
                this.f1914a.f2545h.f914f.m1088a(true);
            }
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$5 */
    class C10905 extends C0652a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1915a;

        C10905(VodPlayerActivity vodPlayerActivity) {
            this.f1915a = vodPlayerActivity;
        }

        /* renamed from: a */
        public void mo1344a() {
            this.f1915a.f2545h.f914f.m1088a(false);
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$6 */
    class C10916 extends C0666a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1916a;

        C10916(VodPlayerActivity vodPlayerActivity) {
            this.f1916a = vodPlayerActivity;
        }

        /* renamed from: a */
        public void mo1334a(boolean z) {
            if (z) {
                this.f1916a.f2545h.f914f.m1093c();
            } else {
                this.f1916a.f2545h.f914f.m1088a(true);
            }
            this.f1916a.f2545h.f912d.m1046a(z ^ true);
        }

        /* renamed from: b */
        public void mo1335b(boolean z) {
            if (!z && this.f1916a.f2545h.f915g.m1101a()) {
                this.f1916a.m3299g();
            }
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$7 */
    class C10927 extends C0610a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1917a;

        C10927(VodPlayerActivity vodPlayerActivity) {
            this.f1917a = vodPlayerActivity;
        }

        /* renamed from: a */
        public void mo1321a() {
            if (this.f1917a.f2545h.f915g.m1101a()) {
                if (this.f1917a.f2545h.f915g.m1103b()) {
                    this.f1917a.f2545h.f915g.m1104c();
                    this.f1917a.m3166f();
                } else {
                    this.f1917a.f2545h.f915g.m1102b(true);
                }
                return;
            }
            if (this.f1917a.f2545h.f914f.m1089a()) {
                this.f1917a.f2545h.f914f.m1093c();
                this.f1917a.m3166f();
            } else {
                this.f1917a.f2545h.f914f.m1088a(true);
            }
        }

        /* renamed from: b */
        public void mo1322b() {
            C0703n c0703n = this.f1917a.f2545h.f917i.f1132e;
            if (c0703n != null) {
                this.f1917a.m3301h();
                this.f1917a.f2545h.m1070a(c0703n, false);
            }
        }

        /* renamed from: c */
        public void mo1323c() {
            C0703n c0703n = this.f1917a.f2545h.f917i.f1131d;
            if (c0703n != null) {
                this.f1917a.m3301h();
                this.f1917a.f2545h.m1070a(c0703n, false);
            }
        }
    }

    /* renamed from: com.iptv2.activity.VodPlayerActivity$8 */
    class C10938 extends C0657a {
        /* renamed from: a */
        final /* synthetic */ VodPlayerActivity f1918a;

        C10938(VodPlayerActivity vodPlayerActivity) {
            this.f1918a = vodPlayerActivity;
        }

        /* renamed from: a */
        public void mo1345a(boolean z) {
            if (z) {
                this.f1918a.m3165e();
                this.f1918a.f2545h.f915g.m1102b(false);
                return;
            }
            this.f1918a.m3299g();
            if (this.f1918a.f2545h.f915g.m1101a()) {
                this.f1918a.f2545h.f915g.m1102b(true);
            } else {
                this.f1918a.f2545h.f915g.m1104c();
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vodplayer);
        this.f2546i = findViewById(R.id.root);
        this.f2545h = new C0653a();
        this.f2545h.f909a = this.c;
        this.f2545h.f910b = this;
        this.f2545h.f913e = (ToastGroupView) findViewById(R.id.toast_group);
        this.f2545h.f911c = new C0677g(this, this.c, findViewById(R.id.player), this.f2547j);
        this.f2545h.f911c.m1141a(findViewById(R.id.pause));
        this.f2545h.f911c.m1149b(findViewById(R.id.p2pstat));
        this.f2545h.f914f = new C0658b(this.f2545h, this.f2546i);
        bundle = findViewById(R.id.gesture);
        View findViewById = this.f2546i.findViewById(R.id.left_menubar);
        View findViewById2 = this.f2546i.findViewById(R.id.right_menubar);
        if (this.c.f1248C.m1321h()) {
            this.f2545h.f912d = new C0649a(this.c, this, bundle);
            this.f2545h.f915g = new C1153c(this.f2545h, findViewById, findViewById2);
        } else {
            ((ViewGroup) bundle.getParent()).removeView(bundle);
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
            ((ViewGroup) findViewById2.getParent()).removeView(findViewById2);
        }
        this.f2545h.f916h = f2543a;
        this.f2545h.f917i = f2544b;
        this.f2545h.m1072c();
        f2543a = null;
        f2544b = null;
        this.f2545h.f911c.m1142a(new C10894(this));
        this.f2545h.m1068a(new C10905(this));
        if (this.c.f1248C.m1321h() != null) {
            findViewById(R.id.fit).setFitsSystemWindows(true);
            m3165e();
            this.f2545h.f915g.m1099a(new C10916(this));
            this.f2545h.f912d.m1045a(new C10927(this));
            this.f2545h.f914f.m1087a(new C10938(this));
            this.d.setOnSystemUiVisibilityChangeListener(new C05809(this));
            return;
        }
        this.f2546i.setFocusable(true);
        this.f2546i.setOnClickListener(new OnClickListener(this) {
            /* renamed from: a */
            final /* synthetic */ VodPlayerActivity f622a;

            {
                this.f622a = r1;
            }

            public void onClick(View view) {
                if (this.f622a.f2545h.f918j != null) {
                    if (this.f622a.f2545h.f911c.m1151c() != null) {
                        this.f622a.f2545h.f911c.m1148b();
                        this.f622a.f2545h.f914f.m1088a(true);
                        return;
                    }
                    this.f622a.f2545h.f911c.m1139a();
                    this.f622a.f2545h.f914f.m1088a(false);
                } else if (this.f622a.f2545h.f914f.m1089a() != null) {
                    this.f622a.f2545h.f914f.m1093c();
                } else {
                    this.f622a.f2545h.f914f.m1088a(false);
                }
            }
        });
    }

    /* renamed from: g */
    private void m3299g() {
        C0591c.m791a("VodPlayerActivity", "delayHideNavigationBar");
        if (!m3164d()) {
            this.c.f1263k.removeCallbacks(this.f2548k);
            this.c.f1263k.postDelayed(this.f2548k, 3000);
        }
    }

    protected void onResume() {
        super.onResume();
        this.f2545h.m1067a();
    }

    protected void onPause() {
        m3301h();
        this.f2545h.f914f.m1093c();
        this.f2545h.m1071b();
        super.onPause();
    }

    /* renamed from: h */
    private void m3301h() {
        float i = this.f2545h.f911c.m1157i();
        if (i > 0.0f) {
            this.c.f1248C.m1296a(this.f2545h.f917i, i);
        }
    }

    /* renamed from: b */
    public void m3309b() {
        if (this.f2545h.f916h.f1125o.size() > 1) {
            this.f2545h.f914f.m1093c();
            C1357i c1357i = new C1357i();
            c1357i.m3130a(this.f2545h.f916h);
            c1357i.m3129a(new C10862(this));
            c1357i.m2846a(this);
        }
    }

    /* renamed from: a */
    public void mo2163a() {
        this.f2545h.f914f.m1093c();
        C1352d c1352d = new C1352d();
        c1352d.m3033a(new C10883(this));
        c1352d.m2846a(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82) {
            mo2163a();
            return true;
        } else if (this.f2545h.f914f.m1089a() && this.f2545h.f914f.m1090a(i)) {
            return true;
        } else {
            if (i != 21) {
                if (i != 22) {
                    if (i == 4) {
                        if (this.f2545h.f915g == 0 || this.f2545h.f915g.m1101a() == 0) {
                            finish();
                        } else if (this.f2545h.f915g.m1103b() != 0) {
                            this.f2545h.f915g.m1104c();
                        } else {
                            this.f2545h.f915g.m1102b(true);
                        }
                        return true;
                    }
                    if (i != 19) {
                        if (i != 20) {
                            return super.onKeyDown(i, keyEvent);
                        }
                    }
                    m3309b();
                    return true;
                }
            }
            this.f2545h.f914f.m1088a(true);
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2545h.f914f.m1089a() && this.f2545h.f914f.m1092b(i)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
