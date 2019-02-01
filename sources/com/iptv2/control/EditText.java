package com.iptv2.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.github.florent37.viewanimator.AnimationListener.Update;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.C0489R;

public class EditText extends android.widget.EditText {
    /* renamed from: a */
    private int f1042a;
    /* renamed from: b */
    private int f1043b;
    /* renamed from: c */
    private ViewAnimator f1044c;

    /* renamed from: com.iptv2.control.EditText$1 */
    class C06851 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ EditText f1041a;

        C06851(EditText editText) {
            this.f1041a = editText;
        }

        public void onClick(View view) {
            ((InputMethodManager) this.f1041a.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }
    }

    /* renamed from: com.iptv2.control.EditText$2 */
    class C11692 implements Update {
        /* renamed from: a */
        final /* synthetic */ EditText f2044a;

        C11692(EditText editText) {
            this.f2044a = editText;
        }

        public void update(View view, float f) {
            this.f2044a.setHintTextColor(this.f2044a.getCurrentTextColor());
        }
    }

    public EditText(Context context) {
        super(context);
        m1193a(context, null);
    }

    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1193a(context, attributeSet);
    }

    public EditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1193a(context, attributeSet);
    }

    /* renamed from: a */
    private void m1193a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.TextView, 0, 0);
            this.f1042a = context.getColor(1, 0);
            this.f1043b = context.getColor(0, 0);
            if (this.f1042a != null) {
                setTextColor(this.f1042a);
                setHintTextColor(this.f1042a);
            }
            context.recycle();
        }
        setOnClickListener(new C06851(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onFocusChanged(boolean r5, int r6, android.graphics.Rect r7) {
        /*
        r4 = this;
        super.onFocusChanged(r5, r6, r7);
        r6 = r4.f1043b;
        if (r6 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r6 = r4.f1044c;
        if (r6 == 0) goto L_0x0011;
    L_0x000c:
        r6 = r4.f1044c;
        r6.cancel();
    L_0x0011:
        r6 = new com.github.florent37.viewanimator.ViewAnimator;
        r6.<init>();
        r4.f1044c = r6;
        r6 = r4.f1044c;
        r7 = 1;
        r0 = new android.view.View[r7];
        r1 = 0;
        r0[r1] = r4;
        r6 = r6.addAnimationBuilder(r0);
        r0 = 2;
        r2 = new int[r0];
        r3 = r4.getCurrentTextColor();
        r2[r1] = r3;
        if (r5 == 0) goto L_0x0032;
    L_0x002f:
        r5 = r4.f1043b;
        goto L_0x0034;
    L_0x0032:
        r5 = r4.f1042a;
    L_0x0034:
        r2[r7] = r5;
        r5 = r6.textColor(r2);
        r6 = new com.iptv2.control.EditText$2;
        r6.<init>(r4);
        r7 = new float[r0];
        r7 = {0, 1065353216};
        r5 = r5.custom(r6, r7);
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r5 = r5.duration(r6);
        r5.start();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.control.EditText.onFocusChanged(boolean, int, android.graphics.Rect):void");
    }
}
