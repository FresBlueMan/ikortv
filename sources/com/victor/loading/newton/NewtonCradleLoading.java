package com.victor.loading.newton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.CycleInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.victor.loading.C0792R;

public class NewtonCradleLoading extends LinearLayout {
    private static final int DEGREE = 30;
    private static final int DURATION = 400;
    private static final float PIVOT_X = 0.5f;
    private static final float PIVOT_Y = -3.0f;
    private static final int SHAKE_DISTANCE = 2;
    private CradleBall cradleBallFive;
    private CradleBall cradleBallFour;
    private CradleBall cradleBallOne;
    private CradleBall cradleBallThree;
    private CradleBall cradleBallTwo;
    private boolean isStart = false;
    RotateAnimation rotateLeftAnimation;
    RotateAnimation rotateRightAnimation;
    TranslateAnimation shakeLeftAnimation;
    TranslateAnimation shakeRightAnimation;

    /* renamed from: com.victor.loading.newton.NewtonCradleLoading$1 */
    class C07951 implements AnimationListener {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C07951() {
        }

        public void onAnimationEnd(Animation animation) {
            if (NewtonCradleLoading.this.isStart != null) {
                NewtonCradleLoading.this.startRightAnim();
            }
        }
    }

    /* renamed from: com.victor.loading.newton.NewtonCradleLoading$2 */
    class C07962 implements AnimationListener {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C07962() {
        }

        public void onAnimationEnd(Animation animation) {
            if (NewtonCradleLoading.this.isStart != null) {
                NewtonCradleLoading.this.cradleBallTwo.startAnimation(NewtonCradleLoading.this.shakeLeftAnimation);
                NewtonCradleLoading.this.cradleBallThree.startAnimation(NewtonCradleLoading.this.shakeLeftAnimation);
                NewtonCradleLoading.this.cradleBallFour.startAnimation(NewtonCradleLoading.this.shakeLeftAnimation);
                NewtonCradleLoading.this.cradleBallFive.startAnimation(NewtonCradleLoading.this.rotateRightAnimation);
            }
        }
    }

    /* renamed from: com.victor.loading.newton.NewtonCradleLoading$3 */
    class C07973 implements AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        C07973() {
        }

        public void onAnimationStart(Animation animation) {
            if (NewtonCradleLoading.this.isStart != null) {
                NewtonCradleLoading.this.startLeftAnim();
            }
        }
    }

    public NewtonCradleLoading(Context context) {
        super(context);
        initView(context);
    }

    public NewtonCradleLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public NewtonCradleLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(C0792R.layout.newton_cradle_loading, this, true);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.cradleBallOne = (CradleBall) findViewById(C0792R.id.ball_one);
        this.cradleBallTwo = (CradleBall) findViewById(C0792R.id.ball_two);
        this.cradleBallThree = (CradleBall) findViewById(C0792R.id.ball_three);
        this.cradleBallFour = (CradleBall) findViewById(C0792R.id.ball_four);
        this.cradleBallFive = (CradleBall) findViewById(C0792R.id.ball_five);
        initAnim();
    }

    private void initAnim() {
        this.rotateRightAnimation = new RotateAnimation(0.0f, -30.0f, 1, PIVOT_X, 1, PIVOT_Y);
        this.rotateRightAnimation.setRepeatCount(1);
        this.rotateRightAnimation.setRepeatMode(2);
        this.rotateRightAnimation.setDuration(400);
        this.rotateRightAnimation.setInterpolator(new LinearInterpolator());
        this.rotateRightAnimation.setAnimationListener(new C07951());
        this.shakeLeftAnimation = new TranslateAnimation(0.0f, 2.0f, 0.0f, 0.0f);
        this.shakeLeftAnimation.setDuration(400);
        this.shakeLeftAnimation.setInterpolator(new CycleInterpolator(2.0f));
        this.rotateLeftAnimation = new RotateAnimation(0.0f, 30.0f, 1, PIVOT_X, 1, PIVOT_Y);
        this.rotateLeftAnimation.setRepeatCount(1);
        this.rotateLeftAnimation.setRepeatMode(2);
        this.rotateLeftAnimation.setDuration(400);
        this.rotateLeftAnimation.setInterpolator(new LinearInterpolator());
        this.rotateLeftAnimation.setAnimationListener(new C07962());
        this.shakeRightAnimation = new TranslateAnimation(0.0f, -2.0f, 0.0f, 0.0f);
        this.shakeRightAnimation.setDuration(400);
        this.shakeRightAnimation.setInterpolator(new CycleInterpolator(2.0f));
        this.shakeRightAnimation.setAnimationListener(new C07973());
    }

    private void startLeftAnim() {
        this.cradleBallOne.startAnimation(this.rotateLeftAnimation);
    }

    private void startRightAnim() {
        this.cradleBallTwo.startAnimation(this.shakeRightAnimation);
        this.cradleBallThree.startAnimation(this.shakeRightAnimation);
        this.cradleBallFour.startAnimation(this.shakeRightAnimation);
    }

    public void start() {
        if (!this.isStart) {
            this.isStart = true;
            startLeftAnim();
        }
    }

    public void stop() {
        this.isStart = false;
        this.cradleBallOne.clearAnimation();
        this.cradleBallTwo.clearAnimation();
        this.cradleBallThree.clearAnimation();
        this.cradleBallFour.clearAnimation();
        this.cradleBallFive.clearAnimation();
    }

    public boolean isStart() {
        return this.isStart;
    }

    public void setLoadingColor(int i) {
        this.cradleBallOne.setLoadingColor(i);
        this.cradleBallTwo.setLoadingColor(i);
        this.cradleBallThree.setLoadingColor(i);
        this.cradleBallFour.setLoadingColor(i);
        this.cradleBallFive.setLoadingColor(i);
    }
}
