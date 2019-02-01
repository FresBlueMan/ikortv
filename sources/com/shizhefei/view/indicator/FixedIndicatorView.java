package com.shizhefei.view.indicator;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Scroller;
import com.shizhefei.view.indicator.Indicator.DataSetObserver;
import com.shizhefei.view.indicator.Indicator.IndicatorAdapter;
import com.shizhefei.view.indicator.Indicator.OnItemSelectedListener;
import com.shizhefei.view.indicator.Indicator.OnTransitionListener;
import com.shizhefei.view.indicator.slidebar.ScrollBar;
import com.shizhefei.view.indicator.slidebar.ScrollBar.Gravity;
import java.util.LinkedList;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class FixedIndicatorView extends LinearLayout implements Indicator {
    public static final int SPLITMETHOD_EQUALS = 0;
    public static final int SPLITMETHOD_WEIGHT = 1;
    public static final int SPLITMETHOD_WRAP = 2;
    private Bitmap cacheBitmap;
    private Canvas cacheCanvas = new Canvas();
    private Matrix cacheMatrix = new Matrix();
    private View centerView;
    private LayoutParams centerViewLayoutParams;
    private DataSetObserver dataSetObserver = new C12081();
    private InRun inRun;
    private boolean itemClickable = true;
    private IndicatorAdapter mAdapter;
    private int mPosition;
    private float mPositionOffset;
    private int mPositionOffsetPixels;
    private int mPreSelectedTabIndex = -1;
    private int mSelectedTabIndex = -1;
    private OnClickListener onClickListener = new C07822();
    private OnItemSelectedListener onItemSelectedListener;
    private OnTransitionListener onTransitionListener;
    private int[] prePositions = new int[]{-1, -1};
    private ScrollBar scrollBar;
    private int splitMethod = 0;
    private int state = 0;
    private List<ViewGroup> views = new LinkedList();

    /* renamed from: com.shizhefei.view.indicator.FixedIndicatorView$2 */
    class C07822 implements OnClickListener {
        C07822() {
        }

        public void onClick(View view) {
            if (FixedIndicatorView.this.itemClickable) {
                int intValue = ((Integer) view.getTag()).intValue();
                ViewGroup viewGroup = (ViewGroup) view;
                FixedIndicatorView.this.setCurrentItem(intValue);
                if (FixedIndicatorView.this.onItemSelectedListener != null) {
                    FixedIndicatorView.this.onItemSelectedListener.onItemSelected(viewGroup.getChildAt(0), intValue, FixedIndicatorView.this.mPreSelectedTabIndex);
                }
            }
        }
    }

    private class InRun implements Runnable {
        private final Interpolator sInterpolator = new C07841();
        private Scroller scroller;
        private int updateTime = 20;

        /* renamed from: com.shizhefei.view.indicator.FixedIndicatorView$InRun$1 */
        class C07841 implements Interpolator {
            public float getInterpolation(float f) {
                f -= 1.0f;
                return ((((f * f) * f) * f) * f) + 1.0f;
            }

            C07841() {
            }
        }

        public InRun() {
            this.scroller = new Scroller(FixedIndicatorView.this.getContext(), this.sInterpolator);
        }

        public void startScroll(int i, int i2, int i3) {
            this.scroller.startScroll(i, 0, i2 - i, 0, i3);
            ViewCompat.postInvalidateOnAnimation(FixedIndicatorView.this);
            FixedIndicatorView.this.post(this);
        }

        public boolean isFinished() {
            return this.scroller.isFinished();
        }

        public boolean computeScrollOffset() {
            return this.scroller.computeScrollOffset();
        }

        public int getCurrentX() {
            return this.scroller.getCurrX();
        }

        public void stop() {
            if (this.scroller.isFinished()) {
                this.scroller.abortAnimation();
            }
            FixedIndicatorView.this.removeCallbacks(this);
        }

        public void run() {
            ViewCompat.postInvalidateOnAnimation(FixedIndicatorView.this);
            if (!this.scroller.isFinished()) {
                FixedIndicatorView.this.postDelayed(this, (long) this.updateTime);
            }
        }
    }

    /* renamed from: com.shizhefei.view.indicator.FixedIndicatorView$1 */
    class C12081 implements DataSetObserver {
        C12081() {
        }

        public void onChange() {
            if (!FixedIndicatorView.this.inRun.isFinished()) {
                FixedIndicatorView.this.inRun.stop();
            }
            int access$100 = FixedIndicatorView.this.getTabCountInLayout();
            int count = FixedIndicatorView.this.mAdapter.getCount();
            FixedIndicatorView.this.views.clear();
            int i = 0;
            while (i < access$100 && i < count) {
                FixedIndicatorView.this.views.add((ViewGroup) FixedIndicatorView.this.getItemOutView(i));
                i++;
            }
            FixedIndicatorView.this.removeAllViews();
            access$100 = FixedIndicatorView.this.views.size();
            i = 0;
            while (i < count) {
                View childAt;
                View linearLayout = new LinearLayout(FixedIndicatorView.this.getContext());
                if (i < access$100) {
                    childAt = ((ViewGroup) FixedIndicatorView.this.views.get(i)).getChildAt(0);
                    ((ViewGroup) FixedIndicatorView.this.views.get(i)).removeView(childAt);
                    childAt = FixedIndicatorView.this.mAdapter.getView(i, childAt, linearLayout);
                } else {
                    childAt = FixedIndicatorView.this.mAdapter.getView(i, null, linearLayout);
                }
                if (FixedIndicatorView.this.onTransitionListener != null) {
                    FixedIndicatorView.this.onTransitionListener.onTransition(childAt, i, i == FixedIndicatorView.this.mSelectedTabIndex ? 1.0f : 0.0f);
                }
                linearLayout.addView(childAt);
                linearLayout.setOnClickListener(FixedIndicatorView.this.onClickListener);
                linearLayout.setTag(Integer.valueOf(i));
                FixedIndicatorView.this.addView(linearLayout, new LayoutParams(-2, -1));
                i++;
            }
            if (FixedIndicatorView.this.centerView != null) {
                FixedIndicatorView.this.setCenterView(FixedIndicatorView.this.centerView, FixedIndicatorView.this.centerViewLayoutParams);
            }
            FixedIndicatorView.this.mPreSelectedTabIndex = -1;
            FixedIndicatorView.this.setCurrentItem(FixedIndicatorView.this.mSelectedTabIndex, false);
            FixedIndicatorView.this.measureTabs();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FixedIndicatorView(android.content.Context r2) {
        /*
        r1 = this;
        r1.<init>(r2);
        r2 = -1;
        r1.mSelectedTabIndex = r2;
        r0 = 0;
        r1.splitMethod = r0;
        r1.state = r0;
        r0 = 1;
        r1.itemClickable = r0;
        r1.mPreSelectedTabIndex = r2;
        r2 = new java.util.LinkedList;
        r2.<init>();
        r1.views = r2;
        r2 = new com.shizhefei.view.indicator.FixedIndicatorView$1;
        r2.<init>();
        r1.dataSetObserver = r2;
        r2 = new com.shizhefei.view.indicator.FixedIndicatorView$2;
        r2.<init>();
        r1.onClickListener = r2;
        r2 = new android.graphics.Matrix;
        r2.<init>();
        r1.cacheMatrix = r2;
        r2 = new android.graphics.Canvas;
        r2.<init>();
        r1.cacheCanvas = r2;
        r2 = 2;
        r2 = new int[r2];
        r2 = {-1, -1};
        r1.prePositions = r2;
        r1.init();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.FixedIndicatorView.<init>(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"NewApi"})
    public FixedIndicatorView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        r0 = this;
        r0.<init>(r1, r2, r3);
        r1 = -1;
        r0.mSelectedTabIndex = r1;
        r2 = 0;
        r0.splitMethod = r2;
        r0.state = r2;
        r2 = 1;
        r0.itemClickable = r2;
        r0.mPreSelectedTabIndex = r1;
        r1 = new java.util.LinkedList;
        r1.<init>();
        r0.views = r1;
        r1 = new com.shizhefei.view.indicator.FixedIndicatorView$1;
        r1.<init>();
        r0.dataSetObserver = r1;
        r1 = new com.shizhefei.view.indicator.FixedIndicatorView$2;
        r1.<init>();
        r0.onClickListener = r1;
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r0.cacheMatrix = r1;
        r1 = new android.graphics.Canvas;
        r1.<init>();
        r0.cacheCanvas = r1;
        r1 = 2;
        r1 = new int[r1];
        r1 = {-1, -1};
        r0.prePositions = r1;
        r0.init();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.FixedIndicatorView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FixedIndicatorView(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        r0 = this;
        r0.<init>(r1, r2);
        r1 = -1;
        r0.mSelectedTabIndex = r1;
        r2 = 0;
        r0.splitMethod = r2;
        r0.state = r2;
        r2 = 1;
        r0.itemClickable = r2;
        r0.mPreSelectedTabIndex = r1;
        r1 = new java.util.LinkedList;
        r1.<init>();
        r0.views = r1;
        r1 = new com.shizhefei.view.indicator.FixedIndicatorView$1;
        r1.<init>();
        r0.dataSetObserver = r1;
        r1 = new com.shizhefei.view.indicator.FixedIndicatorView$2;
        r1.<init>();
        r0.onClickListener = r1;
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r0.cacheMatrix = r1;
        r1 = new android.graphics.Canvas;
        r1.<init>();
        r0.cacheCanvas = r1;
        r1 = 2;
        r1 = new int[r1];
        r1 = {-1, -1};
        r0.prePositions = r1;
        r0.init();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.FixedIndicatorView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void init() {
        this.inRun = new InRun();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.inRun.stop();
    }

    public void setAdapter(IndicatorAdapter indicatorAdapter) {
        if (this.mAdapter != null) {
            this.mAdapter.unRegistDataSetObserver(this.dataSetObserver);
        }
        this.mAdapter = indicatorAdapter;
        indicatorAdapter.registDataSetObserver(this.dataSetObserver);
        indicatorAdapter.notifyDataSetChanged();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 1) {
            this.centerView = getChildAt(0);
            this.centerViewLayoutParams = (LayoutParams) this.centerView.getLayoutParams();
        }
    }

    public ScrollBar getScrollBar() {
        return this.scrollBar;
    }

    public void setOnItemSelectListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public IndicatorAdapter getIndicatorAdapter() {
        return this.mAdapter;
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setItemClickable(boolean z) {
        this.itemClickable = z;
    }

    public boolean isItemClickable() {
        return this.itemClickable;
    }

    public void setCurrentItem(int i, boolean z) {
        int count = getCount();
        if (count != 0) {
            if (i < 0) {
                i = 0;
            } else {
                count--;
                if (i > count) {
                    i = count;
                }
            }
            if (this.mSelectedTabIndex != i) {
                this.mPreSelectedTabIndex = this.mSelectedTabIndex;
                this.mSelectedTabIndex = i;
                if (!this.inRun.isFinished()) {
                    this.inRun.stop();
                }
                if (this.state == 0) {
                    updateTabSelectState(i);
                    if (z && getMeasuredWidth() && getItemOutView(i).getMeasuredWidth() && this.mPreSelectedTabIndex < false && this.mPreSelectedTabIndex < getTabCountInLayout()) {
                        z = getItemOutView(this.mPreSelectedTabIndex).getLeft();
                        count = getItemOutView(i).getLeft();
                        this.inRun.startScroll(z, count, Math.min((int) (((((float) Math.abs(count - z)) / ((float) getItemOutView(i).getMeasuredWidth())) + 1065353216) * 1120403456), IjkMediaCodecInfo.RANK_LAST_CHANCE));
                    } else {
                        notifyPageScrolled(i, false, 0);
                    }
                } else if (!this.onTransitionListener) {
                    updateTabSelectState(i);
                }
            }
        }
    }

    private void updateTabSelectState(int i) {
        if (this.mAdapter != null) {
            int count = this.mAdapter.getCount();
            int i2 = 0;
            while (i2 < count) {
                View itemViewUnCheck = getItemViewUnCheck(i2);
                if (itemViewUnCheck != null) {
                    itemViewUnCheck.setSelected(i == i2);
                }
                i2++;
            }
        }
    }

    public int getCurrentItem() {
        return this.mSelectedTabIndex;
    }

    public void setSplitMethod(int i) {
        this.splitMethod = i;
        measureTabs();
    }

    public int getSplitMethod() {
        return this.splitMethod;
    }

    public void setScrollBar(ScrollBar scrollBar) {
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        if (this.scrollBar != null) {
            switch (this.scrollBar.getGravity()) {
                case BOTTOM_FLOAT:
                    paddingBottom -= scrollBar.getHeight(getHeight());
                    break;
                case TOP_FLOAT:
                    paddingTop -= scrollBar.getHeight(getHeight());
                    break;
                default:
                    break;
            }
        }
        this.scrollBar = scrollBar;
        switch (this.scrollBar.getGravity()) {
            case BOTTOM_FLOAT:
                paddingBottom += scrollBar.getHeight(getHeight());
                break;
            case TOP_FLOAT:
                paddingTop += scrollBar.getHeight(getHeight());
                break;
            default:
                break;
        }
        setPadding(getPaddingLeft(), paddingTop, getPaddingRight(), paddingBottom);
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.scrollBar != null && this.scrollBar.getGravity() == Gravity.CENTENT_BACKGROUND) {
            drawSlideBar(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.scrollBar != null && this.scrollBar.getGravity() != Gravity.CENTENT_BACKGROUND) {
            drawSlideBar(canvas);
        }
    }

    private void drawSlideBar(Canvas canvas) {
        if (this.mAdapter != null) {
            if (this.scrollBar != null) {
                int count = this.mAdapter.getCount();
                if (count == 0) {
                    this.inRun.stop();
                    return;
                } else if (getCurrentItem() >= count) {
                    setCurrentItem(count - 1);
                    this.inRun.stop();
                    return;
                } else {
                    float f;
                    float currentX;
                    int i;
                    int left;
                    switch (this.scrollBar.getGravity()) {
                        case TOP_FLOAT:
                        case TOP:
                            f = 0.0f;
                            break;
                        case CENTENT_BACKGROUND:
                        case CENTENT:
                            f = (float) ((getHeight() - this.scrollBar.getHeight(getHeight())) / 2);
                            break;
                        default:
                            f = (float) (getHeight() - this.scrollBar.getHeight(getHeight()));
                            break;
                    }
                    if (!this.inRun.isFinished() && this.inRun.computeScrollOffset()) {
                        float left2;
                        currentX = (float) this.inRun.getCurrentX();
                        View view = null;
                        i = 0;
                        while (i < count) {
                            view = getItemOutView(i);
                            if (((float) view.getLeft()) > currentX || currentX >= ((float) view.getRight())) {
                                i++;
                            } else {
                                left = (int) (currentX - ((float) view.getLeft()));
                                left2 = (currentX - ((float) view.getLeft())) / ((float) view.getWidth());
                                notifyPageScrolled(i, left2, left);
                                count = measureScrollBar(i, left2, true);
                            }
                        }
                        i = 0;
                        left = (int) (currentX - ((float) view.getLeft()));
                        left2 = (currentX - ((float) view.getLeft())) / ((float) view.getWidth());
                        notifyPageScrolled(i, left2, left);
                        count = measureScrollBar(i, left2, true);
                    } else if (this.state != 0) {
                        View itemOutView = getItemOutView(this.mPosition);
                        int width = itemOutView.getWidth();
                        currentX = (((float) width) * this.mPositionOffset) + ((float) itemOutView.getLeft());
                        notifyPageScrolled(this.mPosition, this.mPositionOffset, this.mPositionOffsetPixels);
                        count = measureScrollBar(this.mPosition, this.mPositionOffset, true);
                    } else {
                        count = measureScrollBar(this.mSelectedTabIndex, 0.0f, true);
                        View itemOutView2 = getItemOutView(this.mSelectedTabIndex);
                        if (itemOutView2 != null) {
                            currentX = (float) itemOutView2.getLeft();
                        } else {
                            return;
                        }
                    }
                    int height = this.scrollBar.getSlideView().getHeight();
                    i = this.scrollBar.getSlideView().getWidth();
                    currentX += (float) ((count - i) / 2);
                    int save = canvas.save();
                    left = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    float f2 = ((float) i) + currentX;
                    float f3 = (float) left;
                    if (f2 > f3) {
                        if (this.cacheBitmap == null || this.cacheBitmap.getWidth() < i || this.cacheBitmap.getWidth() < height) {
                            this.cacheBitmap = Bitmap.createBitmap(left, measuredHeight, Config.ARGB_8888);
                            this.cacheCanvas.setBitmap(this.cacheBitmap);
                        }
                        f2 -= f3;
                        this.cacheCanvas.save();
                        this.cacheCanvas.clipRect(0, 0, i, height);
                        this.cacheCanvas.drawColor(0, Mode.CLEAR);
                        this.scrollBar.getSlideView().draw(this.cacheCanvas);
                        this.cacheCanvas.restore();
                        left = canvas.save();
                        canvas.translate(currentX, f);
                        canvas.clipRect(0, 0, i, height);
                        canvas.drawBitmap(this.cacheBitmap, 0.0f, 0.0f, null);
                        canvas.restoreToCount(left);
                        canvas.clipRect(0.0f, 0.0f, f2, (float) height);
                        this.cacheMatrix.setTranslate(f2 - ((float) count), 0.0f);
                        canvas.drawBitmap(this.cacheBitmap, this.cacheMatrix, null);
                    } else {
                        canvas.translate(currentX, f);
                        canvas.clipRect(0, 0, i, height);
                        this.scrollBar.getSlideView().draw(canvas);
                    }
                    canvas.restoreToCount(save);
                    return;
                }
            }
        }
        this.inRun.stop();
    }

    private void notifyPageScrolled(int i, float f, int i2) {
        if (i >= 0) {
            if (i <= getCount() - 1) {
                if (this.scrollBar != null) {
                    this.scrollBar.onPageScrolled(i, f, i2);
                }
                if (this.onTransitionListener != 0) {
                    for (int i3 : this.prePositions) {
                        if (!(i3 == i || i3 == i + 1)) {
                            View itemView = getItemView(i3);
                            if (itemView != null) {
                                this.onTransitionListener.onTransition(itemView, i3, 0.0f);
                            }
                        }
                    }
                    this.prePositions[0] = i;
                    int i4 = i + 1;
                    this.prePositions[1] = i4;
                    i2 = getItemView(this.mPreSelectedTabIndex);
                    if (i2 != 0) {
                        this.onTransitionListener.onTransition(i2, this.mPreSelectedTabIndex, 0.0f);
                    }
                    i2 = getItemView(i);
                    if (i2 != 0) {
                        this.onTransitionListener.onTransition(i2, i, 1.0f - f);
                    }
                    i = getItemView(i4);
                    if (i != 0) {
                        this.onTransitionListener.onTransition(i, i4, f);
                    }
                }
            }
        }
    }

    private int measureScrollBar(int i, float f, boolean z) {
        if (this.scrollBar == null) {
            return 0;
        }
        View slideView = this.scrollBar.getSlideView();
        if (slideView.isLayoutRequested() || z) {
            z = getItemOutView(i);
            i++;
            if (i < this.mAdapter.getCount()) {
                i = getItemOutView(i);
            } else {
                i = getItemOutView(0);
            }
            if (z) {
                i = (int) ((((float) z.getWidth()) * (1.0f - f)) + (i == 0 ? 0 : ((float) i.getWidth()) * f));
                f = this.scrollBar.getWidth(i);
                z = this.scrollBar.getHeight(getHeight());
                slideView.measure(f, z);
                slideView.layout(0, 0, f, z);
                return i;
            }
        }
        return this.scrollBar.getSlideView().getWidth();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void measureTabs() {
        /*
        r6 = this;
        r0 = r6.getTabCountInLayout();
        r1 = r6.splitMethod;
        r2 = -2;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        switch(r1) {
            case 0: goto L_0x003b;
            case 1: goto L_0x0025;
            case 2: goto L_0x000e;
            default: goto L_0x000d;
        };
    L_0x000d:
        goto L_0x0052;
    L_0x000e:
        if (r4 >= r0) goto L_0x0052;
    L_0x0010:
        r1 = r6.getItemOutView(r4);
        r3 = r1.getLayoutParams();
        r3 = (android.widget.LinearLayout.LayoutParams) r3;
        r3.width = r2;
        r5 = 0;
        r3.weight = r5;
        r1.setLayoutParams(r3);
        r4 = r4 + 1;
        goto L_0x000e;
    L_0x0025:
        if (r4 >= r0) goto L_0x0052;
    L_0x0027:
        r1 = r6.getItemOutView(r4);
        r5 = r1.getLayoutParams();
        r5 = (android.widget.LinearLayout.LayoutParams) r5;
        r5.width = r2;
        r5.weight = r3;
        r1.setLayoutParams(r5);
        r4 = r4 + 1;
        goto L_0x0025;
    L_0x003b:
        r1 = 0;
    L_0x003c:
        if (r1 >= r0) goto L_0x0052;
    L_0x003e:
        r2 = r6.getItemOutView(r1);
        r5 = r2.getLayoutParams();
        r5 = (android.widget.LinearLayout.LayoutParams) r5;
        r5.width = r4;
        r5.weight = r3;
        r2.setLayoutParams(r5);
        r1 = r1 + 1;
        goto L_0x003c;
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.FixedIndicatorView.measureTabs():void");
    }

    public int getCount() {
        if (this.mAdapter == null) {
            return 0;
        }
        return this.mAdapter.getCount();
    }

    protected void measureChildren(int i, int i2) {
        super.measureChildren(i, i2);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        measureScrollBar(this.mSelectedTabIndex, 1065353216, 1);
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.mPosition = i;
        this.mPositionOffset = f;
        this.mPositionOffsetPixels = i2;
        if (this.scrollBar != null) {
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            notifyPageScrolled(i, f, i2);
        }
    }

    public void onPageScrollStateChanged(int i) {
        this.state = i;
        if (i == 0) {
            updateTabSelectState(this.mSelectedTabIndex);
        }
    }

    public void setOnTransitionListener(OnTransitionListener onTransitionListener) {
        this.onTransitionListener = onTransitionListener;
        updateTabSelectState(this.mSelectedTabIndex);
        if (this.mAdapter != null) {
            int i = 0;
            while (i < this.mAdapter.getCount()) {
                View itemView = getItemView(i);
                if (itemView != null) {
                    onTransitionListener.onTransition(itemView, i, this.mSelectedTabIndex == i ? 1.0f : 0.0f);
                }
                i++;
            }
        }
    }

    public View getItemView(int i) {
        if (i >= 0) {
            if (i <= this.mAdapter.getCount() - 1) {
                return getItemViewUnCheck(i);
            }
        }
        return 0;
    }

    private View getItemViewUnCheck(int i) {
        return ((ViewGroup) getItemOutView(i)).getChildAt(0);
    }

    private View getItemOutView(int i) {
        if (this.centerView != null && i >= (getChildCount() - 1) / 2) {
            i++;
        }
        return getChildAt(i);
    }

    public void setCenterView(View view, int i, int i2) {
        this.centerView = view;
        ViewGroup.LayoutParams layoutParams = new LayoutParams(i, i2);
        layoutParams.gravity = 16;
        setCenterView(view, layoutParams);
    }

    public void setCenterView(View view) {
        setCenterView(view, view.getLayoutParams());
    }

    public void setCenterView(View view, ViewGroup.LayoutParams layoutParams) {
        removeCenterView();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -1);
        } else {
            layoutParams = generateLayoutParams(layoutParams);
        }
        this.centerViewLayoutParams = layoutParams;
        this.centerView = view;
        addView(view, getChildCount() / 2, layoutParams);
    }

    public View getCenterView() {
        return this.centerView;
    }

    private int getTabCountInLayout() {
        if (this.centerView != null) {
            return getChildCount() - 1;
        }
        return getChildCount();
    }

    public void removeCenterView() {
        if (this.centerView != null) {
            removeView(this.centerView);
            this.centerView = null;
        }
        this.centerViewLayoutParams = null;
    }

    public OnItemSelectedListener getOnItemSelectListener() {
        return this.onItemSelectedListener;
    }

    public OnTransitionListener getOnTransitionListener() {
        return this.onTransitionListener;
    }

    public int getPreSelectItem() {
        return this.mPreSelectedTabIndex;
    }
}
