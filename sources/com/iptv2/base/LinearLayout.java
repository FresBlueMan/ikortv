package com.iptv2.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.iptv2.C0489R;

public class LinearLayout extends android.widget.LinearLayout {
    /* renamed from: a */
    private int f670a;
    /* renamed from: b */
    private int f671b;
    /* renamed from: c */
    private int f672c;
    /* renamed from: d */
    private int f673d;
    /* renamed from: e */
    private int f674e;
    /* renamed from: f */
    private boolean f675f;
    /* renamed from: g */
    private Paint f676g;
    /* renamed from: h */
    private C0601a f677h;
    /* renamed from: i */
    private boolean f678i = false;

    /* renamed from: com.iptv2.base.LinearLayout$a */
    public interface C0601a {
        /* renamed from: a */
        boolean mo1370a(MotionEvent motionEvent);
    }

    public LinearLayout(Context context) {
        super(context);
        m825a(context, null);
    }

    public LinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m825a(context, attributeSet);
    }

    public LinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m825a(context, attributeSet);
    }

    public void setOnDispatchTouchEventListener(C0601a c0601a) {
        this.f677h = c0601a;
    }

    public void setFocusChildOnTop(boolean z) {
        if (z != this.f678i) {
            this.f678i = z;
            setChildrenDrawingOrderEnabled(this.f678i);
        }
    }

    /* renamed from: a */
    private void m825a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.ViewBorder, 0, 0);
            this.f670a = context.getColor(1, 0);
            attributeSet = context.getDimensionPixelSize(5, 0);
            this.f671b = context.getDimensionPixelSize(3, attributeSet);
            this.f672c = context.getDimensionPixelSize(6, attributeSet);
            this.f673d = context.getDimensionPixelSize(4, attributeSet);
            this.f674e = context.getDimensionPixelSize(0, attributeSet);
            this.f675f = context.getBoolean(2, false);
            context.recycle();
        }
        this.f676g = new Paint();
    }

    public void setBorderColor(int i) {
        this.f670a = i;
        invalidate();
    }

    public void setBorderEnable(boolean z) {
        if (z != this.f675f) {
            this.f675f = z;
            invalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f677h == null || !this.f677h.mo1370a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f675f) {
            this.f676g.setColor(this.f670a);
            if (this.f671b > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f671b, (float) height, this.f676g);
            }
            if (this.f672c > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) width, (float) this.f672c, this.f676g);
            }
            if (this.f673d > 0) {
                canvas.drawRect((float) (width - this.f673d), 0.0f, (float) width, (float) height, this.f676g);
            }
            if (this.f674e > 0) {
                canvas.drawRect(0.0f, (float) (height - this.f674e), (float) width, (float) height, this.f676g);
            }
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            int indexOfChild = indexOfChild(focusedChild);
            if (indexOfChild < 0) {
                return i2;
            }
            i--;
            if (i2 == i) {
                if (indexOfChild <= i2) {
                    i2 = indexOfChild;
                }
                return i2;
            } else if (i2 == indexOfChild) {
                return i;
            }
        }
        return i2;
    }
}
