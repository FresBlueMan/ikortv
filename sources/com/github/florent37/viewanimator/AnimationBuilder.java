package com.github.florent37.viewanimator;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.annotation.IntRange;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Start;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.AnimationListener.Update;
import java.util.ArrayList;
import java.util.List;

public class AnimationBuilder {
    private final List<Animator> animatorList = new ArrayList();
    private boolean nextValueWillBeDp = false;
    private Interpolator singleInterpolator = null;
    private final ViewAnimator viewAnimator;
    private final View[] views;
    private boolean waitForHeight;

    /* renamed from: com.github.florent37.viewanimator.AnimationBuilder$2 */
    class C09862 implements Update {
        C09862() {
        }

        public void update(View view, float f) {
            view.getLayoutParams().height = (int) f;
            view.requestLayout();
        }
    }

    /* renamed from: com.github.florent37.viewanimator.AnimationBuilder$3 */
    class C09873 implements Update {
        C09873() {
        }

        public void update(View view, float f) {
            view.getLayoutParams().width = (int) f;
            view.requestLayout();
        }
    }

    public AnimationBuilder(ViewAnimator viewAnimator, View... viewArr) {
        this.viewAnimator = viewAnimator;
        this.views = viewArr;
    }

    public AnimationBuilder dp() {
        this.nextValueWillBeDp = true;
        return this;
    }

    protected AnimationBuilder add(Animator animator) {
        this.animatorList.add(animator);
        return this;
    }

    protected float toDp(float f) {
        return f / this.views[0].getContext().getResources().getDisplayMetrics().density;
    }

    protected float toPx(float f) {
        return f * this.views[0].getContext().getResources().getDisplayMetrics().density;
    }

    protected float[] getValues(float... fArr) {
        if (!this.nextValueWillBeDp) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = toPx(fArr[i]);
        }
        return fArr2;
    }

    public AnimationBuilder property(String str, float... fArr) {
        for (Object ofFloat : this.views) {
            this.animatorList.add(ObjectAnimator.ofFloat(ofFloat, str, getValues(fArr)));
        }
        return this;
    }

    public AnimationBuilder translationY(float... fArr) {
        return property("translationY", fArr);
    }

    public AnimationBuilder translationX(float... fArr) {
        return property("translationX", fArr);
    }

    public AnimationBuilder alpha(float... fArr) {
        return property("alpha", fArr);
    }

    public AnimationBuilder scaleX(float... fArr) {
        return property("scaleX", fArr);
    }

    public AnimationBuilder scaleY(float... fArr) {
        return property("scaleY", fArr);
    }

    public AnimationBuilder scale(float... fArr) {
        scaleX(fArr);
        scaleY(fArr);
        return this;
    }

    public AnimationBuilder pivotX(float f) {
        for (View pivotX : this.views) {
            ViewCompat.setPivotX(pivotX, f);
        }
        return this;
    }

    public AnimationBuilder pivotY(float f) {
        for (View pivotY : this.views) {
            ViewCompat.setPivotY(pivotY, f);
        }
        return this;
    }

    public AnimationBuilder pivotX(float... fArr) {
        ObjectAnimator.ofFloat(getView(), "pivotX", getValues(fArr));
        return this;
    }

    public AnimationBuilder pivotY(float... fArr) {
        ObjectAnimator.ofFloat(getView(), "pivotY", getValues(fArr));
        return this;
    }

    public AnimationBuilder rotationX(float... fArr) {
        return property("rotationX", fArr);
    }

    public AnimationBuilder rotationY(float... fArr) {
        return property("rotationY", fArr);
    }

    public AnimationBuilder rotation(float... fArr) {
        return property("rotation", fArr);
    }

    public AnimationBuilder backgroundColor(int... iArr) {
        for (Object ofInt : this.views) {
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(ofInt, "backgroundColor", iArr);
            ofInt2.setEvaluator(new ArgbEvaluator());
            this.animatorList.add(ofInt2);
        }
        return this;
    }

    public AnimationBuilder textColor(int... iArr) {
        for (Object obj : this.views) {
            if (obj instanceof TextView) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(obj, "textColor", iArr);
                ofInt.setEvaluator(new ArgbEvaluator());
                this.animatorList.add(ofInt);
            }
        }
        return this;
    }

    public AnimationBuilder custom(final Update update, float... fArr) {
        for (final View view : this.views) {
            Animator ofFloat = ValueAnimator.ofFloat(getValues(fArr));
            if (update != null) {
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        update.update(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            add(ofFloat);
        }
        return this;
    }

    public AnimationBuilder height(float... fArr) {
        return custom(new C09862(), fArr);
    }

    public AnimationBuilder width(float... fArr) {
        return custom(new C09873(), fArr);
    }

    public AnimationBuilder waitForHeight() {
        this.waitForHeight = true;
        return this;
    }

    protected List<Animator> createAnimators() {
        return this.animatorList;
    }

    public AnimationBuilder andAnimate(View... viewArr) {
        return this.viewAnimator.addAnimationBuilder(viewArr);
    }

    public AnimationBuilder thenAnimate(View... viewArr) {
        return this.viewAnimator.thenAnimate(viewArr);
    }

    public AnimationBuilder duration(long j) {
        this.viewAnimator.duration(j);
        return this;
    }

    public AnimationBuilder startDelay(long j) {
        this.viewAnimator.startDelay(j);
        return this;
    }

    public AnimationBuilder repeatCount(@IntRange(from = -1) int i) {
        this.viewAnimator.repeatCount(i);
        return this;
    }

    public AnimationBuilder repeatMode(int i) {
        this.viewAnimator.repeatMode(i);
        return this;
    }

    public AnimationBuilder onStart(Start start) {
        this.viewAnimator.onStart(start);
        return this;
    }

    public AnimationBuilder onStop(Stop stop) {
        this.viewAnimator.onStop(stop);
        return this;
    }

    public AnimationBuilder interpolator(Interpolator interpolator) {
        this.viewAnimator.interpolator(interpolator);
        return this;
    }

    public AnimationBuilder singleInterpolator(Interpolator interpolator) {
        this.singleInterpolator = interpolator;
        return this;
    }

    public Interpolator getSingleInterpolator() {
        return this.singleInterpolator;
    }

    public ViewAnimator accelerate() {
        return this.viewAnimator.interpolator(new AccelerateInterpolator());
    }

    public ViewAnimator decelerate() {
        return this.viewAnimator.interpolator(new DecelerateInterpolator());
    }

    public ViewAnimator start() {
        this.viewAnimator.start();
        return this.viewAnimator;
    }

    public View[] getViews() {
        return this.views;
    }

    public View getView() {
        return this.views[0];
    }

    public boolean isWaitForHeight() {
        return this.waitForHeight;
    }

    public AnimationBuilder bounce() {
        return translationY(0.0f, 0.0f, -30.0f, 0.0f, -15.0f, 0.0f, 0.0f);
    }

    public AnimationBuilder bounceIn() {
        alpha(0.0f, 1.0f, 1.0f, 1.0f);
        scaleX(0.3f, 1.05f, 0.9f, 1.0f);
        scaleY(0.3f, 1.05f, 0.9f, 1.0f);
        return this;
    }

    public AnimationBuilder bounceOut() {
        scaleY(1.0f, 0.9f, 1.05f, 0.3f);
        scaleX(1.0f, 0.9f, 1.05f, 0.3f);
        alpha(1.0f, 1.0f, 1.0f, 0.0f);
        return this;
    }

    public AnimationBuilder fadeIn() {
        return alpha(0.0f, 0.25f, 0.5f, 0.75f, 1.0f);
    }

    public AnimationBuilder fadeOut() {
        return alpha(1.0f, 0.75f, 0.5f, 0.25f, 0.0f);
    }

    public AnimationBuilder flash() {
        return alpha(1.0f, 0.0f, 1.0f, 0.0f, 1.0f);
    }

    public AnimationBuilder flipHorizontal() {
        return rotationX(90.0f, -15.0f, 15.0f, 0.0f);
    }

    public AnimationBuilder flipVertical() {
        return rotationY(90.0f, -15.0f, 15.0f, 0.0f);
    }

    public AnimationBuilder pulse() {
        scaleY(1.0f, 1.1f, 1.0f);
        scaleX(1.0f, 1.1f, 1.0f);
        return this;
    }

    public AnimationBuilder rollIn() {
        for (View view : this.views) {
            alpha(0.0f, 1.0f);
            translationX((float) (-((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight())), 0.0f);
            rotation(-120.0f, 0.0f);
        }
        return this;
    }

    public AnimationBuilder rollOut() {
        for (View view : this.views) {
            alpha(1.0f, 0.0f);
            translationX(0.0f, (float) view.getWidth());
            rotation(0.0f, 120.0f);
        }
        return this;
    }

    public AnimationBuilder rubber() {
        scaleX(1.0f, 1.25f, 0.75f, 1.15f, 1.0f);
        scaleY(1.0f, 0.75f, 1.25f, 0.85f, 1.0f);
        return this;
    }

    public AnimationBuilder shake() {
        translationX(0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f);
        interpolator(new CycleInterpolator(5.0f));
        return this;
    }

    public AnimationBuilder standUp() {
        for (View view : this.views) {
            float width = (float) ((((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / 2) + view.getPaddingLeft());
            float height = (float) (view.getHeight() - view.getPaddingBottom());
            pivotX(width, width, width, width, width);
            pivotY(height, height, height, height, height);
            rotationX(55.0f, -30.0f, 15.0f, -15.0f, 0.0f);
        }
        return this;
    }

    public AnimationBuilder swing() {
        return rotation(0.0f, 10.0f, -10.0f, 6.0f, -6.0f, 3.0f, -3.0f, 0.0f);
    }

    public AnimationBuilder tada() {
        scaleX(1.0f, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.0f);
        scaleY(1.0f, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.0f);
        rotation(0.0f, -3.0f, -3.0f, 3.0f, -3.0f, 3.0f, -3.0f, 3.0f, -3.0f, 0.0f);
        return this;
    }

    public AnimationBuilder wave() {
        for (View view : this.views) {
            float width = (float) ((((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / 2) + view.getPaddingLeft());
            float height = (float) (view.getHeight() - view.getPaddingBottom());
            rotation(12.0f, -12.0f, 3.0f, -3.0f, 0.0f);
            pivotX(width, width, width, width, width);
            pivotY(height, height, height, height, height);
        }
        return this;
    }

    public AnimationBuilder wobble() {
        for (View width : this.views) {
            double width2 = (double) ((float) width.getWidth());
            Double.isNaN(width2);
            float f = (float) (width2 / 100.0d);
            r5 = new float[8];
            float f2 = f * 0.0f;
            r5[0] = f2;
            r5[1] = -25.0f * f;
            r5[2] = 20.0f * f;
            r5[3] = -15.0f * f;
            r5[4] = 10.0f * f;
            r5[5] = f * -5.0f;
            r5[6] = f2;
            r5[7] = 0.0f;
            translationX(r5);
            rotation(0.0f, -5.0f, 3.0f, -3.0f, 2.0f, -1.0f, 0.0f);
        }
        return this;
    }

    public AnimationBuilder zoomIn() {
        scaleX(0.45f, 1.0f);
        scaleY(0.45f, 1.0f);
        alpha(0.0f, 1.0f);
        return this;
    }

    public AnimationBuilder zoomOut() {
        scaleX(1.0f, 0.3f, 0.0f);
        scaleY(1.0f, 0.3f, 0.0f);
        alpha(1.0f, 0.0f, 0.0f);
        return this;
    }

    public AnimationBuilder fall() {
        rotation(1080.0f, 720.0f, 360.0f, 0.0f);
        return this;
    }

    public AnimationBuilder newsPaper() {
        alpha(0.0f, 1.0f);
        scaleX(0.1f, 0.5f, 1.0f);
        scaleY(0.1f, 0.5f, 1.0f);
        return this;
    }

    public AnimationBuilder slit() {
        rotationY(90.0f, 88.0f, 88.0f, 45.0f, 0.0f);
        alpha(0.0f, 0.4f, 0.8f, 1.0f);
        scaleX(0.0f, 0.5f, 0.9f, 0.9f, 1.0f);
        scaleY(0.0f, 0.5f, 0.9f, 0.9f, 1.0f);
        return this;
    }

    public AnimationBuilder slideLeft() {
        translationX(-300.0f, 0.0f);
        alpha(0.0f, 1.0f);
        return this;
    }

    public AnimationBuilder slideRight() {
        translationX(300.0f, 0.0f);
        alpha(0.0f, 1.0f);
        return this;
    }

    public AnimationBuilder slideTop() {
        translationY(-300.0f, 0.0f);
        alpha(0.0f, 1.0f);
        return this;
    }

    public AnimationBuilder slideBottom() {
        translationY(300.0f, 0.0f);
        alpha(0.0f, 1.0f);
        return this;
    }

    public AnimationBuilder path(Path path) {
        if (path == null) {
            return this;
        }
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        return custom(new Update() {
            public void update(View view, float f) {
                float[] fArr = new float[2];
                pathMeasure.getPosTan(f, fArr, null);
                float f2 = fArr[0];
                float f3 = fArr[1];
                ViewCompat.setX(view, f2);
                ViewCompat.setY(view, f3);
                view = new StringBuilder();
                view.append("path: value=");
                view.append(f);
                view.append(", x=");
                view.append(f2);
                view.append(", y=");
                view.append(f3);
                Log.d(null, view.toString());
            }
        }, 0.0f, pathMeasure.getLength());
    }

    public AnimationBuilder svgPath(String str) {
        return path(SvgPathParser.tryParsePath(str));
    }
}
