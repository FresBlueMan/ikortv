package com.iptv2.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.Activity;
import com.iptv2.base.C0607b;
import com.iptv2.base.LinearLayout;
import com.iptv2.control.MarqueeView;
import com.iptv2.control.MarqueeView.C0687a;
import com.iptv2.core.C0712a.C0707b;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.C0730c.C0729a;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1350b;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0684i;
import java.util.ArrayList;
import java.util.Calendar;

public class LaunchActivity extends Activity {
    /* renamed from: a */
    private C0684i f2486a;
    /* renamed from: b */
    private MarqueeView f2487b;
    /* renamed from: h */
    private LinearLayout f2488h;
    /* renamed from: i */
    private LinearLayout f2489i;
    /* renamed from: j */
    private ArrayList<C0563a> f2490j;
    /* renamed from: k */
    private C0592a f2491k;
    /* renamed from: l */
    private C0592a f2492l;
    /* renamed from: m */
    private long f2493m = 0;

    /* renamed from: com.iptv2.activity.LaunchActivity$2 */
    class C05572 implements OnFocusChangeListener {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f590a;

        C05572(LaunchActivity launchActivity) {
            this.f590a = launchActivity;
        }

        public void onFocusChange(View view, boolean z) {
            ((C1066b) view.getTag()).mo1320a(z);
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$3 */
    class C05583 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f591a;

        C05583(LaunchActivity launchActivity) {
            this.f591a = launchActivity;
        }

        public void onClick(View view) {
            ((C1066b) view.getTag()).mo1319a();
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$4 */
    class C05594 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f592a;

        C05594(LaunchActivity launchActivity) {
            this.f592a = launchActivity;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == null) {
                view.requestFocus();
            }
            return null;
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$5 */
    class C05605 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f593a;

        C05605(LaunchActivity launchActivity) {
            this.f593a = launchActivity;
        }

        public void onClick(View view) {
            ((C1067c) view.getTag()).mo1319a();
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$6 */
    class C05616 implements OnFocusChangeListener {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f594a;

        C05616(LaunchActivity launchActivity) {
            this.f594a = launchActivity;
        }

        public void onFocusChange(View view, boolean z) {
            ((C1067c) view.getTag()).mo1320a(z);
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$7 */
    class C05627 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f595a;

        C05627(LaunchActivity launchActivity) {
            this.f595a = launchActivity;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == null) {
                view.requestFocus();
            }
            return null;
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$a */
    private static class C0563a {
        /* renamed from: a */
        public String f596a;
        /* renamed from: b */
        public int f597b;
        /* renamed from: c */
        public String f598c;

        public C0563a(String str, int i, String str2) {
            this.f596a = str;
            this.f597b = i;
            this.f598c = str2;
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$1 */
    class C10641 implements C0687a {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f1877a;

        C10641(LaunchActivity launchActivity) {
            this.f1877a = launchActivity;
        }

        /* renamed from: a */
        public void mo1318a(String str) {
            String str2 = "";
            if (this.f1877a.c.f1248C.f1284c.f1152k != 0) {
                str2 = this.f1877a.c.f1248C.m1308c();
            }
            C0595e.m813a(str, str2, this.f1877a);
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$8 */
    class C10658 implements C0724a<C0707b> {
        /* renamed from: a */
        final /* synthetic */ LaunchActivity f1878a;

        C10658(LaunchActivity launchActivity) {
            this.f1878a = launchActivity;
        }

        /* renamed from: a */
        public void mo1314a(boolean z, C1184e<C0707b> c1184e, C0587a c0587a, Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loadIndexData success:");
            stringBuilder.append(z);
            stringBuilder.append(",errorType:");
            stringBuilder.append(c0587a);
            stringBuilder.append(",ex:");
            stringBuilder.append(th);
            C0591c.m791a("LaunchActivity", stringBuilder.toString());
            if (z) {
                if (c1184e.f2086c && ((C0707b) c1184e.f2086c).f1140a && !TextUtils.isEmpty(((C0707b) c1184e.f2086c).f1140a.f1069b) && !this.f1878a.f2487b.getText().equals(((C0707b) c1184e.f2086c).f1140a.f1069b)) {
                    this.f1878a.f2487b.m2772a();
                    this.f1878a.f2487b.m2773a(((C0707b) c1184e.f2086c).f1140a.f1069b);
                }
                if (c1184e.f2086c) {
                    this.f1878a.m3187a((ArrayList) ((C0707b) c1184e.f2086c).f1141b);
                }
            }
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$b */
    private class C1066b extends C0607b<C0563a> {
        /* renamed from: a */
        public TextView f1879a;
        /* renamed from: b */
        public TextView f1880b;
        /* renamed from: c */
        final /* synthetic */ LaunchActivity f1881c;

        public C1066b(LaunchActivity launchActivity, View view) {
            this.f1881c = launchActivity;
            super(view);
            this.f1879a = (TextView) view.findViewById(R.id.icon);
            this.f1880b = (TextView) view.findViewById(R.id.text);
            launchActivity = C0593d.m796a(launchActivity.c.f1260a, launchActivity.f2491k);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842908}, launchActivity);
            stateListDrawable.setExitFadeDuration(200);
            stateListDrawable.setEnterFadeDuration(200);
            C0595e.m809a(view, stateListDrawable);
        }

        /* renamed from: a */
        public void m2270a(C0563a c0563a) {
            this.g = c0563a;
            this.f1879a.setText(((C0563a) this.g).f597b);
            this.f1880b.setText(((C0563a) this.g).f598c);
        }

        /* renamed from: a */
        public void mo1319a() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MenuViewHolder onClick ");
            stringBuilder.append(((C0563a) this.g).f596a);
            C0591c.m791a("LaunchActivity", stringBuilder.toString());
            if (((C0563a) this.g).f596a.equals("live")) {
                this.f1881c.startActivity(new Intent(this.f1881c, LiveActivity.class));
            } else if (((C0563a) this.g).f596a.equals("vodondemand")) {
                r0 = new Intent(this.f1881c, VodActivity.class);
                r0.putExtra("GenreType", "电影");
                this.f1881c.startActivity(r0);
            } else if (((C0563a) this.g).f596a.equals("vodseries")) {
                r0 = new Intent(this.f1881c, VodActivity.class);
                r0.putExtra("GenreType", "电视剧");
                this.f1881c.startActivity(r0);
            } else if (((C0563a) this.g).f596a.equals("setting")) {
                this.f1881c.mo2163a();
            }
        }

        /* renamed from: a */
        public void mo1320a(boolean z) {
            if (z) {
                this.f.setSelected(true);
                ViewAnimator.animate(new View[]{this.f}).scaleX(1.1f).scaleY(1.1f).duration(200).start();
                ViewCompat.postInvalidateOnAnimation(this.f1881c.f2488h);
                return;
            }
            this.f.setSelected(false);
            ViewAnimator.animate(new View[]{this.f}).scaleX(1.0f).scaleY(1.0f).duration(200).start();
        }
    }

    /* renamed from: com.iptv2.activity.LaunchActivity$c */
    public class C1067c extends C0607b<C0702m> {
        /* renamed from: a */
        public ImageView f1882a;
        /* renamed from: b */
        public TextView f1883b;
        /* renamed from: c */
        public TextView f1884c;
        /* renamed from: d */
        public View f1885d;
        /* renamed from: e */
        final /* synthetic */ LaunchActivity f1886e;

        public C1067c(LaunchActivity launchActivity, View view) {
            this.f1886e = launchActivity;
            super(view);
            this.f1882a = (ImageView) view.findViewById(R.id.logo);
            this.f1883b = (TextView) view.findViewById(R.id.name);
            this.f1884c = (TextView) view.findViewById(R.id.score);
            this.f1885d = view.findViewById(R.id.bottom);
            launchActivity = C0593d.m796a(launchActivity.c.f1260a, launchActivity.f2492l);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842908}, launchActivity);
            stateListDrawable.setExitFadeDuration(200);
            stateListDrawable.setEnterFadeDuration(200);
            C0595e.m809a(view, stateListDrawable);
        }

        /* renamed from: a */
        public void m2273a(C0702m c0702m) {
            this.g = c0702m;
            if (this.g != null) {
                this.f1883b.setText(((C0702m) this.g).f1113c);
                CharSequence spannableStringBuilder = new SpannableStringBuilder(String.format(C0595e.f658a, "%.1f", new Object[]{Double.valueOf(((C0702m) this.g).f1115e)}));
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f1886e.c.f1265m.getDimensionPixelSize(R.dimen.width_10_320)), 0, 1, 34);
                this.f1884c.setText(spannableStringBuilder);
                this.f1882a.setVisibility(0);
                c0702m = new StringBuilder();
                c0702m.append(this.f1886e.c.f1248C.f1284c.f1159r);
                c0702m.append(((C0702m) this.g).f1124n.f1137a);
                this.f1886e.c.f1254I.displayImage(c0702m.toString(), this.f1882a, this.f1886e.c.f1255J);
                this.f1885d.setVisibility(0);
                return;
            }
            this.f1882a.setVisibility(8);
            this.f1885d.setVisibility(8);
            this.f1883b.setText("");
            this.f1884c.setText("");
            this.f1886e.c.f1254I.cancelDisplayTask(this.f1882a);
        }

        /* renamed from: a */
        public void mo1319a() {
            if (this.g != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("VodViewHolder onClick ");
                stringBuilder.append(((C0702m) this.g).f1113c);
                C0591c.m791a("LaunchActivity", stringBuilder.toString());
                VodDetailActivity.f2529a = (C0702m) this.g;
                this.f1886e.startActivity(new Intent(this.f1886e, VodDetailActivity.class));
            }
        }

        /* renamed from: a */
        public void mo1320a(boolean z) {
            if (z) {
                this.f.setSelected(true);
                ViewAnimator.animate(new View[]{this.f}).scaleX(1.1f).scaleY(1.1f).duration(250).start();
                ViewCompat.postInvalidateOnAnimation(this.f1886e.f2489i);
                return;
            }
            this.f.setSelected(false);
            ViewAnimator.animate(new View[]{this.f}).scaleX(1.0f).scaleY(1.0f).duration(250).start();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_launch);
        this.f2486a = new C0684i(this.c, findViewById(R.id.time));
        this.f2488h = (LinearLayout) findViewById(R.id.menu_group);
        this.f2489i = (LinearLayout) findViewById(R.id.vod_group);
        m3189b();
        m3195g();
        this.f2487b = (MarqueeView) findViewById(R.id.announceUrl);
        this.f2487b.setSupportUrl(false);
        this.f2487b.setOnUrlClick(new C10641(this));
    }

    protected void onResume() {
        super.onResume();
        this.f2486a.m1191a();
        m3197h();
    }

    protected void onPause() {
        this.f2486a.m1192b();
        super.onPause();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: b */
    private void m3189b() {
        this.f2488h.setFocusChildOnTop(true);
        this.f2491k = new C0592a();
        this.f2491k.f645a = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_launch_menu_item_width);
        this.f2491k.f646b = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_launch_menu_item_height);
        this.f2491k.f648d = ViewCompat.MEASURED_STATE_MASK;
        this.f2491k.f649e = Color.argb(120, 0, 0, 255);
        this.f2491k.f647c = -1;
        this.f2491k.f651g = this.c.f1252G;
        this.f2491k.f652h = this.c.f1253H;
        OnFocusChangeListener c05572 = new C05572(this);
        OnClickListener c05583 = new C05583(this);
        OnTouchListener c05594 = new C05594(this);
        this.f2490j = new ArrayList();
        if (this.c.f1261b == C0729a.All) {
            this.f2490j.add(new C0563a("live", R.string.icon_index_live, this.c.f1251F.m1347b("indexLive")));
        }
        this.f2490j.add(new C0563a("vodondemand", R.string.icon_index_vodondemand, this.c.f1251F.m1347b("indexVodOnDemand")));
        this.f2490j.add(new C0563a("vodseries", R.string.icon_index_vodseries, this.c.f1251F.m1347b("indexVodSeries")));
        this.f2490j.add(new C0563a("setting", R.string.icon_index_setting, this.c.f1251F.m1347b("indexSetting")));
        int size = this.f2490j.size();
        for (int i = 0; i < size; i++) {
            C0563a c0563a = (C0563a) this.f2490j.get(i);
            C1066b c1066b = new C1066b(this, this.c.f1264l.inflate(R.layout.activity_launch_menu_item, this.f2488h, false));
            c1066b.m2270a(c0563a);
            c1066b.f.setOnClickListener(c05583);
            c1066b.f.setOnFocusChangeListener(c05572);
            c1066b.f.setOnTouchListener(c05594);
            this.f2488h.addView(c1066b.f);
            c1066b.f.setId(C0595e.m800a());
            c1066b.f.setNextFocusLeftId(-1);
            c1066b.f.setNextFocusRightId(-1);
            if (i == 0) {
                c1066b.f.setNextFocusLeftId(c1066b.f.getId());
                c1066b.f.requestFocus();
            } else if (i == size - 1) {
                c1066b.f.setNextFocusRightId(c1066b.f.getId());
            }
        }
    }

    /* renamed from: g */
    private void m3195g() {
        this.f2489i.setFocusChildOnTop(true);
        this.f2492l = new C0592a();
        this.f2492l.f645a = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_launch_vod_item_width);
        this.f2492l.f646b = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_launch_vod_item_height);
        this.f2492l.f648d = ViewCompat.MEASURED_STATE_MASK;
        this.f2492l.f649e = Color.argb(120, 0, 0, 255);
        this.f2492l.f647c = -1;
        this.f2492l.f651g = this.c.f1252G;
        this.f2492l.f652h = this.c.f1253H;
        OnClickListener c05605 = new C05605(this);
        OnFocusChangeListener c05616 = new C05616(this);
        OnTouchListener c05627 = new C05627(this);
        for (int i = 0; i < 6; i++) {
            C1067c c1067c = new C1067c(this, this.c.f1264l.inflate(R.layout.activity_launch_vod_item, this.f2489i, false));
            c1067c.f.setOnClickListener(c05605);
            c1067c.f.setOnFocusChangeListener(c05616);
            c1067c.f.setOnTouchListener(c05627);
            this.f2489i.addView(c1067c.f);
            c1067c.f.setId(C0595e.m800a());
            c1067c.f.setNextFocusLeftId(-1);
            c1067c.f.setNextFocusRightId(-1);
            if (i == 0) {
                c1067c.f.setNextFocusLeftId(c1067c.f.getId());
            } else if (i == 5) {
                c1067c.f.setNextFocusRightId(c1067c.f.getId());
            }
        }
    }

    /* renamed from: a */
    private void m3187a(ArrayList<C0702m> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0702m c0702m = (C0702m) arrayList.get(i);
            ((C1067c) this.f2489i.getChildAt(i).getTag()).m2273a(c0702m);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            new C1350b().m2846a(this);
            return true;
        } else if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        } else {
            mo2163a();
            return true;
        }
    }

    /* renamed from: h */
    private void m3197h() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f2493m >= 600000) {
            this.f2493m = timeInMillis;
            this.c.f1249D.m1238a(6, new C10658(this));
        }
    }
}
