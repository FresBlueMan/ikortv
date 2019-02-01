package com.shizhefei.view.indicator;

import android.view.View;
import android.view.ViewGroup;
import com.shizhefei.view.indicator.slidebar.ScrollBar;
import java.util.LinkedHashSet;
import java.util.Set;

public interface Indicator {

    public interface DataSetObserver {
        void onChange();
    }

    public static abstract class IndicatorAdapter {
        private Set<DataSetObserver> observers = new LinkedHashSet(2);

        public abstract int getCount();

        public abstract View getView(int i, View view, ViewGroup viewGroup);

        public void notifyDataSetChanged() {
            for (DataSetObserver onChange : this.observers) {
                onChange.onChange();
            }
        }

        public void registDataSetObserver(DataSetObserver dataSetObserver) {
            this.observers.add(dataSetObserver);
        }

        public void unRegistDataSetObserver(DataSetObserver dataSetObserver) {
            this.observers.remove(dataSetObserver);
        }
    }

    public interface OnItemSelectedListener {
        void onItemSelected(View view, int i, int i2);
    }

    public interface OnTransitionListener {
        void onTransition(View view, int i, float f);
    }

    int getCurrentItem();

    IndicatorAdapter getIndicatorAdapter();

    View getItemView(int i);

    OnItemSelectedListener getOnItemSelectListener();

    OnTransitionListener getOnTransitionListener();

    int getPreSelectItem();

    boolean isItemClickable();

    void onPageScrollStateChanged(int i);

    void onPageScrolled(int i, float f, int i2);

    void setAdapter(IndicatorAdapter indicatorAdapter);

    void setCurrentItem(int i);

    void setCurrentItem(int i, boolean z);

    void setItemClickable(boolean z);

    void setOnItemSelectListener(OnItemSelectedListener onItemSelectedListener);

    void setOnTransitionListener(OnTransitionListener onTransitionListener);

    void setScrollBar(ScrollBar scrollBar);
}
