package com.iptv2.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.iptv2.C0489R;

public class FrameLayout extends android.widget.FrameLayout {
    /* renamed from: a */
    private int f662a;
    /* renamed from: b */
    private int f663b;
    /* renamed from: c */
    private int f664c;
    /* renamed from: d */
    private int f665d;
    /* renamed from: e */
    private int f666e;
    /* renamed from: f */
    private boolean f667f;
    /* renamed from: g */
    private Paint f668g;
    /* renamed from: h */
    private C0600a f669h;

    /* renamed from: com.iptv2.base.FrameLayout$a */
    public interface C0600a {
        /* renamed from: a */
        boolean mo1363a(MotionEvent motionEvent);
    }

    public FrameLayout(Context context) {
        super(context);
        m823a(context, null);
    }

    public FrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m823a(context, attributeSet);
    }

    public FrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m823a(context, attributeSet);
    }

    public void setOnDispatchTouchEventListener(C0600a c0600a) {
        this.f669h = c0600a;
    }

    /* renamed from: a */
    private void m823a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.ViewBorder, 0, 0);
            this.f662a = context.getColor(1, 0);
            attributeSet = context.getDimensionPixelSize(5, 0);
            this.f663b = context.getDimensionPixelSize(3, attributeSet);
            this.f664c = context.getDimensionPixelSize(6, attributeSet);
            this.f665d = context.getDimensionPixelSize(4, attributeSet);
            this.f666e = context.getDimensionPixelSize(0, attributeSet);
            this.f667f = context.getBoolean(2, false);
            context.recycle();
        }
        this.f668g = new Paint();
    }

    public void setBorderColor(int i) {
        this.f662a = i;
        invalidate();
    }

    public void setBorderEnable(boolean z) {
        if (z != this.f667f) {
            this.f667f = z;
            invalidate();
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f667f) {
            this.f668g.setColor(this.f662a);
            if (this.f663b > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f663b, (float) height, this.f668g);
            }
            if (this.f664c > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) width, (float) this.f664c, this.f668g);
            }
            if (this.f665d > 0) {
                canvas.drawRect((float) (width - this.f665d), 0.0f, (float) width, (float) height, this.f668g);
            }
            if (this.f666e > 0) {
                canvas.drawRect(0.0f, (float) (height - this.f666e), (float) width, (float) height, this.f668g);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f669h == null || !this.f669h.mo1363a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
