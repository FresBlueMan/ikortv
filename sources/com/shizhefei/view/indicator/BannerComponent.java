package com.shizhefei.view.indicator;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.shizhefei.view.indicator.Indicator.OnItemSelectedListener;
import com.shizhefei.view.indicator.IndicatorViewPager.IndicatorPagerAdapter;
import com.shizhefei.view.viewpager.C0790a;
import com.shizhefei.view.viewpager.SViewPager;
import java.lang.reflect.Field;

public class BannerComponent extends IndicatorViewPager {
    private final Handler handler = new AutoPlayHandler(Looper.getMainLooper());
    private boolean isRunning;
    private LoopAdapter mAdapter;
    private OnTouchListener onTouchListener = new C07813();
    private C0790a scroller;
    private long time = 3000;

    /* renamed from: com.shizhefei.view.indicator.BannerComponent$3 */
    class C07813 implements OnTouchListener {
        C07813() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            view = motionEvent.getAction();
            if (view != 3) {
                switch (view) {
                    case null:
                        BannerComponent.this.handler.removeCallbacksAndMessages(null);
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            if (BannerComponent.this.isRunning != null) {
                BannerComponent.this.handler.removeCallbacksAndMessages(null);
                BannerComponent.this.handler.sendEmptyMessageDelayed(1, BannerComponent.this.time);
            }
            return null;
        }
    }

    private class AutoPlayHandler extends Handler {
        public AutoPlayHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            BannerComponent.this.viewPager.setCurrentItem(BannerComponent.this.viewPager.getCurrentItem() + 1, true);
            if (BannerComponent.this.isRunning != null) {
                BannerComponent.this.handler.sendEmptyMessageDelayed(1, BannerComponent.this.time);
            }
        }
    }

    /* renamed from: com.shizhefei.view.indicator.BannerComponent$1 */
    class C12061 implements OnItemSelectedListener {
        C12061() {
        }

        public void onItemSelected(View view, int i, int i2) {
            if ((BannerComponent.this.viewPager instanceof SViewPager) != null) {
                BannerComponent.this.setCurrentItem(i, ((SViewPager) BannerComponent.this.viewPager).m2523a());
            } else {
                BannerComponent.this.setCurrentItem(i, 1);
            }
        }
    }

    /* renamed from: com.shizhefei.view.indicator.BannerComponent$2 */
    class C12072 implements OnPageChangeListener {
        C12072() {
        }

        public void onPageSelected(int i) {
            BannerComponent.this.indicatorView.setCurrentItem(BannerComponent.this.mAdapter.getRealPosition(i), true);
            if (BannerComponent.this.onIndicatorPageChangeListener != null) {
                BannerComponent.this.onIndicatorPageChangeListener.onIndicatorPageChange(BannerComponent.this.indicatorView.getPreSelectItem(), BannerComponent.this.mAdapter.getRealPosition(i));
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            BannerComponent.this.indicatorView.onPageScrolled(BannerComponent.this.mAdapter.getRealPosition(i), f, i2);
        }

        public void onPageScrollStateChanged(int i) {
            BannerComponent.this.indicatorView.onPageScrollStateChanged(i);
        }
    }

    public BannerComponent(Indicator indicator, ViewPager viewPager, boolean z) {
        super(indicator, viewPager, z);
        viewPager.setOnTouchListener(this.onTouchListener);
        initViewPagerScroll();
    }

    private void initViewPagerScroll() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.scroller = new C0790a(this.viewPager.getContext());
            declaredField.set(this.viewPager, this.scroller);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
    }

    public void setScrollDuration(int i) {
        if (this.scroller != null) {
            this.scroller.m1436a(i);
        }
    }

    protected void iniOnItemSelectedListener() {
        this.indicatorView.setOnItemSelectListener(new C12061());
    }

    protected void iniOnPageChangeListener() {
        this.viewPager.addOnPageChangeListener(new C12072());
    }

    public void setCurrentItem(int i, boolean z) {
        int count = this.mAdapter.getCount();
        if (count > 0) {
            int currentItem = this.viewPager.getCurrentItem();
            int realPosition = this.mAdapter.getRealPosition(currentItem);
            if (i > realPosition) {
                realPosition = (i - realPosition) % count;
            } else {
                realPosition = -((realPosition - i) % count);
            }
            if (Math.abs(realPosition) > this.viewPager.getOffscreenPageLimit() && this.viewPager.getOffscreenPageLimit() != count) {
                this.viewPager.setOffscreenPageLimit(count);
            }
            this.viewPager.setCurrentItem(currentItem + realPosition, z);
            this.indicatorView.setCurrentItem(i, z);
        }
    }

    public void setAdapter(IndicatorPagerAdapter indicatorPagerAdapter) {
        if (indicatorPagerAdapter instanceof LoopAdapter) {
            this.mAdapter = (LoopAdapter) indicatorPagerAdapter;
            this.mAdapter.setLoop(true);
            super.setAdapter(indicatorPagerAdapter);
            indicatorPagerAdapter = this.mAdapter.getCount();
            int i = 1073741823;
            if (indicatorPagerAdapter > null) {
                i = 1073741823 - (1073741823 % indicatorPagerAdapter);
            }
            this.viewPager.setCurrentItem(i, false);
            return;
        }
        throw new RuntimeException("请设置继承于IndicatorViewPagerAdapter或者IndicatorViewPagerAdapter的adapter");
    }

    public void setAutoPlayTime(long j) {
        this.time = j;
    }

    public void startAutoPlay() {
        this.isRunning = true;
        this.handler.removeCallbacksAndMessages(null);
        this.handler.sendEmptyMessageDelayed(1, this.time);
    }

    public void stopAutoPlay() {
        this.isRunning = false;
        this.handler.removeCallbacksAndMessages(null);
    }
}
