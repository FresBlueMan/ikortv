package com.shizhefei.view.indicator.slidebar;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import com.shizhefei.view.indicator.slidebar.ScrollBar.Gravity;

public class DrawableBar implements ScrollBar {
    protected Drawable drawable;
    protected int drawableId;
    protected Gravity gravity;
    protected View view;

    public void onPageScrolled(int i, float f, int i2) {
    }

    public DrawableBar(Context context, int i) {
        this(context, i, Gravity.BOTTOM);
    }

    public DrawableBar(Context context, int i, Gravity gravity) {
        this(context, context.getResources().getDrawable(i), gravity);
    }

    public DrawableBar(Context context, Drawable drawable) {
        this(context, drawable, Gravity.BOTTOM);
    }

    @TargetApi(16)
    public DrawableBar(Context context, Drawable drawable, Gravity gravity) {
        this.view = new View(context);
        this.drawable = drawable;
        if (VERSION.SDK_INT >= 16) {
            this.view.setBackground(drawable);
        } else {
            this.view.setBackgroundDrawable(drawable);
        }
        this.gravity = gravity;
    }

    public int getColor() {
        return this.drawableId;
    }

    public void setColor(int i) {
        this.drawableId = i;
        this.view.setBackgroundColor(i);
    }

    public int getHeight(int i) {
        return this.drawable.getIntrinsicHeight();
    }

    public int getWidth(int i) {
        return this.drawable.getIntrinsicWidth();
    }

    public View getSlideView() {
        return this.view;
    }

    public Gravity getGravity() {
        return this.gravity;
    }

    public DrawableBar setGravity(Gravity gravity) {
        this.gravity = gravity;
        return this;
    }
}
