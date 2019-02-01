package com.iptv2.control;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.C0489R;

public class TextView extends android.widget.TextView {
    /* renamed from: a */
    private int f1052a;
    /* renamed from: b */
    private int f1053b;
    /* renamed from: c */
    private ViewAnimator f1054c;

    public TextView(Context context) {
        super(context);
        m1195a(context, null);
    }

    public TextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1195a(context, attributeSet);
    }

    public TextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1195a(context, attributeSet);
    }

    /* renamed from: a */
    private void m1195a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.TextView, 0, 0);
            this.f1052a = context.getColor(1, 0);
            this.f1053b = context.getColor(0, 0);
            if (this.f1052a != null) {
                setTextColor(this.f1052a);
            }
            context.recycle();
        }
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f1053b != 0) {
            if (this.f1054c != 0) {
                this.f1054c.cancel();
            }
            this.f1054c = new ViewAnimator();
            i = this.f1054c.addAnimationBuilder(this);
            int[] iArr = new int[2];
            iArr[0] = getCurrentTextColor();
            iArr[1] = z ? this.f1053b : this.f1052a;
            i.textColor(iArr).duration(200).start();
        }
    }
}
