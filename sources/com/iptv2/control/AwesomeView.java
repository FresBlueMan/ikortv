package com.iptv2.control;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.iptv2.core.Application;

public class AwesomeView extends AppCompatTextView {
    public AwesomeView(Context context) {
        super(context);
        m2750a(context);
    }

    public AwesomeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2750a(context);
    }

    public AwesomeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2750a(context);
    }

    /* renamed from: a */
    private void m2750a(Context context) {
        setTypeface(((Application) context.getApplicationContext()).f1065d.f1278z);
    }
}
