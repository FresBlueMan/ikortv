package com.shizhefei.view.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SViewPager extends ViewPager {
    /* renamed from: a */
    private boolean f2127a = null;

    public SViewPager(Context context) {
        super(context);
    }

    public SViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f2127a) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (MotionEvent motionEvent2) {
            motionEvent2.printStackTrace();
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f2127a ? super.onTouchEvent(motionEvent) : null;
    }

    public void setCanScroll(boolean z) {
        this.f2127a = z;
    }

    /* renamed from: a */
    public boolean m2523a() {
        return this.f2127a;
    }
}
