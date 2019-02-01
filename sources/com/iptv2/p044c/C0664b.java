package com.iptv2.p044c;

import android.view.View;
import android.view.animation.TranslateAnimation;
import com.iptv2.core.C0730c;
import com.iptv2.p043b.C0591c;

/* compiled from: LoadingBarView */
/* renamed from: com.iptv2.c.b */
public class C0664b {
    /* renamed from: a */
    private C0730c f954a;
    /* renamed from: b */
    private View f955b;
    /* renamed from: c */
    private boolean f956c = false;
    /* renamed from: d */
    private int f957d;
    /* renamed from: e */
    private TranslateAnimation f958e;

    public C0664b(C0730c c0730c, View view) {
        this.f954a = c0730c;
        this.f955b = view;
        this.f957d = view.getLayoutParams().width;
        this.f958e = new TranslateAnimation((float) (-this.f957d), (float) this.f954a.f1266n.widthPixels, 0.0f, 0.0f);
        this.f958e.setDuration(3000);
        this.f958e.setRepeatCount(-1);
    }

    /* renamed from: a */
    public void m1094a() {
        if (!this.f956c) {
            C0591c.m791a("LoadingBarView", "show");
            this.f956c = true;
            this.f955b.setVisibility(0);
            this.f955b.clearAnimation();
            this.f955b.startAnimation(this.f958e);
        }
    }

    /* renamed from: b */
    public void m1095b() {
        if (this.f956c) {
            C0591c.m791a("LoadingBarView", "hide");
            this.f956c = false;
            this.f955b.clearAnimation();
            this.f955b.setVisibility(8);
        }
    }
}
