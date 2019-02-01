package com.nostra13.universalimageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.utils.C0778L;

public class ImageViewAware extends ViewAware {
    public ImageViewAware(ImageView imageView) {
        super(imageView);
    }

    public ImageViewAware(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    public int getWidth() {
        int width = super.getWidth();
        if (width > 0) {
            return width;
        }
        ImageView imageView = (ImageView) this.viewRef.get();
        return imageView != null ? getImageViewFieldValue(imageView, "mMaxWidth") : width;
    }

    public int getHeight() {
        int height = super.getHeight();
        if (height > 0) {
            return height;
        }
        ImageView imageView = (ImageView) this.viewRef.get();
        return imageView != null ? getImageViewFieldValue(imageView, "mMaxHeight") : height;
    }

    public ViewScaleType getScaleType() {
        ImageView imageView = (ImageView) this.viewRef.get();
        if (imageView != null) {
            return ViewScaleType.fromImageView(imageView);
        }
        return super.getScaleType();
    }

    public ImageView getWrappedView() {
        return (ImageView) super.getWrappedView();
    }

    protected void setImageDrawableInto(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if ((drawable instanceof AnimationDrawable) != null) {
            ((AnimationDrawable) drawable).start();
        }
    }

    protected void setImageBitmapInto(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    private static int getImageViewFieldValue(Object obj, String str) {
        try {
            str = ImageView.class.getDeclaredField(str);
            str.setAccessible(true);
            obj = ((Integer) str.get(obj)).intValue();
            if (obj <= null || obj >= Integer.MAX_VALUE) {
                return 0;
            }
            return obj;
        } catch (Object obj2) {
            C0778L.m1430e(obj2);
            return 0;
        }
    }
}
