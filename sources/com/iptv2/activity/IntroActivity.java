package com.iptv2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.C0489R.drawable;
import com.iptv2.base.Activity;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.iptv2.p043b.C0597f;
import com.shizhefei.view.indicator.FixedIndicatorView;
import com.shizhefei.view.indicator.IndicatorViewPager;
import com.shizhefei.view.indicator.IndicatorViewPager.IndicatorPagerAdapter;
import com.shizhefei.view.indicator.IndicatorViewPager.IndicatorViewPagerAdapter;
import com.shizhefei.view.indicator.IndicatorViewPager.OnIndicatorPageChangeListener;

public class IntroActivity extends Activity {
    /* renamed from: a */
    private IndicatorViewPager f2478a;
    /* renamed from: b */
    private IndicatorPagerAdapter f2479b;
    /* renamed from: h */
    private View f2480h;
    /* renamed from: i */
    private View f2481i;
    /* renamed from: j */
    private boolean f2482j = false;
    /* renamed from: k */
    private boolean f2483k = true;
    /* renamed from: l */
    private String[][] f2484l;
    /* renamed from: m */
    private String[] f2485m;

    /* renamed from: com.iptv2.activity.IntroActivity$1 */
    class C05551 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ IntroActivity f589a;

        C05551(IntroActivity introActivity) {
            this.f589a = introActivity;
        }

        public void onClick(View view) {
            if (this.f589a.m3182h() == null) {
                C0591c.m790a("onClickListener...");
                this.f589a.c.f1248C.m1300a(true);
                this.f589a.m3179g();
            }
        }
    }

    /* renamed from: com.iptv2.activity.IntroActivity$a */
    private static class C0556a {
        private C0556a() {
        }
    }

    /* renamed from: com.iptv2.activity.IntroActivity$3 */
    class C10623 implements OnIndicatorPageChangeListener {
        /* renamed from: a */
        final /* synthetic */ IntroActivity f1875a;

        C10623(IntroActivity introActivity) {
            this.f1875a = introActivity;
        }

        public void onIndicatorPageChange(int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onIndicatorPageChange [");
            stringBuilder.append(i2);
            stringBuilder.append("]->[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            C0591c.m790a(stringBuilder.toString());
            boolean z = i2 > 0;
            boolean z2 = i2 < this.f1875a.f2485m.length - 1;
            if (this.f1875a.f2482j != z) {
                this.f1875a.f2482j = z;
                if (z) {
                    ViewAnimator.animate(this.f1875a.f2480h).translationX((float) (this.f1875a.f2480h.getWidth() / 3), 0.0f).fadeIn().duration(300).start();
                } else {
                    ViewAnimator.animate(this.f1875a.f2480h).translationX(0.0f, (float) ((-this.f1875a.f2480h.getWidth()) / 3)).fadeOut().duration(300).start();
                }
            }
            if (this.f1875a.f2483k != z2) {
                this.f1875a.f2483k = z2;
                if (z2) {
                    ViewAnimator.animate(new View[]{this.f1875a.f2481i}).translationX((float) ((-this.f1875a.f2481i.getWidth()) / 3), 0.0f).fadeIn().duration(300).start();
                } else {
                    ViewAnimator.animate(new View[]{this.f1875a.f2481i}).translationX(0.0f, (float) (this.f1875a.f2481i.getWidth() / 3)).fadeOut().duration(300).start();
                }
            }
        }
    }

    /* renamed from: com.iptv2.activity.IntroActivity$b */
    private static class C1063b extends C0556a {
        /* renamed from: a */
        private ImageView f1876a;

        public C1063b(View view) {
            super();
            this.f1876a = (ImageView) view.findViewById(R.id.image);
        }

        /* renamed from: a */
        public void m2266a(String str) {
            this.f1876a.setImageResource(C0595e.m802a(str, drawable.class));
        }
    }

    public IntroActivity() {
        String[][] strArr = new String[5][];
        strArr[0] = new String[]{"activity_intro_page1_image", "activity_intro_page1_text"};
        strArr[1] = new String[]{"activity_intro_page2_image", "activity_intro_page2_text"};
        strArr[2] = new String[]{"activity_intro_page3_image", "activity_intro_page3_text"};
        strArr[3] = new String[]{"activity_intro_page4_image", "activity_intro_page4_text"};
        strArr[4] = new String[]{"activity_intro_page5_image", "activity_intro_page5_text"};
        this.f2484l = strArr;
        this.f2485m = new String[]{"activity_intro_0", "activity_intro_1", "activity_intro_2", "activity_intro_3"};
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_intro);
        this.f2480h = findViewById(R.id.arrow_left);
        this.f2481i = findViewById(R.id.arrow_right);
        m3173b();
    }

    /* renamed from: b */
    private void m3173b() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        FixedIndicatorView fixedIndicatorView = (FixedIndicatorView) findViewById(R.id.indicator);
        C0597f.m819a(viewPager, 1000);
        this.f2478a = new IndicatorViewPager(fixedIndicatorView, viewPager);
        final OnClickListener c05551 = new C05551(this);
        this.f2479b = new IndicatorViewPagerAdapter(this) {
            /* renamed from: b */
            final /* synthetic */ IntroActivity f2304b;

            public int getCount() {
                return this.f2304b.f2485m.length;
            }

            public View getViewForTab(int i, View view, ViewGroup viewGroup) {
                return view == null ? this.f2304b.c.f1264l.inflate(R.layout.activity_intro_indicator_item, viewGroup, false) : view;
            }

            public View getViewForPage(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = this.f2304b.c.f1264l.inflate(R.layout.activity_intro_page_item_ko, viewGroup, false);
                    viewGroup = new C1063b(view);
                    view.setFocusable(false);
                    view.setOnClickListener(c05551);
                    view.setTag(viewGroup);
                } else {
                    viewGroup = (C0556a) view.getTag();
                }
                ((C1063b) viewGroup).m2266a(this.f2304b.f2485m[i]);
                return view;
            }
        };
        this.f2478a.setAdapter(this.f2479b);
        this.f2478a.setOnIndicatorPageChangeListener(new C10623(this));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("keyCode:");
        stringBuilder.append(i);
        C0591c.m790a(stringBuilder.toString());
        if (i != 23) {
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        if (m3182h() == 0) {
            this.c.f1248C.m1300a(false);
            m3179g();
        }
        return false;
    }

    /* renamed from: g */
    private void m3179g() {
        finish();
        startActivity(new Intent(this, WelcomeActivity.class));
    }

    /* renamed from: h */
    private boolean m3182h() {
        int currentItem = this.f2478a.getCurrentItem();
        if (currentItem >= this.f2485m.length - 1) {
            return false;
        }
        this.f2478a.setCurrentItem(currentItem + 1, true);
        return true;
    }
}
