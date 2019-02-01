package com.iptv2.p043b;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.Scroller;
import java.lang.reflect.Field;

/* compiled from: ViewPagerUtility */
/* renamed from: com.iptv2.b.f */
public final class C0597f {

    /* compiled from: ViewPagerUtility */
    /* renamed from: com.iptv2.b.f$a */
    public static class C0596a extends Scroller {
        /* renamed from: a */
        public int f660a = 1000;

        public C0596a(Context context) {
            super(context);
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.f660a);
        }

        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, this.f660a);
        }
    }

    /* renamed from: a */
    public static void m819a(ViewPager viewPager, int i) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C0596a c0596a = new C0596a(viewPager.getContext());
            c0596a.f660a = i;
            declaredField.set(viewPager, c0596a);
        } catch (ViewPager viewPager2) {
            C0591c.m792a("ViewPagerUtility", "setAnimateDuration", viewPager2);
        }
    }
}
