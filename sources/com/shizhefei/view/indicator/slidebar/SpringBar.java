package com.shizhefei.view.indicator.slidebar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.view.View;
import com.shizhefei.view.indicator.slidebar.ScrollBar.Gravity;

public class SpringBar extends View implements ScrollBar {
    private float acceleration;
    private Point foot;
    private float footMoveOffset;
    private Point head;
    private float headMoveOffset;
    private float maxRadiusPercent;
    private float minRadiusPercent;
    private Paint paint;
    private Path path;
    private float positionOffset;
    private float radiusMax;
    private float radiusMin;
    private float radiusOffset;
    private int tabWidth;

    private class Point {
        private float radius;
        /* renamed from: x */
        private float f1399x;
        /* renamed from: y */
        private float f1400y;

        private Point() {
        }

        public float getX() {
            return this.f1399x;
        }

        public void setX(float f) {
            this.f1399x = f;
        }

        public float getY() {
            return this.f1400y;
        }

        public void setY(float f) {
            this.f1400y = f;
        }

        public float getRadius() {
            return this.radius;
        }

        public void setRadius(float f) {
            this.radius = f;
        }
    }

    public View getSlideView() {
        return this;
    }

    public SpringBar(Context context, int i) {
        this(context, i, 0.9f, 0.35f);
    }

    public SpringBar(Context context, int i, float f, float f2) {
        super(context);
        this.acceleration = 0.5f;
        this.headMoveOffset = 0.6f;
        this.footMoveOffset = 1065353216 - this.headMoveOffset;
        this.maxRadiusPercent = f;
        this.minRadiusPercent = f2;
        this.foot = new Point();
        this.head = new Point();
        this.path = new Path();
        this.paint = new Paint();
        this.paint.setAntiAlias(Float.MIN_VALUE);
        this.paint.setStyle(Style.FILL_AND_STROKE);
        this.paint.setStrokeWidth(1.0f);
        this.paint.setColor(i);
    }

    public int getHeight(int i) {
        float f = (float) (i / 2);
        this.foot.setY(f);
        this.head.setY(f);
        this.radiusMax = this.maxRadiusPercent * f;
        this.radiusMin = f * this.minRadiusPercent;
        this.radiusOffset = this.radiusMax - this.radiusMin;
        return i;
    }

    public int getWidth(int i) {
        this.tabWidth = i;
        if (this.positionOffset < 0.02f || this.positionOffset > 0.98f) {
            onPageScrolled(0, 0.0f, 0);
        }
        return i * 2;
    }

    public Gravity getGravity() {
        return Gravity.CENTENT_BACKGROUND;
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.positionOffset = f;
        float f2 = 0.0f;
        if (f >= 1017370378) {
            if (f <= 1065017672) {
                if (f < 0.5f) {
                    this.head.setRadius(this.radiusMin);
                } else {
                    this.head.setRadius((((f - 0.5f) / 0.5f) * this.radiusOffset) + this.radiusMin);
                }
                float f3 = 1.0f;
                if (f < 0.5f) {
                    this.foot.setRadius(((1065353216 - (f / 1056964608)) * this.radiusOffset) + this.radiusMin);
                } else {
                    this.foot.setRadius(this.radiusMin);
                }
                if (f > this.headMoveOffset) {
                    f2 = (float) ((Math.atan((double) (((((f - this.headMoveOffset) / (1.0f - this.headMoveOffset)) * this.acceleration) * 1073741824) - this.acceleration)) + Math.atan((double) this.acceleration)) / (Math.atan((double) this.acceleration) * 2.0d));
                }
                this.head.setX(getOffsetX(f) - (f2 * getPositionDistance(i)));
                if (f < this.footMoveOffset) {
                    f3 = (float) ((Math.atan((double) ((((f / this.footMoveOffset) * this.acceleration) * 1073741824) - this.acceleration)) + Math.atan((double) this.acceleration)) / (Math.atan((double) this.acceleration) * 2.0d));
                }
                this.foot.setX(getOffsetX(f) - (f3 * getPositionDistance(i)));
                return;
            }
        }
        this.head.setX(getOffsetX(0.0f));
        this.foot.setX(getOffsetX(0.0f));
        this.head.setRadius(this.radiusMax);
        this.foot.setRadius(this.radiusMax);
    }

    private float getOffsetX(float f) {
        return (((float) ((this.tabWidth * 2) - (this.tabWidth / 4))) - (((float) this.tabWidth) * (1.0f - f))) + (((float) this.tabWidth) / 4.0f);
    }

    private float getPositionDistance(int i) {
        return (float) this.tabWidth;
    }

    protected void onDraw(Canvas canvas) {
        makePath();
        canvas.drawColor(0);
        canvas.drawPath(this.path, this.paint);
        canvas.drawCircle(this.head.getX(), this.head.getY(), this.head.getRadius(), this.paint);
        canvas.drawCircle(this.foot.getX(), this.foot.getY(), this.foot.getRadius(), this.paint);
        super.onDraw(canvas);
    }

    private void makePath() {
        double radius = (double) this.foot.getRadius();
        double sin = Math.sin(Math.atan((double) ((this.head.getY() - this.foot.getY()) / (this.head.getX() - this.foot.getX()))));
        Double.isNaN(radius);
        float f = (float) (radius * sin);
        double radius2 = (double) this.foot.getRadius();
        double cos = Math.cos(Math.atan((double) ((this.head.getY() - this.foot.getY()) / (this.head.getX() - this.foot.getX()))));
        Double.isNaN(radius2);
        float f2 = (float) (radius2 * cos);
        sin = (double) this.head.getRadius();
        double sin2 = Math.sin(Math.atan((double) ((this.head.getY() - this.foot.getY()) / (this.head.getX() - this.foot.getX()))));
        Double.isNaN(sin);
        float f3 = (float) (sin * sin2);
        cos = (double) this.head.getRadius();
        double cos2 = Math.cos(Math.atan((double) ((this.head.getY() - this.foot.getY()) / (this.head.getX() - this.foot.getX()))));
        Double.isNaN(cos);
        float f4 = (float) (cos * cos2);
        float x = this.foot.getX() - f;
        float y = this.foot.getY() + f2;
        float x2 = this.foot.getX() + f;
        f = this.foot.getY() - f2;
        f2 = this.head.getX() - f3;
        float y2 = this.head.getY() + f4;
        float x3 = this.head.getX() + f3;
        f3 = this.head.getY() - f4;
        f4 = (this.head.getX() + this.foot.getX()) / 2.0f;
        float y3 = (this.head.getY() + this.foot.getY()) / 2.0f;
        this.path.reset();
        this.path.moveTo(x, y);
        this.path.quadTo(f4, y3, f2, y2);
        this.path.lineTo(x3, f3);
        this.path.quadTo(f4, y3, x2, f);
        this.path.lineTo(x, y);
    }
}
