package com.github.florent37.viewanimator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.support.annotation.IntRange;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;
import com.github.florent37.viewanimator.AnimationListener.Start;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ViewAnimator {
    private static final long DEFAULT_DURATION = 3000;
    private List<AnimationBuilder> animationList = new ArrayList();
    private AnimatorSet animatorSet;
    private long duration = DEFAULT_DURATION;
    private Interpolator interpolator = null;
    private ViewAnimator next = null;
    private ViewAnimator prev = null;
    private int repeatCount = 0;
    private int repeatMode = 1;
    private long startDelay = 0;
    private Start startListener;
    private Stop stopListener;
    private View waitForThisViewHeight = null;

    /* renamed from: com.github.florent37.viewanimator.ViewAnimator$1 */
    class C04361 implements AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        C04361() {
        }

        public void onAnimationStart(Animator animator) {
            if (ViewAnimator.this.startListener != null) {
                ViewAnimator.this.startListener.onStart();
            }
        }

        public void onAnimationEnd(Animator animator) {
            if (ViewAnimator.this.stopListener != null) {
                ViewAnimator.this.stopListener.onStop();
            }
            if (ViewAnimator.this.next != null) {
                ViewAnimator.this.next.prev = null;
                ViewAnimator.this.next.start();
            }
        }
    }

    /* renamed from: com.github.florent37.viewanimator.ViewAnimator$2 */
    class C04372 implements OnPreDrawListener {
        C04372() {
        }

        public boolean onPreDraw() {
            ViewAnimator.this.animatorSet.start();
            ViewAnimator.this.waitForThisViewHeight.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public static AnimationBuilder animate(View... viewArr) {
        return new ViewAnimator().addAnimationBuilder(viewArr);
    }

    public AnimationBuilder thenAnimate(View... viewArr) {
        ViewAnimator viewAnimator = new ViewAnimator();
        this.next = viewAnimator;
        viewAnimator.prev = this;
        return viewAnimator.addAnimationBuilder(viewArr);
    }

    public AnimationBuilder addAnimationBuilder(View... viewArr) {
        AnimationBuilder animationBuilder = new AnimationBuilder(this, viewArr);
        this.animationList.add(animationBuilder);
        return animationBuilder;
    }

    protected AnimatorSet createAnimatorSet() {
        Collection<Animator> arrayList = new ArrayList();
        for (AnimationBuilder animationBuilder : this.animationList) {
            Collection<Animator> createAnimators = animationBuilder.createAnimators();
            if (animationBuilder.getSingleInterpolator() != null) {
                for (Animator interpolator : createAnimators) {
                    interpolator.setInterpolator(animationBuilder.getSingleInterpolator());
                }
            }
            arrayList.addAll(createAnimators);
        }
        for (AnimationBuilder animationBuilder2 : this.animationList) {
            if (animationBuilder2.isWaitForHeight()) {
                this.waitForThisViewHeight = animationBuilder2.getView();
                break;
            }
        }
        for (Animator animator : arrayList) {
            if (animator instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setRepeatCount(this.repeatCount);
                valueAnimator.setRepeatMode(this.repeatMode);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(this.duration);
        animatorSet.setStartDelay(this.startDelay);
        if (this.interpolator != null) {
            animatorSet.setInterpolator(this.interpolator);
        }
        animatorSet.addListener(new C04361());
        return animatorSet;
    }

    public ViewAnimator start() {
        if (this.prev != null) {
            this.prev.start();
        } else {
            this.animatorSet = createAnimatorSet();
            if (this.waitForThisViewHeight != null) {
                this.waitForThisViewHeight.getViewTreeObserver().addOnPreDrawListener(new C04372());
            } else {
                this.animatorSet.start();
            }
        }
        return this;
    }

    public void cancel() {
        if (this.animatorSet != null) {
            this.animatorSet.cancel();
        }
        if (this.next != null) {
            this.next.cancel();
            this.next = null;
        }
    }

    public ViewAnimator duration(long j) {
        this.duration = j;
        return this;
    }

    public ViewAnimator startDelay(long j) {
        this.startDelay = j;
        return this;
    }

    public ViewAnimator repeatCount(@IntRange(from = -1) int i) {
        this.repeatCount = i;
        return this;
    }

    public ViewAnimator repeatMode(int i) {
        this.repeatMode = i;
        return this;
    }

    public ViewAnimator onStart(Start start) {
        this.startListener = start;
        return this;
    }

    public ViewAnimator onStop(Stop stop) {
        this.stopListener = stop;
        return this;
    }

    public ViewAnimator interpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
        return this;
    }
}
