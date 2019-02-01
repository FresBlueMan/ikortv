package com.shizhefei.view.indicator;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.shizhefei.view.indicator.Indicator.IndicatorAdapter;
import com.shizhefei.view.indicator.Indicator.OnItemSelectedListener;
import com.shizhefei.view.indicator.Indicator.OnTransitionListener;
import com.shizhefei.view.indicator.slidebar.ScrollBar;
import com.shizhefei.view.indicator.slidebar.ScrollBar.Gravity;

public class RecyclerIndicatorView extends RecyclerView implements Indicator {
    private IndicatorAdapter adapter;
    private boolean itemClickable = true;
    private LinearLayoutManager linearLayoutManager;
    private OnItemSelectedListener onItemSelectedListener;
    private OnTransitionListener onTransitionListener;
    private int pageScrollPosition;
    private int pageScrollState;
    private float positionOffset;
    private int positionOffsetPixels;
    private int[] prePositions = new int[]{-1, -1};
    private int preSelectItem;
    private ProxyAdapter proxyAdapter;
    private ScrollBar scrollBar;
    private int selectItem;
    private int unScrollPosition = -1;

    private class ProxyAdapter extends Adapter<ViewHolder> {
        private IndicatorAdapter adapter;
        private OnClickListener onClickListener = new C07862();

        /* renamed from: com.shizhefei.view.indicator.RecyclerIndicatorView$ProxyAdapter$2 */
        class C07862 implements OnClickListener {
            C07862() {
            }

            public void onClick(View view) {
                if (RecyclerIndicatorView.this.itemClickable) {
                    RecyclerIndicatorView.this.setCurrentItem(((Integer) view.getTag()).intValue(), true);
                }
            }
        }

        public int getItemViewType(int i) {
            return 1;
        }

        public ProxyAdapter(IndicatorAdapter indicatorAdapter) {
            this.adapter = indicatorAdapter;
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            i = new LinearLayout(viewGroup.getContext());
            i.setLayoutParams(new LayoutParams(-2, -1));
            return new ViewHolder(i) {
            };
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            LinearLayout linearLayout = (LinearLayout) viewHolder.itemView;
            View childAt = linearLayout.getChildAt(0);
            linearLayout.removeAllViews();
            linearLayout.addView(this.adapter.getView(i, childAt, linearLayout));
            linearLayout.setTag(Integer.valueOf(i));
            linearLayout.setOnClickListener(this.onClickListener);
        }

        public void onViewAttachedToWindow(ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            int layoutPosition = viewHolder.getLayoutPosition();
            boolean z = false;
            viewHolder = ((LinearLayout) viewHolder.itemView).getChildAt(0);
            if (RecyclerIndicatorView.this.selectItem == layoutPosition) {
                z = true;
            }
            viewHolder.setSelected(z);
            if (RecyclerIndicatorView.this.onTransitionListener == null) {
                return;
            }
            if (RecyclerIndicatorView.this.selectItem == layoutPosition) {
                RecyclerIndicatorView.this.onTransitionListener.onTransition(viewHolder, layoutPosition, 1.0f);
            } else {
                RecyclerIndicatorView.this.onTransitionListener.onTransition(viewHolder, layoutPosition, 0.0f);
            }
        }

        public int getItemCount() {
            return this.adapter.getCount();
        }
    }

    public OnTransitionListener getOnTransitionListener() {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerIndicatorView(android.content.Context r1) {
        /*
        r0 = this;
        r0.<init>(r1);
        r1 = -1;
        r0.unScrollPosition = r1;
        r1 = 2;
        r1 = new int[r1];
        r1 = {-1, -1};
        r0.prePositions = r1;
        r1 = 1;
        r0.itemClickable = r1;
        r0.init();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.RecyclerIndicatorView.<init>(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerIndicatorView(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        r0 = this;
        r0.<init>(r1, r2);
        r1 = -1;
        r0.unScrollPosition = r1;
        r1 = 2;
        r1 = new int[r1];
        r1 = {-1, -1};
        r0.prePositions = r1;
        r1 = 1;
        r0.itemClickable = r1;
        r0.init();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.RecyclerIndicatorView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerIndicatorView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        r0 = this;
        r0.<init>(r1, r2, r3);
        r1 = -1;
        r0.unScrollPosition = r1;
        r1 = 2;
        r1 = new int[r1];
        r1 = {-1, -1};
        r0.prePositions = r1;
        r1 = 1;
        r0.itemClickable = r1;
        r0.init();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shizhefei.view.indicator.RecyclerIndicatorView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void init() {
        LayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.linearLayoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
    }

    public void setAdapter(IndicatorAdapter indicatorAdapter) {
        this.adapter = indicatorAdapter;
        this.proxyAdapter = new ProxyAdapter(indicatorAdapter);
        setAdapter(this.proxyAdapter);
    }

    public void setOnItemSelectListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public OnItemSelectedListener getOnItemSelectListener() {
        return this.onItemSelectedListener;
    }

    public void setOnTransitionListener(OnTransitionListener onTransitionListener) {
        this.onTransitionListener = onTransitionListener;
        updateSelectTab(this.selectItem);
        updateTabTransition(this.selectItem);
    }

    public void setScrollBar(ScrollBar scrollBar) {
        this.scrollBar = scrollBar;
    }

    public IndicatorAdapter getIndicatorAdapter() {
        return this.adapter;
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        this.preSelectItem = this.selectItem;
        this.selectItem = i;
        if (!this.pageScrollState) {
            scrollToTab(i, false);
            updateSelectTab(i);
            this.unScrollPosition = i;
        } else if (!this.onItemSelectedListener) {
            updateSelectTab(i);
        }
        if (this.onItemSelectedListener) {
            this.onItemSelectedListener.onItemSelected(getItemView(i), this.selectItem, this.preSelectItem);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.adapter != 0 && this.adapter.getCount() > 0) {
            scrollToTab(this.selectItem, 0);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.unScrollPosition) {
            this.linearLayoutManager.findViewByPosition(this.unScrollPosition);
            scrollToTab(this.unScrollPosition, 0);
            this.unScrollPosition = -1;
        }
    }

    private void smoothScrollToPosition(int i, final int i2) {
        SmoothScroller c13141 = new LinearSmoothScroller(getContext()) {
            public PointF computeScrollVectorForPosition(int i) {
                i = RecyclerIndicatorView.this.linearLayoutManager.computeScrollVectorForPosition(i);
                i.x += (float) i2;
                return i;
            }
        };
        c13141.setTargetPosition(i);
        this.linearLayoutManager.startSmoothScroll(c13141);
    }

    private void updateSelectTab(int i) {
        View itemView = getItemView(this.preSelectItem);
        if (itemView != null) {
            itemView.setSelected(false);
        }
        i = getItemView(i);
        if (i != 0) {
            i.setSelected(true);
        }
    }

    private void updateTabTransition(int i) {
        if (this.onTransitionListener != null) {
            View itemView = getItemView(this.preSelectItem);
            if (itemView != null) {
                this.onTransitionListener.onTransition(itemView, this.preSelectItem, 0.0f);
            }
            itemView = getItemView(i);
            if (itemView != null) {
                this.onTransitionListener.onTransition(itemView, i, 1.0f);
            }
        }
    }

    protected void scrollToTab(int i, float f) {
        int measuredWidth;
        View findViewByPosition = this.linearLayoutManager.findViewByPosition(i);
        int i2 = i + 1;
        View findViewByPosition2 = this.linearLayoutManager.findViewByPosition(i2);
        if (findViewByPosition != null) {
            float measuredWidth2 = ((float) getMeasuredWidth()) / 2.0f;
            float measuredWidth3 = measuredWidth2 - (((float) findViewByPosition.getMeasuredWidth()) / 2.0f);
            if (findViewByPosition2 != null) {
                measuredWidth = (int) (measuredWidth3 - (((((float) findViewByPosition.getMeasuredWidth()) - (measuredWidth2 - (((float) findViewByPosition2.getMeasuredWidth()) / 2.0f))) + measuredWidth3) * f));
            } else {
                measuredWidth = (int) measuredWidth3;
            }
        } else {
            measuredWidth = 0;
        }
        if (this.onTransitionListener != null) {
            for (int i3 : this.prePositions) {
                View itemView = getItemView(i3);
                if (!(i3 == i || i3 == i2 || itemView == null)) {
                    this.onTransitionListener.onTransition(itemView, i3, 0.0f);
                }
            }
            findViewByPosition2 = getItemView(this.preSelectItem);
            if (findViewByPosition2 != null) {
                this.onTransitionListener.onTransition(findViewByPosition2, this.preSelectItem, 0.0f);
            }
            this.linearLayoutManager.scrollToPositionWithOffset(i, measuredWidth);
            findViewByPosition = getItemView(i);
            if (findViewByPosition != null) {
                this.onTransitionListener.onTransition(findViewByPosition, i, 1.0f - f);
                this.prePositions[0] = i;
            }
            i = getItemView(i2);
            if (i != 0) {
                this.onTransitionListener.onTransition(i, i2, f);
                this.prePositions[1] = i2;
            }
        }
    }

    public View getItemView(int i) {
        LinearLayout linearLayout = (LinearLayout) this.linearLayoutManager.findViewByPosition(i);
        return linearLayout != null ? linearLayout.getChildAt(0) : linearLayout;
    }

    public int getCurrentItem() {
        return this.selectItem;
    }

    public int getPreSelectItem() {
        return this.preSelectItem;
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.positionOffsetPixels = i2;
        this.pageScrollPosition = i;
        this.positionOffset = f;
        if (this.scrollBar != null) {
            this.scrollBar.onPageScrolled(this.pageScrollPosition, f, i2);
        }
        scrollToTab(i, f);
    }

    public void onPageScrollStateChanged(int i) {
        this.pageScrollState = i;
    }

    public void setItemClickable(boolean z) {
        this.itemClickable = z;
    }

    public boolean isItemClickable() {
        return this.itemClickable;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.scrollBar != null && this.scrollBar.getGravity() == Gravity.CENTENT_BACKGROUND) {
            drawSlideBar(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.scrollBar != null && this.scrollBar.getGravity() != Gravity.CENTENT_BACKGROUND) {
            drawSlideBar(canvas);
        }
    }

    private void drawSlideBar(Canvas canvas) {
        if (this.proxyAdapter != null) {
            if (this.scrollBar != null) {
                if (this.proxyAdapter.getItemCount() != 0) {
                    int height;
                    int measureScrollBar;
                    float left;
                    switch (this.scrollBar.getGravity()) {
                        case CENTENT_BACKGROUND:
                        case CENTENT:
                            height = (getHeight() - this.scrollBar.getHeight(getHeight())) / 2;
                            break;
                        case TOP:
                        case TOP_FLOAT:
                            height = 0;
                            break;
                        default:
                            height = getHeight() - this.scrollBar.getHeight(getHeight());
                            break;
                    }
                    View findViewByPosition;
                    if (this.pageScrollState == 0) {
                        findViewByPosition = this.linearLayoutManager.findViewByPosition(this.selectItem);
                        measureScrollBar = measureScrollBar(this.selectItem, 0.0f, true);
                        if (findViewByPosition != null) {
                            left = (float) findViewByPosition.getLeft();
                        } else {
                            return;
                        }
                    }
                    findViewByPosition = this.linearLayoutManager.findViewByPosition(this.pageScrollPosition);
                    measureScrollBar = measureScrollBar(this.pageScrollPosition, this.positionOffset, true);
                    if (findViewByPosition != null) {
                        left = (((float) findViewByPosition.getMeasuredWidth()) * this.positionOffset) + ((float) findViewByPosition.getLeft());
                    } else {
                        return;
                    }
                    int width = this.scrollBar.getSlideView().getWidth();
                    left += (float) ((measureScrollBar - width) / 2);
                    measureScrollBar = canvas.save();
                    canvas.translate(left, (float) height);
                    canvas.clipRect(0, 0, width, this.scrollBar.getSlideView().getHeight());
                    this.scrollBar.getSlideView().draw(canvas);
                    canvas.restoreToCount(measureScrollBar);
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
            z = this.linearLayoutManager.findViewByPosition(i);
            i = this.linearLayoutManager.findViewByPosition(i + 1);
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
}
