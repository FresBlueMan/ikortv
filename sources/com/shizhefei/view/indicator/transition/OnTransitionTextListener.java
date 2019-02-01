package com.shizhefei.view.indicator.transition;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.shizhefei.view.indicator.Indicator.OnTransitionListener;
import com.shizhefei.view.p047a.C0780a;

public class OnTransitionTextListener implements OnTransitionListener {
    private float dFontFize = -1.0f;
    private C0780a gradient;
    private boolean isPxSize = false;
    private float selectSize = -1.0f;
    private float unSelectSize = -1.0f;

    public OnTransitionTextListener(float f, float f2, int i, int i2) {
        setColor(i, i2);
        setSize(f, f2);
    }

    public final OnTransitionTextListener setSize(float f, float f2) {
        this.isPxSize = false;
        this.selectSize = f;
        this.unSelectSize = f2;
        this.dFontFize = f - f2;
        return this;
    }

    public final OnTransitionTextListener setValueFromRes(Context context, int i, int i2, int i3, int i4) {
        setColorId(context, i, i2);
        setSizeId(context, i3, i4);
        return this;
    }

    public final OnTransitionTextListener setColorId(Context context, int i, int i2) {
        context = context.getResources();
        setColor(context.getColor(i), context.getColor(i2));
        return this;
    }

    public final OnTransitionTextListener setSizeId(Context context, int i, int i2) {
        context = context.getResources();
        setSize((float) context.getDimensionPixelSize(i), (float) context.getDimensionPixelSize(i2));
        this.isPxSize = true;
        return this;
    }

    public final OnTransitionTextListener setColor(int i, int i2) {
        this.gradient = new C0780a(i2, i, 100);
        return this;
    }

    public TextView getTextView(View view, int i) {
        return (TextView) view;
    }

    public void onTransition(View view, int i, float f) {
        view = getTextView(view, i);
        if (this.gradient != 0) {
            view.setTextColor(this.gradient.m1435a((int) (100.0f * f)));
        }
        if (this.unSelectSize > 0 && this.selectSize > 0) {
            if (this.isPxSize != 0) {
                view.setTextSize(0, this.unSelectSize + (this.dFontFize * f));
            } else {
                view.setTextSize(this.unSelectSize + (this.dFontFize * f));
            }
        }
    }
}
