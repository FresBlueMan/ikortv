package com.iptv2.p044c.p045a;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationBuilder;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.LinearLayout;
import com.iptv2.base.LinearLayout.C0601a;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p044c.C0684i;
import com.iptv2.p044c.p045a.C0626b.C0623b;
import com.iptv2.p044c.p045a.C0637d.C0636c;
import java.util.ArrayList;

/* compiled from: LiveOverlayView */
/* renamed from: com.iptv2.c.a.g */
public class C0648g {
    /* renamed from: a */
    public C0619a f879a;
    /* renamed from: b */
    public C0637d f880b;
    /* renamed from: c */
    private C0626b f881c;
    /* renamed from: d */
    private LinearLayout f882d;
    /* renamed from: e */
    private C0684i f883e;
    /* renamed from: f */
    private View f884f;
    /* renamed from: g */
    private View f885g;
    /* renamed from: h */
    private TextView f886h;
    /* renamed from: i */
    private boolean f887i = false;
    /* renamed from: j */
    private boolean f888j;
    /* renamed from: k */
    private ViewAnimator f889k;
    /* renamed from: l */
    private ViewAnimator f890l;
    /* renamed from: m */
    private ArrayList<C0647a> f891m = new ArrayList();
    /* renamed from: n */
    private boolean f892n = false;
    /* renamed from: o */
    private Runnable f893o = new C06464(this);

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$1 */
    class C06451 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C0648g f877a;

        C06451(C0648g c0648g) {
            this.f877a = c0648g;
        }

        public void onClick(View view) {
            this.f877a.m1026d();
            this.f877a.f881c.f757e.m940a(true);
        }
    }

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$4 */
    class C06464 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0648g f878a;

        C06464(C0648g c0648g) {
            this.f878a = c0648g;
        }

        public void run() {
            if (!this.f878a.f881c.f753a.f1248C.m1321h()) {
                if (this.f878a.f892n) {
                    this.f878a.f881c.f753a.f1263k.removeCallbacks(this.f878a.f893o);
                    this.f878a.f881c.f753a.f1263k.postDelayed(this.f878a.f893o, 10000);
                    return;
                }
                this.f878a.m1026d();
            }
        }
    }

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$a */
    public static abstract class C0647a {
        /* renamed from: a */
        public void mo1325a(boolean z) {
        }
    }

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$2 */
    class C11352 implements C0601a {
        /* renamed from: a */
        final /* synthetic */ C0648g f1997a;

        C11352(C0648g c0648g) {
            this.f1997a = c0648g;
        }

        /* renamed from: a */
        public boolean mo1370a(MotionEvent motionEvent) {
            this.f1997a.m1025c();
            return null;
        }
    }

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$3 */
    class C11363 implements C0636c {
        /* renamed from: a */
        final /* synthetic */ C0648g f1998a;

        C11363(C0648g c0648g) {
            this.f1998a = c0648g;
        }

        /* renamed from: a */
        public void mo1371a() {
            this.f1998a.f892n = true;
        }

        /* renamed from: b */
        public void mo1373b() {
            this.f1998a.f892n = false;
            if (this.f1998a.f888j) {
                this.f1998a.f881c.f753a.f1263k.removeCallbacks(this.f1998a.f893o);
                this.f1998a.f881c.f753a.f1263k.postDelayed(this.f1998a.f893o, 10000);
            }
        }

        /* renamed from: a */
        public void mo1372a(boolean z) {
            this.f1998a.f892n = false;
            if (this.f1998a.f888j) {
                this.f1998a.f881c.f753a.f1263k.removeCallbacks(this.f1998a.f893o);
                this.f1998a.f881c.f753a.f1263k.postDelayed(this.f1998a.f893o, 10000);
            }
        }
    }

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$5 */
    class C11375 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0648g f1999a;

        C11375(C0648g c0648g) {
            this.f1999a = c0648g;
        }

        public void onStop() {
            this.f1999a.f890l = null;
            ((ViewGroup) this.f1999a.f885g.getParent()).removeView(this.f1999a.f885g);
        }
    }

    /* compiled from: LiveOverlayView */
    /* renamed from: com.iptv2.c.a.g$6 */
    class C11386 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0648g f2000a;

        C11386(C0648g c0648g) {
            this.f2000a = c0648g;
        }

        public void onStop() {
            if (!this.f2000a.f888j) {
                this.f2000a.f882d.setVisibility(4);
            }
        }
    }

    public C0648g(C0626b c0626b, View view) {
        this.f881c = c0626b;
        this.f882d = (LinearLayout) view;
        this.f883e = new C0684i(c0626b.f753a, this.f882d.findViewById(R.id.time));
        this.f879a = new C0619a(c0626b, this.f882d);
        this.f880b = new C0637d(c0626b, this.f882d);
        this.f884f = this.f882d.findViewById(R.id.arrow);
        this.f885g = this.f882d.findViewById(R.id.arrow_tip_container);
        this.f886h = (TextView) this.f882d.findViewById(R.id.arrow_tip_text);
        this.f886h.setText(c0626b.f753a.f1251F.m1350e("recordListExpandTip"));
        if (c0626b.f753a.f1248C.m1321h() != null) {
            this.f882d.setOnClickListener(new C06451(this));
            this.f882d.setOnDispatchTouchEventListener(new C11352(this));
        }
        this.f880b.m994a(new C11363(this));
    }

    /* renamed from: a */
    public void m1022a(C0647a c0647a) {
        this.f891m.add(c0647a);
    }

    /* renamed from: a */
    public void m1021a() {
        this.f879a.m868a();
    }

    /* renamed from: b */
    public boolean m1024b() {
        return this.f888j;
    }

    /* renamed from: i */
    private void m1020i() {
        if (!this.f887i) {
            this.f887i = true;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f886h.getLayoutParams();
            this.f886h.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824));
            marginLayoutParams.width = this.f886h.getMeasuredWidth();
            this.f890l = new ViewAnimator();
            this.f890l.addAnimationBuilder(this.f885g).duration(1500).startDelay(500).scale(0.0f, 1.0f).alpha(0.0f, 1.0f).thenAnimate(this.f885g).width((float) this.f885g.getMinimumWidth(), (float) marginLayoutParams.width).duration(600).thenAnimate(this.f886h).translationX((float) (marginLayoutParams.width / 3), 0.0f).alpha(0.0f, 1.0f).duration(600).thenAnimate(this.f886h).translationX(0.0f, (float) (marginLayoutParams.width / 3)).alpha(1.0f, 0.0f).startDelay(4000).duration(600).thenAnimate(this.f885g).width((float) marginLayoutParams.width, (float) this.f885g.getMinimumWidth()).duration(600).thenAnimate(this.f885g).scale(1.0f, 0.0f).alpha(1.0f, 0.0f).duration(1000).onStop(new C11375(this)).start();
        }
    }

    /* renamed from: c */
    public void m1025c() {
        if (this.f881c.f761i == null || !r0.f881c.f761i.m1101a()) {
            r0.f881c.f753a.f1263k.removeCallbacks(r0.f893o);
            r0.f881c.f753a.f1263k.postDelayed(r0.f893o, 10000);
            if (!r0.f888j) {
                r0.f883e.m1191a();
                C0591c.m791a("LiveOverlayView", "show");
                r0.f888j = true;
                if (r0.f889k != null) {
                    r0.f889k.cancel();
                }
                int i = 0;
                r0.f882d.setVisibility(0);
                r0.f882d.requestLayout();
                r0.f889k = new ViewAnimator();
                r0.f889k.addAnimationBuilder(r0.f882d).alpha(1.0f).duration(300);
                int i2 = r0.f884f.getLayoutParams().width;
                r0.f884f.setTranslationX(0.0f);
                if (r0.f880b.m997b()) {
                    AnimationBuilder interpolator = r0.f889k.thenAnimate(r0.f884f).startDelay(400).duration(1300).repeatCount(1).interpolator(new LinearInterpolator());
                    r6 = new float[7];
                    int i3 = -i2;
                    r6[1] = (float) (i3 / 4);
                    r6[2] = (float) (i2 / 6);
                    r6[3] = (float) (i3 / 8);
                    r6[4] = 0.0f;
                    r6[5] = 0.0f;
                    r6[6] = 0.0f;
                    interpolator.translationX(r6);
                } else {
                    r0.f889k.thenAnimate(r0.f884f).startDelay(400).duration(1300).repeatCount(1).interpolator(new LinearInterpolator()).translationX(0.0f, (float) (i2 / 4), (float) ((-i2) / 6), (float) (i2 / 8), 0.0f, 0.0f, 0.0f);
                }
                r0.f889k.start();
                m1020i();
                int size = r0.f891m.size();
                while (i < size) {
                    ((C0647a) r0.f891m.get(i)).mo1325a(r0.f888j);
                    i++;
                }
            }
        }
    }

    /* renamed from: d */
    public void m1026d() {
        this.f881c.f753a.f1263k.removeCallbacks(this.f893o);
        if (this.f888j) {
            C0591c.m791a("LiveOverlayView", "hide");
            int i = 0;
            this.f888j = false;
            this.f883e.m1192b();
            if (this.f889k != null) {
                this.f889k.cancel();
            }
            this.f882d.setVisibility(0);
            this.f882d.requestLayout();
            this.f889k = new ViewAnimator();
            this.f889k.addAnimationBuilder(this.f882d).alpha(0.0f).duration(300).onStop(new C11386(this)).start();
            if (this.f890l != null) {
                this.f890l.cancel();
                this.f890l = null;
            }
            ViewGroup viewGroup = (ViewGroup) this.f885g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f885g);
            }
            int size = this.f891m.size();
            while (i < size) {
                ((C0647a) this.f891m.get(i)).mo1325a(this.f888j);
                i++;
            }
        }
    }

    /* renamed from: a */
    public boolean m1023a(int i) {
        this.f881c.f753a.f1263k.removeCallbacks(this.f893o);
        this.f881c.f753a.f1263k.postDelayed(this.f893o, 10000);
        if ((this.f880b.m997b() && this.f880b.m996a(i)) || this.f879a.m869a(i)) {
            return true;
        }
        if (i != 4 || this.f888j == 0) {
            return false;
        }
        m1026d();
        return true;
    }

    /* renamed from: e */
    public void m1027e() {
        this.f881c.f753a.f1263k.removeCallbacks(this.f893o);
        this.f881c.f753a.f1263k.postDelayed(this.f893o, 10000);
        if (this.f880b.m997b()) {
            this.f880b.m993a();
        } else {
            this.f879a.m872d();
        }
    }

    /* renamed from: f */
    public boolean m1028f() {
        this.f881c.f753a.f1263k.removeCallbacks(this.f893o);
        this.f881c.f753a.f1263k.postDelayed(this.f893o, 10000);
        return !this.f880b.m997b() ? this.f879a.m873e() : false;
    }

    /* renamed from: g */
    public void m1029g() {
        if (this.f881c.f766n == C0623b.Record) {
            this.f880b.m1000e();
        } else {
            this.f879a.m877i();
        }
    }

    /* renamed from: h */
    public void m1030h() {
        if (this.f881c.f766n == C0623b.Record) {
            this.f880b.m1001f();
        } else {
            this.f879a.m878j();
        }
    }
}
