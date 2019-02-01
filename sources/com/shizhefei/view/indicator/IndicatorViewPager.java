package com.shizhefei.view.indicator;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.ViewGroup;
import com.shizhefei.view.indicator.Indicator.IndicatorAdapter;
import com.shizhefei.view.indicator.Indicator.OnItemSelectedListener;
import com.shizhefei.view.indicator.Indicator.OnTransitionListener;
import com.shizhefei.view.indicator.slidebar.ScrollBar;
import com.shizhefei.view.viewpager.C1215c;
import com.shizhefei.view.viewpager.SViewPager;

public class IndicatorViewPager {
    private IndicatorPagerAdapter adapter;
    private final boolean indicatorClickable;
    protected Indicator indicatorView;
    protected OnIndicatorPageChangeListener onIndicatorPageChangeListener;
    protected ViewPager viewPager;

    public interface IndicatorPagerAdapter {
        IndicatorAdapter getIndicatorAdapter();

        PagerAdapter getPagerAdapter();

        void notifyDataSetChanged();
    }

    public interface OnIndicatorPageChangeListener {
        void onIndicatorPageChange(int i, int i2);
    }

    /* renamed from: com.shizhefei.view.indicator.IndicatorViewPager$1 */
    class C12091 implements OnItemSelectedListener {
        C12091() {
        }

        public void onItemSelected(View view, int i, int i2) {
            if ((IndicatorViewPager.this.viewPager instanceof SViewPager) != null) {
                IndicatorViewPager.this.viewPager.setCurrentItem(i, ((SViewPager) IndicatorViewPager.this.viewPager).m2523a());
            } else {
                IndicatorViewPager.this.viewPager.setCurrentItem(i, 1);
            }
        }
    }

    /* renamed from: com.shizhefei.view.indicator.IndicatorViewPager$2 */
    class C12102 implements OnPageChangeListener {
        C12102() {
        }

        public void onPageSelected(int i) {
            IndicatorViewPager.this.indicatorView.setCurrentItem(i, true);
            if (IndicatorViewPager.this.onIndicatorPageChangeListener != null) {
                IndicatorViewPager.this.onIndicatorPageChangeListener.onIndicatorPageChange(IndicatorViewPager.this.indicatorView.getPreSelectItem(), i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            IndicatorViewPager.this.indicatorView.onPageScrolled(i, f, i2);
        }

        public void onPageScrollStateChanged(int i) {
            IndicatorViewPager.this.indicatorView.onPageScrollStateChanged(i);
        }
    }

    static abstract class LoopAdapter implements IndicatorPagerAdapter {
        abstract int getCount();

        abstract int getRealPosition(int i);

        abstract void setLoop(boolean z);

        LoopAdapter() {
        }
    }

    public static abstract class IndicatorFragmentPagerAdapter extends LoopAdapter {
        private IndicatorAdapter indicatorAdapter = new C12112();
        private boolean loop;
        private FragmentListPageAdapter pagerAdapter;

        /* renamed from: com.shizhefei.view.indicator.IndicatorViewPager$IndicatorFragmentPagerAdapter$2 */
        class C12112 extends IndicatorAdapter {
            C12112() {
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                return IndicatorFragmentPagerAdapter.this.getViewForTab(i, view, viewGroup);
            }

            public int getCount() {
                return IndicatorFragmentPagerAdapter.this.getCount();
            }
        }

        public abstract int getCount();

        public abstract Fragment getFragmentForPage(int i);

        public int getItemPosition(Object obj) {
            return -1;
        }

        public float getPageRatio(int i) {
            return 1.0f;
        }

        public abstract View getViewForTab(int i, View view, ViewGroup viewGroup);

        int getRealPosition(int i) {
            return i % getCount();
        }

        void setLoop(boolean z) {
            this.loop = z;
        }

        public IndicatorFragmentPagerAdapter(FragmentManager fragmentManager) {
            this.pagerAdapter = new FragmentListPageAdapter(fragmentManager) {
                public int getCount() {
                    if (IndicatorFragmentPagerAdapter.this.loop) {
                        return 2147483547;
                    }
                    return IndicatorFragmentPagerAdapter.this.getCount();
                }

                public Fragment getItem(int i) {
                    return IndicatorFragmentPagerAdapter.this.getFragmentForPage(IndicatorFragmentPagerAdapter.this.getRealPosition(i));
                }

                public float getPageWidth(int i) {
                    return IndicatorFragmentPagerAdapter.this.getPageRatio(IndicatorFragmentPagerAdapter.this.getRealPosition(i));
                }

                public int getItemPosition(Object obj) {
                    return IndicatorFragmentPagerAdapter.this.getItemPosition(obj);
                }
            };
        }

        public Fragment getExitFragment(int i) {
            return this.pagerAdapter.getExitFragment(i);
        }

        public Fragment getCurrentFragment() {
            return this.pagerAdapter.getCurrentFragment();
        }

        public void notifyDataSetChanged() {
            this.indicatorAdapter.notifyDataSetChanged();
            this.pagerAdapter.notifyDataSetChanged();
        }

        public PagerAdapter getPagerAdapter() {
            return this.pagerAdapter;
        }

        public IndicatorAdapter getIndicatorAdapter() {
            return this.indicatorAdapter;
        }
    }

    public static abstract class IndicatorViewPagerAdapter extends LoopAdapter {
        private IndicatorAdapter indicatorAdapter = new C12122();
        private boolean loop;
        private C1215c pagerAdapter = new C13131();

        /* renamed from: com.shizhefei.view.indicator.IndicatorViewPager$IndicatorViewPagerAdapter$2 */
        class C12122 extends IndicatorAdapter {
            C12122() {
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                return IndicatorViewPagerAdapter.this.getViewForTab(i, view, viewGroup);
            }

            public int getCount() {
                return IndicatorViewPagerAdapter.this.getCount();
            }
        }

        /* renamed from: com.shizhefei.view.indicator.IndicatorViewPager$IndicatorViewPagerAdapter$1 */
        class C13131 extends C1215c {
            C13131() {
            }

            public int getCount() {
                if (IndicatorViewPagerAdapter.this.loop) {
                    return 2147483547;
                }
                return IndicatorViewPagerAdapter.this.getCount();
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                return IndicatorViewPagerAdapter.this.getViewForPage(IndicatorViewPagerAdapter.this.getRealPosition(i), view, viewGroup);
            }

            public float getPageWidth(int i) {
                return IndicatorViewPagerAdapter.this.getPageRatio(IndicatorViewPagerAdapter.this.getRealPosition(i));
            }

            public int getItemPosition(Object obj) {
                return IndicatorViewPagerAdapter.this.getItemPosition(obj);
            }

            public int getItemViewType(int i) {
                return IndicatorViewPagerAdapter.this.getPageViewType(IndicatorViewPagerAdapter.this.getRealPosition(i));
            }

            public int getViewTypeCount() {
                return IndicatorViewPagerAdapter.this.getPageViewTypeCount();
            }
        }

        public abstract int getCount();

        public int getItemPosition(Object obj) {
            return -1;
        }

        public float getPageRatio(int i) {
            return 1.0f;
        }

        public int getPageViewType(int i) {
            return 0;
        }

        public int getPageViewTypeCount() {
            return 1;
        }

        public abstract View getViewForPage(int i, View view, ViewGroup viewGroup);

        public abstract View getViewForTab(int i, View view, ViewGroup viewGroup);

        int getRealPosition(int i) {
            if (getCount() == 0) {
                return 0;
            }
            return i % getCount();
        }

        void setLoop(boolean z) {
            this.loop = z;
        }

        public void notifyDataSetChanged() {
            this.indicatorAdapter.notifyDataSetChanged();
            this.pagerAdapter.notifyDataSetChanged();
        }

        public PagerAdapter getPagerAdapter() {
            return this.pagerAdapter;
        }

        public IndicatorAdapter getIndicatorAdapter() {
            return this.indicatorAdapter;
        }
    }

    public IndicatorViewPager(Indicator indicator, ViewPager viewPager) {
        this(indicator, viewPager, true);
    }

    public IndicatorViewPager(Indicator indicator, ViewPager viewPager, boolean z) {
        this.indicatorClickable = z;
        this.indicatorView = indicator;
        this.viewPager = viewPager;
        indicator.setItemClickable(z);
        iniOnItemSelectedListener();
        iniOnPageChangeListener();
    }

    protected void iniOnItemSelectedListener() {
        this.indicatorView.setOnItemSelectListener(new C12091());
    }

    protected void iniOnPageChangeListener() {
        this.viewPager.addOnPageChangeListener(new C12102());
    }

    public void setAdapter(IndicatorPagerAdapter indicatorPagerAdapter) {
        this.adapter = indicatorPagerAdapter;
        this.viewPager.setAdapter(indicatorPagerAdapter.getPagerAdapter());
        this.indicatorView.setAdapter(indicatorPagerAdapter.getIndicatorAdapter());
    }

    public void setCurrentItem(int i, boolean z) {
        this.viewPager.setCurrentItem(i, z);
        this.indicatorView.setCurrentItem(i, z);
    }

    public void setOnIndicatorPageChangeListener(OnIndicatorPageChangeListener onIndicatorPageChangeListener) {
        this.onIndicatorPageChangeListener = onIndicatorPageChangeListener;
    }

    public void setIndicatorOnTransitionListener(OnTransitionListener onTransitionListener) {
        this.indicatorView.setOnTransitionListener(onTransitionListener);
    }

    public void setIndicatorScrollBar(ScrollBar scrollBar) {
        this.indicatorView.setScrollBar(scrollBar);
    }

    public void setPageOffscreenLimit(int i) {
        this.viewPager.setOffscreenPageLimit(i);
    }

    public void setPageMargin(int i) {
        this.viewPager.setPageMargin(i);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.viewPager.setPageMarginDrawable(drawable);
    }

    public void setPageMarginDrawable(int i) {
        this.viewPager.setPageMarginDrawable(i);
    }

    public int getPreSelectItem() {
        return this.indicatorView.getPreSelectItem();
    }

    public int getCurrentItem() {
        return this.indicatorView.getCurrentItem();
    }

    public IndicatorPagerAdapter getAdapter() {
        return this.adapter;
    }

    public OnIndicatorPageChangeListener getOnIndicatorPageChangeListener() {
        return this.onIndicatorPageChangeListener;
    }

    public Indicator getIndicatorView() {
        return this.indicatorView;
    }

    public ViewPager getViewPager() {
        return this.viewPager;
    }

    public void notifyDataSetChanged() {
        if (this.adapter != null) {
            this.adapter.notifyDataSetChanged();
        }
    }
}
