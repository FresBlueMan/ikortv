package com.shizhefei.view.viewpager;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: DurationScroller */
/* renamed from: com.shizhefei.view.viewpager.a */
public class C0790a extends Scroller {
    /* renamed from: a */
    private int f1401a = 800;

    public C0790a(Context context) {
        super(context);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f1401a);
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f1401a);
    }

    /* renamed from: a */
    public void m1436a(int i) {
        this.f1401a = i;
    }
}
