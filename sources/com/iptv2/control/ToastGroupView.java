package com.iptv2.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.AnimationListener.Update;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.LinearLayout;
import com.iptv2.core.Application;
import com.iptv2.core.C0730c;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;

public class ToastGroupView extends LinearLayout {
    /* renamed from: a */
    private C0730c f2052a;
    /* renamed from: b */
    private int f2053b;
    /* renamed from: c */
    private int f2054c;
    /* renamed from: d */
    private int f2055d;

    /* renamed from: com.iptv2.control.ToastGroupView$a */
    public class C0691a {
        /* renamed from: a */
        final /* synthetic */ ToastGroupView f1056a;
        /* renamed from: b */
        private View f1057b;
        /* renamed from: c */
        private TextView f1058c;
        /* renamed from: d */
        private boolean f1059d = false;
        /* renamed from: e */
        private ViewAnimator f1060e;
        /* renamed from: f */
        private Runnable f1061f = new C06901(this);

        /* renamed from: com.iptv2.control.ToastGroupView$a$1 */
        class C06901 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0691a f1055a;

            C06901(C0691a c0691a) {
                this.f1055a = c0691a;
            }

            public void run() {
                this.f1055a.m1199b();
            }
        }

        /* renamed from: com.iptv2.control.ToastGroupView$a$3 */
        class C11713 implements Stop {
            /* renamed from: a */
            final /* synthetic */ C0691a f2048a;

            C11713(C0691a c0691a) {
                this.f2048a = c0691a;
            }

            public void onStop() {
                C0591c.m791a("ToastGroupView", "hide removed");
                this.f2048a.f1056a.removeView(this.f2048a.f1057b);
            }
        }

        /* renamed from: a */
        public boolean m1198a() {
            return this.f1059d;
        }

        public C0691a(ToastGroupView toastGroupView, String str) {
            this.f1056a = toastGroupView;
            this.f1057b = toastGroupView.f2052a.f1264l.inflate(R.layout.widget_toast_group_item, toastGroupView, false);
            this.f1057b.setTag(this);
            this.f1058c = (TextView) this.f1057b.findViewById(R.id.text);
            this.f1058c.setText(str);
        }

        /* renamed from: a */
        public void m1197a(int i) {
            this.f1056a.f2052a.f1263k.removeCallbacks(this.f1061f);
            if (i > 0) {
                this.f1056a.f2052a.f1263k.postDelayed(this.f1061f, (long) i);
            }
            if (this.f1059d == 0) {
                C0591c.m791a("ToastGroupView", "show");
                this.f1059d = true;
                final MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1057b.getLayoutParams();
                this.f1058c.measure(MeasureSpec.makeMeasureSpec(this.f1056a.f2053b, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
                final int measuredHeight = this.f1058c.getMeasuredHeight();
                this.f1056a.addView(this.f1057b, 0);
                if (this.f1060e != null) {
                    this.f1060e.cancel();
                }
                this.f1060e = new ViewAnimator();
                this.f1060e.addAnimationBuilder(this.f1057b).duration(600).custom(new Update(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0691a f2047c;

                    public void update(View view, float f) {
                        marginLayoutParams.height = (int) (((float) measuredHeight) * f);
                        marginLayoutParams.topMargin = (int) (f * ((float) this.f2047c.f1056a.f2054c));
                        this.f2047c.f1057b.requestLayout();
                    }
                }, 0.0f, 1.0f).thenAnimate(this.f1057b).width((float) this.f1056a.f2055d, (float) this.f1056a.f2053b).duration(600).thenAnimate(this.f1058c).alpha(0.0f, 1.0f).translationX((float) ((-this.f1056a.f2053b) / 3), 0.0f).duration(600).start();
            }
        }

        /* renamed from: b */
        public void m1199b() {
            this.f1056a.f2052a.f1263k.removeCallbacks(this.f1061f);
            if (this.f1059d) {
                C0591c.m791a("ToastGroupView", "hide");
                this.f1059d = false;
                if (this.f1060e != null) {
                    this.f1060e.cancel();
                }
                final MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1057b.getLayoutParams();
                final int height = this.f1058c.getHeight();
                this.f1060e = new ViewAnimator();
                this.f1060e.addAnimationBuilder(this.f1058c).alpha(1.0f, 0.0f).translationX(0.0f, (float) ((-this.f1056a.f2053b) / 3)).duration(600).thenAnimate(this.f1057b).width((float) this.f1056a.f2053b, (float) this.f1056a.f2055d).duration(600).thenAnimate(this.f1057b).custom(new Update(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0691a f2051c;

                    public void update(View view, float f) {
                        marginLayoutParams.height = (int) (((float) height) * f);
                        marginLayoutParams.topMargin = (int) (f * ((float) this.f2051c.f1056a.f2054c));
                        this.f2051c.f1057b.requestLayout();
                    }
                }, 1.0f, 0.0f).duration(600).onStop(new C11713(this)).start();
            }
        }
    }

    public ToastGroupView(Context context) {
        super(context);
        m2461a(context);
    }

    public ToastGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2461a(context);
    }

    public ToastGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2461a(context);
    }

    /* renamed from: a */
    private void m2461a(Context context) {
        this.f2052a = ((Application) context.getApplicationContext()).f1065d;
        this.f2053b = this.f2052a.f1265m.getDimensionPixelSize(R.dimen.widget_toast_group_item_width);
        this.f2054c = this.f2052a.f1265m.getDimensionPixelSize(R.dimen.widget_toast_group_item_vmargin);
        this.f2055d = this.f2052a.f1265m.getDimensionPixelSize(R.dimen.widget_toast_group_item_left_border_size);
    }

    /* renamed from: a */
    public void m2466a(String str) {
        m2467a(str, 0);
    }

    /* renamed from: a */
    public void m2467a(String str, int i) {
        new C0691a(this, str).m1197a(i);
    }

    /* renamed from: a */
    public void m2465a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0691a c0691a = (C0691a) getChildAt(i).getTag();
            if (c0691a.m1198a()) {
                c0691a.m1199b();
            }
        }
    }
}
