package com.iptv2.control;

import android.content.Context;
import android.util.AttributeSet;
import com.iptv2.base.LinearLayout;
import com.iptv2.core.Application;
import com.iptv2.core.C0730c;

public class ButtonGroupView extends LinearLayout {
    /* renamed from: a */
    private C0730c f2043a;

    public ButtonGroupView(Context context) {
        super(context);
        m2459a(context);
    }

    public ButtonGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2459a(context);
    }

    public ButtonGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2459a(context);
    }

    /* renamed from: a */
    private void m2459a(Context context) {
        this.f2043a = ((Application) context.getApplicationContext()).f1065d;
    }
}
