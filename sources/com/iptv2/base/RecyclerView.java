package com.iptv2.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.View;
import com.iptv2.C0489R;

public class RecyclerView extends android.support.v7.widget.RecyclerView {
    /* renamed from: a */
    private int f2311a;
    /* renamed from: b */
    private int f2312b;
    /* renamed from: c */
    private int f2313c;
    /* renamed from: d */
    private int f2314d;
    /* renamed from: e */
    private int f2315e;
    /* renamed from: f */
    private boolean f2316f;
    /* renamed from: g */
    private Paint f2317g;

    /* renamed from: com.iptv2.base.RecyclerView$a */
    public static abstract class C1102a<T> extends ViewHolder {
        /* renamed from: h */
        public T f1928h;

        /* renamed from: a */
        public void mo1858a() {
        }

        /* renamed from: a */
        public void mo1854a(boolean z) {
        }

        /* renamed from: b */
        public void mo1855b() {
        }

        /* renamed from: c */
        public void mo1856c() {
        }

        /* renamed from: d */
        public void mo1857d() {
        }

        /* renamed from: e */
        public boolean mo1859e() {
            return false;
        }

        /* renamed from: f */
        public void m2348f() {
        }

        /* renamed from: g */
        public void m2349g() {
        }

        public C1102a(View view) {
            super(view);
            view.setTag(this);
        }

        /* renamed from: b */
        public final void m2343b(boolean z) {
            if (this.itemView.isSelected() != z) {
                this.itemView.setSelected(z);
                if (z) {
                    mo1856c();
                } else {
                    mo1857d();
                }
            }
        }

        /* renamed from: c */
        public final void m2345c(boolean z) {
            if (this.itemView.isActivated() != z) {
                this.itemView.setActivated(z);
                if (z) {
                    m2348f();
                } else {
                    m2349g();
                }
            }
        }
    }

    public RecyclerView(Context context) {
        super(context);
        m2845a(context, null);
    }

    public RecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2845a(context, attributeSet);
    }

    public RecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2845a(context, attributeSet);
    }

    /* renamed from: a */
    private void m2845a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C0489R.styleable.ViewBorder, 0, 0);
            this.f2311a = context.getColor(1, 0);
            this.f2312b = context.getDimensionPixelSize(3, 0);
            this.f2313c = context.getDimensionPixelSize(6, 0);
            this.f2314d = context.getDimensionPixelSize(4, 0);
            this.f2315e = context.getDimensionPixelSize(0, 0);
            this.f2316f = context.getBoolean(2, false);
            context.recycle();
        }
        this.f2317g = new Paint();
        setHasFixedSize(true);
        setFocusable(false);
        setFocusableInTouchMode(false);
    }

    public void setBorderColor(int i) {
        this.f2311a = i;
        invalidate();
    }

    public void setBorderEnable(boolean z) {
        if (z != this.f2316f) {
            this.f2316f = z;
            invalidate();
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2316f) {
            this.f2317g.setColor(this.f2311a);
            if (this.f2312b > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f2312b, (float) height, this.f2317g);
            }
            if (this.f2313c > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) width, (float) this.f2313c, this.f2317g);
            }
            if (this.f2314d > 0) {
                canvas.drawRect((float) (width - this.f2314d), 0.0f, (float) width, (float) height, this.f2317g);
            }
            if (this.f2315e > 0) {
                canvas.drawRect(0.0f, (float) (height - this.f2315e), (float) width, (float) height, this.f2317g);
            }
        }
    }
}
