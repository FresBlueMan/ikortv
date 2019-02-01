package com.nostra13.universalimageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.utils.C0778L;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class ViewAware implements ImageAware {
    public static final String WARN_CANT_SET_BITMAP = "Can't set a bitmap into view. You should call ImageLoader on UI thread for it.";
    public static final String WARN_CANT_SET_DRAWABLE = "Can't set a drawable into view. You should call ImageLoader on UI thread for it.";
    protected boolean checkActualViewSize;
    protected Reference<View> viewRef;

    protected abstract void setImageBitmapInto(Bitmap bitmap, View view);

    protected abstract void setImageDrawableInto(Drawable drawable, View view);

    public ViewAware(View view) {
        this(view, true);
    }

    public ViewAware(View view, boolean z) {
        if (view != null) {
            this.viewRef = new WeakReference(view);
            this.checkActualViewSize = z;
            return;
        }
        throw new IllegalArgumentException("view must not be null");
    }

    public int getWidth() {
        View view = (View) this.viewRef.get();
        int i = 0;
        if (view == null) {
            return 0;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(!this.checkActualViewSize || layoutParams == null || layoutParams.width == -2)) {
            i = view.getWidth();
        }
        if (i <= 0 && layoutParams != null) {
            i = layoutParams.width;
        }
        return i;
    }

    public int getHeight() {
        View view = (View) this.viewRef.get();
        int i = 0;
        if (view == null) {
            return 0;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(!this.checkActualViewSize || layoutParams == null || layoutParams.height == -2)) {
            i = view.getHeight();
        }
        if (i <= 0 && layoutParams != null) {
            i = layoutParams.height;
        }
        return i;
    }

    public ViewScaleType getScaleType() {
        return ViewScaleType.CROP;
    }

    public View getWrappedView() {
        return (View) this.viewRef.get();
    }

    public boolean isCollected() {
        return this.viewRef.get() == null;
    }

    public int getId() {
        View view = (View) this.viewRef.get();
        return view == null ? super.hashCode() : view.hashCode();
    }

    public boolean setImageDrawable(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = (View) this.viewRef.get();
            if (view != null) {
                setImageDrawableInto(drawable, view);
                return true;
            }
        }
        C0778L.m1433w(WARN_CANT_SET_DRAWABLE, new Object[0]);
        return false;
    }

    public boolean setImageBitmap(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = (View) this.viewRef.get();
            if (view != null) {
                setImageBitmapInto(bitmap, view);
                return true;
            }
        }
        C0778L.m1433w(WARN_CANT_SET_BITMAP, new Object[0]);
        return false;
    }
}
