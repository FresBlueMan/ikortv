package com.iptv2.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.iptv2.base.Activity;
import com.iptv2.control.MarqueeView;
import com.iptv2.control.MarqueeView.C0687a;
import com.iptv2.control.ToastGroupView;
import com.iptv2.core.Application;
import com.iptv2.core.C0728b.C0725b;
import com.iptv2.core.C0728b.C0726c;
import com.iptv2.core.C0730c;
import com.iptv2.core.C0730c.C0729a;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1350b;
import com.iptv2.p042a.C1352d;
import com.iptv2.p042a.C1352d.C0518a;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0649a;
import com.iptv2.p044c.C0649a.C0610a;
import com.iptv2.p044c.C0667c.C0666a;
import com.iptv2.p044c.C0675f.C0673a;
import com.iptv2.p044c.C0675f.C0674b;
import com.iptv2.p044c.C0677g;
import com.iptv2.p044c.C0677g.C0676a;
import com.iptv2.p044c.p045a.C0626b;
import com.iptv2.p044c.p045a.C0626b.C0623b;
import com.iptv2.p044c.p045a.C0631c;
import com.iptv2.p044c.p045a.C0631c.C0630a;
import com.iptv2.p044c.p045a.C0639e;
import com.iptv2.p044c.p045a.C0648g;
import com.iptv2.p044c.p045a.C0648g.C0647a;
import com.iptv2.p044c.p045a.C1134f;
import java.util.List;

public class LiveActivity extends Activity {
    /* renamed from: a */
    private C0626b f2494a;
    /* renamed from: b */
    private View f2495b;
    /* renamed from: h */
    private MarqueeView f2496h;
    /* renamed from: i */
    private ViewGroup f2497i;
    /* renamed from: j */
    private TextView f2498j;
    /* renamed from: k */
    private int f2499k = 0;
    /* renamed from: l */
    private String f2500l = "";
    /* renamed from: m */
    private C0673a f2501m = new C10681(this);
    /* renamed from: n */
    private Runnable f2502n = new C05686(this);
    /* renamed from: o */
    private Runnable f2503o = new C05674(this);

    /* renamed from: com.iptv2.activity.LiveActivity$2 */
    class C05652 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f602a;

        C05652(LiveActivity liveActivity) {
            this.f602a = liveActivity;
        }

        public void onClick(View view) {
            if (this.f602a.f2494a.f756d.m1008a() != null) {
                this.f602a.f2494a.f756d.m1010b();
            } else if (this.f602a.f2494a.f755c.m1024b() != null) {
                this.f602a.f2494a.f755c.m1027e();
            } else {
                if (this.f602a.f2494a.f766n == C0623b.Record && this.f602a.f2494a.f767o != null) {
                    if (this.f602a.f2494a.f758f.m1151c() != null) {
                        this.f602a.f2494a.f758f.m1148b();
                        return;
                    }
                    this.f602a.f2494a.f758f.m1139a();
                }
                this.f602a.f2494a.f755c.m1025c();
                this.f602a.f2494a.f757e.m943b();
            }
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$3 */
    class C05663 implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f603a;

        C05663(LiveActivity liveActivity) {
            this.f603a = liveActivity;
        }

        public boolean onLongClick(View view) {
            return this.f603a.f2494a.f755c.m1024b() != null ? this.f603a.f2494a.f755c.m1028f() : null;
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$4 */
    class C05674 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f604a;

        C05674(LiveActivity liveActivity) {
            this.f604a = liveActivity;
        }

        public void run() {
            if (!(this.f604a.f2494a.f757e.m941a() || this.f604a.f2494a.f761i.m1103b())) {
                if (!this.f604a.f2494a.f755c.m1024b()) {
                    this.f604a.m3166f();
                }
            }
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$6 */
    class C05686 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f605a;

        C05686(LiveActivity liveActivity) {
            this.f605a = liveActivity;
        }

        public void run() {
            if (this.f605a.f2496h != null) {
                this.f605a.f2496h.m2772a();
                ((ViewGroup) this.f605a.f2496h.getParent()).removeView(this.f605a.f2496h);
            }
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$1 */
    class C10681 implements C0673a {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f1890a;

        C10681(LiveActivity liveActivity) {
            this.f1890a = liveActivity;
        }

        /* renamed from: a */
        public void mo1326a(List<C0674b> list) {
            if (this.f1890a.f2494a.f766n == C0623b.Live) {
                StringBuilder stringBuilder;
                if (this.f1890a.m3164d()) {
                    if (!(Application.f1062a == null || this.f1890a.f2498j == null)) {
                        list = this.f1890a.f2498j;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("app置于后台模式，停止切台...\n");
                        stringBuilder.append(this.f1890a.f2500l);
                        list.setText(stringBuilder.toString());
                    }
                    return;
                }
                if (Application.f1062a && this.f1890a.f2498j != null) {
                    LiveActivity liveActivity = this.f1890a;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(this.f1890a.f2500l);
                    stringBuilder2.append("---第");
                    stringBuilder2.append(LiveActivity.m3209d(this.f1890a));
                    stringBuilder2.append("次,原因:");
                    stringBuilder2.append(list.toString());
                    liveActivity.f2500l = stringBuilder2.toString();
                    list = this.f1890a.f2498j;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Total number:");
                    stringBuilder.append(this.f1890a.f2499k);
                    stringBuilder.append("\n");
                    stringBuilder.append(this.f1890a.f2500l);
                    list.setText(stringBuilder.toString());
                }
                this.f1890a.f2494a.m917d();
            }
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$5 */
    class C10705 extends C0518a {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f1892a;

        /* renamed from: com.iptv2.activity.LiveActivity$5$1 */
        class C10691 implements C0725b {
            /* renamed from: a */
            final /* synthetic */ C10705 f1891a;

            C10691(C10705 c10705) {
                this.f1891a = c10705;
            }

            /* renamed from: a */
            public void mo1307a(boolean z, C0726c c0726c, C0587a c0587a, Throwable th) {
                this.f1891a.f1892a.c.m1260a(this.f1891a.f1892a.c.f1251F.m1350e("reportErrorSuccess"), null);
            }
        }

        C10705(LiveActivity liveActivity) {
            this.f1892a = liveActivity;
        }

        /* renamed from: a */
        public boolean mo1329a() {
            return this.f1892a.c.f1248C.m1301a(this.f1892a.f2494a.f762j);
        }

        /* renamed from: b */
        public String mo1330b() {
            return this.f1892a.f2494a.f762j.f1071b;
        }

        /* renamed from: a */
        public void mo1328a(boolean z) {
            this.f1892a.f2494a.m913a(this.f1892a.f2494a.f762j, z);
        }

        /* renamed from: a */
        public void mo1327a(int i) {
            this.f1892a.f2494a.f758f.m1140a(i);
        }

        /* renamed from: b */
        public void mo1331b(int i) {
            this.f1892a.f2494a.f758f.m1152d();
            this.f1892a.f2494a.m915b(this.f1892a.f2494a.f762j, true);
        }

        /* renamed from: c */
        public void mo1332c() {
            C0725b c10691 = new C10691(this);
            C0623b c0623b = this.f1892a.f2494a.f766n;
            if (c0623b == C0623b.Live) {
                this.f1892a.c.f1249D.m1240a(this.f1892a.f2494a.f762j, this.f1892a.f2494a.f763k, c10691);
            } else if (c0623b == C0623b.TimeShift) {
                this.f1892a.c.f1249D.m1251b(this.f1892a.f2494a.f762j, this.f1892a.f2494a.f763k, c10691);
            } else if (c0623b == C0623b.Record) {
                this.f1892a.c.f1249D.m1242a(this.f1892a.f2494a.f762j, this.f1892a.f2494a.f764l, this.f1892a.f2494a.f765m, c10691);
            }
            this.f1892a.c.m1260a(this.f1892a.c.f1251F.m1350e("reportErrorSending"), 1);
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$7 */
    class C10717 implements C0687a {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f1893a;

        C10717(LiveActivity liveActivity) {
            this.f1893a = liveActivity;
        }

        /* renamed from: a */
        public void mo1318a(String str) {
            String str2 = "";
            if (this.f1893a.c.f1248C.f1284c.f1152k != 0) {
                str2 = this.f1893a.c.f1248C.m1308c();
            }
            C0595e.m813a(str, str2, this.f1893a);
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$8 */
    class C10728 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f1894a;

        C10728(LiveActivity liveActivity) {
            this.f1894a = liveActivity;
        }

        /* renamed from: a */
        public void mo1333a() {
            C0623b c0623b = this.f1894a.f2494a.f766n;
            C0693b c0693b = this.f1894a.f2494a.f762j;
            C1174j c1174j = this.f1894a.f2494a.f764l;
            if (c0623b == C0623b.Record) {
                C1174j c1174j2 = c1174j.f2063d;
                if (c1174j2 != null) {
                    C0591c.m791a("LiveActivity", "onCompletion play next record");
                    this.f1894a.f2494a.m912a(c0693b, c1174j2, true);
                    return;
                }
                C0591c.m791a("LiveActivity", "onCompletion play live");
                this.f1894a.f2494a.m915b(c0693b, true);
            }
        }
    }

    /* renamed from: com.iptv2.activity.LiveActivity$9 */
    class C10739 extends C0666a {
        /* renamed from: a */
        final /* synthetic */ LiveActivity f1895a;

        C10739(LiveActivity liveActivity) {
            this.f1895a = liveActivity;
        }

        /* renamed from: a */
        public void mo1334a(boolean z) {
            if (z) {
                this.f1895a.f2494a.f757e.m943b();
            } else {
                this.f1895a.f2494a.f757e.m940a(true);
            }
            this.f1895a.f2494a.f759g.m1046a(z ^ true);
        }

        /* renamed from: b */
        public void mo1335b(boolean z) {
            if (!z && this.f1895a.f2494a.f761i.m1101a()) {
                this.f1895a.m3207b();
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ int m3209d(LiveActivity liveActivity) {
        int i = liveActivity.f2499k + 1;
        liveActivity.f2499k = i;
        return i;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_live);
        this.f2495b = findViewById(R.id.root);
        if (Application.f1062a != null) {
            this.f2497i = (ViewGroup) findViewById(R.id.stopErrorGroup);
            this.f2497i.setVisibility(0);
            this.f2498j = (TextView) findViewById(R.id.stopErrorTxt);
        }
        this.f2494a = new C0626b();
        this.f2494a.f753a = this.c;
        this.f2494a.f754b = this;
        this.f2494a.f760h = (ToastGroupView) findViewById(R.id.toast_group);
        this.f2494a.f758f = new C0677g(this, this.c, findViewById(R.id.player), this.f2501m);
        this.f2494a.f758f.m1141a(findViewById(R.id.pause));
        this.f2494a.f758f.m1149b(findViewById(R.id.p2pstat));
        this.f2494a.f756d = new C0639e(this.f2494a, findViewById(R.id.keycode_input));
        bundle = null;
        if (C0730c.f1239c == 0) {
            bundle = (ViewStub) findViewById(R.id.viewstub_overlay_short);
        } else if (C0730c.f1239c == 1) {
            bundle = (ViewStub) findViewById(R.id.viewstub_overlay_long);
        }
        if (bundle != null) {
            bundle.inflate();
            bundle = findViewById(R.id.widget_live_overlay);
            this.f2494a.f755c = new C0648g(this.f2494a, bundle);
        }
        this.f2494a.f757e = new C0631c(this.f2494a, this.f2495b);
        bundle = findViewById(R.id.gesture);
        View findViewById = this.f2495b.findViewById(R.id.left_menubar);
        View findViewById2 = this.f2495b.findViewById(R.id.right_menubar);
        if (this.c.f1248C.m1321h()) {
            this.f2494a.f759g = new C0649a(this.c, this, bundle);
            this.f2494a.f761i = new C1134f(this.f2494a, findViewById, findViewById2);
        } else {
            ((ViewGroup) bundle.getParent()).removeView(bundle);
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
            ((ViewGroup) findViewById2.getParent()).removeView(findViewById2);
        }
        if (this.c.f1248C.f1284c != null) {
            this.f2496h = (MarqueeView) findViewById(R.id.announceUrl);
            bundle = this.c.f1248C.f1284c.f1147f;
            if (this.c.f1261b != C0729a.Live || bundle == null) {
                ((ViewGroup) this.f2496h.getParent()).removeView(this.f2496h);
            } else {
                this.f2496h.setSupportUrl(false);
                this.f2496h.setOnUrlClick(new C10717(this));
                this.f2496h.m2773a(bundle.f1069b);
                if (bundle.f1068a > 0) {
                    this.c.f1263k.postDelayed(this.f2502n, (long) (bundle.f1068a * 1000));
                }
            }
        }
        this.f2494a.m916c();
        this.f2494a.f758f.m1142a(new C10728(this));
        if (this.c.f1248C.m1321h() != null) {
            findViewById(R.id.fit).setFitsSystemWindows(true);
            m3165e();
            this.f2494a.f761i.m1099a(new C10739(this));
            this.f2494a.f759g.m1045a(new C0610a(this) {
                /* renamed from: a */
                final /* synthetic */ LiveActivity f1887a;

                {
                    this.f1887a = r1;
                }

                /* renamed from: a */
                public void mo1321a() {
                    if (this.f1887a.f2494a.f761i.m1101a()) {
                        if (this.f1887a.f2494a.f761i.m1103b()) {
                            this.f1887a.f2494a.f761i.m1104c();
                            this.f1887a.m3166f();
                        } else {
                            this.f1887a.f2494a.f761i.m1102b(true);
                        }
                        return;
                    }
                    if (this.f1887a.f2494a.f757e.m941a()) {
                        this.f1887a.f2494a.f757e.m943b();
                        this.f1887a.m3166f();
                    } else {
                        this.f1887a.f2494a.f757e.m940a(true);
                    }
                }

                /* renamed from: b */
                public void mo1322b() {
                    this.f1887a.f2494a.f755c.m1030h();
                }

                /* renamed from: c */
                public void mo1323c() {
                    this.f1887a.f2494a.f755c.m1029g();
                }
            });
            this.f2494a.f757e.m938a(new C0630a(this) {
                /* renamed from: a */
                final /* synthetic */ LiveActivity f1888a;

                {
                    this.f1888a = r1;
                }

                /* renamed from: a */
                public void mo1324a(boolean z) {
                    if (z) {
                        this.f1888a.m3165e();
                        this.f1888a.f2494a.f761i.m1102b(false);
                        this.f1888a.f2494a.f755c.m1026d();
                        return;
                    }
                    this.f1888a.m3207b();
                    if (this.f1888a.f2494a.f761i.m1101a()) {
                        this.f1888a.f2494a.f761i.m1102b(true);
                    } else {
                        this.f1888a.f2494a.f761i.m1104c();
                    }
                }
            });
            this.f2494a.f755c.m1022a(new C0647a(this) {
                /* renamed from: a */
                final /* synthetic */ LiveActivity f1889a;

                {
                    this.f1889a = r1;
                }

                /* renamed from: a */
                public void mo1325a(boolean z) {
                    if (z) {
                        this.f1889a.m3165e();
                        this.f1889a.f2494a.f759g.m1047b(false);
                        this.f1889a.f2494a.f757e.m943b();
                        return;
                    }
                    this.f1889a.m3207b();
                    this.f1889a.f2494a.f759g.m1047b(true);
                }
            });
            this.d.setOnSystemUiVisibilityChangeListener(new OnSystemUiVisibilityChangeListener(this) {
                /* renamed from: a */
                final /* synthetic */ LiveActivity f601a;

                {
                    this.f601a = r1;
                }

                public void onSystemUiVisibilityChange(final int i) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onSystemUiVisibilityChange ");
                    stringBuilder.append(i);
                    C0591c.m791a("LiveActivity", stringBuilder.toString());
                    this.f601a.c.f1263k.removeCallbacks(this.f601a.f2503o);
                    this.f601a.c.f1263k.postDelayed(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ AnonymousClass13 f600b;

                        public void run() {
                            if (this.f600b.f601a.hasWindowFocus() && i == 0) {
                                this.f600b.f601a.f2494a.f755c.m1026d();
                                if (this.f600b.f601a.f2494a.f761i.m1101a()) {
                                    this.f600b.f601a.f2494a.f761i.m1102b(true);
                                } else {
                                    this.f600b.f601a.f2494a.f757e.m940a(true);
                                }
                                this.f600b.f601a.m3207b();
                            }
                        }
                    }, 100);
                }
            });
        } else {
            this.f2495b.setFocusable(true);
            this.f2495b.setOnClickListener(new C05652(this));
            this.f2495b.setOnLongClickListener(new C05663(this));
        }
        this.c.f1248C.m1324j();
    }

    protected void onDestroy() {
        this.c.f1248C.m1325k();
        if (this.f2496h != null) {
            this.c.f1263k.removeCallbacks(this.f2502n);
        }
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
        this.f2494a.f757e.m943b();
        this.f2494a.f755c.m1025c();
        this.f2494a.m909a();
    }

    protected void onPause() {
        this.f2494a.f757e.m943b();
        this.f2494a.f755c.m1026d();
        this.f2494a.m914b();
        super.onPause();
    }

    /* renamed from: b */
    private void m3207b() {
        C0591c.m791a("LiveActivity", "delayHideNavigationBar");
        if (!m3164d()) {
            this.c.f1263k.removeCallbacks(this.f2503o);
            this.c.f1263k.postDelayed(this.f2503o, 3000);
        }
    }

    /* renamed from: a */
    public void mo2163a() {
        this.f2494a.f755c.m1026d();
        this.f2494a.f757e.m943b();
        C1352d c1352d = new C1352d();
        c1352d.m3033a(new C10705(this));
        c1352d.m2846a(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2494a.f756d.m1009a(i)) {
            return true;
        }
        if (i == 82) {
            mo2163a();
            return true;
        }
        if (this.f2494a.f755c.m1024b()) {
            if (this.f2494a.f755c.m1023a(i)) {
                return true;
            }
        } else if (this.f2494a.f757e.m941a() && this.f2494a.f757e.m942a(i)) {
            return true;
        } else {
            if (i == 19) {
                this.f2494a.f755c.m1029g();
                return true;
            } else if (i == 20) {
                this.f2494a.f755c.m1030h();
                return true;
            } else {
                if (i != 21) {
                    if (i != 22) {
                        if (i == 4) {
                            if (this.f2494a.f761i == 0 || this.f2494a.f761i.m1101a() == 0) {
                                if (this.c.f1261b == C0729a.Live) {
                                    new C1350b().m2846a(this);
                                } else {
                                    finish();
                                }
                            } else if (this.f2494a.f761i.m1103b() != 0) {
                                this.f2494a.f761i.m1104c();
                            } else {
                                this.f2494a.f761i.m1102b(true);
                            }
                            return true;
                        }
                    }
                }
                this.f2494a.f757e.m940a(true);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2494a.f757e.m941a() && this.f2494a.f757e.m944b(i)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
