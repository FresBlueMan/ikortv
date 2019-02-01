package com.iptv2.control;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.iptv2.core.Application;

public class IcomoonView extends AppCompatTextView {
    public IcomoonView(Context context) {
        super(context);
        m2751a(context);
    }

    public IcomoonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2751a(context);
    }

    public IcomoonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2751a(context);
    }

    /* renamed from: a */
    private void m2751a(Context context) {
        setTypeface(((Application) context.getApplicationContext()).f1065d.f1277y);
    }
}
