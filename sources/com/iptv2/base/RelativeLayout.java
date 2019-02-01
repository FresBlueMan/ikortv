package com.iptv2.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.iptv2.C0489R;

public class RelativeLayout extends android.widget.RelativeLayout {
    /* renamed from: a */
    private int f679a;
    /* renamed from: b */
    private int f680b;
    /* renamed from: c */
    private int f681c;
    /* renamed from: d */
    private int f682d;
    /* renamed from: e */
    private int f683e;
    /* renamed from: f */
    private boolean f684f;
    /* renamed from: g */
    private Paint f685g;
    /* renamed from: h */
    private C0602a f686h;

    /* renamed from: com.iptv2.base.RelativeLayout$a */
    public interface C0602a {
        /* renamed from: a */
        boolean m826a(MotionEvent motionEvent);
    }

    public RelativeLayout(Context context) {
        super(context);
        m827a(context, null);
    }

    public RelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m827a(context, attributeSet);
    }

    public RelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m827a(context, attributeSet);
    }

    public void setOnDispatchTouchEventListener(C0602a c0602a) {
        this.f686h = c0602a;
    }

    /* renamed from: a */
    private void m827a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.ViewBorder, 0, 0);
            this.f679a = context.getColor(1, 0);
            attributeSet = context.getDimensionPixelSize(5, 0);
            this.f680b = context.getDimensionPixelSize(3, attributeSet);
            this.f681c = context.getDimensionPixelSize(6, attributeSet);
            this.f682d = context.getDimensionPixelSize(4, attributeSet);
            this.f683e = context.getDimensionPixelSize(0, attributeSet);
            this.f684f = context.getBoolean(2, false);
            context.recycle();
        }
        this.f685g = new Paint();
    }

    public void setBorderColor(int i) {
        this.f679a = i;
        invalidate();
    }

    public void setBorderEnable(boolean z) {
        if (z != this.f684f) {
            this.f684f = z;
            invalidate();
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f684f) {
            this.f685g.setColor(this.f679a);
            if (this.f680b > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f680b, (float) height, this.f685g);
            }
            if (this.f681c > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) width, (float) this.f681c, this.f685g);
            }
            if (this.f682d > 0) {
                canvas.drawRect((float) (width - this.f682d), 0.0f, (float) width, (float) height, this.f685g);
            }
            if (this.f683e > 0) {
                canvas.drawRect(0.0f, (float) (height - this.f683e), (float) width, (float) height, this.f685g);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f686h == null || !this.f686h.m826a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
