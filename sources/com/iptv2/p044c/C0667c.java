package com.iptv2.p044c;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.github.florent37.viewanimator.AnimationBuilder;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.AnimationListener.Update;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.core.C0730c;
import com.iptv2.p043b.C0591c;
import java.util.ArrayList;

/* compiled from: MenuBarView */
/* renamed from: com.iptv2.c.c */
public class C0667c {
    /* renamed from: a */
    protected View f960a;
    /* renamed from: b */
    protected View f961b;
    /* renamed from: c */
    private C0730c f962c;
    /* renamed from: d */
    private boolean f963d = false;
    /* renamed from: e */
    private boolean f964e = false;
    /* renamed from: f */
    private ViewAnimator f965f;
    /* renamed from: g */
    private ArrayList<C0666a> f966g = new ArrayList();
    /* renamed from: h */
    private Runnable f967h = new C06651(this);

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$1 */
    class C06651 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0667c f959a;

        C06651(C0667c c0667c) {
            this.f959a = c0667c;
        }

        public void run() {
            this.f959a.m1104c();
        }
    }

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$a */
    public static abstract class C0666a {
        /* renamed from: a */
        public void mo1334a(boolean z) {
        }

        /* renamed from: b */
        public void mo1335b(boolean z) {
        }
    }

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$2 */
    class C11542 implements Update {
        /* renamed from: a */
        final /* synthetic */ C0667c f2023a;

        C11542(C0667c c0667c) {
            this.f2023a = c0667c;
        }

        public void update(View view, float f) {
            this.f2023a.f961b.setTranslationX(f);
            this.f2023a.f961b.requestLayout();
        }
    }

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$3 */
    class C11553 implements Update {
        /* renamed from: a */
        final /* synthetic */ C0667c f2024a;

        C11553(C0667c c0667c) {
            this.f2024a = c0667c;
        }

        public void update(View view, float f) {
            this.f2024a.f960a.setTranslationX(f);
            this.f2024a.f960a.requestLayout();
        }
    }

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$4 */
    class C11564 implements Update {
        /* renamed from: a */
        final /* synthetic */ C0667c f2025a;

        C11564(C0667c c0667c) {
            this.f2025a = c0667c;
        }

        public void update(View view, float f) {
            this.f2025a.f961b.setTranslationX(f);
            this.f2025a.f961b.requestLayout();
        }
    }

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$5 */
    class C11575 implements Update {
        /* renamed from: a */
        final /* synthetic */ C0667c f2026a;

        C11575(C0667c c0667c) {
            this.f2026a = c0667c;
        }

        public void update(View view, float f) {
            this.f2026a.f960a.setTranslationX(f);
            this.f2026a.f960a.requestLayout();
        }
    }

    /* compiled from: MenuBarView */
    /* renamed from: com.iptv2.c.c$6 */
    class C11586 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0667c f2027a;

        C11586(C0667c c0667c) {
            this.f2027a = c0667c;
        }

        public void onStop() {
            if (!this.f2027a.f963d) {
                this.f2027a.f960a.setVisibility(8);
                this.f2027a.f961b.setVisibility(8);
            }
        }
    }

    public C0667c(C0730c c0730c, View view, View view2) {
        this.f962c = c0730c;
        this.f960a = view;
        this.f961b = view2;
    }

    /* renamed from: a */
    public void m1099a(C0666a c0666a) {
        this.f966g.add(c0666a);
    }

    /* renamed from: a */
    public boolean m1101a() {
        return this.f964e;
    }

    /* renamed from: b */
    public boolean m1103b() {
        return this.f963d;
    }

    /* renamed from: a */
    protected void m1100a(boolean z) {
        if (this.f964e != z) {
            this.f964e = z;
            z = this.f966g.size();
            for (boolean z2 = false; z2 < z; z2++) {
                ((C0666a) this.f966g.get(z2)).mo1334a(this.f964e);
            }
        }
    }

    /* renamed from: b */
    public void m1102b(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("show ");
        stringBuilder.append(z);
        C0591c.m791a("MenuBarView", stringBuilder.toString());
        this.f962c.f1263k.removeCallbacks(this.f967h);
        if (z) {
            this.f962c.f1263k.postDelayed(this.f967h, 5000);
        }
        if (!this.f963d) {
            this.f963d = true;
            if (this.f965f != null) {
                this.f965f.cancel();
            }
            boolean z2 = false;
            this.f960a.setVisibility(0);
            this.f961b.setVisibility(0);
            int alpha = (int) ((200.0f * this.f960a.getAlpha()) / 1.0f);
            this.f965f = new ViewAnimator();
            long j = (long) (200 - alpha);
            this.f965f.addAnimationBuilder(this.f960a, this.f961b).interpolator(new LinearInterpolator()).alpha(r0, 1.0f).duration(j).andAnimate(this.f960a).custom(new C11553(this), this.f960a.getTranslationX(), 0.0f).duration(j).andAnimate(this.f961b).custom(new C11542(this), this.f961b.getTranslationX(), 0.0f).duration(j).start();
            z = this.f966g.size();
            while (z2 < z) {
                ((C0666a) this.f966g.get(z2)).mo1335b(this.f963d);
                z2++;
            }
        }
    }

    /* renamed from: c */
    public void m1104c() {
        this.f962c.f1263k.removeCallbacks(this.f967h);
        if (this.f963d) {
            C0591c.m791a("MenuBarView", "hide");
            int i = 0;
            this.f963d = false;
            if (this.f965f != null) {
                this.f965f.cancel();
            }
            this.f960a.setVisibility(0);
            this.f961b.setVisibility(0);
            int alpha = (int) ((200.0f * this.f960a.getAlpha()) / 1.0f);
            int i2 = this.f960a.getLayoutParams().width;
            this.f965f = new ViewAnimator();
            AnimationBuilder alpha2 = this.f965f.addAnimationBuilder(this.f960a, this.f961b).interpolator(new LinearInterpolator()).alpha(r1, 0.0f);
            long j = (long) alpha;
            alpha2.duration(j).onStop(new C11586(this)).andAnimate(this.f960a).custom(new C11575(this), this.f960a.getTranslationX(), (float) (-i2)).duration(j).andAnimate(this.f961b).custom(new C11564(this), this.f961b.getTranslationX(), (float) i2).duration(j).start();
            int size = this.f966g.size();
            while (i < size) {
                ((C0666a) this.f966g.get(i)).mo1335b(this.f963d);
                i++;
            }
        }
    }
}
