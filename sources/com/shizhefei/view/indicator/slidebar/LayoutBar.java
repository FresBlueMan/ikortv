package com.shizhefei.view.indicator.slidebar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.shizhefei.view.indicator.slidebar.ScrollBar.Gravity;

public class LayoutBar implements ScrollBar {
    protected Context context;
    protected Gravity gravity;
    protected int height;
    protected int layoutId;
    private LayoutParams layoutParams;
    protected View view;
    protected int width;

    public void onPageScrolled(int i, float f, int i2) {
    }

    public LayoutBar(Context context, int i) {
        this(context, i, Gravity.BOTTOM);
    }

    public LayoutBar(Context context, int i, Gravity gravity) {
        this.context = context;
        this.layoutId = i;
        this.view = LayoutInflater.from(context).inflate(i, new LinearLayout(context), null);
        this.layoutParams = this.view.getLayoutParams();
        this.height = this.view.getLayoutParams().height;
        this.width = this.view.getLayoutParams().width;
        this.gravity = gravity;
    }

    public int getHeight(int i) {
        if (this.height > 0) {
            return this.height;
        }
        this.layoutParams.height = i;
        return i;
    }

    public int getWidth(int i) {
        if (this.width > 0) {
            return this.width;
        }
        this.layoutParams.width = i;
        return i;
    }

    public View getSlideView() {
        return this.view;
    }

    public Gravity getGravity() {
        return this.gravity;
    }
}
