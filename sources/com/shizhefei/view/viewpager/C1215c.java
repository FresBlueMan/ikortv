package com.shizhefei.view.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: RecyclingPagerAdapter */
/* renamed from: com.shizhefei.view.viewpager.c */
public abstract class C1215c extends PagerAdapter {
    static final int IGNORE_ITEM_VIEW_TYPE = -1;
    private final C0791b recycleBin;

    public int getItemViewType(int i) {
        return 0;
    }

    public abstract View getView(int i, View view, ViewGroup viewGroup);

    public int getViewTypeCount() {
        return 1;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public C1215c() {
        this(new C0791b());
    }

    C1215c(C0791b c0791b) {
        this.recycleBin = c0791b;
        c0791b.m1441a(getViewTypeCount());
    }

    public void notifyDataSetChanged() {
        this.recycleBin.m1440a();
        super.notifyDataSetChanged();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        int itemViewType = getItemViewType(i);
        i = getView(i, itemViewType != -1 ? this.recycleBin.m1439a(i, itemViewType) : null, viewGroup);
        viewGroup.addView(i);
        return i;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        viewGroup = getItemViewType(i);
        if (viewGroup != -1) {
            this.recycleBin.m1442a(view, i, viewGroup);
        }
    }
}
