package com.iptv2.p043b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.HashMap;

/* compiled from: ShadowUtility */
/* renamed from: com.iptv2.b.d */
public final class C0593d {
    /* renamed from: a */
    private static HashMap<String, Bitmap> f655a = new HashMap();

    /* compiled from: ShadowUtility */
    /* renamed from: com.iptv2.b.d$a */
    public static class C0592a {
        /* renamed from: a */
        public int f645a;
        /* renamed from: b */
        public int f646b;
        /* renamed from: c */
        public int f647c;
        /* renamed from: d */
        public int f648d;
        /* renamed from: e */
        public int f649e;
        /* renamed from: f */
        public int f650f;
        /* renamed from: g */
        public int f651g;
        /* renamed from: h */
        public int f652h;
        /* renamed from: i */
        public int f653i;
        /* renamed from: j */
        public boolean f654j;
    }

    /* renamed from: a */
    public static Bitmap m795a(C0592a c0592a) {
        Paint paint;
        int min = c0592a.f650f > 0 ? c0592a.f650f : Math.min(c0592a.f645a, c0592a.f646b) / 4;
        int i = (min * 2) * 2;
        int i2 = c0592a.f645a + i;
        int i3 = c0592a.f646b + i;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
        float f = (float) (c0592a.f645a + ((c0592a.f651g + c0592a.f652h) * 2));
        float f2 = (float) (c0592a.f646b + ((c0592a.f651g + c0592a.f652h) * 2));
        float f3 = (((float) i2) - f) / 2.0f;
        float f4 = (((float) i3) - f2) / 2.0f;
        Canvas canvas = new Canvas(createBitmap);
        if (c0592a.f649e != 0) {
            Paint paint2 = new Paint();
            paint2.setShadowLayer((float) min, 0.0f, 0.0f, c0592a.f649e);
            paint2.setAntiAlias(true);
            canvas.save();
            RectF rectF = new RectF(f3, f4, f3 + f, f4 + f2);
            if (c0592a.f653i > 0) {
                Path path = new Path();
                path.addRoundRect(rectF, (float) c0592a.f653i, (float) c0592a.f653i, Direction.CW);
                canvas.clipPath(path, Op.DIFFERENCE);
                canvas.drawRoundRect(rectF, (float) c0592a.f653i, (float) c0592a.f653i, paint2);
            } else {
                canvas.clipRect(rectF, Op.DIFFERENCE);
                canvas.drawRect(rectF, paint2);
            }
            canvas.restore();
        }
        if (c0592a.f648d != 0) {
            paint = new Paint();
            paint.setColor(c0592a.f648d);
            RectF rectF2 = new RectF(f3, f4, f3 + f, f4 + f2);
            if (c0592a.f653i > 0) {
                paint.setAntiAlias(true);
                canvas.drawRoundRect(rectF2, (float) c0592a.f653i, (float) c0592a.f653i, paint);
            } else {
                canvas.drawRect(rectF2, paint);
            }
        }
        if (c0592a.f647c != 0 && c0592a.f651g > 0) {
            paint = new Paint();
            paint.setStyle(Style.STROKE);
            paint.setStrokeWidth((float) c0592a.f651g);
            paint.setColor(c0592a.f647c);
            float f5 = (float) (c0592a.f651g / 2);
            RectF rectF3 = new RectF(f3 + f5, f4 + f5, (f3 + f) - f5, (f4 + f2) - f5);
            if (c0592a.f653i > 0) {
                paint.setAntiAlias(true);
                canvas.drawRoundRect(rectF3, (float) c0592a.f653i, (float) c0592a.f653i, paint);
            } else {
                canvas.drawRect(rectF3, paint);
            }
        }
        return createBitmap;
    }

    /* renamed from: c */
    private static String m799c(C0592a c0592a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0592a.f645a);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f646b);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f647c);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f648d);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f649e);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f650f);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f651g);
        stringBuilder.append("_");
        stringBuilder.append(c0592a.f653i);
        stringBuilder.append("-");
        stringBuilder.append(c0592a.f652h);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static Bitmap m798b(C0592a c0592a) {
        String c = C0593d.m799c(c0592a);
        if (f655a.containsKey(c)) {
            return (Bitmap) f655a.get(c);
        }
        c0592a = C0593d.m795a(c0592a);
        f655a.put(c, c0592a);
        return c0592a;
    }

    /* renamed from: a */
    public static Drawable m796a(Context context, C0592a c0592a) {
        context = context.getResources();
        Bitmap a = c0592a.f654j ? C0593d.m795a(c0592a) : C0593d.m798b(c0592a);
        return new InsetDrawable(new BitmapDrawable(context, a), -((a.getWidth() - c0592a.f645a) / 2));
    }

    /* renamed from: a */
    public static void m797a(View view, C0592a c0592a) {
        Resources resources = view.getResources();
        Bitmap a = c0592a.f654j ? C0593d.m795a(c0592a) : C0593d.m798b(c0592a);
        Drawable bitmapDrawable = new BitmapDrawable(resources, a);
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = a.getWidth();
        layoutParams.height = a.getHeight();
        C0595e.m809a(view, bitmapDrawable);
        int width = (a.getWidth() - c0592a.f645a) / 2;
        view.setPadding(width, width, width, width);
    }
}
