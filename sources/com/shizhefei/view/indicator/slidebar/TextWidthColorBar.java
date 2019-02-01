package com.shizhefei.view.indicator.slidebar;

import android.content.Context;
import android.graphics.Rect;
import android.widget.TextView;
import com.shizhefei.view.indicator.Indicator;

public class TextWidthColorBar extends ColorBar {
    private Indicator indicator;
    private int realWidth = null;

    public TextWidthColorBar(Context context, Indicator indicator, int i, int i2) {
        super(context, i, i2);
        this.indicator = indicator;
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.realWidth = (int) ((((float) getTextWidth(getTextView(i))) * (1.0f - f)) + (((float) getTextWidth(getTextView(i + 1))) * f));
    }

    public int getWidth(int i) {
        if (this.realWidth == 0 && this.indicator.getIndicatorAdapter() != 0) {
            i = getTextView(this.indicator.getCurrentItem());
            if (i != 0) {
                this.realWidth = getTextWidth(i);
            }
        }
        return this.realWidth;
    }

    protected TextView getTextView(int i) {
        return (TextView) this.indicator.getItemView(i);
    }

    private int getTextWidth(TextView textView) {
        if (textView == null) {
            return 0;
        }
        Rect rect = new Rect();
        String charSequence = textView.getText().toString();
        textView.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
        return rect.left + rect.width();
    }
}
