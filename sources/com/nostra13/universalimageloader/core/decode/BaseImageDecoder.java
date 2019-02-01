package com.nostra13.universalimageloader.core.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme;
import com.nostra13.universalimageloader.utils.C0778L;
import com.nostra13.universalimageloader.utils.ImageSizeUtils;
import com.nostra13.universalimageloader.utils.IoUtils;
import java.io.Closeable;
import java.io.InputStream;

public class BaseImageDecoder implements ImageDecoder {
    protected static final String ERROR_CANT_DECODE_IMAGE = "Image can't be decoded [%s]";
    protected static final String ERROR_NO_IMAGE_STREAM = "No stream for image [%s]";
    protected static final String LOG_FLIP_IMAGE = "Flip image horizontally [%s]";
    protected static final String LOG_ROTATE_IMAGE = "Rotate image on %1$d° [%2$s]";
    protected static final String LOG_SCALE_IMAGE = "Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]";
    protected static final String LOG_SUBSAMPLE_IMAGE = "Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]";
    protected final boolean loggingEnabled;

    protected static class ExifInfo {
        public final boolean flipHorizontal;
        public final int rotation;

        protected ExifInfo() {
            this.rotation = 0;
            this.flipHorizontal = false;
        }

        protected ExifInfo(int i, boolean z) {
            this.rotation = i;
            this.flipHorizontal = z;
        }
    }

    protected static class ImageFileInfo {
        public final ExifInfo exif;
        public final ImageSize imageSize;

        protected ImageFileInfo(ImageSize imageSize, ExifInfo exifInfo) {
            this.imageSize = imageSize;
            this.exif = exifInfo;
        }
    }

    public BaseImageDecoder(boolean z) {
        this.loggingEnabled = z;
    }

    public Bitmap decode(ImageDecodingInfo imageDecodingInfo) {
        InputStream imageStream = getImageStream(imageDecodingInfo);
        if (imageStream == null) {
            C0778L.m1429e(ERROR_NO_IMAGE_STREAM, imageDecodingInfo.getImageKey());
            return null;
        }
        Closeable resetStream;
        try {
            ImageFileInfo defineImageSizeAndRotation = defineImageSizeAndRotation(imageStream, imageDecodingInfo);
            resetStream = resetStream(imageStream, imageDecodingInfo);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(resetStream, null, prepareDecodingOptions(defineImageSizeAndRotation.imageSize, imageDecodingInfo));
                IoUtils.closeSilently(resetStream);
                if (decodeStream == null) {
                    C0778L.m1429e(ERROR_CANT_DECODE_IMAGE, imageDecodingInfo.getImageKey());
                } else {
                    decodeStream = considerExactScaleAndOrientatiton(decodeStream, imageDecodingInfo, defineImageSizeAndRotation.exif.rotation, defineImageSizeAndRotation.exif.flipHorizontal);
                }
                return decodeStream;
            } catch (Throwable th) {
                imageDecodingInfo = th;
                IoUtils.closeSilently(resetStream);
                throw imageDecodingInfo;
            }
        } catch (Throwable th2) {
            imageDecodingInfo = th2;
            resetStream = imageStream;
            IoUtils.closeSilently(resetStream);
            throw imageDecodingInfo;
        }
    }

    protected InputStream getImageStream(ImageDecodingInfo imageDecodingInfo) {
        return imageDecodingInfo.getDownloader().getStream(imageDecodingInfo.getImageUri(), imageDecodingInfo.getExtraForDownloader());
    }

    protected ImageFileInfo defineImageSizeAndRotation(InputStream inputStream, ImageDecodingInfo imageDecodingInfo) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        inputStream = imageDecodingInfo.getImageUri();
        if (imageDecodingInfo.shouldConsiderExifParams() == null || canDefineExifParams(inputStream, options.outMimeType) == null) {
            inputStream = new ExifInfo();
        } else {
            inputStream = defineExifOrientation(inputStream);
        }
        return new ImageFileInfo(new ImageSize(options.outWidth, options.outHeight, inputStream.rotation), inputStream);
    }

    private boolean canDefineExifParams(String str, String str2) {
        return ("image/jpeg".equalsIgnoreCase(str2) == null || Scheme.ofUri(str) != Scheme.FILE) ? null : true;
    }

    protected com.nostra13.universalimageloader.core.decode.BaseImageDecoder.ExifInfo defineExifOrientation(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 0;
        r1 = 1;
        r2 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x002c }
        r3 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE;	 Catch:{ IOException -> 0x002c }
        r3 = r3.crop(r5);	 Catch:{ IOException -> 0x002c }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002c }
        r3 = "Orientation";	 Catch:{ IOException -> 0x002c }
        r2 = r2.getAttributeInt(r3, r1);	 Catch:{ IOException -> 0x002c }
        switch(r2) {
            case 1: goto L_0x0035;
            case 2: goto L_0x0036;
            case 3: goto L_0x0026;
            case 4: goto L_0x0025;
            case 5: goto L_0x001e;
            case 6: goto L_0x0018;
            case 7: goto L_0x0017;
            case 8: goto L_0x001f;
            default: goto L_0x0016;
        };
    L_0x0016:
        goto L_0x0035;
    L_0x0017:
        r0 = 1;
    L_0x0018:
        r5 = 90;
        r1 = r0;
        r0 = 90;
        goto L_0x0036;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        r5 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r1 = r0;
        r0 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x0036;
    L_0x0025:
        r0 = 1;
    L_0x0026:
        r5 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r1 = r0;
        r0 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x0036;
    L_0x002c:
        r2 = "Can't read EXIF tags from file [%s]";
        r1 = new java.lang.Object[r1];
        r1[r0] = r5;
        com.nostra13.universalimageloader.utils.C0778L.m1433w(r2, r1);
    L_0x0035:
        r1 = 0;
    L_0x0036:
        r5 = new com.nostra13.universalimageloader.core.decode.BaseImageDecoder$ExifInfo;
        r5.<init>(r0, r1);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.decode.BaseImageDecoder.defineExifOrientation(java.lang.String):com.nostra13.universalimageloader.core.decode.BaseImageDecoder$ExifInfo");
    }

    protected Options prepareDecodingOptions(ImageSize imageSize, ImageDecodingInfo imageDecodingInfo) {
        int i;
        ImageScaleType imageScaleType = imageDecodingInfo.getImageScaleType();
        if (imageScaleType == ImageScaleType.NONE) {
            i = 1;
        } else if (imageScaleType == ImageScaleType.NONE_SAFE) {
            i = ImageSizeUtils.computeMinImageSampleSize(imageSize);
        } else {
            i = ImageSizeUtils.computeImageSampleSize(imageSize, imageDecodingInfo.getTargetSize(), imageDecodingInfo.getViewScaleType(), imageScaleType == ImageScaleType.IN_SAMPLE_POWER_OF_2);
        }
        if (i > 1 && this.loggingEnabled) {
            C0778L.m1428d(LOG_SUBSAMPLE_IMAGE, imageSize, imageSize.scaleDown(i), Integer.valueOf(i), imageDecodingInfo.getImageKey());
        }
        imageSize = imageDecodingInfo.getDecodingOptions();
        imageSize.inSampleSize = i;
        return imageSize;
    }

    protected java.io.InputStream resetStream(java.io.InputStream r2, com.nostra13.universalimageloader.core.decode.ImageDecodingInfo r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r2.markSupported();
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r2.reset();	 Catch:{ IOException -> 0x000a }
        return r2;
    L_0x000a:
        com.nostra13.universalimageloader.utils.IoUtils.closeSilently(r2);
        r2 = r1.getImageStream(r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.decode.BaseImageDecoder.resetStream(java.io.InputStream, com.nostra13.universalimageloader.core.decode.ImageDecodingInfo):java.io.InputStream");
    }

    protected Bitmap considerExactScaleAndOrientatiton(Bitmap bitmap, ImageDecodingInfo imageDecodingInfo, int i, boolean z) {
        Matrix matrix = new Matrix();
        ImageScaleType imageScaleType = imageDecodingInfo.getImageScaleType();
        if (imageScaleType == ImageScaleType.EXACTLY || imageScaleType == ImageScaleType.EXACTLY_STRETCHED) {
            float computeImageScale = ImageSizeUtils.computeImageScale(new ImageSize(bitmap.getWidth(), bitmap.getHeight(), i), imageDecodingInfo.getTargetSize(), imageDecodingInfo.getViewScaleType(), imageScaleType == ImageScaleType.EXACTLY_STRETCHED);
            if (Float.compare(computeImageScale, 1.0f) != 0) {
                matrix.setScale(computeImageScale, computeImageScale);
                if (this.loggingEnabled) {
                    C0778L.m1428d(LOG_SCALE_IMAGE, r1, r1.scale(computeImageScale), Float.valueOf(computeImageScale), imageDecodingInfo.getImageKey());
                }
            }
        }
        if (z) {
            matrix.postScale(true, 1.0f);
            if (this.loggingEnabled) {
                C0778L.m1428d(LOG_FLIP_IMAGE, imageDecodingInfo.getImageKey());
            }
        }
        if (i != 0) {
            matrix.postRotate((float) i);
            if (this.loggingEnabled) {
                C0778L.m1428d(LOG_ROTATE_IMAGE, Integer.valueOf(i), imageDecodingInfo.getImageKey());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
