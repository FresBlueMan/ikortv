package com.nostra13.universalimageloader.utils;

import android.opengl.GLES10;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;

public final class ImageSizeUtils {
    private static final int DEFAULT_MAX_BITMAP_DIMENSION = 2048;
    private static ImageSize maxBitmapSize;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        maxBitmapSize = new ImageSize(max, max);
    }

    private ImageSizeUtils() {
    }

    public static ImageSize defineTargetSizeForView(ImageAware imageAware, ImageSize imageSize) {
        int width = imageAware.getWidth();
        if (width <= 0) {
            width = imageSize.getWidth();
        }
        imageAware = imageAware.getHeight();
        if (imageAware <= null) {
            imageAware = imageSize.getHeight();
        }
        return new ImageSize(width, imageAware);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int computeImageSampleSize(com.nostra13.universalimageloader.core.assist.ImageSize r6, com.nostra13.universalimageloader.core.assist.ImageSize r7, com.nostra13.universalimageloader.core.assist.ViewScaleType r8, boolean r9) {
        /*
        r0 = r6.getWidth();
        r6 = r6.getHeight();
        r1 = r7.getWidth();
        r7 = r7.getHeight();
        r2 = com.nostra13.universalimageloader.utils.ImageSizeUtils.C07771.f1390x841fdc36;
        r8 = r8.ordinal();
        r8 = r2[r8];
        r2 = 1;
        switch(r8) {
            case 1: goto L_0x003b;
            case 2: goto L_0x001e;
            default: goto L_0x001c;
        };
    L_0x001c:
        r7 = 1;
        goto L_0x0055;
    L_0x001e:
        if (r9 == 0) goto L_0x0032;
    L_0x0020:
        r8 = r0 / 2;
        r3 = r6 / 2;
        r4 = 1;
    L_0x0025:
        r5 = r8 / r4;
        if (r5 <= r1) goto L_0x0030;
    L_0x0029:
        r5 = r3 / r4;
        if (r5 <= r7) goto L_0x0030;
    L_0x002d:
        r4 = r4 * 2;
        goto L_0x0025;
    L_0x0030:
        r7 = r4;
        goto L_0x0055;
    L_0x0032:
        r8 = r0 / r1;
        r7 = r6 / r7;
        r7 = java.lang.Math.min(r8, r7);
        goto L_0x0055;
    L_0x003b:
        if (r9 == 0) goto L_0x004d;
    L_0x003d:
        r8 = r0 / 2;
        r3 = r6 / 2;
        r4 = 1;
    L_0x0042:
        r5 = r8 / r4;
        if (r5 > r1) goto L_0x004a;
    L_0x0046:
        r5 = r3 / r4;
        if (r5 <= r7) goto L_0x0030;
    L_0x004a:
        r4 = r4 * 2;
        goto L_0x0042;
    L_0x004d:
        r8 = r0 / r1;
        r7 = r6 / r7;
        r7 = java.lang.Math.max(r8, r7);
    L_0x0055:
        if (r7 >= r2) goto L_0x0058;
    L_0x0057:
        r7 = 1;
    L_0x0058:
        r6 = considerMaxTextureSize(r0, r6, r7, r9);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.utils.ImageSizeUtils.computeImageSampleSize(com.nostra13.universalimageloader.core.assist.ImageSize, com.nostra13.universalimageloader.core.assist.ImageSize, com.nostra13.universalimageloader.core.assist.ViewScaleType, boolean):int");
    }

    private static int considerMaxTextureSize(int i, int i2, int i3, boolean z) {
        int width = maxBitmapSize.getWidth();
        int height = maxBitmapSize.getHeight();
        while (true) {
            if (i / i3 <= width) {
                if (i2 / i3 <= height) {
                    return i3;
                }
            }
            i3 = z ? i3 * 2 : i3 + 1;
        }
    }

    public static int computeMinImageSampleSize(ImageSize imageSize) {
        int width = imageSize.getWidth();
        imageSize = imageSize.getHeight();
        return Math.max((int) Math.ceil((double) (((float) width) / ((float) maxBitmapSize.getWidth()))), (int) Math.ceil((double) (((float) imageSize) / ((float) maxBitmapSize.getHeight()))));
    }

    public static float computeImageScale(ImageSize imageSize, ImageSize imageSize2, ViewScaleType viewScaleType, boolean z) {
        int width = imageSize.getWidth();
        imageSize = imageSize.getHeight();
        int width2 = imageSize2.getWidth();
        imageSize2 = imageSize2.getHeight();
        float f = (float) width;
        float f2 = f / ((float) width2);
        float f3 = (float) imageSize;
        float f4 = f3 / ((float) imageSize2);
        if ((viewScaleType != ViewScaleType.FIT_INSIDE || f2 < f4) && (viewScaleType != ViewScaleType.CROP || f2 >= f4)) {
            width2 = (int) (f / f4);
        } else {
            imageSize2 = (int) (f3 / f2);
        }
        return ((z || width2 >= width || imageSize2 >= imageSize) && (!z || width2 == width || imageSize2 == imageSize)) ? 1.0f : ((float) width2) / f;
    }
}
