package com.shizhefei.view.indicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import com.shizhefei.view.indicator.Indicator.DataSetObserver;
import com.shizhefei.view.indicator.Indicator.IndicatorAdapter;
import com.shizhefei.view.indicator.Indicator.OnItemSelectedListener;
import com.shizhefei.view.indicator.Indicator.OnTransitionListener;
import com.shizhefei.view.indicator.slidebar.ScrollBar;
import com.shizhefei.view.indicator.slidebar.ScrollBar.Gravity;

public class ScrollIndicatorView extends HorizontalScrollView implements Indicator {
    private Drawable customShadowDrawable;
    private DataSetObserver dataSetObserver = new C12141();
    private Paint defaultShadowPaint = null;
    private SFixedIndicatorView fixedIndicatorView;
    private boolean isPinnedTabView = false;
    private boolean mActionDownHappened;
    private Runnable mTabSelector;
    private Drawable pinnedTabBgDrawable;
    private View pinnedTabView;
    private float positionOffset;
    private final ProxyOnItemSelectListener proxyOnItemSelectListener;
    private int shadowWidth;
    private int state = 0;
    private int unScrollPosition = -1;

    /* renamed from: com.shizhefei.view.indicator.ScrollIndicatorView$1 */
    class C12141 implements DataSetObserver {
        C12141() {
        }

        public void onChange() {
            if (ScrollIndicatorView.this.mTabSelector != null) {
                ScrollIndicatorView.this.removeCallbacks(ScrollIndicatorView.this.mTabSelector);
            }
            ScrollIndicatorView.this.positionOffset = 0.0f;
            ScrollIndicatorView.this.setCurrentItem(ScrollIndicatorView.this.fixedIndicatorView.getCurrentItem(), false);
            if (ScrollIndicatorView.this.isPinnedTabView && ScrollIndicatorView.this.fixedIndicatorView.getChildCount() > 0) {
                ScrollIndicatorView.this.pinnedTabView = ScrollIndicatorView.this.fixedIndicatorView.getChildAt(0);
            }
        }
    }

    private class ProxyOnItemSelectListener implements OnItemSelectedListener {
        private OnItemSelectedListener onItemSelectedListener;

        private ProxyOnItemSelectListener() {
        }

        public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
            this.onItemSelectedListener = onItemSelectedListener;
        }

        public OnItemSelectedListener getOnItemSelectedListener() {
            return this.onItemSelectedListener;
        }

        public void onItemSelected(View view, int i, int i2) {
            if (ScrollIndicatorView.this.state == 0) {
                ScrollIndicatorView.this.animateToTab(i);
            }
            if (this.onItemSelectedListener != null) {
                this.onItemSelectedListener.onItemSelected(view, i, i2);
            }
        }
    }

    private static class SFixedIndicatorView extends FixedIndicatorView {
        private boolean isAutoSplit;

        public SFixedIndicatorView(Context context) {
            super(context);
        }

        public boolean isSplitAuto() {
            return this.isAutoSplit;
        }

        public void setSplitAuto(boolean z) {
            if (this.isAutoSplit != z) {
                this.isAutoSplit = z;
                if (!z) {
                    setSplitMethod(true);
                }
                requestLayout();
                invalidate();
            }
        }

        protected void onMeasure(int i, int i2) {
            if (this.isAutoSplit) {
                ScrollIndicatorView scrollIndicatorView = (ScrollIndicatorView) getParent();
                int measuredWidth = scrollIndicatorView.getMeasuredWidth();
                if (measuredWidth != 0) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        int measureChildWidth = measureChildWidth(getChildAt(i5), i, i2);
                        if (i3 < measureChildWidth) {
                            i3 = measureChildWidth;
                        }
                        i4 += measureChildWidth;
                    }
                    if (i4 > measuredWidth) {
                        scrollIndicatorView.setFillViewport(false);
                        setSplitMethod(2);
                    } else if (i3 * childCount > measuredWidth) {
                        scrollIndicatorView.setFillViewport(true);
                        setSplitMethod(1);
                    } else {
                        scrollIndicatorView.setFillViewport(true);
                        setSplitMethod(0);
                    }
                }
            }
            super.onMeasure(i, i2);
        }

        private int measureChildWidth(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), -2), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
            return (view.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
        }
    }

    @TargetApi(11)
    public ScrollIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fixedIndicatorView = new SFixedIndicatorView(context);
        addView(this.fixedIndicatorView, new FrameLayout.LayoutParams(-2, -1));
        setHorizontalScrollBarEnabled(false);
        setSplitAuto(true);
        this.defaultShadowPaint = new Paint();
        this.defaultShadowPaint.setAntiAlias(true);
        this.defaultShadowPaint.setColor(866822826);
        this.shadowWidth = dipToPix(3.0f);
        this.defaultShadowPaint.setShadowLayer((float) this.shadowWidth, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        if (VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        context = this.fixedIndicatorView;
        attributeSet = new ProxyOnItemSelectListener();
        this.proxyOnItemSelectListener = attributeSet;
        context.setOnItemSelectListener(attributeSet);
    }

    public void setSplitAuto(boolean z) {
        setFillViewport(z);
        this.fixedIndicatorView.setSplitAuto(z);
    }

    public boolean isSplitAuto() {
        return this.fixedIndicatorView.isSplitAuto();
    }

    public void setAdapter(IndicatorAdapter indicatorAdapter) {
        if (getIndicatorAdapter() != null) {
            getIndicatorAdapter().unRegistDataSetObserver(this.dataSetObserver);
        }
        this.fixedIndicatorView.setAdapter(indicatorAdapter);
        indicatorAdapter.registDataSetObserver(this.dataSetObserver);
        this.dataSetObserver.onChange();
    }

    public void setOnItemSelectListener(OnItemSelectedListener onItemSelectedListener) {
        this.proxyOnItemSelectListener.setOnItemSelectedListener(onItemSelectedListener);
    }

    public IndicatorAdapter getIndicatorAdapter() {
        return this.fixedIndicatorView.getIndicatorAdapter();
    }

    public void setPinnedTabView(boolean z) {
        this.isPinnedTabView = z;
        if (z && this.fixedIndicatorView.getChildCount() <= false) {
            this.pinnedTabView = this.fixedIndicatorView.getChildAt(0);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setPinnedShadow(Drawable drawable, int i) {
        this.customShadowDrawable = drawable;
        this.shadowWidth = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setPinnedTabBg(Drawable drawable) {
        this.pinnedTabBgDrawable = drawable;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setPinnedTabBgColor(int i) {
        setPinnedTabBg(new ColorDrawable(i));
    }

    public void setPinnedTabBgId(int i) {
        setPinnedTabBg(ContextCompat.getDrawable(getContext(), i));
    }

    public void setPinnedShadow(int i, int i2) {
        setPinnedShadow(ContextCompat.getDrawable(getContext(), i), i2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            post(this.mTabSelector);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.fixedIndicatorView.getCount() > 0) {
            animateToTab(this.fixedIndicatorView.getCurrentItem());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.unScrollPosition) {
            z = this.fixedIndicatorView.getChildAt(this.unScrollPosition);
            if (z) {
                i2 = z.getLeft() - ((getMeasuredWidth() - z.getMeasuredWidth()) / 2);
                if (i2 >= 0) {
                    smoothScrollTo(i2, false);
                    this.unScrollPosition = -1;
                }
            }
        }
    }

    private void animateToTab(int i) {
        if (i >= 0) {
            if (i <= this.fixedIndicatorView.getCount() - 1) {
                i = this.fixedIndicatorView.getChildAt(i);
                if (this.mTabSelector != null) {
                    removeCallbacks(this.mTabSelector);
                }
                this.mTabSelector = new Runnable() {
                    public void run() {
                        ScrollIndicatorView.this.smoothScrollTo(i.getLeft() - ((ScrollIndicatorView.this.getWidth() - i.getWidth()) / 2), 0);
                        ScrollIndicatorView.this.mTabSelector = null;
                    }
                };
                post(this.mTabSelector);
            }
        }
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        int count = this.fixedIndicatorView.getCount();
        if (count != 0) {
            if (i < 0) {
                i = 0;
            } else {
                count--;
                if (i > count) {
                    i = count;
                }
            }
            this.unScrollPosition = -1;
            if (this.state == 0) {
                if (z) {
                    animateToTab(i);
                } else {
                    View childAt = this.fixedIndicatorView.getChildAt(i);
                    scrollTo(childAt.getLeft() - ((getWidth() - childAt.getWidth()) / 2), 0);
                    this.unScrollPosition = i;
                }
            }
            this.fixedIndicatorView.setCurrentItem(i, z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isPinnedTabView) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.pinnedTabView != null && y >= ((float) this.pinnedTabView.getTop()) && y <= ((float) this.pinnedTabView.getBottom()) && x > ((float) this.pinnedTabView.getLeft()) && x < ((float) this.pinnedTabView.getRight())) {
                if (motionEvent.getAction() == 0) {
                    this.mActionDownHappened = true;
                } else if (motionEvent.getAction() == 1 && this.mActionDownHappened != null) {
                    this.pinnedTabView.performClick();
                    invalidate(new Rect(0, 0, this.pinnedTabView.getMeasuredWidth(), this.pinnedTabView.getMeasuredHeight()));
                    this.mActionDownHappened = false;
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentItem() {
        return this.fixedIndicatorView.getCurrentItem();
    }

    public OnItemSelectedListener getOnItemSelectListener() {
        return this.proxyOnItemSelectListener.getOnItemSelectedListener();
    }

    public void setOnTransitionListener(OnTransitionListener onTransitionListener) {
        this.fixedIndicatorView.setOnTransitionListener(onTransitionListener);
    }

    public OnTransitionListener getOnTransitionListener() {
        return this.fixedIndicatorView.getOnTransitionListener();
    }

    public void setScrollBar(ScrollBar scrollBar) {
        this.fixedIndicatorView.setScrollBar(scrollBar);
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.positionOffset = f;
        View childAt = this.fixedIndicatorView.getChildAt(i);
        if (childAt != null) {
            View childAt2 = this.fixedIndicatorView.getChildAt(i + 1);
            scrollTo((int) (((float) (childAt.getLeft() - ((getWidth() - childAt.getWidth()) / 2))) + (((float) ((childAt.getWidth() + (childAt2 == null ? childAt.getWidth() : childAt2.getWidth())) / 2)) * f)), 0);
            this.fixedIndicatorView.onPageScrolled(i, f, i2);
        }
    }

    public void onPageScrollStateChanged(int i) {
        this.state = i;
        this.fixedIndicatorView.onPageScrollStateChanged(i);
    }

    public void setItemClickable(boolean z) {
        this.fixedIndicatorView.setItemClickable(z);
    }

    public boolean isItemClickable() {
        return this.fixedIndicatorView.isItemClickable();
    }

    public int getPreSelectItem() {
        return this.fixedIndicatorView.getPreSelectItem();
    }

    public View getItemView(int i) {
        return this.fixedIndicatorView.getItemView(i);
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.isPinnedTabView) {
            int scrollX = getScrollX();
            if (this.pinnedTabView != null && scrollX > 0) {
                int save = canvas.save();
                canvas.translate((float) (scrollX + getPaddingLeft()), (float) getPaddingTop());
                if (this.pinnedTabBgDrawable != null) {
                    this.pinnedTabBgDrawable.setBounds(0, 0, this.pinnedTabView.getWidth(), this.pinnedTabView.getHeight());
                    this.pinnedTabBgDrawable.draw(canvas);
                }
                ScrollBar scrollBar = this.fixedIndicatorView.getScrollBar();
                if (scrollBar != null && scrollBar.getGravity() == Gravity.CENTENT_BACKGROUND) {
                    drawScrollBar(canvas);
                }
                this.pinnedTabView.draw(canvas);
                if (!(scrollBar == null || scrollBar.getGravity() == Gravity.CENTENT_BACKGROUND)) {
                    drawScrollBar(canvas);
                }
                canvas.translate((float) this.pinnedTabView.getWidth(), 0.0f);
                scrollX = (getHeight() - getPaddingTop()) - getPaddingBottom();
                if (this.customShadowDrawable != null) {
                    this.customShadowDrawable.setBounds(0, 0, this.shadowWidth, scrollX);
                    this.customShadowDrawable.draw(canvas);
                } else {
                    canvas.clipRect(0, 0, this.shadowWidth + dipToPix(1.0f), scrollX);
                    canvas.drawRect(0.0f, 0.0f, (float) dipToPix(1.0f), (float) scrollX, this.defaultShadowPaint);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    private void drawScrollBar(Canvas canvas) {
        ScrollBar scrollBar = this.fixedIndicatorView.getScrollBar();
        if (scrollBar != null && this.fixedIndicatorView.getCurrentItem() == 0) {
            int height;
            int save = canvas.save();
            switch (scrollBar.getGravity()) {
                case CENTENT_BACKGROUND:
                case CENTENT:
                    height = (getHeight() - scrollBar.getHeight(getHeight())) / 2;
                    break;
                case TOP:
                case TOP_FLOAT:
                    height = 0;
                    break;
                default:
                    height = getHeight() - scrollBar.getHeight(getHeight());
                    break;
            }
            int width = scrollBar.getWidth(this.pinnedTabView.getWidth());
            int height2 = scrollBar.getHeight(this.pinnedTabView.getHeight());
            scrollBar.getSlideView().measure(width, height2);
            scrollBar.getSlideView().layout(0, 0, width, height2);
            canvas.translate((float) ((this.pinnedTabView.getWidth() - width) / 2), (float) height);
            canvas.clipRect(0, 0, width, height2);
            scrollBar.getSlideView().draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    private int dipToPix(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }
}
