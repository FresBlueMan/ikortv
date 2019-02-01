package com.iptv2.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Start;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.iptv2.base.Activity;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1357i;
import com.iptv2.p042a.C1357i.C0554b;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0684i;
import com.victor.loading.rotate.RotateLoading;

public class VodDetailActivity extends Activity {
    /* renamed from: a */
    public static C0702m f2529a;
    /* renamed from: b */
    private C0577a f2530b = C0577a.None;
    /* renamed from: h */
    private C0684i f2531h;
    /* renamed from: i */
    private C0702m f2532i;
    /* renamed from: j */
    private View f2533j;
    /* renamed from: k */
    private View f2534k;
    /* renamed from: l */
    private ImageView f2535l;
    /* renamed from: m */
    private ImageView f2536m;
    /* renamed from: n */
    private TextView f2537n;
    /* renamed from: o */
    private TextView f2538o;
    /* renamed from: p */
    private TextView f2539p;
    /* renamed from: q */
    private RotateLoading f2540q;
    /* renamed from: r */
    private TextView f2541r;
    /* renamed from: s */
    private TextView f2542s;

    /* renamed from: com.iptv2.activity.VodDetailActivity$1 */
    class C05741 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VodDetailActivity f615a;

        /* renamed from: com.iptv2.activity.VodDetailActivity$1$1 */
        class C10801 implements C0554b {
            /* renamed from: a */
            final /* synthetic */ C05741 f1905a;

            C10801(C05741 c05741) {
                this.f1905a = c05741;
            }

            /* renamed from: a */
            public void mo1337a(C0703n c0703n) {
                if (c0703n != null) {
                    VodPlayerActivity.f2543a = this.f1905a.f615a.f2532i;
                    VodPlayerActivity.f2544b = c0703n;
                    this.f1905a.f615a.startActivity(new Intent(this.f1905a.f615a, VodPlayerActivity.class));
                }
            }
        }

        C05741(VodDetailActivity vodDetailActivity) {
            this.f615a = vodDetailActivity;
        }

        public void onClick(View view) {
            if (this.f615a.f2532i.f1125o.size() > 1) {
                view = new C1357i();
                view.m3130a(this.f615a.f2532i);
                view.m3129a(new C10801(this));
                view.m2846a(this.f615a);
                return;
            }
            VodPlayerActivity.f2543a = this.f615a.f2532i;
            VodPlayerActivity.f2544b = (C0703n) this.f615a.f2532i.f1125o.get(0);
            this.f615a.startActivity(new Intent(this.f615a, VodPlayerActivity.class));
        }
    }

    /* renamed from: com.iptv2.activity.VodDetailActivity$2 */
    class C05752 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VodDetailActivity f616a;

        C05752(VodDetailActivity vodDetailActivity) {
            this.f616a = vodDetailActivity;
        }

        public void onClick(View view) {
            boolean b = this.f616a.c.f1248C.m1307b(this.f616a.f2532i) ^ 1;
            this.f616a.c.f1248C.m1295a(this.f616a.f2532i, b);
            this.f616a.c.m1260a(this.f616a.c.f1251F.m1350e(b ? "favoriteSuccess" : "cancelFavoriteSuccess"), 0);
            this.f616a.m3280b();
        }
    }

    /* renamed from: com.iptv2.activity.VodDetailActivity$3 */
    class C05763 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ VodDetailActivity f617a;

        /* renamed from: com.iptv2.activity.VodDetailActivity$3$1 */
        class C10841 implements C0724a<C0702m> {
            /* renamed from: a */
            final /* synthetic */ C05763 f1909a;

            /* renamed from: com.iptv2.activity.VodDetailActivity$3$1$1 */
            class C10811 implements Stop {
                /* renamed from: a */
                final /* synthetic */ C10841 f1906a;

                C10811(C10841 c10841) {
                    this.f1906a = c10841;
                }

                public void onStop() {
                    this.f1906a.f1909a.f617a.m3277a(C0577a.Ready);
                }
            }

            /* renamed from: com.iptv2.activity.VodDetailActivity$3$1$2 */
            class C10822 implements Start {
                /* renamed from: a */
                final /* synthetic */ C10841 f1907a;

                C10822(C10841 c10841) {
                    this.f1907a = c10841;
                }

                public void onStart() {
                    this.f1907a.f1909a.f617a.f2533j.setVisibility(0);
                }
            }

            /* renamed from: com.iptv2.activity.VodDetailActivity$3$1$3 */
            class C10833 implements Start {
                /* renamed from: a */
                final /* synthetic */ C10841 f1908a;

                C10833(C10841 c10841) {
                    this.f1908a = c10841;
                }

                public void onStart() {
                    this.f1908a.f1909a.f617a.f2540q.stop();
                }
            }

            C10841(C05763 c05763) {
                this.f1909a = c05763;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            /* renamed from: a */
            public void mo1314a(boolean r4, com.iptv2.core.C0728b.C1184e<com.iptv2.core.DataEntity.C0702m> r5, com.iptv2.p043b.C0590b.C0587a r6, java.lang.Throwable r7) {
                /*
                r3 = this;
                r0 = "VodDetailActivity";
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "loadData success:";
                r1.append(r2);
                r1.append(r4);
                r2 = ",errorType:";
                r1.append(r2);
                r1.append(r6);
                r6 = ",ex:";
                r1.append(r6);
                r1.append(r7);
                r6 = r1.toString();
                com.iptv2.p043b.C0591c.m791a(r0, r6);
                r6 = r3.f1909a;
                r6 = r6.f617a;
                r6 = r6.m3163c();
                if (r6 == 0) goto L_0x0031;
            L_0x0030:
                return;
            L_0x0031:
                if (r4 == 0) goto L_0x00a5;
            L_0x0033:
                r4 = r3.f1909a;
                r4 = r4.f617a;
                r5 = r5.f2086c;
                r5 = (com.iptv2.core.DataEntity.C0702m) r5;
                r4.f2532i = r5;
                r4 = r3.f1909a;
                r4 = r4.f617a;
                r4.m3290i();
                r4 = 1;
                r5 = new android.view.View[r4];
                r6 = r3.f1909a;
                r6 = r6.f617a;
                r6 = r6.f2540q;
                r7 = 0;
                r5[r7] = r6;
                r5 = com.github.florent37.viewanimator.ViewAnimator.animate(r5);
                r6 = 2;
                r0 = new float[r6];
                r0 = {1065353216, 0};
                r5 = r5.alpha(r0);
                r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
                r5 = r5.duration(r0);
                r0 = new com.iptv2.activity.VodDetailActivity$3$1$3;
                r0.<init>(r3);
                r5 = r5.onStart(r0);
                r4 = new android.view.View[r4];
                r0 = r3.f1909a;
                r0 = r0.f617a;
                r0 = r0.f2533j;
                r4[r7] = r0;
                r4 = r5.thenAnimate(r4);
                r5 = new com.iptv2.activity.VodDetailActivity$3$1$2;
                r5.<init>(r3);
                r4 = r4.onStart(r5);
                r5 = new com.iptv2.activity.VodDetailActivity$3$1$1;
                r5.<init>(r3);
                r4 = r4.onStop(r5);
                r5 = new float[r6];
                r5 = {0, 1065353216};
                r4 = r4.alpha(r5);
                r5 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
                r4 = r4.duration(r5);
                r4.start();
                goto L_0x00ac;
            L_0x00a5:
                r4 = r3.f1909a;
                r4 = r4.f617a;
                r4.finish();
            L_0x00ac:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.iptv2.activity.VodDetailActivity.3.1.a(boolean, com.iptv2.core.b$e, com.iptv2.b.b$a, java.lang.Throwable):void");
            }
        }

        C05763(VodDetailActivity vodDetailActivity) {
            this.f617a = vodDetailActivity;
        }

        public void run() {
            this.f617a.c.f1249D.m1252b(this.f617a.f2532i.f1111a, new C10841(this));
        }
    }

    /* renamed from: com.iptv2.activity.VodDetailActivity$a */
    enum C0577a {
        None,
        Init,
        Ready
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_voddetail);
        this.f2532i = f2529a;
        f2529a = null;
        this.f2533j = findViewById(R.id.content);
        this.f2541r = (TextView) findViewById(R.id.btn_play);
        this.f2541r.setText(this.c.f1251F.m1347b("buttonPlay"));
        this.f2542s = (TextView) findViewById(R.id.btn_favorite);
        this.f2540q = (RotateLoading) findViewById(R.id.loading);
        this.f2531h = new C0684i(this.c, findViewById(R.id.time));
        this.f2535l = (ImageView) findViewById(R.id.logo_big);
        this.f2534k = findViewById(R.id.logo_wrapper);
        this.f2536m = (ImageView) findViewById(R.id.logo);
        this.f2537n = (TextView) findViewById(R.id.name);
        this.f2538o = (TextView) findViewById(R.id.score);
        this.f2539p = (TextView) findViewById(R.id.description);
        this.f2539p.setMovementMethod(ScrollingMovementMethod.getInstance());
        ((TextView) findViewById(R.id.director_lbl)).setText(this.c.f1251F.m1347b("mediaDirector"));
        ((TextView) findViewById(R.id.artist_lbl)).setText(this.c.f1251F.m1347b("mediaArtist"));
        ((TextView) findViewById(R.id.genre_lbl)).setText(this.c.f1251F.m1347b("mediaGenre"));
        ((TextView) findViewById(R.id.area_lbl)).setText(this.c.f1251F.m1347b("mediaArea"));
        ((TextView) findViewById(R.id.year_lbl)).setText(this.c.f1251F.m1347b("mediaYear"));
        bundle = this.f2534k.getLayoutParams();
        C0592a c0592a = new C0592a();
        c0592a.f645a = bundle.width;
        c0592a.f646b = bundle.height;
        c0592a.f648d = Color.parseColor("#434343");
        c0592a.f647c = Color.parseColor("#bdc9ea");
        c0592a.f651g = this.c.m1258a(2.0f);
        c0592a.f652h = this.c.m1258a(1.0f);
        c0592a.f649e = Color.parseColor("#b22598e5");
        c0592a.f650f = this.c.f1265m.getDimensionPixelSize(R.dimen.width_8_320);
        C0595e.m809a(this.f2534k, C0593d.m796a((Context) this, c0592a));
        bundle = this.c.f1254I;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c.f1248C.f1284c.f1159r);
        stringBuilder.append(this.f2532i.f1124n.f1138b);
        bundle.displayImage(stringBuilder.toString(), this.f2535l, this.c.f1255J);
        bundle = this.c.f1254I;
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.c.f1248C.f1284c.f1159r);
        stringBuilder.append(this.f2532i.f1124n.f1138b);
        bundle.displayImage(stringBuilder.toString(), this.f2536m, this.c.f1255J);
        bundle = this.f2537n;
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2532i.f1113c);
        stringBuilder.append(" ");
        stringBuilder.append(this.f2532i.f1112b);
        bundle.setText(stringBuilder.toString());
        CharSequence spannableStringBuilder = new SpannableStringBuilder(String.format(C0595e.f658a, "%.1f", new Object[]{Double.valueOf(this.f2532i.f1115e)}));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.c.f1265m.getDimensionPixelSize(R.dimen.width_11_320)), 0, 1, 34);
        this.f2538o.setText(spannableStringBuilder);
        this.f2540q.start();
        this.f2541r.setOnClickListener(new C05741(this));
        this.f2542s.setOnClickListener(new C05752(this));
    }

    /* renamed from: b */
    private void m3280b() {
        this.f2542s.setText(this.c.f1251F.m1347b(this.c.f1248C.m1307b(this.f2532i) ? "buttonCancelFavorite" : "buttonFavorite"));
    }

    /* renamed from: a */
    private void m3277a(C0577a c0577a) {
        C0577a c0577a2 = this.f2530b;
        if (c0577a2 != c0577a) {
            this.f2530b = c0577a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("changeViewState [");
            stringBuilder.append(c0577a2.name());
            stringBuilder.append("] to [");
            stringBuilder.append(c0577a);
            stringBuilder.append("]");
            C0591c.m791a("VodDetailActivity", stringBuilder.toString());
            if (c0577a == C0577a.Init) {
                m3285g();
            } else if (c0577a == C0577a.Ready) {
                m3288h();
            }
        }
    }

    /* renamed from: g */
    private void m3285g() {
        this.c.f1263k.postDelayed(new C05763(this), 200);
    }

    /* renamed from: h */
    private void m3288h() {
        this.f2541r.requestFocus();
    }

    /* renamed from: i */
    private void m3290i() {
        ((TextView) findViewById(R.id.director_val)).setText(this.f2532i.f1120j);
        ((TextView) findViewById(R.id.artist_val)).setText(this.f2532i.f1114d);
        TextView textView = (TextView) findViewById(R.id.genre_val);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2532i.f1118h);
        stringBuilder.append("  ");
        stringBuilder.append(this.f2532i.f1119i);
        textView.setText(stringBuilder.toString());
        ((TextView) findViewById(R.id.area_val)).setText(this.f2532i.f1116f);
        ((TextView) findViewById(R.id.year_val)).setText(this.f2532i.f1122l);
        this.f2539p.setText(this.f2532i.f1117g);
    }

    protected void onResume() {
        super.onResume();
        m3280b();
        this.f2531h.m1191a();
        if (this.f2530b == C0577a.None) {
            m3277a(C0577a.Init);
        }
    }

    protected void onPause() {
        this.f2531h.m1192b();
        super.onPause();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2530b != C0577a.Ready) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        mo2163a();
        return true;
    }
}
